
package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class cfmaterialappbar {
    public static RemoteObject myClass;
	public cfmaterialappbar() {
	}
    public static PCBA staticBA = new PCBA(null, cfmaterialappbar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fx = RemoteObject.declareNull("anywheresoftware.b4j.objects.JFX");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
public static RemoteObject _innerpane = RemoteObject.declareNull("anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper");
public static RemoteObject _innerbutton = RemoteObject.declareNull("anywheresoftware.b4j.objects.ButtonWrapper");
public static RemoteObject _titlelabel = RemoteObject.declareNull("anywheresoftware.b4j.objects.LabelWrapper");
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
		return new Object[] {"CSSUtils",_ref.getField(false, "_cssutils"),"fx",_ref.getField(false, "_fx"),"InnerButton",_ref.getField(false, "_innerbutton"),"InnerPane",_ref.getField(false, "_innerpane"),"Label1",_ref.getField(false, "_label1"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"TitleLabel",_ref.getField(false, "_titlelabel")};
}
}