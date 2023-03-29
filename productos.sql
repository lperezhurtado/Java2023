-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 05-04-2018 a las 01:37:17
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `curso_sql`
--

-- --------------------------------------------------------



CREATE TABLE `productos` (
  `CODIGO_ARTICULO` varchar(4) NOT NULL,
  `SECCION` varchar(11) DEFAULT NULL,
  `NOMBRE` varchar(20) DEFAULT NULL,
  `PRECIO` decimal(8,2) DEFAULT NULL,
  `PAIS` varchar(6) DEFAULT NULL,
  `FECHA` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`CODIGO_ARTICULO`, `SECCION`, `NOMBRE`, `PRECIO`, `PAIS`, `FECHA`) VALUES
('AR02', 'HOGAR', 'LAMPARA', '120.50', 'ESPAÑA', '2018-03-30'),
('AR03', 'INFORMATICA', 'RATON', '30.35', 'CHINA', '2017-03-01'),
('AR04', 'INFORMATICA', 'TECLADO', '45.99', 'CHINA', '2016-05-13'),
('AR05', 'DEPORTES', 'BALON FUTBOL', '50.95', 'EEUU', '2018-01-11'),
('AR06', 'INFORMATICA', 'GTA V', '59.95', 'EEUU', '2017-01-07'),
('AR07', 'DEPORTES', 'CAMISETA REAL MADRID', '60.00', 'ESPAÑA', '2018-01-01'),
('AR08', 'HOGAR', 'MESA', '350.99', 'ESPAÑA', '2015-03-06'),
('AR09', 'HOGAR', 'SILLA', '180.50', 'ESPAÑA', '2015-03-06'),
('AR10', 'DEPORTES', 'BALON FIRMA RONALDO', '1200.00', 'ESPAÑA', '2013-03-01'),
('AR11', 'DEPORTES', 'CANOA', '650.00', 'ESPAÑA', '2018-02-07'),
('AR12', 'DEPORTES', 'MANCUERNA', '25.00', 'ESPAÑA', '2016-05-07'),
('AR13', 'HOGAR', 'TELEVISION', '1500.00', 'CHINA', '2017-03-26'),
('AR14', NULL, 'PANTALON', '50.00', 'ESPAÑA', NULL);

--
-- Disparadores `productos`
--
DELIMITER $$
CREATE TRIGGER `PRODUCTOS_AI` AFTER INSERT ON `productos` FOR EACH ROW INSERT INTO REG_PRODUCTOS(CODIGO_ARTICULO, NOMBRE, PRECIO, MODIFICADO) VALUES(NEW.CODIGO_ARTICULO, NEW.NOMBRE, NEW.PRECIO, NOW())
$$
DELIMITER ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`CODIGO_ARTICULO`),
  ADD KEY `CODIGO_ARTICULO` (`CODIGO_ARTICULO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
