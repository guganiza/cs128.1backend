package coa.crssystem.service;

import coa.crssystem.entity.College;
import coa.crssystem.repository.CollegeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CollegeService {
    private final CollegeRepository collegeRepository;

    public List<College> getAllColleges(){return collegeRepository.findAll();}
}
