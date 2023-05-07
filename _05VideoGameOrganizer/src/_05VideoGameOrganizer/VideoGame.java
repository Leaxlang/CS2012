package _05VideoGameOrganizer;
//attributes for the VideoGame class
public class VideoGame  {
	private String gameName;
	private String platform;
	private String year;
	private String genre;
	private String publisher;
	private String na_sales;
	private String eu_sales, jp_sales, other_sales, global_sales;
	
	//constructor 
	public VideoGame(String gameName, String platform, String year, String genre, 
			String publisher, String na, String eu, String jp, String other, String global)
	{
		this.gameName = gameName;
		this.platform = platform;
		this.year = year;
		this.genre = genre;
		this.publisher = publisher;
		this.na_sales = na;
		this.eu_sales = eu;
		this.jp_sales = jp;
		this.other_sales = other;
		this.global_sales = global;
	}
	
	//getter and setter for name, platform, year, genre, publisher, and all sales regions
	
	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getNa_sales() {
		return na_sales;
	}

	public void setNa_sales(String na_sales) {
		this.na_sales = na_sales;
	}

	public String getEu_sales() {
		return eu_sales;
	}

	public void setEu_sales(String eu_sales) {
		this.eu_sales = eu_sales;
	}

	public String getJp_sales() {
		return jp_sales;
	}

	public void setJp_sales(String jp_sales) {
		this.jp_sales = jp_sales;
	}

	public String getOther_sales() {
		return other_sales;
	}

	public void setOther_sales(String other_sales) {
		this.other_sales = other_sales;
	}

	public String getGlobal_sales() {
		return global_sales;
	}

	public void setGlobal_sales(String global_sales) {
		this.global_sales = global_sales;
	}
	
	public String toString()
	{
		return gameName + ", " + platform + ", " + year + ", " + genre + ", " + publisher + ", " + na_sales + ", " + eu_sales + ", " + jp_sales + ", " + other_sales + ", " + global_sales;
	}
	
}