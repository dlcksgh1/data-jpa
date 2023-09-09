package study.datajpa.dto;

import lombok.Getter;
import study.datajpa.entity.Team;

@Getter
public class MemberProjectionDto {

    private Long id;
    private String username;
    private Team team;

    public MemberProjectionDto(Long id, String username, Team team) {
        this.id = id;
        this.username = username;
        this.team = team;
    }

}
