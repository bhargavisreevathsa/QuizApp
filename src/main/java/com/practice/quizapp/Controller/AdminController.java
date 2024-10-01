package com.practice.quizapp.Controller;

import com.practice.quizapp.Model.Admin;
import com.practice.quizapp.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @Autowired
    AdminService adminService;

    @GetMapping("/AdminForm")
    public String showForm(Model model) {
        model.addAttribute("Admin", new Admin());
        return "AdminForm"; // name of the JSP file (AdminForm.jsp)
    }

    @PostMapping("/submitAdmin")
    public String submitForm(@ModelAttribute Admin Admin, Model model) {
        model.addAttribute("Admin", Admin);
        adminService.setAdmin(Admin.getName(), Admin.getEmail());
        return "AdminDisplay"; // name of the JSP file (AdminDisplay.jsp)
    }
}
