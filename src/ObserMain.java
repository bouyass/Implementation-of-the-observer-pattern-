import com.lyes.observers.BinaryObserver;
import com.lyes.observers.OctalObserver;
import com.lyes.subjects.Subject;

public class ObserMain {

	public static void main(String[] args) throws InterruptedException {
		Subject subject = new Subject(0);
		OctalObserver ob = new OctalObserver(subject);
		BinaryObserver bo = new BinaryObserver(subject);
		
		subject.setState(2);
		
		Thread.sleep(2000);
		
		subject.setState(10);
	}

}
