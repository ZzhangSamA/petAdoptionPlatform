package com.pet.yxy.mapper;

import com.pet.yxy.pojo.ArticleLabel;

public interface ArticleLabelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_label
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer alId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_label
     *
     * @mbggenerated
     */
    int insert(ArticleLabel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_label
     *
     * @mbggenerated
     */
    int insertSelective(ArticleLabel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_label
     *
     * @mbggenerated
     */
    ArticleLabel selectByPrimaryKey(Integer alId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_label
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ArticleLabel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article_label
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ArticleLabel record);
}