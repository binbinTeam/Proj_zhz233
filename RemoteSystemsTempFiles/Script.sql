--<ScriptOptions statementTerminator=";"/>

ALTER TABLE `zhz233`.`tab_invla` DROP INDEX `zhz233`.`idtab_invla_UNIQUE`;

ALTER TABLE `zhz233`.`tab_invla` DROP INDEX `zhz233`.`order_no_UNIQUE`;

ALTER TABLE `zhz233`.`tab_invla` DROP INDEX `zhz233`.`PRIMARY`;

DROP TABLE `zhz233`.`tab_invla`;

CREATE TABLE `zhz233`.`tab_invla` (
) ENGINE=InnoDB;

CREATE UNIQUE INDEX `idtab_invla_UNIQUE` ON `zhz233`.`tab_invla` (null);

CREATE UNIQUE INDEX `order_no_UNIQUE` ON `zhz233`.`tab_invla` (null);

CREATE UNIQUE INDEX `PRIMARY` ON `zhz233`.`tab_invla` (null);

