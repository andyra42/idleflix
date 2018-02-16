package io.idleflix.jhipster.application.cucumber.stepdefs;

import io.idleflix.jhipster.application.IdleflixApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = IdleflixApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
