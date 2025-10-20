class KendaraanBeraksi {
	public static void main (String[] args){
		Mobil m = new Mobil();
		m.merk = "Toyota";
		m.jumlahPintu = 4;
		m.jalan();
	}
}

class Mobil {
	String merk;
	int jumlahPintu;
	void jalan() {
		System.out.println(merk + " berjalan dengan " + jumlahPintu + " pintu.");
	}
}