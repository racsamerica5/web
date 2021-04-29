package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Specialty;

public interface ISpecialtyService {
	public void insert(Specialty specialty);

	public List<Specialty> list();

	public void delete(int idSpecialty);

	public void update(Specialty specialty);

}
