package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
int thoun = number/1000;
int thResult = thoun*1000;
int sHund =number-thResult;
int hund = sHund/100;
int reslHund = hund*100;
int hResult = sHund-reslHund;
int decS = hResult/10;
int decR = decS*10;
int dRes = hResult-decR;
 System.out.println(thoun+hund+decS+dRes);

    }
}
