package LacunaMatata.Lacuna.dto.request.admin.manageuser;

import lombok.Data;

@Data
public class ReqGetUserListDto {
    private String option;
    private String search;
    private int page;
    private int limit;
}
