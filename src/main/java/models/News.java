package models;

public abstract class News {
    public static String content;
    public String type;

    public static String getContent() {
        return content;
    }

    public String getType() {
        return type;
    }

    public void setContent(String content){
        this.content = content;
    }

    public void setType(String type) {
        this.type = type;
    }
}
