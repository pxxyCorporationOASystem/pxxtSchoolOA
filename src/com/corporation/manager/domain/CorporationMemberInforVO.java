package com.corporation.manager.domain;

import java.util.List;

public class CorporationMemberInforVO {
	private String queryStartTime; // 筛选开始时间
	private String queryEndTime; // 筛选结束时间
	private String queryName; // 查询名字
	private String querySort; // 查询排序方式 desc降序 asc升序
	private String currCorporation; // 当前社团
	private int totalPage; // 总页数
	private int pageSize; // 一页显示条数
	private int currPage; // 当前页数
	private int totalSize; // 数据总数
	private List<member_information> list; // 会员信息表
	private List<corporation_department> department; // 社团部门表
	private String currMemberRole; // 当前会员角色

	public List<corporation_department> getDepartment() {
		return department;
	}

	public void setDepartment(List<corporation_department> department) {
		this.department = department;
	}

	public String getCurrCorporation() {
		return currCorporation;
	}

	public void setCurrCorporation(String currCorporation) {
		this.currCorporation = currCorporation;
	}

	public String getQuerySort() {
		return querySort;
	}

	public String getCurrMemberRole() {
		return currMemberRole;
	}

	public void setCurrMemberRole(String currMemberRole) {
		this.currMemberRole = currMemberRole;
	}

	public void setQuerySort(String querySort) {
		this.querySort = querySort;
	}

	public String getQueryStartTime() {
		return queryStartTime;
	}

	public void setQueryStartTime(String queryStartTime) {
		this.queryStartTime = queryStartTime;
	}

	public String getQueryEndTime() {
		return queryEndTime;
	}

	public void setQueryEndTime(String queryEndTime) {
		this.queryEndTime = queryEndTime;
	}

	public String getQueryName() {
		return queryName;
	}

	public void setQueryName(String queryName) {
		this.queryName = queryName;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public int getTotalSize() {
		return totalSize;
	}

	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}

	public List<member_information> getList() {
		return list;
	}

	public void setList(List<member_information> list) {
		this.list = list;
	}

}
