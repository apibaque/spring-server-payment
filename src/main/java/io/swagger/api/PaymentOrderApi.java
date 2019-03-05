/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.2).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Model401ErrorResponse;
import io.swagger.model.Model403ErrorResponse;
import io.swagger.model.Model404ErrorResponse;
import io.swagger.model.Payment;
import io.swagger.model.PaymentOrderConsentResponse;
import io.swagger.model.PaymentOrderRequest;
import io.swagger.model.PaymentOrderResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-05T18:59:42.061Z")

@Api(value = "payment-order", description = "the payment-order API")
public interface PaymentOrderApi {

    @ApiOperation(value = "Get due payment subscription for an order", nickname = "getPaymentConsent", notes = "A `due payment` is a scheduled operation on an `account`. It can be updated or deleted until its' due date. Once the payment date is reached, the due payments becomes a payment. When the payment is processed, it becomes a `transaction` on that account.", response = Payment.class, tags={ "Payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Payment.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Model401ErrorResponse.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Model403ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = Model404ErrorResponse.class) })
    @RequestMapping(value = "/payment-order/consent/{orderId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Payment> getPaymentConsent(@Pattern(regexp="^\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}$") @Size(min=36,max=36) @ApiParam(value = "Order id Number of current payment",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "The JWT Token generated from Get API Token" ) @RequestHeader(value="x-dnbapi-jwt", required=false) String xDnbapiJwt,@ApiParam(value = "The API key from your app page in DNB Developer" ) @RequestHeader(value="x-api-key", required=false) String xApiKey);


    @ApiOperation(value = "Get due payment subscription for an order", nickname = "getPaymentDue", notes = "A `due payment` is a scheduled operation on an `account`. It can be updated or deleted until its' due date. Once the payment date is reached, the due payments becomes a payment. When the payment is processed, it becomes a `transaction` on that account.", response = Payment.class, tags={ "Payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Request succeeded", response = Payment.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Model401ErrorResponse.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Model403ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = Model404ErrorResponse.class) })
    @RequestMapping(value = "/payment-order/{orderId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<Payment> getPaymentDue(@Pattern(regexp="^\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}$") @Size(min=36,max=36) @ApiParam(value = "Order id Number of current payment",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "The JWT Token generated from Get API Token" ) @RequestHeader(value="x-dnbapi-jwt", required=false) String xDnbapiJwt,@ApiParam(value = "The API key from your app page in DNB Developer" ) @RequestHeader(value="x-api-key", required=false) String xApiKey);


    @ApiOperation(value = "Curse payment transaction", nickname = "paymentOrder", notes = "Initiate a domestic payment going directly from client account with  order Id or message. The recieving account can be in whichever bank.  Accepts a ```paymentInitiation``` POST, and returns HTTP 201 with the ```PaymentId``` of the successfully created ```payment```.  ***Note**: As our sandbox is currently static, initiating payments unfortuntately won't reflect in neither the balance nor latest transactions of the account. While we are working hard to get you a dynamic sandbox, you may in the meanwhile look at it as finally having that infinite account never getting affected by your purchases.*", response = PaymentOrderResponse.class, tags={ "Payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Created", response = PaymentOrderResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Model401ErrorResponse.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Model403ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = Model404ErrorResponse.class) })
    @RequestMapping(value = "/payment-order",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PaymentOrderResponse> paymentOrder(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PaymentOrderRequest body,@ApiParam(value = "The JWT Token generated from Get API Token" ) @RequestHeader(value="x-dnbapi-jwt", required=false) String xDnbapiJwt,@ApiParam(value = "The API key from your app page in DNB Developer" ) @RequestHeader(value="x-api-key", required=false) String xApiKey);


    @ApiOperation(value = "Payment order registry", nickname = "paymentOrderConsent", notes = "Registry a domestic payment going directly from client account with  order id or message. The recieving registry notification.  Accepts a ```paymentInitiation``` POST, and returns HTTP 201 with the ```Operation description``` of the successfully created ```payment```.", response = PaymentOrderConsentResponse.class, tags={ "Payments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = PaymentOrderConsentResponse.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Model401ErrorResponse.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Model403ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = Model404ErrorResponse.class) })
    @RequestMapping(value = "/payment-order/consent",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<PaymentOrderConsentResponse> paymentOrderConsent(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PaymentOrderRequest body,@ApiParam(value = "The JWT Token generated from Get API Token" ) @RequestHeader(value="x-dnbapi-jwt", required=false) String xDnbapiJwt,@ApiParam(value = "The API key from your app page in DNB Developer" ) @RequestHeader(value="x-api-key", required=false) String xApiKey);

}