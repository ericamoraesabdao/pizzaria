# Pizzaria

## Diagrama de Classe

- NomeClasse : Cliente
- Atributos:
  - ID: Long
  - nome: String
  - email: String
  - telefone: String
- Métodos:
  - Cliente ()
  - Cliente(nome: String, email: String, telefone: String)
  - getId(): Long
  - setId(id: Long)
  - getNome(): String
  - setNome(nome: String)
  - getEmail(): String
  - setEmail(email: String)
  - getTelefone(): String
  - setTelefone(telefone: String)
  - 
    
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




## Endpoints

Criar Clientes

URL: /clientes

Método: POST

Descrição: Cadastra um novo cliente.

Body (JSON):

    {
    "nome": "João Silva",
    "email": "joao.silva@gmail.com",
    "telefone": "34560979"
    }