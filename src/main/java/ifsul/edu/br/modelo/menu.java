package ifsul.edu.br.modelo;


import example_read_csv.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {
    public static List<produto> list = new ArrayList<produto>();
    public static QuickSort Ordenar = new QuickSort();
    public static void Listaprod(List<produto> produto) { list=produto;}
    public static List<produto> getlist(){
        return list;
    }
    static int vi[] = new int[list.size()];
    public static void setVi(int[] vi) { menu.vi = vi; }

    public static void menu() {
        Ordenar.quickSort(vi,vi[0],vi.length-1);    //Ordenação QuickSort
        Scanner Sa = new Scanner(System.in);
        int lp = 1;
        while (lp != 0) {

            System.out.println("Menu: \n[1]- Buscar produto por codigo\n[2]- Buscar produto por nome\n[3]- Retirar produto por codigo\n[5]– Buscar por produtos utilizando busca binária\n"+
                    "[0]- Encerrar programa");
            lp = Sa.nextInt();
            switch (lp) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    String cod;
                    boolean exist = false;
                    System.out.println("Insira o codigo do produto:");
                    cod = sc.nextLine();
                    cod.replace(" ","");
                    for (int i = 0; i < getlist().size(); i++) {
                        if (getlist().get(i).getId().equalsIgnoreCase(cod)) {
                            System.out.println("ID:" + getlist().get(i).getId() + " | Nome:" + getlist().get(i).getName());
                            exist = true;
                        }

                    }
                    if (exist == false) {
                        System.out.println("Nenhum objeto encontrado");
                    }

                    break;
                case 2:
                    Scanner sca = new Scanner(System.in);
                    exist = false;
                    String nom;
                    System.out.println("Insira o nome do produto:");
                    nom = sca.nextLine();

                    for (int i = 0; i < getlist().size(); i++) {
                        if (getlist().get(i).getName().equalsIgnoreCase(nom)) {
                            System.out.println("ID:" + getlist().get(i).getId() + " | Nome:" + getlist().get(i).getName());
                            exist = true;
                        }

                    }
                    if (exist == false) {
                        System.out.println("Nenhum objeto encontrado");
                    }
                    break;
                case 3:
                    Scanner scb= new Scanner(System.in);
                    String cp;
                    int qnt;
                    System.out.println("Insira o codigo do produto:");
                    cp= scb.nextLine();
                    System.out.println("Insira a quantidade desejada:");
                    qnt= scb.nextInt();

                    break;
                case 5:
                    Scanner scg= new Scanner(System.in);
                    System.out.println("Busca Binaria:\n Insira o codigo do produto(ID):");
                    int cog = scg.nextInt();
                    Ordenar.buscaBinaria(vi,cog);       //BuscaBinaria

                    break;
                case 0:
                    System.out.println("Programa Encerrado");
                    break;
                default:
                    System.err.println("Operação invalida, Tente novamente!");
                    break;
            }
        }

    }
    /*FIM MENU*/

}
