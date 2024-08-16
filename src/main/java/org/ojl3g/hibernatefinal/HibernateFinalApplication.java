package org.ojl3g.hibernatefinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *Задача
 * HibernateFinal
 *
 * Написать на Spring Boot приложение.
 * Подключить Spring JPA к PostgreSQL драйверу.
 *
 * Создать сущности:
 *
 * Дом (свойства: адрес, ID).
 * Владелец (человек).
 * Список жильцов (типа человек).
 *
 * Человек (свойства: ID, имя, дом (может быть много), машина (может быть много)).
 *
 * Машина (свойства: название, ID).
 *
 * Реализовать репозитории к человеку и дому.
 */

@SpringBootApplication
public class HibernateFinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(HibernateFinalApplication.class, args);



    }

}
