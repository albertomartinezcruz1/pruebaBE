package com.ms_emple.entity;
//Entidad, representacion de una tabla física de la base de datos

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="EMPLEADO")
public class Empleado {

    @Id
    @Column(name="ID_EMPLEADO",columnDefinition = "VARCHAR2(12)", unique = true)
    private String id_empleado;
    @Column(name="NOMBRES",columnDefinition = "VARCHAR2(255)")
    private String nombres;
    @Column(name="APELLIDOS",columnDefinition = "VARCHAR2(255)")
    private String apellidos;
    @Column(name="CURP",columnDefinition = "VARCHAR2(18)", unique = true)
    private String curp;
    @Column(name="PUESTO",columnDefinition = "VARCHAR2(255)", nullable = true)
    private String puesto;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_JEFE", referencedColumnName = "ID_EMPLEADO", nullable = true)
    private Empleado id_jefe;

    @OneToOne(mappedBy = "id_empleado", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Direccion direccion;

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Empleado getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(Empleado id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
