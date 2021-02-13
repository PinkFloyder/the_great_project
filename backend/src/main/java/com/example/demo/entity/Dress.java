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

    @ManyToMany(cascade = { CascadeType.PERSIST, CascadeType.DETACH
            , CascadeType.REFRESH, CascadeType.MERGE })
    @JoinTable(name = "helpwithsize"
            ,joinColumns = @JoinColumn(name = "catalog_id")
            ,inverseJoinColumns = @JoinColumn(name = "size")
    )
    private List<Size> sizes;

    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.DETACH
            , CascadeType.REFRESH, CascadeType.MERGE })
    @JoinColumn(name = "catalog_id")
    private List<Picture> pictures;

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

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

