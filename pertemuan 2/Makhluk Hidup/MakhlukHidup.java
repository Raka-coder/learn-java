class MakhlukHidup {
	void bernafas(){
		System.out.println("Makhluk hidup bernafas");
	}
}


class Hewan extends MakhlukHidup {
	void bergerak(){
		System.out.println("Makhluk hidup bergerak");
	}
}

class Kucing extends Hewan {
	void bersuara(){
		System.out.println("Meow!");
	}
}