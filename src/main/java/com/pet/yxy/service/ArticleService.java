package com.pet.yxy.service;

import com.pet.yxy.dto.ArticleDto;
import com.pet.yxy.pojo.BlogArticle;
import com.pet.yxy.pojo.BlogLabel;

import java.util.List;

public interface ArticleService {

    public List<ArticleDto> initArticlePage(BlogArticle blogArticle);

    public int getTotalCount(BlogArticle blogArticle);

    public List<BlogLabel> getLabelList();

    public List<BlogArticle> getNewArticle();

    public ArticleDto getArticleDetail(BlogArticle blogArticle);
}
