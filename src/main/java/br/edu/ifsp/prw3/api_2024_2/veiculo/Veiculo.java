package br.edu.ifsp.prw3.api_2024_2.veiculo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(DadosVeiculo dados) {
        this.marca = dados.marca();
        this.modelo = dados.modelo();
        this.ano = dados.ano();
    }
}
