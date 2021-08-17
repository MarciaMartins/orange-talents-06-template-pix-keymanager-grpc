package br.com.zup.feing.dto

import br.com.zup.model.Titular

data class TitularFeing(
    val id: String,
    val nome: String,
    val cpf: String
) {
    fun toModel(): Titular {
        return Titular(id, nome, cpf)
    }
}
