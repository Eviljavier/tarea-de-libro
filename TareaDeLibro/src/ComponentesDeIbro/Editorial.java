/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ComponentesDeIbro;

/**
 *
 * @author ernst
 */
public class Editorial {
    private String edicion;
    private String año;

    public Editorial() {
    }

    public Editorial(String edicion, String año) {
        this.edicion = edicion;
        this.año = año;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Editorial{" + "edicion=" + edicion + ", a\u00f1o=" + año + '}';
    }
    
}
