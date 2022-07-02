/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author DELL
 */
public class MenuDeNiños extends Menu {
    private double valorPorcionHelado;
    private double valorPorcionPastel;
    
    public MenuDeNiños(String n, double vi, double vh, double vp){
        super(n, vi);
        valorPorcionHelado = vh;
        valorPorcionPastel = vp;
    }
    
    public void establecerValorPorcionHelado(double vh){
        valorPorcionHelado = vh;
    }
    
    public void establecerValorBebida(double vp){
        valorPorcionPastel = vp;
    }
    
    public void establecerValorMenu(){
        valorMenu = valorInicialMenu + valorPorcionHelado + valorPorcionPastel;
    }
    
    public double obtenerValorPorcionHelado(){
        return valorPorcionHelado;
    }
    
    public double obtenerValorBebida(){
        return valorPorcionPastel;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }    
    
    @Override
    public String toString(){
        String cadena = String.format("Menú de Niños:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tValor helado: %.2f\n"
                + "\tValor pastel: %.2f\n"
                + "\tValor del Menú: %.2f",
                nombrePlato,
                valorInicialMenu,
                valorPorcionHelado,
                valorPorcionPastel,
                valorMenu);
        return cadena;            
    }  
}
