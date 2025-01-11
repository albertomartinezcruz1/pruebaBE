package com.ms_emple.request;

import com.ms_emple.entity.Direccion;
import com.ms_emple.entity.Empleado;
import jakarta.persistence.*;

import java.util.List;

public class EmpleadoRequest {


    private String id_empleado;
    private String nombres;
    private String apellidos;
    private String curp;
    private String puesto;
    private Empleado id_jefe;
    private List<Direccion> direcciones;

    public EmpleadoRequest(){}

    public EmpleadoRequest(String id_empleado, List<Direccion> direcciones, Empleado id_jefe, String puesto, String curp, String apellidos, String nombres) {
        this.id_empleado = id_empleado;
        this.direcciones = direcciones;
        this.id_jefe = id_jefe;
        this.puesto = puesto;
        this.curp = curp;
        this.apellidos = apellidos;
        this.nombres = nombres;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
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
