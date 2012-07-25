public class Book {
    private String ISBN;
    private String name;
    private String category;
    private String auther;

    public Book(String ISBN,String name,String category,String auther)
    {
        this.ISBN=ISBN;
        this.name=name;
        this.category=category;
        this.auther=auther;
    }

    public boolean hasTheSameISBN(String isbn){
        if(Integer.parseInt(ISBN)==Integer.parseInt(isbn))
        {
            return true;
        }
        return false;
    }


    public boolean equals(Book book){
        if(book==null)return false;
        if(this==book)return true;
        if((this.ISBN.equals(book.ISBN)&&(this.name.equals(book.name))&&(this.category.equals(book.category))))
            return true;
        return false;
    }

    public String toString() {
        return String.format("%-4s %-16s %-16s %-16s \n",ISBN,name,category,auther);
    }
}
