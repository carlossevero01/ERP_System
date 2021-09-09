package example_read_csv;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import ifsul.edu.br.modelo.produto;
import ifsul.edu.br.modelo.menu;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;


public class Example {

    public static void main(String[] args) throws IOException {

        String fileName = "C:\\Users\\carlos\\Documents\\Aula\\3ºSemestre\\EstruturaDeDados\\Products.csv";
        List<produto> Listaprodutos = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(fileName))) {
            List<String[]> r = reader.readAll();
          //  r.forEach(x -> System.out.println(Arrays.toString(x)));
        for (String [] prod: r){
            produto p = new produto();
            p.setId(prod[0]);
            p.setName(prod[21]);
            Listaprodutos.add(p);
        }
        /*
        MENU
        */
Scanner Sa = new Scanner(System.in);
         int lp=1;
         while(lp!=0)
        {

        System.out.println("Menu: \n[1]- Buscar produto por codigo\n[2]- Buscar produto por nome\n[0]- Encerrar programa");
        lp=Sa.nextInt();
            switch(lp){
                case 1:
                    Scanner sc = new Scanner(System.in);
                    String cod;
                    boolean exist =false;
                    System.out.println("Insira o codigo do produto:");
                    cod=sc.nextLine();
                    for (int i=0;i<Listaprodutos.size();i++) {
                        if(Listaprodutos.get(i).getId().equalsIgnoreCase(cod)) {
                            System.out.println("ID:"+Listaprodutos.get(i).getId()+" | Nome:"+Listaprodutos.get(i).getName());
                            exist = true;
                        }

                    }
                    if(exist==false){
                        System.out.println("Nenhum objeto encontrado");
                    }

                    break;
                case 2:
                    Scanner sca = new Scanner(System.in);
                    exist= false;
                    String nom;
                    System.out.println("Insira o nome do produto:");
                    nom=sca.nextLine();

                    for (int i=0;i<Listaprodutos.size();i++) {
                        if(Listaprodutos.get(i).getName().equalsIgnoreCase(nom)) {
                            System.out.println("ID:"+Listaprodutos.get(i).getId()+" | Nome:"+Listaprodutos.get(i).getName());
                        exist = true;
                        }

                    }
                    if(exist==false){
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

            /*FIM MENU*/

            
        } catch (CsvException e) {
            e.printStackTrace();
        }
    }
}


