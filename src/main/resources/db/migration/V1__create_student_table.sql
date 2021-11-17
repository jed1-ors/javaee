create table student (
    id bigserial primary key,
    first_name varchar not null,
    last_name varchar not null,
    middle_name varchar not null,
    birthday date not null
);

insert into student (first_name, last_name, middle_name, birthday)
values ('Ivan', 'Ivanov', 'Ivanovich', '1991-10-10');