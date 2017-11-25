package com.codeChallenge.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * 
 * @author Sara
 *
 */
@Document(collection = "users")
public class User {

	private String idUser;
	private String email;
	private String password;
	
	public User() {
		super();
	}

	public User(String idUser, String email, String password) {
		super();
		this.idUser = idUser;
		this.email = email;
		this.password = password;
	}

	 private boolean accountNonExpired;
	    private boolean accountNonLocked;
	    private boolean credentialsNonExpired;
	    private boolean enabled;

	    private Set<String> roles = new HashSet<String>();

	    public void addRole(String role) {
	        roles.add(role);
	    }

	    public Set<String> getRoles() {
	        return roles;
	    }

	 

	    public String getIdUser() {
			return idUser;
		}

		public void setIdUser(String idUser) {
			this.idUser = idUser;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setRoles(Set<String> roles) {
			this.roles = roles;
		}

		public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public boolean isAccountNonExpired() {
	        return accountNonExpired;
	    }

	    public void setAccountNonExpired(boolean accountNonExpired) {
	        this.accountNonExpired = accountNonExpired;
	    }

	    public boolean isAccountNonLocked() {
	        return accountNonLocked;
	    }

	    public void setAccountNonLocked(boolean accountNonLocked) {
	        this.accountNonLocked = accountNonLocked;
	    }

	    public boolean isCredentialsNonExpired() {
	        return credentialsNonExpired;
	    }

	    public void setCredentialsNonExpired(boolean credentialsNonExpired) {
	        this.credentialsNonExpired = credentialsNonExpired;
	    }

	   

	    public boolean isEnabled() {
	        return enabled;
	    }

	    public void setEnabled(boolean enabled) {
	        this.enabled = enabled;
	    }

}
