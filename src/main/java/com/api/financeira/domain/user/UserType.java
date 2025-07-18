package com.api.financeira.domain.user;

public enum UserType {
    // AQUI É UM TIPO ESPECIAL DE CLASSE USADA PARA REPRESENTAR CONJUNTO FIXO
    // DE CONSTANTES.
    //enum é para padronizar códigos,para coisas definidas que não vai mudar.
    //exemplo: usuario e os logistas nesse caso.
    //posso declarar variáveis dentro do enum,eliminando tambem codigos em excesso.


    COMMOM, //PESSOAS COMUNS

    MERCHANT // SÃO OS LOGISTAS
}
