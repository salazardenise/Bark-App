create table BARKS (
    ID serial,
    TIMESTAMP timestamp default current_timestamp,
    USER_NAME varchar(100) NOT NULL,
    BARK_TEXT varchar(500) NOT NULL,
    LOUDNESS integer
);
