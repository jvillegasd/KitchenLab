/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

/**
 *
 * @author Johnny
 */
public class Bodega {

    List Ingredientes = new List();
    List Cantidad = new List();

    public void cantusada(String ingrediente, int cantidad) {
        for (int i = 0; i < Ingredientes.size(); i++) {
            if (Ingredientes.gets(i).equals(ingrediente)) {
                Cantidad.set(i, Cantidad.geti(i) + cantidad);
            }
        }
    }

    public void llenar(String ingrediente, int cantidad) {
        Ingredientes.add(ingrediente);
        Cantidad.add(cantidad);
    }
}

