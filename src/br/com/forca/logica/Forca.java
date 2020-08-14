package br.com.forca.logica;

import br.com.forca.modelo.Banco;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Forca {
  private String jogador;
  private String nomePalavra, dicaPalavra;
  private Boolean newGame = false;
  private ArrayList<Palavra> listaPalavras;
  private Integer vida = 6;
  private Integer numeroAcertos = 0;

  public Forca(String jogador) {
    this.jogador = jogador;
    Banco banco = new Banco();
    this.listaPalavras = banco.getPalavras();
  }

  public void newGame() {
    Random r = new Random();
    int index = r.nextInt(this.listaPalavras.size());
    this.nomePalavra = this.listaPalavras.get(index).getNome();
    this.dicaPalavra = this.listaPalavras.get(index).getDica();
    this.listaPalavras.remove(index);
    this.newGame = true;
  }

  public void start() {
    Scanner s = new Scanner(System.in);
    ArrayList<String> palavraGerada = new ArrayList<>();
    ArrayList<String> listaDePalpites = new ArrayList<>();

    char[] nomePalavraCodificada = new char[this.nomePalavra.length()];
    Arrays.fill(nomePalavraCodificada, '_');
    palavraGerada.add(this.nomePalavra);
    palavraGerada.add(new String(nomePalavraCodificada));

    if (this.newGame) {
      System.out.println("\nBem vindo ao jogo da forca " + jogador);

      String palavraDecodificada = palavraGerada.get(0);
      String palavraCodificada = palavraGerada.get(1);
      String palavra[] = palavraDecodificada.split("");
      String palavra2[] = palavraCodificada.split("");

      while (true) {
        this.boneco();

        //Só execulta se a lista de palavras for maior que 0
        if (this.listaPalavras.size() > 0) {
          System.out.println("A sua dica é: " + this.dicaPalavra);
          System.out.println(
            "Palavra: " + palavra2.toString().join(" ", palavra2)
          );
          System.out.println("Palavra: " + palavraDecodificada);
          if (this.vida == 0) {
            System.out.println("Sua vida zerou, vocé precisa adivinhar a palavra!");
			
          } else if (this.vida == 1) {
			System.out.println("Vocé tem " + this.vida + " vida");
			
          } else {
            System.out.println("Você tem " + this.vida + " vidas");
		  }
		  System.out.println(this.numeroAcertos);
		  System.out.println(palavra.length);
		  System.out.println(this.numeroAcertos == palavra.length-1);
		  if(this.vida > 0 && this.numeroAcertos != palavra.length-1){
			  
			  System.out.println("Informe seu palpite: ");
			  String res = s.nextLine();
	
			  /*
			   * aqui uma lista de "palpites" foi criada
			   * caso o caractere seja novo entrará, ele verifica se tem ou na
			   * o na palavra a ser adivinhada
			   * caso contrário ele  mostrara uma msg dizendo
			   * que o caractere ja foi digitado
			   *
			   * */
			  if (listaDePalpites.contains(res)) {
				System.out.println("---Essa letra ja foi digitada :/ ---\n");
			  } else {
				listaDePalpites.add(res);
				  for (int i = 0; i < palavraDecodificada.length(); i++) {
					if (palavra[i].equals(res)) {
					  palavra2[i] = res;
					  this.numeroAcertos += 1;
					}
				  }
	
				  //se tiver a letra digitada ok mas se nao tiver vc perde uma vida
				  if (palavraDecodificada.contains(res.toString())) {
					System.out.println("tem essa letra :D\n ");
				  } else {
					System.out.println("Não tem essa letra :( ");
					vida -= 1;
				  }
			  }
		  }
		  // caso acabem seus palpites, o player terá uma "chance final"
		  else {
			  
				System.out.println("\n ----- Adivinhe a palavra -----");
				System.out.println("Qual a sua resposta? ");
				String resposta = s.next();
  
				if (resposta.equals(palavraGerada.get(0))) {
				  System.out.println("\nParabens você ganhou!!!");
				  
				} else {
				  System.out.println("\nQue pena, você perdeu :(");
				  System.out.println("A palavra era: " + palavraGerada.get(0));
				}
				System.out.println("Deseja iniciar um novo jogo? [s/n]");
				resposta = s.next();
				if(resposta.equals("s")){
					this.vida = 6;
					this.newGame();
					this.start();
				}
				else{
					System.out.println("\n\nObrigado por jogar o nosso jogo da forca, volte sempre");
					System.out.println("\n\nEsse jogo foi desenvolvido por:");
					System.out.println("\n\nJeferson | Denis | Matheus | Emannuel");
					break;
				}
		  	}

		  
          //Se a lista de palavras for vazia
        } else {
          System.out.println("\nErro! crie um novo jogo antes.");
        }
      }
    }
  }

  public void boneco() {
    {
      if (this.vida == 6) {
        System.out.println("                 ");
        System.out.println("   ____________  ");
        System.out.println("   |          _|_");
        System.out.println("   |             ");
        System.out.println("   |              ");
        System.out.println("   |              ");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
      } else if (this.vida == 5) {
        System.out.println("                 ");
        System.out.println("   ____________  ");
        System.out.println("   |          _|_");
        System.out.println("   |           O  ");
        System.out.println("   |              ");
        System.out.println("   |              ");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
      } else if (this.vida == 4) {
        System.out.println("                 ");
        System.out.println("   ____________  ");
        System.out.println("   |          _|_");
        System.out.println("   |           O  ");
        System.out.println("   |           |   ");
        System.out.println("   |              ");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
      } else if (this.vida == 3) {
        System.out.println("                 ");
        System.out.println("   ____________  ");
        System.out.println("   |          _|_");
        System.out.println("   |           O  ");
        System.out.println("   |         / |    ");
        System.out.println("   |              ");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
      } else if (this.vida == 2) {
        System.out.println("                 ");
        System.out.println("   ____________  ");
        System.out.println("   |          _|_");
        System.out.println("   |           O  ");
        System.out.println("   |         / | \\ ");
        System.out.println("   |              ");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
      } else if (this.vida == 1) {
        System.out.println("                 ");
        System.out.println("   ____________  ");
        System.out.println("   |          _|_");
        System.out.println("   |           O  ");
        System.out.println("   |         / | \\ ");
        System.out.println("   |          /   ");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
      } else if (this.vida == 0) {
        System.out.println("                 ");
        System.out.println("   ____________  ");
        System.out.println("   |          _|_");
        System.out.println("   |           O  ");
        System.out.println("   |         / | \\ ");
        System.out.println("   |         /   \\  ");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("   |");
        System.out.println("___|___");
      }
    }
  }
}
