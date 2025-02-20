-- Création de la base de données (si nécessaire)
CREATE DATABASE project_maeva;

------------------------------

-- Création de la table des utilisateurs
CREATE SEQUENCE user_id_seq;

CREATE TABLE pm_user (
    id integer NOT NULL DEFAULT nextval('user_id_seq'),
    login character varying(50) NOT NULL,
    password character varying(60) NOT NULL,
    last_name character varying(50) NOT NULL,
    first_name character varying(50) NOT NULL,
    PRIMARY KEY (id)
);

-- Insertion des utilisateurs de dev
INSERT INTO public.pm_user(login, password, last_name, first_name)
VALUES ('admin', '$2a$12$RkcdJn2kLrAS9fmvDv/CWehqID8nB3XBWXOtazhQ2PY1ZFwDB3L76', 'Dyma', 'Admin');

INSERT INTO public.pm_user(login, password, last_name, first_name)
VALUES ('user', '$2a$12$VRnUGZfeEsWHG9jb7NyvQuhpISK65N2LtWyqXAi5t1CBWIQ34uRNa', 'Doe', 'John');

----------------------------------------

-- Création de la table des rôles
CREATE TABLE pm_role (
    name character varying(50) NOT NULL,
    PRIMARY KEY (name)
);

-- Insertion des roles par défauts
INSERT INTO public.pm_role(name)
VALUES ('ROLE_ADMIN');

INSERT INTO public.pm_role(name)
VALUES ('ROLE_USER');

-------------------------------------------

-- Création de la table de liaison user => role

CREATE TABLE pm_user_role
(
    user_id bigint NOT NULL,
    role_name character varying(50) NOT NULL,
    CONSTRAINT user_role_pkey PRIMARY KEY (user_id, role_name),
    CONSTRAINT fk_role_name FOREIGN KEY (role_name)
        REFERENCES public.pm_role (name),
    CONSTRAINT fk_user_id FOREIGN KEY (user_id)
        REFERENCES public.pm_user (id)
);

-- Insertion des différentes liaisons des roles par defauts
INSERT INTO public.pm_user_role(user_id, role_name)
VALUES (1, 'ROLE_ADMIN');

INSERT INTO public.pm_user_role(user_id, role_name)
VALUES (1, 'ROLE_USER');

INSERT INTO public.pm_user_role(user_id, role_name)
VALUES (2, 'ROLE_USER');