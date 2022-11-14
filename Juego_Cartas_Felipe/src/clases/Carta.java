package clases;

public class Carta {

	private int ATK;
	private int DEF;
	private String Elemento;
		
	public Carta(int aTK, int dEF, String elemento) {
		super();
		ATK = aTK;
		DEF = dEF;
		Elemento = elemento;
	}

	public int getATK() {
		return ATK;
	}

	public void setATK(int aTK) {
		ATK = aTK;
	}

	public int getDEF() {
		return DEF;
	}

	public void setDEF(int dEF) {
		DEF = dEF;
	}

	public String getElemento() {
		return Elemento;
	}

	public void setElemento(String elemento) {
		Elemento = elemento;
	}
	
	public void mostrar()
	{
		System.out.println("***************");
		System.out.print("ELEMENTO: " + this.Elemento);System.out.println("*");
		System.out.print("ATAQUE: "   + this.ATK);System.out.println("     *");
		System.out.print("DEFENSA: "  + this.DEF);System.out.println("    *");
		System.out.println("***************");
		
		System.out.println("\n\n");
		
	}
	
	public void mostrar(Carta carta)
	{
		carta.mostrar();
	}
	
	public void mostrar(Carta carta1,Carta carta2)
	{
		carta1.mostrar();
		System.out.println("vs");
		carta2.mostrar();
	}
	
	public Carta enfrentarse(Carta carta)
	{
		//Tenemos que cuando se enfrenten agua fuego a fuego quitarle 20%
		//
		if((this.Elemento == "agua" && carta.Elemento == "fuego")||(carta.Elemento == "agua" && this.Elemento == "fuego"))
		{
					
			if(this.Elemento == "agua")
			{
				int menosVeintePorciento, nuevoAtaque;
				System.out.println("Ataque de carta ahora: " + carta.getATK());
				menosVeintePorciento = (int)(carta.getATK()*0.2);
				System.out.println("descuento del 20%: " + menosVeintePorciento);
				nuevoAtaque = carta.getATK()-menosVeintePorciento;
				System.out.println("El nuevo ataque es: " + nuevoAtaque);
				carta.setATK(nuevoAtaque);
				return carta;
				
			}
			else if(carta.Elemento == "agua")
			{
				int menosVeintePorciento, nuevoAtaque;
				System.out.println("Ataque de carta ahora: " + carta.getATK());
				menosVeintePorciento = (int)(carta.getATK()*0.2);
				System.out.println("descuento del 20%: " + menosVeintePorciento);
				nuevoAtaque = carta.getATK()-menosVeintePorciento;
				System.out.println("El nuevo ataque es: " + nuevoAtaque);
				this.setATK(nuevoAtaque);
				return this;
			}
			//*****
			
			
		}
		
		if((this.Elemento == "agua" && carta.Elemento == "tierra")||(carta.Elemento == "agua" && this.Elemento == "tierra"))
		{
					
			if(this.Elemento == "agua")
			{
				int menosVeintePorciento, nuevoAtaque;
				System.out.println("Ataque de carta ahora: " + carta.getATK());
				menosVeintePorciento = (int)(carta.getATK()*0.2);
				System.out.println("descuento del 20%: " + menosVeintePorciento);
				nuevoAtaque = carta.getATK()-menosVeintePorciento;
				System.out.println("El nuevo ataque es: " + nuevoAtaque);
				carta.setATK(nuevoAtaque);
				return carta;
				
			}
			else if(carta.Elemento == "agua")
			{
				int menosVeintePorciento, nuevoAtaque;
				System.out.println("Ataque de carta ahora: " + carta.getATK());
				menosVeintePorciento = (int)(carta.getATK()*0.2);
				System.out.println("descuento del 20%: " + menosVeintePorciento);
				nuevoAtaque = carta.getATK()-menosVeintePorciento;
				System.out.println("El nuevo ataque es: " + nuevoAtaque);
				this.setATK(nuevoAtaque);
				return this;
			}
			//*****
			
			
		}
		
		if((this.Elemento == "fuego" && carta.Elemento == "viento")||(carta.Elemento == "agua" && this.Elemento == "viento"))
		{
					
			if(this.Elemento == "fuego")
			{
				int menosVeintePorciento, nuevoAtaque;
				System.out.println("Ataque de carta ahora: " + carta.getATK());
				menosVeintePorciento = (int)(carta.getATK()*0.2);
				System.out.println("descuento del 20%: " + menosVeintePorciento);
				nuevoAtaque = carta.getATK()-menosVeintePorciento;
				System.out.println("El nuevo ataque es: " + nuevoAtaque);
				carta.setATK(nuevoAtaque);
				return carta;
				
			}
			else if(carta.Elemento == "fuego")
			{
				int menosVeintePorciento, nuevoAtaque;
				System.out.println("Ataque de carta ahora: " + carta.getATK());
				menosVeintePorciento = (int)(carta.getATK()*0.2);
				System.out.println("descuento del 20%: " + menosVeintePorciento);
				nuevoAtaque = carta.getATK()-menosVeintePorciento;
				System.out.println("El nuevo ataque es: " + nuevoAtaque);
				this.setATK(nuevoAtaque);
				return this;
			}
			//*****
			
			
		}
		
		
		if((this.Elemento == "viento" && carta.Elemento == "tierra")||(carta.Elemento == "viento" && this.Elemento == "tierra"))
		{
					
			if(this.Elemento == "viento")
			{
				int menosVeintePorciento, nuevoAtaque;
				System.out.println("Ataque de carta ahora: " + carta.getATK());
				menosVeintePorciento = (int)(carta.getATK()*0.2);
				System.out.println("descuento del 20%: " + menosVeintePorciento);
				nuevoAtaque = carta.getATK()-menosVeintePorciento;
				System.out.println("El nuevo ataque es: " + nuevoAtaque);
				carta.setATK(nuevoAtaque);
				return carta;
				
			}
			else if(carta.Elemento == "viento")
			{
				int menosVeintePorciento, nuevoAtaque;
				System.out.println("Ataque de carta ahora: " + carta.getATK());
				menosVeintePorciento = (int)(carta.getATK()*0.2);
				System.out.println("descuento del 20%: " + menosVeintePorciento);
				nuevoAtaque = carta.getATK()-menosVeintePorciento;
				System.out.println("El nuevo ataque es: " + nuevoAtaque);
				this.setATK(nuevoAtaque);
				return this;
			}
			//*****
			
			
		}
		
		
		return carta;
	}
	
	
}
