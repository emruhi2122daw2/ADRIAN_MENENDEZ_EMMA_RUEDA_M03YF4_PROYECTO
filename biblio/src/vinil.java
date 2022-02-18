import java.io.*;
import java.util.*;

public class vinil extends material{
    private int Canciones;
    private int Duracio;

    public vinil(String titol, String autor, String genere, String codigo, String disponible, int canciones, int duracio) {
        super(titol, autor, genere, codigo, disponible);
        Canciones = canciones;
        Duracio = duracio;
    }

    public static void add(String nombreV) {
    }

    public static void indexOf(double valorV) {
    }

    public static void set(int indiceV, double nuevoValorV) {
    }

    public static void remove(int indiceV) {
    }

    public int getCanciones() {
        return Canciones;
    }

    public void setCanciones(int Canciones) {
        this.Canciones = Canciones;
    }

    public int getDuracio() {
        return Duracio;
    }

    public void setDuracio(int Duracio) {
        this.Duracio = Duracio;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                ", canciones='" + Canciones + '\'' +
                ", duracio='" + Duracio + '\'';
    }

    public static void AnadirVinilo() throws IOException {

        Scanner sc = new Scanner(System.in);
        String nombreV;
        System.out.println("----------------------------------------------");
        System.out.println("Titulo: ");
        String titol = sc.nextLine();
        System.out.println("Autor: ");
        String autor = sc.nextLine();
        System.out.println("Genero: ");
        String genere = sc.nextLine();
        System.out.println("Codigo: ");
        String codigo = sc.nextLine();
        System.out.println("Disponible (Si/No)");
        String Disponible = sc.nextLine();
        System.out.println("Canciones: ");
        int Canciones = sc.nextInt();
        System.out.println("Duracion: ");
        int Duracio = sc.nextInt();

        nombreV = String.valueOf(new vinil(titol, autor, genere, codigo, Disponible, Canciones, Duracio));
        System.out.println("Títol: " + titol + " Autor: " + autor + " Genere: " + genere + " Codi: " + codigo + " Disponibilitat: " + Disponible + " Canciones: " + Canciones + " Duracion: " + Duracio);
        vinil.add(nombreV);

    }

    public static void modificarVinilo() throws IOException {

        Scanner sc = new Scanner(System.in);
        double valorV, nuevoValorV;
        int indiceV = 0;
        System.out.println("Valor a modificar: ");
        valorV = sc.nextDouble();
        vinil.indexOf(valorV);
        if (indiceV != -1) {
            System.out.println("Nuevo valor: ");
            nuevoValorV = sc.nextDouble();
            vinil.set(indiceV, nuevoValorV);
        } else {
            System.out.println("Dato no encontrado");
        }

    }

    public static void eliminarVinilo() throws IOException {

        Scanner sc = new Scanner(System.in);
        double valorV;
        int indiceV = 0;
        System.out.println("Valor a eliminar: ");
        valorV = sc.nextDouble();
        vinil.indexOf(valorV);
        if (indiceV != -1) {
            vinil.remove(indiceV);
            System.out.println("Dato eliminado");
        } else {
            System.out.println("Dato no encontrado");
        }

    }

}
