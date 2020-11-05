package hibernate;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "Author")
public class Author implements java.io.Serializable {

    private int authorId;
    private String authorName;
    private String authorLastName;
    private String authorEmail;

    @ManyToMany
    @JoinTable(name="authorArticle",
            joinColumns=@JoinColumn(name="authorId"),
            inverseJoinColumns=@JoinColumn(name="articleId"))
    private List<Article> articles;

    public Author() {
    }

    public Author(int authorId, String authorName, String authorLastName,
                  String authorEmail, List<Article> articles) {
        this.authorId = authorId;
        this.authorName = authorName;
        this.authorLastName = authorLastName;
        this.authorEmail = authorEmail;
        this.articles = articles;
    }

    @Id
    @Column(name = "authorId", unique = true, nullable = false, precision = 5, scale = 0)
    public int getAuthorId() {
        return this.authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Column(name = "authorName", nullable = false, length = 20)
    public String getAuthorName() {
        return this.authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Column(name = "authorLastName", nullable = false, length = 20)
    public String getAuthorLastName() {
        return this.authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    @Column(name = "authorEmail", nullable = false, length = 30)
    public String getAuthorEmail() {
        return this.authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public List<Article> getArticles() {
        return this.articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "Developer:\n" +
                "id: " + authorId +
                "\nFirst Name: " + authorName + "\n" +
                "Last Name: " + authorLastName + "\n" +
                "Email: " + authorEmail + "\n" +
                "Articles: " + articles + "\n";
    }
}