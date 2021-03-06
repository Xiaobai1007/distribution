package com.xiaobai.model;

public class EcsRoute {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_route.route_id
     *
     * @mbg.generated
     */
    private String routeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_route.route_name
     *
     * @mbg.generated
     */
    private String routeName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_route.start_province_id
     *
     * @mbg.generated
     */
    private String startProvinceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_route.start_city_id
     *
     * @mbg.generated
     */
    private String startCityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_route.midpoint_province_id
     *
     * @mbg.generated
     */
    private String midpointProvinceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_route.midpoint_city_id
     *
     * @mbg.generated
     */
    private String midpointCityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_route.end_province_id
     *
     * @mbg.generated
     */
    private String endProvinceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_route.end_city_id
     *
     * @mbg.generated
     */
    private String endCityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_route.transport_price
     *
     * @mbg.generated
     */
    private Long transportPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_route.remark
     *
     * @mbg.generated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_route.route_id
     *
     * @return the value of ecs_route.route_id
     *
     * @mbg.generated
     */
    public String getRouteId() {
        return routeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_route.route_id
     *
     * @param routeId the value for ecs_route.route_id
     *
     * @mbg.generated
     */
    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_route.route_name
     *
     * @return the value of ecs_route.route_name
     *
     * @mbg.generated
     */
    public String getRouteName() {
        return routeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_route.route_name
     *
     * @param routeName the value for ecs_route.route_name
     *
     * @mbg.generated
     */
    public void setRouteName(String routeName) {
        this.routeName = routeName == null ? null : routeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_route.start_province_id
     *
     * @return the value of ecs_route.start_province_id
     *
     * @mbg.generated
     */
    public String getStartProvinceId() {
        return startProvinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_route.start_province_id
     *
     * @param startProvinceId the value for ecs_route.start_province_id
     *
     * @mbg.generated
     */
    public void setStartProvinceId(String startProvinceId) {
        this.startProvinceId = startProvinceId == null ? null : startProvinceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_route.start_city_id
     *
     * @return the value of ecs_route.start_city_id
     *
     * @mbg.generated
     */
    public String getStartCityId() {
        return startCityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_route.start_city_id
     *
     * @param startCityId the value for ecs_route.start_city_id
     *
     * @mbg.generated
     */
    public void setStartCityId(String startCityId) {
        this.startCityId = startCityId == null ? null : startCityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_route.midpoint_province_id
     *
     * @return the value of ecs_route.midpoint_province_id
     *
     * @mbg.generated
     */
    public String getMidpointProvinceId() {
        return midpointProvinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_route.midpoint_province_id
     *
     * @param midpointProvinceId the value for ecs_route.midpoint_province_id
     *
     * @mbg.generated
     */
    public void setMidpointProvinceId(String midpointProvinceId) {
        this.midpointProvinceId = midpointProvinceId == null ? null : midpointProvinceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_route.midpoint_city_id
     *
     * @return the value of ecs_route.midpoint_city_id
     *
     * @mbg.generated
     */
    public String getMidpointCityId() {
        return midpointCityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_route.midpoint_city_id
     *
     * @param midpointCityId the value for ecs_route.midpoint_city_id
     *
     * @mbg.generated
     */
    public void setMidpointCityId(String midpointCityId) {
        this.midpointCityId = midpointCityId == null ? null : midpointCityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_route.end_province_id
     *
     * @return the value of ecs_route.end_province_id
     *
     * @mbg.generated
     */
    public String getEndProvinceId() {
        return endProvinceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_route.end_province_id
     *
     * @param endProvinceId the value for ecs_route.end_province_id
     *
     * @mbg.generated
     */
    public void setEndProvinceId(String endProvinceId) {
        this.endProvinceId = endProvinceId == null ? null : endProvinceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_route.end_city_id
     *
     * @return the value of ecs_route.end_city_id
     *
     * @mbg.generated
     */
    public String getEndCityId() {
        return endCityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_route.end_city_id
     *
     * @param endCityId the value for ecs_route.end_city_id
     *
     * @mbg.generated
     */
    public void setEndCityId(String endCityId) {
        this.endCityId = endCityId == null ? null : endCityId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_route.transport_price
     *
     * @return the value of ecs_route.transport_price
     *
     * @mbg.generated
     */
    public Long getTransportPrice() {
        return transportPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_route.transport_price
     *
     * @param transportPrice the value for ecs_route.transport_price
     *
     * @mbg.generated
     */
    public void setTransportPrice(Long transportPrice) {
        this.transportPrice = transportPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_route.remark
     *
     * @return the value of ecs_route.remark
     *
     * @mbg.generated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_route.remark
     *
     * @param remark the value for ecs_route.remark
     *
     * @mbg.generated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}