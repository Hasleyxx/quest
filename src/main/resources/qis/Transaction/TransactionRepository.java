package qis.Transaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quest.tables.Transaction;


@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
