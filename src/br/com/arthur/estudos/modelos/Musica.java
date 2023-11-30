package br.com.arthur.estudos.modelos;

import br.com.arthur.estudos.modelos.Audio;

public class Musica extends Audio {

    private String album;
    private String artista;
    private String genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void exibeFicha() {
        System.out.println("Nome da musica: "+ getTitulo());
        System.out.println("Nome do artista: "+ getArtista());
        System.out.println("Album: "+ getAlbum());
        System.out.println("Genero: "+ getGenero());
        System.out.println("Likes: "+ getCurtidas());
        System.out.println("Views: "+ getTotalDeReproducoes());
    }

    @Override
    public double getClassificacao() {
        if (this.getTotalDeReproducoes() >= 50) {
            return 8;
        } else {
            return 3;
        }
    }
}
