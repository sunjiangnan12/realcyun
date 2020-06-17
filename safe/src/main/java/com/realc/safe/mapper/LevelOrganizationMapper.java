package com.realc.safe.mapper;

import com.realc.safe.model.LevelOrganization;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LevelOrganizationMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table realc_level_organization
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer levelOrganizationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table realc_level_organization
     *
     * @mbg.generated
     */
    int insert(LevelOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table realc_level_organization
     *
     * @mbg.generated
     */
    int insertSelective(LevelOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table realc_level_organization
     *
     * @mbg.generated
     */
    LevelOrganization selectByPrimaryKey(Integer levelOrganizationId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table realc_level_organization
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(LevelOrganization record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table realc_level_organization
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(LevelOrganization record);
}