
public class Race {
	
	int jarakRace = 10;
	Animal[] animalArr = new Animal[3];

	public void headerApp() {
		System.out.println("=============== Selamat Datang di Game Zoo Racer ===============");
	}
	
	public void prologApp() {
		System.out.println("Di game ini terdapat 3 pemain. Kelinci, Kura-Kura dan Singa\n"
				+ "Suatu hari, 3 hewan tersebut melakukan pertandingan lari dengan jarak 10KM\n"
				+ "untuk membuktikan siapa yang tercepat.\n"
				+ "Aturlah jalan cerita melalui menu di bawah ini!");
	}
	
	public void mainMenu() {
		System.out.print("\n1. Masukkkan nilai kecepatan (1-10)"
				+ "\n2. Mulai Lomba"
				+ "\n3. Lihat Pemenang"
				+ "\n4. Keluar");
	}
	
}
