package org.example;

import org.example.model.Cargo;
import org.example.model.Funcionario;
import org.example.service.ReajusteService;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Fulano", "00000000000", Cargo.valueOf("ESPECIALISTA"), BigDecimal.valueOf(6000));

        System.out.println("Funcionario: "+funcionario.getSalario());
        System.out.println("Funcionario: "+funcionario.getSalario());
    }
}