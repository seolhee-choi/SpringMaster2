package hello_spring2.core.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
