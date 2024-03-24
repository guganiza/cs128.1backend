package coa.crssystem.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name = "COLLEGE")
@RequiredArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class College {
    @Id
    @JsonProperty("college_id")
    private Long collegeId;
    @JsonProperty("college_name")
    private String collegeName;
    @JsonProperty("create_date")
    private Date createDate;
    @JsonProperty("modify_date")
    private Date modifyDate;
}
