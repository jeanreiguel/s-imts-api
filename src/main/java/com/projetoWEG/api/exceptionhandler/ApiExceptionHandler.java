package com.projetoWEG.api.exceptionhandler;

import com.projetoWEG.domain.exception.CasoException;
import lombok.AllArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    private MessageSource messageSource;

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(
            MethodArgumentNotValidException exception,
            HttpHeaders headers,
            HttpStatus status,
            WebRequest request) {

        List<Falha.Campo> campos = new ArrayList<>();

        for(ObjectError error : exception.getBindingResult().getAllErrors()) {
            String nome = ((FieldError) error).getField();
            String mensagem = messageSource.getMessage(error, LocaleContextHolder.getLocale());

            campos.add(new Falha.Campo(nome, mensagem));
        }

        Falha falha = new Falha();
        falha.setStatus(status.value());
        falha.setData(LocalDateTime.now());
        falha.setTitulo("Um ou mais campos inválidos.");
        falha.setCampos(campos);

        return super.handleExceptionInternal(exception, falha, headers, status, request);
    }

    @ExceptionHandler(CasoException.class)
    public ResponseEntity<Object> handleCaso(
            CasoException exception,
            WebRequest request
    ) {
        HttpStatus status = HttpStatus.BAD_REQUEST;

        Falha falha = new Falha();
        falha.setStatus(status.value());
        falha.setTitulo(exception.getMessage());
        falha.setData(LocalDateTime.now());

        return handleExceptionInternal(exception,falha, new HttpHeaders(), status, request);
    }

//    @ExceptionHandler(EntidadeNaoEncontradaException.class)
//    public ResponseEntity<Object> handleNaoEncontrada(
//            EntidadeNaoEncontradaException exception,
//            WebRequest request
//    ) {
//        HttpStatus status = HttpStatus.NOT_FOUND;
//
//        Falha falha = new Falha();
//        falha.setStatus(status.value());
//        falha.setTitulo(exception.getMessage());
//        falha.setData(LocalDateTime.now());
//
//        return handleExceptionInternal(exception, falha, new HttpHeaders(), status, request);
//    }
}
