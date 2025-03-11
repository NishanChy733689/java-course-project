import java.util.ArrayList;

class Item{
    int id;
    int authorPass;
    private String name="not set";
    Item(int authorPass,int id){
        this.authorPass=authorPass;
        this.id=id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (this.name.equals("not set")){
        this.name=name;
        }else{
            System.out.println("There is already a name set !");
        }
    }
    public void changeName(String name,int password) {
        if (password==authorPass){
            this.name = name;
        }
    }
}
class Book extends Item{
    private int numPages;
    private String authorName="not set";
    Book(int authorPass, int id) {
        super(authorPass, id);
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String name) {
        if (this.authorName.equals("not set")){
            this.authorName=name;
        }else{
            System.out.println("There is already a name set !");
        }
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }
}
class Dvd extends Item{
    private String director="not set";
    private float runningTimeHours;
    Dvd(int authorPass, int id) {
        super(authorPass, id);
    }

    public float getRunningTimeHours() {
        return runningTimeHours;
    }

    public void setRunningTimeHours(float runningTimeHours) {
        this.runningTimeHours = runningTimeHours;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String name) {
        if (this.director.equals("not set")){
            this.director=name;
        }else{
            System.out.println("There is already a name set !");
        }
    }
}
class Cd extends Item{
    private String artistName="not set";
    private int numTracks;
    Cd(int authorPass, int id) {
        super(authorPass, id);
    }

    public int getNumTracks() {
        return numTracks;
    }

    public void setNumTracks(int numTracks) {
        this.numTracks = numTracks;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String name) {
        if (this.artistName.equals("not set")){
            this.artistName=name;
        }else{
            System.out.println("There is already a name set !");
        }
    }
}

class Patron{
    String name;
    private int Items_pending;
    ArrayList<Integer> daysToReturn;
    ArrayList<Item> Borrows;
    Patron(String name){
        this.name=name;
    }

    public void dayPass(){
        for (int i:daysToReturn){

        }
    }
}




public class Main {
    public static void main(String[] args) {

    }
}