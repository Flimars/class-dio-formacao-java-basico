package aulas.pooActivities;

import java.util.*;

public class Cliente extends Pessoa {



    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco){
        if (endereco == null){
            throw new NullPointerException("Endereço Não pode ser nulo");
        }

        if(endereco.cep == null){
            throw new NullPointerException("CEP Não pode ser nulo");

        }
    }




}
