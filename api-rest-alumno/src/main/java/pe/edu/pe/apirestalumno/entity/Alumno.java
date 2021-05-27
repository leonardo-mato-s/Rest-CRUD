package pe.edu.pe.apirestalumno.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idalumno;
	private String nombres;
	private String correo;
	private double telefono;
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alumno(Long idalumno, String nombres, String correo, double telefono) {
		super();
		this.idalumno = idalumno;
		this.nombres = nombres;
		this.correo = correo;
		this.telefono = telefono;
	}
	public Long getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(Long idalumno) {
		this.idalumno = idalumno;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public double getTelefono() {
		return telefono;
	}
	public void setTelefono(double telefono) {
		this.telefono = telefono;
	}
	

}
