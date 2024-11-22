import org.jnativehook.GlobalScreen;
import org.jnativehook.NativeHookException;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class AutoClicker implements NativeKeyListener {
    private static boolean clicking = false;
    private static final int CPS = 120; // Clicks per second
    private static Robot robot;

    public static void main(String[] args) {
        try {
            robot = new Robot();
            GlobalScreen.registerNativeHook();
        } catch (AWTException | NativeHookException e) {
            e.printStackTrace();
            return;
        }

        GlobalScreen.addNativeKeyListener(new AutoClicker());
        Thread clickThread = new Thread(() -> {
            while (true) {
                if (clicking) {
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    try {
                        Thread.sleep(1000 / CPS);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread.sleep(100); // Reduce CPU usage when not clicking
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        clickThread.start();
        System.out.println("Press 'Z' to start/stop clicking.");
    }

    @Override
    public void nativeKeyPressed(NativeKeyEvent e) {
        if (e.getKeyCode() == NativeKeyEvent.VC_Z) {
            clicking = !clicking;
            if (clicking) {
                System.out.println("Clicking started.");
            } else {
                System.out.println("Clicking stopped.");
            }
        }
    }

    @Override
    public void nativeKeyReleased(NativeKeyEvent e) {}

    @Override
    public void nativeKeyTyped(NativeKeyEvent e) {}
}
