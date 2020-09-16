package hari.apiTesting.utils;

/**
 * @author Harikrishna Recharla
 *
 */

public class Sample {
	
	public static void main(String[] args) {
	
		try {
		    Process proc = Runtime.getRuntime()
		                    .exec(new String[]{ "su", "-c", "am","start","-a","android.intent.action.ACTION_REQUEST_SHUTDOWN" });
		    
		    //su -c am start -a android.intent.action.ACTION_REQUEST_SHUTDOWN
		    proc.waitFor();
		} catch (Exception ex) {
		    ex.printStackTrace();
		}
	}

}
