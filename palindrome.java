int no;
int temp=no;
int rev=0;
while(no!=0){
    rem=no%10;
    no=no/10;
    rev=rev*10+rem;
}
if(rev==temp){
    System.out.prinln("no is palindrome");

}else
{
    System.out.printf("no is not palinrome");
}