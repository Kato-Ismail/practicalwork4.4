public class Book {
    public String title;
    public String author;
    private String isbn;
    int copiesAvailable;

    public Book(String Title,String Author,String Isbn,int CopiesAvailable){
        title = Title;
        author = Author;
        isbn = Isbn;
        copiesAvailable = CopiesAvailable;
        System.out.println("Book Title" +" "+ title);
        System.out.println("Book Author" +" "+ author);
        System.out.println("Book Isbn" +" "+ isbn);
        System.out.println("Book Copies" +" "+ copiesAvailable);

    }



    public String getIsbn(){
        return isbn;
    }
    public int getCopiesAvailable(){
        return copiesAvailable;
    }
}
