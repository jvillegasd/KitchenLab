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
public class List {

    Nodo ptr;
    Nodo aux;

    public List() {
        this.ptr = null;
        this.aux = null;
    }

    public void add(Object inf) {
        Nodo aux1 = new Nodo(inf);
        if (this.ptr == null) {
            this.ptr = aux1;
            this.aux = aux1;
        } else {
            this.aux.link = aux1;
            this.aux = aux1;
        }
    }

    public void add(String inf) {
        Nodo aux1 = new Nodo(inf);
        if (this.ptr == null) {
            this.ptr = aux1;
            this.aux = aux1;
        } else {
            this.aux.link = aux1;
            this.aux = aux1;
        }
    }

    public void add(int inf) {
        Nodo aux1 = new Nodo(inf);
        if (this.ptr == null) {
            this.ptr = aux1;
            this.aux = aux1;
        } else {
            this.aux.link = aux1;
            this.aux = aux1;
        }
    }

    public void add(long inf) {
        Nodo aux1 = new Nodo(inf);
        if (this.ptr == null) {
            this.ptr = aux1;
            this.aux = aux1;
        } else {
            this.aux.link = aux1;
            this.aux = aux1;
        }
    }

    public String gets(int i) {
        String devol = null;
        if (this.ptr == null) {
            devol = null;
        } else {
            Nodo busc = new Nodo();
            busc = this.ptr;
            int z = 0;
            while (busc != null && z != i) {
                z++;
                busc = busc.link;
            }
            if (z != i) {
                devol = null;
            } else {
                devol = busc.info;
            }
        }
        return devol;
    }

    public int geti(int i) {
        if (this.ptr == null) {
            return -1;
        } else {
            Nodo busc = new Nodo();
            busc = this.ptr;
            int z = 0;
            while (busc != null && z != i) {
                z++;
                busc = busc.link;
            }
            if (z != i) {
                return -1;
            } else {
                return busc.info1;
            }
        }
    }

    public Object geto(int i) {
        if (this.ptr == null) {
            return null;
        } else {
            Nodo busc = new Nodo();
            busc = this.ptr;
            int z = 0;
            while (busc != null && z != i) {
                z++;
                busc = busc.link;
            }
            if (z != i) {
                return null;
            } else {
                return busc.info2;
            }
        }
    }

    public long getl(int i) {
        if (this.ptr == null) {
            return 0;
        } else {
            Nodo busc = new Nodo();
            busc = this.ptr;
            int z = 0;
            while (busc != null && z != i) {
                z++;
                busc = busc.link;
            }
            if (z != i) {
                return 0;
            } else {
                return busc.infoo;
            }
        }
    }

    public void set(int i, String info) {
        if (this.ptr == null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo busc = new Nodo();
            busc = this.ptr;
            int z = 0;
            while (busc != null || z == i) {
                z++;
                busc = busc.link;
            }
            if (z != i) {
                System.out.println("Indice invalido");
            } else {
                busc.info = info;
            }
        }
    }

    public void set(int i, int info1) {
        if (this.ptr == null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo busc = new Nodo();
            busc = this.ptr;
            int z = 0;
            while (busc != null || z == i) {
                z++;
                busc = busc.link;
            }
            if (z != i) {
                System.out.println("Indice invalido");
            } else {
                busc.info1 = info1;
            }
        }
    }

    public void set(int i, Object info2) {
        if (this.ptr == null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo busc = new Nodo();
            busc = this.ptr;
            int z = 0;
            while (busc != null || z == i) {
                z++;
                busc = busc.link;
            }
            if (z != i) {
                System.out.println("Indice invalido");
            } else {
                busc.info2 = info2;
            }
        }
    }

    public int size() {
        int z = 0;
        Nodo busc = new Nodo();
        busc = this.ptr;
        if (this.ptr == null) {
            return z;
        } else {
            while (busc != null) {
                z++;
                busc = busc.link;
            }
            return z;
        }
    }

    public boolean contains(Object info) {
        boolean confirm = false;
        if (this.ptr == null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo busc = new Nodo();
            busc = this.ptr;
            int sw = 0;
            while (busc != null && sw == 0) {
                if (busc.info2.equals(info)) {
                    confirm = true;
                    sw = 1;
                }
                busc = busc.link;
            }
        }
        return confirm;
    }

    public boolean contains(String info) {
        boolean confirm = false;
        if (this.ptr == null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo busc = new Nodo();
            busc = this.ptr;
            int sw = 0;
            while (busc != null && sw == 0) {
                if (busc.info.equals(info)) {
                    confirm = true;
                    sw = 1;
                }
                busc = busc.link;
            }
        }
        return confirm;
    }

    public boolean contains(int info) {
        boolean confirm = false;
        if (this.ptr == null) {
            System.out.println("Lista Vacia");
        } else {
            Nodo busc = new Nodo();
            busc = this.ptr;
            int sw = 0;
            while (busc != null && sw == 0) {
                if (busc.info1 == info) {
                    confirm = true;
                    sw = 1;
                }
                busc = busc.link;
            }
        }
        return confirm;
    }

    public void remove(int i) { //Creditos al mocho
        Nodo p = new Nodo();
        p = this.ptr;
        Nodo antp = null;
        int z = 0;
        while (z != i && p != null) {
            antp = p;
            p = p.link;
            z++;
        }
        if (p == this.ptr) {
            this.ptr = this.ptr.link;
        } else if (z == i) {
            antp.link = p.link;
        }
    }

    public boolean isEmpty() {
        if (this.ptr == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getindi(String in) {
        Nodo busc = new Nodo();
        int z = 0;
        busc = this.ptr;
        while (busc != null && (!busc.info.equals(in))) {
            z++;
            busc = busc.link;
        }
        if (this.ptr == null) {
            return 0;
        }
        return z;
    }

    public int getindi(int in) {
        Nodo busc = new Nodo();
        int z = 0;
        busc = this.ptr;
        while (busc != null && (busc.info1 != in)) {
            z++;
            busc = busc.link;
        }
        if (this.ptr == null) {
            return 0;
        }
        return z;
    }

    public int getindi(long in) {
        Nodo busc = new Nodo();
        int z = 0;
        busc = this.ptr;
        while (busc != null && (busc.infoo != in)) {
            z++;
            busc = busc.link;
        }
        if (this.ptr == null) {
            return 0;
        }
        return z;
    }

    public void removeAll() {
        for (int i = 0; i < this.size(); i++) {
            this.remove(i);
        }
        this.ptr=null;
    }
}
