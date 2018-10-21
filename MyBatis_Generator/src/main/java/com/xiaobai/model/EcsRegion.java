package com.xiaobai.model;

public class EcsRegion {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_region.region_id
     *
     * @mbg.generated
     */
    private String regionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_region.region_name
     *
     * @mbg.generated
     */
    private String regionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_region.city_id
     *
     * @mbg.generated
     */
    private String cityId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_region.region_id
     *
     * @return the value of ecs_region.region_id
     *
     * @mbg.generated
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_region.region_id
     *
     * @param regionId the value for ecs_region.region_id
     *
     * @mbg.generated
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId == null ? null : regionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_region.region_name
     *
     * @return the value of ecs_region.region_name
     *
     * @mbg.generated
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_region.region_name
     *
     * @param regionName the value for ecs_region.region_name
     *
     * @mbg.generated
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName == null ? null : regionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_region.city_id
     *
     * @return the value of ecs_region.city_id
     *
     * @mbg.generated
     */
    public String getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_region.city_id
     *
     * @param cityId the value for ecs_region.city_id
     *
     * @mbg.generated
     */
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }
}