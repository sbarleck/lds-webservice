package com.linha.saude.linha.saude;

import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.ArrayList;

public class InstituicaoSaude {

	@Id private String id;

    //ULBRA Guaíba
    //Associação ou organização
    //Endereço: BR Km 5724 - Av. Brasil, 116 - Moradas da Colina, Guaíba - RS, 92500-000
    //Telefone:(51) 3480-1618
    //Horas: Aberto hoje · 13:00 – 22:00

	private String type;
    private String name;
    private String address;
    private String phone;
    private String description;
    private Boolean validation = false;
    private Date validation_at = new Date();
    private Date created_at = new Date();
    private ArrayList<Double> geolocation = new ArrayList<Double>();

	public String getName() { return name; }
    public String getType() { return type; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getDescription() { return description; }
    public Date getCreatedAt() { return created_at; }
    public ArrayList<Double> getGeolocation() { return geolocation; }
    public Boolean getValidation() { return validation; }

	public void setName(String name) { this.name = name; }
    public void setType(String type) { this.type = type; }
    public void setAddress(String address) { this.address = address; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setDescription(String description) { this.description = description; }
    public void setGeolocation(ArrayList<Double> geo) { this.geolocation = geo; }
    public void setValidation(Boolean validation) { this.validation = validation; }
}
