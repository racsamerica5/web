package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.MedicCenter;

public interface IMedicCenterService {
	public void insert(MedicCenter medic);

	public List<MedicCenter> list();

	public void delete(int idMedicCenter);

	public List<MedicCenter> findByNameMedicCenter(MedicCenter mc);

}
