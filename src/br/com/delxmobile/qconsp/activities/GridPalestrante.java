package br.com.delxmobile.qconsp.activities;
import br.com.delxmobile.qconsp.R;
import br.com.delxmobile.qconsp.adapters.ImagePalestranteAdapter;
import br.com.delxmobile.qconsp.util.ActivityHelper;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;


public class GridPalestrante extends Activity {
	/** Called when the activity is first created. */
	protected static final int INSERIR_EDITAR = 1;
	protected static final int BUSCAR = 2;
	ActivityHelper mActivityHelper = ActivityHelper.createInstance(this);
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.gridpalestrante);
		mActivityHelper.setupActionBar("Palestrantes");

		GridView gridview = (GridView) findViewById(R.id.gridview);
		gridview.setAdapter(new ImagePalestranteAdapter(this));


		gridview.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
				Intent it = new Intent(GridPalestrante.this, DetalhesPalestrante.class);
				// Passa a posicao da imagem no gridview
				String posicao = String.valueOf(position);  
				it.putExtra("posicao", posicao);
				startActivity(it);

			}
		});
	}


	//	@Override
	//	public boolean onCreateOptionsMenu(Menu menu) {
	//		super.onCreateOptionsMenu(menu);
	//		menu.add(0, INSERIR_EDITAR, 0, "Cinco Estrelas").setIcon(R.drawable.icon);
	//		menu.add(0, BUSCAR, 0, "Buscar").setIcon(R.drawable.icon);
	//		return true;
	//	}
	//
	//	@Override
	//	public boolean onMenuItemSelected(int featureId, MenuItem item) {
	//		// Clicou no menu
	//		switch (item.getItemId()) {
	//		case INSERIR_EDITAR:
	//			// Abre a tela com o formul�rio para adicionar
	//			startActivity(new Intent(LogoInspirationLiteActivity.this, CincoEstrelas.class));
	//			break;
	//		case BUSCAR:
	//			// Abre a tela para buscar o carro pelo nome
	//			//startActivity(new Intent(this, BuscarDizimo.class));
	//			break;
	//		}
	//		return true;
	//	}


}