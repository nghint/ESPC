package org.spc.web.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.spc.web.model.CustomerInfo;

@Data
@AllArgsConstructor
public class CustomerForm {
    private String name;
    private String address;
    private String email;
    private String phone;

    private boolean valid;

    public CustomerForm(CustomerInfo customerInfo) {
        if (customerInfo != null) {
            this.name = customerInfo.getName();
            this.address = customerInfo.getAddress();
            this.email = customerInfo.getEmail();
            this.phone = customerInfo.getPhone();
        }
    }
}
