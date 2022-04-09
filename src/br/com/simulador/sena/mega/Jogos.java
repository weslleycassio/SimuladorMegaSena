package br.com.simulador.sena.mega;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jogos {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		for (int i = 1; i <= 60 ; i++) {
			numeros.add(i);
		}
		
		Collections.shuffle(numeros);
		List<Integer> numerosSortiados = numeros.subList(0, 6);
		
		//System.out.println(numerosSortiados);
		
		Collections.sort(numerosSortiados);
		
		System.out.println(numerosSortiados);
		
	}
}
