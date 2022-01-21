package service;

public interface NormaliseService {
    String normalise(String title);

    Boolean verifySoftEngineer(String title);
    Boolean verifyAccountant(String title);
    Boolean verifyArchitect(String title);
    Boolean verifyQuantitySurveyor(String title);

}
