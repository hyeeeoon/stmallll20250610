package stmallll.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stmallll.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "deliveries",
    path = "deliveries"
)
public interface DeliveryRepository
    extends PagingAndSortingRepository<Delivery, Long> {}
