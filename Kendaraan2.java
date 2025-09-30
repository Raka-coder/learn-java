class Kendaraan2{
	String merek;
	void jalan(){
		System.out.println(this.merek +  " sedang berjalan");
	}
}

class Mobil extends Kendaraan2{
	int jumlahPintu;
}

class Motor extends Kendaraan2{
	int jumlahBan;
}

