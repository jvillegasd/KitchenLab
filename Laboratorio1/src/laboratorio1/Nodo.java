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
public class Nodo {

    Nodo link;
    String info = "";
    Object info2;
    int info1 = 0;
    long infoo;

    public Nodo() {
        info = "";
        info1 = 0;
        info2=null;
        link = null;
        infoo = 0;
    }

    public Nodo(String inf) {
        info = inf;
        link = null;
    }

    public Nodo(int info) {
        info1 = info;
        link = null;
    }

    public Nodo(Object info) {
        info2=info;
        link=null;
    }
    
    public Nodo(long info) {
        infoo=info;
        link=null;
    }
}
