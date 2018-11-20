package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfthemes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfthemes", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.main _main = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public anywheresoftware.b4a.objects.collections.Map  _ambertheme(Punchline.Tech.Cuppy.Framework.cfthemes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfthemes";
if (Debug.shouldDelegate(ba, "ambertheme"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "ambertheme", null));}
anywheresoftware.b4a.objects.collections.Map _colors = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Private Sub AmberTheme As Map";
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="Colors.Initialize";
_colors.Initialize();
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="Colors.Put(\"primary\",\"#FFC107\")";
_colors.Put((Object)("primary"),(Object)("#FFC107"));
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="Colors.Put(\"primary_dark\",\"#FFA000\")";
_colors.Put((Object)("primary_dark"),(Object)("#FFA000"));
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="Colors.Put(\"primary_light\",\"#FFECB3\")";
_colors.Put((Object)("primary_light"),(Object)("#FFECB3"));
RDebugUtils.currentLine=7733258;
 //BA.debugLineNum = 7733258;BA.debugLine="Colors.Put(\"accent\",\"#03A9F4\")";
_colors.Put((Object)("accent"),(Object)("#03A9F4"));
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
RDebugUtils.currentLine=7733261;
 //BA.debugLineNum = 7733261;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
RDebugUtils.currentLine=7733264;
 //BA.debugLineNum = 7733264;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
RDebugUtils.currentLine=7733266;
 //BA.debugLineNum = 7733266;BA.debugLine="Return Colors";
if (true) return _colors;
RDebugUtils.currentLine=7733268;
 //BA.debugLineNum = 7733268;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _bluetheme(Punchline.Tech.Cuppy.Framework.cfthemes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfthemes";
if (Debug.shouldDelegate(ba, "bluetheme"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "bluetheme", null));}
anywheresoftware.b4a.objects.collections.Map _colors = null;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Private Sub BlueTheme As Map";
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="Colors.Initialize";
_colors.Initialize();
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="Colors.Put(\"primary\",\"#2196F3\")";
_colors.Put((Object)("primary"),(Object)("#2196F3"));
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="Colors.Put(\"primary_dark\",\"#1976D2\")";
_colors.Put((Object)("primary_dark"),(Object)("#1976D2"));
RDebugUtils.currentLine=7340041;
 //BA.debugLineNum = 7340041;BA.debugLine="Colors.Put(\"primary_light\",\"#BBDEFB\")";
_colors.Put((Object)("primary_light"),(Object)("#BBDEFB"));
RDebugUtils.currentLine=7340042;
 //BA.debugLineNum = 7340042;BA.debugLine="Colors.Put(\"accent\",\"#FF4081\")";
_colors.Put((Object)("accent"),(Object)("#FF4081"));
RDebugUtils.currentLine=7340044;
 //BA.debugLineNum = 7340044;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
RDebugUtils.currentLine=7340045;
 //BA.debugLineNum = 7340045;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
RDebugUtils.currentLine=7340047;
 //BA.debugLineNum = 7340047;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
RDebugUtils.currentLine=7340048;
 //BA.debugLineNum = 7340048;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
RDebugUtils.currentLine=7340050;
 //BA.debugLineNum = 7340050;BA.debugLine="Return Colors";
if (true) return _colors;
RDebugUtils.currentLine=7340052;
 //BA.debugLineNum = 7340052;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfthemes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfthemes";
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _darktheme(Punchline.Tech.Cuppy.Framework.cfthemes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfthemes";
if (Debug.shouldDelegate(ba, "darktheme"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "darktheme", null));}
anywheresoftware.b4a.objects.collections.Map _colors = null;
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Private Sub DarkTheme As Map";
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="Colors.Initialize";
_colors.Initialize();
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="Colors.Put(\"primary\",\"#2c3e50\")";
_colors.Put((Object)("primary"),(Object)("#2c3e50"));
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="Colors.Put(\"primary_dark\",\"#1b2732\")";
_colors.Put((Object)("primary_dark"),(Object)("#1b2732"));
RDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="Colors.Put(\"primary_light\",\"#68696a\")";
_colors.Put((Object)("primary_light"),(Object)("#68696a"));
RDebugUtils.currentLine=7536650;
 //BA.debugLineNum = 7536650;BA.debugLine="Colors.Put(\"accent\",\"#95a5a6\")";
_colors.Put((Object)("accent"),(Object)("#95a5a6"));
RDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
RDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
RDebugUtils.currentLine=7536655;
 //BA.debugLineNum = 7536655;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
RDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
RDebugUtils.currentLine=7536658;
 //BA.debugLineNum = 7536658;BA.debugLine="Return Colors";
if (true) return _colors;
RDebugUtils.currentLine=7536660;
 //BA.debugLineNum = 7536660;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _graytheme(Punchline.Tech.Cuppy.Framework.cfthemes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfthemes";
if (Debug.shouldDelegate(ba, "graytheme"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "graytheme", null));}
anywheresoftware.b4a.objects.collections.Map _colors = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Private Sub GrayTheme As Map";
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="Colors.Initialize";
_colors.Initialize();
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="Colors.Put(\"primary\",\"#7f8c8d\")";
_colors.Put((Object)("primary"),(Object)("#7f8c8d"));
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Colors.Put(\"primary_dark\",\"#5c6566\")";
_colors.Put((Object)("primary_dark"),(Object)("#5c6566"));
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="Colors.Put(\"primary_light\",\"#a9a9a9\")";
_colors.Put((Object)("primary_light"),(Object)("#a9a9a9"));
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="Colors.Put(\"accent\",\"#536DFE\")";
_colors.Put((Object)("accent"),(Object)("#536DFE"));
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
RDebugUtils.currentLine=7471119;
 //BA.debugLineNum = 7471119;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
RDebugUtils.currentLine=7471120;
 //BA.debugLineNum = 7471120;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
RDebugUtils.currentLine=7471122;
 //BA.debugLineNum = 7471122;BA.debugLine="Return Colors";
if (true) return _colors;
RDebugUtils.currentLine=7471124;
 //BA.debugLineNum = 7471124;BA.debugLine="End Sub";
return null;
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfthemes __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfthemes";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _pinktheme(Punchline.Tech.Cuppy.Framework.cfthemes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfthemes";
if (Debug.shouldDelegate(ba, "pinktheme"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "pinktheme", null));}
anywheresoftware.b4a.objects.collections.Map _colors = null;
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Private Sub PinkTheme As Map";
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="Colors.Initialize";
_colors.Initialize();
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="Colors.Put(\"primary\",\"#E91E63\")";
_colors.Put((Object)("primary"),(Object)("#E91E63"));
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="Colors.Put(\"primary_dark\",\"#C2185B\")";
_colors.Put((Object)("primary_dark"),(Object)("#C2185B"));
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="Colors.Put(\"primary_light\",\"#F8BBD0\")";
_colors.Put((Object)("primary_light"),(Object)("#F8BBD0"));
RDebugUtils.currentLine=7667722;
 //BA.debugLineNum = 7667722;BA.debugLine="Colors.Put(\"accent\",\"#FF9800\")";
_colors.Put((Object)("accent"),(Object)("#FF9800"));
RDebugUtils.currentLine=7667724;
 //BA.debugLineNum = 7667724;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
RDebugUtils.currentLine=7667725;
 //BA.debugLineNum = 7667725;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
RDebugUtils.currentLine=7667727;
 //BA.debugLineNum = 7667727;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
RDebugUtils.currentLine=7667728;
 //BA.debugLineNum = 7667728;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
RDebugUtils.currentLine=7667730;
 //BA.debugLineNum = 7667730;BA.debugLine="Return Colors";
if (true) return _colors;
RDebugUtils.currentLine=7667732;
 //BA.debugLineNum = 7667732;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _purpletheme(Punchline.Tech.Cuppy.Framework.cfthemes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfthemes";
if (Debug.shouldDelegate(ba, "purpletheme"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "purpletheme", null));}
anywheresoftware.b4a.objects.collections.Map _colors = null;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Private Sub PurpleTheme As Map";
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="Colors.Initialize";
_colors.Initialize();
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="Colors.Put(\"primary\",\"#673AB7\")";
_colors.Put((Object)("primary"),(Object)("#673AB7"));
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="Colors.Put(\"primary_dark\",\"#512DA8\")";
_colors.Put((Object)("primary_dark"),(Object)("#512DA8"));
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="Colors.Put(\"primary_light\",\"#D1C4E9\")";
_colors.Put((Object)("primary_light"),(Object)("#D1C4E9"));
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="Colors.Put(\"accent\",\"#536DFE\")";
_colors.Put((Object)("accent"),(Object)("#536DFE"));
RDebugUtils.currentLine=7602188;
 //BA.debugLineNum = 7602188;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
RDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
RDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
RDebugUtils.currentLine=7602194;
 //BA.debugLineNum = 7602194;BA.debugLine="Return Colors";
if (true) return _colors;
RDebugUtils.currentLine=7602196;
 //BA.debugLineNum = 7602196;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _tealtheme(Punchline.Tech.Cuppy.Framework.cfthemes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfthemes";
if (Debug.shouldDelegate(ba, "tealtheme"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "tealtheme", null));}
anywheresoftware.b4a.objects.collections.Map _colors = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Private Sub TealTheme As Map";
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Colors.Initialize";
_colors.Initialize();
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="Colors.Put(\"primary\",\"#009688\")";
_colors.Put((Object)("primary"),(Object)("#009688"));
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="Colors.Put(\"primary_dark\",\"#00796B\")";
_colors.Put((Object)("primary_dark"),(Object)("#00796B"));
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="Colors.Put(\"primary_light\",\"#B2DFDB\")";
_colors.Put((Object)("primary_light"),(Object)("#B2DFDB"));
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="Colors.Put(\"accent\",\"#FF5722\")";
_colors.Put((Object)("accent"),(Object)("#FF5722"));
RDebugUtils.currentLine=7405580;
 //BA.debugLineNum = 7405580;BA.debugLine="Colors.Put(\"primary_text\",\"#212121\")";
_colors.Put((Object)("primary_text"),(Object)("#212121"));
RDebugUtils.currentLine=7405581;
 //BA.debugLineNum = 7405581;BA.debugLine="Colors.Put(\"secondary_text\",\"#757575\")";
_colors.Put((Object)("secondary_text"),(Object)("#757575"));
RDebugUtils.currentLine=7405583;
 //BA.debugLineNum = 7405583;BA.debugLine="Colors.Put(\"icons\",\"#FFFFFF\")";
_colors.Put((Object)("icons"),(Object)("#FFFFFF"));
RDebugUtils.currentLine=7405584;
 //BA.debugLineNum = 7405584;BA.debugLine="Colors.Put(\"divider\",\"#BDBDBD\")";
_colors.Put((Object)("divider"),(Object)("#BDBDBD"));
RDebugUtils.currentLine=7405586;
 //BA.debugLineNum = 7405586;BA.debugLine="Return Colors";
if (true) return _colors;
RDebugUtils.currentLine=7405588;
 //BA.debugLineNum = 7405588;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _themeslist(Punchline.Tech.Cuppy.Framework.cfthemes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfthemes";
if (Debug.shouldDelegate(ba, "themeslist"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "themeslist", null));}
anywheresoftware.b4a.objects.collections.Map _availablethemes = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub ThemesList() As Map";
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Private AvailableThemes As Map";
_availablethemes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="AvailableThemes.Initialize";
_availablethemes.Initialize();
RDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="AvailableThemes.Put(\"Blue\", BlueTheme)";
_availablethemes.Put((Object)("Blue"),(Object)(__ref._bluetheme(null).getObject()));
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="AvailableThemes.Put(\"Teal\", TealTheme)";
_availablethemes.Put((Object)("Teal"),(Object)(__ref._tealtheme(null).getObject()));
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="AvailableThemes.Put(\"Gray\", GrayTheme)";
_availablethemes.Put((Object)("Gray"),(Object)(__ref._graytheme(null).getObject()));
RDebugUtils.currentLine=7274510;
 //BA.debugLineNum = 7274510;BA.debugLine="AvailableThemes.Put(\"Dark\", DarkTheme)";
_availablethemes.Put((Object)("Dark"),(Object)(__ref._darktheme(null).getObject()));
RDebugUtils.currentLine=7274512;
 //BA.debugLineNum = 7274512;BA.debugLine="AvailableThemes.Put(\"Purple\", PurpleTheme)";
_availablethemes.Put((Object)("Purple"),(Object)(__ref._purpletheme(null).getObject()));
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="AvailableThemes.Put(\"Pink\", PinkTheme)";
_availablethemes.Put((Object)("Pink"),(Object)(__ref._pinktheme(null).getObject()));
RDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="AvailableThemes.Put(\"Amber\", AmberTheme)";
_availablethemes.Put((Object)("Amber"),(Object)(__ref._ambertheme(null).getObject()));
RDebugUtils.currentLine=7274519;
 //BA.debugLineNum = 7274519;BA.debugLine="Return AvailableThemes";
if (true) return _availablethemes;
RDebugUtils.currentLine=7274521;
 //BA.debugLineNum = 7274521;BA.debugLine="End Sub";
return null;
}
}