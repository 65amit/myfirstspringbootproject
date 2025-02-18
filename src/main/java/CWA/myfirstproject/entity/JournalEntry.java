package CWA.myfirstproject.entity;

public class JournalEntry { // This is a POJO class
    private long id;
    private String title;
    private String content;

    // No-argument constructor (IMPORTANT)
    public JournalEntry() {
    }

    // Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
}
