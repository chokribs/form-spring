package tn.benkalifa.kitchenstory.api.controller.api;


import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import tn.benkalifa.kitchenstory.api.model.Product;
import tn.benkalifa.kitchenstory.api.util.Constants;
@Api("products")
public interface ProductApi {
	@GetMapping(value = Constants.APP_ROOT + "/products/all", produces = MediaType.APPLICATION_JSON_VALUE)
	  @ApiOperation(value = "Renvoi la liste des produits", notes = "Cette methode permet de chercher et renvoyer la liste des produits qui existent "
	      + "dans la BDD", responseContainer = "List<Product>")
	  @ApiResponses(value = {
	      @ApiResponse(code = 200, message = "La liste des produits / Une liste vide")
	  })
	  List<Product> findAll();
}
