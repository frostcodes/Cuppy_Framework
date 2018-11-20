
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

public class cfstylemanager implements IRemote{
	public static cfstylemanager mostCurrent;
	public static RemoteObject ba;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public cfstylemanager() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new cfstylemanager();
		remoteMe = RemoteObject.declareNull("Punchline.Tech.Cuppy.Framework.cfstylemanager");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("cfstylemanager"), "Punchline.Tech.Cuppy.Framework.cfstylemanager");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, cfstylemanager.class);
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
		pcBA = new PCBA(this, cfstylemanager.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _availablethemes = RemoteObject.declareNull("Punchline.Tech.Cuppy.Framework.cfthemes");
public static RemoteObject _defaulttheme = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _font_black = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _font_black_italic = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _font_bold = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _font_bold_italic = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _font_light = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _font_light_italic = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _font_regular_font = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _font_italic = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _font_medium = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _font_medium_italic = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _font_thin = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _font_thin_italic = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX.FontWrapper");
public static RemoteObject _theme_blue = RemoteObject.createImmutable("");
public static RemoteObject _theme_teal = RemoteObject.createImmutable("");
public static RemoteObject _theme_gray = RemoteObject.createImmutable("");
public static RemoteObject _theme_dark = RemoteObject.createImmutable("");
public static RemoteObject _theme_purple = RemoteObject.createImmutable("");
public static RemoteObject _theme_pink = RemoteObject.createImmutable("");
public static RemoteObject _theme_amber = RemoteObject.createImmutable("");
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
  public Object[] GetGlobals() {
		return new Object[] {"AvailableThemes",cfstylemanager._availablethemes,"CFAnimationManager",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfanimationmanager.class),"CFAppUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfapputility.class),"CFConfigs",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfconfigs.class),"CFControlsUtils",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfcontrolsutils.class),"CFDataGeneratorUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfdatageneratorutility.class),"CFDataTypeUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfdatatypeutility.class),"CFFileUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cffileutility.class),"CFMathUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfmathutility.class),"CFStringUtility",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.cfstringutility.class),"CSSUtils",cfstylemanager._cssutils,"DefaultTheme",cfstylemanager._defaulttheme,"FONT_BLACK",cfstylemanager._font_black,"FONT_BLACK_ITALIC",cfstylemanager._font_black_italic,"FONT_BOLD",cfstylemanager._font_bold,"FONT_BOLD_ITALIC",cfstylemanager._font_bold_italic,"FONT_ITALIC",cfstylemanager._font_italic,"FONT_LIGHT",cfstylemanager._font_light,"FONT_LIGHT_ITALIC",cfstylemanager._font_light_italic,"FONT_MEDIUM",cfstylemanager._font_medium,"FONT_MEDIUM_ITALIC",cfstylemanager._font_medium_italic,"FONT_REGULAR_FONT",cfstylemanager._font_regular_font,"FONT_THIN",cfstylemanager._font_thin,"FONT_THIN_ITALIC",cfstylemanager._font_thin_italic,"fx",cfstylemanager._fx,"Main",Debug.moduleToString(Punchline.Tech.Cuppy.Framework.main.class),"THEME_AMBER",cfstylemanager._theme_amber,"THEME_BLUE",cfstylemanager._theme_blue,"THEME_DARK",cfstylemanager._theme_dark,"THEME_GRAY",cfstylemanager._theme_gray,"THEME_PINK",cfstylemanager._theme_pink,"THEME_PURPLE",cfstylemanager._theme_purple,"THEME_TEAL",cfstylemanager._theme_teal};
}
}