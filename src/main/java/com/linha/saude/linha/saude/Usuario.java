package com.linha.saude.linha.saude;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.ArrayList;

public class Usuario {

	@Id private String id;

    private String name;
    private String email;
    private String password;
    
	public String getName() { return name; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }
    
	public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setPassword(String password) { this.password= password; }
}