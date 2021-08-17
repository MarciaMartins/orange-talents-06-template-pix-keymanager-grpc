package br.com.zup.controller

import br.com.zup.feing.ContasFeingClient
import br.com.zup.feing.dto.ContasFeing
import br.com.zup.repository.ContaRepository
import br.com.zup.repository.InstituicaoRepository
import br.com.zup.repository.TitularRepository
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/contas")
class ContaController(
    val contasFeingClient: ContasFeingClient,
    val contaRepository: ContaRepository,
    val titularRepository: TitularRepository,
    val instituicaoRepository: InstituicaoRepository
) {

    @Get
    fun obterContas() {

        //val contas: List<ContasFeing> = contasFeingClient.recuperaContas()

        //for (conta in contas) {
            //println(conta.titular.nome)
           // var titularModel = conta.titular.toModel()


          // var titular = titularRepository.findByTitular(titularModel).get()
           // if (titular == null) {
              //  titular = titularRepository.save(titularModel)
              //  println("1")
           // }

            // var instituicaoModel = conta.instituicao.toModel()
            //var instituicao = instituicaoRepository.findByInstituicao(instituicaoModel).get()
            //if(instituicao == null){
            //instituicao = instituicaoRepository.save(instituicaoModel)
            println("2")
            //}

            //var contaModel = conta.toModel(titular, instituicao)
            //contaRepository.save(contaModel)

        }



}