
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

public class stringutility implements IRemote{
	public static stringutility mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public stringutility() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new stringutility();
		remoteMe = RemoteObject.declareNull("Punchline.Tech.Cuppy.Framework.stringutility");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("stringutility"), "Punchline.Tech.Cuppy.Framework.stringutility");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, stringutility.class);
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
		pcBA = new PCBA(this, stringutility.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public static Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
  public Object[] GetGlobals() {
		return new Object[] {"AnimationManager",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.animationmanager.class),"AppUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.apputility.class),"Configs",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.configs.class),"ControlsUtils",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.controlsutils.class),"CSSUtils",stringutility._cssutils,"DataTypeUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.datatypeutility.class),"FileUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.fileutility.class),"fx",stringutility._fx,"LicenseManager",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.licensemanager.class),"Main",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.main.class),"MathUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.mathutility.class),"StyleManager",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.stylemanager.class)};
}
}