package com.kgfsl.fixme.model;

import java.util.List;
import javax.persistence.*;
@Entity
public class Article{
    @Id
 //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id")
    private int articleId;
   @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "article_id")
    private List<ArticleDetail> articleDetail;
    public Article(){
        super();
    }
     public int getArticleId() {
        return articleId;
    }
    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }
    public void setArticle(List<ArticleDetail> articleDetail){
        this.articleDetail=articleDetail;
    }

    public List<ArticleDetail> getArticle(){
        return articleDetail;
    }

}