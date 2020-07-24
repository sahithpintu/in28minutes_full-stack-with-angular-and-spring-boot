package com.in28minutes.rest.webservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;
    
	/*
	 * { "token":
	 * "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4TWludXRlcyIsImV4cCI6MTU5MTc4NzI1NiwiaWF0IjoxNTkxMTgyNDU2fQ.v6sEBK4d33fNLM-lyfe5HDIVa-UFqIwVID-hZIbjmEfsj4_VP5w7pCWFyZLRyIo82fvwYbddavcE6psK1RCWIA"
	 * }
	 */
    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

