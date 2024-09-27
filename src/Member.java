public class Member {
    public String name;
    public int age;
    private String memberId;
    private int noOfBooks;

    public Member(String Name,int Age,String MemberId,int NoOfBooks){
        name = Name;
        age = Age;
        memberId = MemberId;
        noOfBooks = NoOfBooks;
        System.out.println("Member: " + name + " " + age + " " + memberId + " " + noOfBooks);
    }

    public String getMemberId(){
        return memberId;
    }
    public int getNoOfBooks(){
        return noOfBooks;
    }
}
