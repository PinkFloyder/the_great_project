package com.example.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "catalog")
public class Dress {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "catalog_id")
    private int catalog_id;

    @Column(name = "price")
    private int price;

    @Column(name = "color")
    private String color;

    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.DETACH
            , CascadeType.REFRESH, CascadeType.MERGE })
    @JoinColumn(name = "catalog_id")
    private List<Dimensions> size;

    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.DETACH
            , CascadeType.REFRESH, CascadeType.MERGE })
    @JoinColumn(name = "catalog_id")
    private List<Picture> picture;

    @Column(name = "description")
    private String description;

    public Dress() {
    }

    public int getCatalog_id() {
        return catalog_id;
    }

    public void setCatalog_id(int catalog_id) {
        this.catalog_id = catalog_id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Dimensions> getSize() {
        return size;
    }

    public void setSize(List<Dimensions> size) {
        this.size = size;
    }

    public List<Picture> getPicture() {
        return picture;
    }

    public void setPicture(List<Picture> picture) {
        this.picture = picture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

