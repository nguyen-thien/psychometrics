/*
 * Copyright 2012 J. Patrick Meyer
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.itemanalysis.psychometrics.reliability;

import com.itemanalysis.psychometrics.data.VariableInfo;

import java.util.ArrayList;

/**
 * 
 * @author J. Patrick Meyer <meyerjp at itemanalysis.com>
 */
public interface ScoreReliability {
	
    public static final String GUTTMAN_LAMBDA = "LAMBDA";
	public static final String CRONBACH_ALPHA = "ALPHA";
	public static final String FELDT_GILMER = "FG";
	public static final String FELDT_CLASSICAL_CONGENERIC = "FB";
    public static final String RAJU_BETA = "RAJU";
    public static final String STRATIFIED_ALPHA = "STRAT";
	
	public double[] valueIfItemDeleted();

    public void incrementValueIfItemDeleted(int index, double value);

    public double value(boolean unbiased);

    public String ifDeletedToString(ArrayList<VariableInfo> var);
	
	public double sem(boolean unbiased);

    public String name();
    
    public double[] confidenceInterval(double numberOfExaminees, boolean unbiased);

    public String confidenceIntervalToString();

}
