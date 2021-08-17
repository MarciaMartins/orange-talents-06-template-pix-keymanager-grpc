package br.com.zup.feing.dto

import br.com.zup.model.Instituicao

data class InstituicaoFeing(
    val nome: String,
    val ispb: Integer
) {

    fun toModel(): Instituicao {
        return Instituicao(nome, ispb)
    }
}

