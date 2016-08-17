package com.joe.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * Created by localadmin on 8/17/16.
 */
public class TaskTest {
    SimpleDateFormat myDate = new SimpleDateFormat("yyyy-mm-dd");
    @Before
     public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void ShouldCreateANewTask() throws Exception {
        Task t = new Task();
        assertThat(t, instanceOf(Task.class));
        assertTrue(t.getCreatedAt().getTime() > 0);
        assertTrue(t.getUpdatedAt().getTime() > 0);
    }

    @Test
    public void ShouldGetAndSetId() throws Exception {
        Task t = new Task();
        t.setId(3);
        assertEquals(3, t.getId());
    }

    @Test
    public void ShouldGetAndSetName() throws Exception {
        Task t = new Task();
        t.setName("Will Rogers");
        assertEquals("Will Rogers", t.getName());
    }

    @Test
    public void ShouldGetAndSetCategory() throws Exception {
        Task t = new Task();
        t.setCategory("Home");
        assertEquals("Home", t.getCategory());
    }

    @Test
    public void ShouldGetAndSetDateDue() throws Exception {
        Task t = new Task();
        t.setDateDue(myDate.parse("2015-12-05"));
        assertEquals(myDate.parse("2015-12-05"), t.getDateDue());
    }

    @Test
    public void ShouldGetAndSetIsComplete() throws Exception {
        Task t = new Task();
        t.setIsComplete(true);
        assertEquals(true, t.getIsComplete());
    }
    @Test
    public void ShouldGetAndSetCreatedAt() throws Exception {
        Task t = new Task();
        t.setCreatedAt(myDate.parse("2015-12-09"));
        assertEquals(myDate.parse("2015-12-09"), t.getCreatedAt());
    }

    @Test
    public void ShouldGetAndSetUpdatedAtOnTask() throws Exception {
        Task t = new Task();
        t.setUpdatedAt(myDate.parse("2015-12-19"));
        assertEquals(myDate.parse("2015-12-19"), t.getUpdatedAt());
    }

    @Test
    public void ShouldUpdateTheTimeOnTask() throws Exception {
        Task t = new Task();
        t.setUpdatedAt(null);
        t.updateTime();
        assertTrue(t.getUpdatedAt().getTime() > 0);
    }
}