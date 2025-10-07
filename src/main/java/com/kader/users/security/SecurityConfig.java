package com.kader.users.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

public class SecurityConfig {

	@Autowired 
	AuthenticationManager authMgr; 
	
	 @Bean 
	 public SecurityFilterChain filterChain(HttpSecurity http) throws 
	Exception {  
	       
	       http.sessionManagement(session -> 
	session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) 
	       
	    .csrf(csrf -> csrf.disable()) 
	                     
	 .authorizeHttpRequests(requests-> 
	requests.requestMatchers("/login").permitAll() 
	               
	 .anyRequest().authenticated() ) ; 
	 
	 
	 return http.build(); 
	 } 
	  
	  
	
}
