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
        porcentajeAdicional = valorInicialMenu * (p/100);
    }
    
    public void establecerValorMenu(){
        valorMenu = valorInicialMenu + valorPorcionGuarnicion + valorBebida+
                porcentajeAdicional;
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
    
}
