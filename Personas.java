/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;
/**
 *
 * @author Kevin
 */
public class Personas {
    private String nom;
    private String dir;
    private long edad;
    private long tel;
    Personas(String nom, String dir, long edad, long tel) {
        this.nom = nom;
        this.dir = dir;
        this.edad = edad;
        this.tel = tel;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nom;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nom = nombre;
    }
    /**
     * @return the direccion
     */
    public String getDireccion() {
        return dir;
    }
    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.dir = direccion;
    }
    /**
     * @return the edad
     */
    public long getEdad() {
        return edad;
    }
    /**
     * @param edad the edad to set
     */
    public void setEdad(long edad) {
        this.edad = edad;
    }
    /**
     * @return the telefono
     */
    public long getTelefono() {
        return tel;
    }
    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(long telefono) {
        this.tel = telefono;
    }
}