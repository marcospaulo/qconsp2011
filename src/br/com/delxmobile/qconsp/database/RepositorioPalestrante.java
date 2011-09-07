package br.com.delxmobile.qconsp.database;

import java.util.ArrayList;
import java.util.List;

import br.com.delxmobile.qconsp.objects.Palestrante;
import br.com.delxmobile.qconsp.objects.Palestrante.Palestrantes;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;


public class RepositorioPalestrante {
	private static final String CATEGORIA = "Palestrante";

	// Nome do banco
	private static final String NOME_BANCO = "delx_palestrante";
	// Nome da tabela
	public static final String NOME_TABELA = "palestrante";

	protected SQLiteDatabase db;

	//Abre conex�o com o BD
	public RepositorioPalestrante(Context ctx) {
		// Abre o banco de dados j� existente
		db = ctx.openOrCreateDatabase(NOME_BANCO, Context.MODE_PRIVATE, null);
	}

	protected RepositorioPalestrante() {
		// Apenas para criar uma subclasse...
	}

	// Busca palestrante pelo id
	public Palestrante buscarPalestrante(long id) {

		Cursor c = db.query(true, NOME_TABELA, Palestrante.colunas,Palestrantes._ID + "=" + id, null, null, null, null, null);

		if (c.getCount() > 0) {

			// Posicinoa no primeiro elemento do cursor
			c.moveToFirst();

			// Recupera os �ndices das colunas
			int idxId = c.getColumnIndex(Palestrantes._ID);
			int idxNome = c.getColumnIndex(Palestrantes.NOME);
			int idxPerfil = c.getColumnIndex(Palestrantes.PERFIL);
			int idxPalestra = c.getColumnIndex(Palestrantes.PALESTRA);
			int idxFoto = c.getColumnIndex(Palestrantes.FOTO);


			Palestrante palestrante = new Palestrante();


			// recupera os atributos o palestrante
			palestrante.id = c.getLong(idxId);
			palestrante.nome = c.getString(idxNome);
			palestrante.perfil = c.getString(idxPerfil);
			palestrante.palestra = c.getString(idxPalestra);
			palestrante.foto = c.getInt(idxFoto);

			return palestrante;
		}

		return null;
	}
	
	// Busca palestrante pelo id
		public Palestrante buscarPalestranteNome(String nome) {

			Cursor c = db.query(true, NOME_TABELA, Palestrante.colunas,Palestrantes.NOME + "= '" + nome + "'", null, null, null, null, null);

			if (c.getCount() > 0) {

				// Posicinoa no primeiro elemento do cursor
				c.moveToFirst();

				// Recupera os �ndices das colunas
				int idxId = c.getColumnIndex(Palestrantes._ID);
				int idxNome = c.getColumnIndex(Palestrantes.NOME);
				int idxPerfil = c.getColumnIndex(Palestrantes.PERFIL);
				int idxPalestra = c.getColumnIndex(Palestrantes.PALESTRA);
				int idxFoto = c.getColumnIndex(Palestrantes.FOTO);


				Palestrante palestrante = new Palestrante();


				// recupera os atributos o palestrante
				palestrante.id = c.getLong(idxId);
				palestrante.nome = c.getString(idxNome);
				palestrante.perfil = c.getString(idxPerfil);
				palestrante.palestra = c.getString(idxPalestra);
				palestrante.foto = c.getInt(idxFoto);

				return palestrante;
			}

			return null;
		}

	// Retorna um cursor com palestras no sabado
	public Cursor getCursor() {
		try {
			return  db.query(NOME_TABELA, Palestrante.colunas, null, null, null, null, null,null);
		} catch (SQLException e) {
			Log.e(CATEGORIA ,"  "+  e);
			return null;
		}
	}

	// Retorna uma lista com palestras no sabado
	public List<Palestrante> listarPalestrantes() {
		Cursor c = getCursor();

		List<Palestrante> palestrantes = new ArrayList<Palestrante>();

		if (c.moveToFirst()) {

			// Recupera os �ndices das colunas
			int idxId = c.getColumnIndex(Palestrantes._ID);
			int idxNome = c.getColumnIndex(Palestrantes.NOME);
			int idxPerfil = c.getColumnIndex(Palestrantes.PERFIL);
			int idxPalestra = c.getColumnIndex(Palestrantes.PALESTRA);
			int idxFoto = c.getColumnIndex(Palestrantes.FOTO);

			// Loop at� o final
			do {
				Palestrante palestrante = new Palestrante();
				palestrantes.add(palestrante);
				// recupera os atributos da palestra
				palestrante.id = c.getLong(idxId);
				palestrante.nome = c.getString(idxNome);
				palestrante.perfil = c.getString(idxPerfil);
				palestrante.palestra = c.getString(idxPalestra);
				palestrante.foto = c.getInt(idxFoto);


			} while (c.moveToNext());
		}

		return palestrantes;
	}


	// Fecha o banco
	public void fechar() {
		// fecha o banco de dados
		if (db != null) {
			db.close();
		}
	}
}
