package cloud.yalda.www.yaldaIdentity.repo;


import cloud.yalda.www.yaldaIdentity.CustomeExceptions.UserException;
import cloud.yalda.www.yaldaIdentity.dto.*;
import cloud.yalda.www.yaldaIdentity.helper.Utils;
import cloud.yalda.www.yaldaIdentity.model.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Repository
public interface PersonRepo extends PagingAndSortingRepository<Person,Long> {

    Optional<Person> findDistinctByEmail(String email);
    Optional<Person> findDistinctByUserId(String userId);
    boolean existsByEmail(String email);
    boolean existsByEmailAndPassword(String email,String password);



}
