package coa.crssystem.repository;

import coa.crssystem.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository  extends JpaRepository<College,Long> {

College findByCollegeId(Long collegeId);
}
