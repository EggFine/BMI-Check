import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // 程序自白
        System.out.println("BMI指数检查: BMI Checker");
        System.out.println("开发者: EggFine | Development By EggFine");
        System.out.println("GitHub: https://github.com/EggFine");

        System.out.print("\n请输入您的身高(单位为: 米(m)): ");
        double userHeight = new Scanner(System.in).nextDouble();
        System.out.print("\n请输入您的体重(单位为: 千克(kg)): ");
        double userWeight = new Scanner(System.in).nextDouble();
        getBMI(userHeight,userWeight);
    }
    public static void getBMI(double Height,double Weight){
        double BMI = Weight / (Height * Height);
        System.out.println("您的BMI指数为: " + BMI);
        String BMIInfo="Error";
        if(BMI < 18.5){
            BMIInfo = "过轻";
        }else if(BMI <= 22.9){
            BMIInfo = "正常";
        }else if(BMI <= 24.9){
            BMIInfo = "偏胖";
        }else if(BMI <= 29.9) {
            BMIInfo = "肥胖";
        }else if(BMI <= 40) {
            BMIInfo = "重度肥胖";
        }else{
            BMIInfo = "Tank";
        }
        System.out.println("根据您的BMI, 我们得出您的身体处于 " + BMIInfo + " 状态");
    }
}
