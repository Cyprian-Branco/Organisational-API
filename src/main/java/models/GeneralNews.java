package models;

public class GeneralNews extends News{
    public static final String DATABASE_TYPE = "general";
    private int id;

    public GeneralNews(String content){
        this.content = content;
        this.type = DATABASE_TYPE;
    }

}
