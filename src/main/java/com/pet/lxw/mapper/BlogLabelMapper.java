package com.pet.lxw.mapper;


import com.pet.lxw.pojo.BlogLabel;

public interface BlogLabelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_label
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer labelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_label
     *
     * @mbggenerated
     */
    int insert(BlogLabel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_label
     *
     * @mbggenerated
     */
    int insertSelective(BlogLabel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_label
     *
     * @mbggenerated
     */
    BlogLabel selectByPrimaryKey(Integer labelId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_label
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(BlogLabel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table blog_label
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(BlogLabel record);
}