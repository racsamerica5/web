package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Specialty;

public interface ISpecialtyDao {
	
	public void insert(Specialty specialty);

	public List<Specialty> list();

	public void delete(int idSpecialty);
	
	public void update(Specialty specialty);
	

}
