package ifsul.edu.br.modelo;


import example_read_csv.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {
    static List<produto> list = new ArrayList<produto>();
    public static void Listaprod(List<produto> produto) {
         list=produto;

    }
    public static List<produto> getlist(){
        return list;
    }

    public static void menu() {


        Scanner Sa = new Scanner(System.in);
        int lp = 1;
        while (lp != 0) {

            System.out.println("Menu: \n[1]- Buscar produto por codigo\n[2]- Buscar produto por nome\n[0]- Encerrar programa");
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
