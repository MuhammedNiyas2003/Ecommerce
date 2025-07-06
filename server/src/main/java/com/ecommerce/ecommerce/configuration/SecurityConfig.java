package com.ecommerce.ecommerce.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http.csrf(customizer ->customizer.disable()); 
        //Disabling the CSRF
        http.authorizeHttpRequests(request -> request.anyRequest().authenticated());
        //configuring that whenever we are requesting it should as for authorization
        http.httpBasic(Customizer.withDefaults());
        //making the configuration for accessing api request 
        return http.build();
    }

}
