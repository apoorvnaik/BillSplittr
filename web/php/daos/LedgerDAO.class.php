<?php
class LedgerMySqlDAO implements LedgerDAO{

	/**
	 * Get Domain object by primry key
	 *
	 * @param String $id primary key
	 * @return LedgerMySql 
	 */
	public function load($id){
		$sql = 'SELECT * FROM ledger WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($id);
		return $this->getRow($sqlQuery);
	}

	/**
	 * Get all records from table
	 */
	public function queryAll(){
		$sql = 'SELECT * FROM ledger';
		$sqlQuery = new SqlQuery($sql);
		return $this->getList($sqlQuery);
	}
	
	/**
	 * Get all records from table ordered by field
	 *
	 * @param $orderColumn column name
	 */
	public function queryAllOrderBy($orderColumn){
		$sql = 'SELECT * FROM ledger ORDER BY '.$orderColumn;
		$sqlQuery = new SqlQuery($sql);
		return $this->getList($sqlQuery);
	}
	
	/**
 	 * Delete record from table
 	 * @param ledger primary key
 	 */
	public function delete($id){
		$sql = 'DELETE FROM ledger WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($id);
		return $this->executeUpdate($sqlQuery);
	}
	
	/**
 	 * Insert record to table
 	 *
 	 * @param LedgerMySql ledger
 	 */
	public function insert($ledger){
		$sql = 'INSERT INTO ledger (owed_by, owes_to, amount) VALUES (?, ?, ?)';
		$sqlQuery = new SqlQuery($sql);
		
		$sqlQuery->setNumber($ledger->owedBy);
		$sqlQuery->setNumber($ledger->owesTo);
		$sqlQuery->setNumber($ledger->amount);

		$id = $this->executeInsert($sqlQuery);	
		$ledger->id = $id;
		return $id;
	}
	
	/**
 	 * Update record in table
 	 *
 	 * @param LedgerMySql ledger
 	 */
	public function update($ledger){
		$sql = 'UPDATE ledger SET owed_by = ?, owes_to = ?, amount = ? WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		
		$sqlQuery->setNumber($ledger->owedBy);
		$sqlQuery->setNumber($ledger->owesTo);
		$sqlQuery->setNumber($ledger->amount);

		$sqlQuery->setNumber($ledger->id);
		return $this->executeUpdate($sqlQuery);
	}

	/**
 	 * Delete all rows
 	 */
	public function clean(){
		$sql = 'DELETE FROM ledger';
		$sqlQuery = new SqlQuery($sql);
		return $this->executeUpdate($sqlQuery);
	}

	public function queryByOwedBy($value){
		$sql = 'SELECT * FROM ledger WHERE owed_by = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($value);
		return $this->getList($sqlQuery);
	}

	public function queryByOwesTo($value){
		$sql = 'SELECT * FROM ledger WHERE owes_to = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($value);
		return $this->getList($sqlQuery);
	}

	public function queryByAmount($value){
		$sql = 'SELECT * FROM ledger WHERE amount = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($value);
		return $this->getList($sqlQuery);
	}


	public function deleteByOwedBy($value){
		$sql = 'DELETE FROM ledger WHERE owed_by = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteByOwesTo($value){
		$sql = 'DELETE FROM ledger WHERE owes_to = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteByAmount($value){
		$sql = 'DELETE FROM ledger WHERE amount = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($value);
		return $this->executeUpdate($sqlQuery);
	}


	
	/**
	 * Read row
	 *
	 * @return LedgerMySql 
	 */
	protected function readRow($row){
		$ledger = new Ledger();
		
		$ledger->id = $row['id'];
		$ledger->owedBy = $row['owed_by'];
		$ledger->owesTo = $row['owes_to'];
		$ledger->amount = $row['amount'];

		return $ledger;
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
	 * @return LedgerMySql 
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