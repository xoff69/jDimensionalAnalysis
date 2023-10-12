package com.xoff.dimanalysis.dimension;

import lombok.Getter;

import java.util.HashMap;

public class KnownDimensions {

    private static KnownDimensions _instance;
    public static KnownDimensions getInstance(){
        if (_instance==null){
            _instance=new KnownDimensions();
        }
        return _instance;

    }
    @Getter
    private final HashMap<String,Dimension> knowDimensions;
    @Override
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        for (String key:knowDimensions.keySet())
        {
            stringBuilder.append(key).append(":").append(knowDimensions.get(key));
        }
        return stringBuilder.toString();
    }
    private void addH(){
        Dimension dimension=new Dimension();
        dimension.getSubdimensions().add(new Couple(Unit.M,1));
        dimension.getSubdimensions().add(new Couple(Unit.L,2));
        dimension.getSubdimensions().add(new Couple(Unit.T,-1));
        knowDimensions.put("h",dimension);
    }
    private KnownDimensions(){
        knowDimensions=new HashMap<>();
addH();

        /*

    allvar["hbar"]=allvar["h"]
    allvar["E"]=allvar["h"]
    allvar["k"]="L^-1"
    allvar["c"]="L^1 T^-1"
    allvar["T"]="K^1"
    allvar["w"]=allvar.get("c")+" "+allvar.get("k")
    allvar["Kb"]="L^2 M^1 T^-2 K^-1" #m2 kg s-2 K-1
         */
    }


}
