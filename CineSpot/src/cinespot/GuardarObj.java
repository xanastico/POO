
package cinespot;


import java.io.*;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Utilizador
 */
public class GuardarObj {
    
    
    //Filmes (Guardar e Ler o ficheiro onde se encontram os Filmes)
    
    public static void guardarFilmeObj(){
        
        try{
        FileOutputStream fileOutputStream = new FileOutputStream("filmes.dat");
        ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
        output.writeObject(SubMenu.listafilmes);
        output.close();
        fileOutputStream.flush();
        fileOutputStream.close();
        
        }catch (FileNotFoundException e){
            e.printStackTrace();
         
        }catch(IOException e){
            e.printStackTrace();
        }  
    }
    
    public static ArrayList<Filme> lerFilmeObj(){
        ArrayList<Filme> f1= null;
        try {
            FileInputStream fileInputStream = new FileInputStream("filmes.dat");
            if (fileInputStream == null){
                return null;
            }
            ObjectInputStream input = new ObjectInputStream(fileInputStream);
            f1 = (ArrayList<Filme>) input.readObject();
            input.close();
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return f1;
    }
    
//        public static void guardarUltimoFilme(){//Guarda o valor do ultimo Filme no objecto
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("ultimofilme.dat");
//            ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
//            output.writeObject(Filme.ultimo);
//            output.close();
//            fileOutputStream.flush();
//            fileOutputStream.close();
//
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//           public static int lerUltimoFilme (){//Le o valor do ultimo Filme a partir do objecto
//        int ult = -1;
//        try {
//            FileInputStream fileInputStream = new FileInputStream("ultimofilme.dat");
//            if (fileInputStream == null){
//                return -1;
//            }
//            ObjectInputStream input = new ObjectInputStream(fileInputStream);
//            ult = (int) input.readObject();
//            input.close();
//        }catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        } catch (IOException | ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//        return ult;
//    }
//    
    
    
    
    
    

    //Salas
    
    public static void guardarSalaObj(){
        
        try{
        FileOutputStream fileOutputStream = new FileOutputStream("salas.dat");
        ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
        output.writeObject(SubMenu.listasalas);
        output.close();
        fileOutputStream.flush();
        fileOutputStream.close();
        
        }catch (FileNotFoundException e){
            e.printStackTrace();
         
        }catch(IOException e){
            e.printStackTrace();
        }  
    }
    
     public static ArrayList<Sala> lerSalaObj(){
        ArrayList<Sala> s1= null;
        try {
            FileInputStream fileInputStream = new FileInputStream("salas.dat");
            if (fileInputStream == null){
                return null;
            }
            ObjectInputStream input = new ObjectInputStream(fileInputStream);
            s1 = (ArrayList<Sala>) input.readObject();
            input.close();
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return s1;
    }
     
     
     //Sessoes-------------------------
     
        public static void guardarSessaoObj (){
        
        try{
        FileOutputStream fileOutputStream = new FileOutputStream("sessoes.dat");
        ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
        output.writeObject(SubMenu.listasessoes);
        output.close();
        fileOutputStream.flush();
        fileOutputStream.close();
        
        }catch (FileNotFoundException e){
            e.printStackTrace();
         
        }catch(IOException e){
            e.printStackTrace();
        }  
    }
     
            
     public static ArrayList<Sessao> lerSessaoObj(){
        ArrayList<Sessao> se1= null;
        try {
            FileInputStream fileInputStream = new FileInputStream("sessoes.dat");
            if (fileInputStream == null){
                return null;
            }
            ObjectInputStream input = new ObjectInputStream(fileInputStream);
            se1 = (ArrayList<Sessao>) input.readObject();
            input.close();
        }catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return se1;
    }
        
}
