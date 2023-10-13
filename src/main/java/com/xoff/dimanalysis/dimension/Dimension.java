package com.xoff.dimanalysis.dimension;

import com.xoff.dimanalysis.dimension.Couple;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Dimension {
    private List<Couple> subdimensions;

    public Dimension(){
        subdimensions=new ArrayList<>();
    }
    @Override
    public String toString(){
        StringBuilder stringBuilder=new StringBuilder();
        for (Couple couple:subdimensions)
        {
            stringBuilder.append(couple.toString());
        }
        return stringBuilder.toString();
    }
    public Dimension simplify(){
        return this;
          /*
    # gere les facteurs
    def simplify(expression):
            #^-1^1^2
            #print("expres",expression)
    l=expression.split("^")
    res=0
            #print("l",l)
    for i in l:
            if len(i)!=0:
    res=res+int(i)

    return "^"+str(res)*/
    }

}
