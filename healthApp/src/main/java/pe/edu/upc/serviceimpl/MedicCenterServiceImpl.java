package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMedicCenterDao;
import pe.edu.upc.entity.MedicCenter;
import pe.edu.upc.service.IMedicCenterService;

@Named
@RequestScoped
public class MedicCenterServiceImpl implements IMedicCenterService {
	@Inject
	private IMedicCenterDao mcDao;

	public void insert(MedicCenter medic) {
		mcDao.insert(medic);
	}

	public List<MedicCenter> list() {
		// TODO Auto-generated method stub
		return mcDao.list();
	}

	public void delete(int idMedicCenter) {
		mcDao.delete(idMedicCenter);
	}

	@Override
	public List<MedicCenter> findByNameMedicCenter(MedicCenter mc) {
		// TODO Auto-generated method stub
		return mcDao.findByNameMedicCenter(mc);
	}

}
