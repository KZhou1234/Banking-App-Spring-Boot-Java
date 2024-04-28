package com.kolab.javabankingapp.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountInfo {
    //--------------Account Schema: name---------------------------
    @Schema(
            name = "User Account Name"
    )
    private String accountName;

    //--------------Account Schema: balance---------------------------

    @Schema(
            name = "User Account Balance"
    )
    private BigDecimal accountBalance;

    //--------------Account Schema: account number---------------------------

    @Schema(
            name = "User Account Number"
    )
    private String accountNumber;
}
