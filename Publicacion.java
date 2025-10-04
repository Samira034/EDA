import java.util.*;
import java.io.*;

public class Publicacion {

    private String id;
    private String titulo;
    private HashSet<String> listaAutoresId;
    private HashSet<String> listaCitadasId;

    public Publicacion(String pId, String pTitulo) {
        this.id = pId;
        this.titulo = pTitulo;
        this.listaAutoresId = new HashSet<String>();
        this.listaCitadasId = new HashSet<String>();


    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public HashSet<Autor> getListaAutoresId() {
        return listaAutoresId;
    }

    public HashSet<Publicacion> getListaCitadasId() {
        return listaCitadasId;
    }

    public void añadirAutorId(String pAutorId) {
        listaAutoresId.add(pAutorId);
    }

    public void añadirCitadaId(String pId) {
        listaCitadasId.add(pId);
    }
}


