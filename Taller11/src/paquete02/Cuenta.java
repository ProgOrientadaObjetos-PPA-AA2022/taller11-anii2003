/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Cuenta {
    protected String nombreCliente;
    protected ArrayList<Menu> menuSolicitado = new ArrayList<>();
    protected double valorTotalCancelar;
    protected double subtotal;
    protected double iva;
    
    /*public Cuenta(String n,ArrayList<Menu> lista, double i){
        nombreCliente = n;
        menuSolicitado = lista;
        iva = i;
    }*/
    
    public void establecerNombreCliente(String n){
        nombreCliente = n;
    }
    
    public void establecerMenuSolicitado(ArrayList<Menu> lista){
        menuSolicitado = lista;
    }
    
    public void establecerSubtotal(double s){
        subtotal = s;
    }
    
    public void establecerValorTotalCancelar(){
        for (int i = 0; i < menuSolicitado.size(); i++) {
            subtotal += menuSolicitado.get(i).valorMenu;
        }
        subtotal = subtotal * (iva/100);
        valorTotalCancelar = subtotal + iva;           
    }
    
    public void establecerIva(double i){
        iva = i;
    }
    
    public String obtenerNombreCliente(){
        return nombreCliente;
    }
    
    public ArrayList<Menu> obtenerMenuSolicitado(){
        return menuSolicitado;
    }
    
    public double obtenerSubtotal(){
        return subtotal;
    }
    
    public double obtenerValorTotalCancelar(){
        return valorTotalCancelar;
    }
}
