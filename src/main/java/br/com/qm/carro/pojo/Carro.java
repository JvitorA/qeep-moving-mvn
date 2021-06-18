package br.com.qm.carro.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//Nos deparamos aqui com a nossa primeira anotação, no caso da Entity
//é uma anotação da nossa biblioteca de persistência que indica que a
//classe é uma representação de uma entidade do banco de dados.

//Aqui também é possível utilizar a anotação @Table para especificar o nome
//da tabela em que trabalharemos. Por padrão o Hibernate criará uma tabela
//com base no nome da classe.
@Entity
public class Carro {

	// A anotação @Id serve pra identificar a chave primária.
	@Id
	private String placa;
	private String cor;
	private String marca;
	private String modelo;
	
	// A anotação @Column serve para indicarmos o nome da coluna do banco de dados
	// caso não a utilizemos o Hibernate fará uma correspondência entre o 
	// nome do atributo e a coluna.
	@Column(name = "vel_max")
	private float velMax;
	
	
	public Carro() {
	}
	
	public Carro(String placa, String cor, String marca, String modelo, float velMax) {
		this.placa = placa;
		this.cor = cor;
		this.marca = marca;
		this.modelo = modelo;
		this.velMax = velMax;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public float getVelMax() {
		return velMax;
	}

	public void setVelMax(float velMax) {
		this.velMax = velMax;
	}

	@Override
	public String toString() {
		return "Carro [placa=" + placa + ", cor=" + cor + ", marca=" + marca + ", modelo=" + modelo + ", velMax="
				+ velMax + "]";
	}
	
}
