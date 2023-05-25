package main;

import java.util.ArrayList;
import java.util.List;

import lombok.experimental.SuperBuilder;
import model.Data;
import model.Endereco;
import model.Seguro;
import model.SeguroAuto;
import model.SeguroCasa;
import model.SeguroVida;

public class MainSeguro {

	public String insereSeguro(Seguro seguroVida) {
		List<Seguro> S = new ArrayList<Seguro>();
		System.out.println(seguroVida.getNome());
		S.add(seguroVida);
		
		return S.get(0).imprimirSeguro();
		
	}
	
	
	public static void main(String[] args) {
		Data data = new Data(11, 10, 2002);
		Endereco endereco = new Endereco("Av.JK n°1000", "SJC", "SP", "12220220");
		
		
		  Seguro seguroAuto = new SeguroAuto(1111, "Jorge", 1111.11, 11111.11,
		  endereco, 111, 2222, "SP", "Vectra", 2015);
		  
		  Seguro seguroImobiliaro = new SeguroCasa(1111, "Jorge", 1111.11, 11111.11,
		  endereco, 111, 2012);
		 
		
		Seguro seguroVida = new SeguroVida(1111, "Jorge", 1111.11, 11111.11, endereco, "Leonardo", data);
		
		MainSeguro main =new MainSeguro();
		System.out.println(main.insereSeguro(seguroVida));
		
		  System.out.println(main.insereSeguro(seguroAuto));
		  System.out.println(main.insereSeguro(seguroImobiliaro));
		 
		

	}

}
