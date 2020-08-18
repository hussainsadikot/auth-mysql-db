package com.security.auth.mysql.db.auth.mysql.db;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class SpringConfig implements WebMvcConfigurer {
    @Bean
    public BCryptPasswordEncoder PassEncoder(){
        return new BCryptPasswordEncoder();
    }


}
