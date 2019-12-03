import java.util.ArrayList;
import java.util.List;

public class Fallo {
    private static int nextId = 1;
    private int id;
    String nombre;
    List<String> comentarios = new ArrayList();

    public Fallo(String n){
        nombre = n;
        id = nextId;
        nextId++;
    }

    public void addComentario(String s){
        comentarios.add(s);
    }

    @Override
    public String toString() {
        return "Fallo [id=" + id + ", nombre=" + nombre + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<String> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<String> comentarios) {
        this.comentarios = comentarios;
    }

    
}