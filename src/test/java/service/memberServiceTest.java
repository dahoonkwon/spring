package hello.hellospring.service;

import org.junit.jupiter.Test;

class MemberServiceTest {

    memberService memberService = new MemberService();

    @Test
    void join(){
        //given
        Member member = new Member();
        member.setName("hello");

        //when
        Long saveId = memberService.join(member);

        //then
        Member findMember = memberService.findOne(saveId).get();
        assertThat(member.get()).isEqualTo(findMember.getName());
         
    }

    @Test
    public void 중복_회원_예외(){
        //gvien
        Member member1 = new member();
        member1.setName("spring");

        Member member2 = new member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        try {
            memberService.join(member2);
            fail();
        } catch (IllegalStateException e) {
            // TODO: handle exception
        }
        //then
    }

    @Test
    void findMembers(){

    }

    @Test
    void findOne(){
         
    }
}

