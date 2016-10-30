package br.com.ufrn.eaj.tads.lucasbernardo.listandgrid;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends Activity implements AdapterView.OnItemClickListener{

    ListView lista;
    GridView gird;
    List<Fruta> frutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void mudarParaGridView(View view){
        gird = (GridView) findViewById(R.id.grid);
        frutas = Fruta.getFrutas();
        //seta ao ListView do mainactivity a lista com o conteúdoa ser adaptado a ele
        gird.setAdapter(new CustomAdapter(this, frutas));
        lista = (ListView) findViewById(R.id.lista);
        lista.setAdapter(null);
        gird.setOnItemClickListener(this);
    }

    public void mudarParaListView(View view){
        //Lida o ListView com o ListView do mainactivity
        lista = (ListView) findViewById(R.id.lista);
        //recebe a lista com o conteúdo a ser mostrado no layout
        frutas = Fruta.getFrutas();
        lista.setAdapter(null);
        //seta ao ListView do mainactivity a lista com o conteúdoa ser adaptado a ele
        lista.setAdapter(new CustomAdapter(this, frutas));
        gird = (GridView) findViewById(R.id.grid);
        gird.setAdapter(null);
        lista.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Fruta f = this.frutas.get(position);
        Toast.makeText(this, "Fruta selecionada: "+ f.nome + ", posicao: " + position, Toast.LENGTH_SHORT).show();
    }
}
