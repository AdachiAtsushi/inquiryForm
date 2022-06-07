package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.SurveyDao;
import com.example.demo.entity.Survey;

@Service
public class SurveyServiceImpl implements SurveyService {
	
	private final SurveyDao surveyDao;
	
	@Autowired
	public SurveyServiceImpl(SurveyDao surveyDao) {
		this.surveyDao = surveyDao;
	}
	
	@Override
	public void save(Survey survey) {
		this.surveyDao.insertSurvey(survey);
	}

	@Override
	public List<Survey> getAll() {
		return this.surveyDao.getAll();
	}

}
