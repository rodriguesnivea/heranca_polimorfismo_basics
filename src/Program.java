import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Animal> animais = new ArrayList<>();
		Animal gato = new Gato("Gabriel", "Felino", 4, true, "Gatuso");
		Animal cachorro = new Cachorro("Belinha", "Canilo", 4, true, "Poodle");
		animais.add(gato);
		animais.add(cachorro);
		for (Animal animal : animais) {
			System.out.println(animal);
			animal.falar();
		}
	}

}
