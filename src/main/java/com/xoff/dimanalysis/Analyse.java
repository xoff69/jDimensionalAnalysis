package com.xoff.dimanalysis;

import com.xoff.dimanalysis.dimension.Couple;
import com.xoff.dimanalysis.dimension.Dimension;
import com.xoff.dimanalysis.dimension.Unit;

import java.util.StringTokenizer;

public class Analyse {

    private static final String SEPARATOR=" ";
    private static final String POWER_SYMBOL="^";
    /**
     * syntaxe : w k^5 Kb^3
     * @param expression
     * @return
     */
   public Dimension evalue(String expression){
       StringTokenizer stringTokenizer=new StringTokenizer(expression,SEPARATOR);
       Dimension dimension=new Dimension();
       while (stringTokenizer.hasMoreTokens()){
           dimension.getSubdimensions().add(evalueTerme(stringTokenizer.nextToken()));
       }
       return dimension.simplify();
   }
    private Couple evalueTerme(String expression){
       System.out.println("evalueTerme "+expression);
        StringTokenizer stringTokenizer=new StringTokenizer(expression,POWER_SYMBOL);
        String symbol=stringTokenizer.nextToken();
        int power=0;
        if (stringTokenizer.hasMoreTokens()) {
             power = Integer.parseInt(stringTokenizer.nextToken());
        }
        Couple couple=new Couple(evalueUnit(symbol),power);
        return  couple;
    }
    private Unit evalueUnit(String expression){
        return Unit.L; //fiXNE
    }
}


