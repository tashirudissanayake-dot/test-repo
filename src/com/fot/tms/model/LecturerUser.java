package com.fot.tms.model;

/**
 * Specialized User model representing an Academic Staff / Lecturer.
 * Demonstrates OOP Inheritance & Polymorphism (FR-04 restriction: passwords locked).
 */
public class LecturerUser extends User {

    public LecturerUser() {
        super();
        setRole("Lecturer");
    }

    public LecturerUser(int userId, String username, String passwordHash, String email, String status) {
        super(userId, username, passwordHash, "Lecturer", email, status);
    }

    @Override
    public boolean canChangeOwnPassword() {
        // Lecturer cannot change password directly per assignment requirements
        return false;
    }

    @Override
    public boolean canEditProfileNames() {
        return true;
    }

    @Override
    public String getRoleDisplayName() {
        return "Lecturer / Academic Staff";
    }
}
