/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesDeIbro;

/**
 *
 * @author ernst
 */
public class CompLibro {
 private String genero;
 private String paginas;

    public CompLibro() {
    }

    public CompLibro(String genero, String paginas) {
        this.genero = genero;
        this.paginas = paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPaginas() {
        return paginas;
    }

    public void setPaginas(String paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "CompLibro{" + "genero=" + genero + ", paginas=" + paginas + '}';
    }
 
    
}
