package com.practice.quizapp.Service;

import com.practice.quizapp.Model.Admin;
import org.springframework.stereotype.Component;

@Component
public class AdminService {
    Admin admin = new Admin();
    public Admin getAdmin() {
        admin.getEmail();
        admin.getName();
        return admin;
    }

    public void setAdmin(String name, String email) {
        admin.setName(name);
        admin.setEmail(email);
    }

    public void addQuestions() {

    }
}
