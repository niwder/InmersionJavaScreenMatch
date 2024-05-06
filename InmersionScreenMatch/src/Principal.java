import Calculos.CalculadoraDeTiempo;
import modelo.Pelicula;
import modelo.Serie;

import java.util.Scanner;

public class Principal {
    Pelicula peliculaUsuario = new Pelicula();
    Serie serieUsuario = new Serie();
    CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();

    public void muestraElMenu(){
        int opcion =  0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienveni@s a ScreentMach
                    1) Registrar nueva pelicula
                    2) Registrar nueva serie
                    3) Calculadora  de tiempo
                    9) Salir
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la Pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de Lanzamiento de la pelicula");
                     int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duracion en minutos de la pelicula");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();


                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    calculadoraDeTiempo.incluye(peliculaUsuario);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre de la Serie");
                     String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de Lanzamiento de la Serie");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa el numero de temporadas para este serie");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingresa la cantidad de episodios por cada temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duracion en minutos de cada episodio");
                    int minutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();


                    serieUsuario.setNombre (nombreSerie);
                    serieUsuario. setFechaDeLanzamiento (fechaDeLanzamientoSerie);
                    serieUsuario. setTemporadas (temporadas);
                    serieUsuario. setEpisodiosPorTemporada (episodiosPorTemporada);
                    serieUsuario.setDuracionEnMinutosporEpisodio(minutosPorEpisodio);
                    calculadoraDeTiempo.incluye(serieUsuario);
                    serieUsuario.muestraFichaTecnica();

                    break;

                case 3:
                    System.out.println("Tiempo necesario para maratonar tus titulos favoritos " +
                            calculadoraDeTiempo.getTiempoTotal() + " minutos");
                    break;

                case 9:
                    System.out.println("Saliendo del sistema");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }
    }
}
