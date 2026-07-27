package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogRecord {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    private Date date;
    private String type;
    private String description;

    public LogRecord(Date date, String type, String description) {
        this.date = date;
        this.type = type;
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
