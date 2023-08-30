package study.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.datajpa.entity.Member;

import java.time.LocalDateTime;
import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByUsernameAndAgeGreaterThan(String username, int age);

    // 예시 selectQuery
    Member findByUsername(String username);
    Member getByUsername(String username);
    Member readByUsername(String username);
    Member queryByUsername(String username);
    Member searchByUsername(String username);

    // 예시 First, Top
    List<Member> findFirst3ByUsername(String username); // 상위 3개의 데이터
    List<Member> findTop3ByUsername(String username); // 상위 3개의 데이터

    // 예시 And Or
    List<Member> findByUsernameAndEmail(String username, String email);
    List<Member> findByUsernameOrEmail(String username, String email);

    //예시 After, Before, GreaterThan, LessThan, Between
    List<Member> findByCreateAtAfter (LocalDateTime lastDay); //(lastDay 미포함)
    List<Member> findByCreateAtBefore (LocalDateTime lastDay); //(lastDay 미포함)
    List<Member> findByIdGreaterThan( Long id); // (id 미포함)
    List<Member> findByIdGreaterThanEqual( Long id); // (id 포함)
    List<Member> findByIdLessThanEqual( Long id); // (id 포함)
    List<Member> findByIdBetween(Long id1, Long id2);

    //예시 is(Not)Empty, is(Not)Null
    List<Member> findByIdIsNotNull();
    List<Member> findByIdIsNotEmpty();

    // 예시 In
    List<Member> findByUsernameIn(List<String> username);

    //예시 StartingWith/EndingWith/Contains
    List<Member> findByUsernameStartingWith(String username);
    List<Member> findByUsernameEndingWith(String username);
    List<Member> findByUsernameContains(String username);
    List<Member> findByUsernameLike(String username);

    // 예시 Sorting
    List<Member> findByUsernameOrderByIdDesc(String username);
    List<Member> findByUsernameOrderByIdDescEmailAsc(String username);
}
