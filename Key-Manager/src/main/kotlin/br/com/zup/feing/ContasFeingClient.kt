package br.com.zup.feing

import br.com.zup.feing.dto.ContasFeing
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("http://localhost:9091")
interface ContasFeingClient {

    @Get("/api/v1/private/contas/todas")
    fun recuperaContas(): List<ContasFeing>

}