package jpabook.jpashop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.html.Option;

import java.util.Optional;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberRepositoryTest {
    @Autowired
    MemberRepository repo;

    @Test
    @Transactional
    public void testMember() throws Exception{
        //given
        Member member=new Member();
        member.setUsername("은지");

        //when
        repo.save(member);

        //then
        Optional<Member> findMember=repo.findByUsername("은지");
        if(findMember.isPresent()){
            //저장이 됨
            System.out.println("저장 됨");
        }
    }


}