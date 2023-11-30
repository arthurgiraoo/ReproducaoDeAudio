package br.com.arthur.estudos.modelos;

import java.util.Scanner;

public class Audio {
    private String titulo;
    private int duracao;
    private  int totalDeReproducoes;
    private int curtidas;
    private double classificacao;

    Scanner scanner = new Scanner(System.in);

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public void setTotalDeReproducoes(int totalDeReproducoes) {
        this.totalDeReproducoes = totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(double classificacao) {
        this.classificacao = classificacao;
    }

    public void exibeFicha(){
        System.out.println("Titulo: "+ getTitulo());
        System.out.println("Duração em minutos: "+getDuracao());
        System.out.println("Total de reproduções: "+ getTotalDeReproducoes());
        System.out.println("Likes: "+getCurtidas());
        System.out.println("Classificação: "+ getClassificacao());
    }

    public void reproduzir(int reproducao){
        System.out.println("Se voce quer reproduzir o titulo "+getTitulo());
        System.out.println("digite 1");
        System.out.println("se não digite 2");
        while (true) {
            reproducao = scanner.nextInt();
            if (reproducao == 1){
                System.out.println("Reproduzindo titulo.");
                this.totalDeReproducoes++;
                System.out.println("Total de reproduçoes atual: "+this.totalDeReproducoes);
                break;
            } else if (reproducao == 2){
                System.out.println("Entendido.");
                break;
            } else {
                System.out.println("opcao invalida, tente novamente.");

            }
        }

    }

    public void  curte(int implementaCurtida){
        System.out.println("Você gostou do titulo: "+ getTitulo());
        System.out.println("se sim digite 1 para dar uma like");
        System.out.println("se não digite 2 para dar um dislike");
        while(true) {
            implementaCurtida = scanner.nextInt();
            if (implementaCurtida == 1) {
                this.curtidas++;
                System.out.println("Numero de curtidas atualizado: " + this.curtidas);
                break;
            } else if (implementaCurtida == 2) {
                System.out.println("Obrigado pelo Feedback!");
                System.out.println("Numero atual de curtidas " + this.curtidas);
                break;
            } else {
                System.out.println("Numero invalido");
                System.out.println("tente novamente");
            }
        }
    }
}
