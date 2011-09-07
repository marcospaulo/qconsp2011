package br.com.delxmobile.qconsp.objects;

import android.provider.BaseColumns;


public class Palestrante {

	public static String[] colunas = new String[] { Palestrantes._ID, Palestrantes.NOME, Palestrantes.PERFIL, Palestrantes.PALESTRA, Palestrantes.FOTO};

	
	public long id;
	public String nome;
	public String perfil;
	public String palestra;
	public int foto;
	
	public Palestrante() {
	}

	public Palestrante(String nome, String perfil, String palestra, int foto) {
		super();
		this.nome = nome;
		this.perfil = perfil;
		this.palestra = palestra;
		this.foto = foto;
	}



	public static final class Palestrantes implements BaseColumns {

		public static final String NOME = "nome";
		public static final String PERFIL = "perfil";
		public static final String PALESTRA = "palestra";
		public static final String FOTO = "foto";

	
		private Palestrantes() {
		}

	}

}
