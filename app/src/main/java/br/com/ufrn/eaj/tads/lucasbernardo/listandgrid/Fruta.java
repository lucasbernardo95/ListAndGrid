package br.com.ufrn.eaj.tads.lucasbernardo.listandgrid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lber on 30/10/2016.
 */

public class Fruta {
    public String nome;
    public int img;

    public Fruta (String nome, int img){
        this.nome = nome;
        this.img = img;
    }

    public static List<Fruta> getFrutas(){
        List<Fruta> frutas = new ArrayList<>();
        frutas.add((new Fruta("Laranja", R.drawable.abacate)));
        frutas.add((new Fruta("Maca", R.drawable.abacate)));
        frutas.add((new Fruta("Pera", R.drawable.abacate)));
        frutas.add((new Fruta("Uva", R.drawable.abacate)));
        frutas.add((new Fruta("Goiaba", R.drawable.abacate)));
        frutas.add((new Fruta("Melao", R.drawable.abacate)));
        frutas.add((new Fruta("Limao", R.drawable.abacate)));
        return frutas;
    }

}
