package com.example.cleanarchitecturedemo.domain.repository

import com.example.cleanarchitecturedemo.data.data_source.dto.CoinDetailDTO.CoinDetailDto
import com.example.cleanarchitecturedemo.data.data_source.dto.CoinListDTO.CoinListDtoItem

interface CoinRepository {

    suspend fun getAllCoins(page:String): List<CoinListDtoItem>

    suspend fun getCoinById(id:String): CoinDetailDto

}