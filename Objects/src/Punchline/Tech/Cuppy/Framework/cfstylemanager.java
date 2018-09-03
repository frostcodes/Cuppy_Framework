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
public static anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvv5 = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _vv4 = null;
public static Punchline.Tech.Cuppy.Framework.cfthemes _vv5 = null;
public static anywheresoftware.b4a.objects.collections.Map _vv6 = null;
public static anywheresoftware.b4a.objects.collections.List _vv7 = null;
public static b4j.example.cssutils _vvvvvvvvvvvvvvv5 = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvv6 = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvv0 = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvv2 = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvv4 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvv5 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvv6 = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvv7 = null;
public static anywheresoftware.b4a.objects.collections.Map  _vv0() throws Exception{
anywheresoftware.b4a.objects.collections.Map _ftypes = null;
 //BA.debugLineNum = 18;BA.debugLine="Public Sub FontTypes As Map";
 //BA.debugLineNum = 20;BA.debugLine="Dim FTypes As Map";
_ftypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 21;BA.debugLine="FTypes.Initialize";
_ftypes.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="FTypes.Put(\"Black\",\"Roboto-Black.ttf\")";
_ftypes.Put((Object)("Black"),(Object)("Roboto-Black.ttf"));
 //BA.debugLineNum = 24;BA.debugLine="FTypes.Put(\"BlackItalic\",\"Roboto-BlackItalic.ttf\"";
_ftypes.Put((Object)("BlackItalic"),(Object)("Roboto-BlackItalic.ttf"));
 //BA.debugLineNum = 26;BA.debugLine="FTypes.Put(\"Bold\",\"Roboto-Bold.ttf\")";
_ftypes.Put((Object)("Bold"),(Object)("Roboto-Bold.ttf"));
 //BA.debugLineNum = 27;BA.debugLine="FTypes.Put(\"BoldItalic\",\"Roboto-BoldItalic.ttf\")";
_ftypes.Put((Object)("BoldItalic"),(Object)("Roboto-BoldItalic.ttf"));
 //BA.debugLineNum = 29;BA.debugLine="FTypes.Put(\"Italic\",\"Roboto-Italic.ttf\")";
_ftypes.Put((Object)("Italic"),(Object)("Roboto-Italic.ttf"));
 //BA.debugLineNum = 30;BA.debugLine="FTypes.Put(\"Light\",\"Roboto-Light.ttf\")";
_ftypes.Put((Object)("Light"),(Object)("Roboto-Light.ttf"));
 //BA.debugLineNum = 32;BA.debugLine="FTypes.Put(\"LightItalic\",\"Roboto-LightItalic.ttf\"";
_ftypes.Put((Object)("LightItalic"),(Object)("Roboto-LightItalic.ttf"));
 //BA.debugLineNum = 33;BA.debugLine="FTypes.Put(\"Medium\",\"Roboto-Medium.ttf\")";
_ftypes.Put((Object)("Medium"),(Object)("Roboto-Medium.ttf"));
 //BA.debugLineNum = 35;BA.debugLine="FTypes.Put(\"MediumItalic\",\"Roboto-MediumItalic.tt";
_ftypes.Put((Object)("MediumItalic"),(Object)("Roboto-MediumItalic.ttf"));
 //BA.debugLineNum = 36;BA.debugLine="FTypes.Put(\"Regular\",\"Roboto-Regular.ttf\")";
_ftypes.Put((Object)("Regular"),(Object)("Roboto-Regular.ttf"));
 //BA.debugLineNum = 38;BA.debugLine="FTypes.Put(\"Thin\",\"Roboto-Thin.ttf\")";
_ftypes.Put((Object)("Thin"),(Object)("Roboto-Thin.ttf"));
 //BA.debugLineNum = 39;BA.debugLine="FTypes.Put(\"ThinItalic\",\"Roboto-ThinItalic.ttf\")";
_ftypes.Put((Object)("ThinItalic"),(Object)("Roboto-ThinItalic.ttf"));
 //BA.debugLineNum = 41;BA.debugLine="Return FTypes";
if (true) return _ftypes;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 6;BA.debugLine="Public DefaultFont As Font = SelectFont(\"Regular\"";
_vv4 = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_vv4 = _vvv1("Regular",12);
 //BA.debugLineNum = 7;BA.debugLine="Public AvailableThemes As CFThemes";
_vv5 = new Punchline.Tech.Cuppy.Framework.cfthemes();
 //BA.debugLineNum = 8;BA.debugLine="Public DefaultTheme As Map = AvailableThemes.Them";
_vv6 = new anywheresoftware.b4a.objects.collections.Map();
_vv6.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_vv5._vvvvvvvvvvvvvvv4().Get((Object)("Blue"))));
 //BA.debugLineNum = 9;BA.debugLine="Public ActiveControls As List";
_vv7 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="ActiveControls.Initialize 'ignore : need this , b";
_vv7.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _vvv1(String _fontname,double _fontsize) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Public Sub SelectFont(fontName As String,  FontSiz";
 //BA.debugLineNum = 48;BA.debugLine="Return fx.LoadFont(File.DirAssets , FontTypes.Get";
if (true) return _vvvvvvvvvvvvvvvvv5.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),BA.ObjectToString(_vv0().Get((Object)(_fontname))),_fontsize);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public static String  _vvv2(String _theme) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub SelectTheme(theme As String)";
 //BA.debugLineNum = 62;BA.debugLine="LogDebug($\"To have access to all the inbuilt them";
anywheresoftware.b4a.keywords.Common.LogDebug(("To have access to all the inbuilt themes,\n"+"	You need to donate! Donation link: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"\n"+"	"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_vvvvvvvvvvvvvvv6._vv1()))+"\n"+"	"));
 //BA.debugLineNum = 69;BA.debugLine="theme = CFStringUtility.ucfirst(theme)";
_theme = _vvvvvvvvvvvvvvvv2._vvvvvvvvvv1(_theme);
 //BA.debugLineNum = 71;BA.debugLine="If AvailableThemes.ThemesList.ContainsKey(theme)";
if (_vv5._vvvvvvvvvvvvvvv4().ContainsKey((Object)(_theme))) { 
 //BA.debugLineNum = 73;BA.debugLine="DefaultTheme = AvailableThemes.ThemesList.Get(th";
_vv6.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_vv5._vvvvvvvvvvvvvvv4().Get((Object)(_theme))));
 }else {
 //BA.debugLineNum = 77;BA.debugLine="LogError(\"Could not find the selected theme(\" &";
anywheresoftware.b4a.keywords.Common.LogError("Could not find the selected theme("+_theme+"). Please check the Theme name");
 //BA.debugLineNum = 78;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
}
