package kr.niad.spring.dto;

public class PageSearch {

	public static final int DEFAULT_PAGE = 1;
	public static final int DEFAULT_LIMIT = 30;

	private int pageNo;
	private int limit;

	public PageSearch() {
		this(DEFAULT_PAGE, DEFAULT_LIMIT);
	}

	public PageSearch(int pageNo) {
		this(pageNo, DEFAULT_LIMIT);
	}

	public PageSearch(int pageNo, int limit) {
		this.pageNo = pageNo;
		this.limit = limit;
	}


	public int getStart() {
		return (pageNo - 1) * limit;
	}

	
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}

}
