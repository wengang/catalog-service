package com.polarbookshop.catalogservice.persistence;

import com.polarbookshop.catalogservice.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.NONE)
public class InMemoryBookRepositoryTest {

    @Autowired
    private  InMemoryBookRepository repository;

    @Test
    public void whenAddingNewBookShouldReturnTheBook(){
        Book book=new Book("1231231231","cloud native in action","Tomash",31.9);
        Book newBook=repository.save(book);
        assertThat(newBook).isNotNull();
    }
    public void main(String[] args){
        InMemoryBookRepositoryTest test=new InMemoryBookRepositoryTest();
        test.repository=new InMemoryBookRepository();
        test.whenAddingNewBookShouldReturnTheBook();
    }
}
