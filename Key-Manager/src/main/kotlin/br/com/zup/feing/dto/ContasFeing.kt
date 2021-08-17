package br.com.zup.feing.dto

import br.com.zup.model.Conta
import br.com.zup.model.Instituicao
import br.com.zup.model.Titular

data class ContasFeing(
    val tipo: String,
    val instituicao: InstituicaoFeing,
    val agencia: Number,
    val numero: Number,
    val titular: TitularFeing
) {
    fun toModel(titularModel: Titular, instituicaoModel: Instituicao): Conta {

        return Conta(tipo, instituicaoModel, agencia, numero, titularModel)
    }


}
