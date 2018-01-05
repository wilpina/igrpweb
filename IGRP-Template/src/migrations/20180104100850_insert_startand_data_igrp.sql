-- Insert Config App
INSERT INTO tbl_config (id, name, value) VALUES (1, 'url_ativiti_connection', 'http://10.4.10.37/activiti-rest/service/');
INSERT INTO tbl_config (id, name, value) VALUES (2, 'CLIENT_ID_BIZTALK', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (3, 'TRANSACTION_ID_BIZTALK_PESQUISA_NIF', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (4, 'SERVICE_ID_BIZTALK_PESQUISA_NIF', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (5, 'TRANSACTION_ID_BIZTALK_PESQUISA_GEOGRAFIA', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (6, 'SERVICE_ID_BIZTALK_PESQUISA_GEOGRAFIA', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (7, 'TRANSACTION_ID_BIZTALK_PESQUISA_HIERARQUICA_CAE', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (8, 'SERVICE_ID_BIZTALK_PESQUISA_HIERARQUICA_CAE', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (9, 'TRANSACTION_ID_BIZTALK_PESQUISA_NASCIMENTO', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (10, 'SERVICE_ID_BIZTALK_PESQUISA_NASCIMENTO', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (11, 'TRANSACTION_ID_BIZTALK_PESQUISA_SNIAC', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (12, 'SERVICE_ID_BIZTALK_PESQUISA_SNIAC', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (13, 'TRANSACTION_ID_BIZTALK_PESQUISA_BI', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (14, 'SERVICE_ID_BIZTALK_PESQUISA_BI', 'your id');
INSERT INTO tbl_config (id, name, value) VALUES (15, 'install', 'ok');

--Insert Users
INSERT INTO tbl_user (id, activation_key, auth_key, created_at, email, mobile, name, pass_hash, password_reset_token, phone, photo_id, remarks, signature_id, status, updated_at, userprofile, user_name, valid_until) VALUES (0, '123456789', '123456789', 2017, 'igrp@nosi.cv', NULL, 'IGRP', ' ', NULL, NULL, NULL, NULL, NULL, 1, 2017, 'ADMIN', 'admin', NULL);
INSERT INTO tbl_user (id, activation_key, auth_key, created_at, email, mobile, name, pass_hash, password_reset_token, phone, photo_id, remarks, signature_id, status, updated_at, userprofile, user_name, valid_until) VALUES (2, '123456789', '123456', 2017, 'nositeste@nosi.cv', NULL, 'Nositeste', 'fe01ce2a7fbac8fafaed7c982a04e229', NULL, NULL, NULL, NULL, NULL, 1, 2017, 'ADMIN', 'demo', NULL);
INSERT INTO tbl_user (id, activation_key, auth_key, created_at, email, mobile, name, pass_hash, password_reset_token, phone, photo_id, remarks, signature_id, status, updated_at, userprofile, user_name, valid_until) VALUES (3, '123456789', '123456', 12345, NULL, NULL, NULL, 'Pa$$w0rd', NULL, NULL, NULL, NULL, NULL, 1, 133, NULL, 'root', NULL);


--Insert Applications
INSERT INTO tbl_env (id, dad, description, external, img_src, name, status, template, url, action_fk) VALUES (1, 'igrp', 'IGRP', 0, 'app_casacidadao.png', 'IGRP', 1, NULL, NULL, NULL);
INSERT INTO tbl_env (id, dad, description, external, img_src, name, status, template, url, action_fk) VALUES (2, 'tutorial', 'Mostra o que fazer com o IGRP JAVA Framework', 0, 'icon_educacao.png', 'Tutorial IGRP', 1, NULL, NULL, NULL);
INSERT INTO tbl_env (id, dad, description, external, img_src, name, status, template, url, action_fk) VALUES (3, 'igrp_studio', 'IGRP Studio - Software Developer', 0, 'studioSoLogo.svg', 'IGRP Studio', 1, 'igrp_studio', NULL, NULL);

--Insert Pages
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (1, 'index', 'Lista de Paginas', 'nosi.webapps.igrp.pages.listapage', 'ListaPage', 'Lista de Paginas', 1, '2.3', 'igrp/listapage/ListaPage.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (2, 'index', 'Registar Aplicacao', 'nosi.webapps.igrp.pages.env', 'Env', 'Registar Aplicacao', 1, '2.3', 'igrp/env/Env.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (3, 'index', 'Lista de Aplicacao', 'nosi.webapps.igrp.pages.listaenv', 'ListaEnv', 'Lista de Aplicacao', 1, '2.3', 'igrp/listaenv/ListaEnv.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (4, 'index', 'Lista de Dominio', 'nosi.webapps.igrp.pages.dominio', 'Dominio', 'Lista de Dominio', 1, '2.3', 'igrp/dominio/Dominio.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (5, 'index', 'Registar Dominio', 'nosi.webapps.igrp.pages.novodominio', 'NovoDominio', 'Registar Dominio', 1, '2.3', 'igrp/novodominio/NovoDominio.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (6, 'index', 'Lista de Organica', 'nosi.webapps.igrp.pages.pesquisarorganica', 'PesquisarOrganica', 'Lista de Organica', 1, '2.3', 'igrp/pesquisarorganica/PesquisarOrganica.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (7, 'index', 'Registar Organica', 'nosi.webapps.igrp.pages.novaorganica', 'NovaOrganica', 'Registar Organica', 1, '2.3', 'igrp/novaorganica/NovaOrganica.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (8, 'index', 'Registar Menu', 'nosi.webapps.igrp.pages.novomenu', 'NovoMenu', 'Registar Menu', 1, '2.3', 'igrp/novomenu/NovoMenu.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (9, 'index', 'Lista de Menu', 'nosi.webapps.igrp.pages.pesquisarmenu', 'PesquisarMenu', 'Lista de Menu', 1, '2.3', 'igrp/pesquisarmenu/PesquisarMenu.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (10, 'index', 'Registar Perfil', 'nosi.webapps.igrp.pages.novoperfil', 'NovoPerfil', 'Registar Perfil', 1, '2.3', 'igrp/novoperfil/NovoPerfil.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (11, 'index', 'Lista de Perfil', 'nosi.webapps.igrp.pages.pesquisarperfil', 'PesquisarPerfil', 'Lista de Perfil', 1, '2.3', 'igrp/pesquisarperfil/PesquisarPerfil.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (12, 'index', 'Lista de Utilizador', 'nosi.webapps.igrp.pages.pesquisarutilizador', 'PesquisarUtilizador', 'Lista de Utilizador', 1, '2.3', 'igrp/pesquisarutilizador/PesquisarUtilizador.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (13, 'index', 'Registar Utilizador', 'nosi.webapps.igrp.pages.novoutilizador', 'NovoUtilizador', 'Registar Utilizador', 1, '2.3', 'igrp/novoutilizador/NovoUtilizador.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (14, 'index', 'Settings', 'nosi.webapps.igrp.pages.settings', 'Settings', 'Settings', 1, '2.3', 'igrp/settings/Settings.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (15, 'index', 'Registar Utilizador', 'nosi.webapps.igrp.pages.registarutilizador', 'RegistarUtilizador', 'Registar Utilizador', 1, '2.3', 'igrp/registarutilizador/RegistarUtilizador.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (16, 'index', 'Transaccao', 'nosi.webapps.igrp.pages.transaccao', 'Transaccao', 'Transaccao', 1, '2.3', 'igrp/transaccao/Transaccao.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (17, 'index', 'Registar Pagina', 'nosi.webapps.igrp.pages.page', 'Page', 'Registar Pagina', 1, '2.3', 'igrp/page/Page.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (18, 'index', 'Associar Menu a Organica', 'nosi.webapps.igrp.pages.menuorganica', 'MenuOrganica', 'Associar Menu a Organica', 1, '2.3', 'igrp/menuorganica/MenuOrganica.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (19, 'index', 'Pagina de Erro', 'nosi.webapps.igrp.pages.errorpage', 'ErrorPage', 'Pagina de Erro', 1, '2.3', 'igrp/errorpage/ErrorPage.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (20, 'index', 'Associar Transacao a Organica', 'nosi.webapps.igrp.pages.transacaoorganica', 'TransacaoOrganica', 'Associar Transacao a Organica', 1, '2.3', 'igrp/transacaoorganica/TransacaoOrganica.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (21, 'index', 'Editar Transacao', 'nosi.webapps.igrp.pages.editartransacao', 'EditarTransacao', 'Editar Transacao', 1, '2.3', 'igrp/editartransacao/EditarTransacao.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (22, 'index', 'Gestao de Sessao', 'nosi.webapps.igrp.pages.session', 'Session', 'Gestao de Sessao', 1, '2.3', 'igrp/session/Session.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (23, 'index', 'Report Builder', 'nosi.webapps.igrp_studio.pages.webreport', 'WebReport', 'Report Builder', 1, '2.3', 'igrp_studio/webreport/WebReport.xsl', 3, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (24, 'index', 'Registar Data Source', 'nosi.webapps.igrp.pages.datasource', 'DataSource', 'Registar Data Source', 1, '2.3', 'igrp/datasource/DataSource.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (25, 'index', 'Lista de Pagina Para Lookup', 'nosi.webapps.igrp.pages.lookuplistpage', 'LookupListPage', 'Lista de Pagina Para Lookup', 1, '2.3', 'igrp/lookuplistpage/LookupListPage.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (26, 'index', 'Migrate IGRP', 'nosi.webapps.igrp.pages.migrate', 'Migrate', 'Migrate IGRP', 1, '2.3', 'igrp/migrate/Migrate.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (27, 'index', 'pesquisar Dados dos clientes', 'nosi.webapps.igrp.pages.oauthclientlist', 'OAuthClientList', 'pesquisar Dados dos clientes', 1, '2.3', 'igrp/oauthclientlist/OAuthClientList.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (28, 'index', 'Inserir Dados dos clientes', 'nosi.webapps.igrp.pages.oauthclient', 'OAuthClient', 'Inserir Dados dos clientes', 1, '2.3', 'igrp/oauthclient/OAuthClient.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (29, 'index', 'Mapa Processo', 'nosi.webapps.igrp.pages.mapaprocesso', 'MapaProcesso', 'Mapa Processo', 1, '2.3', 'igrp/mapaprocesso/MapaProcesso.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (30, 'index', 'Execucao Tarefas', 'nosi.webapps.igrp.pages.execucaotarefas', 'ExecucaoTarefas', 'Execucao Tarefas', 1, '2.3', 'igrp/execucaotarefas/ExecucaoTarefas.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (31, 'index', 'Lookup Lista Utilizador', 'nosi.webapps.igrp.pages.lookuplistuser', 'LookupListUser', 'Lookup Lista Utilizador', 1, '2.3', 'igrp/lookuplistuser/LookupListUser.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (32, 'index', 'Alter prioridade tarefa', 'nosi.webapps.igrp.pages.alter_prioridade_tarefa', 'Alter_prioridade_tarefa', 'Alter prioridade tarefa', 1, '2.3', 'igrp/alter_prioridade_tarefa/Alter_prioridade_tarefa.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (33, 'index', 'Transferir tarefas', 'nosi.webapps.igrp.pages.transferir_tarefas', 'Transferir_tarefas', 'Transferir tarefas', 1, '2.3', 'igrp/transferir_tarefas/Transferir_tarefas.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (34, 'index', 'BPMN Designer', 'nosi.webapps.igrp_studio.pages.bpmndesigner', 'BPMNDesigner', 'BPMN Designer', 1, '2.3', 'igrp_studio/bpmndesigner/BPMNDesigner.xsl', 3, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (35, 'index', 'Import export', 'nosi.webapps.igrp.pages.import_export', 'Import_export', 'Import export', 1, '2.3', 'igrp/import_export/Import_export.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (36, 'index', 'Import Arquivo', 'nosi.webapps.igrp_studio.pages.importarquivo', 'ImportArquivo', 'Import Arquivo', 1, '2.3', 'igrp_studio/importarquivo/ImportArquivo.xsl', 3, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (37, 'index', 'Configurar Base de Dados de uma aplicação', 'nosi.webapps.igrp.pages.configdatabase', 'ConfigDatabase', 'Configurar Base de Dados', 1, '2.3', 'igrp/configdatabase/ConfigDatabase.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (38, 'index', 'Pesquisar BI', 'nosi.webapps.igrp.pages.pesquisabi', 'PesquisaBI', 'Pesquisar BI', 1, '2.3', 'igrp/pesquisabi/PesquisaBI.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (39, 'index', 'Pesquisar NIF', 'nosi.webapps.igrp.pages.pesquisanif', 'PesquisaNIF', 'Pesquisar NIF', 1, '2.3', 'igrp/pesquisanif/PesquisaNIF.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (40, 'index', 'Pesquisar Nascimento', 'nosi.webapps.igrp.pages.pesquisanascimento', 'PesquisaNascimento', 'Pesquisar Nascimento', 1, '2.3', 'igrp/pesquisanascimento/PesquisaNascimento.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (41, 'index', 'Gestao de Acesso', 'nosi.webapps.igrp.pages.gestaodeacesso', 'Gestaodeacesso', 'Gestao de Acesso', 1, '2.3', 'igrp/gestaodeacesso/Gestaodeacesso.xsl', 1, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (42, 'index', 'O que fazer dentro do IGRP JAVA...', 'nosi.webapps.tutorial.pages.geralapresentacao', 'GeralApresentacao', 'O que fazer dentro do IGRP JAVA...', 1, '2.3', 'tutorial/geralapresentacao/GeralApresentacao.xsl', 2, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (43, 'index', 'HomeStudio', 'nosi.webapps.igrp_studio.pages.homestudio', 'HomeStudio', 'HomeStudio', 1, '2.3', 'igrp_studio/homestudio/HomeStudio.xsl', 3, NULL);
INSERT INTO tbl_action (id, action, action_descr, package_name, page, page_descr, status, version, xsl_src, env_fk, crud_fk) VALUES (44, 'index', 'CRUD Generator', 'nosi.webapps.igrp_studio.pages.crudgenerator', 'CRUDGenerator', 'CRUDGenerator', 1, '2.3', 'igrp_studio/crudgenerator/CRUDGenerator.xsl', 3, NULL);


--Insert Menus
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (1, 'Gestão de Aplicação', 0, 1, 1, NULL, NULL, 1, NULL);
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (2, 'Parâmetros Gerais', 0, 1, 1, NULL, NULL, 1, NULL);
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (3, 'Auditoria', 0, 1, 1, NULL, NULL, 1, NULL);
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (4, 'IGRP Studio', 0, 1, 1, NULL, NULL, 3, NULL);
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (5, 'Application Builder', 1, 1, 1, '_self', 3, 3, 1);
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (6, 'Page Builder', 0, 1, 1, '_self', 1, 3, 4);
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (7, 'Report Designer', 0, 1, 1, '_self', 23, 3, 4);
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (8, 'Gestão de Menu', 0, 1, 1, '_self', 9, 1, 1);
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (9, 'Gestão de Transação', 0, 1, 1, '_self', 16, 1, 1);
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (10, 'Gestão de Acesso', 0, 1, 1, '_self', 41, 1, 2);
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (11, 'Gestão de Utilizador', 0, 1, 1, '_self', 12, 1, 2);
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (12, 'Área Pessoal', 1, 1, 1, '_self', 14, 1, 2);
INSERT INTO tbl_menu (id, descr, flg_base, orderby, status, target, action_fk, env_fk, self_fk) VALUES (13, 'Parametros de Auditoria', 0, 1, 1, '_self', 22, 1, 3);


--Insert Organization
INSERT INTO tbl_organization (id, code, name, status, env_fk, self_fk, user_created_fk) VALUES (1, '01.03', 'Ebau', 1, 1, NULL, 0);
INSERT INTO tbl_organization (id, code, name, status, env_fk, self_fk, user_created_fk) VALUES (2, 'org.tutorial', 'Tutorial', 1, 2, NULL, 0);
INSERT INTO tbl_organization (id, code, name, status, env_fk, self_fk, user_created_fk) VALUES (3, 'org.developer', 'Developer', 1, 3, NULL, 0);


--Insert Profile Type
INSERT INTO tbl_profile_type (id, code, descr, status, env_fk, org_fk, self_fk) VALUES (0, 'ALL', 'ALL PROFILE', 1, 1, NULL, NULL);
INSERT INTO tbl_profile_type (id, code, descr, status, env_fk, org_fk, self_fk) VALUES (2, 'ADMIN', 'Administrador', 1, 1, 1, NULL);
INSERT INTO tbl_profile_type (id, code, descr, status, env_fk, org_fk, self_fk) VALUES (3, 'perfil.tutorial', 'Tutorial', 1, 2, 2, NULL);
INSERT INTO tbl_profile_type (id, code, descr, status, env_fk, org_fk, self_fk) VALUES (4, 'perfil.developer', 'Developer', 1, 3, 3, NULL);


--Insert Profiles
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (1, 'ENV', 1, 1, 2, 2);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (2, 'PROF', 2, 1, 2, 2);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (3, 'ENV', 2, 2, 3, 2);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (4, 'PROF', 3, 2, 3, 2);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (5, 'ENV', 3, 3, 4, 2);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (6, 'PROF', 4, 3, 4, 2);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (7, 'MEN', 5, 3, 0, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (8, 'MEN', 6, 3, 0, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (9, 'MEN', 7, 3, 0, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (10, 'MEN', 8, 1, 0, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (11, 'MEN', 9, 1, 0, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (12, 'MEN', 10, 1, 0, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (13, 'MEN', 11, 1, 0, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (14, 'MEN', 12, 1, 0, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (15, 'MEN', 13, 1, 0, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (16, 'MEN', 5, 3, 4, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (17, 'MEN', 6, 3, 4, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (18, 'MEN', 7, 3, 4, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (19, 'MEN', 8, 1, 2, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (20, 'MEN', 9, 1, 2, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (21, 'MEN', 10, 1, 2, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (22, 'MEN', 11, 1, 2, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (23, 'MEN', 12, 1, 2, 0);
INSERT INTO tbl_profile (id, type, type_fk, org_fk, prof_type_fk, user_fk) VALUES (24, 'MEN', 13, 1, 2, 0);


--Insert User Roles
INSERT INTO tbl_user_roles (id, role_name, user_name) VALUES (1, 'IGRP_ADMIN', 'demo');
INSERT INTO tbl_user_roles (id, role_name, user_name) VALUES (2, 'admin', 'root');
INSERT INTO tbl_user_roles (id, role_name, user_name) VALUES (3, 'admin-script', 'root');
INSERT INTO tbl_user_roles (id, role_name, user_name) VALUES (4, 'manager-gui', 'root');
INSERT INTO tbl_user_roles (id, role_name, user_name) VALUES (5, 'manager-script', 'root');
INSERT INTO tbl_user_roles (id, role_name, user_name) VALUES (6, 'manager-xml', 'root');
INSERT INTO tbl_user_roles (id, role_name, user_name) VALUES (7, 'manager-status', 'root');
INSERT INTO tbl_user_roles (id, role_name, user_name) VALUES (8, 'admin-gui', 'root');

--Set Action to Application
UPDATE tbl_env SET action_fk=42 WHERE id=2;
UPDATE tbl_env SET action_fk=43 WHERE id=3;