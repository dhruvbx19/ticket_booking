package org.example.app.entities;

import java.util.List;

public class user {
    //private as the another dev cannot get access to these directly get access using methods as getters and setters
    private String name;
    private String password;
    private String hashPassword;
    private List<Tickets> ticketsBooked;
    private String userId;
}
