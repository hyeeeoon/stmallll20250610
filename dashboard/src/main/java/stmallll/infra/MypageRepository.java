package stmallll.infra;

import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import stmallll.domain.*;

@RepositoryRestResource(collectionResourceRel = "mypages", path = "mypages")
public interface MypageRepository
    extends PagingAndSortingRepository<Mypage, Long> {}
