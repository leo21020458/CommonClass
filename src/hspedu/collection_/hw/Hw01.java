package hspedu.collection_.hw;

import java.util.ArrayList;

public class Hw01 {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("12219283913829839283928192831231"));
        arrayList.add(new News("12323434234423048294209489032840"));

        int size = arrayList.size();
        for (int i = size-1 ; i >= 0; i--) {
//            System.out.println(arrayList.get(i));
            News news = (News) arrayList.get(i);
            System.out.println(processTitle(news.getTitle()));
        }

    }
    public static String processTitle(String title){
        if(title == null){
            return "";
        }
        if(title.length()>15){
            return title.substring(0,15)+"...";
        } else{
            return title;
        }
    }
}

class News{
    private String title;
    private String content;

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public News(String title) {
        this.title = title;
    }


}