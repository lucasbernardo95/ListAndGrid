package br.com.ufrn.eaj.tads.lucasbernardo.listandgrid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lber on 30/10/2016.
 */

public class CustomAdapter extends BaseAdapter{

    private List<Fruta> lista;
    private Context context;

    public CustomAdapter(Context context, List<Fruta> lista){
        this.context = context;
        this.lista = lista;
    }

    @Override
    public int getCount() {
        return lista != null ? lista.size() : 0;
    }

    @Override
    public Object getItem(int position) {
        return lista.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //indico qual layout será inflado
        View view = LayoutInflater.from(context).inflate(R.layout.layout_inflater, parent, false);
        //recupera a fruta que foi clicada
        Fruta fruta = (Fruta) lista.get(position);
        //seta o nome da fruta ao textview do layout_inflater
        TextView t =(TextView) view.findViewById(R.id.nome);
        ImageView i = (ImageView) view.findViewById(R.id.img);
        t.setText(fruta.nome);
        i.setImageResource(fruta.img);
        return view;
    }
}
