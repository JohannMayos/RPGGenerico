package Personagem;
import Interface.ComportamentoNormal;

public class Personagem implements ComportamentoNormal{

	private String nome;
	
	public Personagem() {
		
	}
	
	public Personagem(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void andar() {
	
	}

	@Override
	public void guardarItem() {
		
		
	}

	@Override
	public void usarItem() {
		
		
	}
	
	
}
