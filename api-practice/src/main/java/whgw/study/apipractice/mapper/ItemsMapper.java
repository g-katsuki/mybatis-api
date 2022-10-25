package whgw.study.apipractice.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import whgw.study.apipractice.model.Items;
import whgw.study.apipractice.model.ItemsExample;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ItemsMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    long countByExample(ItemsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int deleteByExample(ItemsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insert(Items row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int insertSelective(Items row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    List<Items> selectByExample(ItemsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExampleSelective(@Param("row") Items row, @Param("example") ItemsExample example);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    int updateByExample(@Param("row") Items row, @Param("example") ItemsExample example);
}