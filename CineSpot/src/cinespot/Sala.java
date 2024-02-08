
package cinespot;

import java.io.Serializable;
/**
 *
 * @author User
 */
public class Sala implements Serializable{

    private int nSala;
    private int totalLugares;
    
    public Sala (){}
    
    public Sala(int sSala,int totalLugares){
        this.nSala=sSala;
        this.totalLugares=totalLugares;
    }

    //--------------Getters/Setters-----------------
    
    public int getNSala(){
        return this.nSala;
    }
    public int getTotalLugares(){
        return this.totalLugares;
    }

    
    public void setNSala(int nSala){
        this.nSala=nSala;
    }
    public void setTotalLugares(int totalLugares){
        this.totalLugares= totalLugares;
    }
    //------------------------------------------------
    
    //--------------------outros metodos--------------------
    
    public static int totalLugares (int id_se){
        for (int i = 0; i < SubMenu.listasalas.size() ; i++) {
            if(SubMenu.listasalas.get(i).getNSala()==id_se){
                return SubMenu.listasalas.get(i).getTotalLugares() ;
               
            }
        }
        return 0;
    }
    
    
    public String toString(){
        String s=("Sala "+nSala+"\nNumero de Lugares:"+totalLugares+"\n");
        return s;                                   
    }

    public Sala criarSala(){
        
        
        System.out.println("Intruduza o número da sala:");
        int nSala_s=Ler.umInt();
        
        System.out.println("Introduza o número de lugares");
        int totalLugares_s=Ler.umInt();
        
        Sala s1= new Sala(nSala_s,totalLugares_s);
    
        
        
        System.out.println("///////////////////////");
        System.out.println(s1.toString());
        System.out.println("Sala Criada com sucesso!");
        
        return s1;
    }
        
}
