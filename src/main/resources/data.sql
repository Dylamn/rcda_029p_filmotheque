-- This file is used to populate the database with data

-- genre table
insert into genre (id, label) values (1, 'Action|Adventure|Fantasy|Mystery');
insert into genre (id, label) values (2, 'Comedy|Documentary');
insert into genre (id, label) values (3, 'Comedy');
insert into genre (id, label) values (4, 'Action|Comedy');
insert into genre (id, label) values (5, 'Drama|Fantasy|Romance');
insert into genre (id, label) values (6, 'Drama|Romance');
insert into genre (id, label) values (7, 'Horror|War');
insert into genre (id, label) values (8, 'Documentary');
insert into genre (id, label) values (9, 'Comedy');
insert into genre (id, label) values (10, 'Documentary');

-- participant table
insert into participant (id, firstname, lastname) values (1, 'Murial', 'Crosham');
insert into participant (id, firstname, lastname) values (2, 'Alisander', 'Downham');
insert into participant (id, firstname, lastname) values (3, 'Base', 'Harme');
insert into participant (id, firstname, lastname) values (4, 'Bruis', 'Blood');
insert into participant (id, firstname, lastname) values (5, 'Bette', 'Spacy');
insert into participant (id, firstname, lastname) values (6, 'Stanford', 'Sworne');
insert into participant (id, firstname, lastname) values (7, 'Doyle', 'Buckell');
insert into participant (id, firstname, lastname) values (8, 'Berny', 'Estrella');
insert into participant (id, firstname, lastname) values (9, 'Adelice', 'Mably');
insert into participant (id, firstname, lastname) values (10, 'Ernest', 'Willshere');

-- member table
insert into member (id, firstname, lastname, login, password, is_admin) values (1, 'Styrbjörn', 'McArte', 'pmcarte0', 'm1iQi3RE', 1);
insert into member (id, firstname, lastname, login, password, is_admin) values (2, 'Alfonse', 'Noods', 'anoods1', 'BHC2XJd6', 1);
insert into member (id, firstname, lastname, login, password, is_admin) values (3, 'Léane', 'Chill', 'achill2', 'h5VX0mxm', 1);
insert into member (id, firstname, lastname, login, password, is_admin) values (4, 'Andréanne', 'Kornalik', 'rkornalik3', 'IWPLuHQmSSEo', 1);
insert into member (id, firstname, lastname, login, password, is_admin) values (5, 'Callida', 'Margeram', 'cmargeram4', 'kZxi9DweJx', 1);

-- movie table
insert into movie (id, title, year, duration, synopsis, genre_id, producer_id) values (1, 'Woman in The Septic Tank, The (Ang Babae sa septic tank)', 1887, 256, 'he realizes that the game is much more than just a game.', 5, 7);
insert into movie (id, title, year, duration, synopsis, genre_id, producer_id) values (2, 'Frankie and Johnny', 1931, 273, 'but as he gets closer to the truth', 4, 4);
insert into movie (id, title, year, duration, synopsis, genre_id, producer_id) values (3, 'Anna Christie', 1955, 146, 'he realizes that the game is much more than just a game.', 8, 6);
insert into movie (id, title, year, duration, synopsis, genre_id, producer_id) values (4, 'In the Winter Dark', 1871, 132, 'A young woman falls in love with a vampire', 6, 1);
insert into movie (id, title, year, duration, synopsis, genre_id, producer_id) values (5, 'Death King, The (Der Todesking)', 1969, 90, 'A young woman falls in love with a vampire', 10, 8);
insert into movie (id, title, year, duration, synopsis, genre_id, producer_id) values (6, 'Nothing in Common', 1980, 106, 'he realizes that the game is much more than just a game.', 9, 7);
insert into movie (id, title, year, duration, synopsis, genre_id, producer_id) values (7, 'Dark Woods (Villmark)', 1856, 146, 'he realizes that the game is much more than just a game.', 7, 3);
insert into movie (id, title, year, duration, synopsis, genre_id, producer_id) values (8, 'Repulsion', 1945, 152, 'A detective investigates a series of murders that seem to be connected to a popular video game', 6, 1);
insert into movie (id, title, year, duration, synopsis, genre_id, producer_id) values (9, 'Iceberg, L''', 2014, 206, 'A group of friends go on a road trip to Las Vegas', 9, 2);
insert into movie (id, title, year, duration, synopsis, genre_id, producer_id) values (10, 'Harry Potter and the Prisoner of Azkaban', 1940, 169, 'A young woman falls in love with a vampire', 6, 8);

-- review table
insert into review (id, rating, comment, movie_id, member_id) values (1, 1, 'Nulla facilisi. Cras non velit nec nisi vulputate nonummy. Maecenas tincidunt lacus at velit. Vivamus vel nulla eget eros elementum pellentesque. Quisque porta volutpat erat.', 1.0, 4.1);
insert into review (id, rating, comment, movie_id, member_id) values (2, 1, 'In eleifend quam a odio. In hac habitasse platea dictumst.', 1.0, 4.5);
insert into review (id, rating, comment, movie_id, member_id) values (3, 4, 'Morbi sem mauris, laoreet ut, rhoncus aliquet, pulvinar sed, nisl. Nunc rhoncus dui vel sem. Sed sagittis. Nam congue, risus semper porta volutpat, quam pede lobortis ligula, sit amet eleifend pede libero quis orci. Nullam molestie nibh in lectus.', 1.0, 3.2);
insert into review (id, rating, comment, movie_id, member_id) values (4, 2, 'Vivamus metus arcu, adipiscing molestie, hendrerit at, vulputate vitae, nisl. Aenean lectus. Pellentesque eget nunc. Donec quis orci eget orci vehicula condimentum.', 1.0, 3.3);
insert into review (id, rating, comment, movie_id, member_id) values (5, 4, 'Duis at velit eu est congue elementum. In hac habitasse platea dictumst. Morbi vestibulum, velit id pretium iaculis, diam erat fermentum justo, nec condimentum neque sapien placerat ante. Nulla justo. Aliquam quis turpis eget elit sodales scelerisque.', 1.0, 4.9);

-- movies_actors table
insert into movie_actors (actor_movies_id, actors_id) values (1, 3);
insert into movie_actors (actor_movies_id, actors_id) values (2, 10);
insert into movie_actors (actor_movies_id, actors_id) values (3, 10);
insert into movie_actors (actor_movies_id, actors_id) values (4, 8);
insert into movie_actors (actor_movies_id, actors_id) values (5, 7);
insert into movie_actors (actor_movies_id, actors_id) values (6, 8);
insert into movie_actors (actor_movies_id, actors_id) values (7, 4);
insert into movie_actors (actor_movies_id, actors_id) values (8, 6);
insert into movie_actors (actor_movies_id, actors_id) values (9, 4);
insert into movie_actors (actor_movies_id, actors_id) values (10, 2);
insert into movie_actors (actor_movies_id, actors_id) values (1, 9);
insert into movie_actors (actor_movies_id, actors_id) values (2, 3);
insert into movie_actors (actor_movies_id, actors_id) values (3, 6);
insert into movie_actors (actor_movies_id, actors_id) values (4, 6);
insert into movie_actors (actor_movies_id, actors_id) values (5, 3);
insert into movie_actors (actor_movies_id, actors_id) values (6, 1);
insert into movie_actors (actor_movies_id, actors_id) values (7, 7);
insert into movie_actors (actor_movies_id, actors_id) values (8, 5);
insert into movie_actors (actor_movies_id, actors_id) values (9, 5);
insert into movie_actors (actor_movies_id, actors_id) values (10, 7);
insert into movie_actors (actor_movies_id, actors_id) values (10, 5);
insert into movie_actors (actor_movies_id, actors_id) values (10, 1);
