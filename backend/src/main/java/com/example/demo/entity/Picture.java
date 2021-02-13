package com.example.demo.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "picture")
public class Picture {

    @EmbeddedId
    private PictureId id;

    public Picture() {
    }

    public PictureId getId() {
        return id;
    }

    public void setId(PictureId id) {
        this.id = id;
    }
}