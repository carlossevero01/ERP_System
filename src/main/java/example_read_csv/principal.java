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


public class principal {

    public static void main(String[] args) throws IOException {
        List<produto> Listaprodutos = new ArrayList<>();
        String fileName = "C:\\Users\\carlos\\Documents\\Aula\\3ºSemestre\\EstruturaDeDados\\Products.csv";

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
        menu.Listaprod(Listaprodutos);
        menu.menu();
        /*
        MENU
        */
        } catch (CsvException e) {
            e.printStackTrace();
        }
    }

    }



