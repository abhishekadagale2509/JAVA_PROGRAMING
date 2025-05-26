int no;
int sum=0;
int temp=no;
while(no!=0){
    for(int i=0;i<no;i++){
        if(no%i==0){
            sum=sum+i;
        }
    }
}
if(sum==temp){
    System.out.printf("no is perfect");

}
else{
    System.out.printf("no is not perfect");
}