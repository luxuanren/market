package com.study.mappers;

import com.study.model.Evaluation;

import java.util.List;

public interface EvaluationMapper {
    List<Evaluation> getGoodsEvaluationById(Integer goodsId);
    void saveEvaluation(Evaluation evaluation);
}
