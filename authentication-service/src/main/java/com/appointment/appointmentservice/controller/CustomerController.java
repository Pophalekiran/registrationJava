/*
 * package com.appointment.appointmentservice.controller;
 * 
 * import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.beans.factory.annotation.Value; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import com.appointment.appointmentservice.model.CustomerVo; import
 * com.appointment.appointmentservice.service.ICustomerService;
 * 
 * @RestController public class CustomerController {
 * 
 * 
 * @Autowired ICustomerService customerSrevice;
 * 
 * @Value("${server.name}") private String serverName;
 * 
 * @Value("${security.name}") private String security;
 * 
 * 
 * @GetMapping("/v1/customers") public List<CustomerVo> retrieveCustomers() {
 * System.out.println("Server name ::" +serverName);
 * System.out.println("Server name ::" +security); return
 * customerSrevice.retrieveCustomer();
 * 
 * }
 * 
 * }
 */