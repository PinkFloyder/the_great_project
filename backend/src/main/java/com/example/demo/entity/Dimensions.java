package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "dimensions")
public class Dimensions {

    @EmbeddedId
    private DimensionsPK id;

    public Dimensions() {
    }

    public DimensionsPK getId() {
        return id;
    }

    public void setId(DimensionsPK id) {
        this.id = id;
    }


}

