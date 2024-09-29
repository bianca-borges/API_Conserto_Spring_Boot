package br.edu.ifsp.prw3.api_2024_2.conserto;

import br.edu.ifsp.prw3.api_2024_2.mecanico.DadosCadastroMecanico;
import br.edu.ifsp.prw3.api_2024_2.veiculo.DadosVeiculo;

public record DadosConserto(
        String entrada,
        String saida,
        DadosVeiculo veiculo,
        DadosCadastroMecanico mecanico) {
}
