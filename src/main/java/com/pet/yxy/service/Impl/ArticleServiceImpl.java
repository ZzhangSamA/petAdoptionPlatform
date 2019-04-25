package com.pet.yxy.service.Impl;

import com.pet.yxy.dto.ArticleDto;
import com.pet.yxy.mapper.BlogArticleMapper;
import com.pet.yxy.mapper.BlogLabelMapper;
import com.pet.yxy.pojo.BlogArticle;
import com.pet.yxy.pojo.BlogLabel;
import com.pet.yxy.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    BlogArticleMapper blogArticleMapper;
    @Autowired
    BlogLabelMapper blogLabelMapper;


    public List<ArticleDto> initArticlePage(BlogArticle blogArticle) {
        if(blogArticle.getArticleTitle() == null) {
            blogArticle.setArticleTitle("%%");
        }else {
            blogArticle.setArticleTitle("%" + blogArticle.getArticleTitle() + "%");
        }
        return blogArticleMapper.initArticlePage(blogArticle);
    }

    public int getTotalCount(BlogArticle blogArticle) {
        if(blogArticle.getArticleTitle() == null) {
            blogArticle.setArticleTitle("%%");
        }else {
            blogArticle.setArticleTitle("%" + blogArticle.getArticleTitle() + "%");
        }
        return blogArticleMapper.getTotalCount(blogArticle);
    }

    public List<BlogLabel> getLabelList() {
        return blogLabelMapper.getLabelList();
    }

    public List<BlogArticle> getNewArticle() {
        return blogArticleMapper.getNewArticle();
    }

    public ArticleDto getArticleDetail(BlogArticle blogArticle) {
        List<ArticleDto> articleDtos = blogArticleMapper.getArticleDetail(blogArticle);
        ArticleDto articleDto = articleDtos.get(0);
        for(int i = 1 ; i < articleDtos.size() ; i++) {
            articleDto.setLabel_name(articleDto.getLabel_name()+"，"+articleDtos.get(i).getLabel_name());
        }
        return articleDto;
    }
}
