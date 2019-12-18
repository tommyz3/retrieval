package software.dzjz.retrieval.dal;

import software.dzjz.retrieval.model.DzjzmlModel;

public interface DzjzmlModelMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DZJZ_WD_ML
     *
     * @mbg.generated Thu Dec 12 11:28:23 CST 2019
     */
    int deleteByPrimaryKey(String mlid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DZJZ_WD_ML
     *
     * @mbg.generated Thu Dec 12 11:28:23 CST 2019
     */
    int insert(DzjzmlModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DZJZ_WD_ML
     *
     * @mbg.generated Thu Dec 12 11:28:23 CST 2019
     */
    int insertSelective(DzjzmlModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DZJZ_WD_ML
     *
     * @mbg.generated Thu Dec 12 11:28:23 CST 2019
     */
    DzjzmlModel selectByPrimaryKey(String mlid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DZJZ_WD_ML
     *
     * @mbg.generated Thu Dec 12 11:28:23 CST 2019
     */
    int updateByPrimaryKeySelective(DzjzmlModel record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DZJZ_WD_ML
     *
     * @mbg.generated Thu Dec 12 11:28:23 CST 2019
     */
    int updateByPrimaryKey(DzjzmlModel record);
}