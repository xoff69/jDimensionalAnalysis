package com.xoff.dimanalysis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnalyseTest {
    @Test
    public void evalue() {
        assertEquals("L ", new Analyse().evalue("k ").toString());
        assertEquals("L^5 ", new Analyse().evalue("k^5 ").toString());
        /*

dr="/d^2[w]\d[k]^3/"
#evalue("w k^5 Kb^3 "  )
#evalue("w k^5 Kb^3 "+dr  )
#print(dr,"=>",analyse_derivative(dr))
         */
    }

}