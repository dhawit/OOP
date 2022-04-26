class WeekDays
{
    public static void main(String s[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the week number");
        int day = scanner.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            default:
                System.out.println("Sunday");
                break;
        }
    }
}

class CheckEvenOddSwitch{
    public static void main (String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");

        int num2=scanner.nextInt();
        switch(num2%2){
            case 0:
                System.out.println(num2+ "is a Even number");
                break;
            case 1:
                System.out.println(num2+" is a Odd number");
        }
    }
}

class greatersmaller{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int num1=scanner.nextInt();
        System.out.println("Enter second number");
        int num2=scanner.nextInt();
        switch((a<b)?0:(b<a)?1:2);
        {
        }
    }

}
