create table authority (id varchar(36) not null, authority varchar(255), primary key (id));
create table oauth2client (id bigserial not null, email varchar(255), name varchar(255), primary key (id));
