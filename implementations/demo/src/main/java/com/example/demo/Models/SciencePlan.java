package com.example.demo.Models;

import lombok.Data;
import java.util.Date;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "science_plans")
public class SciencePlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String creator;
    private String submitter;
    private double fundingInUSD;
    private String objectives;
    private Date startDate;
    private Date endDate;
    private DataProcRequirement dataProcRequirements;

    @Enumerated(EnumType.STRING)
    private STATUS status;

    @Enumerated(EnumType.STRING)
    private TELESCOPELOC telescopeloc;

    @Enumerated(EnumType.STRING)
    private StarSystem.CONSTELLATIONS starSystem;

    public enum STATUS {
        COMPLETE, TESTED, CANCELLED, RUNNING, SUBMITTED, VALIDATED, INVALIDATED
    }

    public enum TELESCOPELOC {
        CHILE, HAWAII
    }

    public SciencePlan(String creator, String submitter, double fundingInUSD, String objectives, StarSystem.CONSTELLATIONS starSystem, Date startDate, Date endDate, SciencePlan.TELESCOPELOC telescopeLocation, DataProcRequirement dataProcRequirements) {
        this.creator = creator;
        this.submitter = submitter;
        this.fundingInUSD = fundingInUSD;
        this.objectives = objectives;
        this.starSystem = starSystem;
        this.startDate = startDate;
        this.endDate = endDate;
        this.telescopeloc = telescopeLocation;
        this.dataProcRequirements = dataProcRequirements;
        this.status = status;
    }

    public SciencePlan() {

    }
    public String getCreator(){
        return this.creator;
    }


}