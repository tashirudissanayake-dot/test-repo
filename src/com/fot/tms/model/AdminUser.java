package com.fot.tms.model;

/**
 * Specialized User model representing a System Administrator.
 * Demonstrates OOP Inheritance & Polymorphism.
 */
public class AdminUser extends User {

    public AdminUser() {
        super();
        setRole("Admin");
    }

    public AdminUser(int userId, String username, String passwordHash, String email, String status) {
        super(userId, username, passwordHash, "Admin", email, status);
    }

    @Override
    public boolean canChangeOwnPassword() {
        return true;
    }

    @Override
    public boolean canEditProfileNames() {
        return true;
    }

    @Override
    public String getRoleDisplayName() {
        return "System Administrator";
    }
}
