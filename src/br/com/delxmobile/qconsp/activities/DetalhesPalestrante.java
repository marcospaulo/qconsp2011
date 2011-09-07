package br.com.delxmobile.qconsp.activities;

import br.com.delxmobile.qconsp.R;
import br.com.delxmobile.qconsp.database.RepositorioPalestrante;
import br.com.delxmobile.qconsp.objects.Palestra.Palestras;
import br.com.delxmobile.qconsp.objects.Palestrante;
import br.com.delxmobile.qconsp.objects.Palestrante.Palestrantes;
import br.com.delxmobile.qconsp.scripts.RepositorioPalestranteScript;
import br.com.delxmobile.qconsp.util.ActivityHelper;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class DetalhesPalestrante extends Activity {
	/** Called when the activity is first created. */

	public RepositorioPalestrante repositorio;
	Long id;
	Palestrante c;
	ActivityHelper mActivityHelper = ActivityHelper.createInstance(this);
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detalhespalestrante);
		repositorio = new RepositorioPalestranteScript(this);
		mActivityHelper.setupActionBar("Palestrante");

		//Pega o atributo posicao da tela anterior
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			id = Long.parseLong(extras.getString("posicao"));
			id++;
		}
		c = repositorio.buscarPalestrante(id);

		// Atualiza o valor do TextView
		TextView nome = (TextView) findViewById(R.id.nome);
		nome.setText(c.nome);

		TextView palestra = (TextView) findViewById(R.id.palestra);
		if(c.palestra.equals("")){
			palestra.setText("");
		}
		else{
			palestra.setText("Palestra: " + c.palestra);
			//Ver palestra
		}

		TextView perfil = (TextView) findViewById(R.id.perfil);
		perfil.setText(c.perfil);

		ImageView foto = (ImageView) findViewById(R.id.foto);
		foto.setImageResource(fotos[c.foto]);


	}
	@Override
	protected void onDestroy() {
		super.onDestroy();

		// Fecha o banco
		repositorio.fechar();
	}

	public Integer[] fotos = {
			R.drawable.w01,
			R.drawable.w02,
			R.drawable.w03,
			R.drawable.w04,
			R.drawable.w05,
			R.drawable.w06,
			R.drawable.w07,
			R.drawable.w08,
			R.drawable.w09,
			R.drawable.w10,
			R.drawable.w11,
			R.drawable.w12,
			R.drawable.w13,
			R.drawable.w14,
			R.drawable.w15,
			R.drawable.w16,
			R.drawable.w17,
			R.drawable.w18,
			R.drawable.w19,
			R.drawable.w20,
			R.drawable.w21,
			R.drawable.w22,
			R.drawable.w23,
			R.drawable.w24,
			R.drawable.w25,
			R.drawable.w26,
			R.drawable.w27,
			R.drawable.w28,
			R.drawable.w29,
			R.drawable.w30,
			R.drawable.w31,
			R.drawable.w32,
			R.drawable.w33,
			R.drawable.w34,
			R.drawable.w35,
			R.drawable.w36,
			R.drawable.w37,
			R.drawable.w38,
			R.drawable.w39,
			R.drawable.w40,
			R.drawable.w41,
			R.drawable.w42,
			R.drawable.w43,
			R.drawable.w44,
			R.drawable.w45,
			R.drawable.w46,
			R.drawable.w47,
			R.drawable.w48,
			R.drawable.w49,
			R.drawable.w50,
			R.drawable.w51,
			R.drawable.w52,
			R.drawable.w53,
			R.drawable.w54,
			R.drawable.w55,
			R.drawable.w56,
			R.drawable.w57,
			R.drawable.w58,
			R.drawable.w59,
			R.drawable.w60,
			R.drawable.w61,

	};

}