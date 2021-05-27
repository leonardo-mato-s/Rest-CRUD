package pe.edu.pe.apirestalumno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.pe.apirestalumno.entity.Alumno;
import pe.edu.pe.apirestalumno.service.AlumnoService;

@RestController

public class AlumnoController {
	@Autowired
	AlumnoService alumservice;
	@GetMapping("/")
	public String mensaje() {
		return "JPA";
	}
	@GetMapping("/alum")
	public List<Alumno> readAll(){
		return alumservice.readAll();
	}
	@GetMapping("/alum/{id}")
	public Alumno read(@PathVariable Long id) {
		return alumservice.read(id);
	}
	@DeleteMapping("/alum/delete/{id}")
	public String delete(@PathVariable Long id) {
		alumservice.delete(id);
		return "Eliminado";
	}
	@PostMapping("/alum/add")
	public Alumno save(@RequestBody Alumno prod) {
		return alumservice.create(prod);
	}
	@PutMapping("/prod/update/{id}")
	public Alumno update(@PathVariable Long id, @RequestBody Alumno alum) {	
		Alumno a = new Alumno();
		a.setIdalumno(id);
		a.setNombres(alum.getNombres());
		a.setCorreo(alum.getCorreo());
		a.setTelefono(alum.getTelefono());
		return alumservice.update(a);
	}

}
