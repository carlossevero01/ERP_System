package example_read_csv;


import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import ifsul.edu.br.modelo.produto;
import ifsul.edu.br.modelo.menu;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class principal
{

    public static void main(String[] args) throws IOException
    {
        List<produto> Listaprodutos = new ArrayList<>();

        String fileName = "C:\\Users\\carlos\\Documents\\GitHub\\Aula\\Aula\\3ºSemestre\\EstruturaDeDados\\Products.csv";

         Random random = new Random();

       int dia=0,mes=0,ano=0,q;
        try (CSVReader reader = new CSVReader(new FileReader(fileName)))
        {
            List<String[]> r = reader.readAll();
          //  r.forEach(x -> System.out.println(Arrays.toString(x)));
            for (String [] prod: r)
            {
                produto p = new produto();
                p.setId(prod[0]);
                p.setName(prod[21]);
                q= random.nextInt(20)+1;
                p.setQuantidade(q);
                p.criarQueue(q);
                Listaprodutos.add(p);

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



