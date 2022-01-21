package service;

import app.JobTitle;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public class NormaliseServiceImpl implements NormaliseService{

    @Override
    public String normalise(String title) {
        if(verifySoftEngineer(title)) return JobTitle.SOFTWARE_ENGINEER.getJobTitle();
        else if(verifyAccountant(title)) return JobTitle.ACCOUNTANT.getJobTitle();
        else if(verifyArchitect(title)) return  JobTitle.ARCHITECT.getJobTitle();
        else if(verifyQuantitySurveyor(title)) return JobTitle.QUANTITY_SURVEYOR.getJobTitle();
        return "No matches";
    }

    @Override
    public Boolean verifySoftEngineer(String title) {
        Double count = 0.0;

        if(Pattern.compile(Pattern.quote("software"), Pattern.CASE_INSENSITIVE)
                .matcher(title)
                .find()){
            count+=0.5;
        }

        if(Pattern.compile(Pattern.quote("engineer"), Pattern.CASE_INSENSITIVE)
                .matcher(title)
                .find()){
            count+=0.5;
        }

        return count <= 1.0 && count > 0.0;
    }

    @Override
    public Boolean verifyAccountant(String title) {
        Double count = 0.0;

        if(Pattern.compile(Pattern.quote("accountant"), Pattern.CASE_INSENSITIVE)
                .matcher(title)
                .find()){
            count+=1.0;
        }

        return count <= 1.0 && count > 0.0;
    }

    @Override
    public Boolean verifyArchitect(String title) {
        Double count = 0.0;

        if(Pattern.compile(Pattern.quote("architect"), Pattern.CASE_INSENSITIVE)
                .matcher(title)
                .find()){
            count+=1.0;
        }

        return count <= 1.0 && count > 0.0;
    }

    @Override
    public Boolean verifyQuantitySurveyor(String title) {
        Double count = 0.0;

        if(Pattern.compile(Pattern.quote("quantity"), Pattern.CASE_INSENSITIVE)
                .matcher(title)
                .find()){
            count+=0.5;
        }

        if(Pattern.compile(Pattern.quote("surveyor"), Pattern.CASE_INSENSITIVE)
                .matcher(title)
                .find()){
            count+=0.5;
        }

        return count <= 1.0 && count > 0.0;
    }

}
