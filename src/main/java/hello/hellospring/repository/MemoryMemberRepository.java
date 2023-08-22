public class MenberMemberRepository implements MenberMemberRepository{
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;
    
    @Override
    public Member aave(Member){
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findId(Lang id){
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findName(String name){
        store.values().stream()
            .filter(member -> member.getNmae().equals(name))
            .findAny();
    }

    @Override
    public List<Member> findAll(){
        return ArrayList<>(store.values);
    }
}