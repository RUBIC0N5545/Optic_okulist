package spring.boot.optic.okulist.service.payment;

import spring.boot.optic.okulist.dto.payment.TransactionListRequestDto;
import spring.boot.optic.okulist.dto.payment.TransactionListResponseDto;

public interface WayForPayTransactionService {
    TransactionListResponseDto getTransactionList(TransactionListRequestDto requestDto);
}