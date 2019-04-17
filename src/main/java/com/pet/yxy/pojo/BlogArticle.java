package com.pet.yxy.pojo;

import java.util.Date;

public class BlogArticle {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.article_id
     *
     * @mbggenerated
     */
    private Integer articleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.user_id
     *
     * @mbggenerated
     */
    private Integer userId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.article_title
     *
     * @mbggenerated
     */
    private String articleTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.create_time
     *
     * @mbggenerated
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.update_time
     *
     * @mbggenerated
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.status
     *
     * @mbggenerated
     */
    private Boolean status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column blog_article.article_content
     *
     * @mbggenerated
     */
    private String articleContent;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.article_id
     *
     * @return the value of blog_article.article_id
     *
     * @mbggenerated
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.article_id
     *
     * @param articleId the value for blog_article.article_id
     *
     * @mbggenerated
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.user_id
     *
     * @return the value of blog_article.user_id
     *
     * @mbggenerated
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.user_id
     *
     * @param userId the value for blog_article.user_id
     *
     * @mbggenerated
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.article_title
     *
     * @return the value of blog_article.article_title
     *
     * @mbggenerated
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.article_title
     *
     * @param articleTitle the value for blog_article.article_title
     *
     * @mbggenerated
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.create_time
     *
     * @return the value of blog_article.create_time
     *
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.create_time
     *
     * @param createTime the value for blog_article.create_time
     *
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.update_time
     *
     * @return the value of blog_article.update_time
     *
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.update_time
     *
     * @param updateTime the value for blog_article.update_time
     *
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.status
     *
     * @return the value of blog_article.status
     *
     * @mbggenerated
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.status
     *
     * @param status the value for blog_article.status
     *
     * @mbggenerated
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column blog_article.article_content
     *
     * @return the value of blog_article.article_content
     *
     * @mbggenerated
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column blog_article.article_content
     *
     * @param articleContent the value for blog_article.article_content
     *
     * @mbggenerated
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}