package Personagem;

import Interface.ComportamentoFeroz;

public class Dragao extends Personagem implements ComportamentoFeroz{
	
	public Dragao() {
		
	}
	
	public Dragao(String nome) {
		super(nome);
	}

	@Override
	public void atirarFogo() {
		
	}

	@Override
	public void voar() {
		
	}

	@Override
	public void morder() {
		
	}
	
	public void andar() {
		super.andar();
	}
	
	public void guardarItem() {
		super.guardarItem();
		System.out.print("Dragao " + Dragao.super.getNome() + " Está Guardando um Item\n");
	}
	
	public void usarItem() {
		super.usarItem();
		System.out.print("Dragao " + Dragao.super.getNome() + " Está usando um Item\n");
	}

}
