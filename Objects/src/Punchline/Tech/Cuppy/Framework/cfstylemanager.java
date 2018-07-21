package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfstylemanager extends Object{
public static cfstylemanager mostCurrent = new cfstylemanager();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfstylemanager", null);
		ba.loadHtSubs(cfstylemanager.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cfstylemanager", ba);
		}
	}
    public static Class<?> getObject() {
		return cfstylemanager.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _defaultfont = null;
public static Punchline.Tech.Cuppy.Framework.cfthemes _availablethemes = null;
public static anywheresoftware.b4a.objects.collections.Map _defaulttheme = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cflicensemanager _cflicensemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfhtmlutility _cfhtmlutility = null;
public static anywheresoftware.b4a.objects.collections.Map  _fonttypes() throws Exception{
anywheresoftware.b4a.objects.collections.Map _ftypes = null;
 //BA.debugLineNum = 15;BA.debugLine="Public Sub FontTypes As Map";
 //BA.debugLineNum = 17;BA.debugLine="Dim FTypes As Map";
_ftypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 18;BA.debugLine="FTypes.Initialize";
_ftypes.Initialize();
 //BA.debugLineNum = 20;BA.debugLine="FTypes.Put(\"Black\",\"Roboto-Black.ttf\")";
_ftypes.Put((Object)("Black"),(Object)("Roboto-Black.ttf"));
 //BA.debugLineNum = 21;BA.debugLine="FTypes.Put(\"BlackItalic\",\"Roboto-BlackItalic.ttf\"";
_ftypes.Put((Object)("BlackItalic"),(Object)("Roboto-BlackItalic.ttf"));
 //BA.debugLineNum = 23;BA.debugLine="FTypes.Put(\"Bold\",\"Roboto-Bold.ttf\")";
_ftypes.Put((Object)("Bold"),(Object)("Roboto-Bold.ttf"));
 //BA.debugLineNum = 24;BA.debugLine="FTypes.Put(\"BoldItalic\",\"Roboto-BoldItalic.ttf\")";
_ftypes.Put((Object)("BoldItalic"),(Object)("Roboto-BoldItalic.ttf"));
 //BA.debugLineNum = 26;BA.debugLine="FTypes.Put(\"Italic\",\"Roboto-Italic.ttf\")";
_ftypes.Put((Object)("Italic"),(Object)("Roboto-Italic.ttf"));
 //BA.debugLineNum = 27;BA.debugLine="FTypes.Put(\"Light\",\"Roboto-Light.ttf\")";
_ftypes.Put((Object)("Light"),(Object)("Roboto-Light.ttf"));
 //BA.debugLineNum = 29;BA.debugLine="FTypes.Put(\"LightItalic\",\"Roboto-LightItalic.ttf\"";
_ftypes.Put((Object)("LightItalic"),(Object)("Roboto-LightItalic.ttf"));
 //BA.debugLineNum = 30;BA.debugLine="FTypes.Put(\"Medium\",\"Roboto-Medium.ttf\")";
_ftypes.Put((Object)("Medium"),(Object)("Roboto-Medium.ttf"));
 //BA.debugLineNum = 32;BA.debugLine="FTypes.Put(\"MediumItalic\",\"Roboto-MediumItalic.tt";
_ftypes.Put((Object)("MediumItalic"),(Object)("Roboto-MediumItalic.ttf"));
 //BA.debugLineNum = 33;BA.debugLine="FTypes.Put(\"Regular\",\"Roboto-Regular.ttf\")";
_ftypes.Put((Object)("Regular"),(Object)("Roboto-Regular.ttf"));
 //BA.debugLineNum = 35;BA.debugLine="FTypes.Put(\"Thin\",\"Roboto-Thin.ttf\")";
_ftypes.Put((Object)("Thin"),(Object)("Roboto-Thin.ttf"));
 //BA.debugLineNum = 36;BA.debugLine="FTypes.Put(\"ThinItalic\",\"Roboto-ThinItalic.ttf\")";
_ftypes.Put((Object)("ThinItalic"),(Object)("Roboto-ThinItalic.ttf"));
 //BA.debugLineNum = 38;BA.debugLine="Return FTypes";
if (true) return _ftypes;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 6;BA.debugLine="Public DefaultFont As Font = SelectFont(\"Regular\"";
_defaultfont = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_defaultfont = _selectfont("Regular",12);
 //BA.debugLineNum = 7;BA.debugLine="Public AvailableThemes As CFThemes";
_availablethemes = new Punchline.Tech.Cuppy.Framework.cfthemes();
 //BA.debugLineNum = 8;BA.debugLine="Public DefaultTheme As Map = AvailableThemes.The";
_defaulttheme = new anywheresoftware.b4a.objects.collections.Map();
_defaulttheme.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_availablethemes._themeslist().Get((Object)("Blue"))));
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _selectfont(String _font,double _fontsize) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub SelectFont(font As String,  FontSize As";
 //BA.debugLineNum = 46;BA.debugLine="Return  fx.LoadFont(CFConfigs.RobotoFontsPath , F";
if (true) return _fx.LoadFont(_cfconfigs._robotofontspath,BA.ObjectToString(_fonttypes().Get((Object)(_font))),_fontsize);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
}
