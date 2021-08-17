package br.com.zup.controller

import br.com.zup.feing.ContasFeingClient
import br.com.zup.feing.dto.ContasFeing
import br.com.zup.model.Instituicao
import br.com.zup.model.Titular
import br.com.zup.repository.ContaRepository
import br.com.zup.repository.InstituicaoRepository
import br.com.zup.repository.TitularRepository
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.util.*
import javax.transaction.Transactional

@Controller("/contas")
class ContaController(
    val contasFeingClient: ContasFeingClient,
    val contaRepository: ContaRepository,
    val titularRepository: TitularRepository,
    val instituicaoRepository: InstituicaoRepository
) {

    @Get
    @Transactional
    fun obterContas() {
        val contas: List<ContasFeing> = contasFeingClient.recuperaContas()

        for (conta in contas) {
            var titularModel = conta.titular.toModel()

            var titularRetorno: Optional<Titular> = titularRepository.findByCpf(titularModel.cpf)
            var titular: Titular
            if (titularRetorno.isEmpty) {
                titular = titularRepository.save(titularModel)
            } else titular = titularRetorno.get()

            var instituicaoModel = conta.instituicao.toModel()
            println(instituicaoModel.ispb)
            var instituicaoRetorno: Optional<Instituicao>  = instituicaoRepository.findByIspb(instituicaoModel.ispb)
            var instituicao: Instituicao
            if (instituicaoRetorno.isEmpty) {
                instituicao = instituicaoRepository.save(instituicaoModel)
               println("2")
            } else instituicao = instituicaoRetorno.get()

            var contaModel = conta.toModel(titular, instituicao)
            contaRepository.save(contaModel)

        }
    }

}