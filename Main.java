//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SportCenter sc = new SportCenter(10);

        Member a = new Member("Ali" , "Tas" , 70 , 1.70);
        Member b = new Member("Ahmet" , "Erdak" , 100 , 1.80);
        Member c = new Member("Aylin" , "Yilmaz" , 40,1.75);

        sc.addMember(a);
        sc.addMember(b);
        sc.addMember(c);

        sc.printMembers();

        System.out.println("member a weight status : " + a.weightStatus());
        System.out.println("member b weight status : " + b.weightStatus());
        System.out.println("member c weight status : " + c.weightStatus());

        System.out.println(sc.searchMember("Aylin ", "Yilmaz" ));
    }
}