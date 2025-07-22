package com.plcoding.cryptotracker.core.domain.util

enum class NetworkError: Error {
    REQUEST_TIMEOUT,
    NO_INTERNET,
    SERVER_ERROR,
    SERIALIZATION,
    UNKNOWN,
    TOO_MANY_REQUESTS,
}