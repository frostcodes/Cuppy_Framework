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
public static anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvvvvv7 = null;
public static Punchline.Tech.Cuppy.Framework.cfthemes _vvvvvvvvvvvvvvvvvvvvvvvvvvv1 = null;
public static anywheresoftware.b4a.objects.collections.Map _vvvvvvvvv6 = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_black = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_black_italic = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_bold = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_bold_italic = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_light = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_light_italic = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_regular_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_italic = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_medium = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_medium_italic = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_thin = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _font_thin_italic = null;
public static String _theme_blue = "";
public static String _theme_teal = "";
public static String _theme_gray = "";
public static String _theme_dark = "";
public static String _theme_purple = "";
public static String _theme_pink = "";
public static String _theme_amber = "";
public static b4j.example.cssutils _vvvvvvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvvvvvv4 = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvvvvvv5 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvvvvv6 = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvvvvvv7 = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvvvvvv1 = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvvvvvvv3 = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvvvvvv4 = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvvvvvv5 = null;
public static String  _vvvvvvvvv7(String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Public Sub ExportCurrentTheme(Dir As String, FileN";
 //BA.debugLineNum = 217;BA.debugLine="File.WriteMap(Dir, FileName, DefaultTheme)";
anywheresoftware.b4a.keywords.Common.File.WriteMap(_dir,_filename,_vvvvvvvvv6);
 //BA.debugLineNum = 219;BA.debugLine="End Sub";
return "";
}
public static String  _vvvvvvvvv0(String _theme,String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Public Sub ExportTheme(theme As String , Dir As St";
 //BA.debugLineNum = 199;BA.debugLine="theme = CFStringUtility.ucfirst(theme)";
_theme = _vvvvvvvvvvvvvvvvvvvv5._vvvvvvv0(_theme);
 //BA.debugLineNum = 201;BA.debugLine="If AvailableThemes.ThemesList.ContainsKey(theme)";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvvvvvvvvvvv5().ContainsKey((Object)(_theme))) { 
 //BA.debugLineNum = 203;BA.debugLine="File.WriteMap(Dir, FileName, AvailableThemes.Th";
anywheresoftware.b4a.keywords.Common.File.WriteMap(_dir,_filename,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_vvvvvvvvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvvvvvvvvvvv5().Get((Object)(_theme)))));
 }else {
 //BA.debugLineNum = 207;BA.debugLine="LogError(\"Could not export theme(\" & theme & \").";
anywheresoftware.b4a.keywords.Common.LogError("Could not export theme("+_theme+"). Please check the Theme name!");
 //BA.debugLineNum = 208;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _vvvvvvvvvvvvvvvvvvvvvvvvvvv2() throws Exception{
anywheresoftware.b4a.objects.collections.Map _ftypes = null;
 //BA.debugLineNum = 63;BA.debugLine="Private Sub FontTypes As Map";
 //BA.debugLineNum = 65;BA.debugLine="Dim FTypes As Map";
_ftypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 66;BA.debugLine="FTypes.Initialize";
_ftypes.Initialize();
 //BA.debugLineNum = 68;BA.debugLine="FTypes.Put(\"Black\",\"Roboto-Black.ttf\")";
_ftypes.Put((Object)("Black"),(Object)("Roboto-Black.ttf"));
 //BA.debugLineNum = 69;BA.debugLine="FTypes.Put(\"BlackItalic\",\"Roboto-BlackItalic.ttf\"";
_ftypes.Put((Object)("BlackItalic"),(Object)("Roboto-BlackItalic.ttf"));
 //BA.debugLineNum = 71;BA.debugLine="FTypes.Put(\"Bold\",\"Roboto-Bold.ttf\")";
_ftypes.Put((Object)("Bold"),(Object)("Roboto-Bold.ttf"));
 //BA.debugLineNum = 72;BA.debugLine="FTypes.Put(\"BoldItalic\",\"Roboto-BoldItalic.ttf\")";
_ftypes.Put((Object)("BoldItalic"),(Object)("Roboto-BoldItalic.ttf"));
 //BA.debugLineNum = 74;BA.debugLine="FTypes.Put(\"Italic\",\"Roboto-Italic.ttf\")";
_ftypes.Put((Object)("Italic"),(Object)("Roboto-Italic.ttf"));
 //BA.debugLineNum = 75;BA.debugLine="FTypes.Put(\"Light\",\"Roboto-Light.ttf\")";
_ftypes.Put((Object)("Light"),(Object)("Roboto-Light.ttf"));
 //BA.debugLineNum = 77;BA.debugLine="FTypes.Put(\"LightItalic\",\"Roboto-LightItalic.ttf\"";
_ftypes.Put((Object)("LightItalic"),(Object)("Roboto-LightItalic.ttf"));
 //BA.debugLineNum = 78;BA.debugLine="FTypes.Put(\"Medium\",\"Roboto-Medium.ttf\")";
_ftypes.Put((Object)("Medium"),(Object)("Roboto-Medium.ttf"));
 //BA.debugLineNum = 80;BA.debugLine="FTypes.Put(\"MediumItalic\",\"Roboto-MediumItalic.tt";
_ftypes.Put((Object)("MediumItalic"),(Object)("Roboto-MediumItalic.ttf"));
 //BA.debugLineNum = 81;BA.debugLine="FTypes.Put(\"Regular\",\"Roboto-Regular.ttf\")";
_ftypes.Put((Object)("Regular"),(Object)("Roboto-Regular.ttf"));
 //BA.debugLineNum = 83;BA.debugLine="FTypes.Put(\"Thin\",\"Roboto-Thin.ttf\")";
_ftypes.Put((Object)("Thin"),(Object)("Roboto-Thin.ttf"));
 //BA.debugLineNum = 84;BA.debugLine="FTypes.Put(\"ThinItalic\",\"Roboto-ThinItalic.ttf\")";
_ftypes.Put((Object)("ThinItalic"),(Object)("Roboto-ThinItalic.ttf"));
 //BA.debugLineNum = 86;BA.debugLine="Return FTypes";
if (true) return _ftypes;
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _vvvvvvvvvv1(String _dir,String _filename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mapx = null;
anywheresoftware.b4a.objects.collections.List _checklist = null;
String _keyx = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _errorstr = null;
 //BA.debugLineNum = 153;BA.debugLine="Public Sub LoadThemeFile(Dir As String, FileName A";
 //BA.debugLineNum = 155;BA.debugLine="Dim mapx As Map = File.ReadMap(Dir ,FileName)";
_mapx = new anywheresoftware.b4a.objects.collections.Map();
_mapx = anywheresoftware.b4a.keywords.Common.File.ReadMap(_dir,_filename);
 //BA.debugLineNum = 157;BA.debugLine="Dim checklist As List";
_checklist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 158;BA.debugLine="checklist.Initialize";
_checklist.Initialize();
 //BA.debugLineNum = 160;BA.debugLine="checklist.Add(\"primary\")";
_checklist.Add((Object)("primary"));
 //BA.debugLineNum = 161;BA.debugLine="checklist.Add(\"primary_dark\")";
_checklist.Add((Object)("primary_dark"));
 //BA.debugLineNum = 163;BA.debugLine="checklist.Add(\"primary_light\")";
_checklist.Add((Object)("primary_light"));
 //BA.debugLineNum = 164;BA.debugLine="checklist.Add(\"accent\")";
_checklist.Add((Object)("accent"));
 //BA.debugLineNum = 166;BA.debugLine="checklist.Add(\"primary_text\")";
_checklist.Add((Object)("primary_text"));
 //BA.debugLineNum = 167;BA.debugLine="checklist.Add(\"secondary_text\")";
_checklist.Add((Object)("secondary_text"));
 //BA.debugLineNum = 169;BA.debugLine="checklist.Add(\"icons\")";
_checklist.Add((Object)("icons"));
 //BA.debugLineNum = 170;BA.debugLine="checklist.Add(\"divider\")";
_checklist.Add((Object)("divider"));
 //BA.debugLineNum = 172;BA.debugLine="For Each KeyX As String In checklist";
{
final anywheresoftware.b4a.BA.IterableList group12 = _checklist;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_keyx = BA.ObjectToString(group12.Get(index12));
 //BA.debugLineNum = 175;BA.debugLine="If Not(mapx.ContainsKey(KeyX)) Or CFStringUtilit";
if (anywheresoftware.b4a.keywords.Common.Not(_mapx.ContainsKey((Object)(_keyx))) || _vvvvvvvvvvvvvvvvvvvv5._vvvv1(BA.ObjectToString(_mapx.Get((Object)(_keyx))))) { 
 //BA.debugLineNum = 177;BA.debugLine="Dim ErrorStr As StringBuilder";
_errorstr = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 178;BA.debugLine="ErrorStr.Initialize";
_errorstr.Initialize();
 //BA.debugLineNum = 180;BA.debugLine="ErrorStr.Append(\"Could not load theme file (\" &";
_errorstr.Append("Could not load theme file ("+_filename+") ");
 //BA.debugLineNum = 181;BA.debugLine="ErrorStr.Append(\"because the theme key (\" & Key";
_errorstr.Append("because the theme key ("+_keyx+") is missing ");
 //BA.debugLineNum = 182;BA.debugLine="ErrorStr.Append(\"or its value is empty!\")";
_errorstr.Append("or its value is empty!");
 //BA.debugLineNum = 184;BA.debugLine="LogError(ErrorStr.ToString)";
anywheresoftware.b4a.keywords.Common.LogError(_errorstr.ToString());
 //BA.debugLineNum = 186;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 }
};
 //BA.debugLineNum = 192;BA.debugLine="Return mapx";
if (true) return _mapx;
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvvvvv7 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 6;BA.debugLine="Private AvailableThemes As CFThemes";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1 = new Punchline.Tech.Cuppy.Framework.cfthemes();
 //BA.debugLineNum = 7;BA.debugLine="AvailableThemes.Initialize 'ignore";
_vvvvvvvvvvvvvvvvvvvvvvvvvvv1._initialize(ba);
 //BA.debugLineNum = 9;BA.debugLine="Public DefaultTheme As Map = AvailableThemes.Them";
_vvvvvvvvv6 = new anywheresoftware.b4a.objects.collections.Map();
_vvvvvvvvv6.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_vvvvvvvvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvvvvvvvvvvv5().Get((Object)(_theme_blue))));
 //BA.debugLineNum = 18;BA.debugLine="Public const FONT_BLACK As Font = SelectFont(\"Bla";
_font_black = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_font_black = _vvvvvvvvvv4("Black",12);
 //BA.debugLineNum = 19;BA.debugLine="Public const FONT_BLACK_ITALIC As Font = SelectFo";
_font_black_italic = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_font_black_italic = _vvvvvvvvvv4("BlackItalic",12);
 //BA.debugLineNum = 21;BA.debugLine="Public const FONT_BOLD As Font = SelectFont(\"Bold";
_font_bold = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_font_bold = _vvvvvvvvvv4("Bold",12);
 //BA.debugLineNum = 22;BA.debugLine="Public const FONT_BOLD_ITALIC As Font = SelectFon";
_font_bold_italic = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_font_bold_italic = _vvvvvvvvvv4("BoldItalic",12);
 //BA.debugLineNum = 24;BA.debugLine="Public const FONT_LIGHT As Font = SelectFont(\"Lig";
_font_light = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_font_light = _vvvvvvvvvv4("Light",12);
 //BA.debugLineNum = 25;BA.debugLine="Public const FONT_LIGHT_ITALIC As Font = SelectFo";
_font_light_italic = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_font_light_italic = _vvvvvvvvvv4("LightItalic",12);
 //BA.debugLineNum = 27;BA.debugLine="Public const FONT_REGULAR_FONT As Font = SelectFo";
_font_regular_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_font_regular_font = _vvvvvvvvvv4("Regular",12);
 //BA.debugLineNum = 28;BA.debugLine="Public const FONT_ITALIC As Font = SelectFont(\"It";
_font_italic = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_font_italic = _vvvvvvvvvv4("Italic",12);
 //BA.debugLineNum = 30;BA.debugLine="Public const FONT_MEDIUM As Font = SelectFont(\"Me";
_font_medium = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_font_medium = _vvvvvvvvvv4("Medium",12);
 //BA.debugLineNum = 31;BA.debugLine="Public const FONT_MEDIUM_ITALIC As Font = SelectF";
_font_medium_italic = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_font_medium_italic = _vvvvvvvvvv4("MediumItalic",12);
 //BA.debugLineNum = 33;BA.debugLine="Public const FONT_THIN As Font = SelectFont(\"Thin";
_font_thin = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_font_thin = _vvvvvvvvvv4("Thin",12);
 //BA.debugLineNum = 34;BA.debugLine="Public const FONT_THIN_ITALIC As Font = SelectFon";
_font_thin_italic = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_font_thin_italic = _vvvvvvvvvv4("ThinItalic",12);
 //BA.debugLineNum = 40;BA.debugLine="Public const THEME_BLUE As String = \"Blue\"";
_theme_blue = "Blue";
 //BA.debugLineNum = 41;BA.debugLine="Public const THEME_TEAL As String = \"Teal\"";
_theme_teal = "Teal";
 //BA.debugLineNum = 47;BA.debugLine="Public const THEME_GRAY As String = \"Gray\"";
_theme_gray = "Gray";
 //BA.debugLineNum = 48;BA.debugLine="Public const THEME_DARK As String = \"Dark\"";
_theme_dark = "Dark";
 //BA.debugLineNum = 49;BA.debugLine="Public const THEME_PURPLE As String = \"Purple\"";
_theme_purple = "Purple";
 //BA.debugLineNum = 50;BA.debugLine="Public const THEME_PINK As String = \"Pink\"";
_theme_pink = "Pink";
 //BA.debugLineNum = 51;BA.debugLine="Public const THEME_AMBER As String = \"Amber\"";
_theme_amber = "Amber";
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _vvvvvvvvvv2(String _familyname,double _size) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Public Sub ScaleFont(FamilyName As String,Size As";
 //BA.debugLineNum = 100;BA.debugLine="Return fx.CreateFont(FamilyName, Size, False, Fal";
if (true) return _vvvvvvvvvvvvvvvvvvv7.CreateFont(_familyname,_size,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _vvvvvvvvvv3(String _familyname,double _size,boolean _bold,boolean _italic) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Public Sub ScaleFont2(FamilyName As String,Size As";
 //BA.debugLineNum = 107;BA.debugLine="Return fx.CreateFont(FamilyName , Size, Bold, Ita";
if (true) return _vvvvvvvvvvvvvvvvvvv7.CreateFont(_familyname,_size,_bold,_italic);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _vvvvvvvvvv4(String _fontname,double _fontsize) throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Public Sub SelectFont(fontName As String,  FontSiz";
 //BA.debugLineNum = 93;BA.debugLine="Return fx.LoadFont(File.DirAssets , FontTypes.Get";
if (true) return _vvvvvvvvvvvvvvvvvvv7.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),BA.ObjectToString(_vvvvvvvvvvvvvvvvvvvvvvvvvvv2().Get((Object)(_fontname))),_fontsize);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public static String  _vvvvvvvvvv5(String _theme) throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub SelectTheme(Theme As String)";
 //BA.debugLineNum = 127;BA.debugLine="Theme = CFStringUtility.ucfirst(Theme)";
_theme = _vvvvvvvvvvvvvvvvvvvv5._vvvvvvv0(_theme);
 //BA.debugLineNum = 129;BA.debugLine="If AvailableThemes.ThemesList.ContainsKey(Theme)";
if (_vvvvvvvvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvvvvvvvvvvv5().ContainsKey((Object)(_theme))) { 
 //BA.debugLineNum = 131;BA.debugLine="DefaultTheme = AvailableThemes.ThemesList.Get(Th";
_vvvvvvvvv6.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_vvvvvvvvvvvvvvvvvvvvvvvvvvv1._vvvvvvvvvvvvvvvvvvvvvv5().Get((Object)(_theme))));
 }else {
 //BA.debugLineNum = 135;BA.debugLine="LogError(\"Could not find the selected theme(\" &";
anywheresoftware.b4a.keywords.Common.LogError("Could not find the selected theme("+_theme+"). Please check the Theme name");
 //BA.debugLineNum = 136;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
}
