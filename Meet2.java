interface Greet{
	void greet();
}

interface Bye extends Greet{
	void bye();
}

class Greeting implements Bye {
	public void greet(){
		System.out.println("�ȳ��ϼ���!");
	}
	public void bye(){
		System.out.println("�������׿�.");
	}
}

class Meet2{
	public static void main(String[] args){
		Greeting greeting = new Greeting();
		greeting.greet();
		greeting.bye();
	}
}