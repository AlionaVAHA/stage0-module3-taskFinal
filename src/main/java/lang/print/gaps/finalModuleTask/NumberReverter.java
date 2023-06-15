package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
                int hund = number/100;
        int resHund = hund*100;
        int dec= number-resHund;
        int decRes = dec/10;
        int dResult = decRes*10;
        int digitRes = dec-dResult;
        System.out.println(digitRes+""+decRes+""+hund);

    }
}
