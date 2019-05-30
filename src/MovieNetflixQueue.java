
public class MovieNetflixQueue {
	
	
	public static void main(String[] args) {
		
	NetflixQueue a = new NetflixQueue();
	
	Movie b= new Movie("A dogs journey", 8 );
	Movie c= new Movie("End game", 10);
	Movie d= new Movie("Avengers", 9);
	
	a.addMovie(b);
	a.addMovie(c);
	a.addMovie(d);
	a.printMovies();
	System.out.println("the best movie is"+a.getBestMovie());
	System.out.println("the second best movie"+a.getSecondBestMovie() );
	
	}

}
