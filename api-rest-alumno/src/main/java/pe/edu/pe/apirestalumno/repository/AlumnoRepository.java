package pe.edu.pe.apirestalumno.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.pe.apirestalumno.entity.Alumno;
public interface AlumnoRepository extends CrudRepository<Alumno,Long> {

}
