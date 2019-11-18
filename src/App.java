import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Race race = new Race();
		Animal[] animal = new Animal[3];
		
		animal[0] = new Kelinci();
		animal[1] = new KuraKura();
		animal[2] = new Singa();
		
		int pilihMenu, speed;
		int[] hasilRace = new int[3];
		
		
		System.out.print("\033[H\033[2J");
		
		race.headerApp();
		race.prologApp();
		race.mainMenu();
		
		do {
			
			System.out.print("\nMasukkan nomor menu : ");
			pilihMenu = input.nextInt();
			
			switch (pilihMenu) {
			case 1:
				for (int i = 0; i < animal.length; i++) {
					animal[i].kecepatanLari();
					speed = input.nextInt();
					animal[i].setKecepatan(speed);
				}
				
				break;
				
			case 2:
				System.out.println("Lomba di mulai...");
				
				break;
				
			case 3:
				for (int i= 0; i < animal.length; i++) {
					hasilRace[i] = race.jarakRace / animal[i].getKecepatan();
					animal[i].waktuTempuh();
					System.out.println(hasilRace[i]);
					 
				}
				
				break;
				
			case 4:
				System.out.println("Terima kasih..!");
				break;
			
			default:
				System.out.println("Pilihan tidak ada. Coba lagi!");
				break;
			}
			
		}while(pilihMenu < 4);
	}
}
