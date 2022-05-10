package org.walletconnect.model

data class JSONRPC(
    val id: Long,
    val jsonrpc: String,
    val method: String,
    val params: List<TransactionRequest>
)

data class TransactionRequest(
    val data: String,
    val from: String,
    val gas: String,
    val gasPrice: String,
    val nonce: String,
    val to: String,
    val value: String
)