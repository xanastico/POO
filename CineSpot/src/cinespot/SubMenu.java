
package cinespot;

/**
 *
 * @author Utilizador
 */
import java.io.Serializable;
import java.util.*;
import java.util.Scanner;


public class SubMenu {
    
    public static ArrayList<Filme> listafilmes = new ArrayList <Filme>();
    public static ArrayList<Sala> listasalas = new ArrayList <Sala>();
    public static ArrayList<Sessao> listasessoes = new ArrayList <Sessao>();

//FILME------------------------------------------------------------------------------
    
    //inserir um filme...........
    public static void inserirFilme(Filme f){
        
        boolean b = listafilmes.add(f);
        if(b){
            System.out.println("Inserido com Sucesso !\n");
        }else{
            System.out.println("Erro a criar o ficheiro\n");
        }
        
    }
    
    //remover um filme..........
    public static void removerFilme(){
        System.out.println("\nQual é o nome do Filme que quer remover: \n ");
        String nome_filme= Ler.umaString();
        int enc=-1;
        for(int i=0; i< listafilmes.size(); i++){
            if(nome_filme.equals(listafilmes.get(i).getNome())){
              enc=i;
              break;
            }
        }
        if(enc !=-1 && enc>=0){
            listafilmes.remove(enc);
            System.out.println("\nFilme removido com sucesso!\n");
        }
        else{
            System.out.println("\nFilme não removido ou inexistente\n");
        }
    }
    
    //Consultar filme
    
    public static void consultarFilme (){
    
        System.out.println("\nQual é o Filme que deseja consultar :\n");
        String nomeFilme= Ler.umaString();
        boolean enc= false;
        for(int i=0; listafilmes.size()> i; i++){
            if(nomeFilme.equals(listafilmes.get(i).getNome())){
                System.out.println("\nFilme encontrado com sucesso! :\n");
                System.out.println(listafilmes.get(i).toString());
                enc=true;
                break;
            }
        }if (enc == false){
            System.out.println("\nFilme Não encontrado! \n");
        }
    }
    //Alterar um Filme
    public static void alterarFilme() {
        int opc;
        int num=-1;
        
        do{
            System.out.println("Alterar o parâmetro: ");
            System.out.println("1)Nome do Filme:");
            System.out.println("2)Tipo de Filme:");
            System.out.println("3)Faixa etária do Filme:");
            System.out.println("4)Duração do Filme:");
            System.out.println("5)Lançamento do Filme:");
            System.out.println("6)Relalizador(es) do Filme:");
            System.out.println("7)Atores do Filme:");
            System.out.println("8)Sinopse do Filme:");
            opc=Ler.umInt();
        }while(opc<1 || opc>8);
        
        System.out.println("Qual o nome do Filme que pretende alterar:");
        String nome_filme=Ler.umaString();
        
        for(int i=0; i<listafilmes.size(); i++){
            if(nome_filme.equals(listafilmes.get(i).getNome())){
                num=i;
                break;
            }
        }
        if(num == -1){
            System.out.println("Filme não encontrado!\n");
        }
        else{
            switch(opc){
                case 1:
                    System.out.println("Insira o novo nome do Filme");
                    String novo_filme=Ler.umaString();
                    listafilmes.get(num).setNome(novo_filme);
                    break;
                case 2:
                    System.out.println("Insira o novo tipo do Filme:");
                    String novo_tipo=Ler.umaString();
                    listafilmes.get(num).setTipo(novo_tipo);
                    break;
                case 3:
                    System.out.println("Insira a nova faixa etária do Filme");
                    String nova_fetaria= Ler.umaString();
                    listafilmes.get(num).setFaixaEtaria(nova_fetaria);
                    break;
                case 4:
                    System.out.println("Insira a nova duração do Filme");
                    int nova_duracao=Ler.umInt();
                    listafilmes.get(num).setDuracao(nova_duracao);
                    break;
                case 5:
                    System.out.println("Insira o novo ano do Filme");
                    int novo_ano=Ler.umInt();
                    listafilmes.get(num).setLancamento(novo_ano);
                    break;
                case 6:
                    System.out.println("Insira o(s) novo(s) realizador(es) do Filme");
                    String novo_realizador=Ler.umaString();
                    listafilmes.get(num).setRealizador(novo_realizador);
                    break;
                case 7:
                    System.out.println("Insir os novos atores do Filme");
                    String novo_atores=Ler.umaString();
                    listafilmes.get(num).setAtores(novo_atores);
                    break;
                case 8:
                    System.out.println("Insira a nova sinopse do Filme");
                    String nova_sinopse=Ler.umaString();
                    listafilmes.get(num).setSinopse(nova_sinopse);
                    break;        
            }
            
        }
        
    }
    
        //Listar todos os Filmes.............
    public static void listarFilmes(){
        for(int i=0; i< listafilmes.size(); i++){
            System.out.println(listafilmes.get(i).toString());
        }
    }
     public static void listarNomesFilmes(){//apenas pelo nome
        for(int i=0; i< listafilmes.size(); i++){
            System.out.println(listafilmes.get(i).getNome());
        }
    }
    
    // comparar dois filmes e verifica se são iguais 
    
    public static void compFilmes(){
        System.out.println("Introduza o nome do 1º Filme:");
        String idF1=Ler.umaString();
        int enc=-1;
        for(int i=0; i< listafilmes.size(); i++){
            if(idF1.equals(listafilmes.get(i).getNome())){
                enc=i;
            }
        }
        System.out.println("Introduza o nome do 1º Filme:");
        String idF2=Ler.umaString();
        int enc1=-1;
        for(int i=0; i< listafilmes.size(); i++){
            if(idF2.equals(listafilmes.get(i).getNome())){
                enc1=i;
            }
        }
        if((enc!= -1 && enc >=0)&&(enc1!= -1 && enc1 >=0)){
            boolean b=listafilmes.get(enc).equals(listafilmes.get(enc1));
            if(b){
                System.out.println("Filmes iguais");
            }else{
                System.out.println("Filmes Diferentes");            }
        }else{
            System.out.println("Filmes não encontrados");
        }
        
    }
    
    
//SALAS-------------------------------------------------------------------------
    
    
    //inserir uma Sala...........
    public static void inserirSala (Sala s){

       boolean b= listasalas.add(s);
       if(b){
            System.out.println("\nSala Inserida com sucesso! \n");     
      }else{
            System.out.println("\nErro ao inserir a Sala!\n");
       }
    }
        
    //remover uma Sala..........
    public static void removerSala(){
        System.out.println("\nQual é o numero da Sala que quer remover: \n ");
        int n_sala = Ler.umInt();
        int enc=-1;
        for(int i=0; i< listasalas.size(); i++){
            if(n_sala == listasalas.get(i).getNSala()){
              enc=i;
              break;
            }
        }
        if(enc !=-1 && enc>=0){
            listasalas.remove(enc);
            System.out.println("\nSala removida com sucesso!\n");
        }
        else{
            System.out.println("\nSala não removida ou inexistente\n");
        }
    }
    
     public static void consultarSala(){//consultar uma Sala
        System.out.println("Qual o numero da Sala que quer consultar?");
        int n_sala = Ler.umInt();
        boolean enc = false;
        for (int i = 0; i < listasalas.size() ; i++) {
            if(n_sala == listasalas.get(i).getNSala()){
                System.out.println("\nSala encontrada com sucesso\n");
                System.out.println(listasalas.get(i).toString());
                enc = true;
                break;
            }
        }
        if (enc==false){
            System.out.println("\nSala não encontrada\n");
        }
    }
     
     //alterar Sala 
     
     public static void alterarSala(){
         int opc;
         int num= -1;
         do{
             System.out.println("Aletar Sala");
             System.out.println("______________");
             System.out.println("1)Numero da Sala");
             System.out.println("2)Numero de lugares da Sala");
             opc=Ler.umInt();
         }while(opc<0 ||opc>2);
         
         System.out.println("Qual é o Numero da sala que pretende aletrar:");
         int n=Ler.umInt();
         
         for(int i=0; i<listasalas.size();i++){
             if(n==listasalas.get(i).getNSala()){
                 n=i;
                 break;
             }
         }
         if(num==-1){
             System.out.println("\nSala não encontrada!");
         }else{
             switch(opc){
                 case 1:
                     System.out.println("Introduza o novo numero da Sala:");
                     int novo_n=Ler.umInt();
                     listasalas.get(num).setNSala(novo_n);
                     break;
                 case 2:
                     System.out.println("Introduza o novo numero de lugares da Sala:");
                     int novo_nLugares=Ler.umInt();
                     listasalas.get(num).setTotalLugares(novo_nLugares);
                     break;
             }
         }     
     }
     
    
    //lista todas as Salas criadas 
        public static void listarSala(){
        for (int i = 0; i < listasalas.size() ; i++) {
            System.out.println(listasalas.get(i).toString());
        }
    }
    
    // comparar salas 
        public static void compSala(){
            System.out.println("Intruduza o numero da 1ª Sala:");
            int n1=Ler.umInt();
            int enc=-1;
            for(int i=0; i<listasalas.size(); i++){
                if(n1== listasalas.get(i).getNSala()){
                    enc=i;
                }
            }
            System.out.println("Intruduza o numero da 2ª Sala:");
            int n2=Ler.umInt();
            int enc1=-1;
            for(int i=0; i<listasalas.size(); i++){
                if(n2== listasalas.get(i).getNSala()){
                    enc1=i;
                }
            }
            if ((enc1 != -1 && enc1 >= 0)&&(enc != -1 && enc >= 0)){
            boolean b = listasalas.get(enc).equals(listasalas.get(enc1)) ;
            if (b){
                System.out.println("\nSalas Iguais\n");
            }
            else {
                System.out.println("\nSalas Diferentes\n");
            }
        }
        else {
            System.out.println("\nSalas não encontradas\n");
        }
     }
    
        
   //-----------------------------------Sessões-----------------------------------------------
      
    public static void inserirSessao (Sessao se){//inserir uma Sessao
       boolean b= listasessoes.add(se);
       if(b){
            System.out.println("\nSessão Inserida com sucesso! \n");     
      }else{
            System.out.println("\nErro ao inserir a Sessão!\n");
       }
    }
    
    public static void removerSessao(){//remover uma Sessao
        System.out.println("Qual é o Numero da Sessão que quer remover:");
        int n = Ler.umInt();
        int enc = -1;
        for (int i = 0; i < listasessoes.size() ; i++) {
            if (n == listasessoes.get(i).getIdSessao()){
                enc = i;
                break;
            }
        }
        if(enc != -1 && enc >= 0){
            listasessoes.remove(enc);
            System.out.println("\nSessão removida com sucesso\n");
        }
        else{
            System.out.println("\nSessão não removida ou inexistente\n");
        }
    }
    
    public static void consultarSessao(){//consultar uma sessao
        System.out.println("Qual o Numero da Sessão que quer consultar:");
        int n = Ler.umInt();
        boolean enc = false;
        for (int i = 0; i < listasessoes.size() ; i++) {
            if(n == listasessoes.get(i).getIdSessao()){
                System.out.println("\nSessão encontrada com sucesso\n");
                System.out.println(listasessoes.get(i).toString());
                enc = true;
                break;
            }
        }
        if (enc==false){
            System.out.println("\nSessão não encontrada\n");
        }
    }
    
    public static void listarSessaoCliente(){//lista todos os produtos registados
        System.out.println("Sessões Disponiveis: \n");
        for (int i = 0; i < listasessoes.size() ; i++) {
            System.out.println(listasessoes.get(i).toString());
        }
    }
    public static void listarSessao(){
         for (int i = 0; i < listasessoes.size() ; i++) {
            System.out.println(listasessoes.get(i).toString1());
        }
    }
    
    public static void listarNFSessao(){//apenas pelo nome
        System.out.println("Filmes Disponiveis: \n");
        for(int i=0; i< listasessoes.size(); i++){
            System.out.println(listasessoes.get(i).getFilme());
        }
    }
    

    public static void compSessao(){//compara sessoes e verifica se sao iguais
        System.out.println("Qual o ID da Sessão nº1? ");
        int n1 = Ler.umInt();
        int enc = -1;
        for (int i = 0; i < listasessoes.size(); i++) {
            if (n1 == listasessoes.get(i).getIdSessao()){
                enc = i;
            }
        }
        System.out.println("Qual o ID do Produto nº2? ");
        int n2 = Ler.umInt();
        int enc1 = -1;
        for (int i = 0; i < listasessoes.size(); i++) {
            if (n2 == listasessoes.get(i).getIdSessao()){
                enc1 = i;
            }
        }
        if ((enc1 != -1 && enc1 >= 0)&&(enc != -1 && enc >= 0)){
            boolean b = listasessoes.get(enc).equals(listasessoes.get(enc1)) ;
            if (b){
                System.out.println("\nSessões Iguais\n");
            }
            else {
                System.out.println("\nSessões Diferentes\n");
            }
        }
        else {
            System.out.println("\nSessões não encontradas\n");
        }

    }

    public static void  alterarSessao(){
       int opc;
       int num=-1;
       do{
           System.out.println("Alterar Sessão");
           System.out.println("_______________");
           System.out.println("1)A Data");
           System.out.println("2)A Hora");
           opc=Ler.umInt();
       }while(opc <0 || opc>5);
       
        System.out.println("Qual o Numero da Sessão que quer alterar:");
        int n=Ler.umInt();
        
        for(int i=0; i<listasessoes.size(); i++){
            if(n==listasessoes.get(i).getIdSessao()){
                n=i;
                break;
            }
        }if(num==-1){
            System.out.println("\nSessão não encontrada!");
            
        }else{
            switch(opc){
                case 1:
                    System.out.println("Introduza a nova data para a Sessão:(intruduza dd/mm/aaaa)");
                    String novaData_se=Ler.umaString();
                    listasessoes.get(num).setData(novaData_se);
                    break;
                   
                case 2:
                    System.out.println("Introduza a nova hora para a Sessão:(introduza 00:00)");
                    String NovaHora_se=Ler.umaString();
                    listasessoes.get(num).setHoras(NovaHora_se);
                    break;
                
            }
        }
    }

//---------------------Estatisticas-------------
    
    public static void listarBilhetesEst(){
        for (int i = 0; i < listasessoes.size() ; i++) {
            
                 System.out.println("Sessão:"+listasessoes.get(i).getIdSessao()+"\nBilhetes Vendidos:"+listasessoes.get(i).getBilheteira().getVendidos());
               
        }       
    }
    
        public static void totalBilhetesEst(){
            
            int aux=0;
            for (int i = 0; i < listasessoes.size() ; i++) {
                     aux=aux+listasessoes.get(i).getBilheteira().getVendidos();

            }
            System.out.println("Total de Bilhetes vendidos:"+aux);
        }
        
        public static void filmesMaisVendidosEst(){
            
            
            int aux=0;
            for (int i = 0; i <listasessoes.size() ; i++) {
                if(aux < listasessoes.get(i).getBilheteira().getVendidos()){
                    aux=listasessoes.get(i).getBilheteira().getVendidos();
                }

            }
            System.out.println("Filme(s) mais vendidos:\n");
            
            for (int i = 0; i <listasessoes.size() ; i++) {
                if(aux==listasessoes.get(i).getBilheteira().getVendidos()){
                    System.out.println(listasessoes.get(i).getFilme());
                }
            }
          
        }
        
        public static void totalSessoesEst(){
            int total=listasessoes.size();
            System.out.println("Existem "+total+" Sessões \n");
        }
        
    
}
