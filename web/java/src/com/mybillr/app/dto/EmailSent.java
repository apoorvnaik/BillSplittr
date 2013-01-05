/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.mybillr.app.dto;

import com.mybillr.app.dao.*;
import com.mybillr.app.factory.*;
import com.mybillr.app.exceptions.*;
import java.io.Serializable;
import java.util.*;
import java.util.Date;

public class EmailSent implements Serializable
{
	/** 
	 * This attribute maps to the column id in the email_sent table.
	 */
	protected int id;

	/** 
	 * This attribute represents whether the attribute id has been modified since being read from the database.
	 */
	protected boolean idModified = false;

	/** 
	 * This attribute maps to the column from in the email_sent table.
	 */
	protected String from;

	/** 
	 * This attribute represents whether the attribute from has been modified since being read from the database.
	 */
	protected boolean fromModified = false;

	/** 
	 * This attribute maps to the column to in the email_sent table.
	 */
	protected String to;

	/** 
	 * This attribute represents whether the attribute to has been modified since being read from the database.
	 */
	protected boolean toModified = false;

	/** 
	 * This attribute maps to the column subject in the email_sent table.
	 */
	protected String subject;

	/** 
	 * This attribute represents whether the attribute subject has been modified since being read from the database.
	 */
	protected boolean subjectModified = false;

	/** 
	 * This attribute maps to the column message in the email_sent table.
	 */
	protected String message;

	/** 
	 * This attribute represents whether the attribute message has been modified since being read from the database.
	 */
	protected boolean messageModified = false;

	/** 
	 * This attribute maps to the column sent_on in the email_sent table.
	 */
	protected Date sentOn;

	/** 
	 * This attribute represents whether the attribute sentOn has been modified since being read from the database.
	 */
	protected boolean sentOnModified = false;

	/**
	 * Method 'EmailSent'
	 * 
	 */
	public EmailSent()
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
		this.idModified = true;
	}

	/** 
	 * Sets the value of idModified
	 */
	public void setIdModified(boolean idModified)
	{
		this.idModified = idModified;
	}

	/** 
	 * Gets the value of idModified
	 */
	public boolean isIdModified()
	{
		return idModified;
	}

	/**
	 * Method 'getFrom'
	 * 
	 * @return String
	 */
	public String getFrom()
	{
		return from;
	}

	/**
	 * Method 'setFrom'
	 * 
	 * @param from
	 */
	public void setFrom(String from)
	{
		this.from = from;
		this.fromModified = true;
	}

	/** 
	 * Sets the value of fromModified
	 */
	public void setFromModified(boolean fromModified)
	{
		this.fromModified = fromModified;
	}

	/** 
	 * Gets the value of fromModified
	 */
	public boolean isFromModified()
	{
		return fromModified;
	}

	/**
	 * Method 'getTo'
	 * 
	 * @return String
	 */
	public String getTo()
	{
		return to;
	}

	/**
	 * Method 'setTo'
	 * 
	 * @param to
	 */
	public void setTo(String to)
	{
		this.to = to;
		this.toModified = true;
	}

	/** 
	 * Sets the value of toModified
	 */
	public void setToModified(boolean toModified)
	{
		this.toModified = toModified;
	}

	/** 
	 * Gets the value of toModified
	 */
	public boolean isToModified()
	{
		return toModified;
	}

	/**
	 * Method 'getSubject'
	 * 
	 * @return String
	 */
	public String getSubject()
	{
		return subject;
	}

	/**
	 * Method 'setSubject'
	 * 
	 * @param subject
	 */
	public void setSubject(String subject)
	{
		this.subject = subject;
		this.subjectModified = true;
	}

	/** 
	 * Sets the value of subjectModified
	 */
	public void setSubjectModified(boolean subjectModified)
	{
		this.subjectModified = subjectModified;
	}

	/** 
	 * Gets the value of subjectModified
	 */
	public boolean isSubjectModified()
	{
		return subjectModified;
	}

	/**
	 * Method 'getMessage'
	 * 
	 * @return String
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * Method 'setMessage'
	 * 
	 * @param message
	 */
	public void setMessage(String message)
	{
		this.message = message;
		this.messageModified = true;
	}

	/** 
	 * Sets the value of messageModified
	 */
	public void setMessageModified(boolean messageModified)
	{
		this.messageModified = messageModified;
	}

	/** 
	 * Gets the value of messageModified
	 */
	public boolean isMessageModified()
	{
		return messageModified;
	}

	/**
	 * Method 'getSentOn'
	 * 
	 * @return Date
	 */
	public Date getSentOn()
	{
		return sentOn;
	}

	/**
	 * Method 'setSentOn'
	 * 
	 * @param sentOn
	 */
	public void setSentOn(Date sentOn)
	{
		this.sentOn = sentOn;
		this.sentOnModified = true;
	}

	/** 
	 * Sets the value of sentOnModified
	 */
	public void setSentOnModified(boolean sentOnModified)
	{
		this.sentOnModified = sentOnModified;
	}

	/** 
	 * Gets the value of sentOnModified
	 */
	public boolean isSentOnModified()
	{
		return sentOnModified;
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
		
		if (!(_other instanceof EmailSent)) {
			return false;
		}
		
		final EmailSent _cast = (EmailSent) _other;
		if (id != _cast.id) {
			return false;
		}
		
		if (idModified != _cast.idModified) {
			return false;
		}
		
		if (from == null ? _cast.from != from : !from.equals( _cast.from )) {
			return false;
		}
		
		if (fromModified != _cast.fromModified) {
			return false;
		}
		
		if (to == null ? _cast.to != to : !to.equals( _cast.to )) {
			return false;
		}
		
		if (toModified != _cast.toModified) {
			return false;
		}
		
		if (subject == null ? _cast.subject != subject : !subject.equals( _cast.subject )) {
			return false;
		}
		
		if (subjectModified != _cast.subjectModified) {
			return false;
		}
		
		if (message == null ? _cast.message != message : !message.equals( _cast.message )) {
			return false;
		}
		
		if (messageModified != _cast.messageModified) {
			return false;
		}
		
		if (sentOn == null ? _cast.sentOn != sentOn : !sentOn.equals( _cast.sentOn )) {
			return false;
		}
		
		if (sentOnModified != _cast.sentOnModified) {
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
		_hashCode = 29 * _hashCode + (idModified ? 1 : 0);
		if (from != null) {
			_hashCode = 29 * _hashCode + from.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fromModified ? 1 : 0);
		if (to != null) {
			_hashCode = 29 * _hashCode + to.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (toModified ? 1 : 0);
		if (subject != null) {
			_hashCode = 29 * _hashCode + subject.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (subjectModified ? 1 : 0);
		if (message != null) {
			_hashCode = 29 * _hashCode + message.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (messageModified ? 1 : 0);
		if (sentOn != null) {
			_hashCode = 29 * _hashCode + sentOn.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (sentOnModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmailSentPk
	 */
	public EmailSentPk createPk()
	{
		return new EmailSentPk(id);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mybillr.app.dto.EmailSent: " );
		ret.append( "id=" + id );
		ret.append( ", from=" + from );
		ret.append( ", to=" + to );
		ret.append( ", subject=" + subject );
		ret.append( ", message=" + message );
		ret.append( ", sentOn=" + sentOn );
		return ret.toString();
	}

}