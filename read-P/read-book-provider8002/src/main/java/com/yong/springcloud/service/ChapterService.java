package com.yong.springcloud.service;

import java.util.List;

import com.yong.springcloud.entities.Chapter;

public interface ChapterService {
	
	public List<Chapter>findChapterlist(Long bookid);

	public Chapter findChapter(Long chapterid);
	
	public boolean addChapter(Chapter chapter);
	
	public boolean upChapter(Chapter chapter);
	
	public boolean delChapter(Long chapterid); 

}
