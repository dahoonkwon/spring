package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import hello.hellospring.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    private  final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){

        this.memberService = memberService;
    }

     @GetMapping("/member/new")
    public String createForm(){
        return "members/createMembersForm";
     }

     @PostMapping("/members/new")
    public String crate(@NotNull MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);
        return "redirect:/";
     }
}
