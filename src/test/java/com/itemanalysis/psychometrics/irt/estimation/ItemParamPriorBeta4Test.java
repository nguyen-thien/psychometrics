package com.itemanalysis.psychometrics.irt.estimation;

import com.itemanalysis.psychometrics.distribution.UniformDistributionApproximation;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemParamPriorBeta4Test {


    @Test
    public void testDistribution(){
        ItemParamPrior beta4 = new ItemParamPriorBeta4(1, 4, 0, 0.8);
        UniformDistributionApproximation dist = new UniformDistributionApproximation(-1.5, 1.5, 50);

//        double point = 0.0;
//        for(int i=0;i<dist.getNumberOfPoints();i++){
//            point = dist.getPointAt(i);
//            System.out.println(point + "  " + beta4.logDensity(point));
//        }

        System.out.println(beta4.logDensity(0.442053));

    }


}