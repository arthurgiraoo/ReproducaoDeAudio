package br.com.arthur.estudos.modelos;

public class Preferida {

    public void inclui(Audio audio){
        if(audio.getClassificacao() > 7){
            System.out.println(audio.getTitulo()+" Está bem avaliado");
        }else {
            System.out.println(audio.getTitulo()+" Está mal avaliado");
        }

    }

}
