
CREATE TABLE public.candidates
(
    user_id integer NOT NULL,
    first_name character varying(25) NOT NULL,
    last_name character varying(25) NOT NULL,
    identity_number character(11) NOT NULL,
    birth_date date NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public.employees
(
    user_id integer NOT NULL,
    first_name character varying(25) NOT NULL,
    last_name character varying(25) NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public.employer_activation_codes
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    employer_user_id integer NOT NULL,
    activation_code character varying(50) NOT NULL,
    is_confirmed boolean NOT NULL,
    confirmed_date date NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.employers
(
    user_id integer NOT NULL,
    company_name character varying(50) NOT NULL,
    web_adress character varying(50) NOT NULL,
    phone_number character varying(50) NOT NULL,
    is_activated boolean NOT NULL,
    PRIMARY KEY (user_id)
);

CREATE TABLE public.employers_activation_employees
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    employer_user_id integer NOT NULL,
    confirmed_employee_user_id integer NOT NULL,
    confirmed_date date NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.job_titles
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    title character varying(50) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE public.users
(
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 ),
    email character varying(50) NOT NULL,
    password character varying(25) NOT NULL,
    PRIMARY KEY (id)
);

ALTER TABLE public.candidates
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.employees
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.employer_activation_codes
    ADD FOREIGN KEY (employer_user_id)
    REFERENCES public.employers (user_id)
    NOT VALID;


ALTER TABLE public.employers
    ADD FOREIGN KEY (user_id)
    REFERENCES public.users (id)
    NOT VALID;


ALTER TABLE public.employers_activation_employees
    ADD FOREIGN KEY (employer_user_id)
    REFERENCES public.employers (user_id)
    NOT VALID;


ALTER TABLE public.employers_activation_employees
    ADD FOREIGN KEY (confirmed_employee_user_id)
    REFERENCES public.employees (user_id)
    NOT VALID;