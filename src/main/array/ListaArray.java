package array;

import list.EstruturaElementar;

public class ListaArray implements EstruturaElementar{

    private int[] array;
    private int indice_fim;
    

    public ListaArray() {

    }

    @Override
    public boolean buscaElemento(int valor) {
        if(array != null) {
        for(int i = 0; i < array.length; i++){
            if(array[i]==valor){
                return true;
            }
        }
    }
        return false;
    
    }

    @Override
    public int buscaIndice(int valor) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == valor) {
                return i;
            }
        }
        return -1; 
    }
    
    @Override
    public int minimo() {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    @Override
    public int maximo() {
        
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    @Override
    public int predecessor(int valor) {
        for(int i = 0; i < array.length; i++){
            if(array[i]==valor){
                return array[i-1];
            }
        }
        return -111;
    }

    @Override
    public int sucessor(int valor) {
        for(int i = 0; i < array.length; i++){
            if(array[i]==valor){
                return array[i+1];
            }
        }
        return -111;
    }

    @Override
    public void insereElemento(int valor) {
         if (array == null) {
            array = new int[1];
            array[0] = valor;
        } else {
            int novoTamanho = array.length + 1;
            int[] novoArray = new int[novoTamanho];
            novoArray[0] = valor;
            for (int i = 1; i < novoTamanho; i++) {
                novoArray[i] = array[i - 1];
            }
            array = novoArray;
        }
    }

    @Override
    public void insereElementoPosicao(int valor, int buscaIndice) {
        if (buscaIndice >= 0 && buscaIndice <= array.length) {
            int novoTamanho = array.length + 1;
            int[] novoArray = new int[novoTamanho];
    
            for (int i = 0, j = 0; i < novoTamanho; i++) {
                if (i == buscaIndice) {
                    novoArray[i] = valor;
                } else {
                    novoArray[i] = array[j];
                    j++;
                }
            }
    
            array = novoArray;
        }
    }
    