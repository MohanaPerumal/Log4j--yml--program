package com.kgfsl.fixme.controller;


import com.kgfsl.fixme.model.Article;
import com.kgfsl.fixme.service.ArticleServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping("user")
@CrossOrigin(origins = { "http://localhost:4200" })
public class ArticleController {
@Autowired
private ArticleServiceImpl articleServiceImpl;


@GetMapping("article")
public ResponseEntity<Article> getArticleById(@RequestParam("id") String id) {
Article article = articleServiceImpl.getArticleById(Integer.parseInt(id));
return new ResponseEntity<Article>(article, HttpStatus.OK);
}

@GetMapping("all-articles")
public ResponseEntity<List<Article>> getAllArticles() {
List<Article> list = articleServiceImpl.getAllArticles();
return new ResponseEntity<List<Article>>(list, HttpStatus.OK);
}

@PostMapping("article")
public ResponseEntity<Void> createArticle(@RequestBody Article article, UriComponentsBuilder builder) {
articleServiceImpl.createArticle(article);
HttpHeaders headers  = new HttpHeaders();
headers.setLocation(builder.path("/article?id={id}").buildAndExpand(article.getArticleId()).toUri());
return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
}

@PutMapping("article")
public ResponseEntity<Article> updateArticle(@RequestBody Article article) {
articleServiceImpl.updateArticle(article);
return new ResponseEntity<Article>(article, HttpStatus.OK);
}

@DeleteMapping("article")
public ResponseEntity<Void> deleteArticle(@RequestParam("id") String id) {
articleServiceImpl.deleteArticle(Integer.parseInt(id));
return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
}
}