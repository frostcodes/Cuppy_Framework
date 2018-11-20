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
public static anywheresoftware.b4a.objects.collections.List _activecontrols = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _black_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _black_italic_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _bold_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _bold_italic_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _light_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _light_italic_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _regular_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _italic_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _medium_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _medium_italic_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _thin_font = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _thin_italic_font = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static String  _exportcurrenttheme(String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Public Sub ExportCurrentTheme(Dir As String, FileN";
 //BA.debugLineNum = 199;BA.debugLine="File.WriteMap(Dir, FileName, DefaultTheme)";
anywheresoftware.b4a.keywords.Common.File.WriteMap(_dir,_filename,_defaulttheme);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public static String  _exporttheme(String _theme,String _dir,String _filename) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Public Sub ExportTheme(theme As String , Dir As St";
 //BA.debugLineNum = 181;BA.debugLine="theme = CFStringUtility.ucfirst(theme)";
_theme = _cfstringutility._ucfirst(_theme);
 //BA.debugLineNum = 183;BA.debugLine="If AvailableThemes.ThemesList.ContainsKey(theme)";
if (_availablethemes._themeslist().ContainsKey((Object)(_theme))) { 
 //BA.debugLineNum = 185;BA.debugLine="File.WriteMap(Dir, FileName, AvailableThemes.Th";
anywheresoftware.b4a.keywords.Common.File.WriteMap(_dir,_filename,(anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_availablethemes._themeslist().Get((Object)(_theme)))));
 }else {
 //BA.debugLineNum = 189;BA.debugLine="LogError(\"Could not export theme(\" & theme & \").";
anywheresoftware.b4a.keywords.Common.LogError("Could not export theme("+_theme+"). Please check the Theme name!");
 //BA.debugLineNum = 190;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _fonttypes() throws Exception{
anywheresoftware.b4a.objects.collections.Map _ftypes = null;
 //BA.debugLineNum = 40;BA.debugLine="Private Sub FontTypes As Map";
 //BA.debugLineNum = 42;BA.debugLine="Dim FTypes As Map";
_ftypes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 43;BA.debugLine="FTypes.Initialize";
_ftypes.Initialize();
 //BA.debugLineNum = 45;BA.debugLine="FTypes.Put(\"Black\",\"Roboto-Black.ttf\")";
_ftypes.Put((Object)("Black"),(Object)("Roboto-Black.ttf"));
 //BA.debugLineNum = 46;BA.debugLine="FTypes.Put(\"BlackItalic\",\"Roboto-BlackItalic.ttf\"";
_ftypes.Put((Object)("BlackItalic"),(Object)("Roboto-BlackItalic.ttf"));
 //BA.debugLineNum = 48;BA.debugLine="FTypes.Put(\"Bold\",\"Roboto-Bold.ttf\")";
_ftypes.Put((Object)("Bold"),(Object)("Roboto-Bold.ttf"));
 //BA.debugLineNum = 49;BA.debugLine="FTypes.Put(\"BoldItalic\",\"Roboto-BoldItalic.ttf\")";
_ftypes.Put((Object)("BoldItalic"),(Object)("Roboto-BoldItalic.ttf"));
 //BA.debugLineNum = 51;BA.debugLine="FTypes.Put(\"Italic\",\"Roboto-Italic.ttf\")";
_ftypes.Put((Object)("Italic"),(Object)("Roboto-Italic.ttf"));
 //BA.debugLineNum = 52;BA.debugLine="FTypes.Put(\"Light\",\"Roboto-Light.ttf\")";
_ftypes.Put((Object)("Light"),(Object)("Roboto-Light.ttf"));
 //BA.debugLineNum = 54;BA.debugLine="FTypes.Put(\"LightItalic\",\"Roboto-LightItalic.ttf\"";
_ftypes.Put((Object)("LightItalic"),(Object)("Roboto-LightItalic.ttf"));
 //BA.debugLineNum = 55;BA.debugLine="FTypes.Put(\"Medium\",\"Roboto-Medium.ttf\")";
_ftypes.Put((Object)("Medium"),(Object)("Roboto-Medium.ttf"));
 //BA.debugLineNum = 57;BA.debugLine="FTypes.Put(\"MediumItalic\",\"Roboto-MediumItalic.tt";
_ftypes.Put((Object)("MediumItalic"),(Object)("Roboto-MediumItalic.ttf"));
 //BA.debugLineNum = 58;BA.debugLine="FTypes.Put(\"Regular\",\"Roboto-Regular.ttf\")";
_ftypes.Put((Object)("Regular"),(Object)("Roboto-Regular.ttf"));
 //BA.debugLineNum = 60;BA.debugLine="FTypes.Put(\"Thin\",\"Roboto-Thin.ttf\")";
_ftypes.Put((Object)("Thin"),(Object)("Roboto-Thin.ttf"));
 //BA.debugLineNum = 61;BA.debugLine="FTypes.Put(\"ThinItalic\",\"Roboto-ThinItalic.ttf\")";
_ftypes.Put((Object)("ThinItalic"),(Object)("Roboto-ThinItalic.ttf"));
 //BA.debugLineNum = 63;BA.debugLine="Return FTypes";
if (true) return _ftypes;
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _loadthemefile(String _dir,String _filename) throws Exception{
anywheresoftware.b4a.objects.collections.Map _mapx = null;
anywheresoftware.b4a.objects.collections.List _checklist = null;
String _keyx = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _errorstr = null;
 //BA.debugLineNum = 131;BA.debugLine="Public Sub LoadThemeFile(Dir As String, FileName A";
 //BA.debugLineNum = 137;BA.debugLine="Dim mapx As Map = File.ReadMap(Dir ,FileName)";
_mapx = new anywheresoftware.b4a.objects.collections.Map();
_mapx = anywheresoftware.b4a.keywords.Common.File.ReadMap(_dir,_filename);
 //BA.debugLineNum = 139;BA.debugLine="Dim checklist As List";
_checklist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 140;BA.debugLine="checklist.Initialize";
_checklist.Initialize();
 //BA.debugLineNum = 142;BA.debugLine="checklist.Add(\"primary\")";
_checklist.Add((Object)("primary"));
 //BA.debugLineNum = 143;BA.debugLine="checklist.Add(\"primary_dark\")";
_checklist.Add((Object)("primary_dark"));
 //BA.debugLineNum = 145;BA.debugLine="checklist.Add(\"primary_light\")";
_checklist.Add((Object)("primary_light"));
 //BA.debugLineNum = 146;BA.debugLine="checklist.Add(\"accent\")";
_checklist.Add((Object)("accent"));
 //BA.debugLineNum = 148;BA.debugLine="checklist.Add(\"primary_text\")";
_checklist.Add((Object)("primary_text"));
 //BA.debugLineNum = 149;BA.debugLine="checklist.Add(\"secondary_text\")";
_checklist.Add((Object)("secondary_text"));
 //BA.debugLineNum = 151;BA.debugLine="checklist.Add(\"icons\")";
_checklist.Add((Object)("icons"));
 //BA.debugLineNum = 152;BA.debugLine="checklist.Add(\"divider\")";
_checklist.Add((Object)("divider"));
 //BA.debugLineNum = 154;BA.debugLine="For Each KeyX As String In checklist";
{
final anywheresoftware.b4a.BA.IterableList group12 = _checklist;
final int groupLen12 = group12.getSize()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_keyx = BA.ObjectToString(group12.Get(index12));
 //BA.debugLineNum = 157;BA.debugLine="If Not(mapx.ContainsKey(KeyX)) Or CFStringUtilit";
if (anywheresoftware.b4a.keywords.Common.Not(_mapx.ContainsKey((Object)(_keyx))) || _cfstringutility._isempty(BA.ObjectToString(_mapx.Get((Object)(_keyx))))) { 
 //BA.debugLineNum = 159;BA.debugLine="Dim ErrorStr As StringBuilder";
_errorstr = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 160;BA.debugLine="ErrorStr.Initialize";
_errorstr.Initialize();
 //BA.debugLineNum = 162;BA.debugLine="ErrorStr.Append(\"Could not load theme file (\" &";
_errorstr.Append("Could not load theme file ("+_filename+") ");
 //BA.debugLineNum = 163;BA.debugLine="ErrorStr.Append(\"because the theme key (\" & Key";
_errorstr.Append("because the theme key ("+_keyx+") is missing ");
 //BA.debugLineNum = 164;BA.debugLine="ErrorStr.Append(\"or its value is empty!\")";
_errorstr.Append("or its value is empty!");
 //BA.debugLineNum = 166;BA.debugLine="LogError(ErrorStr.ToString)";
anywheresoftware.b4a.keywords.Common.LogError(_errorstr.ToString());
 //BA.debugLineNum = 168;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 }
};
 //BA.debugLineNum = 174;BA.debugLine="Return mapx";
if (true) return _mapx;
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 8;BA.debugLine="Public DefaultTheme As Map = AvailableThemes.Them";
_defaulttheme = new anywheresoftware.b4a.objects.collections.Map();
_defaulttheme.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_availablethemes._themeslist().Get((Object)("Blue"))));
 //BA.debugLineNum = 9;BA.debugLine="Public ActiveControls As List";
_activecontrols = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="ActiveControls.Initialize 'ignore : need this , b";
_activecontrols.Initialize();
 //BA.debugLineNum = 15;BA.debugLine="Public const BLACK_FONT As Font = SelectFont(\"Bla";
_black_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_black_font = _selectfont("Black",12);
 //BA.debugLineNum = 16;BA.debugLine="Public const BLACK_ITALIC_FONT As Font = SelectFo";
_black_italic_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_black_italic_font = _selectfont("BlackItalic",12);
 //BA.debugLineNum = 18;BA.debugLine="Public const BOLD_FONT As Font = SelectFont(\"Bold";
_bold_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_bold_font = _selectfont("Bold",12);
 //BA.debugLineNum = 19;BA.debugLine="Public const BOLD_ITALIC_FONT As Font = SelectFon";
_bold_italic_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_bold_italic_font = _selectfont("BoldItalic",12);
 //BA.debugLineNum = 21;BA.debugLine="Public const LIGHT_FONT As Font = SelectFont(\"Lig";
_light_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_light_font = _selectfont("Light",12);
 //BA.debugLineNum = 22;BA.debugLine="Public const LIGHT_ITALIC_FONT As Font = SelectFo";
_light_italic_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_light_italic_font = _selectfont("LightItalic",12);
 //BA.debugLineNum = 24;BA.debugLine="Public const REGULAR_FONT As Font = SelectFont(\"R";
_regular_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_regular_font = _selectfont("Regular",12);
 //BA.debugLineNum = 25;BA.debugLine="Public const ITALIC_FONT As Font = SelectFont(\"It";
_italic_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_italic_font = _selectfont("Italic",12);
 //BA.debugLineNum = 27;BA.debugLine="Public const MEDIUM_FONT As Font = SelectFont(\"Me";
_medium_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_medium_font = _selectfont("Medium",12);
 //BA.debugLineNum = 28;BA.debugLine="Public const MEDIUM_ITALIC_FONT As Font = SelectF";
_medium_italic_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_medium_italic_font = _selectfont("MediumItalic",12);
 //BA.debugLineNum = 30;BA.debugLine="Public const THIN_FONT As Font = SelectFont(\"Thin";
_thin_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_thin_font = _selectfont("Thin",12);
 //BA.debugLineNum = 31;BA.debugLine="Public const THIN_ITALIC_FONT As Font = SelectFon";
_thin_italic_font = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_thin_italic_font = _selectfont("ThinItalic",12);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _scalefont(String _familyname,double _size) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Public Sub ScaleFont(FamilyName As String,Size As";
 //BA.debugLineNum = 77;BA.debugLine="Return fx.CreateFont(FamilyName, Size, False, Fal";
if (true) return _fx.CreateFont(_familyname,_size,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _scalefont2(String _familyname,double _size,boolean _bold,boolean _italic) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Public Sub ScaleFont2(FamilyName As String,Size As";
 //BA.debugLineNum = 84;BA.debugLine="Return fx.CreateFont(FamilyName , Size, Bold, Ita";
if (true) return _fx.CreateFont(_familyname,_size,_bold,_italic);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4j.objects.JFX.FontWrapper  _selectfont(String _fontname,double _fontsize) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub SelectFont(fontName As String,  FontSiz";
 //BA.debugLineNum = 70;BA.debugLine="Return fx.LoadFont(File.DirAssets , FontTypes.Get";
if (true) return _fx.LoadFont(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),BA.ObjectToString(_fonttypes().Get((Object)(_fontname))),_fontsize);
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return null;
}
public static String  _selecttheme(String _theme) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Public Sub SelectTheme(theme As String)";
 //BA.debugLineNum = 105;BA.debugLine="theme = CFStringUtility.ucfirst(theme)";
_theme = _cfstringutility._ucfirst(_theme);
 //BA.debugLineNum = 107;BA.debugLine="If AvailableThemes.ThemesList.ContainsKey(theme)";
if (_availablethemes._themeslist().ContainsKey((Object)(_theme))) { 
 //BA.debugLineNum = 109;BA.debugLine="DefaultTheme = AvailableThemes.ThemesList.Get(th";
_defaulttheme.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_availablethemes._themeslist().Get((Object)(_theme))));
 }else {
 //BA.debugLineNum = 113;BA.debugLine="LogError(\"Could not find the selected theme(\" &";
anywheresoftware.b4a.keywords.Common.LogError("Could not find the selected theme("+_theme+"). Please check the Theme name");
 //BA.debugLineNum = 114;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
}
