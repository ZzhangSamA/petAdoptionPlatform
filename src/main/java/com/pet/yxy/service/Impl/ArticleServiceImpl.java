package com.pet.yxy.service.Impl;

import com.pet.yxy.dto.ArticleDto;
import com.pet.yxy.mapper.BlogArticleMapper;
import com.pet.yxy.pojo.BlogArticle;
import com.pet.yxy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    BlogArticleMapper blogArticleMapper;


    public List<ArticleDto> initArticlePage(BlogArticle blogArticle) {
        if(blogArticle.getArticleTitle() == null) {
            blogArticle.setArticleTitle("%%");
        }else {
            blogArticle.setArticleTitle("%" + blogArticle.getArticleTitle() + "%");
        }
        return blogArticleMapper.initArticlePage(blogArticle);
    }

    public int getTotalCount() {
        return blogArticleMapper.getTotalCount();
    }
}
