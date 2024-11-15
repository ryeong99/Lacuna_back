package LacunaMatata.Lacuna.dto.response.admin.mbti;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class RespMbtiCategoryDto {
    private int mbtiCategoryId;
    private String mbtiCategoryName;
    private String mbtiCategoryTitle;
    private String mbtiCategoryDescription;
    private String mbtiCategoryImg;
}
