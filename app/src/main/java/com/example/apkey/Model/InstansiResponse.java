package com.example.apkey.Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class InstansiResponse {

	@SerializedName("instansi")
	private List<InstansiItem> instansi;

	public void setInstansi(List<InstansiItem> instansi){
		this.instansi = instansi;
	}

	public List<InstansiItem> getInstansi(){
		return instansi;
	}

	@Override
 	public String toString(){
		return 
			"InstansiResponse{" +
			"instansi = '" + instansi + '\'' + 
			"}";
		}
}