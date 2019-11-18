
abstract class Animal {

	private int kecepatan;
	
	public void setKecepatan(int acceleration) {
		this.kecepatan = acceleration;
	}
	
	public int getKecepatan() {
		return kecepatan;
	}
	
	public abstract void kecepatanLari();
	
	public abstract void waktuTempuh();
	
	
}
