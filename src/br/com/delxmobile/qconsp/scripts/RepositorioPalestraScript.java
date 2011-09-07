package br.com.delxmobile.qconsp.scripts;

import br.com.delxmobile.qconsp.database.RepositorioPalestra;
import br.com.delxmobile.qconsp.util.SQLiteHelper;
import android.content.Context;
import android.util.Log;

public class RepositorioPalestraScript extends RepositorioPalestra {

	// Script para fazer drop na tabela
	private static final String SCRIPT_DATABASE_DELETE = "DROP TABLE IF EXISTS palestra";

	// Cria a tabela com o "_id" sequencial
	private static final String[] SCRIPT_DATABASE_CREATE = new String[] {
	"create table palestra ( _id integer primary key autoincrement, horario text not null, titulo text not null, palestrante text not null, resumo text not null, dia text not null);",
	"insert into palestra(horario, titulo, palestrante, resumo,dia) values('09:15-10:05', 'Aprendizados de grandes sistemas HTTP-centric', 'Jim Webber', 'Veremos como usar middleware comum de HTML para criar sistemas REST em larga escala usando agile e t�cnicas devops-friendly. Vamos explorar fal�cias sobre arquitetura e custo de middleware tradicional e ver como solu��es open source e gratuitas podem ser usadas para entregar solu��es escal�veis. Esse keynote cobrir� dois estudados de caso construindo sistemas reais em produ��o e comapr�-los com custo/benef�cio de usar middleware propriet�rio, que infelizmente faz os fabricantes parecerem uma op��o cara, al�m de arriscada.', 'Sabado');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia) values('09:15-10:05', 'Aprendizados de grandes sistemas HTTP-centric', 'Jim Webber', 'Veremos como usar middleware comum de HTML para criar sistemas REST em larga escala usando agile e t�cnicas devops-friendly. Vamos explorar fal�cias sobre arquitetura e custo de middleware tradicional e ver como solu��es open source e gratuitas podem ser usadas para entregar solu��es escal�veis. Esse keynote cobrir� dois estudados de caso construindo sistemas reais em produ��o e comapr�-los com custo/benef�cio de usar middleware propriet�rio, que infelizmente faz os fabricantes parecerem uma op��o cara, al�m de arriscada.', 'Sabado');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia) values('09:15-10:05', 'Aprendizados de grandes sistemas HTTP-centric', 'Jim Webber', 'Veremos como usar middleware comum de HTML para criar sistemas REST em larga escala usando agile e t�cnicas devops-friendly. Vamos explorar fal�cias sobre arquitetura e custo de middleware tradicional e ver como solu��es open source e gratuitas podem ser usadas para entregar solu��es escal�veis. Esse keynote cobrir� dois estudados de caso construindo sistemas reais em produ��o e comapr�-los com custo/benef�cio de usar middleware propriet�rio, que infelizmente faz os fabricantes parecerem uma op��o cara, al�m de arriscada.', 'Sabado');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia) values('09:15-10:05', 'Aprendizados de grandes sistemas HTTP-centric', 'Jim Webber', 'Veremos como usar middleware comum de HTML para criar sistemas REST em larga escala usando agile e t�cnicas devops-friendly. Vamos explorar fal�cias sobre arquitetura e custo de middleware tradicional e ver como solu��es open source e gratuitas podem ser usadas para entregar solu��es escal�veis. Esse keynote cobrir� dois estudados de caso construindo sistemas reais em produ��o e comapr�-los com custo/benef�cio de usar middleware propriet�rio, que infelizmente faz os fabricantes parecerem uma op��o cara, al�m de arriscada.', 'Sabado');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia) values('09:15-10:05', 'Aprendizados de grandes sistemas HTTP-centric', 'Jim Webber', 'Veremos como usar middleware comum de HTML para criar sistemas REST em larga escala usando agile e t�cnicas devops-friendly. Vamos explorar fal�cias sobre arquitetura e custo de middleware tradicional e ver como solu��es open source e gratuitas podem ser usadas para entregar solu��es escal�veis. Esse keynote cobrir� dois estudados de caso construindo sistemas reais em produ��o e comapr�-los com custo/benef�cio de usar middleware propriet�rio, que infelizmente faz os fabricantes parecerem uma op��o cara, al�m de arriscada.', 'Sabado');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia) values('09:15-10:05', 'Aprendizados de grandes sistemas HTTP-centric', 'Jim Webber', 'Veremos como usar middleware comum de HTML para criar sistemas REST em larga escala usando agile e t�cnicas devops-friendly. Vamos explorar fal�cias sobre arquitetura e custo de middleware tradicional e ver como solu��es open source e gratuitas podem ser usadas para entregar solu��es escal�veis. Esse keynote cobrir� dois estudados de caso construindo sistemas reais em produ��o e comapr�-los com custo/benef�cio de usar middleware propriet�rio, que infelizmente faz os fabricantes parecerem uma op��o cara, al�m de arriscada.', 'Sabado');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia) values('09:15-10:05', 'Aprendizados de grandes sistemas HTTP-centric', 'Jim Webber', 'Veremos como usar middleware comum de HTML para criar sistemas REST em larga escala usando agile e t�cnicas devops-friendly. Vamos explorar fal�cias sobre arquitetura e custo de middleware tradicional e ver como solu��es open source e gratuitas podem ser usadas para entregar solu��es escal�veis. Esse keynote cobrir� dois estudados de caso construindo sistemas reais em produ��o e comapr�-los com custo/benef�cio de usar middleware propriet�rio, que infelizmente faz os fabricantes parecerem uma op��o cara, al�m de arriscada.', 'Sabado');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia) values('09:15-10:05', 'Aprendizados de grandes sistemas HTTP-centric', 'Jim Webber', 'Veremos como usar middleware comum de HTML para criar sistemas REST em larga escala usando agile e t�cnicas devops-friendly. Vamos explorar fal�cias sobre arquitetura e custo de middleware tradicional e ver como solu��es open source e gratuitas podem ser usadas para entregar solu��es escal�veis. Esse keynote cobrir� dois estudados de caso construindo sistemas reais em produ��o e comapr�-los com custo/benef�cio de usar middleware propriet�rio, que infelizmente faz os fabricantes parecerem uma op��o cara, al�m de arriscada.', 'Sabado');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia) values('09:15-10:05', 'Aprendizados de grandes sistemas HTTP-centric', 'Jim Webber', 'Veremos como usar middleware comum de HTML para criar sistemas REST em larga escala usando agile e t�cnicas devops-friendly. Vamos explorar fal�cias sobre arquitetura e custo de middleware tradicional e ver como solu��es open source e gratuitas podem ser usadas para entregar solu��es escal�veis. Esse keynote cobrir� dois estudados de caso construindo sistemas reais em produ��o e comapr�-los com custo/benef�cio de usar middleware propriet�rio, que infelizmente faz os fabricantes parecerem uma op��o cara, al�m de arriscada.', 'Sabado');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia) values('09:15-10:05', 'Aprendizados de grandes sistemas HTTP-centric', 'Jim Webber', 'Veremos como usar middleware comum de HTML para criar sistemas REST em larga escala usando agile e t�cnicas devops-friendly. Vamos explorar fal�cias sobre arquitetura e custo de middleware tradicional e ver como solu��es open source e gratuitas podem ser usadas para entregar solu��es escal�veis. Esse keynote cobrir� dois estudados de caso construindo sistemas reais em produ��o e comapr�-los com custo/benef�cio de usar middleware propriet�rio, que infelizmente faz os fabricantes parecerem uma op��o cara, al�m de arriscada.', 'Sabado');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia) values('09:15-10:05', 'Aprendizados de grandes sistemas HTTP-centric', 'Jim Webber', 'Veremos como usar middleware comum de HTML para criar sistemas REST em larga escala usando agile e t�cnicas devops-friendly. Vamos explorar fal�cias sobre arquitetura e custo de middleware tradicional e ver como solu��es open source e gratuitas podem ser usadas para entregar solu��es escal�veis. Esse keynote cobrir� dois estudados de caso construindo sistemas reais em produ��o e comapr�-los com custo/benef�cio de usar middleware propriet�rio, que infelizmente faz os fabricantes parecerem uma op��o cara, al�m de arriscada.', 'Sabado');"

	};

	// Nome do banco
	private static final String NOME_BANCO = "delx_palestra";

	// Controle de vers�o
	private static final int VERSAO_BANCO = 1;

	// Nome da tabela
	public static final String TABELA_PALESTRA = "palestra";

	// Classe utilit�ria para abrir, criar, e atualizar o banco de dados
	private SQLiteHelper dbHelper;

	// Cria o banco de dados com um script SQL
	public RepositorioPalestraScript(Context ctx) {
		// Criar utilizando um script SQL
		dbHelper = new SQLiteHelper(ctx, RepositorioPalestraScript.NOME_BANCO, RepositorioPalestraScript.VERSAO_BANCO,
				RepositorioPalestraScript.SCRIPT_DATABASE_CREATE, RepositorioPalestraScript.SCRIPT_DATABASE_DELETE);

		// abre o banco no modo escrita para poder alterar tamb�m
		db = dbHelper.getWritableDatabase();
	}

	// Fecha o banco
	@Override
	public void fechar() {
		super.fechar();
		if (dbHelper != null) {
			dbHelper.close();
		}
	}
}
