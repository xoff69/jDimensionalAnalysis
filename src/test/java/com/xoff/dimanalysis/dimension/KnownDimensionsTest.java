package com.xoff.dimanalysis.dimension;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KnownDimensionsTest {
@Test
    public void testPrintValue(){
    KnownDimensions knownDimensions=KnownDimensions.getInstance();
    assertNotNull(knownDimensions.toString());
    assert(knownDimensions.getKnowDimensions().keySet().size()>0);
    System.out.println(knownDimensions.toString());
}
}