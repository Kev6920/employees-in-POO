/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;
import javax.swing.JOptionPane;
/**
 *
 * @author Kevin
 */
public class Empleados {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long edadun, telefonoun, edaddo, telefonodo, edadtre, telefonotre, edadcua, telefonocua, edadcin, telefonocin;
        String nombreun, direccionun, nombredo, direcciondo, nombretre, direcciontre, nombrecua, direccioncua, nombrecin, direccioncin;
        nombreun = JOptionPane.showInputDialog("Digite el nombre del empleado numero 1");
        direccionun = JOptionPane.showInputDialog("Digite la direccion del empleado numero 1");
        edadun = Long.parseLong(JOptionPane.showInputDialog("Digite la edad del empleado numero 1"));
        telefonoun = Long.parseLong(JOptionPane.showInputDialog("Digite el telefono del empleado numero 1"));
        nombredo = JOptionPane.showInputDialog("Digite el nombre del empleado numero 2");
        direcciondo = JOptionPane.showInputDialog("Digite la direccion del empleado numero 2");
        edaddo = Long.parseLong(JOptionPane.showInputDialog("Digite la edad del empleado numero 2"));
        telefonodo = Long.parseLong(JOptionPane.showInputDialog("Digite el telefono del empleado numero 2"));
        nombretre = JOptionPane.showInputDialog("Digite el nombre del empleado numero 3");
        direcciontre = JOptionPane.showInputDialog("Digite la direccion del empleado numero 3");
        edadtre = Long.parseLong(JOptionPane.showInputDialog("Digite la edad del empleado numero 3"));
        telefonotre = Long.parseLong(JOptionPane.showInputDialog("Digite el telefono del empleado numero 3"));
        nombrecua = JOptionPane.showInputDialog("Digite el nombre del empleado numero 4");
        direccioncua = JOptionPane.showInputDialog("Digite la direccion del empleado numero 4");
        edadcua = Long.parseLong(JOptionPane.showInputDialog("Digite la edad del empleado numero 4"));
        telefonocua = Long.parseLong(JOptionPane.showInputDialog("Digite el telefono del empleado numero 4"));
        nombrecin = JOptionPane.showInputDialog("Digite el nombre del empleado numero 5");
        direccioncin = JOptionPane.showInputDialog("Digite la direccion del empleado numero 5");
        edadcin = Long.parseLong(JOptionPane.showInputDialog("Digite la edad del empleado numero 5"));
        telefonocin = Long.parseLong(JOptionPane.showInputDialog("Digite el telefono del empleado numero 5"));
        Personas p1 = new Personas(nombreun, direccionun, edadun, telefonoun);
        Personas p2 = new Personas(nombredo, direcciondo, edaddo, telefonodo);
        Personas p3 = new Personas(nombretre, direcciontre, edadtre, telefonotre); 
        Personas p4 = new Personas(nombrecua, direccioncua, edadcua, telefonocua);
        Personas p5 = new Personas(nombrecin, direccioncin, edadcin, telefonocin);
        int menu;
        menu = Integer.parseInt(JOptionPane.showInputDialog("Seleccione el empleado deseado para mostrar sus datos: \n 1."+nombreun+"\n 2."+nombredo+"\n 3."+nombretre+"\n 4."+nombrecua+"\n 5."+nombrecin+"\n 0. Salir."));
        switch(menu){
            case 1:
                JOptionPane.showMessageDialog(null, "Nombre: "+nombreun+" \n Direccion: "+direccionun+" \n Edad: "+edadun+" \n Telefono: "+telefonoun);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Nombre: "+nombredo+" \n Direccion: "+direcciondo+" \n Edad: "+edaddo+" \n Telefono: "+telefonodo);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Nombre: "+nombretre+" \n Direccion: "+direcciontre+" \n Edad: "+edadtre+" \n Telefono: "+telefonotre);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Nombre: "+nombrecua+" \n Direccion: "+direccioncua+" \n Edad: "+edadcua+" \n Telefono: "+telefonocua);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Nombre: "+nombrecin+" \n Direccion: "+direccioncin+" \n Edad: "+edadcin+" \n Telefono: "+telefonocin);
                break;
            case 0:
                JOptionPane.showMessageDialog(null, "Gracias :) ");
            }       
    }
}