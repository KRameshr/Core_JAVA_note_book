-- Create database
CREATE DATABASE LibraryDB;
GO

USE LibraryDB;
GO

-- Members table
CREATE TABLE members (
    member_id INT PRIMARY KEY,
    member_name VARCHAR(100),
    doj DATE
);

-- Books table
CREATE TABLE books (
    isbn_code VARCHAR(50) PRIMARY KEY,
    book_name VARCHAR(50),
    book_desc VARCHAR(1000),
    author_name VARCHAR(100),
    subject_name VARCHAR(100),
    units_available INT
);

-- Member-Book Record table
CREATE TABLE member_book_record (
    rec_id INT IDENTITY(101,1) PRIMARY KEY,
    member_id INT,
    isbn_code VARCHAR(50),
    doi DATE DEFAULT GETDATE(),
    dor DATE
);

create sequence lib_seq start with 101 increment by 1;



select * from books
select * from members
select * from member_book_record




