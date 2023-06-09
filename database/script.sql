USE [master]
GO
/****** Object:  Database [usuarios]    Script Date: 13/05/2023 11:27:48 p. m. ******/
CREATE DATABASE [usuarios]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'usuarios', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\usuarios.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'usuarios_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL16.SQLEXPRESS\MSSQL\DATA\usuarios_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT, LEDGER = OFF
GO
ALTER DATABASE [usuarios] SET COMPATIBILITY_LEVEL = 160
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [usuarios].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [usuarios] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [usuarios] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [usuarios] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [usuarios] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [usuarios] SET ARITHABORT OFF 
GO
ALTER DATABASE [usuarios] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [usuarios] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [usuarios] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [usuarios] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [usuarios] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [usuarios] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [usuarios] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [usuarios] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [usuarios] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [usuarios] SET  DISABLE_BROKER 
GO
ALTER DATABASE [usuarios] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [usuarios] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [usuarios] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [usuarios] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [usuarios] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [usuarios] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [usuarios] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [usuarios] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [usuarios] SET  MULTI_USER 
GO
ALTER DATABASE [usuarios] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [usuarios] SET DB_CHAINING OFF 
GO
ALTER DATABASE [usuarios] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [usuarios] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [usuarios] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [usuarios] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
ALTER DATABASE [usuarios] SET QUERY_STORE = ON
GO
ALTER DATABASE [usuarios] SET QUERY_STORE (OPERATION_MODE = READ_WRITE, CLEANUP_POLICY = (STALE_QUERY_THRESHOLD_DAYS = 30), DATA_FLUSH_INTERVAL_SECONDS = 900, INTERVAL_LENGTH_MINUTES = 60, MAX_STORAGE_SIZE_MB = 1000, QUERY_CAPTURE_MODE = AUTO, SIZE_BASED_CLEANUP_MODE = AUTO, MAX_PLANS_PER_QUERY = 200, WAIT_STATS_CAPTURE_MODE = ON)
GO
USE [usuarios]
GO
/****** Object:  Table [dbo].[usuario]    Script Date: 13/05/2023 11:27:48 p. m. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[usuario](
	[id] [bigint] IDENTITY(1,1) NOT NULL,
	[apellido] [varchar](255) NULL,
	[email] [varchar](255) NULL,
	[nombre] [varchar](255) NULL,
	[password] [varchar](255) NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[usuario] ON 

INSERT [dbo].[usuario] ([id], [apellido], [email], [nombre], [password]) VALUES (1, N'Valle', N'correo@gmail.com', N'Mauricio', N'$2a$10$76Ti2FNcXK1GEJ.tP47p0uGkt0h1YQ1cwul.791JozNLE9H68bfOm')
INSERT [dbo].[usuario] ([id], [apellido], [email], [nombre], [password]) VALUES (4, N'Torres', N'antonio@gmail.com', N'Antonio', N'$2a$10$tujZV1lCH0jwaFI7H/GGk.GAXADXC40NHEEC9hTPx6/FWPuleusG.')
INSERT [dbo].[usuario] ([id], [apellido], [email], [nombre], [password]) VALUES (5, N'Torres', N'jose@gmail.com', N'Jose', N'$2a$10$nyxuZA9wc9mQiElAx6bom.Lqz5AZM6Ub.6Nk6TDraLoe47UIyVqiO')
INSERT [dbo].[usuario] ([id], [apellido], [email], [nombre], [password]) VALUES (10002, N'Perez', N'misael@gmail.com', N'Misael', N'$2a$10$2GOjd/W9WCFm14sE/rEt6.EYafSyukv8RelPhDbJuAzmuLXZ4OvXO')
SET IDENTITY_INSERT [dbo].[usuario] OFF
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UK5171l57faosmj8myawaucatdw]    Script Date: 13/05/2023 11:27:48 p. m. ******/
ALTER TABLE [dbo].[usuario] ADD  CONSTRAINT [UK5171l57faosmj8myawaucatdw] UNIQUE NONCLUSTERED 
(
	[email] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
USE [master]
GO
ALTER DATABASE [usuarios] SET  READ_WRITE 
GO
