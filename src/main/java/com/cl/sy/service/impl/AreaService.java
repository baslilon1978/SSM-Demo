package com.cl.sy.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cl.core.beans.WherePrams;
import com.cl.core.sql.where.C;
import com.cl.sy.common.DateUtil;
import com.cl.sy.dao.AreaDao;
import com.cl.sy.entity.Area;
import com.cl.sy.entity.bean.QueryCondition;
import com.cl.sy.service.IAreaService;
import com.cl.sy.web.view.DatatablesView;

/**
 * @描述：国家信息service
 * @作者：cl
 * @版本：V1.0
 * @创建时间：2019-03-20 下午3:42:45
 */
@Service("areaService")
public class AreaService implements IAreaService{
	
	@Resource
	private AreaDao areaDao;
	
	public DatatablesView<Area> getAreaByCondition(QueryCondition query) {
		DatatablesView<Area> dataView = new DatatablesView<Area>();
		
		//构建查询条件
		WherePrams where = areaDao.structureConditon(query);
		
		Long count = areaDao.count(where);
		List<Area> list = areaDao.list(where);
		
		dataView.setRecordsTotal(count.intValue());
		dataView.setData(list);
		
		return dataView;
	}
	
	public List<Area> getAllArea(){
		return areaDao.list();
	}
	
	public Area getAreaById(long areaId){
		return areaDao.get(areaId);
	}
	
	public int addArea(Area area){
		return areaDao.addLocal(area);
	}
	
	public int editArea(Area area){
		area.setUpdateTime(DateUtil.getNowTime());
		WherePrams where = new WherePrams();
		where.and("areaId", C.EQ, area.getAreaId());
		return areaDao.updateLocal(area,where);
	}
	
	public int removeArea(long areaId){
		return areaDao.del(areaId);
	}

}
