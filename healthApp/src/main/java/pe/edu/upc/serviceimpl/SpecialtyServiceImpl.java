package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISpecialtyDao;
import pe.edu.upc.entity.Specialty;
import pe.edu.upc.service.ISpecialtyService;

@Named
@RequestScoped
public class SpecialtyServiceImpl implements ISpecialtyService {

	@Inject
	private ISpecialtyDao sDao;

	@Override
	public void insert(Specialty specialty) {
		sDao.insert(specialty);
	}

	@Override
	public List<Specialty> list() {
		// TODO Auto-generated method stub
		return sDao.list();
	}

	@Override
	public void delete(int idSpecialty) {
		sDao.delete(idSpecialty);
	}

	@Override
	public void update(Specialty specialty) {
		sDao.update(specialty);		
	}

}
