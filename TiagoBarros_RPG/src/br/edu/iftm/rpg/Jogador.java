package br.edu.iftm.rpg;

public class Jogador {
    private  String nome;
    private  int vida;
    private  int dano;
   
    //Metodo construtor
    public Jogador() {
        this.nome = "Lothar";
        this.vida = 100;
        this.dano = 50;

    }
      //Metodos especificos
    public void atacar(Inimigo inimigo){
                
        System.out.format("%s atacou o %s\n",nome, inimigo.getNome());
       
    }

    public void perderVida(Inimigo inimigo){
        
        System.out.format ("O jogador %s perdeu %d pontos de vida \n", nome, inimigo.getDano());
        vida = vida - inimigo.getDano();
        if (vida <= 0 ){
            System.out.format("O %s morreu \n", getNome());
        }
        
    }
      

    //Métodos Getters e Setters.
    public String getNome() {
        return nome;
    }

    
    public int getDano(){
        return dano;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDano(int dano){
        this.dano = dano;
    }

	
	
	

}
