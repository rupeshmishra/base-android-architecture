package com.base.architecture.domain.repositories

/**
 * Created by rupesh on 09,August,2019
 * Maps the domain entities to data layer models and vice versa
 */
interface DataModelMapper<E, M> {

    fun fromEntity(from: E): M
    fun toEntity(from: M): E
}