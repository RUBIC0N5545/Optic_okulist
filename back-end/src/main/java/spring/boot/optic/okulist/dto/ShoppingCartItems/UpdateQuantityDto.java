package spring.boot.optic.okulist.dto.ShoppingCartItems;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class UpdateQuantityDto {
    @NotNull
    @Positive
    private int quantity;
}
