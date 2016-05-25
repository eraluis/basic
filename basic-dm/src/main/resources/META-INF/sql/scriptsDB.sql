INSERT INTO `continent` (`id`, `code`, `name`) VALUES (1, 'AF', 'África');
INSERT INTO `continent` (`id`, `code`, `name`) VALUES (2, 'AS', 'Asia');
INSERT INTO `continent` (`id`, `code`, `name`) VALUES (3, 'EU', 'Europa');
INSERT INTO `continent` (`id`, `code`, `name`) VALUES (4, 'AM', 'America');
INSERT INTO `continent` (`id`, `code`, `name`) VALUES (5, 'OC', 'Oceanía');

INSERT INTO `country` (`id`, `code`, `name`, `fk_continent`) VALUES (77, 'CO', 'Colombia', 4);
INSERT INTO `country` (`id`, `code`, `name`, `fk_continent`) VALUES (81, 'EC', 'Ecuador', 4);
INSERT INTO `country` (`id`, `code`, `name`, `fk_continent`) VALUES (83, 'US', 'Estados Unidos', 4);

INSERT INTO `state` (`id`, `code`, `name`, `fk_country`) VALUES (23, '7723', 'Putumayo', 77);
INSERT INTO `state` (`id`, `code`, `name`, `fk_country`) VALUES (24, '7724', 'Nariño', 77);
INSERT INTO `state` (`id`, `code`, `name`, `fk_country`) VALUES (25, '7725', 'Cauca', 77);

INSERT INTO `state` (`id`, `code`, `name`, `fk_country`) VALUES (26, '8101', 'Carchi', 81);
INSERT INTO `state` (`id`, `code`, `name`, `fk_country`) VALUES (27, '8102', 'Imbabura', 81);
INSERT INTO `state` (`id`, `code`, `name`, `fk_country`) VALUES (28, '8103', 'Esmeraldas', 81);

INSERT INTO `state` (`id`, `code`, `name`, `fk_country`) VALUES (29, '8301', 'California', 83);
INSERT INTO `state` (`id`, `code`, `name`, `fk_country`) VALUES (30, '8302', 'Texas', 83);
INSERT INTO `state` (`id`, `code`, `name`, `fk_country`) VALUES (31, '8303', 'Florida', 83);

INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (802, '772302', 'Orito', 23);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (803, '772303', 'Puerto Asís', 23);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (804, '772304', 'Puerto Caicedo', 23);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (805, '772305', 'Puerto Leguízamo', 23);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (806, '772306', 'San Miguel', 23);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (807, '772307', 'Valle del Guamuez', 23);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (808, '772308', 'Villagarzón', 23);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (809, '772401', 'Pasto', 24);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (810, '772402', 'Ipiales', 24);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (811, '772403', 'Tumaco', 24);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (812, '772404', 'Túquerres', 24);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (813, '772501', 'Popayán', 25);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (814, '772502', 'Timbio', 25);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (815, '772503', 'Silvia', 25);

INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (816, '830101', 'Los Angeles', 29);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (817, '830101', 'San Diego', 29);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (818, '830201', 'Houston', 30);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (819, '830202', 'Austin', 30);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (820, '830301', 'Miami', 31);
INSERT INTO `city` (`id`, `code`, `name`, `fk_state`) VALUES (821, '830302', 'Orlando', 31);


INSERT INTO `permission` (`action`,`resource`,`urlResource`,`parent_permission`) VALUES ('read','Home','/app/content/home.xhtml',NULL);
INSERT INTO `permission` (`action`,`resource`,`urlResource`,`parent_permission`) VALUES ('read','Persons','/app/content/person.xhtml',NULL);
INSERT INTO `permission` (`action`,`resource`,`urlResource`,`parent_permission`) VALUES ('reed','Permissions','/app/content/permission.xhtml',NULL);

INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Luis', 'Eraso');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Eyder', 'Ascuntar');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Sara Cecilia', 'Martinez Andrade');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Pedro Felipe', 'Daza Perez');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Jairo Alonso', 'Gómez');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Critian Felipe', 'Chamorro');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Wilson', 'Jordan');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Duvan Andres', 'Morales');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Asly Dayana', 'Moreno de la Cruz');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Carlos Fernando', 'Muñoz');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Fernando', 'Plaza Camayo');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Jeferson', 'Solano');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Alexander', 'Zuñiga');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('John Jairo', 'Arevalo Hoyos');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Jorge Andrés', 'Coral Trujillo');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Jhon Jairo', 'Echeverry Dorado');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Oscar Andres', 'Muñoz Burbano');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('John Alexander', 'Piamba Collazos');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Juan Alberto', 'Muñoz Collazos');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Jinneth Xilena', 'Chamizo Agredo');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Willian', 'Angulo Ibarra');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Luis Fernando', 'Astudillo Villaquiran');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Jose Manuel', 'Ortega Gómez');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Mildred ', 'Perez Zuñiga');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Leidy Lorena', 'Garces Muñoz');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Luis Carlos', 'Garcia');
INSERT INTO `person` (`firstName`, `lastName`) VALUES ('Jonathan Alexander', 'Mosquera Ramirez');