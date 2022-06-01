package controle;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileRobo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bem vindo ao Robo do Cristiano Ronaldo!!");
		
		ArrayList<String> options = new ArrayList<String>();
		options.add("1 - Clubes Defendidos.");
		options.add("2 - Nacionalidade.");
		options.add("3 - Primeiro Gol.");
		options.add("4 - N�mero de vezes Melhor Jogador do Ano.");
		options.add("5 - Maiores Recordes.");
		int resposta=0;
		while(resposta >=0 && resposta<6){
			System.out.printf("%nO que voc� gost�ria de saber sobre o CR7: %n");
			for(int i=0; i<options.size(); i++) {
				System.out.println(options.get(i));
			}
			System.out.print("Op��o: ");
			resposta = sc.nextInt();
			if(resposta >=0 && resposta<6) {
				switch(resposta){
					case 1:
						System.out.println("Sporting - PT");
						System.out.println("2x Manchester United - ING");
						System.out.println("Real Madrid - ESP");
						System.out.println("Juventus - ITA");
						break;
	
					case 2:
						System.out.println("Cristiano Ronaldo � Portugu�s, nacido na Ilha da Madeira.");
						break;
	
					case 3:
						System.out.printf("Cristiano Ronaldo marcou seu primeiro gol como profissional no dia 6 de outubro de 2002,%nele marcou em um jogo que acabou com a vit�ria do Sporting por 3x0 sobre o Moreirense,%npela sexta rodada do Campeonato Portugu�s do mesmo ano.%n");
						break;
	
					case 4:
						System.out.println("Cristiano Ronaldo foi eleito 5 vezes pela FIFA o Melhor Jogador do Mundo.");
						break;
	
					case 5:
						System.out.println("1- Maior Artilheiro por Sele��es.");
						System.out.println("2- Maior Artilheiro da UEFA Champions League.");
						System.out.println("3- Maior Assistente da UEFA Champions League.");
						System.out.println("3- Maior Artilheiro da Eurocopa.");
						System.out.println("4- Maior N�meros de gols Oficias.");
						System.out.println("5- Artilheiro do Campeonato Nacional por 3 Pa�ses Diferentes.");
				}
			}else {
				System.out.println("At� mais!!");
			}
		}
		sc.close();
		
	}

}
