import java.io.*;
import java.util.*;

public class treballador extends persona{

    private int codigoTrabajador;

    public treballador(String nom, String cognom, String DNI, String email, int codigoTrabajador) {
        super(nom, cognom, DNI, email);
        this.codigoTrabajador = codigoTrabajador;
    }

    public static void add(String nombreT) {
    }

    public static void indexOf(double valorT) {
    }

    public static void set(int indiceT, double nuevoValorT) {
    }

    public static void remove(int indiceT) {
    }

    public int getCodigoTrabajador() {
        return codigoTrabajador;
    }

    public void setCodigoTrabajador(int codigoTrabajador) {
        this.codigoTrabajador = codigoTrabajador;
    }

    public static void registrarseT() throws IOException {


        File TextFile = new File("treballadors.txt");
        FileWriter TextOut = new FileWriter(TextFile, true);

        Scanner sc = new Scanner(System.in);
        ArrayList<String> treballador = new ArrayList<>();
        String nombreN;
        System.out.println("Nom: ");
        String nom = sc.nextLine();
        System.out.println("Cognom: ");
        String cognom = sc.nextLine();
        System.out.println("DNI: ");
        String DNI = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Codigo: ");
        int codigoTrabajador = sc.nextInt();


        nombreN = String.valueOf(new treballador(nom, cognom, DNI, email, codigoTrabajador));
        System.out.println("Nom: " + nom + "Cognom: " + cognom + "DNI: " + DNI + "Email: " + email + "Codi Treballador: " + codigoTrabajador);
        TextOut.write(nom + ":" + cognom + ":" + DNI + ":" + email + ":" + codigoTrabajador + "\n");
        TextOut.close();
        treballador.add(nombreN);


    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "codigoTrabajador=" + codigoTrabajador + '\'';
    }

    public static void AnadirTrabajador() throws IOException {

        Scanner sc = new Scanner(System.in);
        String nombreT;
        System.out.println("----------------------------------------------");
        System.out.println("Nombre: ");
        String nom = sc.nextLine();
        System.out.println("Apellido: ");
        String cognom = sc.nextLine();
        System.out.println("DNI: ");
        String DNI = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Codigo: ");
        int codigoTrabajador = sc.nextInt();

        nombreT = String.valueOf(new treballador(nom, cognom, DNI, email, codigoTrabajador));
        System.out.println("Nombre: " + nom + " Apellido: " + cognom + " DNI: " + DNI + " Email: " + email + " Codigo: " + codigoTrabajador);
        treballador.add(nombreT);

    }

    public static void modificarTrabajador() throws IOException {

        Scanner sc = new Scanner(System.in);
        double valorT, nuevoValorT;
        int indiceT = 0;
        System.out.println("Valor a modificar: ");
        valorT = sc.nextDouble();
        treballador.indexOf(valorT);
        if (indiceT != -1) {
            System.out.println("Nuevo valor: ");
            nuevoValorT = sc.nextDouble();
            treballador.set(indiceT, nuevoValorT);
        } else {
            System.out.println("Dato no encontrado");
        }

    }

    public static void eliminarTrabajador() throws IOException {

        Scanner sc = new Scanner(System.in);
        double valorT;
        int indiceT = 0;
        System.out.println("Valor a eliminar: ");
        valorT = sc.nextDouble();
        treballador.indexOf(valorT);
        if (indiceT != -1) {
            treballador.remove(indiceT);
            System.out.println("Dato eliminado");
        } else {
            System.out.println("Dato no encontrado");
        }

    }

}
