package br.com.arthur.estudos.principal;

import br.com.arthur.estudos.modelos.Musica;
import br.com.arthur.estudos.modelos.Podcast;
import br.com.arthur.estudos.modelos.Preferida;

public class Main {
    public static void main(String[] args) {
    Musica musica = new Musica();

    musica.setTitulo("Maquina do tempo");
    musica.setArtista("MATUE");
    musica.setAlbum("fds no rio");
    musica.setGenero("TRAP");
    musica.setCurtidas(200);
    musica.setTotalDeReproducoes(500);

    musica.exibeFicha();
        System.out.println("--------------------");
    musica.reproduzir(0);
        System.out.println("--------------------");

    musica.curte(0);
        System.out.println("--------------------");

    Podcast podcast = new Podcast();
    podcast.setTitulo("Podpah");
    podcast.setHost("Igão e mítico");
    podcast.setDescricao("Falar besteira");
    podcast.setCurtidas(223);
    podcast.setTotalDeReproducoes(888);

        podcast.exibeFicha();
        System.out.println("--------------------");
        podcast.reproduzir(0);
        System.out.println("--------------------");
        podcast.curte(0);

        System.out.println("--------------------");

        musica.getClassificacao();
        podcast.getClassificacao();
        Preferida preferida = new Preferida();
        preferida.inclui(musica);
        preferida.inclui(podcast);







    }

}