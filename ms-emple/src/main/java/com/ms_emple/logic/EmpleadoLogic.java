package com.ms_emple.logic;

import com.ms_emple.entity.Direccion;
import com.ms_emple.entity.Empleado;
import com.ms_emple.repository.EmpleadoRepository;
import com.ms_emple.request.EmpleadoRequest;
import com.ms_emple.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmpleadoLogic implements EmpleadoService {

    //Inyeccion de dependencias
    @Autowired
    EmpleadoRepository repo;

    @Override
    public Empleado guardar(EmpleadoRequest request) {
        Empleado emp = new Empleado();
        emp.setNombres(request.getNombres());
        emp.setApellidos(request.getApellidos());
        emp.setCurp(request.getCurp());
        emp.setPuesto(request.getPuesto());
        emp.setId_jefe(request.getId_jefe());

        if (request.getDirecciones() != null) {
            Direccion dirReq = request.getId_jefe().getDireccion();
            Direccion dir = new Direccion();
            dir.setCalle(dirReq.getCalle());
            dir.setNo_exterior(dirReq.getNo_exterior());
            dir.setNo_interior(dirReq.getNo_interior());
            dir.setColonia(dirReq.getColonia());
            dir.setMunicipio(dirReq.getMunicipio());
            dir.setEstado(dirReq.getEstado());
            dir.setPais(dirReq.getPais());
            dir.setId_empleado(emp);
            emp.setDireccion(dir);
        }

        return repo.save(emp);

    }

    @Override
    public Empleado actualizar(EmpleadoRequest request) {
            Empleado emp =repo.findById(request.getId_empleado()).get();
            emp.setNombres(request.getNombres());
            emp.setApellidos(request.getApellidos());
            emp.setCurp(request.getCurp());
            emp.setPuesto(request.getPuesto());
            emp.setId_jefe(request.getId_jefe());
            repo.save(emp);
            return emp;

    }

    @Override
    public List mostrar() {
        return repo.findAll();
    }
}
