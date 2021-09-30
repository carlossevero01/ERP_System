package ifsul.edu.br.modelo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class produto {
    private String id;
    private String name;
    private String date;
    private int quantidade;
    Queue<String> queue = new LinkedList<String>();
    Random random = new Random();
    @Override
    public String toString() {
        return "produto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() { return date; }

    public void setDate(String date) { this.date = date; }

    public int getQuantidade() { return quantidade; }

    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public Queue<String> getQueue() {
        return queue;
    }

    public void criarQueue(int q) {
        int dia,mes,ano;
        dia = random.nextInt(29) + 1;
        mes= random.nextInt(11)+1;
        ano= random.nextInt(21) + 2000;
        for(int i=1;i<=q;i++){

            queue.add(dia+"/"+mes+"/"+ano);
            dia++;
            mes++;
            ano++;
        }
    }

    public void retirarQuantidade(int qnt) {
        quantidade = quantidade - qnt;
    }
}
