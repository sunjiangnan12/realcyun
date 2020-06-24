package com.realc.partner.framework.response;

import javax.validation.constraints.Min;

public class Page{

	/**
	 * 每一页记录数
	 */
	@Min(value=0) 
	private Integer pageSize = 10;
	/**
	 * 当前第几页
	 */
	@Min(value=0) 
	private Integer pageIndex = 1;
	/**
	 * 最后一页下标/记录总页数
	 */
	private Integer lastPageIndex = 0;
	/**
	 * 记录开始下标
	 */
	private Long start = 1l;
	
	/**
	 * 记录开始下标
	 */
	private Long end = 0l;
	/**
	 * 总共记录数
	 */
	private Long total = 0l;

	
	/**
	 * 
	 * @return 当前分页index，从1开始
	 */
	public int getPageIndex() {
		return pageIndex;
	}

	/**
	 * 返回每页多少条记录
	 * 
	 * @return the recordPerPage
	 */
	public int getPageSize() {
		return pageSize;
	}

	/**
	 * 返回共有多少条记录
	 * 
	 * @return the total
	 */
	public long getTotal() {
		return total;
	}
	/**
	 * 返回最后一页的index
	 * 
	 * @return
	 */
	public int getLastPageIndex() {
		return lastPageIndex;
	}

	public long getStart() {
		return start;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public void setLastPageIndex(Integer lastPageIndex) {
		this.lastPageIndex = lastPageIndex;
	}

	public void setStart(Long start) {
		this.start = start;
	}
	
	public Long getEnd() {
		return end;
	}

	public void setEnd(Long end) {
		this.end = end;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public void config(long total) {
		if (total == 0L) {
			clear();
			return;
		}
		this.total = total;
		lastPageIndex = (int) (total % pageSize == 0 ? (total / pageSize)
				: (total / pageSize + 1));
		if (pageIndex > lastPageIndex) {
			pageIndex = lastPageIndex;
		}
		if (pageIndex < 1) {
			pageIndex = 1;
		}
		start = (long)pageSize * (pageIndex - 1);
		end = start + pageSize;
	}

	public void clear() {
		pageIndex = 1;
		lastPageIndex = 0;
		start = 0l;
		total = 0l;
	}

}
