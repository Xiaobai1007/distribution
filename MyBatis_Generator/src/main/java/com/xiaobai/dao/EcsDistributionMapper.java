package com.xiaobai.dao;

import com.xiaobai.model.EcsDistribution;
import java.util.List;

public interface EcsDistributionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_distribution
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer distributionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_distribution
     *
     * @mbg.generated
     */
    int insert(EcsDistribution record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_distribution
     *
     * @mbg.generated
     */
    EcsDistribution selectByPrimaryKey(Integer distributionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_distribution
     *
     * @mbg.generated
     */
    List<EcsDistribution> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_distribution
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsDistribution record);
}