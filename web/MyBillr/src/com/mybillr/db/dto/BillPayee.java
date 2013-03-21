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

public class BillPayee implements Serializable
{
	/** 
	 * This attribute maps to the column bill_id in the bill_payee table.
	 */
	protected int billId;

	/** 
	 * This attribute maps to the column user_id in the bill_payee table.
	 */
	protected int userId;

	/** 
	 * This attribute maps to the column share in the bill_payee table.
	 */
	protected long share;

	/** 
	 * This attribute maps to the column amount in the bill_payee table.
	 */
	protected long amount;

	/**
	 * Method 'BillPayee'
	 * 
	 */
	public BillPayee()
	{
	}

	/**
	 * Method 'getBillId'
	 * 
	 * @return int
	 */
	public int getBillId()
	{
		return billId;
	}

	/**
	 * Method 'setBillId'
	 * 
	 * @param billId
	 */
	public void setBillId(int billId)
	{
		this.billId = billId;
	}

	/**
	 * Method 'getUserId'
	 * 
	 * @return int
	 */
	public int getUserId()
	{
		return userId;
	}

	/**
	 * Method 'setUserId'
	 * 
	 * @param userId
	 */
	public void setUserId(int userId)
	{
		this.userId = userId;
	}

	/**
	 * Method 'getShare'
	 * 
	 * @return long
	 */
	public long getShare()
	{
		return share;
	}

	/**
	 * Method 'setShare'
	 * 
	 * @param share
	 */
	public void setShare(long share)
	{
		this.share = share;
	}

	/**
	 * Method 'getAmount'
	 * 
	 * @return long
	 */
	public long getAmount()
	{
		return amount;
	}

	/**
	 * Method 'setAmount'
	 * 
	 * @param amount
	 */
	public void setAmount(long amount)
	{
		this.amount = amount;
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
		
		if (!(_other instanceof BillPayee)) {
			return false;
		}
		
		final BillPayee _cast = (BillPayee) _other;
		if (billId != _cast.billId) {
			return false;
		}
		
		if (userId != _cast.userId) {
			return false;
		}
		
		if (share != _cast.share) {
			return false;
		}
		
		if (amount != _cast.amount) {
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
		_hashCode = 29 * _hashCode + billId;
		_hashCode = 29 * _hashCode + userId;
		_hashCode = 29 * _hashCode + (int) (share ^ (share >>> 32));
		_hashCode = 29 * _hashCode + (int) (amount ^ (amount >>> 32));
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return BillPayeePk
	 */
	public BillPayeePk createPk()
	{
		return new BillPayeePk(billId, userId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.mybillr.db.dto.BillPayee: " );
		ret.append( "billId=" + billId );
		ret.append( ", userId=" + userId );
		ret.append( ", share=" + share );
		ret.append( ", amount=" + amount );
		return ret.toString();
	}

}
