package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	static List<Produto> produtos = new ArrayList<>();

	public static void main(String[] args) {
		ProdTeste();
		
		int opcao;
		do {
			exibirMenu();
			opcao = lerOpcao();
			processarOpcao(opcao);	
		} while(opcao != 4);	
	}
	
	public static int lerOpcao() {
		try {
			return Integer.parseInt(sc.nextLine());
			
		} catch (NumberFormatException e) {
			return -1;
		}
	}
	
	public static void processarOpcao(int opcao) {
		switch(opcao) {
		case 1:
			cadastrarProd();
			break;
		case 2:
			consultarEstoque();
			break;
		case 3:
			EntraSai();
			break;
		}
	}
	
	public static void exibirMenu() {
		 System.out.println("\n=== CONTROLE DE ESTOQUE ===");
	        System.out.println("1. Cadastrar Produto");
	        System.out.println("2. Listar Produto");
	        System.out.println("3. Registrar Entrada/Saída");
	        System.out.println("4. Sair");
	        System.out.print("Escolha uma opção: ");
	}
	
	public static void cadastrarProd() {
		String name = verificarTexto("Digite o nome do produto: ");
		double precoProd = verificarNumero("Digite o preço do produto: ", true);
		double qtdProd = verificarNumero("Digite a quantidade em estoque: ", false);
		int qtdProdInt = (int) qtdProd;
		
	    produtos.add(new Produto(name, precoProd, qtdProdInt));	
	    System.out.println("===================================");
	}
	
	public static void consultarEstoque() {
		System.out.println("\n=== ESTOQUE ATUAL ===");
		
		if (produtos.isEmpty()) {
			System.out.println("Não há produtos cadastrados");
			return;
		}
		for (int i = 0; i < produtos.size(); i++) {
			int numero = i + 1;
			System.out.println(numero + ". " + produtos.get(i));
		}
		System.out.println("===================================");
	}
	
	public static void EntraSai() {
		System.out.println("\n=== REGISTRO ESTOQUE ===");
		boolean encontrado = false;
		
		System.out.print("Digite o nome do produto: ");
		String busca = sc.nextLine().toLowerCase();
		
		
		
		for (int i = 0; i < produtos.size(); i ++) {
			if (produtos.get(i).getName().toLowerCase().equals(busca)) {
				System.out.println("=== PRODUTO ENCONTRADO ===");
				System.out.println("Produto: " + produtos.get(i).getName());
				System.out.println("Estoque atual: " + produtos.get(i).getQtdProd());
				char ch;
				do {
					System.out.printf("Deseja registrar uma venda ou entrada do produto '%s' ? (v/e): ", produtos.get(i).getName());
					String escolha = sc.nextLine().toLowerCase();
					if (escolha.isEmpty()) {
					    ch = ' '; 
					} else {
					    ch = escolha.charAt(0); 
					}
					
					if (ch != 'v' && ch != 'e') {
						System.out.println("Opção Inválida");
					}	
				} while(ch != 'v' && ch != 'e');
				
				if (ch == 'v') {
					double saida = verificarNumero("Quantidade que vai sair: ", false);
					int saidaEstoque = (int) saida;
					produtos.get(i).removeQtdEtq(saidaEstoque);
					
				} 
				
				if (ch == 'e') {
					double entrada = verificarNumero("Quantidade que vai entrar: ", false);
					int entradaEstoque = (int) entrada;
					produtos.get(i).addQtdEtq(entradaEstoque);
						
				}
				System.out.println("Produto: " + produtos.get(i).getName());
				System.out.println("Novo estoque: " + produtos.get(i).getQtdProd());
				encontrado = true;
			}
		}
		if (!encontrado) {
    		System.out.println("Produto não encontrado");
		}
		System.out.println("===================================");

	}
	
	public static void ProdTeste() {
		produtos.add(new Produto("Celular", 2000.0, 154));
		produtos.add(new Produto("Tablet", 1500.0, 500));
		produtos.add(new Produto("Notebook", 2500.0, 200));
	}
	
	public static String verificarTexto(String mensagem) {
		String texto = "";
		
		while(texto.trim().isEmpty()) {
			System.out.print(mensagem);
			texto = sc.nextLine();
			
			if (texto.trim().isEmpty()) {
				System.out.println("O título não pode ser vazio. Tente novamente.");
			}
		} 
		return texto;
	}
	
	public static double verificarNumero(String mensagem, boolean aceitaDecimal) {
	    while (true) {
	        try {
	            System.out.print(mensagem);
	            String entrada = sc.nextLine().replace(",", ".");
	            
	            if (!aceitaDecimal && entrada.contains(".")) {
	                System.out.println("Para este campo, não use pontos ou vírgulas!");
	                continue;
	            }
	            
	            return Double.parseDouble(entrada);
	        } catch (NumberFormatException e) {
	            System.out.println("Entrada inválida! Digite apenas números.");
	        }
	    }
	}
}
