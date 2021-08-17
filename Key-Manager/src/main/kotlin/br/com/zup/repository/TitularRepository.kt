package br.com.zup.repository

import br.com.zup.model.Titular
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface TitularRepository : JpaRepository<Titular, Long> {
    //fun findByTitular(titular: Titular): Optional<Titular>
}