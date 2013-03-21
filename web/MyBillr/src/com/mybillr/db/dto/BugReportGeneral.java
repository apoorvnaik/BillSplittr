/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.db.dto;

import com.mybillr.db.dao.*;
import com.mybillr.db.factory.*;
import com.mybillr.db.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class BugReportGeneral implements Serializable
{
	/** 
	 * This attribute maps to the column id in the bug_report_general table.
	 */
	protected int id;

	/** 
	 * This attribute maps to the column reported_by in the bug_report_general table.
	 */
	protected String reportedBy;

	/** 
	 * This attribute maps to the column title in the bug_report_general table.
	 */
	protected String title;

	/** 
	 * This attribute maps to the column bug in the bug_report_general table.
	 */
	protected String bug;

	/**
	 * Method 'BugReportGeneral'
	 * 
	 */
	public BugReportGeneral()
	{
	}

	/**
	 * Method 'getId'
	 * 
	 * @return int
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Method 'setId'
	 * 
	 * @param id
	 */
	public void setId(int id)
	{
		this.id = id;
	}

	/**
	 * Method 'getReportedBy'
	 * 
	 * @return String
	 */
	public String getReportedBy()
	{
		return reportedBy;
	}

	/**
	 * Method 'setReportedBy'
	 * 
	 * @param reportedBy
	 */
	public void setReportedBy(String reportedBy)
	{
		this.reportedBy = reportedBy;
	}

	/**
	 * Method 'getTitle'
	 * 
	 * @return String
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * Method 'setTitle'
	 * 
	 * @param title
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * Method 'getBug'
	 * 
	 * @return String
	 */
	public String getBug()
	{
		return bug;
	}

	/**
	 * Method 'setBug'
	 * 
	 * @param bug
	 */
	public void setBug(String bug)
	{
		this.bug = bug;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof BugReportGeneral)) {
			return false;
		}
		
		final BugReportGeneral _cast = (BugReportGeneral) _other;
		if (id != _cast.id) {
			return false;
		}
		
		if (reportedBy == null ? _cast.reportedBy != reportedBy : !reportedBy.equals( _cast.reportedBy )) {
			return false;
		}
		
		if (title == null ? _cast.title != title : !title.equals( _cast.title )) {
			return false;
		}
		
		if (bug == null ? _cast.bug != bug : !bug.equals( _cast.bug )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + id;
		if (reportedBy != null) {
			_hashCode = 29 * _hashCode + reportedBy.hashCode();
		}
		
		if (title != null) {
			_hashCode = 29 * _hashCode + title.hashCode();
		}
		
		if (bug != null) {
			_hashCode = 29 * _hashCode + bug.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return BugReportGeneralPk
	 */
	public BugReportGeneralPk createPk()
	{
		return new BugReportGeneralPk(id);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mybillr.db.dto.BugReportGeneral: " );
		ret.append( "id=" + id );
		ret.append( ", reportedBy=" + reportedBy );
		ret.append( ", title=" + title );
		ret.append( ", bug=" + bug );
		return ret.toString();
	}

}