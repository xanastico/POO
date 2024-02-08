package cinespot;


public class CineSpot {

    public static void main(String[] args) {


        while(true){    
        

        Filme f1 = new Filme();
        Sala s1 = new Sala();
        Sessao se1 = new Sessao();
        Bilheteira b1= new Bilheteira();
        SubMenu subMenu = new SubMenu();
        
        SubMenu.listafilmes = GuardarObj.lerFilmeObj();
        SubMenu.listasalas = GuardarObj.lerSalaObj();
        SubMenu.listasessoes = GuardarObj.lerSessaoObj();


        int opcao, opcao_cliente,opcao_admin,opcao_admin2f,opcao_admin2s,opcao_admin2se,opcao_admin2est;

        do {
            System.out.println("_____________________________________");
            System.out.println("------Bem vindo ao CineSpot----------");
            System.out.println("Escolha o modo de entrada: ");
            System.out.println("1) Cliente ");
            System.out.println("2) Admin ");
            System.out.println("0) Sair ");
            System.out.println("-------------------------------------");
            System.out.print("Escolha a sua opção: ");

            opcao = Ler.umInt();
            System.out.println("\n");
        } while (opcao < 0 || opcao > 2);

        switch (opcao) {
            case 1:
                do {
                    System.out.println("----------Menu----------");
                    System.out.println("1) Comprar Bilhetes");
                    System.out.println("2) Todas as Sessões");
                    System.out.println("3) Lista de Filmes");
                    System.out.println("4) Procurar Filme");
                    System.out.println("------------------------");
                    System.out.println("0) Sair");
                    System.out.println("------------------------");
                    System.out.print("Qual a sua opção: ");
                    opcao_cliente = Ler.umInt();
                    System.out.println("\n");
                } while (opcao_cliente < 0 || opcao_cliente > 4);
                switch (opcao_cliente) {
                    case 1:
                        b1.criarBilhete();
                        GuardarObj.guardarSessaoObj();
                        break;
                    case 2:
                        SubMenu.listarSessaoCliente();
                        
                        break;
                    case 3:
                        SubMenu.listarNFSessao();
                        break;
                    case 4 :
                        SubMenu.consultarFilme();
                        break;
                    case 0:
                        break;
                }
                break;

            case 2:


                    do{
                        
                            System.out.println("----------Menu Admin----------");
                            System.out.println("1)Parte dedicada aos Filmes");
                            System.out.println("2)Parte dedicada às Salas");
                            System.out.println("3)Parte dedicada às Sessões");
                            System.out.println("4)Parte dedicada às estatisticas");
                            System.out.println("0) Sair");
                            System.out.println("------------------------");
                            System.out.print("Qual a sua opção: ");
                            opcao_admin=Ler.umInt();
                            System.out.println("\n");
                    }while(opcao_admin < 0 || opcao_admin > 5);
                        switch(opcao_admin){
                            case 1:
                                 do {

                                        System.out.println("-------Menu Admin Filmes------");
                                        System.out.println("1) Criar Filme");
                                        System.out.println("2) Remover um Filme");
                                        System.out.println("3) Aletar um Filme");
                                        System.out.println("4) Consultar um Filme");
                                        System.out.println("5) Comparar 2 Filmes");
                                        System.out.println("6) Listar Filmes");
                                        System.out.println("_____________________");
                                        System.out.println("0) Sair");
                                        System.out.print("Qual a sua opção: ");
                                        opcao_admin2f=Ler.umInt();
                                        System.out.println("\n");
                                        }while(opcao_admin2f < 0 || opcao_admin2f > 6);
                                        switch(opcao_admin2f){
                                            case 1:
                                                Filme novoFilme = f1.criarFilme();
                                                SubMenu.inserirFilme(novoFilme);
                                                GuardarObj.guardarFilmeObj();
                                                break;
                                            case 2:
                                                SubMenu.removerFilme();
                                                GuardarObj.guardarFilmeObj();
                                                break;
                                            case 3:
                                                SubMenu.alterarFilme();
                                                GuardarObj.guardarFilmeObj();
                                                break;
                                            case 4:
                                                SubMenu.consultarFilme();
                                                GuardarObj.guardarFilmeObj();
                                                break;
                                            case 5:
                                                SubMenu.compFilmes();
                                                GuardarObj.guardarFilmeObj();
                                                break;
                                            case 6:
                                                SubMenu.listarFilmes();
                                                GuardarObj.guardarFilmeObj();
                                                break;
                                            case 0:
                                                break;
                                        }
                                break;
                                
                            case 2:
                                 do {

                                        System.out.println("-------Menu Admin Salas------");
                                        System.out.println("1) Criar Sala");
                                        System.out.println("2) Remover Sala");
                                        System.out.println("3) Aletar Sala");
                                        System.out.println("4) Consultar uma Sala");
                                        System.out.println("5) Comparar 2 Salas");
                                        System.out.println("6) Listar Salas");
                                        System.out.println("_____________________");
                                        System.out.println("0) Sair");
                                        System.out.print("Qual a sua opção: ");
                                        opcao_admin2s=Ler.umInt();
                                        System.out.println("\n");
                                        }while(opcao_admin2s < 0 || opcao_admin2s > 6);
                                        switch(opcao_admin2s){
                                            case 1:
                                                Sala novaSala = s1.criarSala();
                                                SubMenu.inserirSala(novaSala);
                                                GuardarObj.guardarSalaObj();
                                                break;
                                            case 2:
                                                SubMenu.removerSala();
                                                GuardarObj.guardarSalaObj();
                                                break;
                                            case 3:
                                                SubMenu.alterarSala();
                                                GuardarObj.guardarSalaObj();
                                                break;
                                            case 4:
                                                SubMenu.consultarSala();
                                                GuardarObj.guardarSalaObj();
                                                break;
                                            case 5:
                                                SubMenu.compSala();
                                                GuardarObj.guardarSalaObj();
                                                break;
                                            case 6:
                                                SubMenu.listarSala();
                                                GuardarObj.guardarSalaObj();
                                                break;
                                            case 0:
                                                break;
                                        }
                                break;
                                        
                            case 3:
                                 do {

                                        System.out.println("-------Menu Admin Sessao------");
                                        System.out.println("1) Criar Sessao");
                                        System.out.println("2) Remover Sessao");
                                        System.out.println("3) Aletar Sessao");
                                        System.out.println("4) Consultar uma Sessao");
                                        System.out.println("5) Comparar 2 Sessões");
                                        System.out.println("6) Listar Sesões");
                                        System.out.println("_____________________");
                                        System.out.println("0) Sair");
                                        opcao_admin2se=Ler.umInt();
                                        System.out.println("\n");
                                        }while(opcao_admin2se < 0 || opcao_admin2se > 6);
                                        switch(opcao_admin2se){
//                                            
                                            //ainda falta fazer isto
                                            case 1:
                                                Sessao novaSessao= se1.criarSessao();
                                                SubMenu.inserirSessao(novaSessao);
                                                GuardarObj.guardarSessaoObj();
                                                break;
                                            case 2:
                                                SubMenu.removerSessao();
                                                GuardarObj.guardarSessaoObj();
                                                break;
                                            case 3:
                                                
                                            case 4:
                                                SubMenu.consultarSessao();
                                                GuardarObj.guardarSessaoObj();
                                                break;
                                            case 5:
                                                SubMenu.compSessao();
                                                GuardarObj.guardarSessaoObj();
                                                break;
                                            case 6:
                                                SubMenu.listarSessao();
                                                GuardarObj.guardarSessaoObj();
                                                break;
                                            case 0:
                                                break;
                                        }
                            break;
                                        
                            case 4:
                            
                                do {

                                        System.out.println("-------Menu Admin Estatísticas------");
                                        System.out.println("1) Numero de Bilhetes vendidos por Sessão");
                                        System.out.println("2) Numero Total de bilhetes Vendidos");
                                        System.out.println("3) Filme(s) com mais Bilhetes vendidos ");
                                        System.out.println("4) Numero total de Sessões");
                                        System.out.println("_____________________");
                                        System.out.println("0) Sair");
                                        System.out.print("Qual a sua opção: ");
                                        opcao_admin2est=Ler.umInt();
                                        System.out.println("\n");
                                        }while(opcao_admin2est < 0 || opcao_admin2est > 5);
                                        switch(opcao_admin2est){
                                           case 1:
                                                SubMenu.listarBilhetesEst();
                                                break;
                                           case 2:
                                               SubMenu.totalBilhetesEst();
                                               break;
                                           case 3:
                                               SubMenu.filmesMaisVendidosEst();
                                               break;
                                           case 4:
                                               SubMenu.totalSessoesEst();
                                               break;
                                           case 0:
                                               break;
                                        
                                        }
                                break;
                            
                        }break;
          
       case 0:
           GuardarObj.guardarFilmeObj();
           GuardarObj.guardarSalaObj();
           GuardarObj.guardarSessaoObj();
           System.exit(0);
        } 
        
        }
    }
}
