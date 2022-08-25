CREATE TABLE requests
(
    id             serial PRIMARY KEY,
    requester_name VARCHAR(50)    NOT NULL,
    request_date   DATE           NOT NULL,
    plumber_id     INTEGER       NOT NULL,
    status         VARCHAR(50)    NOT NULL
);