package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Data {

	private int  dia;
	private int mes;
	private int ano;
	
	public String imprimirData() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Data [dia=");
		stringBuilder.append(getDia());
		stringBuilder.append(", mes=");
		stringBuilder.append(getMes());
		stringBuilder.append(", ano=");
		stringBuilder.append(getAno());
		stringBuilder.append("]");
		return stringBuilder.toString();
	}


}
