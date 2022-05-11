package practisejava;

import com.github.javafaker.Animal;
import com.github.javafaker.Faker;

public class Fakerex {

		public static void main(String[] args) {

//			Faker faker=new Faker();
//			String name = faker.name().firstName();
//			String address= faker.animal().name();
//				
//			System.out.println("Name- "+name);
//			System.out.println("Address city- "+address);
			
			Faker faker=new Faker();
			System.out.println(faker.name());   // output like -  com.github.javafaker.Name@520a3426
			System.out.println("Name: "+faker.name().firstName());
			System.out.println("Address: "+faker.address().city());
			
//			Animal animal=faker.animal();
//			System.out.println("Animal name: "+animal);
			
			String animalName=faker.animal().name();
			System.out.println("Animal name: "+animalName);
		}

	}

