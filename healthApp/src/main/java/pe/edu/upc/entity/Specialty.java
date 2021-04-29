package pe.edu.upc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Specialty")
public class Specialty {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSpecialty;

	@Column(name = "nameSpecialty", nullable = false, length = 37)
	private String nameSpecialty;

	@ManyToOne
	@JoinColumn(name = "idMedicCenter", nullable = false)
	private MedicCenter medicCenter;

	public Specialty(int idSpecialty, String nameSpecialty, MedicCenter medicCenter) {
		super();
		this.idSpecialty = idSpecialty;
		this.nameSpecialty = nameSpecialty;
		this.medicCenter = medicCenter;
	}

	public Specialty() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdSpecialty() {
		return idSpecialty;
	}

	public void setIdSpecialty(int idSpecialty) {
		this.idSpecialty = idSpecialty;
	}

	public String getNameSpecialty() {
		return nameSpecialty;
	}

	public void setNameSpecialty(String nameSpecialty) {
		this.nameSpecialty = nameSpecialty;
	}

	public MedicCenter getMedicCenter() {
		return medicCenter;
	}

	public void setMedicCenter(MedicCenter medicCenter) {
		this.medicCenter = medicCenter;
	}

}
