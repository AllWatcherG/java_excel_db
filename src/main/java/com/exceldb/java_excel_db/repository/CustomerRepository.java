package com.exceldb.java_excel_db.repository;
import com.exceldb.java_excel_db.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
