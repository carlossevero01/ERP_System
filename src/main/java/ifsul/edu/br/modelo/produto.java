package ifsul.edu.br.modelo;

public class produto {
    private String id;
    private String name;

    @Override
    public String toString() {
        return "produto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void prod(String id, String name) {
        this.id = id;
        this.name = name;
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
}
