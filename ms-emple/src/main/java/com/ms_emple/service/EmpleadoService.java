package com.ms_emple.service;

import com.ms_emple.entity.Empleado;
import com.ms_emple.request.EmpleadoRequest;

import java.util.List;

public interface EmpleadoService {

    Empleado guardar(EmpleadoRequest request);
    Empleado actualizar(EmpleadoRequest request);;
    List mostrar();
}
