/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Jia Xin Li
 */
public class News {
    private String headline;
    private String contents;
    private String author;
    private String date;
    private String newsSource;
    private String type;
    private String category;
    public News(String headline, String contents, String author, String date, String newsSource, String type, String category){
        this.headline = headline;
        this.contents = contents;
        this.author = author;
        this.date = date;
        this.newsSource = newsSource;
        this.type = type;
        this.category = category;
    }
    public String information(){
        return "This is a news";
    }
    public String getType(){
        return type;
    }
    @Override
    public String toString(){
        return "Headline: " + headline + "\nContent: " + contents + "\nAuthor: " + author + "\nDate" + date + "\nNews Source: " + newsSource + "\nType: " + type + "\nCategory" + category;
    }
}