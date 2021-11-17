create table student (
    id bigserial primary key,
    firstName varchar not null,
    lastName varchar not null,
    middleName varchar not null,
    birthday date not null
);