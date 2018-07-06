package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class themes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.themes", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.themes.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.main _main = null;
public Punchline.Tech.Cuppy.Framework.configs _configs = null;
public Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public anywheresoftware.b4a.objects.collections.Map  _bluetheme(Punchline.Tech.Cuppy.Framework.themes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="themes";
if (Debug.shouldDelegate(ba, "bluetheme"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "bluetheme", null));}
anywheresoftware.b4a.objects.collections.Map _colors = null;
RDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Public Sub BlueTheme As Map";
RDebugUtils.currentLine=524290;
 //BA.debugLineNum = 524290;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="Colors.Initialize";
_colors.Initialize();
RDebugUtils.currentLine=524294;
 //BA.debugLineNum = 524294;BA.debugLine="Colors.Put(\"primary\",\"#2196F3\")";
_colors.Put((Object)("primary"),(Object)("#2196F3"));
RDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="Colors.Put(\"primary_dark\",\"#1976D2\")";
_colors.Put((Object)("primary_dark"),(Object)("#1976D2"));
RDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="Colors.Put(\"primary_light\",\"#BBDEFB\")";
_colors.Put((Object)("primary_light"),(Object)("#BBDEFB"));
RDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="Colors.Put(\"accent\",\"#FF4081\")";
_colors.Put((Object)("accent"),(Object)("#FF4081"));
RDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
RDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
RDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
RDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
RDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="Return Colors";
if (true) return _colors;
RDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.themes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="themes";
RDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return "";
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.themes __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="themes";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return "";
}
public String  _selecttheme(Punchline.Tech.Cuppy.Framework.themes __ref,String _theme) throws Exception{
__ref = this;
RDebugUtils.currentModule="themes";
if (Debug.shouldDelegate(ba, "selecttheme"))
	 {return ((String) Debug.delegate(ba, "selecttheme", new Object[] {_theme}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub SelectTheme(theme As String)";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="StyleManager.DefaultTheme = ThemesList.Get(theme";
_stylemanager._defaulttheme.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._themeslist(null).Get((Object)(_theme))));
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _themeslist(Punchline.Tech.Cuppy.Framework.themes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="themes";
if (Debug.shouldDelegate(ba, "themeslist"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "themeslist", null));}
anywheresoftware.b4a.objects.collections.Map _availablethemes = null;
RDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Public Sub ThemesList() As Map";
RDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="Private AvailableThemes As Map";
_availablethemes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="AvailableThemes.Initialize";
_availablethemes.Initialize();
RDebugUtils.currentLine=458759;
 //BA.debugLineNum = 458759;BA.debugLine="AvailableThemes.Put(\"Blue\", BlueTheme)";
_availablethemes.Put((Object)("Blue"),(Object)(__ref._bluetheme(null).getObject()));
RDebugUtils.currentLine=458760;
 //BA.debugLineNum = 458760;BA.debugLine="AvailableThemes.Put(\"Teal\", TealTheme)";
_availablethemes.Put((Object)("Teal"),(Object)(__ref._tealtheme(null).getObject()));
RDebugUtils.currentLine=458762;
 //BA.debugLineNum = 458762;BA.debugLine="Return AvailableThemes";
if (true) return _availablethemes;
RDebugUtils.currentLine=458764;
 //BA.debugLineNum = 458764;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _tealtheme(Punchline.Tech.Cuppy.Framework.themes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="themes";
if (Debug.shouldDelegate(ba, "tealtheme"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "tealtheme", null));}
anywheresoftware.b4a.objects.collections.Map _colors = null;
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Public Sub TealTheme As Map";
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Colors.Initialize";
_colors.Initialize();
RDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Colors.Put(\"primary\",\"#009688\")";
_colors.Put((Object)("primary"),(Object)("#009688"));
RDebugUtils.currentLine=589831;
 //BA.debugLineNum = 589831;BA.debugLine="Colors.Put(\"primary_dark\",\"#00796B\")";
_colors.Put((Object)("primary_dark"),(Object)("#00796B"));
RDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Colors.Put(\"primary_light\",\"#B2DFDB\")";
_colors.Put((Object)("primary_light"),(Object)("#B2DFDB"));
RDebugUtils.currentLine=589834;
 //BA.debugLineNum = 589834;BA.debugLine="Colors.Put(\"accent\",\"#FF5722\")";
_colors.Put((Object)("accent"),(Object)("#FF5722"));
RDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
RDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
RDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
RDebugUtils.currentLine=589840;
 //BA.debugLineNum = 589840;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
RDebugUtils.currentLine=589842;
 //BA.debugLineNum = 589842;BA.debugLine="Return Colors";
if (true) return _colors;
RDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="End Sub";
return null;
}
}