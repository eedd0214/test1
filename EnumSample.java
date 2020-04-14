import java.util.List;
import java.util.ArrayList;
enum Animal{Cat, Dog, Rabbit}

class Pet{
	private Animal kind;
	private String name;
	public Pet(Animal animal, String name){
		kind = animal;
		this.name = name;
	}
	public Animal getKind(){
		return kind;
	}
	public String getName(){
		return name;
	}
}

class EnumSample{
	public static void main(String[] args){
		List<Pet> lst = new ArrayList<Pet>(3);
		lst.add(new Pet(Animal.Dog, "πŸµœ¿Ã"));
		lst.add(new Pet(Animal.Cat, "≥™∫Ò"));
		lst.add(new Pet(Animal.Rabbit, "√ ∑’¿Ã"));
		for(Pet pt : lst){
			if(pt.getKind() == Animal.Dog){
				System.out.println("Dog name : " + pt.getName());
			}
			if(pt.getKind() == Animal.Cat){
				System.out.println("Cat name : " + pt.getName());
			}
			if(pt.getKind() == Animal.Rabbit){
				System.out.println("Rabbit name : " + pt.getName());
			}
		}
	}
}