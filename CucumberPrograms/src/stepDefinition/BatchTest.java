package stepDefinition;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({Login.class,Addemployee.class,Failure.class
	                                             ,Logout.class})
public class BatchTest {

}






