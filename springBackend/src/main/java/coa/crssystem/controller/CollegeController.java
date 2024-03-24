package coa.crssystem.controller;

import coa.crssystem.entity.College;
import coa.crssystem.service.CollegeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping(path= "/college")
public class CollegeController {
    private final CollegeService collegeService;
    @GetMapping(path="/all")
    public List<College> displayAccounts(){return collegeService.getAllColleges();}
}

