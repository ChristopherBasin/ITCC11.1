class MoviesWatched{
   Movie movie;
   private int minutesWatched;

   public MoviesWatched(Movie movie, int minutesWatched){
    this.movie = movie;
    this.minutesWatched = minutesWatched;
   }
   public Movie getMovie() { 
    return movie;
 }
   public int getMinutesWatched() { 
    return minutesWatched;
 }
}
    
