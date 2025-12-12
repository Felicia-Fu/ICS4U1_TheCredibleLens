/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author Jia Xin Li
 */
public class RealNews extends News{
    //Created variables
    private String url;
    
    /**
     * Constructor for RealNews Class
     * @param type
     * @param category
     * @param headline
     * @param contents
     * @param author
     * @param date
     * @param newsSource
     * @param url
     */
    public RealNews(String type, String category, String headline, String contents, String author, String date, String newsSource, String url){
        super(type, category, headline, contents, author, date, newsSource);
        this.url = url;
    }
    
    /**
     * Override method for constant output
     * @return
     */
    @Override
    public String information(){
        return """
               This is a real news
               Learn more at: """ + url;
    }
}
