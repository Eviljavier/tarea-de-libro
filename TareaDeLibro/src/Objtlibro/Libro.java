/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Objtlibro;
import ComponentesDeIbro.Autor;
import ComponentesDeIbro.Editorial;
import ComponentesDeIbro.CompLibro;
/**
 *
 * @author ernst
 */
public class Libro {

 


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CompLibro obj= new CompLibro();
        obj.setGenero("Fantasia");
        obj.setPaginas("100");
        
        Editorial obj2=new Editorial();
        obj2.setAño("1980");
        obj2.setEdicion("6");
        
        Autor obj3=new Autor();
        obj3.setNombre("Jose Revueltas");
        obj3.setPais("Mexico");
        
        System.err.println(obj3);
        System.out.println(obj2);
        
      
        System.out.println(obj);
        
       
    }
    
}
