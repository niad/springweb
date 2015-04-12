package kr.niad.spring.dto;

import java.util.ArrayList;
import java.util.List;

public class PageResult<T> {

	private PageSearch search;
	private List<T> results;

	public PageResult(PageSearch search) {
		this(search, new ArrayList<T>());
	}
	
	public PageResult(PageSearch search, List<T> results) {
		this.search = search;
		this.results = results;
	}
	
	
	public PageSearch getSearch() {
		return search;
	}
	public void setSearch(PageSearch search) {
		this.search = search;
	}
	public List<T> getResults() {
		return results;
	}
	public void setResults(List<T> results) {
		this.results = results;
	}
	
}
