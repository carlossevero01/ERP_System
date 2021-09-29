package ifsul.edu.br.modelo;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {

    public static void quickSort(int v[], int inicio, int fim)
    {
        if (inicio < fim)
        {
            int Pivo = separar(v, inicio, fim);
            quickSort(v, inicio, Pivo - 1);
            quickSort(v, Pivo + 1, fim);
        }
    }
    private static int separar(int v[], int inicio, int fim)
    {
        int pivo = v[inicio];
        int i = inicio + 1, f = fim;
            while (i <= f)
            {
                if (v[i] <= pivo)
                     i++;
                else if (pivo < v[f])
                     f--;
                else
                {
                    int troca = v[i];
                    v[i] = v[f];
                    v[f] = troca;
                    i++;
                    f--;
                }
            }
        v[inicio] = v[f];
        v[f] = pivo;
        return f;
    }
    public static void buscaBinaria(int v[],int item)
    {
        boolean encontrado=false;
        int inicio = 0,ind=0;
        int fim = v.length-1;
        while(inicio<=fim && encontrado==false)
        {
            int meio = (inicio+fim)/2;
            if(v[meio]==item){
                  encontrado = true;
                  ind=meio;
            }
            else{
                if(item<v[meio]){ fim = meio-1; }
                else{ inicio=meio+1; }
            }

        }
        if(encontrado==true) {
            System.out.println("Produto Encontrado");
            System.out.println("ID:" + menu.getlist().get(ind).getId()+" Nome:"+menu.getlist().get(ind).getName());
        }
        else {
            System.out.println("Produto não encontrado");
        }

    }
}
