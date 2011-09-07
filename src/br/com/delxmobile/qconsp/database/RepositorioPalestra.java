package br.com.delxmobile.qconsp.database;

import java.util.ArrayList;
import java.util.List;

import br.com.delxmobile.qconsp.objects.Palestra;
import br.com.delxmobile.qconsp.objects.Palestra.Palestras;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;


public class RepositorioPalestra {
	private static final String CATEGORIA = "Palestra";

	// Nome do banco
	private static final String NOME_BANCO = "delx_palestra";
	// Nome da tabela
	public static final String NOME_TABELA = "palestra";

	protected SQLiteDatabase db;

	//Abre conex�o com o BD
	public RepositorioPalestra(Context ctx) {
		// Abre o banco de dados j� existente
		db = ctx.openOrCreateDatabase(NOME_BANCO, Context.MODE_PRIVATE, null);
	}

	protected RepositorioPalestra() {
		// Apenas para criar uma subclasse...
	}

	// Busca a dica pelo id
	public Palestra buscarPalestra(long id) {

		Cursor c = db.query(true, NOME_TABELA, Palestra.colunas,Palestras._ID + "=" + id, null, null, null, null, null);

		if (c.getCount() > 0) {

			// Posicinoa no primeiro elemento do cursor
			c.moveToFirst();

			// Recupera os �ndices das colunas
			int idxId = c.getColumnIndex(Palestras._ID);
			int idxHorario = c.getColumnIndex(Palestras.HORARIO);
			int idxTitulo = c.getColumnIndex(Palestras.TITULO);
			int idxPalestrante = c.getColumnIndex(Palestras.PALESTRANTE);
			int idxResumo = c.getColumnIndex(Palestras.RESUMO);
			int idxDia = c.getColumnIndex(Palestras.DIA);
			int idxTrilha = c.getColumnIndex(Palestras.TRILHA);

			Palestra palestra = new Palestra();


			// recupera os atributos da palestra
			palestra.id = c.getLong(idxId);
			palestra.horario = c.getString(idxHorario);
			palestra.titulo = c.getString(idxTitulo);
			palestra.palestrante = c.getString(idxPalestrante);
			palestra.resumo = c.getString(idxResumo);
			palestra.dia = c.getString(idxDia);
			palestra.trilha = c.getInt(idxTrilha);

			return palestra;
		}

		return null;
	}

	// Retorna um cursor com palestras no sabado
	public Cursor getCursorSabado() {
		try {
			return  db.query(NOME_TABELA, Palestra.colunas, null, null, null, null, null,null);
		} catch (SQLException e) {
			Log.e(CATEGORIA ,"  "+  e);
			return null;
		}
		//Palestras.DIA + "='" + "Sabado" + "'"
	}

	// Retorna uma lista com palestras no sabado
	public List<Palestra> listarPalestraSabado() {
		Cursor c = getCursorSabado();

		List<Palestra> palestras = new ArrayList<Palestra>();

		if (c.moveToFirst()) {

			// Recupera os �ndices das colunas
			int idxId = c.getColumnIndex(Palestras._ID);
			int idxHorario = c.getColumnIndex(Palestras.HORARIO);
			int idxTitulo = c.getColumnIndex(Palestras.TITULO);
			int idxPalestrante = c.getColumnIndex(Palestras.PALESTRANTE);
			int idxResumo = c.getColumnIndex(Palestras.RESUMO);
			int idxDia = c.getColumnIndex(Palestras.DIA);
			int idxTrilha = c.getColumnIndex(Palestras.TRILHA);

			// Loop at� o final
			do {
				Palestra palestra = new Palestra();
				palestras.add(palestra);
				// recupera os atributos da palestra
				palestra.id = c.getLong(idxId);
				palestra.horario = c.getString(idxHorario);
				palestra.titulo = c.getString(idxTitulo);
				palestra.palestrante = c.getString(idxPalestrante);
				palestra.resumo = c.getString(idxResumo);
				palestra.dia = c.getString(idxDia);
				palestra.trilha = c.getInt(idxTrilha);


			} while (c.moveToNext());
		}

		return palestras;
	}


	// Fecha o banco
	public void fechar() {
		// fecha o banco de dados
		if (db != null) {
			db.close();
		}
	}
}
