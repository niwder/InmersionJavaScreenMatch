import java.util.Scanner;

public class Screenmatch {
    public static void main(String[] args) {
        //System.out.println("Pelicula Forrest Gump");

        int fechaDeLanzamiento = 1994;
        double evaluacion = 9.8;
        boolean incluidoEnElPlan = true;
        String nombre = "Forrest Gump";
        String sinopsis = """
                Forrest Gump es un chico que, con sus limitaciones, contempla la vida con una mirada tierna y cándida. Su persistencia y bondad, valores que le ha inculcado su protectora madre, le llevan a vivir insospechadas peripecias que son un testimonio de la historia de Estados Unidos entre 1950 y 1980.              
                """;
        double mediaEvaluacionUsario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Sinopsis: " + sinopsis);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Calificacion: " + evaluacion);
        System.out.println(incluidoEnElPlan);

        double mediaEvaluacion = (9.8 + 9.7 + 9.9) / 3;
        System.out.println("Media Calificacion: " + mediaEvaluacion);

        //depende de como yo ponga menor(<) o mayor (>) esto funciona bien.
        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular en el momento");
        } else {
            System.out.println("Pelicula Retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese su calificacion: ");
            double calificacionPelicula = teclado.nextDouble();
            mediaEvaluacionUsario = mediaEvaluacionUsario + calificacionPelicula;
            }
        System.out.println("La media de la pelicula "
        + "Forrest Gump calculada por el usario es: " + mediaEvaluacionUsario / 3 );
    }
}
