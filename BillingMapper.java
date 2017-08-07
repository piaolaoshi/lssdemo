package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import entity.Billing;
import entity.Ser;

public interface BillingMapper {
	/**
	 * 查询账单
	 * @param bill
	 * @return
	 */
	public List<Billing> selectBilling(Billing bill);
	/**
	 * 分页
	 * @return
	 */
	public List<Billing> selectBillingPage(Billing bill);
	/**
	 * 查询某条账单
	 * @param bill
	 * @return
	 */
	public List<Billing>  selectOneBilling(Billing bill);
	/**
	 * 查询所有
	 * @return
	 */
	@Select("select * from abc")
	public List<Billing> selectAllBilling();
	/**
	 * 分页账单item
	 * @param ser
	 * @return
	 */
	public List<Ser> selectSerPage(Ser ser);
	/**
	 * 账单item
	 * @param ser
	 * @return
	 */
	public List<Ser> selectSer(Ser ser);
}
