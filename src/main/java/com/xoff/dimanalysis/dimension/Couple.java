package com.xoff.dimanalysis.dimension;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Couple {
    private Unit unit;
    private int size;

    @Override
    public String toString(){
        return  unit.toString() + "^" + size;
    }
}
