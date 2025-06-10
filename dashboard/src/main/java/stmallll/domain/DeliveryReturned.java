package stmallll.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.Data;
import stmallll.infra.AbstractEvent;

@Data
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String customerId;
    private String itemId;
    private Integer qty;
    private String address;
}
