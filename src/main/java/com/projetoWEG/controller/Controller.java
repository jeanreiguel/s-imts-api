package com.projetoWEG.controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Scanner;

@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Controller {
    Scanner dgt;

    public int opcao() {
        System.out.println("> ");
        return dgt.nextInt();
    }

    public void login() {
        System.out.println("---- login ----");
        System.out.println("insira seu login: ");
        String login = dgt.next();
        System.out.println("insira sua senha");
        String senha = dgt.next();

    }

}
