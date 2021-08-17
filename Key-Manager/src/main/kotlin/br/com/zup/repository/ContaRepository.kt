package br.com.zup.repository

import br.com.zup.model.Conta
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface ContaRepository : JpaRepository<Conta, Long> {
}