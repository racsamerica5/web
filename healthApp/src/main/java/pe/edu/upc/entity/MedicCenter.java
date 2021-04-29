package pe.edu.upc.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MedicCenter")
public class MedicCenter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMedicCenter;

	@Column(name = "nameMedicCenter", nullable = false, length = 50)
	private String nameMedicCenter;

	@Column(name = "adressMedicCenter", nullable = false, length = 60)
	private String adressMedicCenter;

	private Date dateMedicCenter;

	// constructor sin parámetros
	public MedicCenter() {
		super();
		// TODO Auto-generated constructor stub
	}
	// Constructor con parámetros

	public MedicCenter(int idMedicCenter, String nameMedicCenter, String adressMedicCenter, Date dateMedicCenter) {
		super();
		this.idMedicCenter = idMedicCenter;
		this.nameMedicCenter = nameMedicCenter;
		this.adressMedicCenter = adressMedicCenter;
		this.dateMedicCenter = dateMedicCenter;
	}

	// get y set
	public int getIdMedicCenter() {
		return idMedicCenter;
	}

	public void setIdMedicCenter(int idMedicCenter) {
		this.idMedicCenter = idMedicCenter;
	}

	public String getNameMedicCenter() {
		return nameMedicCenter;
	}

	public void setNameMedicCenter(String nameMedicCenter) {
		this.nameMedicCenter = nameMedicCenter;
	}

	public String getAdressMedicCenter() {
		return adressMedicCenter;
	}

	public void setAdressMedicCenter(String adressMedicCenter) {
		this.adressMedicCenter = adressMedicCenter;
	}

	public Date getDateMedicCenter() {
		return dateMedicCenter;
	}

	public void setDateMedicCenter(Date dateMedicCenter) {
		this.dateMedicCenter = dateMedicCenter;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idMedicCenter;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedicCenter other = (MedicCenter) obj;
		if (idMedicCenter != other.idMedicCenter)
			return false;
		return true;
	}

}
