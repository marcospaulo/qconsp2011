package br.com.delxmobile.qconsp.activities;

import br.com.delxmobile.qconsp.R;
import br.com.delxmobile.qconsp.database.RepositorioPalestra;
import br.com.delxmobile.qconsp.database.RepositorioPalestrante;
import br.com.delxmobile.qconsp.objects.Fotos;
import br.com.delxmobile.qconsp.objects.Palestra;
import br.com.delxmobile.qconsp.objects.Palestra.Palestras;
import br.com.delxmobile.qconsp.objects.Palestrante;
import br.com.delxmobile.qconsp.scripts.RepositorioPalestraScript;
import br.com.delxmobile.qconsp.scripts.RepositorioPalestranteScript;
import br.com.delxmobile.qconsp.util.ActivityHelper;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class DetalhesPalestra extends Activity {
	/** Called when the activity is first created. */

	public RepositorioPalestra repositorio;
	public RepositorioPalestrante repositorio_palestrante;
	Long id;
	Palestra c;
	Palestrante aux;
	ActivityHelper mActivityHelper = ActivityHelper.createInstance(this);
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detalhespalestra);
		repositorio = new RepositorioPalestraScript(this);
		repositorio_palestrante = new RepositorioPalestranteScript(this);
		
		//Pega o atributo posicao da tela anterior
		Bundle extras = getIntent().getExtras();
		if (extras != null) {
			id = extras.getLong(Palestras._ID);
		}
		c = repositorio.buscarPalestra(id);
		aux = repositorio_palestrante.buscarPalestranteNome(c.palestrante);
		
		String title = c.dia;
		mActivityHelper.setupActionBar(title);
		
		
		// Atualiza o valor do TextView
		TextView titulo = (TextView) findViewById(R.id.titulo);
		titulo.setText("Palestra: " + c.titulo);
		
		TextView resumo = (TextView) findViewById(R.id.resumo);
		resumo.setText(c.resumo);
		
		TextView palestrante = (TextView) findViewById(R.id.palestrante);
		palestrante.setText(c.palestrante);
		
		TextView horario = (TextView) findViewById(R.id.horario);
		horario.setText("Hor�rio: " + c.horario + ", " + c.dia);

		ImageView foto = (ImageView) findViewById(R.id.foto);
		foto.setImageResource(fotos[aux.foto]);
		//Share
		ImageButton share = (ImageButton) findViewById(R.id.share);
		share.setOnClickListener(new ImageButton.OnClickListener() {
			public void onClick(View v) {
				String msg = "Estou assistindo a palestra  " +c.titulo + " na QCon S�o Paulo!";
				Intent intent = new Intent(Intent.ACTION_SEND);
				intent.setType("text/plain");
				intent.putExtra(Intent.EXTRA_TEXT, msg);
				startActivity(Intent.createChooser(intent, "Share with"));
			}

		});
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
							
    };
	@Override
	protected void onDestroy() {
		super.onDestroy();

		// Fecha o banco
		repositorio.fechar();
		repositorio_palestrante.fechar();
	}

}