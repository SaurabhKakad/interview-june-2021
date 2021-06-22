package exam;

public class ConvertToBinary {

  public String toBinary() {
    int n,k;
    String a = "";
    Scanner s = new Scanner(System.in);
    System.out.print("Enter Decimal no");
    n=s.nextInt();
    while(n > 0)
    {
      int b = n % 2;
      a = b + a;
      n = n / 2;
    }
    System.out.println(a);
    return 0;
  }
}
