package main.java.controller;

import main.java.model.Analysis;
import main.java.model.Result;

import java.util.Map;

/**
 * Created by mikhailov on 17.07.16.
 */
public interface ReportController {

    void addConclusion(String conclusion);
    Map<Analysis, Result> showAnalysis();


}
