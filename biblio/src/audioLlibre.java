import java.io.*;
import java.util.*;

public class audioLlibre extends material {

    private int duracio;

    public audioLlibre(String titol, String autor, String genere, String codigo, String disponible, int duracio) {
        super(titol, autor, genere, codigo, disponible);
        this.duracio = duracio;
    }

    public static void add(String nombreA) {
    }

    public static void indexOf(double valorA) {
    }

    public static void set(int indiceA, double nuevoValorA) {
    }

    public static void remove(int indiceA) {
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                ", duracio='" + duracio + '\'';
    }

    public static void AnadirAudioLibro() throws IOException {

        Scanner sc = new Scanner(System.in);
        String nombreA;
        System.out.println("----------------------------------------------");
        System.out.println("Titol: ");
        String titol = sc.nextLine();
        System.out.println("Autor: ");
        String autor = sc.nextLine();
        System.out.println("Genere: ");
        String genere = sc.nextLine();
        System.out.println("Codigo: ");
        String codigo = sc.nextLine();
        System.out.println("Disponible (Si/No)");
        String Disponible = sc.nextLine();
        System.out.println("Duracio: ");
        int duracio = sc.nextInt();


        nombreA = String.valueOf(new audioLlibre(titol, autor, genere, codigo, Disponible, duracio));
        System.out.println("Títol: " + titol + " Autor: " + autor + " Genere: " + genere + " Codi: " + codigo + " Disponibilitat: " + Disponible + " Duracion: " + duracio);
        audioLlibre.add(nombreA);

    }

    public static void modificarAudioLibro() throws IOException {

        Scanner sc = new Scanner(System.in);
        double valorA, nuevoValorA;
        int indiceA = 0;
        System.out.println("Valor a modificar: ");
        valorA = sc.nextDouble();
        audioLlibre.indexOf(valorA);
        if (indiceA != -1) {
            System.out.println("Nuevo valor: ");
            nuevoValorA = sc.nextDouble();
            audioLlibre.set(indiceA, nuevoValorA);
        } else {
            System.out.println("Dato no encontrado");
        }

    }

    public static void eliminarAudioLibro() throws IOException {

        Scanner sc = new Scanner(System.in);
        double valorA;
        int indiceA = 0;
        System.out.println("Valor a eliminar: ");
        valorA = sc.nextDouble();
        audioLlibre.indexOf(valorA);
        if (indiceA != -1) {
            audioLlibre.remove(indiceA);
            System.out.println("Dato eliminado");
        } else {
            System.out.println("Dato no encontrado");
        }

    }

}
