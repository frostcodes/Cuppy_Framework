package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfthemes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfthemes", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfthemes.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public anywheresoftware.b4a.objects.collections.Map  _bluetheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 31;BA.debugLine="Private Sub BlueTheme As Map";
 //BA.debugLineNum = 33;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 34;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 37;BA.debugLine="Colors.Put(\"primary\",\"#2196F3\")";
_colors.Put((Object)("primary"),(Object)("#2196F3"));
 //BA.debugLineNum = 38;BA.debugLine="Colors.Put(\"primary_dark\",\"#1976D2\")";
_colors.Put((Object)("primary_dark"),(Object)("#1976D2"));
 //BA.debugLineNum = 40;BA.debugLine="Colors.Put(\"primary_light\",\"#BBDEFB\")";
_colors.Put((Object)("primary_light"),(Object)("#BBDEFB"));
 //BA.debugLineNum = 41;BA.debugLine="Colors.Put(\"accent\",\"#FF4081\")";
_colors.Put((Object)("accent"),(Object)("#FF4081"));
 //BA.debugLineNum = 43;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 44;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 46;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 47;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 49;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _darktheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 97;BA.debugLine="Private Sub DarkTheme As Map";
 //BA.debugLineNum = 99;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 100;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 103;BA.debugLine="Colors.Put(\"primary\",\"#2c3e50\")";
_colors.Put((Object)("primary"),(Object)("#2c3e50"));
 //BA.debugLineNum = 104;BA.debugLine="Colors.Put(\"primary_dark\",\"#1b2732\")";
_colors.Put((Object)("primary_dark"),(Object)("#1b2732"));
 //BA.debugLineNum = 106;BA.debugLine="Colors.Put(\"primary_light\",\"#68696a\")";
_colors.Put((Object)("primary_light"),(Object)("#68696a"));
 //BA.debugLineNum = 107;BA.debugLine="Colors.Put(\"accent\",\"#95a5a6\")";
_colors.Put((Object)("accent"),(Object)("#95a5a6"));
 //BA.debugLineNum = 109;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 110;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 112;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 113;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 115;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _graytheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 75;BA.debugLine="Private Sub GrayTheme As Map";
 //BA.debugLineNum = 77;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 78;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 81;BA.debugLine="Colors.Put(\"primary\",\"#7f8c8d\")";
_colors.Put((Object)("primary"),(Object)("#7f8c8d"));
 //BA.debugLineNum = 82;BA.debugLine="Colors.Put(\"primary_dark\",\"#5c6566\")";
_colors.Put((Object)("primary_dark"),(Object)("#5c6566"));
 //BA.debugLineNum = 84;BA.debugLine="Colors.Put(\"primary_light\",\"#a9a9a9\")";
_colors.Put((Object)("primary_light"),(Object)("#a9a9a9"));
 //BA.debugLineNum = 85;BA.debugLine="Colors.Put(\"accent\",\"#536DFE\")";
_colors.Put((Object)("accent"),(Object)("#536DFE"));
 //BA.debugLineNum = 87;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 88;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 90;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 91;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 93;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _tealtheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 53;BA.debugLine="Private Sub TealTheme As Map";
 //BA.debugLineNum = 55;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 56;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 59;BA.debugLine="Colors.Put(\"primary\",\"#009688\")";
_colors.Put((Object)("primary"),(Object)("#009688"));
 //BA.debugLineNum = 60;BA.debugLine="Colors.Put(\"primary_dark\",\"#00796B\")";
_colors.Put((Object)("primary_dark"),(Object)("#00796B"));
 //BA.debugLineNum = 62;BA.debugLine="Colors.Put(\"primary_light\",\"#B2DFDB\")";
_colors.Put((Object)("primary_light"),(Object)("#B2DFDB"));
 //BA.debugLineNum = 63;BA.debugLine="Colors.Put(\"accent\",\"#FF5722\")";
_colors.Put((Object)("accent"),(Object)("#FF5722"));
 //BA.debugLineNum = 65;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 66;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 68;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 69;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 71;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _themeslist() throws Exception{
anywheresoftware.b4a.objects.collections.Map _availablethemes = null;
 //BA.debugLineNum = 12;BA.debugLine="Public Sub ThemesList() As Map";
 //BA.debugLineNum = 16;BA.debugLine="Private AvailableThemes As Map";
_availablethemes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 17;BA.debugLine="AvailableThemes.Initialize";
_availablethemes.Initialize();
 //BA.debugLineNum = 19;BA.debugLine="AvailableThemes.Put(\"Blue\", BlueTheme)";
_availablethemes.Put((Object)("Blue"),(Object)(_bluetheme().getObject()));
 //BA.debugLineNum = 20;BA.debugLine="AvailableThemes.Put(\"Teal\", TealTheme)";
_availablethemes.Put((Object)("Teal"),(Object)(_tealtheme().getObject()));
 //BA.debugLineNum = 22;BA.debugLine="AvailableThemes.Put(\"Gray\", GrayTheme)";
_availablethemes.Put((Object)("Gray"),(Object)(_graytheme().getObject()));
 //BA.debugLineNum = 23;BA.debugLine="AvailableThemes.Put(\"Dark\", DarkTheme)";
_availablethemes.Put((Object)("Dark"),(Object)(_darktheme().getObject()));
 //BA.debugLineNum = 25;BA.debugLine="Return AvailableThemes";
if (true) return _availablethemes;
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
