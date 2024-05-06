package modelo;

public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private int duracionEnMinutosporEpisodio;

    @Override
    public int getTiempoDeDuracionEnMinutos() {
        return temporadas *  episodiosPorTemporada *   duracionEnMinutosporEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracionEnMinutosporEpisodio() {
        return duracionEnMinutosporEpisodio;
    }

    public void setDuracionEnMinutosporEpisodio(int duracionEnMinutosporEpisodio) {
        this.duracionEnMinutosporEpisodio = duracionEnMinutosporEpisodio;
    }
}
