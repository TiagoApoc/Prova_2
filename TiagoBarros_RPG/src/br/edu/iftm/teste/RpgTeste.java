package br.edu.iftm.teste;

import br.edu.iftm.rpg.Inimigo;
import br.edu.iftm.rpg.Jogador;
import br.edu.iftm.rpg.Luta;

public class RpgTeste {
        
    public static void main(String[] args) throws Exception {
      
        Jogador player1 = new Jogador();
        Inimigo enemy1 = new Inimigo ();
        Luta lutar = new Luta();
        
        lutar.lutar(player1, enemy1);
        
      }
}