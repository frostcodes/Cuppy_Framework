package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class datatypeutility_subs_0 {


public static RemoteObject  _boolval(RemoteObject _mixedvar) throws Exception{
try {
		Debug.PushSubsStack("boolval (datatypeutility) ","datatypeutility",6,datatypeutility.ba,datatypeutility.mostCurrent,12);
if (RapidSub.canDelegate("boolval")) { return Punchline.Tech.Cuppy.Framework.datatypeutility.remoteMe.runUserSub(false, "datatypeutility","boolval", _mixedvar);}
Debug.locals.put("mixedVar", _mixedvar);
 BA.debugLineNum = 12;BA.debugLine="Public Sub boolval(mixedVar As Object) As Boolean";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="If mixedVar = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_mixedvar,(datatypeutility.__c.getField(true,"False")))) { 
 BA.debugLineNum = 15;BA.debugLine="Return False";
Debug.ShouldStop(16384);
if (true) return datatypeutility.__c.getField(true,"False");
 };
 BA.debugLineNum = 18;BA.debugLine="If mixedVar = 0  Or mixedVar = 0.0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_mixedvar,RemoteObject.createImmutable((0))) || RemoteObject.solveBoolean("=",_mixedvar,RemoteObject.createImmutable((0.0)))) { 
 BA.debugLineNum = 19;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) return datatypeutility.__c.getField(true,"False");
 };
 BA.debugLineNum = 22;BA.debugLine="If mixedVar = \"\" Or mixedVar = \"0\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_mixedvar,RemoteObject.createImmutable((""))) || RemoteObject.solveBoolean("=",_mixedvar,RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 23;BA.debugLine="Return False";
Debug.ShouldStop(4194304);
if (true) return datatypeutility.__c.getField(true,"False");
 };
 BA.debugLineNum = 26;BA.debugLine="If mixedVar = Null  Or mixedVar = \"undefined\" The";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("n",_mixedvar) || RemoteObject.solveBoolean("=",_mixedvar,RemoteObject.createImmutable(("undefined")))) { 
 BA.debugLineNum = 27;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) return datatypeutility.__c.getField(true,"False");
 };
 BA.debugLineNum = 30;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return datatypeutility.__c.getField(true,"True");
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _is_scalar(RemoteObject _mixedvar) throws Exception{
try {
		Debug.PushSubsStack("is_scalar (datatypeutility) ","datatypeutility",6,datatypeutility.ba,datatypeutility.mostCurrent,122);
if (RapidSub.canDelegate("is_scalar")) { return Punchline.Tech.Cuppy.Framework.datatypeutility.remoteMe.runUserSub(false, "datatypeutility","is_scalar", _mixedvar);}
Debug.locals.put("mixedVar", _mixedvar);
 BA.debugLineNum = 122;BA.debugLine="Public Sub is_scalar (mixedVar As Object) As Boole";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="Return isString(mixedVar) Or IsNumber(mixedVar) O";
Debug.ShouldStop(134217728);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean(".",_isstring(_mixedvar)) || RemoteObject.solveBoolean(".",datatypeutility.__c.runMethod(true,"IsNumber",(Object)(BA.ObjectToString(_mixedvar)))) || RemoteObject.solveBoolean(".",_isboolean(_mixedvar)));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isarraylist(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("isArrayList (datatypeutility) ","datatypeutility",6,datatypeutility.ba,datatypeutility.mostCurrent,89);
if (RapidSub.canDelegate("isarraylist")) { return Punchline.Tech.Cuppy.Framework.datatypeutility.remoteMe.runUserSub(false, "datatypeutility","isarraylist", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 89;BA.debugLine="Public Sub isArrayList(obj As Object) As Boolean";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="Return isTypeOf(obj, \"arraylist\")";
Debug.ShouldStop(67108864);
if (true) return _istypeof(_obj,RemoteObject.createImmutable("arraylist"));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isboolean(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("isBoolean (datatypeutility) ","datatypeutility",6,datatypeutility.ba,datatypeutility.mostCurrent,61);
if (RapidSub.canDelegate("isboolean")) { return Punchline.Tech.Cuppy.Framework.datatypeutility.remoteMe.runUserSub(false, "datatypeutility","isboolean", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 61;BA.debugLine="Public Sub isBoolean(obj As Object) As Boolean";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="Return isTypeOf(obj, \"boolean\")";
Debug.ShouldStop(1073741824);
if (true) return _istypeof(_obj,RemoteObject.createImmutable("boolean"));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isdouble(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("isDouble (datatypeutility) ","datatypeutility",6,datatypeutility.ba,datatypeutility.mostCurrent,82);
if (RapidSub.canDelegate("isdouble")) { return Punchline.Tech.Cuppy.Framework.datatypeutility.remoteMe.runUserSub(false, "datatypeutility","isdouble", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 82;BA.debugLine="Public Sub isDouble(obj As Object) As Boolean";
Debug.ShouldStop(131072);
 BA.debugLineNum = 84;BA.debugLine="Return isTypeOf(obj, \"double\")";
Debug.ShouldStop(524288);
if (true) return _istypeof(_obj,RemoteObject.createImmutable("double"));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isinteger(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("isInteger (datatypeutility) ","datatypeutility",6,datatypeutility.ba,datatypeutility.mostCurrent,75);
if (RapidSub.canDelegate("isinteger")) { return Punchline.Tech.Cuppy.Framework.datatypeutility.remoteMe.runUserSub(false, "datatypeutility","isinteger", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 75;BA.debugLine="Public Sub isInteger(obj As Object) As Boolean";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="Return isTypeOf(obj, \"integer\")";
Debug.ShouldStop(4096);
if (true) return _istypeof(_obj,RemoteObject.createImmutable("integer"));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _islist(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("isList (datatypeutility) ","datatypeutility",6,datatypeutility.ba,datatypeutility.mostCurrent,97);
if (RapidSub.canDelegate("islist")) { return Punchline.Tech.Cuppy.Framework.datatypeutility.remoteMe.runUserSub(false, "datatypeutility","islist", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 97;BA.debugLine="Public Sub isList(obj As Object) As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 99;BA.debugLine="Return isArrayList(obj)";
Debug.ShouldStop(4);
if (true) return _isarraylist(_obj);
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isnull(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("isNull (datatypeutility) ","datatypeutility",6,datatypeutility.ba,datatypeutility.mostCurrent,105);
if (RapidSub.canDelegate("isnull")) { return Punchline.Tech.Cuppy.Framework.datatypeutility.remoteMe.runUserSub(false, "datatypeutility","isnull", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 105;BA.debugLine="Public Sub isNull(obj As Object) As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 107;BA.debugLine="Return StringUtility.isNull(obj)";
Debug.ShouldStop(1024);
if (true) return datatypeutility._stringutility.runMethod(true,"_isnull",(Object)(_obj));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isobject(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("isObject (datatypeutility) ","datatypeutility",6,datatypeutility.ba,datatypeutility.mostCurrent,112);
if (RapidSub.canDelegate("isobject")) { return Punchline.Tech.Cuppy.Framework.datatypeutility.remoteMe.runUserSub(false, "datatypeutility","isobject", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 112;BA.debugLine="Public Sub isObject(obj As Object) As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 114;BA.debugLine="Return isTypeOf(obj, \"object\")";
Debug.ShouldStop(131072);
if (true) return _istypeof(_obj,RemoteObject.createImmutable("object"));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isstring(RemoteObject _obj) throws Exception{
try {
		Debug.PushSubsStack("isString (datatypeutility) ","datatypeutility",6,datatypeutility.ba,datatypeutility.mostCurrent,68);
if (RapidSub.canDelegate("isstring")) { return Punchline.Tech.Cuppy.Framework.datatypeutility.remoteMe.runUserSub(false, "datatypeutility","isstring", _obj);}
Debug.locals.put("obj", _obj);
 BA.debugLineNum = 68;BA.debugLine="Public Sub isString(obj As Object) As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="Return isTypeOf(obj, \"string\")";
Debug.ShouldStop(32);
if (true) return _istypeof(_obj,RemoteObject.createImmutable("string"));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _istypeof(RemoteObject _obj,RemoteObject _typeof) throws Exception{
try {
		Debug.PushSubsStack("isTypeOf (datatypeutility) ","datatypeutility",6,datatypeutility.ba,datatypeutility.mostCurrent,54);
if (RapidSub.canDelegate("istypeof")) { return Punchline.Tech.Cuppy.Framework.datatypeutility.remoteMe.runUserSub(false, "datatypeutility","istypeof", _obj, _typeof);}
Debug.locals.put("obj", _obj);
Debug.locals.put("TypeOf", _typeof);
 BA.debugLineNum = 54;BA.debugLine="Public Sub isTypeOf(obj As Object , TypeOf As Stri";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="Return strip_java_type(GetType(obj)) = TypeOf.ToL";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_strip_java_type(datatypeutility.__c.runMethod(true,"GetType",(Object)(_obj))),_typeof.runMethod(true,"toLowerCase")));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
datatypeutility._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _strip_java_type(RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("strip_java_type (datatypeutility) ","datatypeutility",6,datatypeutility.ba,datatypeutility.mostCurrent,35);
if (RapidSub.canDelegate("strip_java_type")) { return Punchline.Tech.Cuppy.Framework.datatypeutility.remoteMe.runUserSub(false, "datatypeutility","strip_java_type", _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 35;BA.debugLine="Private Sub strip_java_type(str As String) As Stri";
Debug.ShouldStop(4);
 BA.debugLineNum = 37;BA.debugLine="str = str.Replace(\"java.lang.\",\"\")";
Debug.ShouldStop(16);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("java.lang.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 38;BA.debugLine="str = str.Replace(\"java.util.\",\"\")";
Debug.ShouldStop(32);
_str = _str.runMethod(true,"replace",(Object)(BA.ObjectToString("java.util.")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("str", _str);
 BA.debugLineNum = 41;BA.debugLine="If str.Contains(\"$\") Then";
Debug.ShouldStop(256);
if (_str.runMethod(true,"contains",(Object)(RemoteObject.createImmutable("$"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 43;BA.debugLine="str = StringUtility.breakStrAt( str, \"$\")";
Debug.ShouldStop(1024);
_str = BA.ObjectToString(datatypeutility._stringutility.runMethod(false,"_breakstrat",(Object)(_str),(Object)(RemoteObject.createImmutable("$"))));Debug.locals.put("str", _str);
 BA.debugLineNum = 44;BA.debugLine="str = StringUtility.trim_left_once(str, \"$\")";
Debug.ShouldStop(2048);
_str = datatypeutility._stringutility.runMethod(true,"_trim_left_once",(Object)(_str),(Object)(RemoteObject.createImmutable("$")));Debug.locals.put("str", _str);
 BA.debugLineNum = 45;BA.debugLine="str = StringUtility.trim_left_once(str, \"_\")";
Debug.ShouldStop(4096);
_str = datatypeutility._stringutility.runMethod(true,"_trim_left_once",(Object)(_str),(Object)(RemoteObject.createImmutable("_")));Debug.locals.put("str", _str);
 };
 BA.debugLineNum = 49;BA.debugLine="Return str.ToLowerCase";
Debug.ShouldStop(65536);
if (true) return _str.runMethod(true,"toLowerCase");
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}