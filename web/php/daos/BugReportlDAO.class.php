<?php
class BugReportMySqlDAO implements BugReportDAO{

	/**
	 * Get Domain object by primry key
	 *
	 * @param String $id primary key
	 * @return BugReportMySql 
	 */
	public function load($id){
		$sql = 'SELECT * FROM bug_report WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($id);
		return $this->getRow($sqlQuery);
	}

	/**
	 * Get all records from table
	 */
	public function queryAll(){
		$sql = 'SELECT * FROM bug_report';
		$sqlQuery = new SqlQuery($sql);
		return $this->getList($sqlQuery);
	}
	
	/**
	 * Get all records from table ordered by field
	 *
	 * @param $orderColumn column name
	 */
	public function queryAllOrderBy($orderColumn){
		$sql = 'SELECT * FROM bug_report ORDER BY '.$orderColumn;
		$sqlQuery = new SqlQuery($sql);
		return $this->getList($sqlQuery);
	}
	
	/**
 	 * Delete record from table
 	 * @param bugReport primary key
 	 */
	public function delete($id){
		$sql = 'DELETE FROM bug_report WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($id);
		return $this->executeUpdate($sqlQuery);
	}
	
	/**
 	 * Insert record to table
 	 *
 	 * @param BugReportMySql bugReport
 	 */
	public function insert($bugReport){
		$sql = 'INSERT INTO bug_report (title, user_id, message, reported_on) VALUES (?, ?, ?, ?)';
		$sqlQuery = new SqlQuery($sql);
		
		$sqlQuery->set($bugReport->title);
		$sqlQuery->setNumber($bugReport->userId);
		$sqlQuery->set($bugReport->message);
		$sqlQuery->set($bugReport->reportedOn);

		$id = $this->executeInsert($sqlQuery);	
		$bugReport->id = $id;
		return $id;
	}
	
	/**
 	 * Update record in table
 	 *
 	 * @param BugReportMySql bugReport
 	 */
	public function update($bugReport){
		$sql = 'UPDATE bug_report SET title = ?, user_id = ?, message = ?, reported_on = ? WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		
		$sqlQuery->set($bugReport->title);
		$sqlQuery->setNumber($bugReport->userId);
		$sqlQuery->set($bugReport->message);
		$sqlQuery->set($bugReport->reportedOn);

		$sqlQuery->setNumber($bugReport->id);
		return $this->executeUpdate($sqlQuery);
	}

	/**
 	 * Delete all rows
 	 */
	public function clean(){
		$sql = 'DELETE FROM bug_report';
		$sqlQuery = new SqlQuery($sql);
		return $this->executeUpdate($sqlQuery);
	}

	public function queryByTitle($value){
		$sql = 'SELECT * FROM bug_report WHERE title = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}

	public function queryByUserId($value){
		$sql = 'SELECT * FROM bug_report WHERE user_id = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($value);
		return $this->getList($sqlQuery);
	}

	public function queryByMessage($value){
		$sql = 'SELECT * FROM bug_report WHERE message = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}

	public function queryByReportedOn($value){
		$sql = 'SELECT * FROM bug_report WHERE reported_on = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}


	public function deleteByTitle($value){
		$sql = 'DELETE FROM bug_report WHERE title = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteByUserId($value){
		$sql = 'DELETE FROM bug_report WHERE user_id = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteByMessage($value){
		$sql = 'DELETE FROM bug_report WHERE message = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteByReportedOn($value){
		$sql = 'DELETE FROM bug_report WHERE reported_on = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}


	
	/**
	 * Read row
	 *
	 * @return BugReportMySql 
	 */
	protected function readRow($row){
		$bugReport = new BugReport();
		
		$bugReport->id = $row['id'];
		$bugReport->title = $row['title'];
		$bugReport->userId = $row['user_id'];
		$bugReport->message = $row['message'];
		$bugReport->reportedOn = $row['reported_on'];

		return $bugReport;
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
	 * @return BugReportMySql 
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