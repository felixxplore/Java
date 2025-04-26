package InnerClasses;


class Book{
    private String title;
    private BookCategory category;

    public Book(String title, BookCategory category){
        this.title=title;
        this.category=category;
    }

        public static class BookCategory{
            private String genre;

            public BookCategory(String genre){
                this.genre=genre;
            }

            public String getGenre(){
                return genre;
            }

            public static String getCategoryDescription(){
                return "Category : Fiction, Non-Fiction, Biography etc.";
            }


        }

        @Override
        public String toString(){
        return "Book[title : "+title+ ", genre="+category.getGenre()+"]";
        }
}



public class StaticInnerClass {
    public static void main(String[] args) {

        Book.BookCategory bookCategory=new Book.BookCategory("Fiction");
        Book book=new Book("The Great Gatsy",bookCategory);
        System.out.println(book);
        System.out.println(Book.BookCategory.getCategoryDescription());

    }
}
