public class SportCenter {
    private Member[] members;
    private int count;

    public SportCenter(int capacity){
        members = new Member[capacity];
        count =0;
    }
    public void addMember(Member m){
        members[count]=m;
        count++;
    }
    public String searchMember(String name , String surname ){
        String member = "";
        for (int i = 0 ; i<count ; i++){
            if (members[i].getName().equals(name) && members[i].getSureName().equals(surname)){
                member = members[i].display();
                break;
            }
        }
        return member;
    }
    public void printMembers(){
        for (int i = 0 ; i< count ; i++){
            System.out.println(members[i].display());
        }
    }
}
