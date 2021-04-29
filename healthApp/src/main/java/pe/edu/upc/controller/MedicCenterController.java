package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.MedicCenter;
import pe.edu.upc.service.IMedicCenterService;

@Named
@RequestScoped
public class MedicCenterController {
	@Inject
	private IMedicCenterService mcService;
	// atributos
	private MedicCenter medic;
	List<MedicCenter> listaCentrosMedicos;
	// constructores

	@PostConstruct
	public void init() {
		this.listaCentrosMedicos = new ArrayList<MedicCenter>();
		this.medic = new MedicCenter();
		this.listar();
	}
	// métodos

	public String nuevoMedicCenter() {
		this.setMedic(new MedicCenter());
		return "medicCenter.xhtml";

	}

	public void insert() {
		try {
			mcService.insert(medic);

		} catch (Exception e) {
			System.out.println("Error al insertar en el controller de medic center");
		}
	}

	public void listar() {
		try {
			listaCentrosMedicos = mcService.list();
		} catch (Exception e) {
			System.out.println("Error al listar en el controller de medic center");
		}
	}

	public void eliminar(MedicCenter medic) {
		try {
			mcService.delete(medic.getIdMedicCenter());
			this.listar();
		} catch (Exception e) {
			System.out.println("Error al eliminar en el controller de medic center");
		}
	}

	public void findByName() {
		try {

			if(medic.getNameMedicCenter().isEmpty()) {
				this.listar();
			}else {
				listaCentrosMedicos=this.mcService.findByNameMedicCenter(this.getMedic());
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// get y set
	public MedicCenter getMedic() {
		return medic;
	}

	public void setMedic(MedicCenter medic) {
		this.medic = medic;
	}

	public List<MedicCenter> getListaCentrosMedicos() {
		return listaCentrosMedicos;
	}

	public void setListaCentrosMedicos(List<MedicCenter> listaCentrosMedicos) {
		this.listaCentrosMedicos = listaCentrosMedicos;
	}

}
