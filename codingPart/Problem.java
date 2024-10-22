package codingPart;

public class Problem {
    private long id;
    private String title;
    private String category;
    private String difficulty;
    private String link;

    public Problem(Long id, String title, String category, String difficulty, String link) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.difficulty = difficulty;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getLink() {
        return link;
    }

    public String toString() {
        return "Problem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
