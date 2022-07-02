/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

/**
 *
 * @author DELL
 */
public class MenuALaCarta extends Menu{
    private double valorPorcionGuarnicion;
    private double valorBebida;
    private double porcentajeAdicional;
    
    public MenuALaCarta(String n, double vi, double vg, 
            double vb, double p){
        super(n, vi);
        valorPorcionGuarnicion = vg;
        valorBebida = vb;
        porcentajeAdicional = p;
    }
    
    public void establecerValorPorcionGuarnicion(double v){
        valorPorcionGuarnicion = v;
    }
    
    public void establecerValorBebida(double v){
        valorBebida = v;
    }
    
    public void establecerPorcentajeAdicional(double p){
        porcentajeAdicional = p;
    }
    
    public void establecerValorMenu(){
        valorMenu = valorInicialMenu + valorPorcionGuarnicion + valorBebida+
                (valorInicialMenu * (porcentajeAdicional/100));
    }
    
    public double obtenerValorPorcionGuarnicion(){
        return valorPorcionGuarnicion;
    }
    
    public double obtenerValorBebida(){
        return valorBebida;
    }
    
    public double obtenerPorcentajeAdicional(){
        return porcentajeAdicional;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menú a la Carta:\n"
                + "\tPlato: %s\n"
                + "\tValor Inicial: %.1f\n"
                + "\tValor guarnición: %.1f\n"
                + "\tValor bebida: %.1f\n"
                + "\tPorcentaje Adicional: %.2f\n"
                + "\tValor del Menú: %.2f\n",
                nombrePlato,
                valorInicialMenu,
                valorPorcionGuarnicion,
                valorBebida,
                porcentajeAdicional,
                valorMenu);
        return cadena;
    }
    
}
