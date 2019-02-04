package com.miage.altea.tp.trainer_api.repository;

import com.miage.altea.tp.trainer_api.bo.Trainer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepository extends CrudRepository<Trainer, String> {
    public Trainer save(Trainer trainer);
    public Trainer findByName(String name);
}