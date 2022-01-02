public class Library
{
    Book[] books;
    
    public static void main(){
        Book book = new Book("Bracia Karamazow", new Writer("F.", "Dostojewski", "literary fiction"));
        Ebook ebook1 = new Ebook("Autostopem przez Galaktykę", new Writer("D.", "Adams", "sci-fi"), "D:\\mybooks");
        Ebook ebook2 = new Ebook("Ulysses", new Writer("J.", "Joyce", "realist fiction"), "D:\\mybooks");
        Audiobook audiobook1 = new Audiobook("Wojna i pokój", new  Writer("L.", "Tołstoj", "realistic fiction"), 1200, 15);
        Audiobook audiobook2 = new Audiobook("Kubuś puchatek", new Writer("A.A.", "Milne", "children literature"), 300, 49);
        
        book.display('\n');
        ebook1.display('\n');
        ebook2.display('\n');
        audiobook1.display('\n');
        audiobook2.display('\n');
    
    }
}
