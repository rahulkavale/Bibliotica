public class Book {
    private int ISBN;
    private String name;
    private String category;
    private String auther;
    private int copiesAvailable;
    public Book(int ISBN,String name,String category,String auther,int copiesAvailable)
    {
        this.ISBN=ISBN;
        this.name=name;
        this.category=category;
        this.auther=auther;
        this.copiesAvailable=copiesAvailable;
    }
    public void addCopy(int addCopies)
    {
           copiesAvailable+=addCopies;
    }
    public boolean hasTheBookWithGivenISBN(int isbn){
        if(ISBN==isbn)
            return true;
        return false;
    }
    public boolean bookCopy(){
        if(areCopiesAvailable()){
            copiesAvailable-=1;
            return true;
        }
        return false;

    }
    public boolean areCopiesAvailable(){
        return (copiesAvailable>=1);
    }
    public boolean equals(Book book){
        if(book==null)return false;
        if(this==book)return true;
        if((this.ISBN==book.ISBN)&&(this.name.equals(book.name))&&(this.category.equals(book.category)))
            return true;
        return false;
    }

    public void print() {
        System.out.println(String.format("%-4d %-16s %-16s %-16s %-2d\n",ISBN,name,category,auther,copiesAvailable));
    }
}
