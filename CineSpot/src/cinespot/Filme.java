
package cinespot;

import java.io.Serializable;
import java.util.*;


/**
 *
 * @author User
 */
public class Filme implements Serializable{
    
    private String nome;
    private String genero;
    private String tipo;
    private String faixaEtaria;
    private int duracao;
    private int lancamento;
    private String realizador;
    private String atores;
    private String sinopse;
//    public static int ultimo;

    
    
    public Filme(String nome,String genero, String tipo,String faixaEtaria, int duracao, int lancamento,String realizador, String atores, String sinopse){
        this.nome=nome;
        this.genero=genero;
        this.tipo=tipo;
        this.faixaEtaria=faixaEtaria;
        this.duracao=duracao;
        this.lancamento=lancamento;
        this.realizador=realizador;
        this.atores=atores;
        this.sinopse=sinopse;
        
    }
   
    public Filme(){

    }
    
    
    
    //----------Getters/Setters------------------------
        
    public String getNome(){
        return this.nome;
    }       
    public String getGenero(){
        return this.genero;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getFaixaEtaria(){
        return this.faixaEtaria;
    }
    public int getDuracao(){
        return this.duracao;
    }
    public int getLancamento(){
        return this.lancamento;
    }
    public String getRealizador(){
        return this.realizador;
    }
    public String getAtores() {
        return this.atores;
    }
    public String getSinopse(){
        return this.sinopse;
}
    
    
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setFaixaEtaria(String faixaEtaria){
        this.faixaEtaria=faixaEtaria;
    }
    public void setDuracao(int duracao){
        this.duracao=duracao;
    }
    public void setLancamento(int lancamento){
        this.lancamento=lancamento;
    }
    public void setRealizador(String realizador){
        this.realizador= realizador;
    }
    public void setAtores(String atores){
         this.atores = atores;
    }
        
    public void setSinopse(String sinopse){
        this.sinopse=sinopse;
    }
    
    //---------------------------------------------------
    
    //------------outros metodos-----------------------

    
    @Override
    public String toString(){
        return "Filme: "+nome+"\nGenero de Filme: "+genero+"\nFilme em:  "+tipo+"\n"+faixaEtaria+"\nDuração: "+duracao+"min"+"\nLançado em: "+lancamento+"\nRealizador(es): "+realizador+"\nAtores: "+atores+"\nSinopse: "+sinopse+"\n";
       
    }

 
       public boolean equals (Object o){
           if(o != null && this.getClass() == o.getClass()){
               Filme f=(Filme) o;
               return 
                       f.nome.equals(this.nome) &&
                       f.genero.equals(this.genero) &&
                       f.faixaEtaria.equals(this.faixaEtaria) &&
                       f.duracao == this.duracao &&
                       f.lancamento == this.lancamento &&
                       f.realizador.equals(this.realizador) &&
                       f.atores.equals(this.atores) &&
                       f.sinopse.equals(this.sinopse);                           
           }
           return false;
       }
    
       public Filme criarFilme() {
           String nome_f;
           do{
               System.out.println("\nIntroduza o nome do Filme:\n");
               nome_f = Ler.umaString();
           }while(nome_f.equals(""));
           
           String genero_f;
           do{
               System.out.println("\nIntroduza o genero do Filme:\n");
               genero_f=Ler.umaString();
           }while(genero_f.equals(""));
           
           String tipo_f;
           do{
               System.out.println("\nIntroduza de que tipo é o Filme: (escreva uma das opções: 2D / 3D)\n");
               tipo_f=Ler.umaString().toUpperCase();
               if(tipo_f.equals("2D") || tipo_f.equals("3D")){
               }else{
                   tipo_f="";
               }
           }while(tipo_f.equals(""));
           
           String faixaetaria_f;
           do{
               System.out.println("\nIntroduza afaixa etária do Filme(escreva uma das opções: T, M/12, M/16, M/18)\n");
               faixaetaria_f=Ler.umaString().toUpperCase();
               if(faixaetaria_f.equals("T") || faixaetaria_f.equals("M/12" )|| faixaetaria_f.equals("M/16")|| faixaetaria_f.endsWith("M/18")){
               }else{
                   faixaetaria_f = "";
               }
           }while(faixaetaria_f.equals(""));
           
           System.out.println("\nIntroduza a duração do Filme em minutos:\n");
           int duracao_f=Ler.umInt();
           
           System.out.println("\nIntroduza o ano de lançamento do Filme:\n");
           int laçamento_f=Ler.umInt();
           
           String realizador_f;
           do{
               System.out.println("\nIntroduza o realizador(es) do Filme: \n");
               realizador_f=Ler.umaString();
           }while(realizador_f.equals(""));
           
           String atores_f;
           do{
               System.out.println("\nIntroduza os atores do Filme: \n");
               atores_f=Ler.umaString();
           }while(atores_f.equals(""));
           
           String sinopse_f;
           do{
               System.out.println("\nIntroduza a sinopse do Filme: \n");
               sinopse_f=Ler.umaString();
           }while(sinopse_f.equals(""));
           
           Filme f1;
           f1= new Filme(nome_f,genero_f,tipo_f,faixaetaria_f,duracao_f,laçamento_f,realizador_f,atores_f, sinopse_f);
  

           System.out.println(f1.toString());
           System.out.println("Filme criado com sucesso!\n");
       
           return f1;
       }
  
}
