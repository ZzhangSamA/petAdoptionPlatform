package com.pet.lxw.mapper;


import com.pet.lxw.pojo.ArticleSupport;

public interface ArticleSupportMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_support
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer supportId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_support
     *
     * @mbggenerated
     */
    int insert(ArticleSupport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_support
     *
     * @mbggenerated
     */
    int insertSelective(ArticleSupport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_support
     *
     * @mbggenerated
     */
    ArticleSupport selectByPrimaryKey(Integer supportId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_support
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ArticleSupport record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_support
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ArticleSupport record);
}