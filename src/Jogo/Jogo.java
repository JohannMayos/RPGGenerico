package Jogo;

import Personagem.Personagem;

public class Jogo {
    
    public void ControlarAcoesPersonagens(Personagem... personagens){
        for(Personagem personagem : personagens){
            personagem.andar();
            personagem.guardarItem();
            personagem.usarItem();
        }
    }
    
}
