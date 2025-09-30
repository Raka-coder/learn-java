class Hewan2{
	String name;
	
	Hewan2(String name){
		this.name = name;
	}
}

interface BisaTerbang{
	void terbang();
};

class Burung extends Hewan2 implements BisaTerbang{
	Burung(String name){
		super(name);
	}
	
	public void terbang(){
		System.out.println(this.name + " sedang terbang");
	}
	
}