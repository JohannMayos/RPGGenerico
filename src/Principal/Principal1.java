package Principal;
import Jogo.Jogo;
import Personagem.Cavaleiro;
import Personagem.Dragao;
import Personagem.Mago;
import Personagem.Personagem;
import java.util.ArrayList;

public class Principal1 {
    public static void main(String args[]) {
        ArrayList<Personagem> Companies = new ArrayList<Personagem>();
        Jogo controller = new Jogo();
        Companies.add(new Cavaleiro("Julio"));
        Companies.add(new Cavaleiro("Johann"));
        Companies.add(new Mago("Gabe"));
        Companies.add(new Mago("Patolino"));
        Companies.add(new Dragao("José"));
        Companies.add(new Dragao("Jefferson"));
        
//      
        for(int i = 0; i < Companies.size(); i++){
            controller.ControlarAcoesPersonagens(Companies.get(i));
        }
 
    }
}
