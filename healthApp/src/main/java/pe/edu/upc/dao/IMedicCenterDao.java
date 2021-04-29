package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.MedicCenter;

public interface IMedicCenterDao {

	public void insert(MedicCenter medic);

	public List<MedicCenter> list();

	public void delete(int idMedicCenter);
	
	public List<MedicCenter>findByNameMedicCenter(MedicCenter mc);
}
