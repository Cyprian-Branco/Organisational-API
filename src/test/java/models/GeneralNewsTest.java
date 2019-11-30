package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneralNewsTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }
    public GeneralNews setupGeneralNews(){
        return new GeneralNews("news");

    }
    @Test
    public void setContentInstantiatesCorrectly(){
        GeneralNews testGeneralNews = setupGeneralNews();
        testGeneralNews.setContent("news");
        assertEquals("news", GeneralNews.getContent());
    }

    @Test
    public void getIdInstantiatesCorrectly() {
        GeneralNews testGeneralNews = setupGeneralNews();
        assertEquals(0, testGeneralNews.getId());
    }

    @Test
    public void getContentInstantiatesCorrectly(){
        GeneralNews testGeneralNews = setupGeneralNews();
        assertEquals("news", testGeneralNews.getContent());
    }
}