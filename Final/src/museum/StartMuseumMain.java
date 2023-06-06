package museum;

import java.util.ArrayList;
import museum.Exhibit.DisplayType;

public class StartMuseumMain {

	static int score = 0;

	public static void main(String[] args) {

		try {
			// make the person object visiting the Museum
			MyPersona happyVisitor = new MyPersona();
			score = score + 20;

			System.out.println("Hi there " + happyVisitor.getName()
					+ ".\nWelcome to the Museum.\nEnjoy your journey of discovery today as you visit the exhibits");
			// every time your program survives another call to a class or method, your
			// score increases.
			score = score + 5;

			ArrayList<Exhibit> displays = new ArrayList<>();
			score = score + 5;

			Mummy mum_1 = new Mummy("Egyptian Mummy", "Amenophis II", true, false, "found in Pyramid", "1397 BCE");
			score = score + 5;

			Mummy mum_2 = new Mummy("Frozen Iceman");
			mum_2.setNameOfPerson("Ötzi");
			mum_2.setDescription("found in French mountains");
			mum_2.setWhatYear("3300 BCE");
			mum_2.setIsCursed(true);
			mum_2.applyMagicSeal();
			score = score + 5;

			Dinasaurs dino_1 = new Dinasaurs("Tyranasaurus Rex", "Bipedal with tail",
					"Armored mechanical battle dinasaur with machinegun used in WW2", "1945");
			score = score + 5;

			Dinasaurs dino_2 = new Dinasaurs("Pterodactyl");
			dino_2.setTypeOfDinasaur("Flying Pterodactyloidea");
			dino_2.setDescription("Monsterous flying terror with a huge tooth filled bill");
			dino_2.setWhatYear("Jurassic and Cretaceous Periods");
			
			score = score + 5;

			MedievalArmor armor_1 = new MedievalArmor("King Charlemane Gold Plated Armor", "King Charlemane", false,
					false, "Full suit of battle ready plate armor", "1066", "plate armor");
			score = score + 5;

			MedievalArmor armor_2 = new MedievalArmor("Prince Johns Sheild and Crest");
			armor_2.setOriginalOwner("Prince John of Nauhtingham");
			armor_2.setArmorType("One handed round shield");
			armor_2.setDescription(
					"This type of shield was weak against Ballista, as can be seen by the large hole in it that killed Prince John");
			armor_2.setWhatYear("1642 AD");
			armor_2.setIsCursed(true);
			armor_2.applyMagicSeal();
			score = score + 5;

			// make exhibits and add items to them
			Exhibit ex_1 = new Exhibit(DisplayType.PEDISTAL, mum_1);
			score = score + 2;
			Exhibit ex_2 = new Exhibit(DisplayType.GLASSCASE, mum_2);
			score = score + 2;
			Exhibit ex_3 = new Exhibit(DisplayType.PEDISTAL, dino_1);
			score = score + 2;
			Exhibit ex_4 = new Exhibit(DisplayType.HANGFROMCELING, dino_2);
			score = score + 2;
			Exhibit ex_5 = new Exhibit(DisplayType.PEDISTAL, armor_1);
			score = score + 2;
			Exhibit ex_6 = new Exhibit(DisplayType.WALL, armor_2);
			score = score + 2;

			// add the exhibits to the museum
			displays.add(ex_1);
			displays.add(ex_4);
			displays.add(ex_3);
			displays.add(ex_5);
			displays.add(ex_6);
			displays.add(ex_2);
			score = score + 6;

			// running through the museum, lets see what is here
			int index = 0;
			int numDisplays = displays.size();
			score = score + 1;
			while (index < numDisplays) {

				pause(800);
				System.out.println("--------------------------------");

				// display exhibit
				System.out.println(displays.get(index).toString());
				System.out.println(happyVisitor.getName() + " said: " + happyVisitor.getRandomSaying());
				score = score + 1;

				index += 1;
			}
			score = score + 10;
			// * note - checking the output to see that the toString() methods have been
			// configured
			// Up to 9 points off if it gives the Object.toString() default output. (3
			// points off for each class that does not implement it).

			// ****** uncomment the next 4 lines of code to check that they can not be run

//			Artifact artThing = new Artifact();
//			Mummy obj_1 = new Mummy();
//			MedievalArmor obj_2 = new MedievalArmor();
//			Dinasaurs obj_3 = new Dinasaurs();

			// Artifact class must be abstract or -5 points
			// All three subclasses must not have a no-argument constructor: -3 each

			// final check that all methods are accounted for
			String test1 = mum_2.getDescription();
			boolean test2 = mum_2.getIsCursed();
			boolean test21 = mum_1.getIsCursed();
			String test3 = mum_2.getNameOfArtifact();
			String test4 = mum_2.getNameOfPerson();
			String test5 = mum_2.getWhatYear();
			String test6 = dino_1.getTypeOfDinasaur();
			String test7 = dino_1.getDescription();
			String test8 = dino_1.getNameOfArtifact();
			String test9 = dino_1.getWhatYear();
			String test10 = armor_1.getArmorType();
			String test11 = armor_1.getDescription();
			boolean test12 = armor_1.getIsCursed();
			boolean test22 = armor_2.getIsCursed();
			String test13 = armor_1.getNameOfArtifact();
			String test14 = armor_1.getOriginalOwner();
			String test15 = armor_1.getWhatYear();

			score = score + 5;

			System.out.println("\nThank you " + happyVisitor.getName()
					+ " for visiting the Museum.\nLooking forward to seeing you again in the future!");

		} catch (Exception e) {
			System.out.println("Something broke. Your partial score is " + score);
		} finally {
			System.out.println("--------------------------------");
			System.out.println("your score is " + score);
			System.out.println("--------------------------------");
		}

	}

	public static void pause(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
