/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.webService;

import br.com.senac.entidade.Endereco;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.api.client.WebResource;

/**
 *
 * @author ana.correa8
 */
public class CepRest {

    private Client client;
    private WebResource webResource;
    
    public CepRest() {
        ClientConfig clientConfig = new DefaultClientConfig(GensonProvider.class);
        client = Client.create(clientConfig);
        //utilizado para imprimir as operações no console
        client.addFilter(new LoggingFilter(System.out));
        webResource = client.resource("https://viacep.com.br/ws/");
    }
    
    public Endereco pesquisarCep(String cep){
       return webResource.path(cep).path("/json").get(Endereco.class);
    } 
    
}
