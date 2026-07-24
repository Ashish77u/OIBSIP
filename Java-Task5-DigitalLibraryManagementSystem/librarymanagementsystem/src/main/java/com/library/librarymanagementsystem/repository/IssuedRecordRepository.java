package com.library.librarymanagementsystem.repository;

import com.library.librarymanagementsystem.entity.Book;
import com.library.librarymanagementsystem.entity.IssueRecord;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IssuedRecordRepository extends JpaRepository<IssueRecord, Long>{

    List<IssueRecord> findByUserId(Long id);
    List<IssueRecord> findByReturnDateIsNull();
    List<IssueRecord> findByBookIdAndReturnDateIsNull(Long bookId);
    List<IssueRecord> findByFinePaidFalseAndFineAmountGreaterThan(Double amount);

}
