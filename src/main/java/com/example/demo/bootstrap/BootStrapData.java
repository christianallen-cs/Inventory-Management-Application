package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository = outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        if (partRepository.count() == 0) {

            OutsourcedPart deck = new OutsourcedPart();
            deck.setCompanyName("Baker");
            deck.setName("Boards");
            deck.setInv(5);
            deck.setPrice(75.0);
            deck.setId(100L);
            deck.setMinInv(0);
            deck.setMaxInv(20);
            outsourcedPartRepository.save(deck);

            OutsourcedPart bearings = new OutsourcedPart();
            bearings.setCompanyName("Bones");
            bearings.setName("Bearings");
            bearings.setInv(5);
            bearings.setPrice(25.0);
            bearings.setId(200L);
            bearings.setMinInv(0);
            bearings.setMaxInv(20);
            outsourcedPartRepository.save(bearings);

            OutsourcedPart trucks = new OutsourcedPart();
            trucks.setCompanyName("Independent");
            trucks.setName("Trucks");
            trucks.setInv(5);
            trucks.setPrice(55.0);
            trucks.setId(300L);
            trucks.setMinInv(0);
            trucks.setMaxInv(20);
            outsourcedPartRepository.save(trucks);

            OutsourcedPart wheels = new OutsourcedPart();
            wheels.setCompanyName("Spitfire");
            wheels.setName("Wheels");
            wheels.setInv(5);
            wheels.setPrice(40.0);
            wheels.setId(400L);
            wheels.setMinInv(0);
            wheels.setMaxInv(20);
            outsourcedPartRepository.save(wheels);

            OutsourcedPart grip = new OutsourcedPart();
            grip.setCompanyName("Mob");
            grip.setName("Grip Tape");
            grip.setInv(5);
            grip.setPrice(10.0);
            grip.setId(500L);
            grip.setMinInv(0);
            grip.setMaxInv(20);
            outsourcedPartRepository.save(grip);
        }

        /*
        OutsourcedPart thePart = null;
        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
            if(part.getName().equals("out test"))thePart = part;
        }

        System.out.println(thePart.getCompanyName());

        List<OutsourcedPart> outsourcedParts = (List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts) {
            System.out.println(part.getName() + " " + part.getCompanyName());
        }
        */

        if (productRepository.count() == 0) {
            Product cruiser = new Product("Cruiser Board", 250.0, 15);
            Product skateboard = new Product("Skateboard", 250.0, 15);
            Product longBoard = new Product("Long Board", 300.0, 15);
            Product surfSkate = new Product("Surf Skate", 275.0, 15);
            Product electricBoard = new Product("Electric Skateboard", 500.0, 15);
            productRepository.save(cruiser);
            productRepository.save(skateboard);
            productRepository.save(longBoard);
            productRepository.save(surfSkate);
            productRepository.save(electricBoard);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products" + productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts" + partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
