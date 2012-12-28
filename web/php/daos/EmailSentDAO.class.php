<?php
class EmailSentMySqlDAO implements EmailSentDAO{

	/**
	 * Get Domain object by primry key
	 *
	 * @param String $id primary key
	 * @return EmailSentMySql 
	 */
	public function load($id){
		$sql = 'SELECT * FROM email_sent WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($id);
		return $this->getRow($sqlQuery);
	}

	/**
	 * Get all records from table
	 */
	public function queryAll(){
		$sql = 'SELECT * FROM email_sent';
		$sqlQuery = new SqlQuery($sql);
		return $this->getList($sqlQuery);
	}
	
	/**
	 * Get all records from table ordered by field
	 *
	 * @param $orderColumn column name
	 */
	public function queryAllOrderBy($orderColumn){
		$sql = 'SELECT * FROM email_sent ORDER BY '.$orderColumn;
		$sqlQuery = new SqlQuery($sql);
		return $this->getList($sqlQuery);
	}
	
	/**
 	 * Delete record from table
 	 * @param emailSent primary key
 	 */
	public function delete($id){
		$sql = 'DELETE FROM email_sent WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->setNumber($id);
		return $this->executeUpdate($sqlQuery);
	}
	
	/**
 	 * Insert record to table
 	 *
 	 * @param EmailSentMySql emailSent
 	 */
	public function insert($emailSent){
		$sql = 'INSERT INTO email_sent (from, to, subject, message, sent_on) VALUES (?, ?, ?, ?, ?)';
		$sqlQuery = new SqlQuery($sql);
		
		$sqlQuery->set($emailSent->from);
		$sqlQuery->set($emailSent->to);
		$sqlQuery->set($emailSent->subject);
		$sqlQuery->set($emailSent->message);
		$sqlQuery->set($emailSent->sentOn);

		$id = $this->executeInsert($sqlQuery);	
		$emailSent->id = $id;
		return $id;
	}
	
	/**
 	 * Update record in table
 	 *
 	 * @param EmailSentMySql emailSent
 	 */
	public function update($emailSent){
		$sql = 'UPDATE email_sent SET from = ?, to = ?, subject = ?, message = ?, sent_on = ? WHERE id = ?';
		$sqlQuery = new SqlQuery($sql);
		
		$sqlQuery->set($emailSent->from);
		$sqlQuery->set($emailSent->to);
		$sqlQuery->set($emailSent->subject);
		$sqlQuery->set($emailSent->message);
		$sqlQuery->set($emailSent->sentOn);

		$sqlQuery->setNumber($emailSent->id);
		return $this->executeUpdate($sqlQuery);
	}

	/**
 	 * Delete all rows
 	 */
	public function clean(){
		$sql = 'DELETE FROM email_sent';
		$sqlQuery = new SqlQuery($sql);
		return $this->executeUpdate($sqlQuery);
	}

	public function queryByFrom($value){
		$sql = 'SELECT * FROM email_sent WHERE from = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}

	public function queryByTo($value){
		$sql = 'SELECT * FROM email_sent WHERE to = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}

	public function queryBySubject($value){
		$sql = 'SELECT * FROM email_sent WHERE subject = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}

	public function queryByMessage($value){
		$sql = 'SELECT * FROM email_sent WHERE message = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}

	public function queryBySentOn($value){
		$sql = 'SELECT * FROM email_sent WHERE sent_on = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->getList($sqlQuery);
	}


	public function deleteByFrom($value){
		$sql = 'DELETE FROM email_sent WHERE from = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteByTo($value){
		$sql = 'DELETE FROM email_sent WHERE to = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteBySubject($value){
		$sql = 'DELETE FROM email_sent WHERE subject = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteByMessage($value){
		$sql = 'DELETE FROM email_sent WHERE message = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}

	public function deleteBySentOn($value){
		$sql = 'DELETE FROM email_sent WHERE sent_on = ?';
		$sqlQuery = new SqlQuery($sql);
		$sqlQuery->set($value);
		return $this->executeUpdate($sqlQuery);
	}


	
	/**
	 * Read row
	 *
	 * @return EmailSentMySql 
	 */
	protected function readRow($row){
		$emailSent = new EmailSent();
		
		$emailSent->id = $row['id'];
		$emailSent->from = $row['from'];
		$emailSent->to = $row['to'];
		$emailSent->subject = $row['subject'];
		$emailSent->message = $row['message'];
		$emailSent->sentOn = $row['sent_on'];

		return $emailSent;
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
	 * @return EmailSentMySql 
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