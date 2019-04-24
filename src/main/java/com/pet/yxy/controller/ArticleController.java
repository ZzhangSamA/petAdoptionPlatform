package com.pet.yxy.controller;

import com.pet.yxy.dto.ArticleDto;
import com.pet.yxy.pojo.BlogArticle;
import com.pet.yxy.service.ArticleService;
import com.pet.yxy.vo.ArticleVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @ResponseBody
    @RequestMapping(value = "initArticlePage",method = RequestMethod.POST)
    public Object initArticlePage(@RequestBody BlogArticle blogArticle) {
        if(blogArticle.getPage() != null) {
            blogArticle.getPage().setTotalCount(articleService.getTotalCount(blogArticle));
        }
        List<ArticleDto> articleDtoList = articleService.initArticlePage(blogArticle);
        ArticleVo articleVo = new ArticleVo();
        articleVo.setArticleDtoList(articleDtoList);
        articleVo.setPage(blogArticle.getPage());
        return articleVo;
    }

    @ResponseBody
    @RequestMapping(value = "getLabelList",method = RequestMethod.GET)
    public Object getLabelList() {
        return articleService.getLabelList();
    }

    @ResponseBody
    @RequestMapping(value = "getNewArticle",method = RequestMethod.GET)
    public Object getNewArticle() {
        return articleService.getNewArticle();
    }

    @ResponseBody
    @RequestMapping(value = "getArticleDetail",method = RequestMethod.POST)
    public Object getArticleDetail(@RequestBody BlogArticle blogArticle) {
        return articleService.getArticleDetail(blogArticle);
    }

}
