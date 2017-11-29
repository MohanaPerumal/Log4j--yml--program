package com.kgfsl.fixme.model;

import java.io.Serializable;
import java.util.*;
import javax.persistence.*;

@Entity
public class ArticleDetail {
    //private static final long serialVersionUID = 1L;implements Serializable
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subid")
    private int subid;
    @Column(name = "title")
    private String title;
    @Column(name = "category")
    private String category;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "article_id", updatable = false, insertable = true)
    private Article article;

    public ArticleDetail() {
        super();
    }

    public int getArticleId() {
        return subid;
    }

    public void setArticleId(int subid) {
        this.subid = subid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

   

}