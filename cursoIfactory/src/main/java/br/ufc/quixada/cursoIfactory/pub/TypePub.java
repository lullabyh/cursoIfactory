package br.ufc.quixada.cursoIfactory.pub;

public enum TypePub {
	
	ARTIGO("ARTIGO"), LIVRO("LIVRO"), NOTICIA("NOTICIA");
	
	private String nome;
	
	private TypePub(String nome){
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
