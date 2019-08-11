package com.spring.rest.jwt.controller;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rest.jwt.config.JWTTokenUtility;
import com.spring.rest.jwt.dto.ApiResponse;
import com.spring.rest.jwt.dto.AuthToken;
import com.spring.rest.jwt.model.User;
import com.spring.rest.jwt.service.UserService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/token")
public class AuthenticationController {

	@Autowired
    private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserDetailsService userDetailsService;

    @Autowired
    private JWTTokenUtility jwtTokenUtil;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/generate-token", method = RequestMethod.POST)
    public ApiResponse<AuthToken> register(@RequestBody User user) throws AuthenticationException {
    	UserDetails userDetails = userDetailsService.loadUserByUsername(user.getUserName());
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUserName(), user.getPassword(), userDetails.getAuthorities()));
        user = userService.findOne(user.getUserName());
        final String token = jwtTokenUtil.generateToken(user);
        return new ApiResponse<>(200, "success", new AuthToken(token, user.getUserName()));
    }
}
