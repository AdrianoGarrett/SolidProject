package org.example.service.promocao;

import org.example.ValidacaoException;
import org.example.model.Cargo;
import org.example.model.Funcionario;

public class PromocaoService {

    public void promover(Funcionario funcionario, boolean metaBatida){
        Cargo cargo = funcionario.getCargo();
        if(Cargo.GERENTE == cargo){
            throw new ValidacaoException("GERENTES NÃO PODEM SER PROMOVIDOS!");
        }
        if(metaBatida){
            Cargo novoCargo = cargo.getProximoCargo();
            funcionario.promover(novoCargo);
            return;
        }
        throw new ValidacaoException("FUNCIONARIO NÃO ESTÁ APTO A PROMOÇÃO!");
    }
}
