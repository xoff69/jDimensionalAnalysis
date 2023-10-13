package com.xoff.dimanalysis.dimension;

import com.xoff.dimanalysis.Constants;
import lombok.Getter;

import java.util.HashMap;

public class KnownDimensions {

    private static KnownDimensions _instance;
    @Getter
    private final HashMap<String, Dimension> knowDimensions;

    private KnownDimensions() {
        knowDimensions = new HashMap<>();
        addDimensionEnergy();

        /*

    allvar["k"]="L^-1"
    allvar["c"]="L^1 T^-1"
    allvar["T"]="K^1"
    allvar["w"]=allvar.get("c")+" "+allvar.get("k")
    allvar["Kb"]="L^2 M^1 T^-2 K^-1" #m2 kg s-2 K-1
         */
    }

    public static KnownDimensions getInstance() {
        if (_instance == null) {
            _instance = new KnownDimensions();
        }
        return _instance;

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (String key : knowDimensions.keySet()) {
            stringBuilder.append(key).append(":").append(knowDimensions.get(key)).append("\n");
        }
        return stringBuilder.toString();
    }

    private void addDimensionEnergy() {
        Dimension dimension = new Dimension();
        dimension.getSubdimensions().add(new Couple(Unit.M, 1));
        dimension.getSubdimensions().add(new Couple(Unit.L, 2));
        dimension.getSubdimensions().add(new Couple(Unit.T, -1));
        knowDimensions.put(Constants.H, dimension);
        knowDimensions.put(Constants.HBAR, dimension);
        knowDimensions.put(Constants.E, dimension);
    }


}
