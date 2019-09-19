package mediaapplication;

import java.util.Scanner;


public class Audio extends Media {

    private String genre;
    private String isConcert;

    public Audio(String genre, String isConcert, String title, String majorArtist, String distributor, String playingTime, String price) {
        super(title, majorArtist, distributor, playingTime, price);
        this.genre = genre;
        this.isConcert = isConcert;
    }

    public Audio() {
        super();
        this.genre = "";
        this.isConcert = "";
    }

    public void takeInput() {

        Scanner inp = new Scanner(System.in);
        super.takeInput();
        System.out.println("Enter Genre");
        this.genre = inp.nextLine();
        System.out.println("Enter Y if for Concert N for not");
        this.isConcert = inp.nextLine();

        System.out.println("The entered values are following \n");
        System.out.println(this.toString() + "\n");
    }

    @Override
    public String toString() {
        return super.toString() + "Audio{" + "genre=" + genre + ", isConcert=" + isConcert + '}';
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getIsConcert() {
        return isConcert;
    }

    public void setIsConcert(String isConcert) {
        this.isConcert = isConcert;
    }

}