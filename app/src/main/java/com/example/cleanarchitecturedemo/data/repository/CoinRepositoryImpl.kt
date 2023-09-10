package com.example.cleanarchitecturedemo.data.repository

import com.example.cleanarchitecturedemo.domain.repository.CoinRepository
import com.example.cleanarchitecturedemo.data.data_source.dto.CoinDetailDTO.CoinDetailDto
import com.example.cleanarchitecturedemo.data.data_source.dto.CoinListDTO.CoinListDtoItem
import com.example.relevelandroidproject.data.data_source.dto.CoinGeckoApi
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api : CoinGeckoApi
) : CoinRepository {
    override suspend fun getAllCoins(page:String): List<CoinListDtoItem> {
        return api.getAllCoins(page=page)
    }

    override suspend fun getCoinById(id: String): CoinDetailDto {

        return api.getCoinById(id=id)
    }
}