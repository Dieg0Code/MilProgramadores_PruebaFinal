CREATE Database biblioteca;
USE biblioteca;

CREATE TABLE categoria(
  idCategoria INT PRIMARY KEY NOT NULL,
  nombreCategoria VARCHAR(50) NOT NULL,
  descripcionCategoria VARCHAR(50) NOT NULL
);

CREATE TABLE libro(
  idLibro INT PRIMARY KEY NOT NULL,
  nombreLibro VARCHAR(50) NOT NULL,
  autorLibro VARCHAR(50) NOT NULL,
  editorial VARCHAR(50) NOT NULL,
  ejemplares INT NOT NULL,
  categoria_id INT NOT NULL,
  CONSTRAINT `fk_categoria_id` FOREIGN KEY (categoria_id) REFERENCES `categoria`(idCategoria)
);
