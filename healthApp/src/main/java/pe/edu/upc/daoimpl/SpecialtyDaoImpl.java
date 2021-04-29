package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISpecialtyDao;
import pe.edu.upc.entity.Specialty;

public class SpecialtyDaoImpl implements ISpecialtyDao {
	@PersistenceContext(unitName = "healthApp")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Specialty specialty) {
		try {
			em.persist(specialty);
		} catch (Exception e) {
			System.out.println("Error en el daoImpl of Specialty al insertar");
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Specialty> list() {
		List<Specialty> lista = new ArrayList<Specialty>();
		try {
			Query q = em.createQuery("from Specialty s");
			lista = (List<Specialty>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}

	@Transactional
	@Override
	public void delete(int idSpecialty) {
		Specialty spec = new Specialty();
		try {
			spec = em.getReference(Specialty.class, idSpecialty);
			em.remove(spec);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void update(Specialty specialty) {
		try {
			em.merge(specialty);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
