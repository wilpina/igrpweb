--
-- PostgreSQL database dump
--

-- Dumped from database version 10.1
-- Dumped by pg_dump version 10.0

-- Started on 2018-01-03 16:16:37

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12278)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2529 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 220 (class 1259 OID 34912)
-- Name: tbl_menu; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_menu (
    id integer NOT NULL,
    descr character varying(255) NOT NULL,
    flg_base integer NOT NULL,
    orderby integer NOT NULL,
    status integer NOT NULL,
    target character varying(255),
    action_fk integer,
    env_fk integer NOT NULL,
    self_fk integer
);


ALTER TABLE tbl_menu OWNER TO postgres;

--
-- TOC entry 245 (class 1259 OID 35302)
-- Name: glb_mv_all_menus; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_mv_all_menus AS
 SELECT a.id,
    a.descr,
    a.descr AS descr_menu,
    a.self_fk,
    a.env_fk,
    a.action_fk,
    a.orderby
   FROM tbl_menu a,
    tbl_menu b
  WHERE ((b.id = a.self_fk) AND (a.self_fk IS NOT NULL));


ALTER TABLE glb_mv_all_menus OWNER TO postgres;

--
-- TOC entry 246 (class 1259 OID 35306)
-- Name: glb_mv_menu; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_mv_menu AS
 SELECT tbl_menu.id,
    tbl_menu.descr,
    tbl_menu.self_fk,
    tbl_menu.env_fk,
    tbl_menu.action_fk,
    tbl_menu.orderby,
    tbl_menu.status,
    tbl_menu.flg_base,
    tbl_menu.target
   FROM tbl_menu;


ALTER TABLE glb_mv_menu OWNER TO postgres;

--
-- TOC entry 224 (class 1259 OID 34934)
-- Name: tbl_profile; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_profile (
    id integer NOT NULL,
    type character varying(255) NOT NULL,
    type_fk integer NOT NULL,
    org_fk integer NOT NULL,
    prof_type_fk integer NOT NULL,
    user_fk integer NOT NULL
);


ALTER TABLE tbl_profile OWNER TO postgres;

--
-- TOC entry 249 (class 1259 OID 35319)
-- Name: glb_mv_profile; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_mv_profile AS
 SELECT tbl_profile.prof_type_fk,
    tbl_profile.user_fk,
    tbl_profile.type,
    tbl_profile.type_fk,
    tbl_profile.org_fk
   FROM tbl_profile;


ALTER TABLE glb_mv_profile OWNER TO postgres;

--
-- TOC entry 226 (class 1259 OID 34942)
-- Name: tbl_profile_type; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_profile_type (
    id integer NOT NULL,
    code character varying(255) NOT NULL,
    descr character varying(255) NOT NULL,
    status integer NOT NULL,
    env_fk integer NOT NULL,
    org_fk integer,
    self_fk integer
);


ALTER TABLE tbl_profile_type OWNER TO postgres;

--
-- TOC entry 250 (class 1259 OID 35323)
-- Name: glb_mv_profile_type; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_mv_profile_type AS
 SELECT tbl_profile_type.id,
    tbl_profile_type.descr,
    tbl_profile_type.code,
    tbl_profile_type.env_fk,
    tbl_profile_type.self_fk,
    tbl_profile_type.status,
    tbl_profile_type.org_fk
   FROM tbl_profile_type;


ALTER TABLE glb_mv_profile_type OWNER TO postgres;

--
-- TOC entry 240 (class 1259 OID 35013)
-- Name: tbl_transaction; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_transaction (
    id integer NOT NULL,
    code character varying(255) NOT NULL,
    descr character varying(255) NOT NULL,
    status integer NOT NULL,
    env_fk integer NOT NULL
);


ALTER TABLE tbl_transaction OWNER TO postgres;

--
-- TOC entry 255 (class 1259 OID 35344)
-- Name: glb_mv_transaction; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_mv_transaction AS
 SELECT tbl_transaction.id,
    tbl_transaction.code,
    tbl_transaction.descr,
    tbl_transaction.env_fk,
    tbl_transaction.status
   FROM tbl_transaction;


ALTER TABLE glb_mv_transaction OWNER TO postgres;

--
-- TOC entry 247 (class 1259 OID 35310)
-- Name: glb_v_menu; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_v_menu AS
 SELECT a.id,
    (((b.descr)::text || ' - '::text) || (a.descr)::text) AS descr,
    a.descr AS descr_menu,
    a.self_fk,
    a.env_fk,
    a.action_fk,
    a.orderby
   FROM glb_mv_menu a,
    glb_mv_menu b
  WHERE ((b.id = a.self_fk) AND (a.self_fk IS NOT NULL));


ALTER TABLE glb_v_menu OWNER TO postgres;

--
-- TOC entry 248 (class 1259 OID 35314)
-- Name: glb_v_org_menu; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_v_org_menu AS
 SELECT a.id,
    (((e.descr)::text || ' - '::text) || (a.descr)::text) AS descr,
    a.orderby,
    a.env_fk,
    a.self_fk,
    b.prof_type_fk,
    b.user_fk,
    'ALL'::text AS prof_code,
    'ALL PROFILE'::text AS prof_name,
    b.org_fk,
    a.flg_base
   FROM tbl_menu a,
    tbl_menu e,
    tbl_profile b
  WHERE ((e.id = a.self_fk) AND (a.self_fk IS NOT NULL) AND (a.id = b.type_fk) AND ((b.type)::text = 'MEN'::text) AND (b.prof_type_fk = 0));


ALTER TABLE glb_v_org_menu OWNER TO postgres;

--
-- TOC entry 251 (class 1259 OID 35327)
-- Name: glb_v_profile; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_v_profile AS
 SELECT b.org_fk,
    b.prof_type_fk,
    b.user_fk,
    b.type,
    b.type_fk,
    d.code AS prof_code,
    d.descr AS prof_name,
    (((d.code)::text || ' - '::text) || (d.descr)::text) AS prof_name_desc,
    d.env_fk,
    d.self_fk
   FROM glb_mv_profile b,
    glb_mv_profile_type d
  WHERE (d.id = b.prof_type_fk);


ALTER TABLE glb_v_profile OWNER TO postgres;

--
-- TOC entry 256 (class 1259 OID 35348)
-- Name: glb_v_profile_trans; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_v_profile_trans AS
 SELECT a.id,
    a.code,
    a.descr,
    a.env_fk,
    b.prof_type_fk,
    b.user_fk,
    b.prof_code,
    b.prof_name,
    b.org_fk
   FROM tbl_transaction a,
    glb_v_profile b
  WHERE ((a.id = b.type_fk) AND ((b.type)::text = 'TRANS'::text));


ALTER TABLE glb_v_profile_trans OWNER TO postgres;

--
-- TOC entry 258 (class 1259 OID 35356)
-- Name: glb_v_org_trans; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_v_org_trans AS
 SELECT glb_v_profile_trans.id,
    glb_v_profile_trans.code,
    glb_v_profile_trans.descr,
    glb_v_profile_trans.env_fk,
    glb_v_profile_trans.prof_type_fk,
    glb_v_profile_trans.user_fk,
    glb_v_profile_trans.prof_code,
    glb_v_profile_trans.prof_name,
    glb_v_profile_trans.org_fk
   FROM glb_v_profile_trans
  WHERE (glb_v_profile_trans.prof_type_fk = 0);


ALTER TABLE glb_v_org_trans OWNER TO postgres;

--
-- TOC entry 252 (class 1259 OID 35331)
-- Name: glb_v_profile_menu; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_v_profile_menu AS
 SELECT a.id,
    e.descr,
    a.descr AS descr_menu,
    a.orderby,
    a.env_fk,
    a.self_fk,
    a.action_fk,
    b.prof_type_fk,
    b.user_fk,
    d.code AS prof_code,
    d.descr AS prof_name,
    b.org_fk,
    a.status,
    a.target,
    d.env_fk AS env_fk_prof_type,
    e.flg_base
   FROM glb_mv_menu a,
    glb_mv_menu e,
    glb_mv_profile b,
    glb_mv_profile_type d
  WHERE ((e.id = a.self_fk) AND (a.self_fk IS NOT NULL) AND (a.id = b.type_fk) AND ((b.type)::text = 'MEN'::text) AND (d.id = b.prof_type_fk));


ALTER TABLE glb_v_profile_menu OWNER TO postgres;

--
-- TOC entry 254 (class 1259 OID 35340)
-- Name: glb_v_prof_menu; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_v_prof_menu AS
 SELECT glb_v_profile_menu.id,
    glb_v_profile_menu.descr,
    glb_v_profile_menu.descr_menu,
    glb_v_profile_menu.orderby,
    glb_v_profile_menu.env_fk,
    glb_v_profile_menu.self_fk,
    glb_v_profile_menu.action_fk,
    glb_v_profile_menu.prof_type_fk,
    glb_v_profile_menu.user_fk,
    glb_v_profile_menu.prof_code,
    glb_v_profile_menu.prof_name,
    glb_v_profile_menu.org_fk,
    glb_v_profile_menu.status,
    glb_v_profile_menu.target,
    glb_v_profile_menu.env_fk_prof_type,
    glb_v_profile_menu.flg_base
   FROM glb_v_profile_menu
  WHERE ((glb_v_profile_menu.prof_type_fk <> 0) AND (glb_v_profile_menu.user_fk = 0));


ALTER TABLE glb_v_prof_menu OWNER TO postgres;

--
-- TOC entry 257 (class 1259 OID 35352)
-- Name: glb_v_prof_trans; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_v_prof_trans AS
 SELECT glb_v_profile_trans.id,
    glb_v_profile_trans.code,
    glb_v_profile_trans.descr,
    glb_v_profile_trans.env_fk,
    glb_v_profile_trans.prof_type_fk,
    glb_v_profile_trans.user_fk,
    glb_v_profile_trans.prof_code,
    glb_v_profile_trans.prof_name,
    glb_v_profile_trans.org_fk
   FROM glb_v_profile_trans
  WHERE ((glb_v_profile_trans.prof_type_fk <> 0) AND (glb_v_profile_trans.user_fk = 0));


ALTER TABLE glb_v_prof_trans OWNER TO postgres;

--
-- TOC entry 253 (class 1259 OID 35336)
-- Name: glb_v_user_menu; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_v_user_menu AS
 SELECT glb_v_profile_menu.id,
    glb_v_profile_menu.descr,
    glb_v_profile_menu.orderby,
    glb_v_profile_menu.env_fk,
    glb_v_profile_menu.self_fk,
    glb_v_profile_menu.prof_type_fk,
    glb_v_profile_menu.user_fk,
    glb_v_profile_menu.prof_code,
    glb_v_profile_menu.prof_name,
    glb_v_profile_menu.org_fk
   FROM glb_v_profile_menu
  WHERE (glb_v_profile_menu.user_fk <> 0);


ALTER TABLE glb_v_user_menu OWNER TO postgres;

--
-- TOC entry 259 (class 1259 OID 35360)
-- Name: glb_v_user_trans; Type: VIEW; Schema: public; Owner: postgres
--

CREATE VIEW glb_v_user_trans AS
 SELECT glb_v_profile_trans.id,
    glb_v_profile_trans.code,
    glb_v_profile_trans.descr,
    glb_v_profile_trans.env_fk,
    glb_v_profile_trans.prof_type_fk,
    glb_v_profile_trans.user_fk,
    glb_v_profile_trans.prof_code,
    glb_v_profile_trans.prof_name,
    glb_v_profile_trans.org_fk
   FROM glb_v_profile_trans
  WHERE (glb_v_profile_trans.user_fk <> 0);


ALTER TABLE glb_v_user_trans OWNER TO postgres;

--
-- TOC entry 197 (class 1259 OID 34786)
-- Name: oauth_access_tokens; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE oauth_access_tokens (
    id integer NOT NULL,
    access_token character varying(255),
    expires character varying(255),
    scope character varying(255),
    client_id character varying(255),
    user_id integer
);


ALTER TABLE oauth_access_tokens OWNER TO postgres;

--
-- TOC entry 196 (class 1259 OID 34784)
-- Name: oauth_access_tokens_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE oauth_access_tokens_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE oauth_access_tokens_id_seq OWNER TO postgres;

--
-- TOC entry 2530 (class 0 OID 0)
-- Dependencies: 196
-- Name: oauth_access_tokens_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE oauth_access_tokens_id_seq OWNED BY oauth_access_tokens.id;


--
-- TOC entry 199 (class 1259 OID 34797)
-- Name: oauth_authorization_code; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE oauth_authorization_code (
    id integer NOT NULL,
    authorization_code character varying(255),
    expires character varying(255),
    id_token character varying(255),
    redirect_uri character varying(255),
    scope character varying(255),
    client_id character varying(255),
    user_id integer
);


ALTER TABLE oauth_authorization_code OWNER TO postgres;

--
-- TOC entry 198 (class 1259 OID 34795)
-- Name: oauth_authorization_code_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE oauth_authorization_code_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE oauth_authorization_code_id_seq OWNER TO postgres;

--
-- TOC entry 2531 (class 0 OID 0)
-- Dependencies: 198
-- Name: oauth_authorization_code_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE oauth_authorization_code_id_seq OWNED BY oauth_authorization_code.id;


--
-- TOC entry 201 (class 1259 OID 34808)
-- Name: oauth_clients; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE oauth_clients (
    id integer NOT NULL,
    client_id character varying(255),
    client_secret character varying(255),
    grant_types character varying(255),
    redirect_uri character varying(255),
    scope character varying(255),
    user_id integer
);


ALTER TABLE oauth_clients OWNER TO postgres;

--
-- TOC entry 200 (class 1259 OID 34806)
-- Name: oauth_clients_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE oauth_clients_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE oauth_clients_id_seq OWNER TO postgres;

--
-- TOC entry 2532 (class 0 OID 0)
-- Dependencies: 200
-- Name: oauth_clients_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE oauth_clients_id_seq OWNED BY oauth_clients.id;


--
-- TOC entry 203 (class 1259 OID 34819)
-- Name: oauth_refresh_tokens; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE oauth_refresh_tokens (
    id integer NOT NULL,
    expires character varying(255),
    refresh_token character varying(255),
    scope character varying(255),
    client_id character varying(255),
    user_id integer
);


ALTER TABLE oauth_refresh_tokens OWNER TO postgres;

--
-- TOC entry 202 (class 1259 OID 34817)
-- Name: oauth_refresh_tokens_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE oauth_refresh_tokens_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE oauth_refresh_tokens_id_seq OWNER TO postgres;

--
-- TOC entry 2533 (class 0 OID 0)
-- Dependencies: 202
-- Name: oauth_refresh_tokens_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE oauth_refresh_tokens_id_seq OWNED BY oauth_refresh_tokens.id;


--
-- TOC entry 204 (class 1259 OID 34828)
-- Name: oauth_scopes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE oauth_scopes (
    scope character varying(255) NOT NULL,
    is_default integer NOT NULL
);


ALTER TABLE oauth_scopes OWNER TO postgres;

--
-- TOC entry 206 (class 1259 OID 34835)
-- Name: tbl_action; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_action (
    id integer NOT NULL,
    action character varying(255) NOT NULL,
    action_descr character varying(255),
    package_name character varying(255),
    page character varying(255) NOT NULL,
    page_descr character varying(255),
    status integer NOT NULL,
    version character varying(255),
    xsl_src character varying(255),
    env_fk integer NOT NULL,
    crud_fk integer
);


ALTER TABLE tbl_action OWNER TO postgres;

--
-- TOC entry 205 (class 1259 OID 34833)
-- Name: tbl_action_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_action_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_action_id_seq OWNER TO postgres;

--
-- TOC entry 2534 (class 0 OID 0)
-- Dependencies: 205
-- Name: tbl_action_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_action_id_seq OWNED BY tbl_action.id;


--
-- TOC entry 208 (class 1259 OID 34846)
-- Name: tbl_clob; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_clob (
    id integer NOT NULL,
    c_lob_content text NOT NULL,
    dt_created date NOT NULL,
    mime_type character varying(255),
    name character varying(255)
);


ALTER TABLE tbl_clob OWNER TO postgres;

--
-- TOC entry 207 (class 1259 OID 34844)
-- Name: tbl_clob_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_clob_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_clob_id_seq OWNER TO postgres;

--
-- TOC entry 2535 (class 0 OID 0)
-- Dependencies: 207
-- Name: tbl_clob_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_clob_id_seq OWNED BY tbl_clob.id;


--
-- TOC entry 210 (class 1259 OID 34857)
-- Name: tbl_config; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_config (
    id integer NOT NULL,
    name character varying(255) NOT NULL,
    value character varying(255) NOT NULL
);


ALTER TABLE tbl_config OWNER TO postgres;

--
-- TOC entry 212 (class 1259 OID 34868)
-- Name: tbl_config_env; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_config_env (
    id integer NOT NULL,
    charset character varying(255) NOT NULL,
    host character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    name_db character varying(255) NOT NULL,
    password character varying(255) NOT NULL,
    port character varying(255) NOT NULL,
    type_db character varying(255) NOT NULL,
    username character varying(255) NOT NULL,
    env_fk integer NOT NULL
);


ALTER TABLE tbl_config_env OWNER TO postgres;

--
-- TOC entry 211 (class 1259 OID 34866)
-- Name: tbl_config_env_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_config_env_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_config_env_id_seq OWNER TO postgres;

--
-- TOC entry 2536 (class 0 OID 0)
-- Dependencies: 211
-- Name: tbl_config_env_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_config_env_id_seq OWNED BY tbl_config_env.id;


--
-- TOC entry 209 (class 1259 OID 34855)
-- Name: tbl_config_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_config_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_config_id_seq OWNER TO postgres;

--
-- TOC entry 2537 (class 0 OID 0)
-- Dependencies: 209
-- Name: tbl_config_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_config_id_seq OWNED BY tbl_config.id;


--
-- TOC entry 214 (class 1259 OID 34879)
-- Name: tbl_crud; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_crud (
    id integer NOT NULL,
    schemaname character varying(255) NOT NULL,
    tablename character varying(255) NOT NULL,
    config_env_fk integer
);


ALTER TABLE tbl_crud OWNER TO postgres;

--
-- TOC entry 213 (class 1259 OID 34877)
-- Name: tbl_crud_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_crud_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_crud_id_seq OWNER TO postgres;

--
-- TOC entry 2538 (class 0 OID 0)
-- Dependencies: 213
-- Name: tbl_crud_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_crud_id_seq OWNED BY tbl_crud.id;


--
-- TOC entry 216 (class 1259 OID 34890)
-- Name: tbl_env; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_env (
    id integer NOT NULL,
    dad character varying(255) NOT NULL,
    description character varying(255),
    external integer NOT NULL,
    img_src character varying(255),
    name character varying(255) NOT NULL,
    status integer NOT NULL,
    template character varying(255),
    url character varying(255),
    action_fk integer
);


ALTER TABLE tbl_env OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 34888)
-- Name: tbl_env_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_env_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_env_id_seq OWNER TO postgres;

--
-- TOC entry 2539 (class 0 OID 0)
-- Dependencies: 215
-- Name: tbl_env_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_env_id_seq OWNED BY tbl_env.id;


--
-- TOC entry 218 (class 1259 OID 34901)
-- Name: tbl_importexport; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_importexport (
    id integer NOT NULL,
    aplicacao character varying(255),
    data character varying(255),
    tipo character varying(255),
    usuario character varying(255)
);


ALTER TABLE tbl_importexport OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 34899)
-- Name: tbl_importexport_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_importexport_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_importexport_id_seq OWNER TO postgres;

--
-- TOC entry 2540 (class 0 OID 0)
-- Dependencies: 217
-- Name: tbl_importexport_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_importexport_id_seq OWNED BY tbl_importexport.id;


--
-- TOC entry 219 (class 1259 OID 34910)
-- Name: tbl_menu_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_menu_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_menu_id_seq OWNER TO postgres;

--
-- TOC entry 2541 (class 0 OID 0)
-- Dependencies: 219
-- Name: tbl_menu_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_menu_id_seq OWNED BY tbl_menu.id;


--
-- TOC entry 222 (class 1259 OID 34923)
-- Name: tbl_organization; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_organization (
    id integer NOT NULL,
    code character varying(255) NOT NULL,
    name character varying(255) NOT NULL,
    status integer NOT NULL,
    env_fk integer NOT NULL,
    self_fk integer,
    user_created_fk integer NOT NULL
);


ALTER TABLE tbl_organization OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 34921)
-- Name: tbl_organization_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_organization_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_organization_id_seq OWNER TO postgres;

--
-- TOC entry 2542 (class 0 OID 0)
-- Dependencies: 221
-- Name: tbl_organization_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_organization_id_seq OWNED BY tbl_organization.id;


--
-- TOC entry 223 (class 1259 OID 34932)
-- Name: tbl_profile_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_profile_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_profile_id_seq OWNER TO postgres;

--
-- TOC entry 2543 (class 0 OID 0)
-- Dependencies: 223
-- Name: tbl_profile_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_profile_id_seq OWNED BY tbl_profile.id;


--
-- TOC entry 225 (class 1259 OID 34940)
-- Name: tbl_profile_type_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_profile_type_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_profile_type_id_seq OWNER TO postgres;

--
-- TOC entry 2544 (class 0 OID 0)
-- Dependencies: 225
-- Name: tbl_profile_type_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_profile_type_id_seq OWNED BY tbl_profile_type.id;


--
-- TOC entry 228 (class 1259 OID 34953)
-- Name: tbl_rep_instance; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_rep_instance (
    id integer NOT NULL,
    contra_prova character varying(255) NOT NULL,
    dt_created date NOT NULL,
    ref_fk integer NOT NULL,
    reference character varying(255),
    env_fk integer NOT NULL,
    rep_template_fk integer,
    user_fk integer,
    xml_content_fk integer NOT NULL,
    xsl_content_fk integer NOT NULL
);


ALTER TABLE tbl_rep_instance OWNER TO postgres;

--
-- TOC entry 227 (class 1259 OID 34951)
-- Name: tbl_rep_instance_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_rep_instance_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_rep_instance_id_seq OWNER TO postgres;

--
-- TOC entry 2545 (class 0 OID 0)
-- Dependencies: 227
-- Name: tbl_rep_instance_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_rep_instance_id_seq OWNED BY tbl_rep_instance.id;


--
-- TOC entry 230 (class 1259 OID 34964)
-- Name: tbl_rep_source; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_rep_source (
    id integer NOT NULL,
    dt_created date,
    dt_updated date,
    name character varying(255),
    status integer NOT NULL,
    type character varying(255) NOT NULL,
    type_fk integer,
    type_name character varying(255),
    type_query character varying(255),
    env_fk integer NOT NULL,
    env_source_fk integer,
    config_env_fk integer NOT NULL,
    user_created_fk integer NOT NULL,
    user_updated_fk integer NOT NULL
);


ALTER TABLE tbl_rep_source OWNER TO postgres;

--
-- TOC entry 229 (class 1259 OID 34962)
-- Name: tbl_rep_source_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_rep_source_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_rep_source_id_seq OWNER TO postgres;

--
-- TOC entry 2546 (class 0 OID 0)
-- Dependencies: 229
-- Name: tbl_rep_source_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_rep_source_id_seq OWNED BY tbl_rep_source.id;


--
-- TOC entry 232 (class 1259 OID 34975)
-- Name: tbl_rep_template; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_rep_template (
    id integer NOT NULL,
    code character varying(255),
    dt_created date,
    dt_updated date,
    name character varying(255) NOT NULL,
    status integer NOT NULL,
    env_fk integer NOT NULL,
    user_created_fk integer NOT NULL,
    user_updated_fk integer NOT NULL,
    xml_content_fk integer NOT NULL,
    xsl_content_fk integer NOT NULL
);


ALTER TABLE tbl_rep_template OWNER TO postgres;

--
-- TOC entry 231 (class 1259 OID 34973)
-- Name: tbl_rep_template_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_rep_template_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_rep_template_id_seq OWNER TO postgres;

--
-- TOC entry 2547 (class 0 OID 0)
-- Dependencies: 231
-- Name: tbl_rep_template_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_rep_template_id_seq OWNED BY tbl_rep_template.id;


--
-- TOC entry 234 (class 1259 OID 34986)
-- Name: tbl_rep_template_param; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_rep_template_param (
    id integer NOT NULL,
    parameter character varying(255) NOT NULL,
    rep_template_fk integer NOT NULL
);


ALTER TABLE tbl_rep_template_param OWNER TO postgres;

--
-- TOC entry 233 (class 1259 OID 34984)
-- Name: tbl_rep_template_param_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_rep_template_param_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_rep_template_param_id_seq OWNER TO postgres;

--
-- TOC entry 2548 (class 0 OID 0)
-- Dependencies: 233
-- Name: tbl_rep_template_param_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_rep_template_param_id_seq OWNED BY tbl_rep_template_param.id;


--
-- TOC entry 236 (class 1259 OID 34994)
-- Name: tbl_rep_template_source; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_rep_template_source (
    id integer NOT NULL,
    rep_source_fk integer NOT NULL,
    rep_template_fk integer NOT NULL
);


ALTER TABLE tbl_rep_template_source OWNER TO postgres;

--
-- TOC entry 235 (class 1259 OID 34992)
-- Name: tbl_rep_template_source_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_rep_template_source_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_rep_template_source_id_seq OWNER TO postgres;

--
-- TOC entry 2549 (class 0 OID 0)
-- Dependencies: 235
-- Name: tbl_rep_template_source_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_rep_template_source_id_seq OWNED BY tbl_rep_template_source.id;


--
-- TOC entry 238 (class 1259 OID 35002)
-- Name: tbl_session; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_session (
    id integer NOT NULL,
    endtime bigint,
    host character varying(255),
    hostname character varying(255),
    https integer NOT NULL,
    ipaddress character varying(255),
    mediatype character varying(255),
    sessionid character varying(255),
    sessionoldid character varying(255),
    starttime bigint,
    target character varying(255),
    username character varying(255),
    env_fk integer NOT NULL,
    org_fk integer,
    prof_type_fk integer NOT NULL,
    user_fk integer
);


ALTER TABLE tbl_session OWNER TO postgres;

--
-- TOC entry 237 (class 1259 OID 35000)
-- Name: tbl_session_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_session_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_session_id_seq OWNER TO postgres;

--
-- TOC entry 2550 (class 0 OID 0)
-- Dependencies: 237
-- Name: tbl_session_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_session_id_seq OWNED BY tbl_session.id;


--
-- TOC entry 239 (class 1259 OID 35011)
-- Name: tbl_transaction_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_transaction_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_transaction_id_seq OWNER TO postgres;

--
-- TOC entry 2551 (class 0 OID 0)
-- Dependencies: 239
-- Name: tbl_transaction_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_transaction_id_seq OWNED BY tbl_transaction.id;


--
-- TOC entry 242 (class 1259 OID 35024)
-- Name: tbl_user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_user (
    id integer NOT NULL,
    activation_key character varying(255) NOT NULL,
    auth_key character varying(255),
    created_at bigint NOT NULL,
    email character varying(255),
    mobile character varying(255),
    name character varying(255),
    pass_hash character varying(255),
    password_reset_token character varying(255),
    phone character varying(255),
    photo_id character varying(255),
    remarks character varying(255),
    signature_id character varying(255),
    status integer NOT NULL,
    updated_at bigint NOT NULL,
    userprofile character varying(255),
    user_name character varying(255),
    valid_until character varying(255)
);


ALTER TABLE tbl_user OWNER TO postgres;

--
-- TOC entry 241 (class 1259 OID 35022)
-- Name: tbl_user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_user_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_user_id_seq OWNER TO postgres;

--
-- TOC entry 2552 (class 0 OID 0)
-- Dependencies: 241
-- Name: tbl_user_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_user_id_seq OWNED BY tbl_user.id;


--
-- TOC entry 244 (class 1259 OID 35035)
-- Name: tbl_user_roles; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE tbl_user_roles (
    id integer NOT NULL,
    role_name character varying(255),
    user_name character varying(255)
);


ALTER TABLE tbl_user_roles OWNER TO postgres;

--
-- TOC entry 243 (class 1259 OID 35033)
-- Name: tbl_user_roles_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE tbl_user_roles_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE tbl_user_roles_id_seq OWNER TO postgres;

--
-- TOC entry 2553 (class 0 OID 0)
-- Dependencies: 243
-- Name: tbl_user_roles_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE tbl_user_roles_id_seq OWNED BY tbl_user_roles.id;


--
-- TOC entry 2247 (class 2604 OID 34789)
-- Name: oauth_access_tokens id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_access_tokens ALTER COLUMN id SET DEFAULT nextval('oauth_access_tokens_id_seq'::regclass);


--
-- TOC entry 2248 (class 2604 OID 34800)
-- Name: oauth_authorization_code id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_authorization_code ALTER COLUMN id SET DEFAULT nextval('oauth_authorization_code_id_seq'::regclass);


--
-- TOC entry 2249 (class 2604 OID 34811)
-- Name: oauth_clients id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_clients ALTER COLUMN id SET DEFAULT nextval('oauth_clients_id_seq'::regclass);


--
-- TOC entry 2250 (class 2604 OID 34822)
-- Name: oauth_refresh_tokens id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_refresh_tokens ALTER COLUMN id SET DEFAULT nextval('oauth_refresh_tokens_id_seq'::regclass);


--
-- TOC entry 2251 (class 2604 OID 34838)
-- Name: tbl_action id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_action ALTER COLUMN id SET DEFAULT nextval('tbl_action_id_seq'::regclass);


--
-- TOC entry 2252 (class 2604 OID 34849)
-- Name: tbl_clob id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_clob ALTER COLUMN id SET DEFAULT nextval('tbl_clob_id_seq'::regclass);


--
-- TOC entry 2253 (class 2604 OID 34860)
-- Name: tbl_config id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_config ALTER COLUMN id SET DEFAULT nextval('tbl_config_id_seq'::regclass);


--
-- TOC entry 2254 (class 2604 OID 34871)
-- Name: tbl_config_env id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_config_env ALTER COLUMN id SET DEFAULT nextval('tbl_config_env_id_seq'::regclass);


--
-- TOC entry 2255 (class 2604 OID 34882)
-- Name: tbl_crud id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_crud ALTER COLUMN id SET DEFAULT nextval('tbl_crud_id_seq'::regclass);


--
-- TOC entry 2256 (class 2604 OID 34893)
-- Name: tbl_env id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_env ALTER COLUMN id SET DEFAULT nextval('tbl_env_id_seq'::regclass);


--
-- TOC entry 2257 (class 2604 OID 34904)
-- Name: tbl_importexport id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_importexport ALTER COLUMN id SET DEFAULT nextval('tbl_importexport_id_seq'::regclass);


--
-- TOC entry 2258 (class 2604 OID 34915)
-- Name: tbl_menu id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_menu ALTER COLUMN id SET DEFAULT nextval('tbl_menu_id_seq'::regclass);


--
-- TOC entry 2259 (class 2604 OID 34926)
-- Name: tbl_organization id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_organization ALTER COLUMN id SET DEFAULT nextval('tbl_organization_id_seq'::regclass);


--
-- TOC entry 2260 (class 2604 OID 34937)
-- Name: tbl_profile id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_profile ALTER COLUMN id SET DEFAULT nextval('tbl_profile_id_seq'::regclass);


--
-- TOC entry 2261 (class 2604 OID 34945)
-- Name: tbl_profile_type id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_profile_type ALTER COLUMN id SET DEFAULT nextval('tbl_profile_type_id_seq'::regclass);


--
-- TOC entry 2262 (class 2604 OID 34956)
-- Name: tbl_rep_instance id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_instance ALTER COLUMN id SET DEFAULT nextval('tbl_rep_instance_id_seq'::regclass);


--
-- TOC entry 2263 (class 2604 OID 34967)
-- Name: tbl_rep_source id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_source ALTER COLUMN id SET DEFAULT nextval('tbl_rep_source_id_seq'::regclass);


--
-- TOC entry 2264 (class 2604 OID 34978)
-- Name: tbl_rep_template id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template ALTER COLUMN id SET DEFAULT nextval('tbl_rep_template_id_seq'::regclass);


--
-- TOC entry 2265 (class 2604 OID 34989)
-- Name: tbl_rep_template_param id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template_param ALTER COLUMN id SET DEFAULT nextval('tbl_rep_template_param_id_seq'::regclass);


--
-- TOC entry 2266 (class 2604 OID 34997)
-- Name: tbl_rep_template_source id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template_source ALTER COLUMN id SET DEFAULT nextval('tbl_rep_template_source_id_seq'::regclass);


--
-- TOC entry 2267 (class 2604 OID 35005)
-- Name: tbl_session id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_session ALTER COLUMN id SET DEFAULT nextval('tbl_session_id_seq'::regclass);


--
-- TOC entry 2268 (class 2604 OID 35016)
-- Name: tbl_transaction id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_transaction ALTER COLUMN id SET DEFAULT nextval('tbl_transaction_id_seq'::regclass);


--
-- TOC entry 2269 (class 2604 OID 35027)
-- Name: tbl_user id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_user ALTER COLUMN id SET DEFAULT nextval('tbl_user_id_seq'::regclass);


--
-- TOC entry 2270 (class 2604 OID 35038)
-- Name: tbl_user_roles id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_user_roles ALTER COLUMN id SET DEFAULT nextval('tbl_user_roles_id_seq'::regclass);


--
-- TOC entry 2272 (class 2606 OID 34794)
-- Name: oauth_access_tokens oauth_access_tokens_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_access_tokens
    ADD CONSTRAINT oauth_access_tokens_pkey PRIMARY KEY (id);


--
-- TOC entry 2274 (class 2606 OID 34805)
-- Name: oauth_authorization_code oauth_authorization_code_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_authorization_code
    ADD CONSTRAINT oauth_authorization_code_pkey PRIMARY KEY (id);


--
-- TOC entry 2276 (class 2606 OID 34816)
-- Name: oauth_clients oauth_clients_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_clients
    ADD CONSTRAINT oauth_clients_pkey PRIMARY KEY (id);


--
-- TOC entry 2280 (class 2606 OID 34827)
-- Name: oauth_refresh_tokens oauth_refresh_tokens_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_refresh_tokens
    ADD CONSTRAINT oauth_refresh_tokens_pkey PRIMARY KEY (id);


--
-- TOC entry 2282 (class 2606 OID 34832)
-- Name: oauth_scopes oauth_scopes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_scopes
    ADD CONSTRAINT oauth_scopes_pkey PRIMARY KEY (scope);


--
-- TOC entry 2310 (class 2606 OID 35055)
-- Name: tbl_profile profile_unique_fk; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_profile
    ADD CONSTRAINT profile_unique_fk UNIQUE (type, type_fk, user_fk, org_fk, prof_type_fk);


--
-- TOC entry 2284 (class 2606 OID 34843)
-- Name: tbl_action tbl_action_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_action
    ADD CONSTRAINT tbl_action_pkey PRIMARY KEY (id);


--
-- TOC entry 2286 (class 2606 OID 34854)
-- Name: tbl_clob tbl_clob_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_clob
    ADD CONSTRAINT tbl_clob_pkey PRIMARY KEY (id);


--
-- TOC entry 2292 (class 2606 OID 34876)
-- Name: tbl_config_env tbl_config_env_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_config_env
    ADD CONSTRAINT tbl_config_env_pkey PRIMARY KEY (id);


--
-- TOC entry 2288 (class 2606 OID 34865)
-- Name: tbl_config tbl_config_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_config
    ADD CONSTRAINT tbl_config_pkey PRIMARY KEY (id);


--
-- TOC entry 2296 (class 2606 OID 34887)
-- Name: tbl_crud tbl_crud_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_crud
    ADD CONSTRAINT tbl_crud_pkey PRIMARY KEY (id);


--
-- TOC entry 2298 (class 2606 OID 34898)
-- Name: tbl_env tbl_env_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_env
    ADD CONSTRAINT tbl_env_pkey PRIMARY KEY (id);


--
-- TOC entry 2302 (class 2606 OID 34909)
-- Name: tbl_importexport tbl_importexport_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_importexport
    ADD CONSTRAINT tbl_importexport_pkey PRIMARY KEY (id);


--
-- TOC entry 2304 (class 2606 OID 34920)
-- Name: tbl_menu tbl_menu_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_menu
    ADD CONSTRAINT tbl_menu_pkey PRIMARY KEY (id);


--
-- TOC entry 2306 (class 2606 OID 34931)
-- Name: tbl_organization tbl_organization_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_organization
    ADD CONSTRAINT tbl_organization_pkey PRIMARY KEY (id);


--
-- TOC entry 2312 (class 2606 OID 34939)
-- Name: tbl_profile tbl_profile_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_profile
    ADD CONSTRAINT tbl_profile_pkey PRIMARY KEY (id);


--
-- TOC entry 2314 (class 2606 OID 34950)
-- Name: tbl_profile_type tbl_profile_type_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_profile_type
    ADD CONSTRAINT tbl_profile_type_pkey PRIMARY KEY (id);


--
-- TOC entry 2318 (class 2606 OID 34961)
-- Name: tbl_rep_instance tbl_rep_instance_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_instance
    ADD CONSTRAINT tbl_rep_instance_pkey PRIMARY KEY (id);


--
-- TOC entry 2320 (class 2606 OID 34972)
-- Name: tbl_rep_source tbl_rep_source_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_source
    ADD CONSTRAINT tbl_rep_source_pkey PRIMARY KEY (id);


--
-- TOC entry 2324 (class 2606 OID 34991)
-- Name: tbl_rep_template_param tbl_rep_template_param_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template_param
    ADD CONSTRAINT tbl_rep_template_param_pkey PRIMARY KEY (id);


--
-- TOC entry 2322 (class 2606 OID 34983)
-- Name: tbl_rep_template tbl_rep_template_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template
    ADD CONSTRAINT tbl_rep_template_pkey PRIMARY KEY (id);


--
-- TOC entry 2326 (class 2606 OID 34999)
-- Name: tbl_rep_template_source tbl_rep_template_source_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template_source
    ADD CONSTRAINT tbl_rep_template_source_pkey PRIMARY KEY (id);


--
-- TOC entry 2328 (class 2606 OID 35010)
-- Name: tbl_session tbl_session_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_session
    ADD CONSTRAINT tbl_session_pkey PRIMARY KEY (id);


--
-- TOC entry 2330 (class 2606 OID 35021)
-- Name: tbl_transaction tbl_transaction_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_transaction
    ADD CONSTRAINT tbl_transaction_pkey PRIMARY KEY (id);


--
-- TOC entry 2332 (class 2606 OID 35032)
-- Name: tbl_user tbl_user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_user
    ADD CONSTRAINT tbl_user_pkey PRIMARY KEY (id);


--
-- TOC entry 2338 (class 2606 OID 35043)
-- Name: tbl_user_roles tbl_user_roles_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_user_roles
    ADD CONSTRAINT tbl_user_roles_pkey PRIMARY KEY (id);


--
-- TOC entry 2290 (class 2606 OID 35047)
-- Name: tbl_config uk_12mhj0s9yhg2vyn29mhl8j8uy; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_config
    ADD CONSTRAINT uk_12mhj0s9yhg2vyn29mhl8j8uy UNIQUE (name);


--
-- TOC entry 2308 (class 2606 OID 35053)
-- Name: tbl_organization uk_2nguyayav3wm6yj1j093rgbeu; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_organization
    ADD CONSTRAINT uk_2nguyayav3wm6yj1j093rgbeu UNIQUE (code);


--
-- TOC entry 2334 (class 2606 OID 35059)
-- Name: tbl_user uk_6jr81l5qqpxjp72fgi23ubqc9; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_user
    ADD CONSTRAINT uk_6jr81l5qqpxjp72fgi23ubqc9 UNIQUE (user_name);


--
-- TOC entry 2300 (class 2606 OID 35051)
-- Name: tbl_env uk_6m6wu64xn2k5pu1jt30h6r13y; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_env
    ADD CONSTRAINT uk_6m6wu64xn2k5pu1jt30h6r13y UNIQUE (dad);


--
-- TOC entry 2278 (class 2606 OID 35045)
-- Name: oauth_clients uk_aaedvpdimcfvgse9vihrb7n7l; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_clients
    ADD CONSTRAINT uk_aaedvpdimcfvgse9vihrb7n7l UNIQUE (client_id);


--
-- TOC entry 2294 (class 2606 OID 35049)
-- Name: tbl_config_env uk_k03g21l24a7olmvdh2gi0vlre; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_config_env
    ADD CONSTRAINT uk_k03g21l24a7olmvdh2gi0vlre UNIQUE (name);


--
-- TOC entry 2336 (class 2606 OID 35061)
-- Name: tbl_user uk_npn1wf1yu1g5rjohbek375pp1; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_user
    ADD CONSTRAINT uk_npn1wf1yu1g5rjohbek375pp1 UNIQUE (email);


--
-- TOC entry 2316 (class 2606 OID 35057)
-- Name: tbl_profile_type uk_psnluqoofbs9nxjw813kte4d1; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_profile_type
    ADD CONSTRAINT uk_psnluqoofbs9nxjw813kte4d1 UNIQUE (code);


--
-- TOC entry 2346 (class 2606 OID 35097)
-- Name: tbl_action action_env_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_action
    ADD CONSTRAINT action_env_fk FOREIGN KEY (env_fk) REFERENCES tbl_env(id);


--
-- TOC entry 2348 (class 2606 OID 35107)
-- Name: tbl_config_env config_env_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_config_env
    ADD CONSTRAINT config_env_fk FOREIGN KEY (env_fk) REFERENCES tbl_env(id);


--
-- TOC entry 2347 (class 2606 OID 35102)
-- Name: tbl_action crud_action_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_action
    ADD CONSTRAINT crud_action_fk FOREIGN KEY (crud_fk) REFERENCES tbl_crud(id);


--
-- TOC entry 2349 (class 2606 OID 35112)
-- Name: tbl_crud crud_config_env_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_crud
    ADD CONSTRAINT crud_config_env_fk FOREIGN KEY (config_env_fk) REFERENCES tbl_config_env(id);


--
-- TOC entry 2370 (class 2606 OID 35217)
-- Name: tbl_rep_source crud_rep_source_env_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_source
    ADD CONSTRAINT crud_rep_source_env_fk FOREIGN KEY (config_env_fk) REFERENCES tbl_config_env(id);


--
-- TOC entry 2350 (class 2606 OID 35117)
-- Name: tbl_env env_action_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_env
    ADD CONSTRAINT env_action_fk FOREIGN KEY (action_fk) REFERENCES tbl_action(id);


--
-- TOC entry 2386 (class 2606 OID 35297)
-- Name: tbl_user_roles fk24464ljqytx4ttc1730m3yc94; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_user_roles
    ADD CONSTRAINT fk24464ljqytx4ttc1730m3yc94 FOREIGN KEY (user_name) REFERENCES tbl_user(user_name);


--
-- TOC entry 2340 (class 2606 OID 35067)
-- Name: oauth_access_tokens fk4yw6n1qshyisv2ock24ni076x; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_access_tokens
    ADD CONSTRAINT fk4yw6n1qshyisv2ock24ni076x FOREIGN KEY (user_id) REFERENCES tbl_user(id);


--
-- TOC entry 2343 (class 2606 OID 35082)
-- Name: oauth_clients fk6s7i48liyxhx9ncs6kyg3qinv; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_clients
    ADD CONSTRAINT fk6s7i48liyxhx9ncs6kyg3qinv FOREIGN KEY (user_id) REFERENCES tbl_user(id);


--
-- TOC entry 2344 (class 2606 OID 35087)
-- Name: oauth_refresh_tokens fkdk8ipa642us0a3jd96vd8mkld; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_refresh_tokens
    ADD CONSTRAINT fkdk8ipa642us0a3jd96vd8mkld FOREIGN KEY (client_id) REFERENCES oauth_clients(client_id);


--
-- TOC entry 2345 (class 2606 OID 35092)
-- Name: oauth_refresh_tokens fkfxmi5t5489yjy97gjbfmyyuwg; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_refresh_tokens
    ADD CONSTRAINT fkfxmi5t5489yjy97gjbfmyyuwg FOREIGN KEY (user_id) REFERENCES tbl_user(id);


--
-- TOC entry 2342 (class 2606 OID 35077)
-- Name: oauth_authorization_code fkjpg55r2961gc28jgso03965cw; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_authorization_code
    ADD CONSTRAINT fkjpg55r2961gc28jgso03965cw FOREIGN KEY (user_id) REFERENCES tbl_user(id);


--
-- TOC entry 2341 (class 2606 OID 35072)
-- Name: oauth_authorization_code fklyvv1l8x3homnf5inauihi2i9; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_authorization_code
    ADD CONSTRAINT fklyvv1l8x3homnf5inauihi2i9 FOREIGN KEY (client_id) REFERENCES oauth_clients(client_id);


--
-- TOC entry 2339 (class 2606 OID 35062)
-- Name: oauth_access_tokens fktk9v507ekq8e6gn4895ixewut; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY oauth_access_tokens
    ADD CONSTRAINT fktk9v507ekq8e6gn4895ixewut FOREIGN KEY (client_id) REFERENCES oauth_clients(client_id);


--
-- TOC entry 2351 (class 2606 OID 35122)
-- Name: tbl_menu menu_action_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_menu
    ADD CONSTRAINT menu_action_fk FOREIGN KEY (action_fk) REFERENCES tbl_action(id);


--
-- TOC entry 2352 (class 2606 OID 35127)
-- Name: tbl_menu menu_env_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_menu
    ADD CONSTRAINT menu_env_fk FOREIGN KEY (env_fk) REFERENCES tbl_env(id);


--
-- TOC entry 2353 (class 2606 OID 35132)
-- Name: tbl_menu menu_self_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_menu
    ADD CONSTRAINT menu_self_fk FOREIGN KEY (self_fk) REFERENCES tbl_menu(id);


--
-- TOC entry 2354 (class 2606 OID 35137)
-- Name: tbl_organization organization_env_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_organization
    ADD CONSTRAINT organization_env_fk FOREIGN KEY (env_fk) REFERENCES tbl_env(id);


--
-- TOC entry 2355 (class 2606 OID 35142)
-- Name: tbl_organization organization_self_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_organization
    ADD CONSTRAINT organization_self_fk FOREIGN KEY (self_fk) REFERENCES tbl_organization(id);


--
-- TOC entry 2356 (class 2606 OID 35147)
-- Name: tbl_organization organization_user_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_organization
    ADD CONSTRAINT organization_user_fk FOREIGN KEY (user_created_fk) REFERENCES tbl_user(id);


--
-- TOC entry 2357 (class 2606 OID 35152)
-- Name: tbl_profile profile_organization_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_profile
    ADD CONSTRAINT profile_organization_fk FOREIGN KEY (org_fk) REFERENCES tbl_organization(id);


--
-- TOC entry 2358 (class 2606 OID 35157)
-- Name: tbl_profile profile_prof_type_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_profile
    ADD CONSTRAINT profile_prof_type_fk FOREIGN KEY (prof_type_fk) REFERENCES tbl_profile_type(id);


--
-- TOC entry 2360 (class 2606 OID 35167)
-- Name: tbl_profile_type profile_type_env_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_profile_type
    ADD CONSTRAINT profile_type_env_fk FOREIGN KEY (env_fk) REFERENCES tbl_env(id);


--
-- TOC entry 2361 (class 2606 OID 35172)
-- Name: tbl_profile_type profile_type_org_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_profile_type
    ADD CONSTRAINT profile_type_org_fk FOREIGN KEY (org_fk) REFERENCES tbl_organization(id);


--
-- TOC entry 2362 (class 2606 OID 35177)
-- Name: tbl_profile_type profile_type_self_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_profile_type
    ADD CONSTRAINT profile_type_self_fk FOREIGN KEY (self_fk) REFERENCES tbl_profile_type(id);


--
-- TOC entry 2359 (class 2606 OID 35162)
-- Name: tbl_profile profile_user_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_profile
    ADD CONSTRAINT profile_user_fk FOREIGN KEY (user_fk) REFERENCES tbl_user(id);


--
-- TOC entry 2363 (class 2606 OID 35182)
-- Name: tbl_rep_instance rep_instance_env_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_instance
    ADD CONSTRAINT rep_instance_env_fk FOREIGN KEY (env_fk) REFERENCES tbl_env(id);


--
-- TOC entry 2364 (class 2606 OID 35187)
-- Name: tbl_rep_instance rep_instance_rep_template_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_instance
    ADD CONSTRAINT rep_instance_rep_template_fk FOREIGN KEY (rep_template_fk) REFERENCES tbl_rep_template(id);


--
-- TOC entry 2365 (class 2606 OID 35192)
-- Name: tbl_rep_instance rep_instance_user_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_instance
    ADD CONSTRAINT rep_instance_user_fk FOREIGN KEY (user_fk) REFERENCES tbl_user(id);


--
-- TOC entry 2366 (class 2606 OID 35197)
-- Name: tbl_rep_instance rep_instance_xml_content_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_instance
    ADD CONSTRAINT rep_instance_xml_content_fk FOREIGN KEY (xml_content_fk) REFERENCES tbl_clob(id);


--
-- TOC entry 2367 (class 2606 OID 35202)
-- Name: tbl_rep_instance rep_instance_xsl_content_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_instance
    ADD CONSTRAINT rep_instance_xsl_content_fk FOREIGN KEY (xsl_content_fk) REFERENCES tbl_clob(id);


--
-- TOC entry 2368 (class 2606 OID 35207)
-- Name: tbl_rep_source rep_source_env_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_source
    ADD CONSTRAINT rep_source_env_fk FOREIGN KEY (env_fk) REFERENCES tbl_env(id);


--
-- TOC entry 2369 (class 2606 OID 35212)
-- Name: tbl_rep_source rep_source_env_source_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_source
    ADD CONSTRAINT rep_source_env_source_fk FOREIGN KEY (env_source_fk) REFERENCES tbl_env(id);


--
-- TOC entry 2371 (class 2606 OID 35222)
-- Name: tbl_rep_source rep_source_user_created_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_source
    ADD CONSTRAINT rep_source_user_created_fk FOREIGN KEY (user_created_fk) REFERENCES tbl_user(id);


--
-- TOC entry 2372 (class 2606 OID 35227)
-- Name: tbl_rep_source rep_source_user_updated_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_source
    ADD CONSTRAINT rep_source_user_updated_fk FOREIGN KEY (user_updated_fk) REFERENCES tbl_user(id);


--
-- TOC entry 2373 (class 2606 OID 35232)
-- Name: tbl_rep_template rep_template_env_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template
    ADD CONSTRAINT rep_template_env_fk FOREIGN KEY (env_fk) REFERENCES tbl_env(id);


--
-- TOC entry 2378 (class 2606 OID 35257)
-- Name: tbl_rep_template_param rep_template_param_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template_param
    ADD CONSTRAINT rep_template_param_fk FOREIGN KEY (rep_template_fk) REFERENCES tbl_rep_template(id);


--
-- TOC entry 2379 (class 2606 OID 35262)
-- Name: tbl_rep_template_source rep_template_source_rep_source_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template_source
    ADD CONSTRAINT rep_template_source_rep_source_fk FOREIGN KEY (rep_source_fk) REFERENCES tbl_rep_source(id);


--
-- TOC entry 2380 (class 2606 OID 35267)
-- Name: tbl_rep_template_source rep_template_source_rep_template_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template_source
    ADD CONSTRAINT rep_template_source_rep_template_fk FOREIGN KEY (rep_template_fk) REFERENCES tbl_rep_template(id);


--
-- TOC entry 2374 (class 2606 OID 35237)
-- Name: tbl_rep_template rep_template_user_created_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template
    ADD CONSTRAINT rep_template_user_created_fk FOREIGN KEY (user_created_fk) REFERENCES tbl_user(id);


--
-- TOC entry 2375 (class 2606 OID 35242)
-- Name: tbl_rep_template rep_template_user_updated_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template
    ADD CONSTRAINT rep_template_user_updated_fk FOREIGN KEY (user_updated_fk) REFERENCES tbl_user(id);


--
-- TOC entry 2376 (class 2606 OID 35247)
-- Name: tbl_rep_template rep_template_xml_content_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template
    ADD CONSTRAINT rep_template_xml_content_fk FOREIGN KEY (xml_content_fk) REFERENCES tbl_clob(id);


--
-- TOC entry 2377 (class 2606 OID 35252)
-- Name: tbl_rep_template rep_template_xsl_content_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_rep_template
    ADD CONSTRAINT rep_template_xsl_content_fk FOREIGN KEY (xsl_content_fk) REFERENCES tbl_clob(id);


--
-- TOC entry 2381 (class 2606 OID 35272)
-- Name: tbl_session session_env_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_session
    ADD CONSTRAINT session_env_fk FOREIGN KEY (env_fk) REFERENCES tbl_env(id);


--
-- TOC entry 2382 (class 2606 OID 35277)
-- Name: tbl_session session_organization_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_session
    ADD CONSTRAINT session_organization_fk FOREIGN KEY (org_fk) REFERENCES tbl_organization(id);


--
-- TOC entry 2383 (class 2606 OID 35282)
-- Name: tbl_session session_prof_type_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_session
    ADD CONSTRAINT session_prof_type_fk FOREIGN KEY (prof_type_fk) REFERENCES tbl_profile_type(id);


--
-- TOC entry 2384 (class 2606 OID 35287)
-- Name: tbl_session session_user_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_session
    ADD CONSTRAINT session_user_fk FOREIGN KEY (user_fk) REFERENCES tbl_user(id);


--
-- TOC entry 2385 (class 2606 OID 35292)
-- Name: tbl_transaction transaction_source_env_fk; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY tbl_transaction
    ADD CONSTRAINT transaction_source_env_fk FOREIGN KEY (env_fk) REFERENCES tbl_env(id);


-- Completed on 2018-01-03 16:16:38

--
-- PostgreSQL database dump complete
--

