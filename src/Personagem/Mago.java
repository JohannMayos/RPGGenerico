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
		
	}

	@Override
	public void ultraRapidez() {
		
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

}
