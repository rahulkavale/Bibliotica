/**
 * Created by IntelliJ IDEA.
 * User: rahulkav
 * Date: 7/12/12
 * Time: 9:24 PM
 * To change this template use File | Settings | File Templates.
 */
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
    public boolean hasTheBookWithGivenISBN(int isbn){//thiis function is tested in rack class test
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
        if(copiesAvailable>=1){
            return true;
        }
        return false;
    }
    public String toString(){
        return  "ISBN="+ISBN+" Name="+name+" Category="+category+" Auther="+auther+" Copies Available="+copiesAvailable;
    }
    public boolean equals(Book book){
        if(book==null)return false;
        if(this==book)return true;
        if((this.ISBN==book.ISBN)&&(this.name.equals(book.name))&&(this.category.equals(book.category)))
            return true;
        return false;
    }

}
