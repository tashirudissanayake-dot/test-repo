package com.fot.tms.model;

/**
 * Specialized User model representing an Enrolled Undergraduate Student.
 * Demonstrates OOP Inheritance & Polymorphism (FR-05 restriction: only contact details & photo).
 */
public class UndergraduateUser extends User {

    public UndergraduateUser() {
        super();
        setRole("Undergraduate");
    }

    public UndergraduateUser(int userId, String username, String passwordHash, String email, String status) {
        super(userId, username, passwordHash, "Undergraduate", email, status);
    }

    @Override
    public boolean canChangeOwnPassword() {
        // Undergraduates cannot change password directly
        return false;
    }

    @Override
    public boolean canEditProfileNames() {
        // Undergraduates cannot edit first/last names or email per assignment requirements
        return false;
    }

    @Override
    public String getRoleDisplayName() {
        return "Undergraduate Student";
    }
}
