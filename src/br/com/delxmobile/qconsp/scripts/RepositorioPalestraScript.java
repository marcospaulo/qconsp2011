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
	"create table palestra ( _id integer primary key autoincrement, horario text not null, titulo text not null, palestrante text not null, resumo text not null, dia text not null, trilha number not null);",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('08:00-09:00', 'Credenciamento e Café da manhã de boas vindas', '', '', 'Sabado', '0');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('09:00-09:15', 'Boas vindas Paulo Silveira (Caelum), Adolfo Menezes Melito (FeComercio) e Leonardo Galvão (InfoQ BR) ', '', '', 'Sabado', '0');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('09:15-10:05', 'Aprendizados de grandes sistemas HTTP-centric', 'Jim Webber', 'Veremos como usar middleware comum de HTML para criar sistemas REST em larga escala usando agile e t�cnicas devops-friendly. Vamos explorar fal�cias sobre arquitetura e custo de middleware tradicional e ver como solu��es open source e gratuitas podem ser usadas para entregar solu��es escal�veis. Esse keynote cobrir� dois estudados de caso construindo sistemas reais em produ��o e comapr�-los com custo/benef�cio de usar middleware propriet�rio, que infelizmente faz os fabricantes parecerem uma op��o cara, al�m de arriscada.', 'Sabado', '0');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('10:05-10:55', 'Por uma Web mais rápida: Técnicas de otimização de Sites', 'Sérgio Lopes', 'Programadores estão acostumados a otimizar seus algoritmos server-side ou suas chamadas ao banco de dados; Designers estão acostumados a otimizar a beleza ou usabilidade dos seus layouts. Mas quem se preocupa em otimizar as páginas e o tempo de carregamento para o usuário? Afinal, este é o único número que realmente importa no fim para o usuário. A evolução dos navegadores e da velocidade das conexões de Internet melhora a cada dia a velocidade de acesso dos nossos Sites. Mas um fato não vai mudar muito cedo: a Web tem uma arquitetura distribuída e a latência das chamadas nunca será ignorável. Isso sem contar as diferenças entre navegadores e a dependência da máquina do cliente. Esta palestra trará estudos feitos pelo Google, Amazon, Shopzilla, Microsoft e até pela Caelum que mostram a importância de se criar Sites rápidos para o usuário. Discutiremos, então, técnicas eficazes para tornar seu Site rápido, como ajustes na granularidade dos request da página, truques nos navegadores e diversas boas práticas. A palestra ideal para quem quer parar de perder dinheiro na Web.', 'Sabado', '0');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('10:55-11:45', 'Engenharia de performance no Twitter', 'Evan Weaver', 'Twitter sofreu crescimento exponencial com um número reduzido de pessoas, hardware e tempo. Aqui discutiremos princípios em que o conhecimento de técnicas de performance podem trazer melhorias dramáticas em um ambiente complexo e restrito. Princípios serão ilustrados com exemplos concorentes de sucessos e lições aprendidas durante o desenvolvimento e operação do Twitter. ', 'Sabado', '0');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('11:45-13:00', 'Intervalo para almoço livre', '', '', 'Sabado', '0');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('13:00-13:10', 'Apresentação', 'Vinicius Quaiato', 'Conhecer qual arquitetura pretende utilizar em suas aplicações hoje é um diferencial. Em uma série de palestras sobre os problemas modernos, veremos soluções com o que há de mais moderno na plataforma .NET, tocando pontos vitais para evoluir sua arquitetura e design com o passar do tempo. ', 'Sabado', '1');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('14:10-15:10', 'REST e o Cloud: feitos um para o outro?', 'Howard Dierking', 'Nos dias de hoje parece impossível não ouvir sobre cloud computing em desenvolvimento de software. Porém, o cloud não faz mágica para resolver problemas de confiabilidade, escalabilidade e custo - em vez disso, ele dá oportunidades para uma arquitetura certa que atenda esses problemas. Nós acreditamos que o estilo RESTful é um bom exemplo dessa arquitetura, e no WCF Web API nós criamos um conjunto de componentes que aproveita melhor o HTTP como protocolo e suporta construir arquiteturas que podem melhor aproveitar o cloud. Neste talk, veremos patterns para criar sistemas RESTful usando o WCF Web API. Também mostraremos como trabalhar com esses serviços no Azure AppFabric e demonstrar como REST no cloud é uma excelente fórmula para atingir uma escalabilidade e confiabilidade na Internet, sem ter um custo do mesmo tamanho. ', 'Sabado', '1');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	"insert into palestra(horario, titulo, palestrante, resumo,dia,trilha) values('', '', '', '', '', '');",
	
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
