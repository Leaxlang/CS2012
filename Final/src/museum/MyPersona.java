package museum;

import java.util.ArrayList;
import java.util.Random;

public class MyPersona {

	//You must customize this to include your information for grading information, and fun quotes
	
	public final String name = "Lea Lang";
	public final String myEmail = "llang@calstatela.edu";
	
	private ArrayList<String> sayings = new ArrayList<String>();
	
	public MyPersona() {
		// things that you might say at a Fair or whatever
		sayings.add("I went to a street where the houses were numbered 8k, 16k, 32k, 64k, 128k, 256k and 512k."
				+ "\nIt was a trip down Memory Lane.");
		sayings.add("“Debugging” is like being the detective in a crime drama where you are also the murderer.");
		sayings.add("The best thing about a Boolean is that even if you are wrong, you are only off by a bit.");
		sayings.add("“Knock, knock.”\n"
				+ "“Who’s there?”\n"
				+ "[very long pause] “Java.”");
		sayings.add("[“hip”,”hip”] (hip hip array!)");
	}
	
	public String getRandomSaying() {
		Random rndx = new Random();
		int sayNum = rndx.nextInt(sayings.size());
		return sayings.get(sayNum);
	}
		
	public ArrayList<String> getSayingList(){
		return sayings;
	}

	public String getName() {
		return name;
	}

	public String getMyEmail() {
		return myEmail;
	}
}
