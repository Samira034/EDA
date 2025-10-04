import java.util.*;
import java.io.*;

public class Publicacion {

    private String id;
    private String titulo;
    private HashSet<String> listaIdAutores;
    private HashSet<String> listaIdCitadas;

    public Publicacion(String pId, String pTitulo) {
        this.id = pId;
        this.titulo = pTitulo;
        this.listaIdAutores = new HashSet<String>();
        this.listaIdCitadas = new HashSet<String>();


    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public HashSet<String> getListaIdAutores() {
        return listaIdAutores;
    }

    public HashSet<Publicacion> getListaIdCitadas() {
        return listaIdCitadas;
    }

    public void addIdAutor(String pId) {
        listaIdAutores.add(pId);
    }

    public void addIdCitada(String pId) {
        listaIdCitadas.add(pId);
    }
}


