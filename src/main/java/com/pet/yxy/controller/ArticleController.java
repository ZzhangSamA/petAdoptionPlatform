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

    /**
     * 初始化文章列表显示页面
     * @param blogArticle
     * @return
     */
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

    /**
     * 获取所有分类标签初始化分类列表
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getLabelList",method = RequestMethod.GET)
    public Object getLabelList() {
        return articleService.getLabelList();
    }

    /**
     * 获取最新的 3个文章
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getNewArticle",method = RequestMethod.GET)
    public Object getNewArticle() {
        return articleService.getNewArticle();
    }

    /**
     * 根据articleId获取文章的内容，在博客详情页面显示出来
     * @param blogArticle——articleId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getArticleDetail",method = RequestMethod.POST)
    public Object getArticleDetail(@RequestBody BlogArticle blogArticle) {
        return articleService.getArticleDetail(blogArticle);
    }

}
