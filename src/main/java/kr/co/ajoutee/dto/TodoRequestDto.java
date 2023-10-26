package kr.co.ajoutee.dto;


import jakarta.validation.constraints.NotEmpty;
import kr.co.ajoutee.domain.TodoEntity;
import lombok.*;

import java.util.Date;

@Getter @Setter
@NoArgsConstructor
public class TodoRequestDto {

    @NotEmpty
    private String title;
    private Boolean completed;


    public TodoEntity toEntity() {
        return TodoEntity.builder()
                .title(title)
                .completed(true)
                .build();
    }

    public TodoRequestDto(String title, Boolean completed) {
        this.title = title;
        this.completed = completed;

    }
}