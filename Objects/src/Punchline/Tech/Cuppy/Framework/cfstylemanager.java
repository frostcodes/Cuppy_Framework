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
public static Punchline.Tech.Cuppy.Framework.cfthemes _availablethemes = null;
public static anywheresoftware.b4a.objects.collections.Map _defaulttheme = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _black_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _black_italic_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _bold_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _bold_italic_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _light_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _light_italic_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _regular_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _default_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _italic_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _medium_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _medium_italic_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _thin_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _thin_italic_font = null;
public static String _blue_theme = "";
public static String _teal_theme = "";
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static anywheresoftware.b4a.objects.collections.Map  _fonttypes() throws Exception{
anywheresoftware.b4a.objects.collections.Map _ftypes = null;
 //BA.debugLineNum = 62;BA.debugLine="Private Sub FontTypes As Map";
 //BA.debugLineNum = 64;BA.debugLine="Dim FTypes As Map";
_ftypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 65;BA.debugLine="FTypes.Initialize";
_ftypes.Initialize();
 //BA.debugLineNum = 67;BA.debugLine="FTypes.Put(\"Black\",\"Roboto-Black.ttf\")";
_ftypes.Put((Object)("Black"),(Object)("Roboto-Black.ttf"));
 //BA.debugLineNum = 68;BA.debugLine="FTypes.Put(\"BlackItalic\",\"Roboto-BlackItalic.ttf\"";
_ftypes.Put((Object)("BlackItalic"),(Object)("Roboto-BlackItalic.ttf"));
 //BA.debugLineNum = 70;BA.debugLine="FTypes.Put(\"Bold\",\"Roboto-Bold.ttf\")";
_ftypes.Put((Object)("Bold"),(Object)("Roboto-Bold.ttf"));
 //BA.debugLineNum = 71;BA.debugLine="FTypes.Put(\"BoldItalic\",\"Roboto-BoldItalic.ttf\")";
_ftypes.Put((Object)("BoldItalic"),(Object)("Roboto-BoldItalic.ttf"));
 //BA.debugLineNum = 73;BA.debugLine="FTypes.Put(\"Italic\",\"Roboto-Italic.ttf\")";
_ftypes.Put((Object)("Italic"),(Object)("Roboto-Italic.ttf"));
 //BA.debugLineNum = 74;BA.debugLine="FTypes.Put(\"Light\",\"Roboto-Light.ttf\")";
_ftypes.Put((Object)("Light"),(Object)("Roboto-Light.ttf"));
 //BA.debugLineNum = 76;BA.debugLine="FTypes.Put(\"LightItalic\",\"Roboto-LightItalic.ttf\"";
_ftypes.Put((Object)("LightItalic"),(Object)("Roboto-LightItalic.ttf"));
 //BA.debugLineNum = 77;BA.debugLine="FTypes.Put(\"Medium\",\"Roboto-Medium.ttf\")";
_ftypes.Put((Object)("Medium"),(Object)("Roboto-Medium.ttf"));
 //BA.debugLineNum = 79;BA.debugLine="FTypes.Put(\"MediumItalic\",\"Roboto-MediumItalic.tt";
_ftypes.Put((Object)("MediumItalic"),(Object)("Roboto-MediumItalic.ttf"));
 //BA.debugLineNum = 80;BA.debugLine="FTypes.Put(\"Regular\",\"Roboto-Regular.ttf\")";
_ftypes.Put((Object)("Regular"),(Object)("Roboto-Regular.ttf"));
 //BA.debugLineNum = 82;BA.debugLine="FTypes.Put(\"Thin\",\"Roboto-Thin.ttf\")";
_ftypes.Put((Object)("Thin"),(Object)("Roboto-Thin.ttf"));
 //BA.debugLineNum = 83;BA.debugLine="FTypes.Put(\"ThinItalic\",\"Roboto-ThinItalic.ttf\")";
_ftypes.Put((Object)("ThinItalic"),(Object)("Roboto-ThinItalic.ttf"));
 //BA.debugLineNum = 85;BA.debugLine="Return FTypes";
if (true) return _ftypes;
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 6;BA.debugLine="Private AvailableThemes As CFThemes";
_availablethemes = new Punchline.Tech.Cuppy.Framework.cfthemes();
 //BA.debugLineNum = 7;BA.debugLine="AvailableThemes.Initialize 'ignore";
_availablethemes._initialize(ba);
 //BA.debugLineNum = 9;BA.debugLine="Public DefaultTheme As Map = AvailableThemes.Them";
_defaulttheme = new anywheresoftware.b4a.objects.collections.Map();
_defaulttheme.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_availablethemes._themeslist().Get((Object)(_blue_theme))));
 //BA.debugLineNum = 17;BA.debugLine="Public const BLACK_FONT As Font = SelectFont(\"Bla";
_black_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_black_font = _selectfont("Black",12);
 //BA.debugLineNum = 18;BA.debugLine="Public const BLACK_ITALIC_FONT As Font = SelectFo";
_black_italic_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_black_italic_font = _selectfont("BlackItalic",12);
 //BA.debugLineNum = 20;BA.debugLine="Public const BOLD_FONT As Font = SelectFont(\"Bold";
_bold_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_bold_font = _selectfont("Bold",12);
 //BA.debugLineNum = 21;BA.debugLine="Public const BOLD_ITALIC_FONT As Font = SelectFon";
_bold_italic_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_bold_italic_font = _selectfont("BoldItalic",12);
 //BA.debugLineNum = 23;BA.debugLine="Public const LIGHT_FONT As Font = SelectFont(\"Lig";
_light_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_light_font = _selectfont("Light",12);
 //BA.debugLineNum = 24;BA.debugLine="Public const LIGHT_ITALIC_FONT As Font = SelectFo";
_light_italic_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_light_italic_font = _selectfont("LightItalic",12);
 //BA.debugLineNum = 26;BA.debugLine="Public const REGULAR_FONT, DEFAULT_FONT As Font =";
_regular_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_default_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_default_font = _selectfont("Regular",12);
 //BA.debugLineNum = 27;BA.debugLine="Public const ITALIC_FONT As Font = SelectFont(\"It";
_italic_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_italic_font = _selectfont("Italic",12);
 //BA.debugLineNum = 29;BA.debugLine="Public const MEDIUM_FONT As Font = SelectFont(\"Me";
_medium_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_medium_font = _selectfont("Medium",12);
 //BA.debugLineNum = 30;BA.debugLine="Public const MEDIUM_ITALIC_FONT As Font = SelectF";
_medium_italic_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_medium_italic_font = _selectfont("MediumItalic",12);
 //BA.debugLineNum = 32;BA.debugLine="Public const THIN_FONT As Font = SelectFont(\"Thin";
_thin_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_thin_font = _selectfont("Thin",12);
 //BA.debugLineNum = 33;BA.debugLine="Public const THIN_ITALIC_FONT As Font = SelectFon";
_thin_italic_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_thin_italic_font = _selectfont("ThinItalic",12);
 //BA.debugLineNum = 39;BA.debugLine="Public const BLUE_THEME As String = \"Blue\"";
_blue_theme = "Blue";
 //BA.debugLineNum = 40;BA.debugLine="Public const TEAL_THEME As String = \"Teal\"";
_teal_theme = "Teal";
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _scalefont(String _familyname,double _size) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Public Sub ScaleFont(FamilyName As String,Size As";
 //BA.debugLineNum = 99;BA.debugLine="Return fx.CreateFont(FamilyName, Size, False, Fal";
if (true) return _fx.CreateFont(_familyname,_size,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _scalefont2(String _familyname,double _size,boolean _bold,boolean _italic) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Public Sub ScaleFont2(FamilyName As String,Size As";
 //BA.debugLineNum = 106;BA.debugLine="Return fx.CreateFont(FamilyName , Size, Bold, Ita";
if (true) return _fx.CreateFont(_familyname,_size,_bold,_italic);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _selectfont(String _fontname,double _fontsize) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Public Sub SelectFont(fontName As String,  FontSiz";
 //BA.debugLineNum = 92;BA.debugLine="Return fx.LoadFont(File.DirAssets , FontTypes.Get";
if (true) return _fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),BA.ObjectToString(_fonttypes().Get((Object)(_fontname))),_fontsize);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public static String  _selecttheme(String _theme) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Public Sub SelectTheme(Theme As String)";
 //BA.debugLineNum = 120;BA.debugLine="LogDebug($\"To have access to all the inbuilt them";
anywheresoftware.b4a.keywords.Common.LogDebug(("To have access to all the inbuilt themes,\n"+"	You need to donate! Donation link: "+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(anywheresoftware.b4a.keywords.Common.CRLF))+"\n"+"	"+anywheresoftware.b4a.keywords.Common.SmartStringFormatter("",(Object)(_cfconfigs._donationlink()))+""));
 //BA.debugLineNum = 126;BA.debugLine="Theme = CFStringUtility.ucfirst(Theme)";
_theme = _cfstringutility._ucfirst(_theme);
 //BA.debugLineNum = 128;BA.debugLine="If AvailableThemes.ThemesList.ContainsKey(Theme)";
if (_availablethemes._themeslist().ContainsKey((Object)(_theme))) { 
 //BA.debugLineNum = 130;BA.debugLine="DefaultTheme = AvailableThemes.ThemesList.Get(Th";
_defaulttheme.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_availablethemes._themeslist().Get((Object)(_theme))));
 }else {
 //BA.debugLineNum = 134;BA.debugLine="LogError(\"Could not find the selected theme(\" &";
anywheresoftware.b4a.keywords.Common.LogError("Could not find the selected theme("+_theme+"). Please check the Theme name");
 //BA.debugLineNum = 135;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
}
