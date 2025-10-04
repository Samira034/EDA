import java.util.*;
import java.io.*;

public class Autor {
    private String id;
    private String nombre;
    private HashSet<String> listaPublicacionesId;

    public Autor(String pId, String pNombre) {
        this.id = pId;
        this.nombre = pNombre;
        this.listaPublicacionesId = new HashSet<String>();
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public HashSet<String> getListaPublicacionesId() {
        return listaPublicacionesId;
    }

    public void añadirPublicacionId(String pPubId) {
        listaPublicacionesId.add(pPubId);
    }

}

