package Personagem;

import Interface.ComportamentoHeroico;

public class Cavaleiro extends Personagem implements ComportamentoHeroico{
	
	public Cavaleiro() {
		
	}
	
	public Cavaleiro(String nome) {
		super(nome);
	}
	
	public void andar() {
		super.andar();
	}
	
	public void guardarItem() {
		super.guardarItem();
	}
	
	public void usarItem() {
		super.usarItem();
	}

	@Override
	public void atacar() {
		
	}

	@Override
	public void defender() {
		
	}

	@Override
	public void saltar() {
		
	}

	
}
