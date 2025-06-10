package stmallll.domain;

import java.util.*;
import lombok.*;
import stmallll.domain.*;
import stmallll.infra.AbstractEvent;

@Data
@ToString
public class StockIncreased extends AbstractEvent {

    private Long id;
    private String name;
    private Integer stock;
}
