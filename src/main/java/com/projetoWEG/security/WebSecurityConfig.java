package com.projetoWEG.security;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@AllArgsConstructor
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private ImplementsUserDetailsService implementsUserDetailsService;
    private JWTRequestFilter jwtRequestFilter;

    private static final String[] AUTH_LIST = {
            "/",
            "/projetos",
            "/projetos/{id}",
            "/projetos/nome/{nome}",
            "/projetos/secao/{secao}",
            "/projetos/{secao}/{status}",
            "/projetos/status/{status}",
            "/projetos/containing/{contain}",
            "/consultores",
            "/consultores/{id}",
            "/consultores/nome/{nome}",
            "/consultores/status/{status}",
            "/consultores/containing/{contain}",
            "/apontamentos",
            "/apontamentos/{id}",
            "/aprovacao",
            "/aprovacao/inserir",
            "/secoes"
    };

    @Override
    protected void configure(HttpSecurity http) throws  Exception {
        http.csrf().disable().authorizeRequests()
//                .antMatchers(HttpMethod.GET, AUTH_LIST).hasRole("FORNECEDOR")
//                .antMatchers(HttpMethod.POST, AUTH_LIST).hasRole("FORNECEDOR")
                .antMatchers(AUTH_LIST).permitAll()
                .antMatchers("/authenticate").permitAll()
                .anyRequest().authenticated().and().cors()
                .and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().logout().logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .deleteCookies("token").invalidateHttpSession(true);
        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
    }
    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication().withUser("jean").password("{noop}123456").roles("ADMIN");
        auth.userDetailsService(implementsUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/bootstrap/**","/style/**");
    }
}
