package pe.edu.pe.apirestalumno.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.pe.apirestalumno.entity.Alumno;
import pe.edu.pe.apirestalumno.repository.AlumnoRepository;

@Service

public class AlumnoService {
	@Autowired
	AlumnoRepository alumrep;
	
	public Alumno create(Alumno alum) {
		return alumrep.save(alum);
	}
	public Alumno read(Long id) {
		return alumrep.findById(id).get();
	}
	public Alumno update(Alumno alum) {
		return alumrep.save(alum);
	}
	public void delete(Long id) {
		alumrep.deleteById(id);
	}
	public List<Alumno> readAll(){
		List<Alumno> lista = new ArrayList<>();
		alumrep.findAll().forEach(lista::add);
		return lista;
	}

}
