package br.com.simulador.sena.mega;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class Jogos {

	public static void main(String[] args) {
		
		List<Integer> numeros = new ArrayList<Integer>();
		String recebeQuantidadeDeJogo = "";
		int quantidadeDeJogo = 0;
		int contador = 0;
		String flag = "";
		recebeQuantidadeDeJogo = JOptionPane.showInputDialog("Digite a quantidade de jogos que deseja");
		quantidadeDeJogo = Integer.parseInt(recebeQuantidadeDeJogo);
		do {
		contador++;
		for (int i = 1; i <= 60 ; i++) {
			numeros.add(i);
		}
		
		Collections.shuffle(numeros);
		List<Integer> numerosSortiados = numeros.subList(0, 6);
		
		//System.out.println(numerosSortiados);
		
		Collections.sort(numerosSortiados);
		
		for (Integer sorteado : numerosSortiados) {
			if(sorteado < 10) {
				System.out.print("0"+ sorteado + " ");
			}else {
				System.out.print(sorteado + " ");
			}
			
		}
			System.out.println("");
//			flag = JOptionPane.showInputDialog("Deseja fazer mais 1 jogo \n (S)Sim (N) Não");
//		
//			if (!flag.equalsIgnoreCase("s") && !flag.equalsIgnoreCase("n")) {
//			
//				JOptionPane.showMessageDialog(null, "opção invalida");
//				System.out.println("opção invalida");
//			}	
		}while (contador < quantidadeDeJogo);
		
		JOptionPane.showMessageDialog(null, "você fez " + contador +" Jogo(s).");
		
		}
	}
