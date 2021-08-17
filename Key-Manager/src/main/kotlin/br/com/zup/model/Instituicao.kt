package br.com.zup.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Instituicao(
    val nome: String,
    val ispb: Integer
) {

    @Id
    @GeneratedValue
    var codigo: Long? = null

}
