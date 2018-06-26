package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class datatypeutility extends Object{
public static datatypeutility mostCurrent = new datatypeutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.datatypeutility", null);
		ba.loadHtSubs(datatypeutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.datatypeutility", ba);
		}
	}
    public static Class<?> getObject() {
		return datatypeutility.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.cuppyglobals _cuppyglobals = null;
public static Punchline.Tech.Cuppy.Framework.numbersutility _numbersutility = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static boolean  _boolval(Object _mixedvar) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Public Sub boolval(mixedVar As Object) As Boolean";
 //BA.debugLineNum = 9;BA.debugLine="If mixedVar = False Then";
if ((_mixedvar).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
 //BA.debugLineNum = 10;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 13;BA.debugLine="If mixedVar = 0  Or mixedVar = 0.0 Then";
if ((_mixedvar).equals((Object)(0)) || (_mixedvar).equals((Object)(0.0))) { 
 //BA.debugLineNum = 14;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 17;BA.debugLine="If mixedVar = \"\" Or mixedVar = \"0\" Then";
if ((_mixedvar).equals((Object)("")) || (_mixedvar).equals((Object)("0"))) { 
 //BA.debugLineNum = 18;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 27;BA.debugLine="If mixedVar = Null  Or mixedVar = \"undefined\" The";
if (_mixedvar== null || (_mixedvar).equals((Object)("undefined"))) { 
 //BA.debugLineNum = 28;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 32;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return false;
}
public static boolean  _isboolean(Object _obj) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Public Sub isBoolean(obj As Object) As Boolean";
 //BA.debugLineNum = 53;BA.debugLine="Return isTypeOf(obj, \"boolean\")";
if (true) return _istypeof(_obj,"boolean");
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return false;
}
public static boolean  _isstring(Object _obj) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Public Sub isString(obj As Object) As Boolean";
 //BA.debugLineNum = 60;BA.debugLine="Return isTypeOf(obj, \"string\")";
if (true) return _istypeof(_obj,"string");
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return false;
}
public static boolean  _istypeof(Object _obj,String _typeof) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Private Sub isTypeOf(obj As Object , TypeOf As Str";
 //BA.debugLineNum = 46;BA.debugLine="Return strip_java_type(GetType(obj)) = TypeOf";
if (true) return (_strip_java_type(anywheresoftware.b4a.keywords.Common.GetType(_obj))).equals(_typeof);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return "";
}
public static String  _strip_java_type(String _str) throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Private Sub strip_java_type(str As String) As Stri";
 //BA.debugLineNum = 39;BA.debugLine="Return str.Replace(\"java.lang.\",\"\").ToLowerCase";
if (true) return _str.replace("java.lang.","").toLowerCase();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
}
