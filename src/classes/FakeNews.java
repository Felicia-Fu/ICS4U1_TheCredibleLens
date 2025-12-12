/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author FFC03
 */
public class FakeNews extends News{
    private String sourceOfError;
    
    public FakeNews(String type, String category, String headline, String contents, String author, String date, String newsSource, String sourceOfError){
        super(type, category, headline, contents, author, date, newsSource);
        this.sourceOfError = sourceOfError;
    }
    
    public String getSourceOfError(){
        return sourceOfError;
    }
    
    @Override
    public String information(){
        return "This is fake news. Source of Error: " + sourceOfError;
    }
}
