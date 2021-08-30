package com.projetoWEG.api.common;

import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@AllArgsConstructor
@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() { return new ModelMapper();}
}
