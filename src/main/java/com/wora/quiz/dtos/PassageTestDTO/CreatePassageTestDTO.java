package com.wora.quiz.dtos.PassageTestDTO;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class CreatePassageTestDTO {
    private Long studentId;
    private Long quizId;
    private String raisonRepassage;
    private LocalDateTime dateDebut;
    private LocalDateTime dateFin;
    private List<Long> answerIds;
}
