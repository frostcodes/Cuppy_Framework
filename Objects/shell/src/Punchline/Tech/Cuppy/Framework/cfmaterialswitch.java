
package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cfmaterialswitch {
    public static RemoteObject myClass;
	public cfmaterialswitch() {
	}
    public static PCBA staticBA = new PCBA(null, cfmaterialswitch.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _switchbtn = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _switchpane = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _unchecked_state = RemoteObject.createImmutable(0);
public static RemoteObject _checked_state = RemoteObject.createImmutable(0);
public static RemoteObject _indeterminate_state = RemoteObject.createImmutable(0);
public static RemoteObject _firsttime = RemoteObject.createImmutable(false);
public static RemoteObject _cssutils = RemoteObject.declareNull("b4j.example.cssutils");
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"CHECKED_STATE",_ref.getField(false, "_checked_state"),"CSSUtils",_ref.getField(false, "_cssutils"),"FirstTime",_ref.getField(false, "_firsttime"),"fx",_ref.getField(false, "_fx"),"INDETERMINATE_STATE",_ref.getField(false, "_indeterminate_state"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"SwitchBtn",_ref.getField(false, "_switchbtn"),"SwitchPane",_ref.getField(false, "_switchpane"),"UNCHECKED_STATE",_ref.getField(false, "_unchecked_state")};
}
}