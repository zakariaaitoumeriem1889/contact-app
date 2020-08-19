package org.sid.contactapp;

import org.sid.contactapp.dao.ContactRepository;
import org.sid.contactapp.entity.Contact;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.text.SimpleDateFormat;

@SpringBootApplication
public class ContactAppApplication implements CommandLineRunner {
    private final ContactRepository contactRepository;
    private final RepositoryRestConfiguration restConfiguration;

    public ContactAppApplication(ContactRepository contactRepository, RepositoryRestConfiguration restConfiguration) {
        this.contactRepository = contactRepository;
        this.restConfiguration = restConfiguration;
    }

    public static void main(String[] args) {
        SpringApplication.run(ContactAppApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        String d = "12-11-1970";
        contactRepository.save(new Contact(null, "Ibrahimi", "Ibrahimi", format.parse("12-11-1970"), "hassan@gmail.com", "0632546587"));
        contactRepository.findAll().forEach(contact -> {
            System.out.println(contact.toString());
        });
    }
}
