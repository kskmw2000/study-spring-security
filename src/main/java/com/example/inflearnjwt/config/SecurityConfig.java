package com.example.inflearnjwt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity      // 스프리 시큐리티 필터가 스플링 필터체인에 등록이 됩니다.
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)      // 시큐어어노테이션 활성화, preAuthorize 어노테이션 활성화
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean       // 해당 메서드의 리턴되는 오브제트를 loC로 리턴해 줌.
    public BCryptPasswordEncoder encodePwd() {
         return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.authorizeHttpRequests()
                .antMatchers("/user/**").authenticated()        // 인증만 되면 들어갈 수 있는 주소
                .antMatchers("/manager/**").hasAnyRole("ADMIN", "MANAGER")
                .antMatchers("/admin/**").hasRole("ADMIN")
                .anyRequest().permitAll()
                .and()
                .formLogin()
                .loginPage("/loginForm")
                .loginProcessingUrl("/login")      // /login 주소가 호출이 되면 시큐리티가 낚아채서 대신 로그인을 진행해 줍니다. 즉, controller의 login 을 안만들어도 됩니다.
                .defaultSuccessUrl("/");
    }
}
