package com.backwebmvc.backwebmvc.hatoas;


import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.parser.Entity;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class HatosController {


    @GetMapping("hatos")
    public EntityModel<Hatos> hatos(){
        Hatos hatos = new Hatos();
        hatos.setPrefix("hey");
        hatos.setName("kim");

        EntityModel<Hatos> hatosEntityModel = new EntityModel<>(hatos);

        hatosEntityModel.add(linkTo(methodOn(HatosController.class).hatos()).withSelfRel());


        return hatosEntityModel;
    }
}
