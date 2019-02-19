package structures.goods;

public class Options {
    
    private int id;
    private String title;
    private KindsOfOptions kind;
    private String internet;
    private String sms;
    private String minutes;
    
    public Options(int id, String title, KindsOfOptions kind, String internet, String sms, String minutes) {
        this.id = id;
        this.title = title;
        this.kind = kind;
        this.internet = internet;
        this.sms = sms;
        this.minutes = minutes;
    }
    
   
    public int getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public KindsOfOptions getKind() {
        return kind;
    }
    
    public String getInternet(){
        return internet;
    }
    
    public String getSMS(){
        return sms;
    }
    
    public String getMinutes(){
        return minutes;
    }
    
}
