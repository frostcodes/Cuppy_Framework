
package Punchline.Tech.Cuppy.Framework;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class cfcontrolsutils implements IRemote{
	public static cfcontrolsutils mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public cfcontrolsutils() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new cfcontrolsutils();
		remoteMe = RemoteObject.declareNull("Punchline.Tech.Cuppy.Framework.cfcontrolsutils");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("cfcontrolsutils"), "Punchline.Tech.Cuppy.Framework.cfcontrolsutils");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, cfcontrolsutils.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
    public static RemoteObject getObject() {
		return myClass;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
		pcBA = new PCBA(this, cfcontrolsutils.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
  public Object[] GetGlobals() {
		return new Object[] {"CFAnimationManager",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfanimationmanager.class),"CFAppUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfapputility.class),"CFConfigs",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfconfigs.class),"CFDataGeneratorUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfdatageneratorutility.class),"CFDataTypeUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfdatatypeutility.class),"CFFileUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cffileutility.class),"CFMathUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfmathutility.class),"CFStringUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfstringutility.class),"CFStyleManager",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfstylemanager.class),"CSSUtils",cfcontrolsutils._cssutils,"fx",cfcontrolsutils._fx,"Main",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.main.class)};
}
}