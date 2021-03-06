package com.lawu.chick.repository.mapper;

import com.lawu.chick.repository.domain.EggDistributionRecordDO;
import com.lawu.chick.repository.domain.EggDistributionRecordDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface EggDistributionRecordDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    long countByExample(EggDistributionRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    int deleteByExample(EggDistributionRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    int insert(EggDistributionRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    int insertSelective(EggDistributionRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    List<EggDistributionRecordDO> selectByExampleWithRowbounds(EggDistributionRecordDOExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    List<EggDistributionRecordDO> selectByExample(EggDistributionRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    EggDistributionRecordDO selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") EggDistributionRecordDO record, @Param("example") EggDistributionRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") EggDistributionRecordDO record, @Param("example") EggDistributionRecordDOExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(EggDistributionRecordDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table egg_distribution_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(EggDistributionRecordDO record);
}