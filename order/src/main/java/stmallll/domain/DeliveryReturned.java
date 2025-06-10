package stmallll.domain;

import java.util.*;
import lombok.*;
import stmallll.domain.*;
import stmallll.infra.AbstractEvent;

@Data
@ToString
public class DeliveryReturned extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String customerId;
    private String itemId;
    private Integer qty;
    private String address;
}
