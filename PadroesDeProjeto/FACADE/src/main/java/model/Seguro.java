package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Seguro {

	private int numApolice;
	private String nome;
	private float valor;
	private float premio;
	private Endereco endereco;

	public String imprimirSeguro() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Seguro [numApolice=");
		stringBuilder.append(getNumApolice());
		stringBuilder.append(", nome=");
		stringBuilder.append(getNome());
		stringBuilder.append(", valor=");
		stringBuilder.append(getValor());
		stringBuilder.append(", premio=");
		stringBuilder.append(getPremio());
		stringBuilder.append(", endereco=");
		stringBuilder.append(getEndereco().imprimirEndereco());
		stringBuilder.append("]");
		return stringBuilder.toString();
	}

	public Seguro(int numApolice, String nome, float valor, float premio, Endereco endereco) {
		super();
		this.numApolice = numApolice;
		this.nome = nome;
		this.valor = valor;
		this.premio = premio;
		this.endereco = endereco;
	}


}
