class{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to chekce the palindroum");
        String str=sc.nextLine();
        String revString="";
        for(int i=str.legnth()-1;i>=0;i--){
            revString=revString+str.charAt(i);
        }
        if(str.equals(revString)){
            System.out.println("The given string is Palindroum::");
        }else{
            System.out.println("The given String is not a palindroum::");
        }
    }
}