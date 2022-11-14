package main;
import java.util.Scanner;

import clases.*;

public class Main {

	public static void main(String[] args) {
		
		//Hacer un vector de 12 posiciones que sea de tipo Carta
		RepartidorDeCartas();
		
	}
	
	public static void RepartidorDeCartas()
	{
		//Metodo para mostrar las cartas
		Carta cartaMostrar = new Carta(0,0,"elemento");
				
		//Maso de cartas
		Carta c1 = new Carta(100,80,"agua");
		Carta c2 = new Carta(50,60,"agua");
		Carta c3 = new Carta(50,40,"agua");
				
		Carta c4 = new Carta(70,100,"fuego");
		Carta c5 = new Carta(20,20,"fuego");
		Carta c6 = new Carta(50,40,"fuego");
				
		Carta c7 = new Carta(30,30,"viento");
		Carta c8 = new Carta(70,40,"viento");
		Carta c9 = new Carta(20,50,"viento");
				
		Carta c10 = new Carta(30,60,"tierra");
		Carta c11 = new Carta(20,80,"tierra");
		Carta c12 = new Carta(70,20,"tierra");
				
		//Crear vectorPadre de cartas
		Carta[] masoCartas = new Carta[12];//Vector de cartas de 12 posiciones
		//Vectores hijos
		Carta []cartasHijo1 = new Carta[6];
		Carta []cartasHijo2 = new Carta [12];
		//cartas agregadas al masoCartas
		masoCartas[0] = c1;
		masoCartas[1] = c2;
		masoCartas[2] = c3;
		masoCartas[3] = c4;
		masoCartas[4] = c5;
		masoCartas[5] = c6;
		masoCartas[6] = c7;
		masoCartas[7] = c8;
		masoCartas[8] = c9;
		masoCartas[9] = c10;
		masoCartas[10] = c11;
		masoCartas[11] = c12;
		
		//Array de validar las cartas
		int []masoCartasRepartidas = new int[12];
		
		//Se pide numero random
		int num = (int)(Math.random() * 11 + 1);
		//Se llama la funcion de validar
		validar(num,masoCartasRepartidas);
		//Se determina por boolean igualado a verdadero y un iterador
		boolean band = true;
		int index = 0; 
		
		
		while(band)
			{
			//Num random para validar nuevamente en el if
				num = (int)(Math.random() * 11 + 1);
				if(validar(num, masoCartasRepartidas)) 
				{
					
					masoCartasRepartidas[index] = num;
					index++;
				}
				//En el momento que esto sea se cumpla el band sera falso lo cual se saldra del while
				if(index == 11)
				{
					band=false;
				}
			}
		
		//Bucles for para mostrar el vector de cartasRepartidas
		for(int k = 0; k < 12; k++)
			{
				//System.out.println("Vector masoCartasRepartidas "+ "[" + k + "]" + " = " + masoCartasRepartidas[k]);
			}
		
		//Bucle for para llamar a la posicion del masoCartas con la de masoCartasRepartidas
		for(int i = 0; i < 6; i++)
			{
				cartasHijo1[i] = masoCartas[masoCartasRepartidas[i]];
			}
				
		for(int i = 6; i < 12; i++)
			{
				cartasHijo2[i] = masoCartas[masoCartasRepartidas[i]];
			}
		
		//Bucle for para mostrar los vectores hijos llenos
		for(int i = 0; i < 12; i++)
		{
			
			if(i < 6) 
			{
				//System.out.println("Cartas hijo 1");
				//cartaMostrar.mostrar(cartasHijo1[i]);
			}
			
			if(i > 5)
			{
				//System.out.println("Cartas hijo 2");
				//cartaMostrar.mostrar(cartasHijo2[i]);
			}
			
					
		}
		
		
		//Enfrentamiento de cartas
		
		
		try (//cartaMostrar.mostrar(enfrentamientoCartas(c15, c16));
		var entrada = new Scanner(System.in)) {
			int car1,car2;
			System.out.println("masoCartas[0] agua");
			System.out.println("masoCartas[3] tierra");
			System.err.println("Escoge una carta1");
			car1 = entrada.nextInt();
			System.err.println("Escoge una carta2");
			car2 = entrada.nextInt();
			if(car1 == 0 && car2 == 3)
			{
				Carta pito1 = masoCartas[car1];
				Carta pito2 = masoCartas[car2];
				cartaMostrar.mostrar(enfrentamientoCartas(pito1, pito2));
			}
			else
			{
				System.err.println("¡Lo siento no fue posible hacer el enfrentamiento, indices incorrectos!");	
			}
		}
		
		
	}//Fin metodo vector
	
	//funcion para devolver carta al momento de algun enfrentamiento
	public static Carta enfrentamientoCartas(Carta c1,Carta c2)
	{
		
		if(c1.getATK() > c2.getDEF())
		{
			System.out.println("¡Gana carta1 ATK mayor!");		
			return c1;
		}
		/*else if (c1.getATK() < c2.getDEF()) {
			System.out.println("Se devuelve carta2");
			int restaDEF = c1.getATK()-c2.getDEF();
			c2.setDEF(restaDEF*-1);
			return c2;
		}*/
		else if(c2.getATK() > c1.getDEF())
		{
			System.out.println("¡Gana carta2 ATK mayor!");
			return c2;
		}
		/*else if (c2.getATK() < c1.getDEF()) {
			System.out.println("Se devuelve carta1");
			int restaDEF = c2.getATK()-c1.getDEF();
			c1.setDEF(restaDEF*-1);
			return c1;
		}*/
		else if(c1.getATK() == c2.getDEF())
		{
			System.out.println("¡Carta por desenpate c1.ATK == c2.DEF!");
			return c1.enfrentarse(c2);
		}
		else if(c2.getATK() == c1.getDEF())
		{
			System.out.println("¡Carta por desenpate c2.ATK == c1.DEF!");
			return c2.enfrentarse(c1);
		}
		else
		{
			System.out.println("Se devuelve carta2");
			return c2;
		}
		
		
	}
	
	public static void mostrar(Carta carta1,Carta carta2)
	{
		carta1.mostrar();
		System.out.println("VS");
		carta2.mostrar();
	}
			
	public static boolean validar(int num, int[] masoCartas) {
		
	for(int i = 0; i < 12; i++)
		{
			//Validar cuando num sea igual a masoCartas en alguna posicion
			//la funcion retorne false
		if(masoCartas[i] == num)
			{
//				System.out.println("Encontro el " + masoCartas[i]);
//				System.out.println(masoCartas[i]);
				return false;
			}
//			System.out.println(masoCartas[i]);
		}
	//retorne true cuando lo del if no se cumpla
		return true;	
	}
	
}
