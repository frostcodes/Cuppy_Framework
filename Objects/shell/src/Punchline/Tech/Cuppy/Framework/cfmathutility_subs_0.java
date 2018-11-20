package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfmathutility_subs_0 {


public static RemoteObject  _acosh(RemoteObject _arg) throws Exception{
try {
		Debug.PushSubsStack("Acosh (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,27);
if (RapidSub.canDelegate("acosh")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","acosh", _arg);}
Debug.locals.put("arg", _arg);
 BA.debugLineNum = 27;BA.debugLine="Public Sub Acosh (arg As Double) As Double";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="Return Logarithm(arg  + Sqrt(arg * arg - 1) , Exp";
Debug.ShouldStop(268435456);
if (true) return cfmathutility.__c.runMethod(true,"Logarithm",(Object)(RemoteObject.solve(new RemoteObject[] {_arg,cfmathutility.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {_arg,_arg,RemoteObject.createImmutable(1)}, "*-",1, 0)))}, "+",1, 0)),(Object)(cfmathutility._exponential_equivalent));
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _asinh(RemoteObject _arg) throws Exception{
try {
		Debug.PushSubsStack("Asinh (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,34);
if (RapidSub.canDelegate("asinh")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","asinh", _arg);}
Debug.locals.put("arg", _arg);
 BA.debugLineNum = 34;BA.debugLine="Public Sub Asinh (arg As Double) As Double";
Debug.ShouldStop(2);
 BA.debugLineNum = 36;BA.debugLine="Return Logarithm(arg  + Sqrt(arg * arg + 1) , Exp";
Debug.ShouldStop(8);
if (true) return cfmathutility.__c.runMethod(true,"Logarithm",(Object)(RemoteObject.solve(new RemoteObject[] {_arg,cfmathutility.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {_arg,_arg,RemoteObject.createImmutable(1)}, "*+",1, 0)))}, "+",1, 0)),(Object)(cfmathutility._exponential_equivalent));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _atanh(RemoteObject _arg) throws Exception{
try {
		Debug.PushSubsStack("Atanh (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,41);
if (RapidSub.canDelegate("atanh")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","atanh", _arg);}
Debug.locals.put("arg", _arg);
 BA.debugLineNum = 41;BA.debugLine="Public Sub Atanh (arg As Double) As Double";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="Return 0.5 * Logarithm((1 + arg) / (1 - arg) , Ex";
Debug.ShouldStop(1024);
if (true) return RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.5),cfmathutility.__c.runMethod(true,"Logarithm",(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_arg}, "+",1, 0)),(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_arg}, "-",1, 0))}, "/",0, 0)),(Object)(cfmathutility._exponential_equivalent))}, "*",0, 0);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertfromdecimal(RemoteObject _n,RemoteObject _base) throws Exception{
try {
		Debug.PushSubsStack("ConvertFromDecimal (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,76);
if (RapidSub.canDelegate("convertfromdecimal")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","convertfromdecimal", _n, _base);}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _multiplier = RemoteObject.createImmutable(0);
Debug.locals.put("n", _n);
Debug.locals.put("base", _base);
 BA.debugLineNum = 76;BA.debugLine="Public Sub ConvertFromDecimal(n As Int, base As In";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="Dim result As Int = 0";
Debug.ShouldStop(8192);
_result = BA.numberCast(int.class, 0);Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 79;BA.debugLine="Dim multiplier As Int = 1";
Debug.ShouldStop(16384);
_multiplier = BA.numberCast(int.class, 1);Debug.locals.put("multiplier", _multiplier);Debug.locals.put("multiplier", _multiplier);
 BA.debugLineNum = 81;BA.debugLine="Do While n > 0";
Debug.ShouldStop(65536);
while (RemoteObject.solveBoolean(">",_n,BA.numberCast(double.class, 0))) {
 BA.debugLineNum = 83;BA.debugLine="result = result + (n Mod base) * multiplier";
Debug.ShouldStop(262144);
_result = RemoteObject.solve(new RemoteObject[] {_result,(RemoteObject.solve(new RemoteObject[] {_n,_base}, "%",0, 1)),_multiplier}, "+*",1, 1);Debug.locals.put("result", _result);
 BA.debugLineNum = 84;BA.debugLine="multiplier = multiplier * 10";
Debug.ShouldStop(524288);
_multiplier = RemoteObject.solve(new RemoteObject[] {_multiplier,RemoteObject.createImmutable(10)}, "*",0, 1);Debug.locals.put("multiplier", _multiplier);
 BA.debugLineNum = 85;BA.debugLine="n = n / base";
Debug.ShouldStop(1048576);
_n = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_n,_base}, "/",0, 0));Debug.locals.put("n", _n);
 }
;
 BA.debugLineNum = 89;BA.debugLine="Return result";
Debug.ShouldStop(16777216);
if (true) return _result;
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertfromdecimal2(RemoteObject _n,RemoteObject _base) throws Exception{
try {
		Debug.PushSubsStack("ConvertFromDecimal2 (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,95);
if (RapidSub.canDelegate("convertfromdecimal2")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","convertfromdecimal2", _n, _base);}
RemoteObject _chars = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable("");
Debug.locals.put("n", _n);
Debug.locals.put("base", _base);
 BA.debugLineNum = 95;BA.debugLine="Public Sub ConvertFromDecimal2(n As Int, base As I";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 97;BA.debugLine="Dim chars As  String =\"0123456789ABCDEFGHIJ\"";
Debug.ShouldStop(1);
_chars = BA.ObjectToString("0123456789ABCDEFGHIJ");Debug.locals.put("chars", _chars);Debug.locals.put("chars", _chars);
 BA.debugLineNum = 98;BA.debugLine="Dim result As String = \"\"";
Debug.ShouldStop(2);
_result = BA.ObjectToString("");Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 100;BA.debugLine="Do While n > 0";
Debug.ShouldStop(8);
while (RemoteObject.solveBoolean(">",_n,BA.numberCast(double.class, 0))) {
 BA.debugLineNum = 102;BA.debugLine="result = chars.charAt(n Mod base) & result";
Debug.ShouldStop(32);
_result = RemoteObject.concat(_chars.runMethod(true,"charAt",(Object)(RemoteObject.solve(new RemoteObject[] {_n,_base}, "%",0, 1))),_result);Debug.locals.put("result", _result);
 BA.debugLineNum = 103;BA.debugLine="n = n / base";
Debug.ShouldStop(64);
_n = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_n,_base}, "/",0, 0));Debug.locals.put("n", _n);
 }
;
 BA.debugLineNum = 107;BA.debugLine="Return result";
Debug.ShouldStop(1024);
if (true) return _result;
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _convertfromto(RemoteObject _n,RemoteObject _frombase,RemoteObject _tobase) throws Exception{
try {
		Debug.PushSubsStack("ConvertFromTo (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,137);
if (RapidSub.canDelegate("convertfromto")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","convertfromto", _n, _frombase, _tobase);}
RemoteObject _t = RemoteObject.createImmutable(0);
Debug.locals.put("n", _n);
Debug.locals.put("frombase", _frombase);
Debug.locals.put("tobase", _tobase);
 BA.debugLineNum = 137;BA.debugLine="Public Sub ConvertFromTo(n As Int, frombase As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 139;BA.debugLine="Dim t As Int = ConvertToDecimal(n,frombase)";
Debug.ShouldStop(1024);
_t = _converttodecimal(_n,_frombase);Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 140;BA.debugLine="Return ConvertFromDecimal(t,tobase)";
Debug.ShouldStop(2048);
if (true) return _convertfromdecimal(_t,_tobase);
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _converttodecimal(RemoteObject _n,RemoteObject _base) throws Exception{
try {
		Debug.PushSubsStack("ConvertToDecimal (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,57);
if (RapidSub.canDelegate("converttodecimal")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","converttodecimal", _n, _base);}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _multiplier = RemoteObject.createImmutable(0);
Debug.locals.put("n", _n);
Debug.locals.put("base", _base);
 BA.debugLineNum = 57;BA.debugLine="Public Sub ConvertToDecimal( n As Int, base As Int";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="Dim result As Int = 0";
Debug.ShouldStop(67108864);
_result = BA.numberCast(int.class, 0);Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 60;BA.debugLine="Dim multiplier As Int = 1";
Debug.ShouldStop(134217728);
_multiplier = BA.numberCast(int.class, 1);Debug.locals.put("multiplier", _multiplier);Debug.locals.put("multiplier", _multiplier);
 BA.debugLineNum = 62;BA.debugLine="Do While n > 0";
Debug.ShouldStop(536870912);
while (RemoteObject.solveBoolean(">",_n,BA.numberCast(double.class, 0))) {
 BA.debugLineNum = 64;BA.debugLine="result = result + (n Mod 10) * multiplier";
Debug.ShouldStop(-2147483648);
_result = RemoteObject.solve(new RemoteObject[] {_result,(RemoteObject.solve(new RemoteObject[] {_n,RemoteObject.createImmutable(10)}, "%",0, 1)),_multiplier}, "+*",1, 1);Debug.locals.put("result", _result);
 BA.debugLineNum = 65;BA.debugLine="multiplier = multiplier * base";
Debug.ShouldStop(1);
_multiplier = RemoteObject.solve(new RemoteObject[] {_multiplier,_base}, "*",0, 1);Debug.locals.put("multiplier", _multiplier);
 BA.debugLineNum = 66;BA.debugLine="n = n / 10";
Debug.ShouldStop(2);
_n = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_n,RemoteObject.createImmutable(10)}, "/",0, 0));Debug.locals.put("n", _n);
 }
;
 BA.debugLineNum = 70;BA.debugLine="Return result";
Debug.ShouldStop(32);
if (true) return _result;
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _converttodecimal2(RemoteObject _n,RemoteObject _base) throws Exception{
try {
		Debug.PushSubsStack("ConvertToDecimal2 (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,113);
if (RapidSub.canDelegate("converttodecimal2")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","converttodecimal2", _n, _base);}
RemoteObject _result = RemoteObject.createImmutable(0);
RemoteObject _st = RemoteObject.createImmutable("");
RemoteObject _chars = RemoteObject.createImmutable("");
RemoteObject _k = RemoteObject.createImmutable(0);
RemoteObject _multiplier = RemoteObject.createImmutable(0);
int _i = 0;
Debug.locals.put("n", _n);
Debug.locals.put("base", _base);
 BA.debugLineNum = 113;BA.debugLine="Public Sub ConvertToDecimal2( n As String, base As";
Debug.ShouldStop(65536);
 BA.debugLineNum = 115;BA.debugLine="n = n.ToUpperCase";
Debug.ShouldStop(262144);
_n = _n.runMethod(true,"toUpperCase");Debug.locals.put("n", _n);
 BA.debugLineNum = 116;BA.debugLine="Dim result As Int = 0";
Debug.ShouldStop(524288);
_result = BA.numberCast(int.class, 0);Debug.locals.put("result", _result);Debug.locals.put("result", _result);
 BA.debugLineNum = 117;BA.debugLine="Dim st As String";
Debug.ShouldStop(1048576);
_st = RemoteObject.createImmutable("");Debug.locals.put("st", _st);
 BA.debugLineNum = 119;BA.debugLine="Dim chars As  String =\"0123456789ABCDEFGHIJ\"";
Debug.ShouldStop(4194304);
_chars = BA.ObjectToString("0123456789ABCDEFGHIJ");Debug.locals.put("chars", _chars);Debug.locals.put("chars", _chars);
 BA.debugLineNum = 120;BA.debugLine="Dim k As Int = n.length - 1";
Debug.ShouldStop(8388608);
_k = RemoteObject.solve(new RemoteObject[] {_n.runMethod(true,"length"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("k", _k);Debug.locals.put("k", _k);
 BA.debugLineNum = 121;BA.debugLine="Dim multiplier As Int = 1";
Debug.ShouldStop(16777216);
_multiplier = BA.numberCast(int.class, 1);Debug.locals.put("multiplier", _multiplier);Debug.locals.put("multiplier", _multiplier);
 BA.debugLineNum = 123;BA.debugLine="For i =  k To 0 Step -1";
Debug.ShouldStop(67108864);
{
final int step7 = -1;
final int limit7 = 0;
_i = _k.<Integer>get().intValue() ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 125;BA.debugLine="st = n.CharAt(i)";
Debug.ShouldStop(268435456);
_st = BA.ObjectToString(_n.runMethod(true,"charAt",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("st", _st);
 BA.debugLineNum = 126;BA.debugLine="result = chars.IndexOf(st) * multiplier  + resul";
Debug.ShouldStop(536870912);
_result = RemoteObject.solve(new RemoteObject[] {_chars.runMethod(true,"indexOf",(Object)(_st)),_multiplier,_result}, "*+",1, 1);Debug.locals.put("result", _result);
 BA.debugLineNum = 127;BA.debugLine="multiplier = multiplier * base";
Debug.ShouldStop(1073741824);
_multiplier = RemoteObject.solve(new RemoteObject[] {_multiplier,_base}, "*",0, 1);Debug.locals.put("multiplier", _multiplier);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 131;BA.debugLine="Return result";
Debug.ShouldStop(4);
if (true) return _result;
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cosh(RemoteObject _arg) throws Exception{
try {
		Debug.PushSubsStack("Cosh (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,48);
if (RapidSub.canDelegate("cosh")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","cosh", _arg);}
Debug.locals.put("arg", _arg);
 BA.debugLineNum = 48;BA.debugLine="Public Sub Cosh (arg As Double) As Double";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="Return (Exp(arg) + Exp(-arg)) / 2";
Debug.ShouldStop(131072);
if (true) return RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_exp(_arg),_exp(BA.numberCast(double.class, -_arg.<Double>get().doubleValue()))}, "+",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deg2rad(RemoteObject _angle) throws Exception{
try {
		Debug.PushSubsStack("Deg2rad (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,183);
if (RapidSub.canDelegate("deg2rad")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","deg2rad", _angle);}
Debug.locals.put("angle", _angle);
 BA.debugLineNum = 183;BA.debugLine="Public Sub Deg2rad(angle As Double) As Double";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 185;BA.debugLine="Return angle * 0.017453292519943295";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.solve(new RemoteObject[] {_angle,RemoteObject.createImmutable(0.017453292519943295)}, "*",0, 0);
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exp(RemoteObject _arg) throws Exception{
try {
		Debug.PushSubsStack("Exp (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,146);
if (RapidSub.canDelegate("exp")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","exp", _arg);}
Debug.locals.put("arg", _arg);
 BA.debugLineNum = 146;BA.debugLine="Public Sub Exp(arg As Double) As Double";
Debug.ShouldStop(131072);
 BA.debugLineNum = 148;BA.debugLine="Return Power(Exponential_Equivalent, arg)";
Debug.ShouldStop(524288);
if (true) return cfmathutility.__c.runMethod(true,"Power",(Object)(cfmathutility._exponential_equivalent),(Object)(_arg));
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hypot(RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Hypot (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,198);
if (RapidSub.canDelegate("hypot")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","hypot", _x, _y);}
RemoteObject _t = RemoteObject.createImmutable(0);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 198;BA.debugLine="Public Sub Hypot(x As Double, y As Double) As Doub";
Debug.ShouldStop(32);
 BA.debugLineNum = 200;BA.debugLine="x = Abs(x)";
Debug.ShouldStop(128);
_x = cfmathutility.__c.runMethod(true,"Abs",(Object)(_x));Debug.locals.put("x", _x);
 BA.debugLineNum = 201;BA.debugLine="y = Abs(y)";
Debug.ShouldStop(256);
_y = cfmathutility.__c.runMethod(true,"Abs",(Object)(_y));Debug.locals.put("y", _y);
 BA.debugLineNum = 203;BA.debugLine="Dim t As Double = Min(x, y)";
Debug.ShouldStop(1024);
_t = cfmathutility.__c.runMethod(true,"Min",(Object)(_x),(Object)(_y));Debug.locals.put("t", _t);Debug.locals.put("t", _t);
 BA.debugLineNum = 204;BA.debugLine="x = Max(x, y)";
Debug.ShouldStop(2048);
_x = cfmathutility.__c.runMethod(true,"Max",(Object)(_x),(Object)(_y));Debug.locals.put("x", _x);
 BA.debugLineNum = 205;BA.debugLine="t = t / x";
Debug.ShouldStop(4096);
_t = RemoteObject.solve(new RemoteObject[] {_t,_x}, "/",0, 0);Debug.locals.put("t", _t);
 BA.debugLineNum = 207;BA.debugLine="Return x * Sqrt(1 + t * t)";
Debug.ShouldStop(16384);
if (true) return RemoteObject.solve(new RemoteObject[] {_x,cfmathutility.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),_t,_t}, "+*",1, 0)))}, "*",0, 0);
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _is_finite(RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("Is_finite (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,176);
if (RapidSub.canDelegate("is_finite")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","is_finite", _val);}
Debug.locals.put("val", _val);
 BA.debugLineNum = 176;BA.debugLine="Public Sub Is_finite(val As String) As Boolean";
Debug.ShouldStop(32768);
 BA.debugLineNum = 178;BA.debugLine="Return Not(Is_infinite(val))";
Debug.ShouldStop(131072);
if (true) return cfmathutility.__c.runMethod(true,"Not",(Object)(_is_infinite(_val)));
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _is_infinite(RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("Is_infinite (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,169);
if (RapidSub.canDelegate("is_infinite")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","is_infinite", _val);}
Debug.locals.put("val", _val);
 BA.debugLineNum = 169;BA.debugLine="Public Sub Is_infinite(val As String) As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 171;BA.debugLine="Return val = POSITIVE_INFINITY Or val = NEGATIVE_";
Debug.ShouldStop(1024);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_val,cfmathutility._positive_infinity) || RemoteObject.solveBoolean("=",_val,cfmathutility._negative_infinity));
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isnan(RemoteObject _d) throws Exception{
try {
		Debug.PushSubsStack("IsNan (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,20);
if (RapidSub.canDelegate("isnan")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","isnan", _d);}
Debug.locals.put("d", _d);
 BA.debugLineNum = 20;BA.debugLine="Public Sub IsNan(d As Double) As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 22;BA.debugLine="Return d <> d";
Debug.ShouldStop(2097152);
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("!",_d,_d));
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _numbersaverage(RemoteObject _data,RemoteObject _roundup) throws Exception{
try {
		Debug.PushSubsStack("NumbersAverage (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,214);
if (RapidSub.canDelegate("numbersaverage")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","numbersaverage", _data, _roundup);}
RemoteObject _total = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.createImmutable(0);
Debug.locals.put("data", _data);
Debug.locals.put("roundUp", _roundup);
 BA.debugLineNum = 214;BA.debugLine="Public Sub NumbersAverage(data As List ,roundUp As";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 216;BA.debugLine="Dim total As Int = 0";
Debug.ShouldStop(8388608);
_total = BA.numberCast(int.class, 0);Debug.locals.put("total", _total);Debug.locals.put("total", _total);
 BA.debugLineNum = 220;BA.debugLine="For Each value As Int In data";
Debug.ShouldStop(134217728);
{
final RemoteObject group2 = _data;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_value = BA.numberCast(int.class, group2.runMethod(false,"Get",index2));Debug.locals.put("value", _value);
Debug.locals.put("value", _value);
 BA.debugLineNum = 222;BA.debugLine="total= total + value";
Debug.ShouldStop(536870912);
_total = RemoteObject.solve(new RemoteObject[] {_total,_value}, "+",1, 1);Debug.locals.put("total", _total);
 }
}Debug.locals.put("value", _value);
;
 BA.debugLineNum = 226;BA.debugLine="If roundUp Then";
Debug.ShouldStop(2);
if (_roundup.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 229;BA.debugLine="Return Ceil(total / data.Size)";
Debug.ShouldStop(16);
if (true) return cfmathutility.__c.runMethod(true,"Ceil",(Object)(RemoteObject.solve(new RemoteObject[] {_total,_data.runMethod(true,"getSize")}, "/",0, 0)));
 }else {
 BA.debugLineNum = 235;BA.debugLine="Return total / data.Size";
Debug.ShouldStop(1024);
if (true) return RemoteObject.solve(new RemoteObject[] {_total,_data.runMethod(true,"getSize")}, "/",0, 0);
 };
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _numbersaverage2(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("NumbersAverage2 (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,244);
if (RapidSub.canDelegate("numbersaverage2")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","numbersaverage2", _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 244;BA.debugLine="Public Sub NumbersAverage2(data As List) As Double";
Debug.ShouldStop(524288);
 BA.debugLineNum = 246;BA.debugLine="Return NumbersAverage(data, True)";
Debug.ShouldStop(2097152);
if (true) return _numbersaverage(_data,cfmathutility.__c.getField(true,"True"));
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Public Exponential_Equivalent As Double = 2.71828";
cfmathutility._exponential_equivalent = BA.numberCast(double.class, 2.718281828459045);
 //BA.debugLineNum = 7;BA.debugLine="Public NEGATIVE_INFINITY As String = \"-Infinity\"";
cfmathutility._negative_infinity = BA.ObjectToString("-Infinity");
 //BA.debugLineNum = 8;BA.debugLine="Public POSITIVE_INFINITY As String = \"Infinity\"";
cfmathutility._positive_infinity = BA.ObjectToString("Infinity");
 //BA.debugLineNum = 10;BA.debugLine="Public MAX_SAFE_INTEGER As String  = \"90071992547";
cfmathutility._max_safe_integer = BA.ObjectToString("9007199254740991");
 //BA.debugLineNum = 11;BA.debugLine="Public MIN_SAFE_INTEGER As String = \"-90071992547";
cfmathutility._min_safe_integer = BA.ObjectToString("-9007199254740991");
 //BA.debugLineNum = 13;BA.debugLine="Public MIN_VALUE As String  = \"5e-324\"";
cfmathutility._min_value = BA.ObjectToString("5e-324");
 //BA.debugLineNum = 14;BA.debugLine="Public MAX_VALUE As String = \"1.7976931348623157e";
cfmathutility._max_value = BA.ObjectToString("1.7976931348623157e+308");
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _rad2deg(RemoteObject _number) throws Exception{
try {
		Debug.PushSubsStack("Rad2deg (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,190);
if (RapidSub.canDelegate("rad2deg")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","rad2deg", _number);}
Debug.locals.put("number", _number);
 BA.debugLineNum = 190;BA.debugLine="Public Sub Rad2deg(number As Double) As Double";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 192;BA.debugLine="Return number * 57.29577951308232";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.solve(new RemoteObject[] {_number,RemoteObject.createImmutable(57.29577951308232)}, "*",0, 0);
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sinh(RemoteObject _number) throws Exception{
try {
		Debug.PushSubsStack("Sinh (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,162);
if (RapidSub.canDelegate("sinh")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","sinh", _number);}
Debug.locals.put("number", _number);
 BA.debugLineNum = 162;BA.debugLine="Public Sub Sinh(number As Double) As Double";
Debug.ShouldStop(2);
 BA.debugLineNum = 164;BA.debugLine="Return (Exp(number) - Exp(-number)) / 2";
Debug.ShouldStop(8);
if (true) return RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_exp(_number),_exp(BA.numberCast(double.class, -_number.<Double>get().doubleValue()))}, "-",1, 0)),RemoteObject.createImmutable(2)}, "/",0, 0);
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tanh(RemoteObject _number) throws Exception{
try {
		Debug.PushSubsStack("Tanh (cfmathutility) ","cfmathutility",26,cfmathutility.ba,cfmathutility.mostCurrent,154);
if (RapidSub.canDelegate("tanh")) { return Punchline.Tech.Cuppy.Framework.cfmathutility.remoteMe.runUserSub(false, "cfmathutility","tanh", _number);}
Debug.locals.put("number", _number);
 BA.debugLineNum = 154;BA.debugLine="Public Sub Tanh(number As Double) As Double";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 156;BA.debugLine="Return 1 - 2 / (Exp(2 * number) + 1)";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(1),RemoteObject.createImmutable(2),(RemoteObject.solve(new RemoteObject[] {_exp(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(2),_number}, "*",0, 0)),RemoteObject.createImmutable(1)}, "+",1, 0))}, "-/",1, 0);
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}