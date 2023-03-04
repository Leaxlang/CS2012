package _05VideoGameOrganizer;
import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class VideoGameRunner {

	static VideoGame[] gameCollection = new VideoGame[3501];

	public static void main(String[] args) {
		try {
			File readFile = new File("vgsales.txt");
			Scanner scan = new Scanner(readFile);
			
			// skips first line (info data)
			int c = 1; 
			scan.nextLine();

			while (scan.hasNext()) {
				String line = scan.nextLine();
				String gameName = line.split(",")[1];
				String platform = line.split(",")[2];
				String year = line.split(",")[3];
				String genre = line.split(",")[4];
				String publisher = line.split(",")[5];
				String na_sales = line.split(",")[6];
				String eu_sales = line.split(",")[6];
				String jp_sales = line.split(",")[6];
				String other_sales = line.split(",")[6];
				String global_sales = line.split(",")[6];
	
				//adding VideoGame object to array "gameCollection"
				gameCollection[c] = (new VideoGame(gameName, platform, year, genre, publisher, na_sales, eu_sales, jp_sales,
						other_sales, global_sales));
				c++;
			}

			//its the function you gave us, and I don't know how to use it and therefore fix it
			
//			Arrays.sort(gameCollection, (a,b) -> a.getGlobal_sales().compareTo(b.getGlobal_sales()));
			
			scan.close();

			Scanner input = new Scanner(System.in);

			System.out.println("What games would you like to look at?");
			System.out.println("\t[1] Collect games by genre.");
			System.out.println("\t[2] Collect games by platform.");
			System.out.println("\t[3] Collect games by publisher.");
			System.out.println("\t[4] Collect games by total revenue.");

			char operation = input.nextLine().charAt(0);
			PrintWriter write;

			switch (operation) {
			case '1':
				System.out.println(
						"Enter Genre: [Sports][Racing][Role-Playing][Platform][Puzzle]\n[Misc][Shooter][Simulation][Action][Fighting]");
				String g = input.next();
				
				//prevent case sensitivity
				g = g.substring(0, 1).toUpperCase().concat(g.substring(1,g.length()).toLowerCase());
				
				//check if collection already exists
				if(!new File(g + ".txt").exists()) {
					//if not, write new file 
					File newFile = new File(g + ".txt");
					write = new PrintWriter(newFile);
					write.println("Rank,Name,Platform,Year,Genre,Publisher,NA_Sales,EU_Sales,JP_Sales,Other_Sales,Global_Sales");
					int countGenre = 0;

					//loops though array gameCollection prints it onto new text file 
					for (int v = 1; v < gameCollection.length; v++) {
						String genre = gameCollection[v].getGenre();

						if (genre.equals(g)) {
							write.println(gameCollection[v].toString());
							countGenre++;
						}
					}
					write.flush();
					if(countGenre == 0)
						System.out.println("Unsuccessful! 0 games were collected!");
					else
						System.out.println("Successful! " + countGenre + " games were collected!");

				}
				else {
					System.out.println("Collection already exists!");	
				}
				break;
			case '2':
				System.out.println("Enter Platform: [Wii][NES][GB][DS][X360][PS3][PS2][GBA][3DS]\n[PS4][N64][XB][PS][PC][SNES][XOne]");
				String p = input.next();

				if(!new File(p + ".txt").exists()) {
					File newFile2 = new File(p + ".txt");
					write = new PrintWriter(newFile2);
					write.println("Rank,Name,Platform,Year,Genre,Publisher,NA_Sales,EU_Sales,JP_Sales,Other_Sales,Global_Sales");
					int countPlatform = 0;
					for (int v = 1; v < gameCollection.length; v++) {
						String platform = gameCollection[v].getPlatform();
						if (platform.equals(p)) {
							write.println(gameCollection[v]);
							countPlatform++;
						}
					}
					write.flush();
					if(countPlatform == 0)
						System.out.println("Unsuccessful! 0 games were collected!");
					else
						System.out.println("Successful! " + countPlatform + " games were collected!");
					break;
				}
				else {
					System.out.println("Collection already exists!");
				}
				break;
			case '3':
				System.out.println("Enter Publisher: [Bethsda Softworks][Activision][Sony Computer Entertainment][Konami Digital Entertainment][Microsoft Game Studios][Namco Bandai Games][Ubisoft][Nintendo]\n[Take-Two Interactive][Electronic Arts][Capcom][Square Enix][LucasArts][505 Games][Palcom][Eidos Interactive][Disney Interactive Studios][Warner Bros. Interactive Entertainment][THQ][Sega]");
				String p2 = input.next();

				if(!new File(p2 + ".txt").exists()) {
					File newFile3 = new File(p2.trim() + ".txt");
					write = new PrintWriter(newFile3);
					write.println("Rank,Name,Platform,Year,Genre,Publisher,NA_Sales,EU_Sales,JP_Sales,Other_Sales,Global_Sales");
					int countPublisher = 0;
					for (int v = 1; v < gameCollection.length; v++) {
						String publisher = gameCollection[v].getPublisher();
						if (publisher.equals(p2)) {
							write.println(gameCollection[v]);
							countPublisher++;
						}
					}
					write.flush();
					if(countPublisher == 0)
						System.out.println("Unsuccessful! 0 games were collected!");
					else
						System.out.println("Successful! " + countPublisher + " games were collected!");
				}else {
					System.out.println("This file already exists!");
				}
				break;
			case '4':
				System.out.println("Enter Revenue: [Enter Decimal]");
				String r = input.next();
				if(!new File("numberRow.txt").exists()) {
					File newFile4 = new File("Revenue_For_" + r + ".txt");
					write = new PrintWriter(newFile4);
					write.println("Rank,Name,Platform,Year,Genre,Publisher,NA_Sales,EU_Sales,JP_Sales,Other_Sales,Global_Sales");
					int countRevenue = 0;
					for (int v = 1; v < gameCollection.length; v++) {

						double total = Double.parseDouble(gameCollection[v].getGlobal_sales());

						if(total <= Double.parseDouble(r))
						{
							write.println(gameCollection[v].toString());
							countRevenue++;
						}
					}
					write.flush();
					if(countRevenue == 0)
						System.out.println("Unsuccessful! 0 games were collected!");
					else
						System.out.println("Successful! " + countRevenue + " games were collected!");
				}
				else {
					System.out.println("This collection already exists!");
				}
				break;
			default:
				input.close();
				System.out.println("Unsuccessful! " + operation + " is not a recognized command.");
				System.exit(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
