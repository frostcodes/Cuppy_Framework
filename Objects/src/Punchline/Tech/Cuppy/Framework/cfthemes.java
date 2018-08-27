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
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public anywheresoftware.b4a.objects.collections.Map  _ambertheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 168;BA.debugLine="Private Sub AmberTheme As Map";
 //BA.debugLineNum = 170;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 171;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 174;BA.debugLine="Colors.Put(\"primary\",\"#FFC107\")";
_colors.Put((Object)("primary"),(Object)("#FFC107"));
 //BA.debugLineNum = 175;BA.debugLine="Colors.Put(\"primary_dark\",\"#FFA000\")";
_colors.Put((Object)("primary_dark"),(Object)("#FFA000"));
 //BA.debugLineNum = 177;BA.debugLine="Colors.Put(\"primary_light\",\"#FFECB3\")";
_colors.Put((Object)("primary_light"),(Object)("#FFECB3"));
 //BA.debugLineNum = 178;BA.debugLine="Colors.Put(\"accent\",\"#03A9F4\")";
_colors.Put((Object)("accent"),(Object)("#03A9F4"));
 //BA.debugLineNum = 180;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 181;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 183;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 184;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 186;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _bluetheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 36;BA.debugLine="Private Sub BlueTheme As Map";
 //BA.debugLineNum = 38;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 39;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 42;BA.debugLine="Colors.Put(\"primary\",\"#2196F3\")";
_colors.Put((Object)("primary"),(Object)("#2196F3"));
 //BA.debugLineNum = 43;BA.debugLine="Colors.Put(\"primary_dark\",\"#1976D2\")";
_colors.Put((Object)("primary_dark"),(Object)("#1976D2"));
 //BA.debugLineNum = 45;BA.debugLine="Colors.Put(\"primary_light\",\"#BBDEFB\")";
_colors.Put((Object)("primary_light"),(Object)("#BBDEFB"));
 //BA.debugLineNum = 46;BA.debugLine="Colors.Put(\"accent\",\"#FF4081\")";
_colors.Put((Object)("accent"),(Object)("#FF4081"));
 //BA.debugLineNum = 48;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 49;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 51;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 52;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 54;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _darktheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 102;BA.debugLine="Private Sub DarkTheme As Map";
 //BA.debugLineNum = 104;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 105;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 108;BA.debugLine="Colors.Put(\"primary\",\"#2c3e50\")";
_colors.Put((Object)("primary"),(Object)("#2c3e50"));
 //BA.debugLineNum = 109;BA.debugLine="Colors.Put(\"primary_dark\",\"#1b2732\")";
_colors.Put((Object)("primary_dark"),(Object)("#1b2732"));
 //BA.debugLineNum = 111;BA.debugLine="Colors.Put(\"primary_light\",\"#68696a\")";
_colors.Put((Object)("primary_light"),(Object)("#68696a"));
 //BA.debugLineNum = 112;BA.debugLine="Colors.Put(\"accent\",\"#95a5a6\")";
_colors.Put((Object)("accent"),(Object)("#95a5a6"));
 //BA.debugLineNum = 114;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 115;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 117;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 118;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 120;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _graytheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 80;BA.debugLine="Private Sub GrayTheme As Map";
 //BA.debugLineNum = 82;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 83;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 86;BA.debugLine="Colors.Put(\"primary\",\"#7f8c8d\")";
_colors.Put((Object)("primary"),(Object)("#7f8c8d"));
 //BA.debugLineNum = 87;BA.debugLine="Colors.Put(\"primary_dark\",\"#5c6566\")";
_colors.Put((Object)("primary_dark"),(Object)("#5c6566"));
 //BA.debugLineNum = 89;BA.debugLine="Colors.Put(\"primary_light\",\"#a9a9a9\")";
_colors.Put((Object)("primary_light"),(Object)("#a9a9a9"));
 //BA.debugLineNum = 90;BA.debugLine="Colors.Put(\"accent\",\"#536DFE\")";
_colors.Put((Object)("accent"),(Object)("#536DFE"));
 //BA.debugLineNum = 92;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 93;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 95;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 96;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 98;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _pinktheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 146;BA.debugLine="Private Sub PinkTheme As Map";
 //BA.debugLineNum = 148;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 149;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 152;BA.debugLine="Colors.Put(\"primary\",\"#E91E63\")";
_colors.Put((Object)("primary"),(Object)("#E91E63"));
 //BA.debugLineNum = 153;BA.debugLine="Colors.Put(\"primary_dark\",\"#C2185B\")";
_colors.Put((Object)("primary_dark"),(Object)("#C2185B"));
 //BA.debugLineNum = 155;BA.debugLine="Colors.Put(\"primary_light\",\"#F8BBD0\")";
_colors.Put((Object)("primary_light"),(Object)("#F8BBD0"));
 //BA.debugLineNum = 156;BA.debugLine="Colors.Put(\"accent\",\"#FF9800\")";
_colors.Put((Object)("accent"),(Object)("#FF9800"));
 //BA.debugLineNum = 158;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 159;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 161;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 162;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 164;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _purpletheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 124;BA.debugLine="Private Sub PurpleTheme As Map";
 //BA.debugLineNum = 126;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 127;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 130;BA.debugLine="Colors.Put(\"primary\",\"#673AB7\")";
_colors.Put((Object)("primary"),(Object)("#673AB7"));
 //BA.debugLineNum = 131;BA.debugLine="Colors.Put(\"primary_dark\",\"#512DA8\")";
_colors.Put((Object)("primary_dark"),(Object)("#512DA8"));
 //BA.debugLineNum = 133;BA.debugLine="Colors.Put(\"primary_light\",\"#D1C4E9\")";
_colors.Put((Object)("primary_light"),(Object)("#D1C4E9"));
 //BA.debugLineNum = 134;BA.debugLine="Colors.Put(\"accent\",\"#536DFE\")";
_colors.Put((Object)("accent"),(Object)("#536DFE"));
 //BA.debugLineNum = 136;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 137;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 139;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 140;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 142;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _tealtheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 58;BA.debugLine="Private Sub TealTheme As Map";
 //BA.debugLineNum = 60;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 61;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 64;BA.debugLine="Colors.Put(\"primary\",\"#009688\")";
_colors.Put((Object)("primary"),(Object)("#009688"));
 //BA.debugLineNum = 65;BA.debugLine="Colors.Put(\"primary_dark\",\"#00796B\")";
_colors.Put((Object)("primary_dark"),(Object)("#00796B"));
 //BA.debugLineNum = 67;BA.debugLine="Colors.Put(\"primary_light\",\"#B2DFDB\")";
_colors.Put((Object)("primary_light"),(Object)("#B2DFDB"));
 //BA.debugLineNum = 68;BA.debugLine="Colors.Put(\"accent\",\"#FF5722\")";
_colors.Put((Object)("accent"),(Object)("#FF5722"));
 //BA.debugLineNum = 70;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 71;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 73;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 74;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 76;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _themeslist() throws Exception{
anywheresoftware.b4a.objects.collections.Map _availablethemes = null;
 //BA.debugLineNum = 14;BA.debugLine="Public Sub ThemesList() As Map";
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
 //BA.debugLineNum = 25;BA.debugLine="AvailableThemes.Put(\"Purple\", PurpleTheme)";
_availablethemes.Put((Object)("Purple"),(Object)(_purpletheme().getObject()));
 //BA.debugLineNum = 26;BA.debugLine="AvailableThemes.Put(\"Pink\", PinkTheme)";
_availablethemes.Put((Object)("Pink"),(Object)(_pinktheme().getObject()));
 //BA.debugLineNum = 28;BA.debugLine="AvailableThemes.Put(\"Amber\", AmberTheme)";
_availablethemes.Put((Object)("Amber"),(Object)(_ambertheme().getObject()));
 //BA.debugLineNum = 30;BA.debugLine="Return AvailableThemes";
if (true) return _availablethemes;
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
