package com.example.polls.payload;

import java.util.Set;

import com.example.polls.model.Role;

/**
 * Created by rajeevkumarsingh on 19/08/17.
 */
public class JwtAuthenticationResponse {
    private String accessToken;
    private String tokenType = "Bearer";
    private Set<Role> userRoles;
    
    public JwtAuthenticationResponse(String accessToken,Set<Role> roles) {
        this.accessToken = accessToken;
        this.userRoles = roles;
    }

    public Set<Role> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(Set<Role> userRoles) {
		this.userRoles = userRoles;
	}

	public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
}
