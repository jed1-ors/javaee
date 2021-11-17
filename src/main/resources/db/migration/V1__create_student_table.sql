create table student (
    id bigserial primary key,
    first_name varchar not null,
    last_name varchar not null,
    middle_name varchar not null,
    birthday date not null
);