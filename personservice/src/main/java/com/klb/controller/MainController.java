package com.klb.controller;

import com.klb.dao.PersonDao;
import com.klb.entity.Person;
import com.klb.service.ComputingService;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


@Path("/mainservice")
@Component
public class MainController {

    private final ComputingService computingService;

    private  final PersonDao personDao;

    public MainController(ComputingService computingService, PersonDao personDao) {
        this.computingService = computingService;
        this.personDao = personDao;

    }

//    @RequestMapping("/greeting")
//    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                stringService.getWithDate(name));
//    }

//    @GET
//    @Path("/emp")
//    @Produces(MediaType.APPLICATION_JSON)
//    public Employee getEmployee() {
//        Employee emp = new Employee(1L, "testemp");
//        return emp;
//    }
//
    @GET
    @Path("/greeting/{num}")
    @Produces(MediaType.TEXT_HTML)
    public String getGreetings(@PathParam("num") String number) {
        if(computingService.isPrime(Integer.parseInt(number))) {
            return "<html> " + "<title>" + "Wynik" + "</title>"
                    + "<body><h1>" + "Pierwsza" + "</body></h1>" + "</html> ";
        }

        return "<html> " + "<title>" + "Wynik" + "</title>"
                + "<body><h1>" + "Nie pierwsza" + "</body></h1>" + "</html> ";

    }

    @GET
    @Path("/greeting2/{num1}/{num2}")
    @Produces(MediaType.TEXT_HTML)
    public String getGreetings2(@PathParam("num1") String number1, @PathParam("num2") String number2) {
        Double val = Double.parseDouble(number1) + Double.parseDouble(number2);

        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + val + "</body></h1>" + "</html> ";

    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String sayHtmlHello() {
        return "<html> " + "<title>" + "Hello Jersey" + "</title>"
                + "<body><h1>" + "Hello Jersey" + "</body></h1>" + "</html> ";
    }

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response read() {
        List<Person> persons = personDao.findAll();

        return Response.ok().entity(persons).build();
    }

}
