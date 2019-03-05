package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Model401ErrorResponse;
import io.swagger.model.Model403ErrorResponse;
import io.swagger.model.Model404ErrorResponse;
import io.swagger.model.Payment;
import io.swagger.model.PaymentOrderConsentResponse;
import io.swagger.model.PaymentOrderRequest;
import io.swagger.model.PaymentOrderResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-05T18:59:42.061Z")

@Controller
public class PaymentOrderApiController implements PaymentOrderApi {

    private static final Logger log = LoggerFactory.getLogger(PaymentOrderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public PaymentOrderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Payment> getPaymentConsent(@Pattern(regexp="^\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}$") @Size(min=36,max=36) @ApiParam(value = "Order id Number of current payment",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "The JWT Token generated from Get API Token" ) @RequestHeader(value="x-dnbapi-jwt", required=false) String xDnbapiJwt,@ApiParam(value = "The API key from your app page in DNB Developer" ) @RequestHeader(value="x-api-key", required=false) String xApiKey) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Payment>(objectMapper.readValue("{  \"debtorAccount\" : {    \"identification\" : \"00100\",    \"name\" : \"Santander\",    \"destinationDNI\" : \"14000000\"  },  \"creditorAccount\" : {    \"identification\" : \"00100\",    \"name\" : \"Santander\",    \"destinationDNI\" : \"14000000\"  },  \"instructedAmount\" : {    \"amount\" : 100000.0,    \"currency\" : 152.0  },  \"status\" : \"APPROVED\"}", Payment.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Payment>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Payment>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Payment> getPaymentDue(@Pattern(regexp="^\\w{8}-\\w{4}-\\w{4}-\\w{4}-\\w{12}$") @Size(min=36,max=36) @ApiParam(value = "Order id Number of current payment",required=true) @PathVariable("orderId") String orderId,@ApiParam(value = "The JWT Token generated from Get API Token" ) @RequestHeader(value="x-dnbapi-jwt", required=false) String xDnbapiJwt,@ApiParam(value = "The API key from your app page in DNB Developer" ) @RequestHeader(value="x-api-key", required=false) String xApiKey) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Payment>(objectMapper.readValue("{  \"debtorAccount\" : {    \"identification\" : \"00100\",    \"name\" : \"Santander\",    \"destinationDNI\" : \"14000000\"  },  \"creditorAccount\" : {    \"identification\" : \"00100\",    \"name\" : \"Santander\",    \"destinationDNI\" : \"14000000\"  },  \"instructedAmount\" : {    \"amount\" : 100000.0,    \"currency\" : 152.0  },  \"status\" : \"APPROVED\"}", Payment.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Payment>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Payment>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentOrderResponse> paymentOrder(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PaymentOrderRequest body,@ApiParam(value = "The JWT Token generated from Get API Token" ) @RequestHeader(value="x-dnbapi-jwt", required=false) String xDnbapiJwt,@ApiParam(value = "The API key from your app page in DNB Developer" ) @RequestHeader(value="x-api-key", required=false) String xApiKey) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentOrderResponse>(objectMapper.readValue("{  \"orderId\" : \"12345\",  \"payment\" : {    \"debtorAccount\" : {      \"identification\" : \"00100\",      \"name\" : \"Santander\",      \"destinationDNI\" : \"14000000\"    },    \"creditorAccount\" : {      \"identification\" : \"00100\",      \"name\" : \"Santander\",      \"destinationDNI\" : \"14000000\"    },    \"instructedAmount\" : {      \"amount\" : 100000.0,      \"currency\" : 152.0    },    \"status\" : \"APPROVED\"  },  \"transactionId\" : \"000012345\"}", PaymentOrderResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentOrderResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentOrderResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<PaymentOrderConsentResponse> paymentOrderConsent(@ApiParam(value = "" ,required=true )  @Valid @RequestBody PaymentOrderRequest body,@ApiParam(value = "The JWT Token generated from Get API Token" ) @RequestHeader(value="x-dnbapi-jwt", required=false) String xDnbapiJwt,@ApiParam(value = "The API key from your app page in DNB Developer" ) @RequestHeader(value="x-api-key", required=false) String xApiKey) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<PaymentOrderConsentResponse>(objectMapper.readValue("{  \"orderId\" : \"12345\",  \"description\" : \"Payment order consent created\"}", PaymentOrderConsentResponse.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<PaymentOrderConsentResponse>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<PaymentOrderConsentResponse>(HttpStatus.NOT_IMPLEMENTED);
    }

}
