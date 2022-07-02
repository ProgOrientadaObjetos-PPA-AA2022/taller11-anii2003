/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author DELL
 */
public class MenuEconomico extends Menu {
    private double porcentajeDescuento;
    
    public MenuEconomico(String n, double vi, double pd){
        super(n, vi);
        porcentajeDescuento = pd;
    }
    
    public void establecerPorcentajeDescuento(double pd){
        porcentajeDescuento = pd;
    }
    
    public void establecerValorMenu(){
        valorMenu = valorInicialMenu - (valorInicialMenu * 
                (porcentajeDescuento/100));
    }
    
    public double obtenerPorcentajeDescuento(){
        return porcentajeDescuento;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }
    
    public String toString(){
        String cadena = String.format("Menú Económico:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.2f\n"
                + "\tPorcentaje Descuento: %.2f\n"
                + "\tValor del Menú: %.2f",
                nombrePlato,
                valorInicialMenu,
                porcentajeDescuento,
                valorMenu);
        return cadena;
    }
    
}
