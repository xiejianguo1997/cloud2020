package come.xie.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.xie.entity.Payment;
@Mapper
public interface paymentDao {
	public int insert(Payment payment);
	public Payment selectByPrimaryKey(@Param("id")long id );
	public void updateByPrimaryKey(Payment payment);
	public void deleteByPrimaryKey(@Param("id")long id);

}
