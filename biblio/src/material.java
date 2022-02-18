import java.io.*;
import java.util.*;

public class material {
    private String titol;
    private String autor;
    private String genere;
    private String codigo;
    private String Disponible;


    public material(String titol, String autor, String genere, String codigo, String disponible) {
        this.titol = titol;
        this.autor = autor;
        this.genere = genere;
        this.codigo = codigo;
        Disponible = disponible;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String isDisponible() {
        return Disponible;
    }

    public void setDisponible(String disponible) {
        Disponible = disponible;
    }

    @Override
    public String toString() {
        return  "titol='" + titol + '\'' +
                ", autor='" + autor + '\'' +
                ", genere='" + genere + '\'' +
                ", codigo='" + codigo + '\'' +
                ", disponible='" + Disponible ;
    }
}
