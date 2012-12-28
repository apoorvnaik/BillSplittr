<?php
class SharedBillMySqlDAO implements SharedBillDAO{

	/**
	 * Get Domain object by primry key
	 *
	 * @param String $id primary key
	 * @return SharedBillMySql 
	 */
	public function load($id){
		$sql = 'SELECT * FROM shared_bill WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($id);
		return $this->getRow($sqlQuery);
	}

	/**
	 * Get all records from table
	 */
	public function queryAll(){
		$sql = 'SELECT * FROM shared_bill';
		$sqlQuery = new SqlQuery($sql);
		return $this->getList($sqlQuery);
	}
	
	/**
	 * Get all records from table ordered by field
	 *
	 * @param $orderColumn column name
	 */
	public function queryAllOrderBy($orderColumn){
		$sql = 'SELECT * FROM shared_bill ORDER BY '.$orderColumn;
		$sqlQuery = new SqlQuery($sql);
		return $this->getList($sqlQuery);
	}
	
	/**
 	 * Delete record from table
 	 * @param sharedBill primary key
 	 */
	public function delete($id){
		$sql = 'DELETE FROM shared_bill WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($id);
		return $this->executeUpdate($sqlQuery);
	}
	
	/**
 	 * Insert record to table
 	 *
 	 * @param SharedBillMySql sharedBill
 	 */
	public function insert($sharedBill){
		$sql = 'INSERT INTO shared_bill (title, participants, paid_by, items) VALUES (?, ?, ?, ?)';
		$sqlQuery = new SqlQuery($sql);
		
		$sqlQuery->set($sharedBill->title);
		$sqlQuery->set($sharedBill->participants);
		$sqlQuery->set($sharedBill->paidBy);
		$sqlQuery->set($sharedBill->items);

		$id = $this->executeInsert($sqlQuery);	
		$sharedBill->id = $id;
		return $id;
	}
	
	/**
 	 * Update record in table
 	 *
 	 * @param SharedBillMySql sharedBill
 	 */
	public function update($sharedBill){
		$sql = 'UPDATE shared_bill SET title = ?, participants = ?, paid_by = ?, items = ? WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		
		$sqlQuery->set($sharedBill->title);
		$sqlQuery->set($sharedBill->participants);
		$sqlQuery->set($sharedBill->paidBy);
		$sqlQuery->set($sharedBill->items);

		$sqlQuery->setNumber($sharedBill->id);
		return $this->executeUpdate($sqlQuery);
	}

	/**
 	 * Delete all rows
 	 */
	public function clean(){
		$sql = 'DELETE FROM shared_bill';
		$sqlQuery = new SqlQuery($sql);
		return $this->executeUpdate($sqlQuery);
	}

	public function queryByTitle($value){
		$sql = 'SELECT * FROM shared_bill WHERE title = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}

	public function queryByParticipants($value){
		$sql = 'SELECT * FROM shared_bill WHERE participants = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}

	public function queryByPaidBy($value){
		$sql = 'SELECT * FROM shared_bill WHERE paid_by = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}

	public function queryByItems($value){
		$sql = 'SELECT * FROM shared_bill WHERE items = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}


	public function deleteByTitle($value){
		$sql = 'DELETE FROM shared_bill WHERE title = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteByParticipants($value){
		$sql = 'DELETE FROM shared_bill WHERE participants = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteByPaidBy($value){
		$sql = 'DELETE FROM shared_bill WHERE paid_by = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteByItems($value){
		$sql = 'DELETE FROM shared_bill WHERE items = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}


	
	/**
	 * Read row
	 *
	 * @return SharedBillMySql 
	 */
	protected function readRow($row){
		$sharedBill = new SharedBill();
		
		$sharedBill->id = $row['id'];
		$sharedBill->title = $row['title'];
		$sharedBill->participants = $row['participants'];
		$sharedBill->paidBy = $row['paid_by'];
		$sharedBill->items = $row['items'];

		return $sharedBill;
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
	 * @return SharedBillMySql 
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