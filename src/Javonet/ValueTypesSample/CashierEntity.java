package Javonet.ValueTypesSample;import Common.Activation;import static Common.Helper.Convert;import static Common.Helper.getGetObjectName;import static Common.Helper.getReturnObjectName;import static Common.Helper.ConvertToConcreteInterfaceImplementation;import Common.Helper;import com.javonet.Javonet;
                        import com.javonet.JavonetException;
                        import com.javonet.JavonetFramework;
                        import com.javonet.api.NObject;
                        import com.javonet.api.NEnum;
                        import com.javonet.api.keywords.NRef;
                        import com.javonet.api.keywords.NOut;
                        import com.javonet.api.NControlContainer;import java.util.concurrent.atomic.AtomicReference;import Javonet.ValueTypesSample.*;public class CashierEntity {protected NObject javonetHandle; /**
	 * SetProperty
	 */
            public void setTest (java.lang.String value){ try { javonetHandle.set("Test",value);} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }/**
	 * GetProperty
	 */
            public java.lang.String getTest (){ try { return  (java.lang.String) javonetHandle.get("Test");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); return "";} }public CashierEntity (){ try {  javonetHandle = Javonet.New("CashierEntity");} catch (JavonetException _javonetException) { _javonetException.printStackTrace(); } }public CashierEntity(NObject handle) {this.javonetHandle=handle;}public void setJavonetHandle(NObject handle) {
                    this.javonetHandle = handle;
                }	static {
		try {
			Activation.initializeJavonet();
		} catch (java.lang.Exception e) {
			e.printStackTrace();
		}
	}}