
package cinespot;

import java.util.*;
import java.io.Serializable;

public class Sessao implements Serializable {
    
    private int idSessao;
    private String filme;
    private int sala;
    private String data;
    private String horas;
    private Bilheteira bi;
    
    
    
    public Sessao(){
    }
    
    public Sessao(int idSessao,String filme,int sala,String data,String horas,Bilheteira bi ){
        this.idSessao=idSessao;
        this.filme=filme;
        this.sala=sala;
        this.data=data;
        this.horas=horas;
        this.bi=bi;
    }
    

//-------getters e setters---------

  public int getIdSessao() {
        return idSessao;
    }
    
    public void setIdSessao(int idSessao) {
        this.idSessao = idSessao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public Bilheteira getBilheteira(){
        return bi;
    }

    public void setBi(Bilheteira bi) {
        this.bi = bi;
    }
    
    


//----------metodos--------

    @Override
    public String toString() {
        return "Sessao{ Numero de Sessao: " + idSessao + ", filme: " + filme + ", sala: " + sala + ", data: " + data + ", horas:" + horas +"'}'\n";
    }

    public String toString1() {
        return "Sessao{ Numero de Sessao:" + idSessao + ", filme: " + filme + ", sala: " + sala + ", data: " + data + ", horas: " + horas +" "+bi.toString()+"'}'\n ";
    }
  
    
    public Sessao criarSessao(){
        
        int idSessao_se=-1;
            do{
            System.out.println("\nIntroduza o numero da Sessão:");
            idSessao_se=Ler.umInt();            
            boolean enc=false;
            for(int i=0; SubMenu.listasessoes.size()>i;i++){
                if(idSessao_se == SubMenu.listasessoes.get(i).getIdSessao()){
                    enc=true;
                    idSessao_se=-1;
                     
                    System.out.println("Já exite uma Sessão com o mesmo numero!");
                    break;
                }
            }        
            
            
            }while(idSessao_se==-1);
        
        String nomef_se="";
        
        
       
        do{
            System.out.println("\nEscreva o Nome do Filme que quer adicionar a sessão:");
            System.out.println("_______Lista de Filmes existentes____________");
            SubMenu.listarNomesFilmes();
            System.out.println("______________________________________________");
           
        
            nomef_se=Ler.umaString();
            boolean enc1=false;
            for(int i=0; SubMenu.listafilmes.size()>i; i++){
                if(nomef_se.equals(SubMenu.listafilmes.get(i).getNome())){
                    System.out.println("Filme encontrado");  
                    enc1=true;
                    break;
                }
            }if (enc1 == false){
                    System.out.println("Não existe esse filme");
                    nomef_se="";
                }
           }while(nomef_se.equals(""));
           
        
        int numeroS_se;
        do{ 
            System.out.println("\nEscreva o numero da Sala que quer adicionar a sessão:");
            System.out.println("_______Lista de Salas existentes____________");
            SubMenu.listarSala();
            System.out.println("______________________________________________");
            
            numeroS_se=Ler.umInt();
            boolean enc2=false;
            for(int i=0; SubMenu.listasalas.size()>i; i++){
                if(numeroS_se == SubMenu.listasalas.get(i).getNSala()){
                    System.out.println("sala encontrado");           
                    enc2=true;
                    break;
                }}
                if(enc2==false){  
                    System.out.println("Sala não encontrada!");
                    numeroS_se=-1;
                }
        }while(numeroS_se==-1);    

        String data_se;
        
            do {
                System.out.println("Introduza a data para a Sessão (introduza: dd/mm/aaaa)");
                data_se = Ler.umaString();
            }while(data_se.equals(""));
        
        String hora_se;
        
            do {
                System.out.println("Introduza a hora para a Sessão (introduza: 00:00)");
                hora_se = Ler.umaString();
            }while(data_se.equals(""));
           

         
        Bilheteira bi_se= new Bilheteira ();    
        Sessao se1= new Sessao(idSessao_se, nomef_se,numeroS_se,data_se,hora_se,bi_se);   
         
         return se1;
    }
    
   


}
