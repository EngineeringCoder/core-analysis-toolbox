package com.kjetillorentzen.CoreAnalysisToolbox.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Core {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Core details
    @NotNull
    private String name;
    private String field;

    //Core Properties
    private double porosity;
    private double length;
    private double diameter;
    private double poreVolume;

    public Long getId() {
        return id;
    }

    public Core() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public double getPorosity() {
        return porosity;
    }

    public void setPorosity(double porosity) {
        this.porosity = porosity;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getPoreVolume() {
        return poreVolume;
    }

    public void setPoreVolume(double poreVolume) {
        this.poreVolume = poreVolume;
    }

}
