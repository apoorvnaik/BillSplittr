<?php
class ItemizedBillMySqlDAO implements ItemizedBillDAO{

	/**
	 * Get Domain object by primry key
	 *
	 * @param String $id primary key
	 * @return ItemizedBillMySql 
	 */
	public function load($id){
		$sql = 'SELECT * FROM itemized_bill WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($id);
		return $this->getRow($sqlQuery);
	}

	/**
	 * Get all records from table
	 */
	public function queryAll(){
		$sql = 'SELECT * FROM itemized_bill';
		$sqlQuery = new SqlQuery($sql);
		return $this->getList($sqlQuery);
	}
	
	/**
	 * Get all records from table ordered by field
	 *
	 * @param $orderColumn column name
	 */
	public function queryAllOrderBy($orderColumn){
		$sql = 'SELECT * FROM itemized_bill ORDER BY '.$orderColumn;
		$sqlQuery = new SqlQuery($sql);
		return $this->getList($sqlQuery);
	}
	
	/**
 	 * Delete record from table
 	 * @param itemizedBill primary key
 	 */
	public function delete($id){
		$sql = 'DELETE FROM itemized_bill WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($id);
		return $this->executeUpdate($sqlQuery);
	}
	
	/**
 	 * Insert record to table
 	 *
 	 * @param ItemizedBillMySql itemizedBill
 	 */
	public function insert($itemizedBill){
		$sql = 'INSERT INTO itemized_bill (paid_by, items) VALUES (?, ?)';
		$sqlQuery = new SqlQuery($sql);
		
		$sqlQuery->set($itemizedBill->paidBy);
		$sqlQuery->set($itemizedBill->items);

		$id = $this->executeInsert($sqlQuery);	
		$itemizedBill->id = $id;
		return $id;
	}
	
	/**
 	 * Update record in table
 	 *
 	 * @param ItemizedBillMySql itemizedBill
 	 */
	public function update($itemizedBill){
		$sql = 'UPDATE itemized_bill SET paid_by = ?, items = ? WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		
		$sqlQuery->set($itemizedBill->paidBy);
		$sqlQuery->set($itemizedBill->items);

		$sqlQuery->setNumber($itemizedBill->id);
		return $this->executeUpdate($sqlQuery);
	}

	/**
 	 * Delete all rows
 	 */
	public function clean(){
		$sql = 'DELETE FROM itemized_bill';
		$sqlQuery = new SqlQuery($sql);
		return $this->executeUpdate($sqlQuery);
	}

	public function queryByPaidBy($value){
		$sql = 'SELECT * FROM itemized_bill WHERE paid_by = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}

	public function queryByItems($value){
		$sql = 'SELECT * FROM itemized_bill WHERE items = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}


	public function deleteByPaidBy($value){
		$sql = 'DELETE FROM itemized_bill WHERE paid_by = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteByItems($value){
		$sql = 'DELETE FROM itemized_bill WHERE items = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}


	
	/**
	 * Read row
	 *
	 * @return ItemizedBillMySql 
	 */
	protected function readRow($row){
		$itemizedBill = new ItemizedBill();
		
		$itemizedBill->id = $row['id'];
		$itemizedBill->paidBy = $row['paid_by'];
		$itemizedBill->items = $row['items'];

		return $itemizedBill;
	}
	
	protected function getList($sqlQuery){
		$tab = QueryExecutor::execute($sqlQuery);
		$ret = array();
		for($i=0;$i<count($tab);$i++){
			$ret[$i] = $this->readRow($tab[$i]);
		}
		return $ret;
	}
	
	/**
	 * Get row
	 *
	 * @return ItemizedBillMySql 
	 */
	protected function getRow($sqlQuery){
		$tab = QueryExecutor::execute($sqlQuery);
		if(count($tab)==0){
			return null;
		}
		return $this->readRow($tab[0]);		
	}
	
	/**
	 * Execute sql query
	 */
	protected function execute($sqlQuery){
		return QueryExecutor::execute($sqlQuery);
	}
	
		
	/**
	 * Execute sql query
	 */
	protected function executeUpdate($sqlQuery){
		return QueryExecutor::executeUpdate($sqlQuery);
	}

	/**
	 * Query for one row and one column
	 */
	protected function querySingleResult($sqlQuery){
		return QueryExecutor::queryForString($sqlQuery);
	}

	/**
	 * Insert row to table
	 */
	protected function executeInsert($sqlQuery){
		return QueryExecutor::executeInsert($sqlQuery);
	}
}
?>