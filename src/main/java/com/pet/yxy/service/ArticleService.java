package com.pet.yxy.service;

import com.pet.yxy.dto.ArticleDto;
import com.pet.yxy.pojo.BlogArticle;

import java.util.List;

public interface ArticleService {

    public List<ArticleDto> initArticlePage(BlogArticle blogArticle);

    public int getTotalCount();

}
