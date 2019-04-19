package com.yong.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yong.springcloud.entities.Chapter;
@Mapper
public interface ChapterDao {
	
	public List<Chapter>findChapterlist(Long bookid);

	public Chapter findChapter(Long chapterid);
	
	public boolean addChapter(Chapter chapter);
	
	public boolean upChapter(Chapter chapter);
	
	public boolean delChapter(Long chapterid); 
}
