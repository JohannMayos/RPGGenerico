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
		System.out.print("Cavaleiro" + Cavaleiro.super.getNome() + "Está Guardando um Item\n");
	}
	
	public void usarItem() {
                super.usarItem();
		System.out.print("Cavaleiro" + Cavaleiro.super.getNome() + "Está Usando um Item\n");
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
