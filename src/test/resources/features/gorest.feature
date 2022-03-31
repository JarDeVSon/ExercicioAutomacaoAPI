#language: pt
  #Author: JArdeson
  #Encoding: UTF-8

  @regressivo
  Funcionalidade: Criar e editar contas

    @post
    Cenario: Cadastrar novo usuario API Gorest
      Dado que possuo um token valido
      Quando envio um request de cadastro de usuario com dados validos
      Entao o usuario deve ser criado corretamente
      E o status code do request deve ser 201