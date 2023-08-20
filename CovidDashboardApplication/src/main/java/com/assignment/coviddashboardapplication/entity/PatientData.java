package com.assignment.coviddashboardapplication.entity;


import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class PatientData {
    @javax.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

    public int date;
    public String state;
    public int positive;
    public String probableCases;
    public String negative;
    public String pending;
    public String totalTestResultsSource;
    public int totalTestResults;
    public int hospitalizedCurrently;
    public String hospitalizedCumulative;
    public String recovered;
    public int death;
    public String hospitalized;
    public String hospitalizedDischarged;
    public String positiveTestsViral;
    public String negativeTestsViral;
    public int positiveCasesViral;
    public String deathConfirmed;
    public String totalTestEncountersViral;
    public String totalTestsPeopleViral;
    public String fips;
    public int positiveIncrease;
    public int negativeIncrease;
    public int total;
    public int posNeg;


    public String hash;


    @Basic
    @Column(name = "date", nullable = true)
    public int getDate() {
        return date;
    }


    public void setDate(int date) {
        this.date = date;
    }

    @Basic
    @Column(name = "state", nullable = true)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    @Basic
    @Column(name = "positive", nullable = true)
    public int getPositive() {
        return positive;
    }

    public void setPositive(int positive) {
        this.positive = positive;
    }
    @Basic
    @Column(name = "probableCases", nullable = true)
    public String getProbableCases() {
        return probableCases;
    }

    public void setProbableCases(String probableCases) {
        this.probableCases = probableCases;
    }
    @Basic
    @Column(name = "negative", nullable = true)
    public String getNegative() {
        return negative;
    }

    public void setNegative(String negative) {
        this.negative = negative;
    }
    @Basic
    @Column(name = "pending", nullable = true)
    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }
    @Basic
    @Column(name = "totalTestResultsSource", nullable = true)
    public String getTotalTestResultsSource() {
        return totalTestResultsSource;
    }

    public void setTotalTestResultsSource(String totalTestResultsSource) {
        this.totalTestResultsSource = totalTestResultsSource;
    }
    @Basic
    @Column(name = "totalTestResults", nullable = true)
    public int getTotalTestResults() {
        return totalTestResults;
    }

    public void setTotalTestResults(int totalTestResults) {
        this.totalTestResults = totalTestResults;
    }
    @Basic
    @Column(name = "hospitalizedCurrently", nullable = true)
    public int getHospitalizedCurrently() {
        return hospitalizedCurrently;
    }

    public void setHospitalizedCurrently(int hospitalizedCurrently) {
        this.hospitalizedCurrently = hospitalizedCurrently;
    }
    @Basic
    @Column(name = "hospitalizedCumulative", nullable = true)
    public String getHospitalizedCumulative() {
        return hospitalizedCumulative;
    }

    public void setHospitalizedCumulative(String hospitalizedCumulative) {
        this.hospitalizedCumulative = hospitalizedCumulative;
    }


    @Basic
    @Column(name = "recovered", nullable = true)
    public String getRecovered() {
        return recovered;
    }

    public void setRecovered(String recovered) {
        this.recovered = recovered;
    }


    @Basic
    @Column(name = "death", nullable = true)
    public int getDeath() {
        return death;
    }

    public void setDeath(int death) {
        this.death = death;
    }
    @Basic
    @Column(name = "hospitalized", nullable = true)
    public String getHospitalized() {
        return hospitalized;
    }

    public void setHospitalized(String hospitalized) {
        this.hospitalized = hospitalized;
    }
    @Basic
    @Column(name = "hospitalizedDischarged", nullable = true)
    public String getHospitalizedDischarged() {
        return hospitalizedDischarged;
    }

    public void setHospitalizedDischarged(String hospitalizedDischarged) {
        this.hospitalizedDischarged = hospitalizedDischarged;
    }


    @Basic
    @Column(name = "positiveTestsViral", nullable = true)
    public String getPositiveTestsViral() {
        return positiveTestsViral;
    }

    public void setPositiveTestsViral(String positiveTestsViral) {
        this.positiveTestsViral = positiveTestsViral;
    }
    @Basic
    @Column(name = "negativeTestsViral", nullable = true)
    public String getNegativeTestsViral() {
        return negativeTestsViral;
    }

    public void setNegativeTestsViral(String negativeTestsViral) {
        this.negativeTestsViral = negativeTestsViral;
    }
    @Basic
    @Column(name = "positiveCasesViral", nullable = true)
    public int getPositiveCasesViral() {
        return positiveCasesViral;
    }

    public void setPositiveCasesViral(int positiveCasesViral) {
        this.positiveCasesViral = positiveCasesViral;
    }
    @Basic
    @Column(name = "deathConfirmed", nullable = true)
    public String getDeathConfirmed() {
        return deathConfirmed;
    }

    public void setDeathConfirmed(String deathConfirmed) {
        this.deathConfirmed = deathConfirmed;
    }
    @Basic
    @Column(name = "totalTestEncountersViral", nullable = true)
    public String getTotalTestEncountersViral() {
        return totalTestEncountersViral;
    }

    public void setTotalTestEncountersViral(String totalTestEncountersViral) {
        this.totalTestEncountersViral = totalTestEncountersViral;
    }
    @Basic
    @Column(name = "totalTestsPeopleViral", nullable = true)
    public String getTotalTestsPeopleViral() {
        return totalTestsPeopleViral;
    }

    public void setTotalTestsPeopleViral(String totalTestsPeopleViral) {
        this.totalTestsPeopleViral = totalTestsPeopleViral;
    }


    @Basic
    @Column(name = "positiveIncrease", nullable = true)
    public int getPositiveIncrease() {
        return positiveIncrease;
    }

    public void setPositiveIncrease(int positiveIncrease) {
        this.positiveIncrease = positiveIncrease;
    }
    @Basic
    @Column(name = "negativeIncrease", nullable = true)
    public int getNegativeIncrease() {
        return negativeIncrease;
    }

    public void setNegativeIncrease(int negativeIncrease) {
        this.negativeIncrease = negativeIncrease;
    }
    @Basic
    @Column(name = "total", nullable = true)
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Basic
    @Column(name = "posNeg", nullable = true)
    public int getPosNeg() {
        return posNeg;
    }

    public void setPosNeg(int posNeg) {
        this.posNeg = posNeg;
    }

    @Basic
    @Column(name = "name", nullable = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Basic
    @Column(name = "price", nullable = true)
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @Id
    @Column(name = "id", nullable = true)
    public Long getId() {
        return id;
    }
}
