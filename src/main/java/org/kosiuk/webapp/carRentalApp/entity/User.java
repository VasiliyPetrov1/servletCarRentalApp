package org.kosiuk.webapp.carRentalApp.entity;

public class User {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private Boolean active;

    public User(Integer id, String username, String email, String password, Boolean active) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.active = active;
    }

    public User(String username, String email, String password, Boolean active) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.active = active;
    }

    public User() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
