import java.util.concurrent.CountDownLatch;

public class Bar {

	

        Runnable firstRunnable;
        Runnable secondRunnable;
        Runnable thirdRunnable;

        CountDownLatch latchSecond = new CountDownLatch(1);
        CountDownLatch latchThird = new CountDownLatch(1);

        public void bar() {

        }

        public void first(Runnable printFirst) throws InterruptedException {
            // printFirst.run() 는 "first"를 출력합니다. 이 줄을 변경하거나 제거하지 마십시오.
            printFirst.run();

            latchSecond.countDown();
        }

        public void second(Runnable printSecond) throws InterruptedException {

            latchSecond.await();

            // printSecondst.run() 는 "second"를 출력합니다. 이 줄을 변경하거나 제거하지 마십시오.
            printSecond.run();
            latchThird.countDown();
        }

        public void third(Runnable printThird) throws InterruptedException {

            latchSecond.await();
            latchThird.await();

            // printThird.run() 는 "first"를 출력합니다. 이 줄을 변경하거나 제거하지 마십시오.
            printThird.run();
        }
    }
