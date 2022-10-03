public class Author<VariableType>{
    
    private String bookname;
    private String bookquote;
    private VariableType authorname;

    public void setAuthorname(VariableType authorname) {
        this.authorname = authorname;
    }
    public VariableType getAuthorname() {
        return authorname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookquote(String bookquote) {
        this.bookquote = bookquote;
    }
    public String getBookquote() {
        return bookquote;
    }
}
