package com.yong.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yong.springcloud.dao.ChapterDao;
import com.yong.springcloud.entities.Chapter;
import com.yong.springcloud.service.ChapterService;
@Service
public class ChapterServiceImpl implements ChapterService{
	
	@Autowired
	private ChapterDao chapterDao;

	@Override
	public List<Chapter> findChapterlist(Long bookid) {
		return chapterDao.findChapterlist(bookid);
	}

	@Override
	public Chapter findChapter(Long chapterid) {
		return chapterDao.findChapter(chapterid);
	}

	@Override
	public boolean addChapter(Chapter chapter) {
		return chapterDao.addChapter(chapter);
	}

	@Override
	public boolean upChapter(Chapter chapter) {
		return chapterDao.upChapter(chapter);
	}

	@Override
	public boolean delChapter(Long chapterid) {
		return chapterDao.delChapter(chapterid);
	}
	
	

}
