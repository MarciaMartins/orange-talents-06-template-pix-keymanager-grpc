package br.com.zup.model

import javax.persistence.*

@Entity
data class Conta(
    val tipo: String,
    @ManyToOne
    @JoinColumn(name = "instituicao_codigo")
    val instituicao: Instituicao,
    val agencia: Number,
    val numero: Number,
    @ManyToOne
    @JoinColumn(name = "titular_codigo")
    val titular: Titular
) {
    @Id
    @GeneratedValue
    var codigo: Long? = null
}