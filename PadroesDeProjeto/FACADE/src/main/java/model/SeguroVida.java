package model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
public class SeguroVida extends Seguro {

	private String beneficiario;
	private Data datanasc;

	@Override
	public String imprimirSeguro() {

		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("SeguroVida [beneficiario=");
		stringBuilder.append(getBeneficiario());
		stringBuilder.append(", datanasc=");
		stringBuilder.append(getDatanasc().imprimirData());
		stringBuilder.append(", toString()=");
		stringBuilder.append(super.imprimirSeguro());
		return stringBuilder.toString();
	}

	public SeguroVida(int apolice, String nome, double valor, double premio, Endereco endereco, String benefeciario, Data data) {
		super();
		setBeneficiario(beneficiario);
		setDatanasc(datanasc);
	} 

}
