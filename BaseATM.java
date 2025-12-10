package PackageMiniProject;

public abstract class BaseATM implements ATMFunctions {
	
	   protected User user;

	    public BaseATM(User user) {
	        this.user = user;
	    }

}
