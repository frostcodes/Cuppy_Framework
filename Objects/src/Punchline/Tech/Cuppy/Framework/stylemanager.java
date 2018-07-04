package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class stylemanager extends Object{
public static stylemanager mostCurrent = new stylemanager();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.stylemanager", null);
		ba.loadHtSubs(stylemanager.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.stylemanager", ba);
		}
	}
    public static Class<?> getObject() {
		return stylemanager.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _defaultfont = null;
public static Punchline.Tech.Cuppy.Framework.themes _availablethemes = null;
public static anywheresoftware.b4a.objects.collections.Map _defaulttheme = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public static Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static anywheresoftware.b4a.objects.collections.Map  _fonttypes() throws Exception{
RDebugUtils.currentModule="stylemanager";
if (Debug.shouldDelegate(ba, "fonttypes"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "fonttypes", null));}
anywheresoftware.b4a.objects.collections.Map _ftypes = null;
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Public Sub FontTypes As Map";
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Dim FTypes As Map";
_ftypes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="FTypes.Initialize";
_ftypes.Initialize();
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="FTypes.Put(\"Black\",\"Roboto-Black.ttf\")";
_ftypes.Put((Object)("Black"),(Object)("Roboto-Black.ttf"));
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="FTypes.Put(\"BlackItalic\",\"Roboto-BlackItalic.ttf\"";
_ftypes.Put((Object)("BlackItalic"),(Object)("Roboto-BlackItalic.ttf"));
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="FTypes.Put(\"Bold\",\"Roboto-Bold.ttf\")";
_ftypes.Put((Object)("Bold"),(Object)("Roboto-Bold.ttf"));
RDebugUtils.currentLine=6553609;
 //BA.debugLineNum = 6553609;BA.debugLine="FTypes.Put(\"BoldItalic\",\"Roboto-BoldItalic.ttf\")";
_ftypes.Put((Object)("BoldItalic"),(Object)("Roboto-BoldItalic.ttf"));
RDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="FTypes.Put(\"Italic\",\"Roboto-Italic.ttf\")";
_ftypes.Put((Object)("Italic"),(Object)("Roboto-Italic.ttf"));
RDebugUtils.currentLine=6553612;
 //BA.debugLineNum = 6553612;BA.debugLine="FTypes.Put(\"Light\",\"Roboto-Light.ttf\")";
_ftypes.Put((Object)("Light"),(Object)("Roboto-Light.ttf"));
RDebugUtils.currentLine=6553614;
 //BA.debugLineNum = 6553614;BA.debugLine="FTypes.Put(\"LightItalic\",\"Roboto-LightItalic.ttf\"";
_ftypes.Put((Object)("LightItalic"),(Object)("Roboto-LightItalic.ttf"));
RDebugUtils.currentLine=6553615;
 //BA.debugLineNum = 6553615;BA.debugLine="FTypes.Put(\"Medium\",\"Roboto-Medium.ttf\")";
_ftypes.Put((Object)("Medium"),(Object)("Roboto-Medium.ttf"));
RDebugUtils.currentLine=6553617;
 //BA.debugLineNum = 6553617;BA.debugLine="FTypes.Put(\"MediumItalic\",\"Roboto-MediumItalic.tt";
_ftypes.Put((Object)("MediumItalic"),(Object)("Roboto-MediumItalic.ttf"));
RDebugUtils.currentLine=6553618;
 //BA.debugLineNum = 6553618;BA.debugLine="FTypes.Put(\"Regular\",\"Roboto-Regular.ttf\")";
_ftypes.Put((Object)("Regular"),(Object)("Roboto-Regular.ttf"));
RDebugUtils.currentLine=6553620;
 //BA.debugLineNum = 6553620;BA.debugLine="FTypes.Put(\"Thin\",\"Roboto-Thin.ttf\")";
_ftypes.Put((Object)("Thin"),(Object)("Roboto-Thin.ttf"));
RDebugUtils.currentLine=6553621;
 //BA.debugLineNum = 6553621;BA.debugLine="FTypes.Put(\"ThinItalic\",\"Roboto-ThinItalic.ttf\")";
_ftypes.Put((Object)("ThinItalic"),(Object)("Roboto-ThinItalic.ttf"));
RDebugUtils.currentLine=6553623;
 //BA.debugLineNum = 6553623;BA.debugLine="Return FTypes";
if (true) return _ftypes;
RDebugUtils.currentLine=6553625;
 //BA.debugLineNum = 6553625;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _selectfont(String _font,double _fontsize) throws Exception{
RDebugUtils.currentModule="stylemanager";
if (Debug.shouldDelegate(ba, "selectfont"))
	 {return ((anywheresoftware.b4j.objects.JFX.FontWrapper) Debug.delegate(ba, "selectfont", new Object[] {_font,_fontsize}));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Public Sub SelectFont(font As String,  FontSize As";
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Return  fx.LoadFont(Configs.RobotoFontsPath , Fon";
if (true) return _fx.LoadFont(_configs._robotofontspath,BA.ObjectToString(_fonttypes().Get((Object)(_font))),_fontsize);
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="End Sub";
return null;
}
}