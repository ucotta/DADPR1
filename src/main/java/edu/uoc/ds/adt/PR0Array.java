package edu.uoc.ds.adt;

import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR0Array {
    public final int CAPACITY = 50;

    int vector[]; // = new int[CAPACITY];

    public PR0Array() {
        this.newVector();
    }
    public void newVector() {
        vector = new int[CAPACITY];
        for(int i=0; i<CAPACITY; i++) {
            vector[i] = i*2;
        }
    }

    public int[] getArray() {
        return vector.clone();
    }

    public int getIndexOf(int value) {
        for(int i=0; i<CAPACITY; i++) {
            System.out.println(i+1);
            if (vector[i] == value) {
                System.out.println(i);
                return i;
            }
        }
        System.out.println(CAPACITY);
        return -1;
    }

    public int binarySearch(int value) {
        int limit_l=0, limit_h=CAPACITY-1;

        int loops = 0;
        while (limit_h != limit_l) {
            loops++;
            System.out.println(loops);
            // Buscamos punto intermedio
            int middel = (limit_h - limit_l) / 2 + limit_l;
//            System.out.printf("%d %d %d %d=%d\n", limit_l, middel, limit_h, vector[middel], value);

            if (vector[middel] == value) {
                // Si es el valor buscado devolvemos la posición.
                return middel;
            } else if (middel == limit_l) {
                // llegamos al final del vector?
                // comprobamos si el vector superior es el buscado o devolvemos -1
                return vector[limit_h] == value ? limit_h : -1;
            } else if (vector[limit_h] == value && limit_l == middel) {
                // Middel no es el buscado, pero ya solo quedan dos elementos y el último si lo es.
                return limit_h;

            } else if (vector[middel] < value) {
                // Es menor o bien no existe, rompemos el bucle si es así.
                limit_l = middel;
            } else {
                limit_h = middel;
            }
        }

        return -1;
    }
}
