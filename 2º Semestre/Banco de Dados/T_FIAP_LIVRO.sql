DROP TABLE T_FIAP_LIVRO;

CREATE TABLE T_FIAP_LIVRO(
    CODIGO_LIVRO NUMBER(10) NOT NULL,
    TITULO_LIVRO VARCHAR2(50) NOT NULL,
    VALOR_LIVRO NUMBER(5,2) NOT NULL
);

SELECT * FROM t_fiap_livro;