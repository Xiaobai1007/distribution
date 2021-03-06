package com.xiaobai.dao;

import com.xiaobai.model.EcsHandover;
import java.util.List;

public interface EcsHandoverMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_handover
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String startCity);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_handover
     *
     * @mbg.generated
     */
    int insert(EcsHandover record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_handover
     *
     * @mbg.generated
     */
    EcsHandover selectByPrimaryKey(String startCity);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_handover
     *
     * @mbg.generated
     */
    List<EcsHandover> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ecs_handover
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EcsHandover record);
}