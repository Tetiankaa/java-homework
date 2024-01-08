package homework1;

import java.util.ArrayList;

public class Book {

    private String title;
    private int pages;
    private ArrayList<String> authors;
    private String genre;

    public Book(String title, int pages, ArrayList<String> authors, String genre){
        this.title = title;
        this.pages = pages;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle(){
        return this.title;
    }

    public int getPages(){
        return this.pages;
    }

    public ArrayList<String> getAuthors(){
        return this.authors;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPages(int pages){
        this.pages = pages;
    }

    public void setAuthors(ArrayList<String> authors){
        this.authors = authors;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }
}
