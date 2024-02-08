
package cinespot;

import java.io.*;

public class Bilheteira implements Serializable {
    
    private int sessao;
    static private int limite;
    private int vendidos;

    public Bilheteira(){
        vendidos=0;
    }

    public Bilheteira(int sessao) {
        this.sessao = sessao;

    }
    
//Getters/Setters------------------------------

    public int getSessao() {
        return sessao;
    }

    public void setSessao(int Sessao) {
        this.sessao = sessao;
    }

    public int getVendidos() {
        return vendidos;
    }

    public void setVendidos(int vendidos) {
        this.vendidos = vendidos;
    }


    
 //métodos------------------------------------
    
    
    
    @Override
    public String toString(){
        return "Bilheteira'{' vendidos=" + vendidos + '}';
    }

    public void compraBilhete(int bilhetes) {
        while(bilhetes != 0){
            vendidos++;
            bilhetes--;
        }
    }
    
   public void  criarBilhete(){
       System.out.println("Insira o numero da Sessão que quer assistir:");
       System.out.println("______________________");
       SubMenu.listarSessao();
       System.out.println("______________________");
          int idSessao_bi=-1;
          int nSala_bi;
          int nLugares_bi=0;
           boolean enc=false;  
           Bilheteira bi_bi =new Bilheteira ();
          do{
            System.out.println("\nIntroduza o numero da Sessão:");
            idSessao_bi=Ler.umInt();            
            
            for(int i=0; SubMenu.listasessoes.size()>i;i++){
                if(idSessao_bi == SubMenu.listasessoes.get(i).getIdSessao()){
                    enc=true;
                    
                   nSala_bi=SubMenu.listasessoes.get(i).getSala();
                   nLugares_bi = Sala.totalLugares(nSala_bi);
                   bi_bi=SubMenu.listasessoes.get(i).getBilheteira();
                   break;               
                }
            }     
                if(enc==false){
                    System.out.println("Não existe ess Sessão!");
                }
            
            }while(enc==false);
          
          
          
          int nBilhetes_bi;
          System.out.println("Quantos Bilhetes quer comprar:");
          nBilhetes_bi=Ler.umInt();
          
          if( nBilhetes_bi + bi_bi.getVendidos() < nLugares_bi){
              bi_bi.compraBilhete(nBilhetes_bi);
        }else{
              System.out.println("Numero Excedido, não há esse numero de bilhetes disponivel para esta sessão!");
          }
          
          for (int i = 0; i < SubMenu.listasessoes.size() ; i++) {
            if(SubMenu.listasessoes.get(i).getIdSessao()==idSessao_bi){
                 SubMenu.listasessoes.get(i).setBi(bi_bi);
               
            }
   }

   } 
}
