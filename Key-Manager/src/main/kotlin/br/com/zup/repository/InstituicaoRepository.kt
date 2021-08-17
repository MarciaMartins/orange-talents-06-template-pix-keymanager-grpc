package br.com.zup.repository

import br.com.zup.model.Instituicao
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface InstituicaoRepository : JpaRepository<Instituicao, Long> {
   fun findByIspb(ispb: Number): Optional<Instituicao>
    //fun findByInstituicao(instituicaoModel: Instituicao): Optional<Instituicao>
    //fun findByInstituicao(instituicao: Instituicao): Optional<Instituicao>
}