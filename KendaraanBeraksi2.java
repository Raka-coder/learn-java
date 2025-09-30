class KendaraanBeraksi2 {
	public static void main(String[] args){
		Mobil mobil1 = new Mobil();
		mobil1.merk = "Toyota";
		mobil1.jumlahPintu = 4;
		mobil1.jalan();
		
		Motor motor1 = new Motor();
		motor1.merek = "Honda";
		motor1.jumlahBan = 2;
		motor1.jalan();
	}
}