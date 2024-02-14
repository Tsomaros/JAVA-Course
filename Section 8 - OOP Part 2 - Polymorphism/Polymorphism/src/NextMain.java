public class NextMain {

    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure Jaws = (Adventure) Movie.getMovie("A", "Jaws");
        Jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplaine");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airpane = Movie.getMovie("C", "Airplane");
        airpane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("C", "Airplane");
        if (unknownObject.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }else if (unknownObject instanceof Adventure){
            ((Adventure)unknownObject).watchAdventure();
        }else if (unknownObject instanceof ScienceFiction syfy){
            syfy.watchScienceFiction();
        }


    }

}
