package br.com.delxmobile.qconsp.objects;

import android.provider.BaseColumns;


public class Palestra {

	public static String[] colunas = new String[] { Palestras._ID, Palestras.HORARIO, Palestras.TITULO, Palestras.PALESTRANTE, Palestras.RESUMO, Palestras.DIA};

	
	public long id;
	public String horario;
	public String titulo;
	public String palestrante;
	public String resumo;
	public String dia;
	
	public Palestra() {
	}

	public Palestra(String horario, String titulo, String palestrante, String resumo, String dia) {
		super();
		this.horario = horario;
		this.titulo = titulo;
		this.palestrante = palestrante;
		this.resumo = resumo;
		this.dia = dia;
	
	}



	public static final class Palestras implements BaseColumns {

		public static final String HORARIO = "horario";
		public static final String TITULO = "titulo";
		public static final String PALESTRANTE = "palestrante";
		public static final String RESUMO = "resumo";
		public static final String DIA = "dia";

		// N�o pode instanciar esta Classe
		private Palestras() {
		}

	}

}
