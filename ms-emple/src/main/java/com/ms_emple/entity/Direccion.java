package com.ms_emple.entity;

import jakarta.persistence.*;

@Entity
@Table(name="DIRECCION")
public class Direccion {

    @Id
    @Column(name="ID_DIRECCION",columnDefinition = "NUMBER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_direccion;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_EMPLEADO", referencedColumnName = "ID_EMPLEADO", nullable = false)
    private Empleado id_empleado;

    @Column(name="CALLE",columnDefinition = "VARCHAR2(255)")
    private String calle;

    @Column(name="NO_EXTERIOR",columnDefinition = "NUMBER")
    private int no_exterior;

    @Column(name="NO_INTERIOR",columnDefinition = "NUMBER",nullable = true)
    private Integer no_interior;

    @Column(name="COLONIA",columnDefinition = "VARCHAR2(255)")
    private String colonia;

    @Column(name="MUNICIPIO",columnDefinition = "VARCHAR2(255)")
    private String municipio;

    @Column(name="ESTADO",columnDefinition = "VARCHAR2(255)")
    private String estado;

    @Column(name="PAIS",columnDefinition = "VARCHAR2(255)")
    private String pais;

    public int getId_direccion() {
        return id_direccion;
    }

    public void setId_direccion(int id_direccion) {
        this.id_direccion = id_direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public Integer getNo_interior() {
        return no_interior;
    }

    public void setNo_interior(Integer no_interior) {
        this.no_interior = no_interior;
    }

    public int getNo_exterior() {
        return no_exterior;
    }

    public void setNo_exterior(int no_exterior) {
        this.no_exterior = no_exterior;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public Empleado getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(Empleado id_empleado) {
        this.id_empleado = id_empleado;
    }
}
