package br.com.arthur.estudos.modelos;

import br.com.arthur.estudos.modelos.Audio;

public class Podcast extends Audio {
    private String host;
    private String descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void exibeFicha() {
        System.out.println("Nome do br.com.arthur.estudos.modelos.Podcast: "+ getTitulo());
        System.out.println("Nome do Apresentador: "+ getHost());
        System.out.println("Descrição: "+ getDescricao());
        System.out.println("Likes: "+ getCurtidas());
        System.out.println("Views: "+ getTotalDeReproducoes());
    }

    public double getClassificacao() {
        if (this.getCurtidas() >= 50) {
            return 8;
        } else {
            return 3;
        }
    }
}
