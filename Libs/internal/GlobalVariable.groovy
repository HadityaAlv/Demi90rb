package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object user1
     
    /**
     * <p></p>
     */
    public static Object user2
     
    /**
     * <p></p>
     */
    public static Object user3
     
    /**
     * <p></p>
     */
    public static Object user4
     
    /**
     * <p></p>
     */
    public static Object password
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            user1 = selectedVariables['user1']
            user2 = selectedVariables['user2']
            user3 = selectedVariables['user3']
            user4 = selectedVariables['user4']
            password = selectedVariables['password']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
