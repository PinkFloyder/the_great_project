package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dimensions")
public class Dimensions {

    @Column(name = "catalog_id")
    private int catalog_id;

    @Column(name = "size")
    private int size;

    public Dimensions() {
    }

    public int getCatalog_id() {
        return catalog_id;
    }

    public void setCatalog_id(int catalog_id) {
        this.catalog_id = catalog_id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
