-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 22 Apr 2017 pada 00.47
-- Versi Server: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_siak`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tab_mahasiswa`
--

CREATE TABLE `tab_mahasiswa` (
  `nim` varchar(15) NOT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `tanggal _lahir` date NOT NULL,
  `jurusan` varchar(20) DEFAULT NULL,
  `alamat` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tab_mahasiswa`
--

INSERT INTO `tab_mahasiswa` (`nim`, `nama`, `tanggal _lahir`, `jurusan`, `alamat`) VALUES
('1603005', 'Muhammad Riki Pirmansyah', '1997-04-12', 'Teknik Komputer', 'Jl. Parakaan Saat 2');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tab_matkul`
--

CREATE TABLE `tab_matkul` (
  `kode_mk` int(10) NOT NULL,
  `nama_mk` varchar(30) NOT NULL,
  `sks` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tab_matkul`
--

INSERT INTO `tab_matkul` (`kode_mk`, `nama_mk`, `sks`) VALUES
(1223, 'OOP Java 2', 3),
(1224, 'Englis Speaking 2', 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tab_nilai`
--

CREATE TABLE `tab_nilai` (
  `nim` int(10) NOT NULL,
  `kode_mk` int(15) NOT NULL,
  `nilai` int(3) NOT NULL,
  `nilai_hrf` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tab_nilai`
--

INSERT INTO `tab_nilai` (`nim`, `kode_mk`, `nilai`, `nilai_hrf`) VALUES
(1603005, 1223, 100, 'A');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tab_mahasiswa`
--
ALTER TABLE `tab_mahasiswa`
  ADD PRIMARY KEY (`nim`);

--
-- Indexes for table `tab_matkul`
--
ALTER TABLE `tab_matkul`
  ADD PRIMARY KEY (`kode_mk`);

--
-- Indexes for table `tab_nilai`
--
ALTER TABLE `tab_nilai`
  ADD PRIMARY KEY (`nim`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
