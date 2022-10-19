package Personagem;

import Interface.ComportamentoMagico;

public class Mago extends Personagem implements ComportamentoMagico {
	
	public Mago() {
		
	}
	
	public Mago(String nome) {
		super(nome);
	}

	@Override
	public void invisibilidade() {
		System.out.print("Mago" + Mago.super.getNome() + "Usa o feitiço de invisibilidade\n");
	}

	@Override
	public void ultraRapidez() {
		System.out.print("Mago" + Mago.super.getNome() + "Usa o feitiço UltraRapido\n");
	}
	
	public void andar() {
		super.andar();
	}
	
	public void guardarItem() {
		super.guardarItem();
		System.out.print("Mago" + Mago.super.getNome() + "Está Guardando um Item\n");
	}
	
	public void usarItem() {
		super.usarItem();
		System.out.print("Mago" + Mago.super.getNome() + "Está Usando um Item\n");
	}

}
