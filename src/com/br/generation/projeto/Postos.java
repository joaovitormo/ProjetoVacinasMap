package com.br.generation.projeto;

import java.util.Scanner;

public class Postos {

	public void CEP() {
		Scanner ler = new Scanner(System.in);
		long cep = 0;

		System.out.print("Digite seu cep: ");
		cep = ler.nextLong();

		if (cep > 1000000 && cep < 1099999) {
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS REPUBLICA FERNANDA SANTE LIMEIRA");
			System.out.println("RUA LIBERO BADARO, 282 CENTRO SÃO PAULO - SP BRASIL 01008-000 ");
			System.out.println();
			System.out.println("UBS SE");
			System.out.println("RUA FREDERICO ALVARENGA, 259 PARQUE DOM PEDRO SÃO PAULO - SP BRASIL 01020-030");
			System.out.println();
			System.out.println("UBS NOSSA S DO BRASIL ARMANDO DARIENZO");
			System.out.println("RUA ALM MARQUES LEAO, 684 BELA VISTA SÃO PAULO - SP BRASIL 01330-010");
			System.out.println();
			System.out.println("UBS SANTA CECILIA");
			System.out.println("RUA VITORINO CARMILO, 599 SANTA CECILIA SÃO PAULO - SP BRASIL 01153-000");
		} else if (cep > 1100000 && cep < 1199999) {
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS BOM RETIRO OCTAVIO AUGUSTO RODOVALHO");
			System.out.println("R TENENTE PENA, 08 BOM RETIRO SÃO PAULO - SP BRASIL 01127-020");
			System.out.println();
			System.out.println("UBS BORACEA");
			System.out.println("RUA BORACEA, 270 SANTA CECILIA SÃO PAULO - SP BRASIL 01135-010");
			System.out.println();
			System.out.println("UBS J VERA CRUZ PERDIZES");
			System.out.println("R SARAMENHA, 60 PERDIZES SÃO PAULO - SP BRASIL 01259-030");
			System.out.println();
		} else if (cep > 1200000 && cep < 1299999) {
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS V ANGLO JOSE SERRA RIBEIRO");
			System.out.println("RUA PALESTRA ITALIA, 165 PARQUE ANTARTICA SÃO PAULO - SP BRASIL 05005-001");
			System.out.println();
			System.out.println("UBS REPUBLICA FERNANDA SANTE LIMEIRA");
			System.out.println("RUA LIBERO BADARO, 282 CENTRO SÃO PAULO - SP BRASIL 01008-000");
			System.out.println();
			System.out.println("UBS NOSSA S DO BRASIL ARMANDO DARIENZO");
			System.out.println("RUA ALM MARQUES LEAO, 684 BELA VISTA SÃO PAULO - SP BRASIL 01330-010");
			System.out.println();
		} else if (cep > 1300000 && cep < 1399999) {
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS NOSSA S DO BRASIL ARMANDO DARIENZO");
			System.out.println("RUA ALM MARQUES LEAO, 684 BELA VISTA SÃO PAULO - SP BRASIL 01330-010");
			System.out.println();
			System.out.println("UBS REPUBLICA FERNANDA SANTE LIMEIRA");
			System.out.println("RUA LIBERO BADARO, 282 CENTRO SÃO PAULO - SP BRASIL 01008-000");
			System.out.println();
			System.out.println("UBS MANUEL JOAQUIM PERA");
			System.out.println("RUA PURPURINA, 280 VILA MADALENA SÃO PAULO - SP BRASIL 05435-030");
			System.out.println();
		} else if (cep > 1400000 && cep < 1499999) {
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS JARDIM EDITE GERONCIO HENRIQUE NETO");
			System.out.println("RUA CHARLES COULOMB, 080 CIDADE MONCOES SÃO PAULO - SP BRASIL 04576-030");
			System.out.println();
			System.out.println("UBS CAXINGUI NANCI ABRANCHES");
			System.out.println("RUA LADISLAU ROMAN, 0410 CAXINGUI SÃO PAULO - SP BRASIL 05515-030");
			System.out.println();
			System.out.println("UBS INDIANOPOLIS SIGMUND FREUD");
			System.out.println("AV INDIANOPOLIS, 650 INDIANOPOLIS SÃO PAULO - SP BRASIL 04062-001");
			System.out.println();
		} else if (cep > 1500000 && cep < 1599999) {
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("BS BELENZINHO MARCUS WOLOSKER");
			System.out.println("AVENIDA CELSO GARCIA, 1749 BELENZINHO SÃO PAULO - SP BRASIL 03015-000");
			System.out.println();
			System.out.println("CS SES GERALDO DE PAULA SOUZA");
			System.out.println("AV DR ARNALDO, 925 PACAEMBU SÃO PAULO - SP BRASIL 01255-000");
			System.out.println();
			System.out.println("AMA UBS INTEGRADA PARI");
			System.out.println("RUA DAS OLARIAS, 503 CANINDE SÃO PAULO - SP BRASIL 03030-020");
			System.out.println();
		}

		// ZONAOESTE
		else if (cep >= 5000000 && cep <= 5099999) { // LAPA E PERDIZES
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS V ROMANA");
			System.out.println("RUA VESPASIANO, 679 VILA ROMANA SÃO PAULO - SP BRASIL 05044-050");
			System.out.println();
			System.out.println("UBS V ANGLO JOSE SERRA RIBEIRO");
			System.out.println("RUA PALESTRA ITALIA, 165 PARQUE ANTARTICA SÃO PAULO - SP BRASIL 05005-001\r\n" + "");
			System.out.println();
			System.out.println("UBS V ANASTACIO");
			System.out.println("RUA CONSELHEIRO OLEGARIO, 239 VILA ANASTACIO SÃO PAULO - SP BRASIL 05092-000");
		} else if (cep >= 5100000 && cep <= 5199999) {// PIRITUBA E JARAGUÁ
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS CHACARA INGLESA");
			System.out.println("RUA DA LIGACAO, 95 CHACARA INGLESA SÃO PAULO - SP BRASIL 05142-120");
			System.out.println();
			System.out.println("UBS VILA MANGALOT");
			System.out.println("RUA PORTAO PRETO, 220 SAO DOMINGOS SÃO PAULO - SP BRASIL 05133-004");
			System.out.println();
			System.out.println("UBS SANTO ELIAS");
			System.out.println("RUA FABIO DE ALMEDIA MAGALHAES, 494 JD SANTO ELIAS SÃO PAULO - SP BRASIL 05135-370");
		} else if (cep >= 5200000 && cep <= 5299999) { // PERUS
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("AMA UBS INTEGRADA PERUS");
			System.out.println("PRACA VIGARIO JOAO GONCALVES LIMA, 239 PERUS SÃO PAULO - SP BRASIL 05206-180");
			System.out.println();
			System.out.println("UBS RECANTO DOS HUMILDES");
			System.out.println("RUA PAVAO, 36 PERUS SÃO PAULO - SP BRASIL 05210-000");
			System.out.println();
			System.out.println("AMA UBS INTEGRADA PARQUE ANHANGUERA");
			System.out.println("RUA PIERRE RENOIR, 100 ANHANGUERA SÃO PAULO - SP BRASIL 05269-000");
		} else if (cep >= 5300000 && cep <= 5399999) { // JAGUARÉ E LEOPOLDINA
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS PQ DA LAPA");
			System.out.println("RUA BERGSON, 52 VL LEOPOLDINA SÃO PAULO - SP BRASIL 05301-060");
			System.out.println();
			System.out.println("UBS ALTO DE PINHEIROS");
			System.out.println("AV QUEIROZ FILHO, 0313 V LE0POLDINA SÃO PAULO - SP BRASIL 05319-000");
			System.out.println();
			System.out.println("AMA UBS INTEGRADA VILA NOVA JAGUARE");
			System.out.println("RUA SALATIEL DE CAMPOS, 222 JAGUARE SÃO PAULO - SP BRASIL 05333-010");
		} else if (cep >= 5400000 && cep <= 5499999) {// PINHEIROS
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS MANUEL JOAQUIM PERA");
			System.out.println("RUA PURPURINA, 280 VILA MADALENA SÃO PAULO - SP BRASIL 05435-030");
		} else if (cep >= 5500000 && cep <= 5599999) {// BUTANTÃ
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS BUTANTA");
			System.out.println("R CABRAL DE MENEZES, 051 VILA GOMES SÃO PAULO - SP BRASIL 05590-050");
			System.out.println();
			System.out.println("UBS CAXINGUI NANCI ABRANCHES");
			System.out.println("RUA LADISLAU ROMAN, 0410 CAXINGUI SÃO PAULO - SP BRASIL 05515-030");
			System.out.println();
			System.out.println("AMA JD PERI PERI");
			System.out.println("RUA JOAO GUERRA, 0247 JD PERI PERI SÃO PAULO - SP BRASIL 05535-100");
		} else if (cep >= 5600000 && cep <= 5699999) { // MORUMBI
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS JARDIM COLOMBO");
			System.out.println("RUA FREI BONIFACIO DUX, 40 JARDIM COLOMBO SÃO PAULO - SP BRASIL 05629-000");
			System.out.println();
			System.out.println("UBS REAL PQ PAULO MANGABEIRA ALBERNAZ FILHO");
			System.out.println("RUA BARAO MELGACO, 0339 REAL PARQUE SÃO PAULO - SP BRASIL 05684-030");
			System.out.println();
			System.out.println("UBS PARAISOPOLIS II");
			System.out.println("RUA PASQUALE GUALLUPI, 951 PARAISOPOLIS SÃO PAULO - SP BRASIL 05660-000");
		} else if (cep >= 5700000 && cep <= 5799999) { // CAMPO LIMPO
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS PARQUE REGINA PERINA ALVES TEIXEIRA");
			System.out.println("RUA MELO COUTINHO, 260 PARQUE REGINA SÃO PAULO - SP BRASIL 05775-230");
			System.out.println();
			System.out.println("UBS JARDIM OLINDA");
			System.out.println("RUA CANORI, 190 JARDIM OLINDA SÃO PAULO - SP BRASIL 05765-170");
			System.out.println();
			System.out.println("UBS JARDIM HELGA");
			System.out.println("RUA THOMAS DE ARAUJO, 53 JD HELGA SÃO PAULO - SP BRASIL 05794-380");
		} else if (cep >= 5800000 && cep <= 5899999) {// CAPÃO REDONDO
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS V DAS BELEZAS ALBERTO AMBROSIO");
			System.out.println("RUA TTE ISAIAS BRANCO DE ARAUJO, 101 VILA DAS BELEZAS SÃO PAULO - SP BRASIL 05841-150");
			System.out.println();
			System.out.println("UBS J GERMANIA");
			System.out.println("R JOAO FUGULIM, 338 JD NOVA GERMANIA SÃO PAULO - SP BRASIL 05849-340");
			System.out.println();
			System.out.println("UBS BRASILIA M BOI MIRIM");
			System.out.println("RUA MAPORE, 352 J BRASILIA SÃO PAULO - SP BRASIL 05846-390");
		} else if(cep >= 3000000 && cep <= 3099999){ //Mooca
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("UBS BELENZINHO MARCUS WOLOSKER2.1 k");
	        System.out.println("AVENIDA CELSO GARCIA, 1749 BELENZINHO SÃO PAULO - SP BRASIL 03015-000");
	        System.out.println();
	        System.out.println("UBS BRAS MANOEL SALDIVA NETO");
	        System.out.println("RUA SAMPSON, 61 BRAS SÃO PAULO - SP BRASIL 03013-040");
	        System.out.println();
	        System.out.println("AMA UBS INTEGRADA PARI");
	        System.out.println("RUA DAS OLARIAS, 503 CANINDE SÃO PAULO - SP BRASIL 03030-020");
	        }
			else if(cep >= 3200000 && cep <= 3299999){//são lucas
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("UBS PQ SAO LUCAS");
	        System.out.println("RUA DR NOGUEIRA DE NORONHA, 322 PQ SAO LUCAS SÃO PAULO - SP BRASIL 03239-080");
	        System.out.println();
	        System.out.println("UBS JARDIM GUAIRACA");
	        System.out.println("RUA ERVA IMPERIAL, 501 JARDIM GUAIRACA SÃO PAULO - SP BRASIL 03244-030");
	        System.out.println();
	        System.out.println("UBS REUNIDAS I");
	        System.out.println("RUA SAO JOSE DAS ESPINHARAS, 400 VILA INDUSTRIAL SÃO PAULO - SP BRASIL 03249-030");
	        }
			else if(cep >= 3300000  && cep <= 3399999){  //ANÁLIA FRANCO
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("UBS V FORMOSA I DR ANTONIO DA SILVEIRA E OLIVEIRA");
	        System.out.println("RUA ACURUI, 720 VILA FORMOSA SÃO PAULO - SP BRASIL 03355-000");
	        System.out.println();	
	        System.out.println("UBS V FORMOSA II");
	        System.out.println("PRACA MARQUES DE NAZARE, 111 VILA FORMOSA SÃO PAULO - SP BRASIL 03359-110");
	        System.out.println();
	        System.out.println("AMA UBS INTEGRADA VILA ORATORIO DR TITO PEDRO MASCELLANI");
	        System.out.println("RUA JOAO FIALHO DE CARVALHO, 35 VILA DIVA SÃO PAULO - SP BRASIL 03345-010");
	        }
			else if(cep >= 3400000  && cep <= 3499999){ //CARRÃO E ARICANDUVA
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("AMA UBS INTEGRADA V CARRAO DR ADHEMAR MONTEIRO PACHECO");
	        System.out.println("RUA DR JACY BARBOSA, 280 VILA CARRAO SÃO PAULO - SP BRASIL 03447-000");
	        System.out.println();
	        System.out.println("UBS V NOVA MANCHESTER DR ARLINDO GENNARI");
	        System.out.println("PRACA HAROLDO DALTRO, 461 VILA NOVA MANCHESTER SÃO PAULO - SP BRASIL 03444-090");
	        System.out.println(); 
	        System.out.println("AMA UBS INTEGRADA V ANTONIETA");
	        System.out.println("RUA CORONEL JOAO OLIVEIRA MELO, 440 VILA ANTONIETA SÃO PAULO - SP BRASIL 03474-020");
	        System.out.println();
	        }
			else if(cep >= 3500000  && cep <= 3599999){//VILA MATILDE
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("UBS VILA MATILDE DR RUBENS DO VAL");
	        System.out.println("RUA MARCONDES DE BRITO, 1304 VILA MATILDE SÃO PAULO - SP BRASIL 03512-030");
	        System.out.println();
	        System.out.println("UBS CIDADE PATRIARCA DR HERMENEGILDO MORBIN JUNIOR");
	        System.out.println("RUA FREDERICO BROTERO, 22 CIDADE PATRIARCA SÃO PAULO - SP BRASIL 03552-080");
	        System.out.println();
	        System.out.println("AMA UBS INTEGRADA PADRE MANOEL DA NOBREGA");
	        System.out.println("AV PEDRO FRANCISCO DE TOLEDO, 545 ARTUR ALVIM SÃO PAULO - SP BRASIL 03590-120");
	        }
			else if(cep >= 3600000  && cep <= 3699999){//PENHA 
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("AMA MAURICE PATE");
	        System.out.println("RUA FREI GERMANO, 50 PENHA SÃO PAULO - SP BRASIL 03604-050");
	        System.out.println();
	        System.out.println("UBS VILA ESPERANCA DR EMILIO SANTIAGO DE OLIVEIRA");
	        System.out.println("RUA COREMU, 163 VILA ESPERANCA SÃO PAULO - SP BRASIL 03647-030");
	        System.out.println();
	        System.out.println("UBS BURGO PAULISTA");
	        System.out.println("RUA JOSE SILVA ALCANTARA FILHO, 1031 BURGO PAULISTA SÃO PAULO - SP BRASIL 03680-000");
	        }
			else if(cep >= 3700000  && cep <= 3799999){//CANGAÍBA
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("AMA UBS INTEGRADA CANGAIBA DR CARLOS GENTILE DE MELLO");
	        System.out.println("AV CANGAIBA, 3722 CANGAIBA SÃO PAULO - SP BRASIL 03712-000");
	        System.out.println();
	        System.out.println("UBS JARDIM SAO FRANCISCO I");
	        System.out.println("RUA JURITI PIRANGA, 195 CANGAIBA SÃO PAULO - SP BRASIL 03718-020");
	        System.out.println();
	        System.out.println("UBS ENGENHEIRO TRINDADE");
	        System.out.println("AV GABRIELA MISTRAL, 1168 PENHA DE FRANCA SÃO PAULO - SP BRASIL 03701-000");
	        }
			else if(cep >= 3800000  && cep <= 3899999){//	ERMELINO MATARAZZO
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("UBS ERMELINO MATARAZZO");
	        System.out.println("RUA ANTONIO FREITAS DE TOLEDO, 185 ERMELINO MATARAZZO SÃO PAULO - SP BRASIL 03809-060");
	        System.out.println();
	        System.out.println("MA UBS INTEGRADA PROF DR HUMBERTO CERRUTI PQ BOTURUSSU");
	        System.out.println("AV OLAVO EGIDIO DE SOUZA ARANHA, 704 VILA CISPER SÃO PAULO - SP BRASIL 03822-000");
	        System.out.println();
	        System.out.println("UBS VILA PARANAGUA");
	        System.out.println("RUA JOSE GOES NOGUEIRA, 70 VL PARANAGUA SÃO PAULO - SP BRASIL 03807-380");
	        }
			else if(cep >= 3900000  && cep <= 3999999){//	SÃO MATEUS
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("UBS JD IV CENTENARIO");
	        System.out.println("CAMPO FLORIDO RUA, 482 JD IV CENTENARIO SÃO PAULO - SP BRASIL 03940-000");
	        System.out.println();
	        System.out.println("UBS JD PARAGUACU DR GONCALO FELICIANO ALVES");
	        System.out.println("TAIOBEIRAS, 125 JARDIM PARAGUACU SÃO PAULO - SP BRASIL 03941-060");
	        System.out.println();
	        System.out.println("UBS IACAPE JD PLANALTO");
	        System.out.println("RUA IACAPE, 302 PQ STA MADALENA SÃO PAULO - SP BRASIL 03983-090");
	        }
			else if(cep >= 8000000  && cep <= 8099999){//SÃO MIGUEL PAULISTA
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println(" UBS VILA JACUI");
	        System.out.println("RUA EDIPO FELICIANO, 165 VILA JACUI SÃO PAULO - SP BRASIL 08060-220");
	        System.out.println();
	        System.out.println("AMA UBS INTEGRADA PARQUE PAULISTANO");
	        System.out.println("RUA SILVEIRA PIRES, 265 PARQUE PAULISTANO SÃO PAULO - SP BRASIL 08080-160");
	        System.out.println();
	        System.out.println("UBS CIDADE NOVA SAO MIGUEL");
	        System.out.println("RUA MOHAMED IBRAHIN SALEH, 902 CIDADE NOVA SAO MIGU SÃO PAULO - SP BRASIL 08042-130");
	        }
			else if(cep >= 8100000  && cep <= 8199999){// ITAIM PAULISTA
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("UBS STA LUZIA");
	        System.out.println("RUA CONJUNTO DA PAZ, 39 JD MIRIAM SÃO PAULO - SP BRASIL 08142-360");
	        System.out.println();
	        System.out.println("UBS J CAMARGO NOVO");
	        System.out.println("RUA GENERAL PEREIRA DE BERREDO, 275 JAD CAMARGO NOVO SÃO PAULO - SP BRASIL 08121-260");
	        System.out.println();
	        System.out.println("UBS ENCOSTA NORTE");
	        System.out.println("RUA RENATA AGONDI, 238 ITAIM PAULISTA SÃO PAULO - SP BRASIL 08131-320");
	        }
			else if(cep >= 8200000  && cep <= 8299999){//	ITAQUERA
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("UBS ITAQUERA");
	        System.out.println("RUA AMERICO SALVADOR NOVELLI, 265 ITAQUERA SÃO PAULO - SP BRASIL 08210-090");
	        System.out.println();
	        System.out.println("AMA UBS INTEGRADA VL CARMOSINA");
	        System.out.println("RUA IPOPOCA, 61 ITAQUERA SÃO PAULO - SP BRASIL 08290-330");
	        System.out.println();
	        System.out.println("UBS CIDADE LIDER");
	        System.out.println("AV DR FRANCISCO MUNHOZ FILHO, 379 CIDADE LIDER SÃO PAULO - SP BRASIL 08280-000");
	        }
			else if(cep >= 8300000  && cep <= 8399999){//SÃO MATEUS 
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("UBS PQ BOA ESPERANCA");
	        System.out.println("AV RAGUEB CHOHFI, 3826 PQ BOA ESPERANCA SÃO PAULO - SP BRASIL 08341-410");
	        System.out.println();
	        System.out.println("UBS JD ROSELI");
	        System.out.println("SIMAO NUNES RUA, 31 JARDIM ROSELI SÃO PAULO - SP BRASIL 08380-039");
	        System.out.println();
	        System.out.println("UBS JD CARRAOZINHO");
	        System.out.println("MARCOS GONCALVES CORREA RUA, 025 J VL CARRAO SÃO PAULO - SP BRASIL 08340-320");
	        }
			else if(cep >= 8400000  && cep <= 8499999){//GUAIANAZES
			System.out.println("Os postos de vacinação mais próximos de você são:");
	        System.out.println("UBS GUAIANAZES");
	        System.out.println("RUA PROFESSOR COSME DEODATO TADEU, 90 GUAIANASES SÃO PAULO - SP BRASIL 08450-380");
	        System.out.println();
	        System.out.println("UBS VILA CHABILANDIA");
	        System.out.println("ESTRADA DO LAJEADO VELHO, 392 LAJEADO SÃO PAULO - SP BRASIL 08451-000");
	        System.out.println();
	        System.out.println("UBS JARDIM BANDEIRANTES");
	        System.out.println("RUA PACHECO ARANHA, 04 GUAIANASES SÃO PAULO - SP BRASIL 08450-410");
	        }
			else if(cep >= 4000000 && cep <= 4199999){
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println();
			System.out.println("UBS INDIANOPOLIS SIGMUND FREUD");
			System.out.println("AV INDIANOPOLIS, 650 INDIANOPOLIS SÃO PAULO - SP BRASIL 04062-001");
			System.out.println();
			System.out.println("UBS MILTON SANTOS");
			System.out.println("AV CECI, 2249 PLANALTO PAULISTA SÃO PAULO - SP BRASIL 04065-004");
			System.out.println();
			System.out.println("UBS AGUA FUNDA");
			System.out.println("RUA ROSA DE MORAES, 91 AGUA FUNDA SÃO PAULO - SP BRASIL 04155-000");
			}
			else if(cep >= 4200000 && cep <= 4299999){
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS SACOMA");
			System.out.println("ESTRADA DAS LAGRIMAS, 1604 SACOMA SÃO PAULO - SP BRASIL 04232-000");
			System.out.println();
			System.out.println("UBS JOAQUIM ROSSINI");
			System.out.println("RUA ALVARO FRAGOSO, 480 VILA CARIOCA SÃO PAULO - SP BRASIL 04223-000");
			System.out.println();
			System.out.println("AMA UBS Integrada São Vicente de Paula");
			System.out.println("RUA Vicente da Costa, 289 - Ipiranga, São Paulo - SP BRASIL 04266-050");		
			}
			else if(cep >= 4300000 && cep <= 4399999){
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS J LOURDES");
			System.out.println("AV ENG ARMANDO DE ARRUDA PEREIRA, 4004 JABAQUARA SÃO PAULO - SP BRASIL 04325-000");
			System.out.println();
			System.out.println("UBS CIDADE VARGAS");
			System.out.println("RUA DOS COMERCIARIOS, 236 CIDADE VARGAS SÃO PAULO - SP BRASIL 04320-030");
			System.out.println();
			System.out.println("UBS V STA CATARINA");
			System.out.println("RUA BELMIRO ZANETTI ESTEVES, 181 VILA SANTA CATARINA SÃO PAULO - SP BRASIL 04377-060");	
			}
			else if(cep >= 4400000 && cep <= 4499999){
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("AMA UBS INTEGRADA JD MIRIAM MANOEL SOARES DE OLIVEIRA");
			System.out.println("AV SANTO AFONSO, 419 AMERICANOPOLIS SÃO PAULO - SP BRASIL 04426-000");
			System.out.println();
			System.out.println("AMA UBS INTEGRADA V JOANIZA");
			System.out.println("RUA LUIS VIVES, 85 VILA JOANIZA SÃO PAULO - SP BRASIL 04404-150");
			System.out.println();
			System.out.println("AMA UBS INTEGRADA VILA CLARA");
			System.out.println("RUA ROLANDO CURTI, 701 VILA CLARA SÃO PAULO - SP BRASIL 04414-000");	
			System.out.println();
			System.out.println("UBS SAO JORGE CIDADE ADEMAR");
			System.out.println("AV EDUARDO PEREIRA RAMOS, 810 JARDIM SAO JORGE SÃO PAULO - SP BRASIL 04432-000");	
			}
			else if(cep >= 4500000 && cep <= 4599999){
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS MENINOPOLIS MARIO FRANCISCO NAPOLITANO");
			System.out.println("RUA OSCAR GOMES CARDIM, 142 VL CORDEIRO SÃO PAULO - SP BRASIL 04580-040");
			System.out.println();
			System.out.println("UBS JARDIM EDITE GERONCIO HENRIQUE NETO");
			System.out.println("RUA CHARLES COULOMB, 080 CIDADE MONCOES SÃO PAULO - SP BRASIL 04576-030");
			System.out.println();
			System.out.println("UBS REAL PQ PAULO MANGABEIRA ALBERNAZ FILHO");
			System.out.println("RUA BARAO MELGACO, 0339 REAL PARQUE SÃO PAULO - SP BRASIL 05684-030");		
			}
			else if(cep >= 4600000 && cep <= 4699999){
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS CAMPO GRANDE");
			System.out.println("RUA MONLEVADE, 195 VILA ROMANO SÃO PAULO - SP BRASIL 04679-345");
			System.out.println();
			System.out.println("UBS V ARRIETE DECIO PACHECO PEDROSO");
			System.out.println("RUA JULIETA DE ARAUJO ALMEIDA, 44 JAD ARAUJO ALMEIDA SÃO PAULO - SP BRASIL 04445-010");
			System.out.println();
			System.out.println("UBS V APARECIDA");
			System.out.println("AVENIDA BATISTA MACIEL, 430 VILA PORTELA SÃO PAULO - SP BRASIL 04459-110");		
			}
			else if(cep >= 4700000 && cep <= 4799999){
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS SANTO AMARO DR SERGIO VILLACA BRAGA");
			System.out.println("RUA CONDE DE ITU, 359 SANTO AMARO SÃO PAULO - SP BRASIL 04741-000");
			System.out.println();
			System.out.println("UBS CHACARA SANTO ANTONIO DR MARCILIO DE ARRUDA PENTEADO F");
			System.out.println("RUA ALEXANDRE DUMAS, 719 CHACARA STO ANTONIO SÃO PAULO - SP BRASIL 04717-000");
			System.out.println();
			System.out.println("UBS VELEIROS");
			System.out.println("AVENIDA CLARA MANTELLI, 185 VELEIROS SÃO PAULO - SP BRASIL 04771-180");		
			}
			else if(cep >= 4800000 && cep <= 4899999){
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("UBS AUTODROMO DR FAUZER SIMAO ABRAO");
			System.out.println("RUA OSWALDO DINIZ, 51 JARDIM SATELITE SÃO PAULO - SP BRASIL 04815-330");
			System.out.println();
			System.out.println("UBS J REPUBLICA");
			System.out.println("AVENIDA GONCALO DE PAIVA GOMES, 285 JARDIM REPUBLICA SÃO PAULO - SP BRASIL 04812-090");
			System.out.println();
			System.out.println("UBS JORDANOPOLIS");
			System.out.println("RUA JANGADA NOVA, 75 JORDANOPOLIS SÃO PAULO - SP BRASIL 04830-200");	
			System.out.println();
			System.out.println("AMA UBS INTEGRADA JARDIM CASTRO ALVES DRA MARIA CRISTINA F");
			System.out.println("AVENIDA JOAO PAULO BARRETO, 131 JD CASTRO ALVES SÃO PAULO - SP BRASIL 04842-150");		
			}
			else if(cep >= 4900000 && cep <= 4999999){
			System.out.println("Os postos de vacinação mais próximos de você são:");
			System.out.println("AMA UBS INTEGRADA PQ FIGUEIRA GRANDE");
			System.out.println("RUA DANIEL KLEIN, 211 PQ FIGUEIRA GRANDE SÃO PAULO - SP BRASIL 04915-170");
			System.out.println();
			System.out.println("UBS J HERCULANO");
			System.out.println("RUA IGNACIO LIMAS, 11 J HERCULANO SÃO PAULO - SP BRASIL 04920-050");
			System.out.println();
			System.out.println("UBS J NAKAMURA");
			System.out.println("RUA MANOEL VITOR DE JESUS, 811 JARDIM NAKAMURA SÃO PAULO - SP BRASIL 04942-100");		
			}
			else {
				System.out.println("Cep inválido, tente novamente!");
			}
	}


		

		
		
		
		
		
		
		
	}


