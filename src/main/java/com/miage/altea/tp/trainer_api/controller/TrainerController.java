package com.miage.altea.tp.trainer_api.controller;

import com.miage.altea.tp.trainer_api.bo.Trainer;
import com.miage.altea.tp.trainer_api.service.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trainers")
class TrainerController {

    @Autowired
    private final TrainerService trainerService;

    TrainerController(TrainerService trainerService) {
        this.trainerService = trainerService;
    }


    @GetMapping("/")
    Iterable<Trainer> getAllTrainers() {
        return this.trainerService.getAllTrainers();
    }

    @GetMapping("/{name}")
    Trainer getTrainer(@PathVariable String name) {
        return this.trainerService.getTrainer(name);
    }

    @PostMapping()
    Trainer createTrainer(@RequestBody Trainer trainer) {
    return trainerService.createTrainer(trainer);
    }

    @DeleteMapping("/{name}")
    void deleteTrainer(@PathVariable String name) {
        trainerService.deleteTrainer(name);
    }
}