package br.com.zup.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Titular(
    val id: String,
    val nome: String,
    val cpf: String
) {
    @Id
    @GeneratedValue
    var codigo: Long? = null
}
