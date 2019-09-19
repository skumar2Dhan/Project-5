package mediaapplication;

import java.util.Scanner;


public class Video extends Media {

    private String producer;
    private String director;
    private String rating;

    public Video() {
        super();
        this.producer = "";
        this.director = "";
        this.rating = "";
    }

    public Video(String producer, String director, String rating, String title, String majorArtist, String distributor, String playingTime, String price) {
        super(title, majorArtist, distributor, playingTime, price);
        this.producer = producer;
        this.director = director;
        this.rating = rating;
    }

    public void takeInput() {

        Scanner inp = new Scanner(System.in);
        super.takeInput();
        System.out.println("Enter Producer");
        this.producer = inp.nextLine();
        System.out.println("Enter Director");
        this.director = inp.nextLine();
        System.out.println("Enter rating");
        this.rating = inp.nextLine();

        System.out.println("The entered values are following \n");

        System.out.println(this.toString() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "Video{" + "producer=" + producer + ", director=" + director + ", rating=" + rating + '}';
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

}