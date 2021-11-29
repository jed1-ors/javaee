create table student (
    id bigserial primary key,
    first_name varchar not null,
    last_name varchar not null,
    middle_name varchar not null,
    birthday date not null
);

insert into student (first_name, last_name, middle_name, birthday)
values ('Ivan', 'Ivanov', 'Ivanovich', '1991-10-10'),
       ('Dmitrov', 'Kirill', 'Spepanovich', '2001-10-11'),
       ('Mikhail', 'Rodnin', 'Timofeevich', '1992-09-10'),
       ('Timur', 'Alexeevich', 'Bach', '1991-10-09'),
       ('Stepan', 'Dorohin', 'Filipovich', '1991-08-10'),
       ('Alexander', 'Mikhaylov', 'Pavlovich', '1998-10-11'),
       ('Alexei', 'Ivanov', 'Kirilovich', '1999-05-10'),
       ('Ivan', 'Popov', 'Mikhaylovich', '2005-12-05');