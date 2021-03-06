package com.cl.sy.service;

import java.util.List;

import com.cl.sy.entity.Area;
import com.cl.sy.entity.bean.QueryCondition;
import com.cl.sy.web.view.DatatablesView;

/**
 * @描述：国家信息service接口
 * @作者：cl
 * @版本：V1.0
 * @创建时间：2019-03-20 下午3:43:16
 */
public interface IAreaService{
	
	/**
	 * 功能描述：获取所有国家信息
	 * @return
	 */
	public List<Area> getAllArea();
	
	/**
	 * 功能描述：根据条件获取国家信息
	 * @return
	 */
	public DatatablesView<Area> getAreaByCondition(QueryCondition query);
	
	/**
	 * 功能描述：根据ID获取国家信息
	 * @param AreaId
	 * @return
	 */
	public Area getAreaById(long areaId);
	
	/**
	 * 功能描述：添加国家信息
	 * @param Area
	 * @return
	 */
	public int addArea(Area area);
	
	/**
	 * 功能描述：修改国家信息
	 * @param Area
	 * @return
	 */
	public int editArea(Area area);
	
	/**
	 * @功能描述：删除国家信息
	 * @param areaId
	 * @return int
	 */
	public int removeArea(long areaId);
	
}
