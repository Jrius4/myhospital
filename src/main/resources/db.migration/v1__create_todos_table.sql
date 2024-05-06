create table todos (
    id bigint AUTO_INCREMENT primary key,
    name text,
    completed boolean not null default false
);