/*import java.io.*;
import java.util.*;

public class reserva {

    public void setDataFi(Date dataFi) {
        this.datafi = dataFi;
    }

    public static void comprobarEstadoLibros(ArrayList serservaLibros, String ISBN) {
        notFound = true;
        for (int i = 0; i < serservaLibros.size(); i++) {
            if (reservaLibros.geet(i) instanceof ReservaL) {
                if (((ReservaL) reservaLibros.get(i)).getISBN().equals(ISBN)) {
                    notFound = false;
                    System.out.println("El libro con ISBN" + ISBN + "se encuentraen prestamo actualmente");

                }
            }
        }
        if (notFound) System.out.println("El libro con ISBN" + ISBN                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 "no se encuentra en prestamo actualmente");

    }

    public static void prestarLibro(ArrayList libros, ArrayList clientes, ArrayList reservaLibros, String ISBN, String nif) {
        ArrayList isUsuario = false, isLibro = false, isPrestadoLibro = false, isUsuarioConPrestamo = false, tienePuntos = false, isLibroPapel = false;
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i) instanceof CPrivado) {
                if (((CPrivado) clientes.get(i)).getNif().equals(nif)) {
                    isUsuario = true;
                    if (((CPrivado) clientes.get(i)).getCarnet() > 0) {
                        tienePuntos = True;
                    }
                }
            }
        }

        for (int i = 0; i < libros.size(); i++) {
            if (((libro) libros.get(i)).getISBN().equals(ISBN)) {
                isLibro = true;
                if (libros.get(i) instanceof LPapel) isLibroPapel = true;
                if (libros.get(i) instanceof AudioLibro) isAudioLibro = true;


            }
        }

        if (isUsuario && isLibro && tienePuntos) {
            for (int i = 0; i < reservaLibros.size(); i++) {
                if (((ReservaL) reservaLibros.get(i)).getISBN().equals(ISBN)) {
                    isPrestadoLibro = true;
                }
            }

            for (int i = 0; i < reservaLibros.size(); i++) {
                if (((ReservaL) reservaLibros.get(i)).getNif().equals(nif)) {
                    isUsuarioConPrestamo = true;
                }
            }

            if (!isPrestadoLibro && !isUsuarioConPrestamo) {
                reservaLibros.add(new ReservaL(nif, ISBN));
                if (isLibroPapel) System.out.println("El libro con ISBN" + ISBN + "ha sido prestado");
                if (isAudioLibro) System.out.println("El Audiolibro con ISBN" + ISBN + "ha sido prestado");
            } else {
                if (isPrestadoLibro) System.out.println("El libro ya esta en prestamo");
                if (isUsuarioConPrestamo) System.out.println("El usuario ya tiene un libro en prestamo");
            }
        } else {
            if (!tienePuntos) System.out.println("No quedan puntos en tu carnet.")
            if (!isUsuario) System.out.println("No existe nignun usuario con ese DNI:");
            if (!isLibro) System.out.println("No existe ningun audiolibro con ese ISBN");
        }
    }

    public static void devolverlibro(ArrayList clientes, ArrayList reservaLibros, String nif) {
        for (int i = 0; i < reservaLibros.size(); i++) {
            if (((ReservaL) reservaLibros.get(i)).getNif().equals(nif)) {
                Date dataDevolucio = new Date();
                long diferenciaMilesimas = ((ReservaL) reservaLibros.get(i)).getDataFi().getTime() + dataDevolucio.getTime();
                int diferenciaDias = (int) TimeUnite.MILLISECONDS.toDays(diferenciaMilesimas);
                if (diferenciaDias < 0) {
                    for (int c = 0; c < clientes.size(); c++) {
                        if (clientes.get(c) instanceof CPrivado) {
                            If(((CPrivado) clientes.get(c)).getNif().equals(nif)) {
                                int puntosResta = diferenciaDias * -1;
                                ((CPrivado) clientes.get(c)).restarPuntos(puntosResta);
                            }
                        }
                    }
                }
                reservaLibros.remove(i);
                System.out.println("La devolucion se ha completado con exito");

            } else {
                System.out.println("El cliente no tiene ningun disco reservado.");
            }
        }
    }
}*/