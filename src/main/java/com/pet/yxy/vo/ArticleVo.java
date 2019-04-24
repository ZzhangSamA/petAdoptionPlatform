package com.pet.yxy.vo;

import com.pet.yxy.dto.ArticleDto;
import com.pet.yxy.pojo.Page;

import java.util.List;

public class ArticleVo {
    private List<ArticleDto> articleDtoList;
    private Page page;

    public List<ArticleDto> getArticleDtoList() {
        return articleDtoList;
    }

    public void setArticleDtoList(List<ArticleDto> articleDtoList) {
        this.articleDtoList = articleDtoList;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
