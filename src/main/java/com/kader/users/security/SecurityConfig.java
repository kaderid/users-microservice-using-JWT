package com.kader.users.security;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration; 
import org.springframework.security.authentication.AuthenticationManager; 
import org.springframework.security.config.annotation.web.builders.HttpSecurity; 
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity; 
import org.springframework.security.config.http.SessionCreationPolicy; 
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
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
			.requestMatchers("/all").hasAuthority("ADMIN")
	               
<<<<<<< Updated upstream
	 .anyRequest().authenticated() )
				   .addFilterBefore(new JWTAuthenticationFilter (authMgr),
						   UsernamePasswordAuthenticationFilter.class)
				   .addFilterBefore(new JWTAuthorizationFilter(),
						   UsernamePasswordAuthenticationFilter.class);


		 return http.build();
=======
	 .anyRequest().authenticated() ) 
	       .addFilterBefore(new JWTAuthenticationFilter (authMgr), 
	    	        UsernamePasswordAuthenticationFilter.class); 
	 
	 
	 return http.build(); 
>>>>>>> Stashed changes
	 } 
	  
	  
	
}
