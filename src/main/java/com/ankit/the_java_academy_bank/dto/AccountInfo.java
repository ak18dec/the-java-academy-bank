package com.ankit.the_java_academy_bank.dto;

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

    @Schema(
            description = "User Account Name"
    )
    private String accountName;

    @Schema(
            description = "User Account Balance"
    )
    private BigDecimal accountBalance;

    @Schema(
            description = "User Account Number"
    )
    private String accountNumber;
}
