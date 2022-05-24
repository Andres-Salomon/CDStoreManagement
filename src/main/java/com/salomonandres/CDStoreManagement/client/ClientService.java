package com.salomonandres.CDStoreManagement.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigInteger;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients(){
    return clientRepository.findAll();
    }

    public void registerClient(Client client) {
        Optional<Client> clientByEmail=clientRepository.findByEmail(client.getEmail());
        if(clientByEmail.isPresent()){
            throw new IllegalStateException("Client with that email is already registered");
        }
        clientRepository.save(client);
    }

    @Transactional
    public void updateClient(BigInteger clientId, String firstName, String lastName, String billingAddress, Integer zipCode, String email) {
        Client client = clientRepository.findById(clientId).orElseThrow(()->
                new IllegalStateException("client with id"+ clientId+" not found"));

        if(firstName!=null && firstName.length()>0 && !Objects.equals(client.getFirstName(),firstName)){
            client.setFirstName(firstName);
        }

        if(lastName!=null && lastName.length()>0 && !Objects.equals(client.getLastName(),lastName)){
            client.setLastName(lastName);
        }

        if(billingAddress!=null && billingAddress.length()>0 && !Objects.equals(client.getBillingAddress(),billingAddress)){
            client.setBillingAddress(billingAddress);
        }

        if(zipCode!=null && zipCode!=0 && !Objects.equals(client.getZipCode(),zipCode)){
            client.setZipCode(zipCode);
        }

        if(email!=null && email.length()>0 && !Objects.equals(client.getEmail(),email)){
            client.setEmail(email);
        }
    }


    public void deleteClient(BigInteger clientId) {
        boolean exists=clientRepository.existsById(clientId);
        if(!exists){
            throw new IllegalStateException("Client with that id does not exist");
        }
        clientRepository.deleteById(clientId);
    }
}
