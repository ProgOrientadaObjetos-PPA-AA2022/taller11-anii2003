/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author DELL
 */
public class MenuDelDia extends Menu{
    private double valorPostre;
    private double valorBebida;
    
    public MenuDelDia(String n, double vi, double vb, double vp){
        super(n, vi);
        valorBebida = vb;
        valorPostre = vp;
    }
    
    public void establecerValorPostre(double vp){
        valorPostre = vp;
    }
    
    public void establecerValorBebida(double vb){
        valorBebida = vb;
    }
    
    public void establecerValorMenu(){
        valorMenu = valorInicialMenu + valorPostre + valorBebida;
    }
    
    public double obtenerValorPostre(){
        return valorPostre;
    }
    
    public double obtenerValorBebida(){
        return valorBebida;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menú del Día:\n"
                + "\tPlato: %s\n"
                + "\tValor inicial: %.2f\n"
                + "\tValor bebida: %.2f\n"
                + "\tValor postre: %.2f\n"
                + "\tValor del Menú: %.2f",
                nombrePlato,
                valorInicialMenu,
                valorBebida,
                valorPostre,
                valorMenu);
        return cadena;            
    }
}
