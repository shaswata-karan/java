import java.util.ArrayList;
import java.util.Scanner;

public class PraMock2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No Of Theaters: ");
        int NoOfTheaters = sc.nextInt();

        // initialize ArrayList
        ArrayList<Theater> theaterList = new ArrayList<>();

        for (int i = 0; i < NoOfTheaters; i++) {
            System.out.println("Enter theater " + i +" details:");

            System.out.println("theater id: ");
            int thid = sc.nextInt();
            sc.nextLine();

            System.out.println("theater name: ");
            String thname = sc.nextLine();

            System.out.println("theater location: ");
            String thlocation = sc.nextLine();

            System.out.println("NoOfMoviesRunning in theater: ");
            int NoOfMoviesRunning = sc.nextInt();
            sc.nextLine();

            // initialize ArrayList
            ArrayList<Movies> movieList = new ArrayList<>();
            
            for (int j = 0; j < NoOfMoviesRunning; j++) {
                System.out.println("Enter movie " + i+1 +" details:");

                System.out.println("movie id: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.println("movie name: ");
                String name = sc.nextLine();

                System.out.println("movie genre: ");
                String genre = sc.nextLine();

                System.out.println("movie price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                movieList.add(new Movies(id, name, genre, price));
            }
            theaterList.add(new Theater(thid, thname, thlocation, movieList));
        }

        MovieTheaterService service = new MovieTheaterService();
        System.out.print("Enter movie id to search: ");
        int searchMovieId = sc.nextInt();

        // methodcall1
        ArrayList<Theater> result = service.getTheatersRunningTheMovie(theaterList, searchMovieId);
        if (result.isEmpty()) {
            System.out.println("No Theater found");
        } else {
            System.out.println("Theaters running movie with ID " + searchMovieId + ":");
            for (Theater theater : result) {
                System.out.println("Theater ID: " + theater.thid + ", Name: " + theater.thname + ", Location: " + theater.thlocation);
            }
        }

        // methodcall2
        System.out.print("Enter theater id to search: ");
        int searchTheaterId = sc.nextInt();
        int result2 = service.MoviesRunningInTheTheater(theaterList, searchTheaterId);
        if (result2 == -1) {
            System.out.println("No shows found");
        } else {
            System.out.println("Total movies running in Theater ID " + searchTheaterId + ": " + result2);
        }

        sc.close();
    }
}

class MovieTheaterService {
    // method1
    public ArrayList<Theater> getTheatersRunningTheMovie(ArrayList<Theater> theaterList, int searchMovieId) {
        ArrayList<Theater> resultList = new ArrayList<>();
        
        for (Theater theater : theaterList) {
            for (Movies movie : theater.movieList) {
                if (movie.id == searchMovieId) {
                    resultList.add(theater);
                    break;
                }
            }
        }
        return resultList;
    }

    // method2
    public int MoviesRunningInTheTheater(ArrayList<Theater> theaterList, int searchTheaterId) {
        for (Theater theater : theaterList) {
            if (theater.thid == searchTheaterId) {
                return theater.movieList.size();
            }
        }
        return -1;
    }

}

class Theater {
    int thid;
    String thname;
    String thlocation;
    ArrayList<Movies> movieList;

    public Theater(int thid, String thname, String thlocation, ArrayList<Movies> movieList) {
        this.thid = thid;
        this.thname = thname;
        this.thlocation = thlocation;
        this.movieList = movieList;
    }
}

class Movies {
    int id;
    String name;
    String genre;
    double price;

    public Movies(int id, String name, String genre, double price) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public double getPrice() {
        return price;
    }
}