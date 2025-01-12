package com.wora.quiz.dtos.QuestionDTO;

import com.wora.quiz.entities.enums.TypeQuestion;
import lombok.Data;

import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CreateQuestionDTO {
    private String texte;
    private Integer nombreReponses;
    private Integer nombreReponsesCorrectes;
    private TypeQuestion typeQuestion;
    private Long sujetId;
    private Long levelId;
    private Long quizId;
}

