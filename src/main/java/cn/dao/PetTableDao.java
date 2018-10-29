package cn.dao;

import cn.pojo.PetTable;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PetTableDao {
	/**
	 * 显示全部
	 * @return
	 */
	List<PetTable> getAll();
	
	/**
	 * 添加信息
	 * @return
	 */
	int addAll(PetTable pt);
	
	/**
	 * 根据ID更改
	 * @param pt
	 * @return
	 */
	int updateAllByID(PetTable pt);
	
	/**
	 * 根据ID删除
	 * @param pid
	 * @return
	 */
	int delAllByID(int pid);
	
	/**
	 * 分页查询
	 * @param start
	 * @param end
	 * @return
	 */
	List<PetTable> LimitShowAll(@Param("start") int start, @Param("end") int end);
	/**
	 * 返回行数
	 * @return
	 */
	int countAll();

	/**
	 * 登录
	 * @param pname
	 * @param pid
	 * @return
	 */
	PetTable login(@Param("pname") String pname, @Param("pid") Integer pid);
	
}
