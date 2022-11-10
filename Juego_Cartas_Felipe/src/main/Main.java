package main;
import java.io.NotActiveException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;

import clases.*;

public class Main {

	public static void main(String[] args) {
		
		//Asignar numero random
		
		
		
		//Elementos agua, tierra, viento, fuego
		/*Carta cartaMostrar = new Carta(0,0,"elemento");
		
		Carta c1 = new Carta(25,50,"agua");
		Carta c2 = new Carta(50,60,"agua");
		Carta c3 = new Carta(50,40,"agua");
		
		Carta c4 = new Carta(40,10,"fuego");
		Carta c5 = new Carta(20,20,"fuego");
		Carta c6 = new Carta(50,40,"fuego");
		
		Carta c7 = new Carta(30,30,"viento");
		Carta c8 = new Carta(70,40,"viento");
		Carta c9 = new Carta(20,50,"viento");
		
		Carta c10 = new Carta(30,60,"tierra");
		Carta c11 = new Carta(20,80,"tierra");
		Carta c12 = new Carta(70,20,"tierra");
		*/
		//AGUA VS FUEGO
		//cartaMostrar.mostrar(c6.enfrentarse(c3));
		
		//AGUA VS TIERRA
		//cartaMostrar.mostrar(c12.enfrentarse(c2));
		
		//FUEGO VS VIENTO
		//cartaMostrar.mostrar(c8.enfrentarse(c5));
		
		//VIENTO VS TIERRA
		//cartaMostrar.mostrar(c11.enfrentarse(c9));
		
		//Hacer un vector de 12 posiciones que sea de tipo Carta
		vector();
		
	}
	
	public static void vector()
	{
		//Metodo para mostrar las cartas
		Carta cartaMostrar = new Carta(0,0,"elemento");
				
		//Maso de cartas
		Carta c1 = new Carta(25,50,"agua");
		Carta c2 = new Carta(50,60,"agua");
		Carta c3 = new Carta(50,40,"agua");
				
		Carta c4 = new Carta(40,10,"fuego");
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
		int num = (int)(Math.random() * 12 + 1);
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
				System.out.println("Vector masoCartasRepartidas "+ "[" + k + "]" + " = " + masoCartasRepartidas[k]);
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
//		for(int i = 0; i < 12; i++)
//		{
//			if(i < 6) 
//			{
//				cartaMostrar.mostrar(cartasHijo1[i]);
//			}
//			if(i > 5)
//			{
//				cartaMostrar.mostrar(cartasHijo2[i]);
//			}
//					
//		}
		
		for(int i = 0; i < 6; i++)
		{		
			cartaMostrar.mostrar(cartasHijo1[i]);		
		}
		
		for(int i = 5; i < 12; i++)
		{
			cartaMostrar.mostrar(cartasHijo2[i]);
		}
		
		System.out.println("Vector hijo1");
		cartaMostrar.mostrar(cartasHijo2[5].enfrentarse(c4));
		
							
	}//Fin metodo vector
			
	public static boolean validar(int num, int[] masoCartas) {
		
	for(int i = 0; i < 12; i++)
		{
			if(masoCartas[i] == num)
			{
//				System.out.println("Encontro el " + masoCartas[i]);
//				System.out.println(masoCartas[i]);
				return false;
			}
//			System.out.println(masoCartas[i]);
		}
		return true;	
	}
	
}
