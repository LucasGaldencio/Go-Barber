package br.edu.ufape.gobarber.dto.page;

import br.edu.ufape.gobarber.dto.barber.BarberWithServiceDTO;
import br.edu.ufape.gobarber.dto.productStock.ProductStockDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PageBarberDTO {

    @Schema(description = "Total de elementos disponiveis no banco de dados", example = "105")
    private Long totalElements;

    @Schema(description = "Total de paginas disponiveis para exibição", example = "11")
    private Integer totalPages;

    @Schema(description = "Página atual", example = "0")
    private Integer page;

    @Schema(description = "Quantidade de elementos por página", example = "10")
    private Integer size;

    @Schema(description = "Elementos da página atual")
    private List<BarberWithServiceDTO> content;
}
