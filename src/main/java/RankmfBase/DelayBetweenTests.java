package RankmfBase;

import org.testng.ITestContext;
import org.testng.ITestListener;

public class DelayBetweenTests implements ITestListener {

    @Override
    public void onFinish(ITestContext context) {
        try {
            System.out.println("Waiting 10 seconds before next test...");
            Thread.sleep(25000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}