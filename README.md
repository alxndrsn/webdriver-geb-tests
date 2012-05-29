# Geb Test Suite for GhostDriver

This project is a Geb test suite for Ghostdriver/PhantomJS.

# Requirements

* Groovy
* Maven

# Use

## To start the server

	groovy server.groovy

## To run the tests

	mvn clean test

## Project layout

The project runs Geb tests against static HTML files served by an embedded Jetty server.

### Tests

Geb specs are located in `src/test/groovy`

### HTML files

HTML files are served from `src/test/resources`
