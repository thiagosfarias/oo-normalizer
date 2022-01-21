package app;

import service.NormaliseService;
import service.NormaliseServiceImpl;

import java.util.Arrays;

public class Normaliser {

    private NormaliseService service = new NormaliseServiceImpl();

    public String normalise(String title) {
        return service.normalise(title);
    }

}
