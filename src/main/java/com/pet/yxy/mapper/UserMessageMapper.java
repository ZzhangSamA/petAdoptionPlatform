package com.pet.yxy.mapper;

import com.pet.yxy.pojo.UserMessage;

public interface UserMessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer messageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int insert(UserMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int insertSelective(UserMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    UserMessage selectByPrimaryKey(Integer messageId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(UserMessage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user_message
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(UserMessage record);
}