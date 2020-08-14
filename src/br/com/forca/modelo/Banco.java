package br.com.forca.modelo;

import java.util.ArrayList;

import br.com.forca.logica.Lista;
import br.com.forca.logica.Palavra;

public class Banco {
	
	public Banco() {
		
	}
	
	public ArrayList<Palavra> getPalavras() {
		
		Lista lista = new Lista();
		lista.gerarNovaPalavra("nome", "todo mundo pode ter um igual ao seu");
		lista.gerarNovaPalavra("planta", "estuda-se em biologia");
		lista.gerarNovaPalavra("videogame", "desafios, reais ou abstratos. ");
		lista.gerarNovaPalavra("iphone", "empresa que agrega status");
		lista.gerarNovaPalavra("animal", "fagner");
		lista.gerarNovaPalavra("ronaldinho", "dibre e ousadia");
		lista.gerarNovaPalavra("coronavirus", "pandemia");
		lista.gerarNovaPalavra("messi", "o bicho é um ET");
		lista.gerarNovaPalavra("cristiano", "robo, craque e temido.");
		lista.gerarNovaPalavra("dengue", "pandemia");
		lista.gerarNovaPalavra("gripe", "doença comum, provavel que vc ja pegou.");
		lista.gerarNovaPalavra("promocao", "todo mundo gosta, especificamente em novembro.");
		lista.gerarNovaPalavra("idade", "alguem pode ter igual a vc.");
		lista.gerarNovaPalavra("mandarim", "idioma.");
		lista.gerarNovaPalavra("yokohama", "cidade de um país asiático.");
		lista.gerarNovaPalavra("pernambuco", "estado.");
		lista.gerarNovaPalavra("usp", "insituicao de ensino.");
		lista.gerarNovaPalavra("unicamp", "insituicao de ensino.");
		lista.gerarNovaPalavra("hyundai", "empresa fortissima do ramo automobilistico.");
		lista.gerarNovaPalavra("liverpool", "time britanico, muito importante.");
		lista.gerarNovaPalavra("barcelona", "time da peninsula iberica, fica num lugar turistico muito requisitado.");
		lista.gerarNovaPalavra("italiano", "idioma.");
		lista.gerarNovaPalavra("brasileiro", "nacionalidade.");
		lista.gerarNovaPalavra("laranja", "cor e fruta ao mesmo tempo kkkkkkk.");
		lista.gerarNovaPalavra("record", "canal da tv brasileira.");
		lista.gerarNovaPalavra("tiririca", "notavel politico.");
		lista.gerarNovaPalavra("whindersson", "comediante muito famoso.");
		lista.gerarNovaPalavra("luciano", "cantor muito famoso.");
		lista.gerarNovaPalavra("kiss", "banda de hard rock famosa.");
		lista.gerarNovaPalavra("cayman", "conjunto de ilhas famoso.");
		lista.gerarNovaPalavra("piratas", "especie de assaltante, nao muito comum na atualidade.");
		lista.gerarNovaPalavra("quimico", "profissional de ciencias, atua em laboratorio.");
		lista.gerarNovaPalavra("bombeiro", "profissional que atua em situacao de risco.");
		lista.gerarNovaPalavra("vendedor", "profissao, uma das mais comuns ligada ao comercio.");
		lista.gerarNovaPalavra("economia", "uma area muito importante, ela esta sempre em voga.");
		lista.gerarNovaPalavra("marrocos", "pais africano, vizinho a peninsula iberica.");
		lista.gerarNovaPalavra("franca", "pais da europa, vizinho a peninsula iberica.");
		lista.gerarNovaPalavra("mastersystem", "um dos consoles mais famosos da historia.");
		lista.gerarNovaPalavra("supermercado", "lugar onde sempre a maiori das pessoas vao, pelo menos uma vez no mes.");
		lista.gerarNovaPalavra("constelacao", "agrupamentos de estrelas ligadas por linhas imaginárias.");
		lista.gerarNovaPalavra("ford", "marca de carrro.");
		lista.gerarNovaPalavra("fiat", "empresa que fabrica carros.");
		lista.gerarNovaPalavra("honda", "empresa automobilistica.");
		lista.gerarNovaPalavra("lakers", "time de basquete, muito conhecido.");
		lista.gerarNovaPalavra("argentina", "pais da america, banhado pelo rio da prata.");
		lista.gerarNovaPalavra("uruguai", "pais da america, banhado pelo rio da prata.");
		lista.gerarNovaPalavra("mexico", "pais da america, sua bandeira e similar a da italia.");
		lista.gerarNovaPalavra("flamengo", "time da america do sul, tem uma torcida grande.");
		lista.gerarNovaPalavra("gremio", "time de futebol, considerado um dos maiores do brasil.");
		lista.gerarNovaPalavra("santos", "time que revela muitos craques.");
		lista.gerarNovaPalavra("farcry", "um dos jogos mais badalados dos ultimos anos.");
		lista.gerarNovaPalavra("sonic", "personagem de um game classico.");
		lista.gerarNovaPalavra("link", "personagem de um game, que usa uma touca.");
		
		
		return lista.getLista();
	}

}