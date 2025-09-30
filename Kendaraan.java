
// parent class

class Kendaraan {
	String merk;
	void jalan(){
		System.out.println(merk + " sedang berjalan");
	}
}

// subclass

class Mobil extends Kendaraan {
	int jumlahPintu;
}

