package Aula7;

public class TesteLutador {
	public static void main(String[] args) {
		/*Lutador l1 = new Lutador("PrettyBoy", "França", 31, 1.75, 68.9, 11, 2, 1 );
		l1.apresentar();
		l1.status();*/
		
		Lutador l[] = new Lutador[6];
		
		l[0] = new Lutador ("PrettyBoy", "França", 
					31, 1.75, 68.9, 11, 2, 1);
		
		l[1] = new Lutador ("Putscript", "Brasil",
							29, 1.68, 57.8, 14, 2, 3);
		
		l[2] = new Lutador ("SnapShadow", "EUA", 35,
							1.65, 80.9, 12, 2, 1);
		
		l[3] = new Lutador ("Dead Code", "Austrália", 28,
							1.93, 81.6, 13, 0, 2);
		
		l[4] = new Lutador ("UFOCobol", "Brasil", 37,
							1.70, 119.3, 5, 4, 3);
		
		l[5] = new Lutador ("NerdLost", "EUA", 30,
							1.81, 105.7, 12, 2, 4);
		
		//l[3].perderLuta();
		//l[3].status();
		
		Luta luta1 = new Luta();
		luta1.marcarLuta(l[0], l[1]);
		luta1.lutar();
		
		l[0].status();
		l[1].status();
	
	}

}
	