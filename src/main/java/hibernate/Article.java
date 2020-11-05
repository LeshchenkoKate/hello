package hibernate;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
//add
@Entity
@Table(name = "Article")
public class Article implements java.io.Serializable {

    private int articleId;
    private String content;
    @ManyToMany
    @JoinTable(name="authorArticle",
            joinColumns=@JoinColumn(name="authorId"),
            inverseJoinColumns=@JoinColumn(name="articleId"))
    private List<Author> authors;

    public Article() {
    }

    public Article(int articleId, String content, List<Author> authors) {
        this.articleId = articleId;
        this.content = content;
        this.authors = authors;
    }

    @Id
    @Column(name = "articleId", unique = true, nullable = false, precision = 5, scale = 0)
    public int getArticleId() {
        return this.articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    @Column(name = "content", nullable = false, length = 20)
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Author> getAuthors() {
        return this.authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

}
