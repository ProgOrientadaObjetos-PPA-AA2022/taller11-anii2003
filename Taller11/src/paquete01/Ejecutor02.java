/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import paquete02.Cuenta;
import paquete02.Menu;
import paquete02.MenuALaCarta;
import paquete02.MenuDeNiños;
import paquete02.MenuDelDia;
import paquete02.MenuEconomico;

/**
 *
 * @author reroes
 */
public class Ejecutor02 {

    public static void main(String[] args) {

        String[][] datos001 = {{"Niños 01", "2.00", "1", "1.5"},
        {"Niños 02", "3.00", "1", "1.5"},
        {"Niños 03", "2.00", "2", "0.5"},};

        String[][] datos002 = {{"Econo 001", "4", "25"},
        {"Econo 002", "4", "15"},
        {"Econo 003", "4", "35"}
        };

        String[][] datos003 = {{"Dia 001", "5", "1", "1"},
        {"Dia 002", "6", "2", "2"},
        {"Dia 003", "5.5", "3", "1"},};

        String[][] datos004 = {{"Carta 001", "6", "1.5", "2", "10"},
        {"Carta 002", "7", "1.7", "2.1", "5"},
        {"Carta 003", "8", "1.9", "2.2", "5"},
        {"Carta 004", "9", "2.5", "2.9", "5"},};

        // Lista de Menus
        ArrayList<Menu> lista = new ArrayList<>();

        /* Agregar un proceso para generar objetos de tipo Menu Carta, Día, 
        Economico y Niño*. Cada arreglo datos, se corresponde a un tipo de Menú.
        Iterar y crear los objetos según corresponda. Cada objeto generado, 
        agregar al ArrayList lista*/
        // Inicio de solución
        for (int i = 0; i < datos001.length; i++) {
            String v1 = datos001[i][1];
            double v2 = Double.parseDouble(v1);
            
            String v3 = datos001[i][2];
            double v4 = Double.parseDouble(v3);  
            
            String v5 = datos001[i][3];
            double v6 = Double.parseDouble(v5);                      

            MenuDeNiños menuNinio1 = new MenuDeNiños(datos001[i][0],v2,v4,v6);
            
            lista.add(menuNinio1);
        }
        
        for (int i = 0; i < datos002.length; i++) {
            String v1 = datos002[i][1];
            double v2 = Double.parseDouble(v1);
            
            String v3 = datos002[i][2];
            double v4 = Double.parseDouble(v3);                       

            MenuEconomico menuEco = new MenuEconomico(datos002[i][0],v2,v4);
            
            lista.add(menuEco);
        }

        for (int i = 0; i < datos003.length; i++) {
            String v1 = datos003[i][1];
            double v2 = Double.parseDouble(v1);

            String v3 = datos003[i][2];
            double v4 = Double.parseDouble(v3);

            String v5 = datos003[i][3];
            double v6 = Double.parseDouble(v5);
            
            MenuDelDia menuDia = new MenuDelDia(datos003[i][0], v2, v4, v6);

            lista.add(menuDia);
        }
        
        for (int i = 0; i < datos004.length; i++) {
            String v1 = datos004[i][1];
            double v2 = Double.parseDouble(v1);
            
            String v3 = datos004[i][2];
            double v4 = Double.parseDouble(v3);

            String v5 = datos004[i][3];
            double v6 = Double.parseDouble(v5);                       
            
            String v7 = datos004[i][4];
            double v8 = Double.parseDouble(v7);
            
            MenuALaCarta menuCarta = new MenuALaCarta(datos004[i][0],v2,v4,v6,v8);
            
            lista.add(menuCarta);
        }
        // Fin de solución
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).establecerValorMenu();
        }

        // Un objeto de tipo Cuenta
        Cuenta miCuenta = new Cuenta("Luis Andrade", lista, 10);
        miCuenta.establecerSubtotal();
        miCuenta.establecerValorTotalCancelar();
        System.out.printf("%s\n", miCuenta);

    }
}
