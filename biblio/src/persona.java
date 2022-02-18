import java.io.*;
import java.util.*;

public class persona {
    private String nom;
    private String cognom;
    private String DNI;
    private String email;

    public persona(String nom, String cognom, String DNI, String email) {
        this.nom = nom;
        this.cognom = cognom;
        this.DNI = DNI;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public static void registrarse() throws IOException {

        File TextFile = new File("archivo.txt");
        FileWriter TextOut = new FileWriter(TextFile, true);

        Scanner sc = new Scanner(System.in);
        ArrayList<String> persona = new ArrayList<>();
        String nombreN;
        System.out.println("Nom: ");
        String nom = sc.nextLine();
        System.out.println("Cognom: ");
        String cognom = sc.nextLine();
        System.out.println("DNI: ");
        String DNI = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();


        nombreN = String.valueOf(new persona(nom, cognom, DNI, email));
        System.out.println("Benvingut! " + "Nom: " + nom + "Cognom: " + cognom + "DNI: " + DNI + "Email: " + email);
        TextOut.write(nom + ":" + cognom + ":" + DNI + ":" + email + "\n");
        TextOut.close();
        persona.add(nombreN);


    }

    @Override
    public String toString() {
        return  "nom='" + nom + '\'' +
                ", Cognom='" + cognom + '\'' +
                ", DNI='" + DNI + '\'' +
                ", email='" + email + '\'';
    }

}

