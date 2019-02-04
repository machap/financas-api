CREATE TABLE pessoa (
	codigo BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(80) NOT NULL,
    ativo BOOLEAN,
    logradouro VARCHAR(80),
    numero VARCHAR(5),
    complemento VARCHAR(80),
    bairro VARCHAR(20),
    cep VARCHAR(8),
    cidade VARCHAR(40),
    estado VARCHAR(2)    
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
