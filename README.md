# Geb Test Suite for GhostDriver

This project is a Geb test suite for Ghostdriver/PhantomJS.

# Requirements

* Groovy
* Maven

# Use

## To start the server

### Ruby (Sinatra)

	ruby server.rb

### Groovy (Jetty)
This server doesn't behave very well.  Hopefully I will get it sorted at some point - for now I recommend using ruby.

	groovy server.groovy

## To run the tests

	mvn clean test

## Project layout

The project runs Geb tests against static HTML files served by an embedded Jetty server.

### Tests

Geb specs are located in `src/test/groovy`

### HTML files

HTML files are served from `src/test/resources`
