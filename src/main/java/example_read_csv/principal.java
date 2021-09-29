package example_read_csv;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import ifsul.edu.br.modelo.DVProd;
import ifsul.edu.br.modelo.QuickSort;
import ifsul.edu.br.modelo.produto;
import ifsul.edu.br.modelo.menu;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import java.util.stream.IntStream;


public class principal
{

    public static void main(String[] args) throws IOException
    {
        List<produto> Listaprodutos = new ArrayList<>();
        Queue<produto> DVprod = new LinkedList<>();

        String fileName = "C:\\Users\\carlos\\Documents\\Aula\\3ºSemestre\\EstruturaDeDados\\Products.csv";
         Random random = new Random();
        try (CSVReader reader = new CSVReader(new FileReader(fileName)))
        {
            List<String[]> r = reader.readAll();
          //  r.forEach(x -> System.out.println(Arrays.toString(x)));
            for (String [] prod: r)
            {
                produto p = new produto();
                p.setId(prod[0]);
                p.setName(prod[21]);
                p.setDate(prod[15]);
                p.setQuantidade(random.nextInt(100));
                Listaprodutos.add(p);
                DVprod.add(p);
            }
            int v[] = new int[Listaprodutos.size()];
            String v1;
            for(int i=1;i< Listaprodutos.size();i++)
            {
                try
                {
                    v1=Listaprodutos.get(i).getId().trim();
                    v[i]=Integer.valueOf(v1);
                }
                catch(NumberFormatException nfe)
                {
                nfe.printStackTrace();
                }
            }
            /*Ativos*/
            menu.Listaprod(Listaprodutos);
            menu.setVi(v);
            menu.menu();
            /*Ativos*/
        }
        catch (CsvException e)
        {
            e.printStackTrace();
        }
    }
}



