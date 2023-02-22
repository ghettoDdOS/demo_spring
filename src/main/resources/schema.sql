create table if not exists authors (
    id identity primary key,
    full_name varchar(50) not null,
    email varchar(50) not null,
    created_at timestamp not null
);

create table if not exists blogs (
    id identity primary key,
    title varchar(50) not null,
    content text not null,
    author_id bigint not null,
    created_at timestamp not null
);

alter table blogs
    add foreign key (author_id) references authors(id);