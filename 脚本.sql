--<ScriptOptions statementTerminator=";"/>

CREATE TABLE company (
		id null,
		name TEXT(2000000000),
		age null,
		address null,
		salary REAL(10 , 10)
	);

CREATE UNIQUE INDEX sqlite_autoindex_company_1 ON company (id ASC);

