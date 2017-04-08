/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio1;

import javax.swing.JLabel;

/**
 *
 * @author Johnny
 */
public class Pedido extends Thread {

    String pedido;
    int numpedido;
    int mesa;
    int segundos = 0;
    int minutos = 0;
    int horas = 0;
    boolean empezar = false;
    boolean bandera = false;
    Thread hilo;

    public Pedido() {

    }

    public Pedido(String p, int m, boolean t, int np) {
        this.pedido = p;
        this.mesa = m;
        this.empezar = t;
        this.numpedido = np;
        this.hilo = new Thread(this);
        this.hilo.start();
    }

    @Override
    public void run() {
        try {
            while (empezar) {
                this.segundos++;
                if (this.segundos == 60) {
                    this.segundos = 0;
                    this.minutos++;
                }
                if (this.minutos == 60) {
                    this.minutos = 0;
                    this.horas++;
                }
                if ((MeserosTabla.x + 1) == this.mesa) {
                    Menu.actualizar2();
                }
                this.hilo.sleep(1000);
                synchronized (this) {
                    while (this.bandera) {
                        this.wait();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Se crash bandicoot esta vaina :,v");
        }
    }

    synchronized void Resume() {
        this.bandera = false;
        this.notify();
    }

    synchronized void Suspend() {
        this.bandera = true;
    }

    void Stop() {
        this.empezar = false;
    }
}
