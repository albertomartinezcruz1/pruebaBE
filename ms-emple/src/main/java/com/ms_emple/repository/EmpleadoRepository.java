package com.ms_emple.repository;

//DAO, todo el tema de accesa a datos

import com.ms_emple.entity.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado,String> {
}
