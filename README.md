# Testing API Framework

**Developed by <ins>May the Floats be with you</ins>: Michalis, Igran,
James,
Francisico,
Lucas and
Ricardo.**

### **Table of Contents**
* [**About Project**](#about-project)
    * [Built with](#build-with)
    * [Dependencies](#dependencies)
* [**Program Structure**](#program-structure)
* [**Usage**](#usage)


## About Project

This project is developed as a team of 6, following agile methodologies, adhering to OOP and SOLID principles.
The project's functionality is to provide testers an easy way to develop tests for the StarWars API that can be found
[here](https://swapi.dev).

### <span style="color: black;">**Built With**</span>

* IntelliJ IDEA (Ultimate Edition)

### <span style="color: black;">**Dependencies**</span>

* junit-jupiter:5.9.1
* jackson-databind:2.14.0


## Program Structure

The testing framework is split into the following packages: <br> 
* `connection`: contains the class responsible to provide the path to the different endpoint options of the Star Wars API.
* `dto`: contains all the DTOs that can be generated through the different endpoints.
* `injection`: responsible to inject the JSON response from the API into the appropriate DTO.
* `services`: contains classes with helper methods and fields to either get access or test the Star Wars API.
* `test`: several classes to test the API through the testing framework.

## Usage

The framework was developed to help testers focus on developing test cases instead of worrying how to get the appropriate
response from the Star Wars API. Therefore, to use the testing framework a tester should follow the steps below:
* Create a new Test class
* Get the url of your interest, by using the methods in the `ConnectionManager` class
* Inject the JSON response into the appropriate dto by using the methods in the `Injector` class
* Start developing test cases by calling the several helper methods inside the dto.
