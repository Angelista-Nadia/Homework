select * from orders;

select id, name, date from orders where date < '2024-05-01';

select * from persons left join public.orders o on persons.id = o.person_id;

delete  from persons where  id = 1;
delete from orders;

update orders set delivery = true where id = 4;

insert into persons (id, login, pass) VALUES
                    (1, 'User1', 'pass1'),
                    (2, 'User2', 'pass2'),
                    (3, 'User3', 'pass3'),
                    (4, 'User4', 'pass4');

insert into orders (id, name, date, quantity, cost, delivery, person_id) VALUES
                   (1, 'table', '2024-05-21', 1, 3000, true, 1),
                   (2, 'cup', '2024-05-01', 6, 200, false, 3),
                   (3, 'chair', '2024-04-12', 3, 1500, true, 3),
                   (4, 'pillow', '2024-04-29', 2, 600, false, 4);

create table orders (
       id int primary key,
       name varchar,
       date date,
       quantity int,
       cost int,
       delivery boolean
);

create table persons (
       id int primary key,
       login varchar,
       pass varchar
);

alter table orders ADD column person_id int;