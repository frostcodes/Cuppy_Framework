package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class metrothemes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.metrothemes", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.metrothemes.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.configs _configs = null;
public Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public Punchline.Tech.Cuppy.Framework.cuppyglobals _cuppyglobals = null;
public Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public anywheresoftware.b4a.objects.collections.Map  _bluetheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 26;BA.debugLine="Public Sub BlueTheme As Map";
 //BA.debugLineNum = 28;BA.debugLine="Private Colors As Map 'use to store the colors we";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 29;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 44;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _selecttheme(String _theme) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub SelectTheme(theme As String)";
 //BA.debugLineNum = 75;BA.debugLine="StyleManager.DefaultTheme = ThemesList.Get(theme)";
_stylemanager._defaulttheme.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_themeslist().Get((Object)(_theme))));
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _tealtheme() throws Exception{
anywheresoftware.b4a.objects.collections.Map _colors = null;
 //BA.debugLineNum = 48;BA.debugLine="Public Sub TealTheme As Map";
 //BA.debugLineNum = 50;BA.debugLine="Private Colors As Map 'use to store the colors w";
_colors = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 51;BA.debugLine="Colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 66;BA.debugLine="Return Colors";
if (true) return _colors;
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 22;BA.debugLine="Return AvailableThemes";
if (true) return _availablethemes;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
