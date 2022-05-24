package com.salomonandres.CDStoreManagement.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("api/client")
public class ClientController {

    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getClients(){
        return clientService.getClients();
    }

    @PostMapping
    public void registerNewClient(@RequestBody Client client){
        clientService.registerClient(client);
    }

    @PutMapping(path= "{clientId}")
    public void updateClient(
            @PathVariable("clientId") BigInteger clientId,
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName,
            @RequestParam(required = false) String billingAddress,
            @RequestParam(required = false) Integer zipCode,
            @RequestParam(required = false) String email
            ){
        clientService.updateClient(clientId,firstName,lastName,billingAddress,zipCode,email);
    }
    @DeleteMapping(path = "{clientId}")
    public void deleteClient(@PathVariable("clientId") BigInteger clientId){
        clientService.deleteClient(clientId);
    }

}
