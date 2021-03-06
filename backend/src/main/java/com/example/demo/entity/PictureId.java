package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PictureId implements Serializable {

    @Column(name = "catalog_id")
    private int catalog_id;

    @Column(name = "way")
    private String way;

    public int getCatalog_id() {
        return catalog_id;
    }

    public void setCatalog_id(int catalog_id) {
        this.catalog_id = catalog_id;
    }

    public String getWay() {
        return way;
    }

    public void setWay(String way) {
        this.way = way;
    }
}
