package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class mathutility extends Object{
public static mathutility mostCurrent = new mathutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.mathutility", null);
		ba.loadHtSubs(mathutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.mathutility", ba);
		}
	}
    public static Class<?> getObject() {
		return mathutility.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static double _exponential_equivalent = 0;
public static String _negative_infinity = "";
public static String _positive_infinity = "";
public static String _max_safe_integer = "";
public static String _min_safe_integer = "";
public static String _min_value = "";
public static String _max_value = "";
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cuppyglobals _cuppyglobals = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public static double  _acosh(double _arg) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Public Sub acosh (arg As Double) As Double";
 //BA.debugLineNum = 29;BA.debugLine="Return Logarithm(arg  + Sqrt(arg * arg - 1) , Exp";
if (true) return anywheresoftware.b4a.keywords.Common.Logarithm(_arg+anywheresoftware.b4a.keywords.Common.Sqrt(_arg*_arg-1),_exponential_equivalent);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return 0;
}
public static double  _asinh(double _arg) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub asinh (arg As Double) As Double";
 //BA.debugLineNum = 36;BA.debugLine="Return Logarithm(arg  + Sqrt(arg * arg + 1) , Exp";
if (true) return anywheresoftware.b4a.keywords.Common.Logarithm(_arg+anywheresoftware.b4a.keywords.Common.Sqrt(_arg*_arg+1),_exponential_equivalent);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return 0;
}
public static double  _atanh(double _arg) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Public Sub atanh (arg As Double) As Double";
 //BA.debugLineNum = 43;BA.debugLine="Return 0.5 * Logarithm((1 + arg) / (1 - arg) , Ex";
if (true) return 0.5*anywheresoftware.b4a.keywords.Common.Logarithm((1+_arg)/(double)(1-_arg),_exponential_equivalent);
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return 0;
}
public static int  _convertfromdecimal(int _n,int _base) throws Exception{
int _result = 0;
int _multiplier = 0;
 //BA.debugLineNum = 76;BA.debugLine="Public Sub ConvertfromDecimal(n As Int, base As In";
 //BA.debugLineNum = 78;BA.debugLine="Dim result As Int = 0";
_result = (int) (0);
 //BA.debugLineNum = 79;BA.debugLine="Dim multiplier As Int = 1";
_multiplier = (int) (1);
 //BA.debugLineNum = 81;BA.debugLine="Do While n > 0";
while (_n>0) {
 //BA.debugLineNum = 83;BA.debugLine="result = result + (n Mod base) * multiplier";
_result = (int) (_result+(_n%_base)*_multiplier);
 //BA.debugLineNum = 84;BA.debugLine="multiplier = multiplier * 10";
_multiplier = (int) (_multiplier*10);
 //BA.debugLineNum = 85;BA.debugLine="n = n / base";
_n = (int) (_n/(double)_base);
 }
;
 //BA.debugLineNum = 89;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return 0;
}
public static String  _convertfromdecimal2(int _n,int _base) throws Exception{
String _chars = "";
String _result = "";
 //BA.debugLineNum = 95;BA.debugLine="Public Sub ConvertfromDecimal2(n As Int, base As I";
 //BA.debugLineNum = 97;BA.debugLine="Dim chars As  String =\"0123456789ABCDEFGHIJ\"";
_chars = "0123456789ABCDEFGHIJ";
 //BA.debugLineNum = 98;BA.debugLine="Dim result As String = \"\"";
_result = "";
 //BA.debugLineNum = 100;BA.debugLine="Do While n > 0";
while (_n>0) {
 //BA.debugLineNum = 102;BA.debugLine="result = chars.charAt(n Mod base) & result";
_result = BA.ObjectToString(_chars.charAt((int) (_n%_base)))+_result;
 //BA.debugLineNum = 103;BA.debugLine="n = n / base";
_n = (int) (_n/(double)_base);
 }
;
 //BA.debugLineNum = 107;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return "";
}
public static int  _convertfromto(int _n,int _frombase,int _tobase) throws Exception{
int _t = 0;
 //BA.debugLineNum = 137;BA.debugLine="Public Sub ConvertFromTo(n As Int, frombase As Int";
 //BA.debugLineNum = 139;BA.debugLine="Dim t As Int = ConvertToDecimal(n,frombase)";
_t = _converttodecimal(_n,_frombase);
 //BA.debugLineNum = 140;BA.debugLine="Return ConvertfromDecimal(t,tobase)";
if (true) return _convertfromdecimal(_t,_tobase);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return 0;
}
public static int  _converttodecimal(int _n,int _base) throws Exception{
int _result = 0;
int _multiplier = 0;
 //BA.debugLineNum = 57;BA.debugLine="Public Sub ConvertToDecimal( n As Int, base As Int";
 //BA.debugLineNum = 59;BA.debugLine="Dim result As Int = 0";
_result = (int) (0);
 //BA.debugLineNum = 60;BA.debugLine="Dim multiplier As Int = 1";
_multiplier = (int) (1);
 //BA.debugLineNum = 62;BA.debugLine="Do While n > 0";
while (_n>0) {
 //BA.debugLineNum = 64;BA.debugLine="result = result + (n Mod 10) * multiplier";
_result = (int) (_result+(_n%10)*_multiplier);
 //BA.debugLineNum = 65;BA.debugLine="multiplier = multiplier * base";
_multiplier = (int) (_multiplier*_base);
 //BA.debugLineNum = 66;BA.debugLine="n = n / 10";
_n = (int) (_n/(double)10);
 }
;
 //BA.debugLineNum = 70;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return 0;
}
public static int  _converttodecimal2(String _n,int _base) throws Exception{
int _result = 0;
String _st = "";
String _chars = "";
int _k = 0;
int _multiplier = 0;
int _i = 0;
 //BA.debugLineNum = 113;BA.debugLine="Public Sub ConverttoDecimal2( n As String, base As";
 //BA.debugLineNum = 115;BA.debugLine="n = n.ToUpperCase";
_n = _n.toUpperCase();
 //BA.debugLineNum = 116;BA.debugLine="Dim result As Int = 0";
_result = (int) (0);
 //BA.debugLineNum = 117;BA.debugLine="Dim st As String";
_st = "";
 //BA.debugLineNum = 119;BA.debugLine="Dim chars As  String =\"0123456789ABCDEFGHIJ\"";
_chars = "0123456789ABCDEFGHIJ";
 //BA.debugLineNum = 120;BA.debugLine="Dim k As Int = n.length - 1";
_k = (int) (_n.length()-1);
 //BA.debugLineNum = 121;BA.debugLine="Dim multiplier As Int = 1";
_multiplier = (int) (1);
 //BA.debugLineNum = 123;BA.debugLine="For i =  k To 0 Step -1";
{
final int step7 = (int) (-1);
final int limit7 = (int) (0);
_i = _k ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
 //BA.debugLineNum = 125;BA.debugLine="st = n.CharAt(i)";
_st = BA.ObjectToString(_n.charAt(_i));
 //BA.debugLineNum = 126;BA.debugLine="result = chars.IndexOf(st) * multiplier  + resul";
_result = (int) (_chars.indexOf(_st)*_multiplier+_result);
 //BA.debugLineNum = 127;BA.debugLine="multiplier = multiplier * base";
_multiplier = (int) (_multiplier*_base);
 }
};
 //BA.debugLineNum = 131;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return 0;
}
public static double  _cosh(double _arg) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Public Sub cosh (arg As Double) As Double";
 //BA.debugLineNum = 50;BA.debugLine="Return (exp(arg) + exp(-arg)) / 2";
if (true) return (_exp(_arg)+_exp(-_arg))/(double)2;
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return 0;
}
public static double  _deg2rad(double _angle) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="Public Sub deg2rad(angle As Double) As Double";
 //BA.debugLineNum = 184;BA.debugLine="Return angle * 0.017453292519943295";
if (true) return _angle*0.017453292519943295;
 //BA.debugLineNum = 186;BA.debugLine="End Sub";
return 0;
}
public static double  _exp(double _arg) throws Exception{
 //BA.debugLineNum = 146;BA.debugLine="Public Sub exp(arg As Double) As Double";
 //BA.debugLineNum = 148;BA.debugLine="Return Power(Exponential_Equivalent, arg)";
if (true) return anywheresoftware.b4a.keywords.Common.Power(_exponential_equivalent,_arg);
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return 0;
}
public static double  _hypot(double _x,double _y) throws Exception{
double _t = 0;
 //BA.debugLineNum = 197;BA.debugLine="Public Sub hypot(x As Double, y As Double) As Doub";
 //BA.debugLineNum = 199;BA.debugLine="x = Abs(x)";
_x = anywheresoftware.b4a.keywords.Common.Abs(_x);
 //BA.debugLineNum = 200;BA.debugLine="y = Abs(y)";
_y = anywheresoftware.b4a.keywords.Common.Abs(_y);
 //BA.debugLineNum = 202;BA.debugLine="Dim t As Double = Min(x, y)";
_t = anywheresoftware.b4a.keywords.Common.Min(_x,_y);
 //BA.debugLineNum = 203;BA.debugLine="x = Max(x, y)";
_x = anywheresoftware.b4a.keywords.Common.Max(_x,_y);
 //BA.debugLineNum = 204;BA.debugLine="t = t / x";
_t = _t/(double)_x;
 //BA.debugLineNum = 206;BA.debugLine="Return x * Sqrt(1 + t * t)";
if (true) return _x*anywheresoftware.b4a.keywords.Common.Sqrt(1+_t*_t);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return 0;
}
public static boolean  _is_finite(String _val) throws Exception{
 //BA.debugLineNum = 175;BA.debugLine="Public Sub is_finite(val As String) As Boolean";
 //BA.debugLineNum = 177;BA.debugLine="Return Not(is_infinite(val))";
if (true) return anywheresoftware.b4a.keywords.Common.Not(_is_infinite(_val));
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return false;
}
public static boolean  _is_infinite(String _val) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Public Sub is_infinite(val As String) As Boolean";
 //BA.debugLineNum = 170;BA.debugLine="Return val = POSITIVE_INFINITY Or val = NEGATIVE_";
if (true) return (_val).equals(_positive_infinity) || (_val).equals(_negative_infinity);
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnan(double _d) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Public Sub IsNan(d As Double) As Boolean";
 //BA.debugLineNum = 22;BA.debugLine="Return d <> d";
if (true) return _d!=_d;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="Public Exponential_Equivalent As Double = 2.71828";
_exponential_equivalent = 2.718281828459045;
 //BA.debugLineNum = 7;BA.debugLine="Public NEGATIVE_INFINITY As String = \"-Infinity\"";
_negative_infinity = "-Infinity";
 //BA.debugLineNum = 8;BA.debugLine="Public POSITIVE_INFINITY As String = \"Infinity\"";
_positive_infinity = "Infinity";
 //BA.debugLineNum = 10;BA.debugLine="Public MAX_SAFE_INTEGER As String  = \"90071992547";
_max_safe_integer = "9007199254740991";
 //BA.debugLineNum = 11;BA.debugLine="Public MIN_SAFE_INTEGER As String = \"-90071992547";
_min_safe_integer = "-9007199254740991";
 //BA.debugLineNum = 13;BA.debugLine="Public MIN_VALUE As String  = \"5e-324\"";
_min_value = "5e-324";
 //BA.debugLineNum = 14;BA.debugLine="Public MAX_VALUE As String = \"1.7976931348623157e";
_max_value = "1.7976931348623157e+308";
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public static double  _rad2deg(double _number) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Public Sub rad2deg(number As Double) As Double";
 //BA.debugLineNum = 191;BA.debugLine="Return number * 57.29577951308232";
if (true) return _number*57.29577951308232;
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return 0;
}
public static double  _sinh(double _number) throws Exception{
 //BA.debugLineNum = 161;BA.debugLine="Public Sub sinh(number As Double) As Double";
 //BA.debugLineNum = 163;BA.debugLine="Return (exp(number) - exp(-number)) / 2";
if (true) return (_exp(_number)-_exp(-_number))/(double)2;
 //BA.debugLineNum = 165;BA.debugLine="End Sub";
return 0;
}
public static double  _tanh(double _number) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Public Sub tanh(number As Double) As Double";
 //BA.debugLineNum = 155;BA.debugLine="Return 1 - 2 / (exp(2 * number) + 1)";
if (true) return 1-2/(double)(_exp(2*_number)+1);
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return 0;
}
}
