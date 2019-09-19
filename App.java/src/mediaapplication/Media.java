package mediaapplication;

import java.util.Scanner;


public class Media {

    private String title;
    private String majorArtist;
    private String distributor;
    private String playingTime;
    private String price;

    public Media() {
        this.title = title;
        this.majorArtist = "";
        this.distributor = "";
        this.playingTime = "";
        this.price = "";
    }

    public Media(String title, String majorArtist, String distributor, String playingTime, String price) {
        this.title = title;
        this.majorArtist = majorArtist;
        this.distributor = distributor;
        this.playingTime = playingTime;
        this.price = price;
    }

    public void takeInput() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Title");
        this.title = inp.nextLine();
        System.out.println("Enter Major Artist");
        this.majorArtist = inp.nextLine();
        System.out.println("Enter Distributor");
        this.distributor = inp.nextLine();
        System.out.println("Enter Playing Time");
        this.playingTime = inp.nextLine();
        System.out.println("Enter price");
        this.price = inp.nextLine();

    }

    @Override
    public String toString() {
        return "Media{" + "title=" + title + ", majorArtist=" + majorArtist + ", distributor=" + distributor + ", playingTime=" + playingTime + ", price=" + price + '}';
    }

    
    public String getTitle() {
        return title;
    }

    
    public void setTitle(String title) {
        this.title = title;
    }

    
    public String getMajorArtist() {
        return majorArtist;
    }

    
    public void setMajorArtist(String majorArtist) {
        this.majorArtist = majorArtist;
    }

    
    public String getDistributor() {
        return distributor;
    }

    
    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    
    public String getPlayingTime() {
        return playingTime;
    }

    
    public void setPlayingTime(String playingTime) {
        this.playingTime = playingTime;
    }

    
    public String getPrice() {
        return price;
    }

    
    public void setPrice(String price) {
        this.price = price;
    }
}