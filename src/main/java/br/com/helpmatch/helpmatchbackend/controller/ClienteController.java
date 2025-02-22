package br.com.helpmatch.helpmatchbackend.controller;

import br.com.helpmatch.helpmatchbackend.dto.ClienteDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    ClienteDto clienteDto;
    @PostMapping("/cliente")
    public ResponseEntity<ClienteDto> saveCliente(@RequestBody  ClienteDto  ClienteDto){
        ClienteDto clienteDto =new ClienteDto();
        BeanUtils.copyProperties(clienteDto, clienteDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteDto);

    }
}

