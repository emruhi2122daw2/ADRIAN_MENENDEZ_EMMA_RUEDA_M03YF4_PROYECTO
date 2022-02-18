import java.io.*;
import java.util.*;


public class main {

    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

        ArrayList<llibrePaper> libros = new ArrayList<>();
        ArrayList<audioLlibre> audios = new ArrayList<>();
        ArrayList<vinil> vinilo = new ArrayList<>();
        ArrayList<treballador> trabajador = new ArrayList<>();
        ArrayList<client> cliente = new ArrayList<>();

        libros.add( new llibrePaper("Harry Potter 1","jk", "Ficcio", "1a","true", 700, 25636985));
        libros.add( new llibrePaper("Harry Potter 2","jk", "Ficcio", "2b", "true", 550, 74696885));

        audios.add( new audioLlibre("Harry Potter 1","jk", "Ficcio", "1A", "true", 120));
        audios.add( new audioLlibre("Harry Potter 2","jk", "Ficcio", "2B", "true", 250));

        vinilo.add( new vinil("Mix dembow","Dj Mario", "Dembow", "1A", "true", 5, 15));
        vinilo.add( new vinil("Mix electro","Dj Tiësto", "Electronica", "2B", "true", 4, 12));

        trabajador.add( new treballador("Adrian", "Menendez", "548779632L", "adrian.menendez@gmail.com", 1));
        trabajador.add( new treballador("Emma", "Rueda", "548794632K", "emma.rueda@gmail.com", 2));

        cliente.add( new client("Ivan", "Gonzalex", "658745632H", "ivan.gonzalez@gmail.com", 01));
        cliente.add( new client("John", "Pombo", "587456338G", "john.pombo@gmail.com", 02));


        System.out.println("1. Cliente");
        System.out.println("2. Trabajador");
        System.out.println("3. Buscador");
        System.out.println("4. Salir");

        int valor;
       // Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero:");
        valor = sc.nextInt();
        switch (valor){
            case 1:
                int valor2;
                System.out.println("----------------------------------------------");
                System.out.println("1. Cliente privado");
                System.out.println("2. Cliente escuela musica");
                System.out.println("3. Salir");

                System.out.println("Introduzca un numero:");
                valor2 = sc.nextInt();
                switch (valor2){
                    case 1:
                        client.clientepriv(libros, audios);
                    case 2:
                        client.clienteescu(vinilo);
                    case 3:
                        break;
                }
                break;

            case 2:
                int valor3;
                System.out.println("----------------------------------------------");
                System.out.println("1. Bibliotecario");
                System.out.println("2. Administrador");
                System.out.println("3. Salir");

                System.out.println("Introduzca un numero:");
                valor3 = sc.nextInt();
                switch (valor3){
                    case 1:
                        int bli;
                        System.out.println("----------------------------------------------");
                        System.out.println("1. Libros");
                        System.out.println("2. Audio libros");
                        System.out.println("3. Vinilos");
                        System.out.println("4. Listado clientes");
                        System.out.println("5. Listado trabajadores");
                        System.out.println("6. Salir");

                        System.out.println("Introduzca un numero:");
                        bli = sc.nextInt();
                        switch (bli){
                            case 1:
                                int men;
                                System.out.println("----------------------------------------------");
                                System.out.println("1. Añadir libros");
                                System.out.println("2. Listado libros");
                                System.out.println("3. Modificar libros");
                                System.out.println("4. Eliminar libros");
                                System.out.println("5. Salir");
                                System.out.println("Introduzca un numero:");

                                men = sc.nextInt();
                                switch (men){
                                    case 1:
                                        llibrePaper.AnadirLibroPapel();
                                        break;
                                    case 2:
                                        Iterator it = libros.iterator();
                                        while(it.hasNext())
                                            System.out.println(it.next());
                                        break;
                                    case 3:
                                        llibrePaper.modificarLibroPapel();
                                        break;
                                    case 4:
                                        llibrePaper.eliminarLibroPapel();
                                        break;
                                    case 5:
                                        break;
                                }
                                break;

                            case 2:
                                int men2;
                                System.out.println("----------------------------------------------");
                                System.out.println("1. Añadir audio libros");
                                System.out.println("2. Listado audio libros");
                                System.out.println("3. Modificar audio libros");
                                System.out.println("4. Eliminar audio libros");
                                System.out.println("5. Salir");

                                System.out.println("Introduzca un numero:");
                                men2 = sc.nextInt();
                                switch (men2){
                                    case 1:
                                        audioLlibre.AnadirAudioLibro();
                                        break;
                                    case 2:
                                        Iterator it = audios.iterator();
                                        while(it.hasNext())
                                            System.out.println(it.next());
                                        break;
                                    case 3:
                                        audioLlibre.modificarAudioLibro();
                                        break;
                                    case 4:
                                        audioLlibre.eliminarAudioLibro();
                                        break;
                                    case 5:
                                        break;
                                }
                                break;
                            case 3:
                                int menu3;
                                System.out.println("----------------------------------------------");
                                System.out.println("1. Añadir vinilos");
                                System.out.println("2. Listado vinilos");
                                System.out.println("3. Modificar vinilos");
                                System.out.println("4. Eliminar vinilos");
                                System.out.println("5. Salir");

                                System.out.println("Introduzca un numero:");
                                menu3 = sc.nextInt();
                                switch (menu3){
                                    case 1:
                                        vinil.AnadirVinilo();
                                        break;
                                    case 2:
                                        Iterator it = vinilo.iterator();
                                        while(it.hasNext())
                                            System.out.println(it.next());
                                        break;
                                    case 3:
                                        vinil.modificarVinilo();
                                        break;
                                    case 4:
                                        vinil.eliminarVinilo();
                                        break;
                                    case 5:
                                        break;
                                }
                                break;
                            case 4:
                                Iterator itera = cliente.iterator();
                                while(itera.hasNext())
                                    System.out.println(itera.next());
                                break;
                            case 5:
                                Iterator iterat = trabajador.iterator();
                                while(iterat.hasNext())
                                    System.out.println(iterat.next());
                                break;
                            case 6:
                                break;
                        }
                        break;
                    case 2:
                        int adm;
                        System.out.println("1. Libros");
                        System.out.println("2. Audio libros");
                        System.out.println("3. Vinilos");
                        System.out.println("4. Clientes");
                        System.out.println("5. Trabajadores");
                        System.out.println("6. Salir");

                        System.out.println("Introduzca un numero:");
                        adm = sc.nextInt();
                        switch (adm){
                            case 1:
                                int menu;
                                System.out.println("----------------------------------------------");
                                System.out.println("1. Añadir libros");
                                System.out.println("2. Listado libros");
                                System.out.println("3. Modificar libros");
                                System.out.println("4. Eliminar libros");
                                System.out.println("5. Salir");

                                System.out.println("Introduzca un numero:");
                                menu = sc.nextInt();
                                switch (menu){
                                    case 1:
                                        llibrePaper.AnadirLibroPapel();
                                        break;
                                    case 2:
                                        Iterator it = libros.iterator();
                                        while(it.hasNext())
                                            System.out.println(it.next());
                                        break;
                                    case 3:
                                        llibrePaper.modificarLibroPapel();
                                        break;
                                    case 4:
                                        llibrePaper.eliminarLibroPapel();
                                        break;
                                    case 5:
                                        break;
                                }
                                break;
                            case 2:
                                int menu2;
                                System.out.println("----------------------------------------------");
                                System.out.println("1. Añadir audio libros");
                                System.out.println("2. Listado audio libros");
                                System.out.println("3. Modificar audio libros");
                                System.out.println("4. Eliminar audio libros");
                                System.out.println("5. Salir");

                                System.out.println("Introduzca un numero:");
                                menu2 = sc.nextInt();
                                switch (menu2){
                                    case 1:
                                        audioLlibre.AnadirAudioLibro();
                                        break;
                                    case 2:
                                        Iterator it = audios.iterator();
                                        while(it.hasNext())
                                            System.out.println(it.next());
                                        break;
                                    case 3:
                                        audioLlibre.modificarAudioLibro();
                                        break;
                                    case 4:
                                        audioLlibre.eliminarAudioLibro();
                                        break;
                                    case 5:
                                        break;
                                }
                                break;
                            case 3:
                                int menu3;
                                System.out.println("----------------------------------------------");
                                System.out.println("1. Añadir vinilos");
                                System.out.println("2. Listado vinilos");
                                System.out.println("3. Modificar vinilos");
                                System.out.println("4. Eliminar vinilos");
                                System.out.println("5. Salir");

                                System.out.println("Introduzca un numero:");
                                menu3 = sc.nextInt();
                                switch (menu3){
                                    case 1:
                                        vinil.AnadirVinilo();
                                        break;
                                    case 2:
                                        Iterator it = vinilo.iterator();
                                        while(it.hasNext())
                                            System.out.println(it.next());
                                        break;
                                    case 3:
                                        vinil.modificarVinilo();
                                        break;
                                    case 4:
                                        vinil.eliminarVinilo();
                                        break;
                                    case 5:
                                        break;
                                }
                                break;
                            case 4:
                                int menu4;
                                System.out.println("----------------------------------------------");
                                System.out.println("1. Añadir clientes");
                                System.out.println("2. Listado clientes");
                                System.out.println("3. Modificar clientes");
                                System.out.println("4. Eliminar clientes");
                                System.out.println("5. Salir");

                                System.out.println("Introduzca un numero:");
                                menu4 = sc.nextInt();
                                switch (menu4){
                                    case 1:
                                        client.AnadirCliente();
                                        break;
                                    case 2:
                                        Iterator it = cliente.iterator();
                                        while(it.hasNext())
                                            System.out.println(it.next());
                                        break;
                                    case 3:
                                        client.modificarCliente();
                                        break;
                                    case 4:
                                        client.eliminarCliente();
                                        break;
                                    case 5:
                                        break;
                                }
                                break;
                            case 5:
                                int menu5;
                                System.out.println("----------------------------------------------");
                                System.out.println("1. Añadir trabajadores");
                                System.out.println("2. Listado trabajadores");
                                System.out.println("3. Modificar trabajadores");
                                System.out.println("4. Eliminar trabajadores");
                                System.out.println("5. Salir");

                                System.out.println("Introduzca un numero:");
                                menu5 = sc.nextInt();
                                switch (menu5){
                                    case 1:
                                        treballador.AnadirTrabajador();
                                        break;
                                    case 2:
                                        Iterator it = trabajador.iterator();
                                        while(it.hasNext())
                                            System.out.println(it.next());
                                        break;
                                    case 3:
                                        treballador.modificarTrabajador();
                                        break;
                                    case 4:
                                        treballador.eliminarTrabajador();
                                        break;
                                    case 5:
                                        break;
                                }
                                break;
                            case 6:
                                break;
                        }
                        break;

                    case 3:
                        break;
                }
                break;

            case 3:
                buscador();
                break;
            case 4:
                break;
        }

    }

    private static void buscador() {
        Scanner sc = new Scanner(System.in);
        double valorB;
        int indiceB = 0;
        System.out.println("Valor a buscar: ");
        valorB = sc.nextDouble();
        llibrePaper.indexOf(valorB);
        audioLlibre.indexOf(valorB);
        vinil.indexOf(valorB);
        if (indiceB != -1) {
            System.out.println("Dato se encuentra en posicion: " + indiceB);
        } else {
            System.out.println("Dato no encontrado");

        }


    }

}
