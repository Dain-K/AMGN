package com.cos.amgn.config;

import com.mysql.cj.protocol.AuthenticationProvider;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.autoconfigure.security.ConditionalOnDefaultWebSecurity;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@SuppressWarnings({ "deprecation", "unused" })
@Configuration // IoC 빈(bean)을 등록
@EnableWebSecurity(debug = true) // 필터 체인 관리 시작 어노테이션
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true) // 특정 주소 접근시 권한 및 인증을 위한 어노테이션 활성화
@ConditionalOnDefaultWebSecurity
@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.SERVLET)
public class SecurityConfig{

	// 해당 메서드의 리턴디는 오브젝트를 IoC로 등록해줌
    @Bean 
    public BCryptPasswordEncoder encodePwd() { // 패스워드 암호화
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Order(SecurityProperties.BASIC_AUTH_ORDER)
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {

        http.csrf().disable();
        http.authorizeRequests()
        	.requestMatchers("/user/**").authenticated()  // 인증만 되면 들어갈 수 있는 주소
            .anyRequest().permitAll() // 나머지 주소는 모든 권한이 허용
            .and()
            .formLogin()
            .loginPage("/loginForm")
            //.usernameParameter("\"email\"")
            .loginProcessingUrl("/login") // /login이 호출되면 시큐리티가 낚아채서 대신 로그인을 해줌
            .defaultSuccessUrl("/");

        return http.build();
    }
}