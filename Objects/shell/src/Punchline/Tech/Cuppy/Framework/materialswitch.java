
package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class materialswitch {
    public static RemoteObject myClass;
	public materialswitch() {
	}
    public static PCBA staticBA = new PCBA(null, materialswitch.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _switchbtn = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _switchpane = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _checked_state = RemoteObject.createImmutable(0);
public static RemoteObject _unchecked_state = RemoteObject.createImmutable(0);
public static RemoteObject _indeterminate_state = RemoteObject.createImmutable(0);
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public static Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CHECKED_STATE",_ref.getField(false, "_checked_state"),"CSSUtils",_ref.getField(false, "_cssutils"),"fx",_ref.getField(false, "_fx"),"INDETERMINATE_STATE",_ref.getField(false, "_indeterminate_state"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"SwitchBtn",_ref.getField(false, "_switchbtn"),"SwitchPane",_ref.getField(false, "_switchpane"),"UNCHECKED_STATE",_ref.getField(false, "_unchecked_state")};
}
}