package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.MedicCenter;
import pe.edu.upc.entity.Specialty;
import pe.edu.upc.service.IMedicCenterService;
import pe.edu.upc.service.ISpecialtyService;

@Named
@RequestScoped
public class SpecialtyController {

	// service
	@Inject
	private ISpecialtyService sService;
	@Inject
	private IMedicCenterService mService;
	// atributos

	private Specialty specialty;
	private MedicCenter medic;
	List<Specialty> listaEspecialidades;
	List<MedicCenter> listaCentrosMedicos;

	@PostConstruct
	public void init() {
		this.medic = new MedicCenter();
		this.specialty = new Specialty();
		this.listaCentrosMedicos = new ArrayList<MedicCenter>();
		this.listaEspecialidades = new ArrayList<Specialty>();
		this.listarCentroMedico();
		this.listarEspecialidad();
	}

	// métodos

	public String nuevoEspecialidad() {
		this.setSpecialty(new Specialty());
		return "specialty.xhtml";

	}

	public void insert() {
		try {
			sService.insert(specialty);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de especialidad");
		}
	}

	public void listarCentroMedico() {
		try {
			listaCentrosMedicos = mService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de medic center");
		}
	}

	public void listarEspecialidad() {
		try {
			listaEspecialidades = sService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de especialidad");
		}
	}

	public void eliminar(Specialty specialty) {
		try {
			sService.delete(specialty.getIdSpecialty());
			this.listarEspecialidad();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de especialidad");
		}
	}

	public String modifPre(Specialty spec) {
		this.setSpecialty(spec);		
		return "specialtyMod.xhtml";		
	}
	
	public void modificar() {
		try {
			sService.update(this.specialty);
			this.listarEspecialidad();
		} catch (Exception e) {
			System.out.println("Error al modificar en el controller de especialidad");
		}
	}
	
	
	
	
	// get y set

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public MedicCenter getMedic() {
		return medic;
	}

	public void setMedic(MedicCenter medic) {
		this.medic = medic;
	}

	public List<Specialty> getListaEspecialidades() {
		return listaEspecialidades;
	}

	public void setListaEspecialidades(List<Specialty> listaEspecialidades) {
		this.listaEspecialidades = listaEspecialidades;
	}

	public List<MedicCenter> getListaCentrosMedicos() {
		return listaCentrosMedicos;
	}

	public void setListaCentrosMedicos(List<MedicCenter> listaCentrosMedicos) {
		this.listaCentrosMedicos = listaCentrosMedicos;
	}

}
