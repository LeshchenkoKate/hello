package hibernate;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "Comment")
public class Comment implements java.io.Serializable {

    private int commentId;
    private String commentContent;

    @ManyToOne (fetch=FetchType.LAZY,
            cascade=CascadeType.ALL)
    @JoinColumn (name="authorId")
    private Author author;

    @ManyToOne (fetch=FetchType.LAZY,
            cascade=CascadeType.ALL)
    @JoinColumn (name="articleId")
    private Article article;

    public Comment() {
    }

    public Comment(int commentId, String commentContent, Article article, Author author) {
        this.commentId = commentId;
        this.commentContent = commentContent;
        this.article = article;
        this.author = author;
    }

    @Id
    @Column(name = "commentId", unique = true, nullable = false, precision = 5, scale = 0)
    public int getCommentId() {
        return this.commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    @Column(name = "commentContent", nullable = false, length = 20)
    public String getCommentContent() {
        return this.commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Article getArticle() {
        return this.article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}