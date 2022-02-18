import java.io.*;
import java.util.*;

public class client extends persona {

    private int codigoCliente;

    public client(String nom, String cognom, String DNI, String email, int codigoCliente) {
        super(nom, cognom, DNI, email);
        this.codigoCliente = codigoCliente;
    }

    public static void add(String nombreC) {
    }

    public static void indexOf(double valorC) {
    }

    public static void set(int indiceC, double nuevoValorC) {
    }

    public static void remove(int indiceC) {
    }

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public static void registrarseC() throws IOException {

        int numero = (int)(Math.random()*1000+1);
        File TextFile = new File("clientes.txt");
        FileWriter TextOut = new FileWriter(TextFile, true);

        Scanner sc = new Scanner(System.in);
        ArrayList<String> client = new ArrayList<>();
        String nombreN;
        System.out.println("Nom: ");
        String nom = sc.nextLine();
        System.out.println("Cognom: ");
        String cognom = sc.nextLine();
        System.out.println("DNI: ");
        String DNI = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Email: ");
        int codigoCliente = sc.nextInt();


        nombreN = String.valueOf(new client(nom, cognom, DNI, email, codigoCliente));
        System.out.println("Benvingut! " + "Nom: " + nom + "Cognom: " + cognom + "DNI: " + DNI + "Email: " + email + "Codi client: " + codigoCliente);
        TextOut.write(nom + ":" + cognom + ":" + DNI + ":" + email + ":" + codigoCliente + "\n");
        TextOut.close();
        client.add(nombreN);


    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "codigoTrabajador=" + codigoCliente + '\'';
    }

    public static void clientepriv(ArrayList<llibrePaper> libros, ArrayList<audioLlibre> audios) {
        String opcion;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("1. Listado libros");
        System.out.println("2. Listado audio libros");
        System.out.println("3. Prestar");
        System.out.println("4. Sortir");
        opcion = sc.nextLine();

        switch (opcion){
            case "1":
                Iterator it = libros.iterator();
                while(it.hasNext())
                    System.out.println(it.next());
                break;
            case "2":
                Iterator ite = audios.iterator();
                while(ite.hasNext())
                    System.out.println(ite.next());
                break;
            case "3":
                break;
            case "4":
                break;
        }
    }

    public static void clienteescu(ArrayList<vinil> vinil) {
        String opcion2;
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("1. Listado vinilos");
        System.out.println("2. Prestar");
        System.out.println("3. Sortir");
        opcion2 = sc.nextLine();

        switch (opcion2){
            case "1":
                Iterator it = vinil.iterator();
                while(it.hasNext())
                    System.out.println(it.next());
                break;
            case "2":
                break;
            case "3":
                break;
        }
    }

    public static void AnadirCliente() throws IOException {

        Scanner sc = new Scanner(System.in);
        String nombreC;
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
        int codigoCliente = sc.nextInt();

        nombreC = String.valueOf(new client(nom, cognom, DNI, email, codigoCliente));
        System.out.println("Nombre: " + nom + " Apellido: " + cognom + " DNI: " + DNI + " Email: " + email + " Codigo: " + codigoCliente);
        client.add(nombreC);

    }

    public static void modificarCliente() throws IOException {

        Scanner sc = new Scanner(System.in);
        double valorC, nuevoValorC;
        int indiceC = 0;
        System.out.println("Valor a modificar: ");
        valorC = sc.nextDouble();
        client.indexOf(valorC);
        if (indiceC != -1) {
            System.out.println("Nuevo valor: ");
            nuevoValorC = sc.nextDouble();
            client.set(indiceC, nuevoValorC);
        } else {
            System.out.println("Dato no encontrado");
        }

    }

    public static void eliminarCliente() throws IOException {

        Scanner sc = new Scanner(System.in);
        double valorC;
        int indiceC = 0;
        System.out.println("Valor a eliminar: ");
        valorC = sc.nextDouble();
        client.indexOf(valorC);
        if (indiceC != -1) {
            client.remove(indiceC);
            System.out.println("Dato eliminado");
        } else {
            System.out.println("Dato no encontrado");
        }

    }

}
