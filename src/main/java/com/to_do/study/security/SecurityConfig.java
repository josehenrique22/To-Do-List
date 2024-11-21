package com.to_do.study.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/h2-console/**").permitAll() // Permite acesso ao H2 Console
                        .requestMatchers("/users/**").permitAll()   // Permite acesso à rota /users
                        .requestMatchers("/task/**").permitAll()
                        .requestMatchers("/User/**").permitAll()
                        .requestMatchers("/tag/**").permitAll()
                        .anyRequest().authenticated())               // Protege todas as outras rotas
                .csrf(csrf -> csrf.disable())                   // Desativa CSRF
                .headers(headers -> headers
                        .frameOptions(frameOptions -> frameOptions.disable())); // Desativa restrições para H2 Console
        return http.build();
    }
}
