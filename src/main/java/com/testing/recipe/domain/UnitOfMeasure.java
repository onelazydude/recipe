package com.testing.recipe.domain;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

  //  @OneToOne(mappedBy = "unitOfMeasurement")
    private String description;

    /*  @OneToOne
    private Ingredient ingredient;*/
    // This is only necessary when a relationship is bidirectional

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
