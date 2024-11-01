import org.w3c.dom.Text;

class Book{
    String author;
    String title;
    int numPages;
    Book(String author,String title,int numPages){
        this.author=author;
        this.title=title;
        this.numPages=numPages;
    }
    public String get_author(){
        return author;
    }
    public String get_title(){
        return title;
    }
    public int getNumPages(){
        return numPages;
    }
}

class TextBook extends Book{
    private int price;
    TextBook(String title,String author,int pages,int price){
        super(author,title,pages);
    }
    public void advertise(){
        System.out.println("Hello keen readers today we have got a book for you which is called\n "+get_title()+"' and it is written by "+get_author()+
                "\n And the price, It is only "+price+"$ for a such book of "+getNumPages()+" pages");
    }
}




public class publisher {
    public static void main(String[] args) {
        TextBook comic=new TextBook("Noman 6.2","Antik Mahmud",200,2);
        comic.advertise();
    }
}
