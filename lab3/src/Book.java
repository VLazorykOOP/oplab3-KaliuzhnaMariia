
public class Book {
    private String name;
    private String author;
    private String genre;
    private int pages;
    private int year;
    private boolean is_available;

    private Book(Builder builder){
        this.name = builder.name;
        this.author = builder.author;
        this.genre = builder.genre;
        this.pages = builder.pages;
        this.year = builder.year;
        this.is_available = builder.is_available;
    }

    public static class Builder{
        private String name;
        private String author;
        private String genre;
        private int pages;
        private int year;
        private boolean is_available;

        public Builder setName(String name){
            this.name = name;
            return this;
        }

        public Builder setAuthor(String author){
            this.author = author;
            return this;
        }

        public Builder setGenre(String genre){
            this.genre = genre;
            return this;
        }

        public Builder setPages(int pages){
            this.pages = pages;
            return this;
        }

        public Builder setYear(int year){
            this.year = year;
            return this;
        }

        public Builder setIs_available(boolean is_available){
            this.is_available = is_available;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book:" +
                "name ='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages='" + pages + '\'' +
                ", year=" + year + '\'' +
                ", is available=" + is_available;
    }
}
