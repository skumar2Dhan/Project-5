package packagemain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mediaapplication.Audio;
import mediaapplication.Media;
import mediaapplication.Video;


public class App {

    protected static List<Media> media;

    public static void main(String[] args) {
        media = new ArrayList<>();
        App a = new App();
        a.startApp();
    }

    public void startApp() {
        Scanner inp = new Scanner(System.in);
        String choice = "";
        while (!choice.equals("5")) {
            String menu = "1) Enter a new item to the collection"
                    + "\n2) List all items in a collection."
                    + "\n3) Search for an item with the title. (Output the information about found item on screen.)"
                    + "\n4) List all items with a particular artist. "
                    + "\n5) Quit the program."
                    + "\n\nSelect your choice:";
            System.out.print(menu);
            System.out.println("");
            choice = inp.nextLine();
            switch (choice) {
                case "1": {
                    System.out.println("1) Video"
                            + "\n2) Audio");
                    String type = inp.nextLine();
                    switch (type) {
                        case "1": {
                            Video v = new Video();
                            v.takeInput();
                            media.add(v);
                            break;
                        }
                        case "2": {
                            Audio a = new Audio();
                            a.takeInput();
                            media.add(a);
                            break;
                        }
                    }
                    break;
                }
                case "2": {
                    if (media.size() > 0) {
                        System.out.println("The items in the collection are as follows");
                        for (int i = 0; i < media.size(); i++) {
                                System.out.println(media.get(i).toString());
                        }
                    } else {
                        System.out.println("The collection is empty\n");
                    }
                    break;
                }
                case "3": {
                    Scanner tt = new Scanner(System.in);
                    System.out.print("Enter title to search for in the collection: ");
                    String title = tt.nextLine();
                    boolean found = false;
                    if (media.size() > 0) {
                        System.out.print("The Item with the title " + title);
                        for (int i = 0; i < media.size(); i++) {
                            if (media.get(i).getTitle().equals(title)) {
                                System.out.println(media.get(i).toString());
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println(" dose not exist in the collection");
                        }
                    } else {
                        System.out.println("The collection is empty\n");
                    }
                    System.out.println("");
                    break;
                }
                case "4": {
                    Scanner tt = new Scanner(System.in);
                    Scanner art = new Scanner(System.in);
                    System.out.print("Enter artist: ");
                    String artist = art.nextLine();
                    boolean found = false;
                    if (media.size() > 0) {
                        System.out.print("The Item having artist " + artist);
                        for (int i = 0; i < media.size(); i++) {
                            if (media.get(i).getMajorArtist().equals(artist)) {
                                System.out.println(media.get(i).toString());
                                found = true;
                            }
                        }
                        if (!found) {
                            System.out.println(" dose not exist in the collection");
                        }
                    } else {
                        System.out.println("The collection is empty\n");
                    }
                    System.out.println("");
                    break;
                }
                case "5": {
                    break;
                }
            }
        }
    }
}