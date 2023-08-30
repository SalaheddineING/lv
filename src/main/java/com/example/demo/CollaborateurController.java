package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CollaborateurController {

    @Autowired
    private CollaborateurService collaborateurService;

    @GetMapping("/form")
    public String showForm(Model model) {
        model.addAttribute("Collaborateur", new Collaborateur());
        return "form";
    }

    @PostMapping("/form")
    public ResponseEntity<Object> submitForm(Collaborateur collaborateur) {
        if (collaborateur.getBu() == null || collaborateur.getBu().isEmpty()) {
            return ResponseEntity.badRequest().body("BU field is required.");
        }
        
        collaborateurService.saveCollaborateur(collaborateur);
        return ResponseEntity.ok().body("Collaborateur added successfully.");
    }

}
