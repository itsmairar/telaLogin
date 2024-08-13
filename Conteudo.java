package application;

import java.util.ArrayList;

public class Conteudo {

	private ArrayList<String> conteudos;
	
	public Conteudo () {
		conteudos = new ArrayList<>();
	}
	public void listarConteudos() {
		if (conteudos.isEmpty()) {
			System.out.println("Nenhum conteúdo disponível.");
		} else {
			System.out.println("Conteúdos disponíveis:");
			for (int i = 0; i < conteudos.size(); i++) {
				System.out.println((i + 1) +  ". " + conteudos.get(i));
			}
		}
	}
	public void criarConteudo(String conteudo) {
		conteudos.add(conteudo);
		System.out.println("Conteúdo criado!");
	}
	
	public void attConteudo(int num, String novoConteudo) {
		if (num > 0 && num <= conteudos.size()) {
			conteudos.set(num - 1, novoConteudo);
			System.out.println("Conteúdo atualizado!");

		} else {
			System.out.println("Numero inválido!");
			
		}
	}
	public void excluirConteudo(int num) {
		if (num > 0 && num <= conteudos.size()) {
			conteudos.remove(num - 1);
			System.out.println("Conteúdo excluído!");
		} else {
			System.out.println("Número inválido!");
		}
	}
	
	
}
