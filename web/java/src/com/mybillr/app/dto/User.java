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

public class User implements Serializable
{
	/** 
	 * This attribute maps to the column id in the user table.
	 */
	protected int id;

	/** 
	 * This attribute represents whether the attribute id has been modified since being read from the database.
	 */
	protected boolean idModified = false;

	/** 
	 * This attribute maps to the column fname in the user table.
	 */
	protected String fname;

	/** 
	 * This attribute represents whether the attribute fname has been modified since being read from the database.
	 */
	protected boolean fnameModified = false;

	/** 
	 * This attribute maps to the column lname in the user table.
	 */
	protected String lname;

	/** 
	 * This attribute represents whether the attribute lname has been modified since being read from the database.
	 */
	protected boolean lnameModified = false;

	/** 
	 * This attribute maps to the column email in the user table.
	 */
	protected String email;

	/** 
	 * This attribute represents whether the attribute email has been modified since being read from the database.
	 */
	protected boolean emailModified = false;

	/** 
	 * This attribute maps to the column phone in the user table.
	 */
	protected int phone;

	/** 
	 * This attribute represents whether the primitive attribute phone is null.
	 */
	protected boolean phoneNull = true;

	/** 
	 * This attribute represents whether the attribute phone has been modified since being read from the database.
	 */
	protected boolean phoneModified = false;

	/** 
	 * This attribute maps to the column salt in the user table.
	 */
	protected String salt;

	/** 
	 * This attribute represents whether the attribute salt has been modified since being read from the database.
	 */
	protected boolean saltModified = false;

	/** 
	 * This attribute maps to the column password in the user table.
	 */
	protected String password;

	/** 
	 * This attribute represents whether the attribute password has been modified since being read from the database.
	 */
	protected boolean passwordModified = false;

	/** 
	 * This attribute maps to the column created_on in the user table.
	 */
	protected Date createdOn;

	/** 
	 * This attribute represents whether the attribute createdOn has been modified since being read from the database.
	 */
	protected boolean createdOnModified = false;

	/** 
	 * This attribute maps to the column updated_on in the user table.
	 */
	protected Date updatedOn;

	/** 
	 * This attribute represents whether the attribute updatedOn has been modified since being read from the database.
	 */
	protected boolean updatedOnModified = false;

	/** 
	 * This attribute maps to the column last_logged in the user table.
	 */
	protected Date lastLogged;

	/** 
	 * This attribute represents whether the attribute lastLogged has been modified since being read from the database.
	 */
	protected boolean lastLoggedModified = false;

	/**
	 * Method 'User'
	 * 
	 */
	public User()
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
	 * Method 'getFname'
	 * 
	 * @return String
	 */
	public String getFname()
	{
		return fname;
	}

	/**
	 * Method 'setFname'
	 * 
	 * @param fname
	 */
	public void setFname(String fname)
	{
		this.fname = fname;
		this.fnameModified = true;
	}

	/** 
	 * Sets the value of fnameModified
	 */
	public void setFnameModified(boolean fnameModified)
	{
		this.fnameModified = fnameModified;
	}

	/** 
	 * Gets the value of fnameModified
	 */
	public boolean isFnameModified()
	{
		return fnameModified;
	}

	/**
	 * Method 'getLname'
	 * 
	 * @return String
	 */
	public String getLname()
	{
		return lname;
	}

	/**
	 * Method 'setLname'
	 * 
	 * @param lname
	 */
	public void setLname(String lname)
	{
		this.lname = lname;
		this.lnameModified = true;
	}

	/** 
	 * Sets the value of lnameModified
	 */
	public void setLnameModified(boolean lnameModified)
	{
		this.lnameModified = lnameModified;
	}

	/** 
	 * Gets the value of lnameModified
	 */
	public boolean isLnameModified()
	{
		return lnameModified;
	}

	/**
	 * Method 'getEmail'
	 * 
	 * @return String
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * Method 'setEmail'
	 * 
	 * @param email
	 */
	public void setEmail(String email)
	{
		this.email = email;
		this.emailModified = true;
	}

	/** 
	 * Sets the value of emailModified
	 */
	public void setEmailModified(boolean emailModified)
	{
		this.emailModified = emailModified;
	}

	/** 
	 * Gets the value of emailModified
	 */
	public boolean isEmailModified()
	{
		return emailModified;
	}

	/**
	 * Method 'getPhone'
	 * 
	 * @return int
	 */
	public int getPhone()
	{
		return phone;
	}

	/**
	 * Method 'setPhone'
	 * 
	 * @param phone
	 */
	public void setPhone(int phone)
	{
		this.phone = phone;
		this.phoneNull = false;
		this.phoneModified = true;
	}

	/**
	 * Method 'setPhoneNull'
	 * 
	 * @param value
	 */
	public void setPhoneNull(boolean value)
	{
		this.phoneNull = value;
		this.phoneModified = true;
	}

	/**
	 * Method 'isPhoneNull'
	 * 
	 * @return boolean
	 */
	public boolean isPhoneNull()
	{
		return phoneNull;
	}

	/** 
	 * Sets the value of phoneModified
	 */
	public void setPhoneModified(boolean phoneModified)
	{
		this.phoneModified = phoneModified;
	}

	/** 
	 * Gets the value of phoneModified
	 */
	public boolean isPhoneModified()
	{
		return phoneModified;
	}

	/**
	 * Method 'getSalt'
	 * 
	 * @return String
	 */
	public String getSalt()
	{
		return salt;
	}

	/**
	 * Method 'setSalt'
	 * 
	 * @param salt
	 */
	public void setSalt(String salt)
	{
		this.salt = salt;
		this.saltModified = true;
	}

	/** 
	 * Sets the value of saltModified
	 */
	public void setSaltModified(boolean saltModified)
	{
		this.saltModified = saltModified;
	}

	/** 
	 * Gets the value of saltModified
	 */
	public boolean isSaltModified()
	{
		return saltModified;
	}

	/**
	 * Method 'getPassword'
	 * 
	 * @return String
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * Method 'setPassword'
	 * 
	 * @param password
	 */
	public void setPassword(String password)
	{
		this.password = password;
		this.passwordModified = true;
	}

	/** 
	 * Sets the value of passwordModified
	 */
	public void setPasswordModified(boolean passwordModified)
	{
		this.passwordModified = passwordModified;
	}

	/** 
	 * Gets the value of passwordModified
	 */
	public boolean isPasswordModified()
	{
		return passwordModified;
	}

	/**
	 * Method 'getCreatedOn'
	 * 
	 * @return Date
	 */
	public Date getCreatedOn()
	{
		return createdOn;
	}

	/**
	 * Method 'setCreatedOn'
	 * 
	 * @param createdOn
	 */
	public void setCreatedOn(Date createdOn)
	{
		this.createdOn = createdOn;
		this.createdOnModified = true;
	}

	/** 
	 * Sets the value of createdOnModified
	 */
	public void setCreatedOnModified(boolean createdOnModified)
	{
		this.createdOnModified = createdOnModified;
	}

	/** 
	 * Gets the value of createdOnModified
	 */
	public boolean isCreatedOnModified()
	{
		return createdOnModified;
	}

	/**
	 * Method 'getUpdatedOn'
	 * 
	 * @return Date
	 */
	public Date getUpdatedOn()
	{
		return updatedOn;
	}

	/**
	 * Method 'setUpdatedOn'
	 * 
	 * @param updatedOn
	 */
	public void setUpdatedOn(Date updatedOn)
	{
		this.updatedOn = updatedOn;
		this.updatedOnModified = true;
	}

	/** 
	 * Sets the value of updatedOnModified
	 */
	public void setUpdatedOnModified(boolean updatedOnModified)
	{
		this.updatedOnModified = updatedOnModified;
	}

	/** 
	 * Gets the value of updatedOnModified
	 */
	public boolean isUpdatedOnModified()
	{
		return updatedOnModified;
	}

	/**
	 * Method 'getLastLogged'
	 * 
	 * @return Date
	 */
	public Date getLastLogged()
	{
		return lastLogged;
	}

	/**
	 * Method 'setLastLogged'
	 * 
	 * @param lastLogged
	 */
	public void setLastLogged(Date lastLogged)
	{
		this.lastLogged = lastLogged;
		this.lastLoggedModified = true;
	}

	/** 
	 * Sets the value of lastLoggedModified
	 */
	public void setLastLoggedModified(boolean lastLoggedModified)
	{
		this.lastLoggedModified = lastLoggedModified;
	}

	/** 
	 * Gets the value of lastLoggedModified
	 */
	public boolean isLastLoggedModified()
	{
		return lastLoggedModified;
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
		
		if (!(_other instanceof User)) {
			return false;
		}
		
		final User _cast = (User) _other;
		if (id != _cast.id) {
			return false;
		}
		
		if (idModified != _cast.idModified) {
			return false;
		}
		
		if (fname == null ? _cast.fname != fname : !fname.equals( _cast.fname )) {
			return false;
		}
		
		if (fnameModified != _cast.fnameModified) {
			return false;
		}
		
		if (lname == null ? _cast.lname != lname : !lname.equals( _cast.lname )) {
			return false;
		}
		
		if (lnameModified != _cast.lnameModified) {
			return false;
		}
		
		if (email == null ? _cast.email != email : !email.equals( _cast.email )) {
			return false;
		}
		
		if (emailModified != _cast.emailModified) {
			return false;
		}
		
		if (phone != _cast.phone) {
			return false;
		}
		
		if (phoneNull != _cast.phoneNull) {
			return false;
		}
		
		if (phoneModified != _cast.phoneModified) {
			return false;
		}
		
		if (salt == null ? _cast.salt != salt : !salt.equals( _cast.salt )) {
			return false;
		}
		
		if (saltModified != _cast.saltModified) {
			return false;
		}
		
		if (password == null ? _cast.password != password : !password.equals( _cast.password )) {
			return false;
		}
		
		if (passwordModified != _cast.passwordModified) {
			return false;
		}
		
		if (createdOn == null ? _cast.createdOn != createdOn : !createdOn.equals( _cast.createdOn )) {
			return false;
		}
		
		if (createdOnModified != _cast.createdOnModified) {
			return false;
		}
		
		if (updatedOn == null ? _cast.updatedOn != updatedOn : !updatedOn.equals( _cast.updatedOn )) {
			return false;
		}
		
		if (updatedOnModified != _cast.updatedOnModified) {
			return false;
		}
		
		if (lastLogged == null ? _cast.lastLogged != lastLogged : !lastLogged.equals( _cast.lastLogged )) {
			return false;
		}
		
		if (lastLoggedModified != _cast.lastLoggedModified) {
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
		if (fname != null) {
			_hashCode = 29 * _hashCode + fname.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (fnameModified ? 1 : 0);
		if (lname != null) {
			_hashCode = 29 * _hashCode + lname.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (lnameModified ? 1 : 0);
		if (email != null) {
			_hashCode = 29 * _hashCode + email.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (emailModified ? 1 : 0);
		_hashCode = 29 * _hashCode + phone;
		_hashCode = 29 * _hashCode + (phoneNull ? 1 : 0);
		_hashCode = 29 * _hashCode + (phoneModified ? 1 : 0);
		if (salt != null) {
			_hashCode = 29 * _hashCode + salt.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (saltModified ? 1 : 0);
		if (password != null) {
			_hashCode = 29 * _hashCode + password.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (passwordModified ? 1 : 0);
		if (createdOn != null) {
			_hashCode = 29 * _hashCode + createdOn.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (createdOnModified ? 1 : 0);
		if (updatedOn != null) {
			_hashCode = 29 * _hashCode + updatedOn.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (updatedOnModified ? 1 : 0);
		if (lastLogged != null) {
			_hashCode = 29 * _hashCode + lastLogged.hashCode();
		}
		
		_hashCode = 29 * _hashCode + (lastLoggedModified ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return UserPk
	 */
	public UserPk createPk()
	{
		return new UserPk(id);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mybillr.app.dto.User: " );
		ret.append( "id=" + id );
		ret.append( ", fname=" + fname );
		ret.append( ", lname=" + lname );
		ret.append( ", email=" + email );
		ret.append( ", phone=" + phone );
		ret.append( ", salt=" + salt );
		ret.append( ", password=" + password );
		ret.append( ", createdOn=" + createdOn );
		ret.append( ", updatedOn=" + updatedOn );
		ret.append( ", lastLogged=" + lastLogged );
		return ret.toString();
	}

}
