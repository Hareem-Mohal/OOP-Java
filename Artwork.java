public class Artwork{
			private String title;
			private int year;
			private Artist artist;

	public void setTitle(String title){
				this.title=title;
}

public void setYear(int year){
				this.year=year;
}


public void setArtist(Artist artist){
				this.artist=artist;
}

public String getTitle(){
				return title;
}

public Int getYear(){
				return year;
}

public Artist getArtist(){
				return artist;
}

Artwork(){
				this.title=setTitle("Woww");
				this.year=setYear("2022");
				this.artist=getArtist();

}


Artwork(String title,Int year, new Artist()){
				this.title=title;
				this.year=year;
				this.artist=artist;

}

public void display(){
			System.out.println("Artwork:"+title);
			System.out.println("Year :"+year);
			artist.diplay;

}



}