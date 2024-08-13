package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Login l1 = new Login();
		Conteudo conteudo = new Conteudo();
		String login;
		String senha;
		boolean loginOn = false;
		int esc = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====MENU INICIAL====");
		
		while (loginOn == false && esc != 3 ) {
			System.out.println("1. Login: Fazer login no sistema. "
					+ "\n2. Listar Conteúdos: Listar os conteúdos."
					+ "\n3. Sair: Sair do sistema. ");
			esc = sc.nextInt();
			sc.nextLine();
			switch (esc) {
			case 1:
				
				System.out.println("Usuario: ");
				login = sc.nextLine();
				System.out.println("Senha: ");
				senha = sc.nextLine();
				if (l1.Login1(login, senha)) {
					System.out.println("Login efetuado com sucesso!");
					loginOn = true;
				} else {
					 System.out.println("Usuário ou senha incorretos.");
				}
				break;
			case 2:
				conteudo.listarConteudos();

			case 3 :
				System.out.println("Saindo do sistema.");
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
		}
		if (loginOn) {
			System.out.println("====GESTÃO DE CONTEÚDOS====");
		}
		
		while (loginOn) {
			System.out.println("-MENU-");
			System.out.println("1. Criar Conteúdo: Cria novo conteúdo.\n"
					+ "2. Listar Conteúdo: Listar os conteúdos.\n"
					+ "3. Atualizar Conteúdo: Editar conteúdo.\n"
					+ "4. Excluir Conteúdo: Deletar conteúdo.\n"
					+ "5. Logout: Sai do login.");
			esc = sc.nextInt();
			
			sc.nextLine();
			
			switch (esc) {
			case 1:
				System.out.print("Digite o conteúdo que deseja criar: ");
				String novoConteudo = sc.nextLine();
				conteudo.criarConteudo(novoConteudo);
				break;
			case 2:
				conteudo.listarConteudos();
				break;
			case 3: 
				conteudo.listarConteudos();
				System.out.print("Digite o número do conteúdo que deseja atualizar: ");
				int num = sc.nextInt();
				sc.nextLine();
				System.out.print("Digite o novo conteúdo: ");
				String attConteudo = sc.nextLine();
				conteudo.attConteudo(num, attConteudo);
				break;
			case 4 :
				conteudo.listarConteudos();
				System.out.print("Digite o número do conteúdo que deseja excluir: ");
				int numExcluir = sc.nextInt();
				sc.nextLine();
				conteudo.excluirConteudo(numExcluir);
				break;
			case 5:
				loginOn = false;
				System.out.println("Logout efetuado com sucesso.");
				break;
				
			default:
				System.out.println("Opção inválida. Tente novamente.");
				break;
			}
			
		}
		
		
		sc.close();
	}
}
