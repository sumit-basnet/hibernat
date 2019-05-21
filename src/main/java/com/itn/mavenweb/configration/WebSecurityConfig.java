/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.mavenweb.configration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 *
 * @author sumit
 */
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
   @Override
  protected void  configure(AuthenticationManagerBuilder managerBuilder) throws Exception{
      managerBuilder.inMemoryAuthentication().withUser("user").password("user123").roles("USER")
              .and()
              .withUser("admin").password("admin123").roles("ADMIN");
              
  }
   
//   @Bean
//   public BCryptPasswordEncoder passwordEncoder(){
//       return new BCryptPasswordEncoder();
//       // password encrypt using algorithm
//   }
}
