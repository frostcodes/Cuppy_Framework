package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class datatypeutility extends Object{
public static datatypeutility mostCurrent = new datatypeutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.datatypeutility", null);
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
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static boolean  _boolval(Object _mixedvar) throws Exception{
RDebugUtils.currentModule="datatypeutility";
if (Debug.shouldDelegate(ba, "boolval"))
	 {return ((Boolean) Debug.delegate(ba, "boolval", new Object[] {_mixedvar}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub boolval(mixedVar As Object) As Boolean";
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="If mixedVar = False Then";
if ((_mixedvar).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="If mixedVar = 0  Or mixedVar = 0.0 Then";
if ((_mixedvar).equals((Object)(0)) || (_mixedvar).equals((Object)(0.0))) { 
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="If mixedVar = \"\" Or mixedVar = \"0\" Then";
if ((_mixedvar).equals((Object)("")) || (_mixedvar).equals((Object)("0"))) { 
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="If mixedVar = Null  Or mixedVar = \"undefined\" The";
if (_mixedvar== null || (_mixedvar).equals((Object)("undefined"))) { 
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=4784146;
 //BA.debugLineNum = 4784146;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="End Sub";
return false;
}
public static boolean  _is_scalar(Object _mixedvar) throws Exception{
RDebugUtils.currentModule="datatypeutility";
if (Debug.shouldDelegate(ba, "is_scalar"))
	 {return ((Boolean) Debug.delegate(ba, "is_scalar", new Object[] {_mixedvar}));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub is_scalar (mixedVar As Object) As Boole";
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Return isString(mixedVar) Or IsNumber(mixedVar) O";
if (true) return _isstring(_mixedvar) || anywheresoftware.b4a.keywords.Common.IsNumber(BA.ObjectToString(_mixedvar)) || _isboolean(_mixedvar);
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="End Sub";
return false;
}
public static boolean  _isstring(Object _obj) throws Exception{
RDebugUtils.currentModule="datatypeutility";
if (Debug.shouldDelegate(ba, "isstring"))
	 {return ((Boolean) Debug.delegate(ba, "isstring", new Object[] {_obj}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub isString(obj As Object) As Boolean";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Return isTypeOf(obj, \"string\")";
if (true) return _istypeof(_obj,"string");
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="End Sub";
return false;
}
public static boolean  _isboolean(Object _obj) throws Exception{
RDebugUtils.currentModule="datatypeutility";
if (Debug.shouldDelegate(ba, "isboolean"))
	 {return ((Boolean) Debug.delegate(ba, "isboolean", new Object[] {_obj}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub isBoolean(obj As Object) As Boolean";
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Return isTypeOf(obj, \"boolean\")";
if (true) return _istypeof(_obj,"boolean");
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="End Sub";
return false;
}
public static boolean  _isarraylist(Object _obj) throws Exception{
RDebugUtils.currentModule="datatypeutility";
if (Debug.shouldDelegate(ba, "isarraylist"))
	 {return ((Boolean) Debug.delegate(ba, "isarraylist", new Object[] {_obj}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub isArrayList(obj As Object) As Boolean";
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Return isTypeOf(obj, \"arraylist\")";
if (true) return _istypeof(_obj,"arraylist");
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="End Sub";
return false;
}
public static boolean  _istypeof(Object _obj,String _typeof) throws Exception{
RDebugUtils.currentModule="datatypeutility";
if (Debug.shouldDelegate(ba, "istypeof"))
	 {return ((Boolean) Debug.delegate(ba, "istypeof", new Object[] {_obj,_typeof}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub isTypeOf(obj As Object , TypeOf As Stri";
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Return strip_java_type(GetType(obj)) = TypeOf.ToL";
if (true) return (_strip_java_type(anywheresoftware.b4a.keywords.Common.GetType(_obj))).equals(_typeof.toLowerCase());
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="End Sub";
return false;
}
public static boolean  _isdouble(Object _obj) throws Exception{
RDebugUtils.currentModule="datatypeutility";
if (Debug.shouldDelegate(ba, "isdouble"))
	 {return ((Boolean) Debug.delegate(ba, "isdouble", new Object[] {_obj}));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub isDouble(obj As Object) As Boolean";
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Return isTypeOf(obj, \"double\")";
if (true) return _istypeof(_obj,"double");
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="End Sub";
return false;
}
public static boolean  _isinteger(Object _obj) throws Exception{
RDebugUtils.currentModule="datatypeutility";
if (Debug.shouldDelegate(ba, "isinteger"))
	 {return ((Boolean) Debug.delegate(ba, "isinteger", new Object[] {_obj}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub isInteger(obj As Object) As Boolean";
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Return isTypeOf(obj, \"integer\")";
if (true) return _istypeof(_obj,"integer");
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="End Sub";
return false;
}
public static boolean  _islist(Object _obj) throws Exception{
RDebugUtils.currentModule="datatypeutility";
if (Debug.shouldDelegate(ba, "islist"))
	 {return ((Boolean) Debug.delegate(ba, "islist", new Object[] {_obj}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub isList(obj As Object) As Boolean";
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Return isArrayList(obj)";
if (true) return _isarraylist(_obj);
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnull(Object _obj) throws Exception{
RDebugUtils.currentModule="datatypeutility";
if (Debug.shouldDelegate(ba, "isnull"))
	 {return ((Boolean) Debug.delegate(ba, "isnull", new Object[] {_obj}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub isNull(obj As Object) As Boolean";
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Return StringUtility.isNull(obj)";
if (true) return _stringutility._isnull(_obj);
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="End Sub";
return false;
}
public static boolean  _isobject(Object _obj) throws Exception{
RDebugUtils.currentModule="datatypeutility";
if (Debug.shouldDelegate(ba, "isobject"))
	 {return ((Boolean) Debug.delegate(ba, "isobject", new Object[] {_obj}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub isObject(obj As Object) As Boolean";
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Return isTypeOf(obj, \"object\")";
if (true) return _istypeof(_obj,"object");
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="End Sub";
return false;
}
public static String  _strip_java_type(String _str) throws Exception{
RDebugUtils.currentModule="datatypeutility";
if (Debug.shouldDelegate(ba, "strip_java_type"))
	 {return ((String) Debug.delegate(ba, "strip_java_type", new Object[] {_str}));}
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Private Sub strip_java_type(str As String) As Stri";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="str = str.Replace(\"java.lang.\",\"\")";
_str = _str.replace("java.lang.","");
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="str = str.Replace(\"java.util.\",\"\")";
_str = _str.replace("java.util.","");
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="If str.Contains(\"$\") Then";
if (_str.contains("$")) { 
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="str = StringUtility.breakStrAt( str, \"$\")";
_str = BA.ObjectToString(_stringutility._breakstrat(_str,"$"));
RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="str = StringUtility.trim_left_once(str, \"$\")";
_str = _stringutility._trim_left_once(_str,"$");
RDebugUtils.currentLine=4849674;
 //BA.debugLineNum = 4849674;BA.debugLine="str = StringUtility.trim_left_once(str, \"_\")";
_str = _stringutility._trim_left_once(_str,"_");
 };
RDebugUtils.currentLine=4849678;
 //BA.debugLineNum = 4849678;BA.debugLine="Return str.ToLowerCase";
if (true) return _str.toLowerCase();
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="End Sub";
return "";
}
}