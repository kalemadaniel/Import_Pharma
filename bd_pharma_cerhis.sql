-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  mer. 29 nov. 2023 à 09:14
-- Version du serveur :  10.1.26-MariaDB
-- Version de PHP :  7.1.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `bd_pharma_cerhis`
--

-- --------------------------------------------------------

--
-- Structure de la table `tb_mvt`
--

CREATE TABLE `tb_mvt` (
  `code` varchar(50) DEFAULT NULL,
  `date_dis` date DEFAULT NULL,
  `nom` varchar(50) DEFAULT NULL,
  `postnom` varchar(50) DEFAULT NULL,
  `prenom` varchar(50) DEFAULT NULL,
  `genre` varchar(1) DEFAULT NULL,
  `date_nais` date DEFAULT NULL,
  `produit` varchar(50) DEFAULT NULL,
  `qte_pres` int(11) DEFAULT NULL,
  `posologie` varchar(50) DEFAULT NULL,
  `qte_disp` int(11) DEFAULT NULL,
  `commentaire` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `tb_tempo`
--

CREATE TABLE `tb_tempo` (
  `cEVT_ID` varchar(50) DEFAULT NULL,
  `cEVT_Date` date DEFAULT NULL,
  `cCHP_VAL_Alpha` varchar(100) DEFAULT NULL,
  `cCHP_VAL_Num` int(11) DEFAULT NULL,
  `cCHP_VAL_Memo` varchar(100) DEFAULT NULL,
  `cCHP_Code` varchar(100) DEFAULT NULL,
  `cPAT_Famille` varchar(50) DEFAULT NULL,
  `cPAT_Nom` varchar(50) DEFAULT NULL,
  `cPAT_Prenom` varchar(50) DEFAULT NULL,
  `cPAT_Genre` varchar(1) DEFAULT NULL,
  `cPAT_Ddn` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
