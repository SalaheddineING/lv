package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollaborateurService {

    @Autowired
    private CollaborateurRepository collaborateurRepository;

    public Collaborateur saveCollaborateur(Collaborateur collaborateur) {
        return collaborateurRepository.save(collaborateur);
    }
}
