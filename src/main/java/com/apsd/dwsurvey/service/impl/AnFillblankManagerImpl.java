package com.apsd.dwsurvey.service.impl;

import com.apsd.dwsurvey.entity.AnFillblank;
import com.apsd.dwsurvey.entity.Question;
import com.apsd.dwsurvey.service.AnFillblankManager;
import com.apsd.dwsurvey.dao.AnFillblankDao;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apsd.common.service.BaseServiceImpl;

/**
 * 填空题
 * @author  Perye
 *
 *
 *
 */
@Service
public class AnFillblankManagerImpl extends BaseServiceImpl<AnFillblank, String> implements AnFillblankManager {

	@Autowired
	private AnFillblankDao anFillblankDao;
	
	@Override
	public void setBaseDao() {
		this.baseDao=anFillblankDao;
	}

	//根据exam_user信息查询答案
	public AnFillblank findAnswer(String belongAnswerId,String quId){
		//belongAnswerId quId
		Criterion criterion1=Restrictions.eq("belongAnswerId", belongAnswerId);
		Criterion criterion2=Restrictions.eq("quId", quId);
		return anFillblankDao.findUnique(criterion1,criterion2);
	}

	@Override
	public void findGroupStats(Question question) {
		anFillblankDao.findGroupStats(question);
	}
	
}
