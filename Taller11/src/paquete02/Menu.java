/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 * 
 * @author DELL
 */
public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicialMenu;
    
    public Menu(String n, double vi){
        nombrePlato = n;
        valorInicialMenu = vi;
    }
    
    public void establecerNombrePlato(String n){
        nombrePlato = n;
    }
    
    public abstract void establecerValorMenu();
    
    public void establecerValorInicialMenu(double vi){
        valorInicialMenu = vi;
    }
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    
    public double obtenerValorInicialMenu(){
        return valorInicialMenu;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Nombre plato: %s\n"
                + "Valor inicial del menú: %.2f\n",
                nombrePlato,
                valorInicialMenu);
        return cadena;
    }
    
}
