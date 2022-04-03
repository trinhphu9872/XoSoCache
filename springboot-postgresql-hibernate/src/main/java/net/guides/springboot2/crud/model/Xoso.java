package net.guides.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "xoso")
public class Xoso {

	private String Id;
	private String Mien;
	private String Dai;
	private String GiaiDacbiet;
	private String GiaiNhat;
	private String GiaiNhi;
	private String GiaiBa;
	private String GiaiTu;
	private String GiaiNam;
	private String GiaiSau;
	private String GiaiBay;
	private String GiaiTam;

	public Xoso(){

	}

	@Id
	@Column(name = "xoso_id")
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	@Column(name = "mien")
	public String getMien() {
		return Mien;
	}

	public void setMien(String mien) {
		Mien = mien;
	}

	@Column(name = "dai")
	public String getDai() {
		return Dai;
	}

	public void setDai(String dai) {
		Dai = dai;
	}

	@Column(name = "dacbiet")
	public String getGiaiDacbiet() {
		return GiaiDacbiet;
	}

	public void setGiaiDacbiet(String giaiDacbiet) {
		GiaiDacbiet = giaiDacbiet;
	}

	@Column(name = "nhat")
	public String getGiaiNhat() {
		return GiaiNhat;
	}

	public void setGiaiNhat(String giaiNhat) {
		GiaiNhat = giaiNhat;
	}

	@Column(name = "nhi")
	public String getGiaiNhi() {
		return GiaiNhi;
	}

	public void setGiaiNhi(String giaiNhi) {
		GiaiNhi = giaiNhi;
	}

	@Column(name = "ba")
	public String getGiaiBa() {
		return GiaiBa;
	}

	public void setGiaiBa(String giaiBa) {
		GiaiBa = giaiBa;
	}

	@Column(name = "tu")
	public String getGiaiTu() {
		return GiaiTu;
	}

	public void setGiaiTu(String giaiTu) {
		GiaiTu = giaiTu;
	}

	@Column(name = "nam")
	public String getGiaiNam() {
		return GiaiNam;
	}

	public void setGiaiNam(String giaiNam) {
		GiaiNam = giaiNam;
	}

	@Column(name = "sau")
	public String getGiaiSau() {
		return GiaiSau;
	}

	public void setGiaiSau(String giaiSau) {
		GiaiSau = giaiSau;
	}

	@Column(name = "bay")
	public String getGiaiBay() {
		return GiaiBay;
	}

	public void setGiaiBay(String giaiBay) {
		GiaiBay = giaiBay;
	}

	@Column(name = "tam")
	public String getGiaiTam() {
		return GiaiTam;
	}

	public void setGiaiTam(String giaiTam) {
		GiaiTam = giaiTam;
	}
}

