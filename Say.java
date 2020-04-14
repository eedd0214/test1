interface Greet1{
	void greet();
}

interface Greet2{
	public default void afternoon(){
		System.out.println("�ȳ��ϼ���");
	}
}

interface Greet3{
	static void evening(){
		System.out.println("�ȳ��ϼ���");
	}
}

class Greeting implements Greet1, Greet2{
	public void greet(){
		System.out.println("�ȳ��ϼ���");
	}
}
class Say{
	public static void main(String[] args){
		Greeting g = new Greeting();
		g.greet();
		g.afternoon();
		Greet3.evening();
	}
}