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
public b4j.example.cssutils _vvvvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvvvvv7 = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvvvv0 = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvvvvvv1 = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvvvvvv2 = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvvvvv7 = null;
public anywheresoftware.b4a.objects.collections.Map  _vvvvvvvvvvvvvvvvvvvv0() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 178;BA.debugLine="Private Sub AmberTheme As Map";
 //BA.debugLineNum = 180;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 181;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 184;BA.debugLine="Colors.Put(\"primary\",\"#FFC107\")";
_colors.Put((Object)("primary"),(Object)("#FFC107"));
 //BA.debugLineNum = 185;BA.debugLine="Colors.Put(\"primary_dark\",\"#FFA000\")";
_colors.Put((Object)("primary_dark"),(Object)("#FFA000"));
 //BA.debugLineNum = 187;BA.debugLine="Colors.Put(\"primary_light\",\"#FFECB3\")";
_colors.Put((Object)("primary_light"),(Object)("#FFECB3"));
 //BA.debugLineNum = 188;BA.debugLine="Colors.Put(\"accent\",\"#03A9F4\")";
_colors.Put((Object)("accent"),(Object)("#03A9F4"));
 //BA.debugLineNum = 190;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 191;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 193;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 194;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 196;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _vvvvvvvvvvvvvvvvvvvvv1() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 42;BA.debugLine="Private Sub BlueTheme As Map";
 //BA.debugLineNum = 44;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 45;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 48;BA.debugLine="Colors.Put(\"primary\",\"#2196F3\")";
_colors.Put((Object)("primary"),(Object)("#2196F3"));
 //BA.debugLineNum = 49;BA.debugLine="Colors.Put(\"primary_dark\",\"#1976D2\")";
_colors.Put((Object)("primary_dark"),(Object)("#1976D2"));
 //BA.debugLineNum = 51;BA.debugLine="Colors.Put(\"primary_light\",\"#BBDEFB\")";
_colors.Put((Object)("primary_light"),(Object)("#BBDEFB"));
 //BA.debugLineNum = 52;BA.debugLine="Colors.Put(\"accent\",\"#FF4081\")";
_colors.Put((Object)("accent"),(Object)("#FF4081"));
 //BA.debugLineNum = 54;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 55;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 57;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 58;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 60;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _vvvvvvvvvvvvvvvvvvvvv2() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 112;BA.debugLine="Private Sub DarkTheme As Map";
 //BA.debugLineNum = 114;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 115;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 118;BA.debugLine="Colors.Put(\"primary\",\"#2c3e50\")";
_colors.Put((Object)("primary"),(Object)("#2c3e50"));
 //BA.debugLineNum = 119;BA.debugLine="Colors.Put(\"primary_dark\",\"#1b2732\")";
_colors.Put((Object)("primary_dark"),(Object)("#1b2732"));
 //BA.debugLineNum = 121;BA.debugLine="Colors.Put(\"primary_light\",\"#68696a\")";
_colors.Put((Object)("primary_light"),(Object)("#68696a"));
 //BA.debugLineNum = 122;BA.debugLine="Colors.Put(\"accent\",\"#95a5a6\")";
_colors.Put((Object)("accent"),(Object)("#95a5a6"));
 //BA.debugLineNum = 124;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 125;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 127;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 128;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 130;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _vvvvvvvvvvvvvvvvvvvvv3() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 90;BA.debugLine="Private Sub GrayTheme As Map";
 //BA.debugLineNum = 92;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 93;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 96;BA.debugLine="Colors.Put(\"primary\",\"#7f8c8d\")";
_colors.Put((Object)("primary"),(Object)("#7f8c8d"));
 //BA.debugLineNum = 97;BA.debugLine="Colors.Put(\"primary_dark\",\"#5c6566\")";
_colors.Put((Object)("primary_dark"),(Object)("#5c6566"));
 //BA.debugLineNum = 99;BA.debugLine="Colors.Put(\"primary_light\",\"#a9a9a9\")";
_colors.Put((Object)("primary_light"),(Object)("#a9a9a9"));
 //BA.debugLineNum = 100;BA.debugLine="Colors.Put(\"accent\",\"#536DFE\")";
_colors.Put((Object)("accent"),(Object)("#536DFE"));
 //BA.debugLineNum = 102;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 103;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 105;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 106;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 108;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _vvvvvvvvvvvvvvvvvvvvv4() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 156;BA.debugLine="Private Sub PinkTheme As Map";
 //BA.debugLineNum = 158;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 159;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 162;BA.debugLine="Colors.Put(\"primary\",\"#E91E63\")";
_colors.Put((Object)("primary"),(Object)("#E91E63"));
 //BA.debugLineNum = 163;BA.debugLine="Colors.Put(\"primary_dark\",\"#C2185B\")";
_colors.Put((Object)("primary_dark"),(Object)("#C2185B"));
 //BA.debugLineNum = 165;BA.debugLine="Colors.Put(\"primary_light\",\"#F8BBD0\")";
_colors.Put((Object)("primary_light"),(Object)("#F8BBD0"));
 //BA.debugLineNum = 166;BA.debugLine="Colors.Put(\"accent\",\"#FF9800\")";
_colors.Put((Object)("accent"),(Object)("#FF9800"));
 //BA.debugLineNum = 168;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 169;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 171;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 172;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 174;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _vvvvvvvvvvvvvvvvvvvvv5() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 134;BA.debugLine="Private Sub PurpleTheme As Map";
 //BA.debugLineNum = 136;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 137;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 140;BA.debugLine="Colors.Put(\"primary\",\"#673AB7\")";
_colors.Put((Object)("primary"),(Object)("#673AB7"));
 //BA.debugLineNum = 141;BA.debugLine="Colors.Put(\"primary_dark\",\"#512DA8\")";
_colors.Put((Object)("primary_dark"),(Object)("#512DA8"));
 //BA.debugLineNum = 143;BA.debugLine="Colors.Put(\"primary_light\",\"#D1C4E9\")";
_colors.Put((Object)("primary_light"),(Object)("#D1C4E9"));
 //BA.debugLineNum = 144;BA.debugLine="Colors.Put(\"accent\",\"#536DFE\")";
_colors.Put((Object)("accent"),(Object)("#536DFE"));
 //BA.debugLineNum = 146;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 147;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 149;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 150;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 152;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _vvvvvvvvvvvvvvvvvvvvv6() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 64;BA.debugLine="Private Sub TealTheme As Map";
 //BA.debugLineNum = 66;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 67;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 70;BA.debugLine="Colors.Put(\"primary\",\"#009688\")";
_colors.Put((Object)("primary"),(Object)("#009688"));
 //BA.debugLineNum = 71;BA.debugLine="Colors.Put(\"primary_dark\",\"#00796B\")";
_colors.Put((Object)("primary_dark"),(Object)("#00796B"));
 //BA.debugLineNum = 73;BA.debugLine="Colors.Put(\"primary_light\",\"#B2DFDB\")";
_colors.Put((Object)("primary_light"),(Object)("#B2DFDB"));
 //BA.debugLineNum = 74;BA.debugLine="Colors.Put(\"accent\",\"#FF5722\")";
_colors.Put((Object)("accent"),(Object)("#FF5722"));
 //BA.debugLineNum = 76;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
 //BA.debugLineNum = 77;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
 //BA.debugLineNum = 79;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
 //BA.debugLineNum = 80;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
 //BA.debugLineNum = 82;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _vvvvvvvvvvvvvvvvvvvvv7() throws Exception{
anywheresoftware.b4a.objects.collections.Map _availablethemes = null;
 //BA.debugLineNum = 13;BA.debugLine="Public Sub ThemesList() As Map";
 //BA.debugLineNum = 15;BA.debugLine="Private AvailableThemes As Map";
_availablethemes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 16;BA.debugLine="AvailableThemes.Initialize";
_availablethemes.Initialize();
 //BA.debugLineNum = 18;BA.debugLine="AvailableThemes.Put(\"Blue\", BlueTheme)";
_availablethemes.Put((Object)("Blue"),(Object)(_vvvvvvvvvvvvvvvvvvvvv1().getObject()));
 //BA.debugLineNum = 19;BA.debugLine="AvailableThemes.Put(\"Teal\", TealTheme)";
_availablethemes.Put((Object)("Teal"),(Object)(_vvvvvvvvvvvvvvvvvvvvv6().getObject()));
 //BA.debugLineNum = 26;BA.debugLine="AvailableThemes.Put(\"Gray\", GrayTheme)";
_availablethemes.Put((Object)("Gray"),(Object)(_vvvvvvvvvvvvvvvvvvvvv3().getObject()));
 //BA.debugLineNum = 27;BA.debugLine="AvailableThemes.Put(\"Dark\", DarkTheme)";
_availablethemes.Put((Object)("Dark"),(Object)(_vvvvvvvvvvvvvvvvvvvvv2().getObject()));
 //BA.debugLineNum = 29;BA.debugLine="AvailableThemes.Put(\"Purple\", PurpleTheme)";
_availablethemes.Put((Object)("Purple"),(Object)(_vvvvvvvvvvvvvvvvvvvvv5().getObject()));
 //BA.debugLineNum = 30;BA.debugLine="AvailableThemes.Put(\"Pink\", PinkTheme)";
_availablethemes.Put((Object)("Pink"),(Object)(_vvvvvvvvvvvvvvvvvvvvv4().getObject()));
 //BA.debugLineNum = 32;BA.debugLine="AvailableThemes.Put(\"Amber\", AmberTheme)";
_availablethemes.Put((Object)("Amber"),(Object)(_vvvvvvvvvvvvvvvvvvvv0().getObject()));
 //BA.debugLineNum = 36;BA.debugLine="Return AvailableThemes";
if (true) return _availablethemes;
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
