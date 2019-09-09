package com.imooc.mapper;

import java.util.List;

import com.imooc.pojo.SearchRecords;
import com.imooc.utils.MyMapper;

public interface SearchRecordsMapper extends MyMapper<SearchRecords> {
	
	List<String> getHotWords();
}