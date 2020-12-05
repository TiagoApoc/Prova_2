package br.edu.iftm.rpg;

public class Inimigo {
    private  String nome;
    private  int vida;
    private  int dano;
    

    //Metodo conostrutor  
    public Inimigo() {
        this.nome = "Durotan";
        this.vida = 100;
        this.dano = 50;

    } 
    
    //Metodos especificos
    
    public void atacar(Jogador jogador) {
   
       System.out.format("%s atacou o %s\n", nome, jogador.getNome());
       
   }
    
    public void perderVida(Jogador jogador) {
    
        System.out.format ("O inimigo %s perdeu %d pontos de vida \n", nome, jogador.getDano());
        vida = vida - jogador.getDano();
        if (vida <= 0 ){
            System.out.format("O %s morreu\n", nome);
        }
    }
    
    //Metodos getters and setters
    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
    public int getDano(){
        return dano;
    }
    
       
}
