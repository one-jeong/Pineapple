/**
 * 2016-11-21
 * 어플의 계정 관리 엑티비티
 * @author jk
 * @version 1.0
 */

package pineapple.iq_quest;

public class You{
    private String age;
    private String name;
    private int ok=0;
    private int no=0;
    private int num=0;

    public void setNo(int no) {this.no += no;}

    public void setOk(int ok) {this.ok += ok;}

    public String getAge() {return age;}

    public String getName() {return name;}

    public int getNum() {return num;}

    public int getOk(){return ok;}
    public int getNo(){return no;}

    public You(String name, String age, int num){
        this.name = name;
        this.age = age;
        this.num = num;
    }
}
