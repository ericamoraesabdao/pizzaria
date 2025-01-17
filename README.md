# pizzaria

## Diagrama de Classe

- NomeClasse : Cliente
- Atributos:
  - ID: Long
  - nome: String
  - email: String
- Métodos:
  - getId(): Long
  - setId(id: Long)
  - getNome(): String
  - setNome(nome: String)
  - getEmail(): String
  - setEmail(email: String)
  - Cliente(nome: String, email: String)
    
Classe Pedido - Dependência
- NomeClasse: Pedido
- Atributos:
  - ID: Long
  - descricao: String
  - clienteId: Long
- Método:
  - Pedido(clienteId: Long, descricao: String )
  - getId(): Long
  - setId(id: Long)
  - getDescricao() : String
  - setDescricao(descricao: String)
  - getClienteId(): Long
  - setClienteId(clienteId: Long)

Classe Pagamento - Dependente - Classe Pedido
- NomeClasse : Pagamento
- Atributos:
  - ID: Long
  - valorPago: double
  - pedidoId: Long
  - dataHoraPagamento: Date
  - formaPagamento: Enum: FormaPagamento
- Métodos:
  - validarPagamento(valorTotal: double): void
  - getId(): Long
  - setId(id: Long)
  - getvalorPago(): double
  - setvalorPago(valorPago: double)
  - getPedidoId(): Long
  - setPedidoId(pedidoID: Long)
  - getDataHoraPagamento(): Date
  - setDataHoraPagamento(dataHoraPagamento: Date)
  - getFormaPagamento (): Enum FormaPagamento
  - setFormaPagamento (FormaPagamento : Enum)

Pagamento - Depende - Enum FormaPagamento
- Enum FormaPagamento:
  - CREDITO
  - DEBITO
  - DINHEIRO
  - PIX
  - TRANSFERENCIA


Cliente - - - > Pedido - - - > Pagamento <- - - Enum
