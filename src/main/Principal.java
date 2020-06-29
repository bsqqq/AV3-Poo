package main;

import java.util.Scanner;

import carros.Carro;
import carros.Ferrari;
import carros.Fusca;
import carros.Gol;
import carros.Golf;
import carros.Ka;
import carros.Mercedes;
import carros.Onix;
import carros.Palio;
import execao.ForaDoIntervalo;
import funcionarios.Claudio;
import funcionarios.Gerente;

public class Principal {

	private static Scanner prompt;

	public static void main(String[] args) {
		int posCarro;
		prompt = new Scanner(System.in);
		Carro[] carros = new Carro[8];
		Claudio claudio = new Claudio();
		Gerente emerson = new Gerente("emerson", "0120", 01, "Gerente", 2000);
		//sobreposiçao da clase mãe
		claudio.trabalhar();
		claudio.comicao();
		//sobrecarga
		emerson.demite(142);
		emerson.demite("fulano");
		// TODO Auto-generated method stub
		carros[0] = new Ferrari(150, 2009, 3.0F, true, false, "x10", "ferrari", 1300);
		carros[1] = new Mercedes(258, 2020, 2.0F, true, true, "c300", "Mercedes-Beanz", 1735);
		carros[2] = new Golf(150, 2020, 1.4F, true, false, "golf", "volkswagen", 1524);
		carros[3] = new Fusca(200, 1966, 1.3F, false, true, "fusca", "volkswagen", 780);
		carros[4] = new Onix(120, 2020, 1.6F, false, false, "onix", "chevrolet", 1000);
		carros[5] = new Ka(125, 2020, 1.6F, false, false, "Ka", "ford", 1100);
		carros[6] = new Gol(85, 2019, 1.6F, false, false, "Gol", "volkswagem", 1001);
		carros[7] = new Palio(73, 2018, 1.4F, false, false, "palio attractive", "fiat", 990);
			
			System.out.println("\n");
			((Ferrari) carros[0]).LevantarAeroFolio();
			((Ferrari) carros[0]).limitarPotencia();
			((Ferrari) carros[0]).parearComCelular();
			((Ferrari) carros[0]).subirCapota();
			
			System.out.println("\n");
			((Mercedes) carros[1]).LevantarAeroFolio();
			((Mercedes) carros[1]).limitarPotencia();
			((Mercedes) carros[1]).parearComCelular();
			((Mercedes) carros[1]).subirCapota();
			
			System.out.println("\n");
			((Golf) carros[2]).LevantarAeroFolio();
			((Golf) carros[2]).limitarPotencia();
			((Golf) carros[2]).parearComCelular();
			((Golf) carros[2]).subirCapota();
		
			System.out.println("\n");
		
		//add mais dois carros, de preferencia exportivos
		try {
			System.out.println("insira um numero de 0 a 7");
			posCarro = prompt.nextInt();
			if(posCarro>=carros.length ||posCarro<0) {
				throw new ForaDoIntervalo(posCarro);
			}
			carros[posCarro].freiar();
			carros[posCarro].TemBancoDeCouro();
			//polimorfismo de sobrecarga
			carros[posCarro].ligar("LIGA");
			carros[posCarro].ligar(1);
			carros[posCarro].ligar(true);
			
		}catch(ForaDoIntervalo e){
			System.out.println("erro");
			System.out.println(e.toString());
		}

	}

}
