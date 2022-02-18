import java.io.*;
import java.util.*;

public class llibrePaper extends material {

    private int numPagines;
    private int ISBN;

    public llibrePaper(String titol, String autor, String genere, String codigo, String disponible, int numPagines, int ISBN) {
        super(titol, autor, genere, codigo, disponible);
        this.numPagines = numPagines;
        this.ISBN = ISBN;
    }

    public static void add(String nombreP) {
    }

    public static void indexOf(double valorP) {
    }

    public static void set(int indiceP, double nuevoValorP) {
    }

    public static void remove(int indiceP) {
    }

    public int getNumPagines() {
        return numPagines;
    }

    public void setNumPagines(int numPagines) {
        this.numPagines = numPagines;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                ", paginas='" + numPagines + '\'' +
                ", ISBN='" + ISBN + '\'';
    }

    public static void AnadirLibroPapel() throws IOException {

        Scanner sc = new Scanner(System.in);
        String nombreP;
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
        System.out.println("Numero de pagines: ");
        int numPagines = sc.nextInt();
        System.out.println("ISBN: ");
        int ISBN = sc.nextInt();

        nombreP = String.valueOf(new llibrePaper(titol, autor, genere, codigo, Disponible, numPagines, ISBN));
        System.out.println("Títol: " + titol + " Autor: " + autor + " Genere: " + genere + " Codi: " + codigo + " Disponibilitat: " + Disponible + " Paginas: " + numPagines + " ISBN: " + ISBN);
        llibrePaper.add(nombreP);

    }

    public static void modificarLibroPapel() throws IOException {

        Scanner sc = new Scanner(System.in);
        double valorP, nuevoValorP;
        int indiceP = 0;
        System.out.println("Valor a modificar: ");
        valorP = sc.nextDouble();
        llibrePaper.indexOf(valorP);
        if (indiceP != -1) {
            System.out.println("Nuevo valor: ");
            nuevoValorP = sc.nextDouble();
            llibrePaper.set(indiceP, nuevoValorP);
        } else {
            System.out.println("Dato no encontrado");
        }

    }

    public static void eliminarLibroPapel() throws IOException {

        Scanner sc = new Scanner(System.in);
        double valorP;
        int indiceP = 0;
        System.out.println("Valor a eliminar: ");
        valorP = sc.nextDouble();
        llibrePaper.indexOf(valorP);
        if (indiceP != -1) {
            llibrePaper.remove(indiceP);
            System.out.println("Dato eliminado");
        } else {
            System.out.println("Dato no encontrado");
        }

    }

}
