package com.example.apkey.Model;

import com.google.gson.annotations.SerializedName;

public class InstansiItem{

	@SerializedName("nomor_instansi")
	private String nomorInstansi;

	@SerializedName("nama_kabupaten")
	private String namaKabupaten;

	@SerializedName("jenis_instansi")
	private String jenisInstansi;

	@SerializedName("alamat_instansi")
	private String alamatInstansi;

	@SerializedName("id")
	private String id;

	@SerializedName("nama_instansi")
	private String namaInstansi;

	@SerializedName("id_kabupaten")
	private String idKabupaten;

	public void setNomorInstansi(String nomorInstansi){
		this.nomorInstansi = nomorInstansi;
	}

	public String getNomorInstansi(){
		return nomorInstansi;
	}

	public void setNamaKabupaten(String namaKabupaten){
		this.namaKabupaten = namaKabupaten;
	}

	public String getNamaKabupaten(){
		return namaKabupaten;
	}

	public void setJenisInstansi(String jenisInstansi){
		this.jenisInstansi = jenisInstansi;
	}

	public String getJenisInstansi(){
		return jenisInstansi;
	}

	public void setAlamatInstansi(String alamatInstansi){
		this.alamatInstansi = alamatInstansi;
	}

	public String getAlamatInstansi(){
		return alamatInstansi;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setNamaInstansi(String namaInstansi){
		this.namaInstansi = namaInstansi;
	}

	public String getNamaInstansi(){
		return namaInstansi;
	}

	public void setIdKabupaten(String idKabupaten){
		this.idKabupaten = idKabupaten;
	}

	public String getIdKabupaten(){
		return idKabupaten;
	}

	@Override
 	public String toString(){
		return 
			"InstansiItem{" + 
			"nomor_instansi = '" + nomorInstansi + '\'' +
			",nama_kabupaten = '" + namaKabupaten + '\'' + 
			",jenis_instansi = '" + jenisInstansi + '\'' + 
			",alamat_instansi = '" + alamatInstansi + '\'' + 
			",id = '" + id + '\'' + 
			",nama_instansi = '" + namaInstansi + '\'' + 
			",id_kabupaten = '" + idKabupaten + '\'' + 
			"}";
		}
}