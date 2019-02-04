package com.miage.altea.tp.trainer_api.bo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Trainer {

    @Id
    private String name; 

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Pokemon> team;

    public Trainer() {
    }

    public Trainer(String name) {
        this.name = name;
    }
}