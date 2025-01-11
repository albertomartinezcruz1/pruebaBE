package com.ms_emple.controller;


import com.ms_emple.entity.Empleado;
import com.ms_emple.logic.EmpleadoLogic;
import com.ms_emple.request.EmpleadoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sistema/api/v1/empleados")
public class EmpleadoController {
    @Autowired
    EmpleadoLogic service;

    @GetMapping
    public ResponseEntity<List<Empleado>> mostrar(){

        List <Empleado> empleados=service.mostrar();
        return new ResponseEntity<List<Empleado>>(empleados, HttpStatusCode.valueOf(200));

    }

    @PostMapping
    public ResponseEntity<Empleado> guardar(@RequestBody EmpleadoRequest request){

        Empleado empleado =service.guardar(request);
        return new ResponseEntity<Empleado>(empleado, HttpStatusCode.valueOf(200));

    }

    @PutMapping
    public ResponseEntity<Empleado> actualizar(@RequestBody EmpleadoRequest request){
        Empleado empleado=service.actualizar(request);
        return new ResponseEntity<Empleado>(empleado,HttpStatusCode.valueOf(200));

    }




}
