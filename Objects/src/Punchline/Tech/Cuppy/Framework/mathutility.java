package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class mathutility extends Object{
public static mathutility mostCurrent = new mathutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.mathutility", null);
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
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static double  _acosh(double _arg) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "acosh"))
	 {return ((Double) Debug.delegate(ba, "acosh", new Object[] {_arg}));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Public Sub acosh (arg As Double) As Double";
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Return Logarithm(arg  + Sqrt(arg * arg - 1) , Exp";
if (true) return anywheresoftware.b4a.keywords.Common.Logarithm(_arg+anywheresoftware.b4a.keywords.Common.Sqrt(_arg*_arg-1),_exponential_equivalent);
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="End Sub";
return 0;
}
public static double  _asinh(double _arg) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "asinh"))
	 {return ((Double) Debug.delegate(ba, "asinh", new Object[] {_arg}));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub asinh (arg As Double) As Double";
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Return Logarithm(arg  + Sqrt(arg * arg + 1) , Exp";
if (true) return anywheresoftware.b4a.keywords.Common.Logarithm(_arg+anywheresoftware.b4a.keywords.Common.Sqrt(_arg*_arg+1),_exponential_equivalent);
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="End Sub";
return 0;
}
public static double  _atanh(double _arg) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "atanh"))
	 {return ((Double) Debug.delegate(ba, "atanh", new Object[] {_arg}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub atanh (arg As Double) As Double";
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Return 0.5 * Logarithm((1 + arg) / (1 - arg) , Ex";
if (true) return 0.5*anywheresoftware.b4a.keywords.Common.Logarithm((1+_arg)/(double)(1-_arg),_exponential_equivalent);
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="End Sub";
return 0;
}
public static int  _convertfromdecimal(int _n,int _base) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "convertfromdecimal"))
	 {return ((Integer) Debug.delegate(ba, "convertfromdecimal", new Object[] {_n,_base}));}
int _result = 0;
int _multiplier = 0;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub ConvertfromDecimal(n As Int, base As In";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Dim result As Int = 0";
_result = (int) (0);
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Dim multiplier As Int = 1";
_multiplier = (int) (1);
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Do While n > 0";
while (_n>0) {
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="result = result + (n Mod base) * multiplier";
_result = (int) (_result+(_n%_base)*_multiplier);
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="multiplier = multiplier * 10";
_multiplier = (int) (_multiplier*10);
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="n = n / base";
_n = (int) (_n/(double)_base);
 }
;
RDebugUtils.currentLine=3932173;
 //BA.debugLineNum = 3932173;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=3932175;
 //BA.debugLineNum = 3932175;BA.debugLine="End Sub";
return 0;
}
public static String  _convertfromdecimal2(int _n,int _base) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "convertfromdecimal2"))
	 {return ((String) Debug.delegate(ba, "convertfromdecimal2", new Object[] {_n,_base}));}
String _chars = "";
String _result = "";
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub ConvertfromDecimal2(n As Int, base As I";
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Dim chars As  String =\"0123456789ABCDEFGHIJ\"";
_chars = "0123456789ABCDEFGHIJ";
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Dim result As String = \"\"";
_result = "";
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="Do While n > 0";
while (_n>0) {
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="result = chars.charAt(n Mod base) & result";
_result = BA.ObjectToString(_chars.charAt((int) (_n%_base)))+_result;
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="n = n / base";
_n = (int) (_n/(double)_base);
 }
;
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=3997710;
 //BA.debugLineNum = 3997710;BA.debugLine="End Sub";
return "";
}
public static int  _convertfromto(int _n,int _frombase,int _tobase) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "convertfromto"))
	 {return ((Integer) Debug.delegate(ba, "convertfromto", new Object[] {_n,_frombase,_tobase}));}
int _t = 0;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub ConvertFromTo(n As Int, frombase As Int";
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Dim t As Int = ConvertToDecimal(n,frombase)";
_t = _converttodecimal(_n,_frombase);
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Return ConvertfromDecimal(t,tobase)";
if (true) return _convertfromdecimal(_t,_tobase);
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="End Sub";
return 0;
}
public static int  _converttodecimal(int _n,int _base) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "converttodecimal"))
	 {return ((Integer) Debug.delegate(ba, "converttodecimal", new Object[] {_n,_base}));}
int _result = 0;
int _multiplier = 0;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub ConvertToDecimal( n As Int, base As Int";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Dim result As Int = 0";
_result = (int) (0);
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Dim multiplier As Int = 1";
_multiplier = (int) (1);
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Do While n > 0";
while (_n>0) {
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="result = result + (n Mod 10) * multiplier";
_result = (int) (_result+(_n%10)*_multiplier);
RDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="multiplier = multiplier * base";
_multiplier = (int) (_multiplier*_base);
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="n = n / 10";
_n = (int) (_n/(double)10);
 }
;
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="End Sub";
return 0;
}
public static int  _converttodecimal2(String _n,int _base) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "converttodecimal2"))
	 {return ((Integer) Debug.delegate(ba, "converttodecimal2", new Object[] {_n,_base}));}
int _result = 0;
String _st = "";
String _chars = "";
int _k = 0;
int _multiplier = 0;
int _i = 0;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub ConverttoDecimal2( n As String, base As";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="n = n.ToUpperCase";
_n = _n.toUpperCase();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Dim result As Int = 0";
_result = (int) (0);
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="Dim st As String";
_st = "";
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="Dim chars As  String =\"0123456789ABCDEFGHIJ\"";
_chars = "0123456789ABCDEFGHIJ";
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="Dim k As Int = n.length - 1";
_k = (int) (_n.length()-1);
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Dim multiplier As Int = 1";
_multiplier = (int) (1);
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="For i =  k To 0 Step -1";
{
final int step7 = -1;
final int limit7 = (int) (0);
_i = _k ;
for (;_i >= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="st = n.CharAt(i)";
_st = BA.ObjectToString(_n.charAt(_i));
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="result = chars.IndexOf(st) * multiplier  + resul";
_result = (int) (_chars.indexOf(_st)*_multiplier+_result);
RDebugUtils.currentLine=4063246;
 //BA.debugLineNum = 4063246;BA.debugLine="multiplier = multiplier * base";
_multiplier = (int) (_multiplier*_base);
 }
};
RDebugUtils.currentLine=4063250;
 //BA.debugLineNum = 4063250;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=4063252;
 //BA.debugLineNum = 4063252;BA.debugLine="End Sub";
return 0;
}
public static double  _cosh(double _arg) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "cosh"))
	 {return ((Double) Debug.delegate(ba, "cosh", new Object[] {_arg}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub cosh (arg As Double) As Double";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Return (exp(arg) + exp(-arg)) / 2";
if (true) return (_exp(_arg)+_exp(-_arg))/(double)2;
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="End Sub";
return 0;
}
public static double  _exp(double _arg) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "exp"))
	 {return ((Double) Debug.delegate(ba, "exp", new Object[] {_arg}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub exp(arg As Double) As Double";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Return Power(Exponential_Equivalent, arg)";
if (true) return anywheresoftware.b4a.keywords.Common.Power(_exponential_equivalent,_arg);
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="End Sub";
return 0;
}
public static double  _deg2rad(double _angle) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "deg2rad"))
	 {return ((Double) Debug.delegate(ba, "deg2rad", new Object[] {_angle}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub deg2rad(angle As Double) As Double";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="Return angle * 0.017453292519943295";
if (true) return _angle*0.017453292519943295;
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="End Sub";
return 0;
}
public static double  _hypot(double _x,double _y) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "hypot"))
	 {return ((Double) Debug.delegate(ba, "hypot", new Object[] {_x,_y}));}
double _t = 0;
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub hypot(x As Double, y As Double) As Doub";
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="x = Abs(x)";
_x = anywheresoftware.b4a.keywords.Common.Abs(_x);
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="y = Abs(y)";
_y = anywheresoftware.b4a.keywords.Common.Abs(_y);
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="Dim t As Double = Min(x, y)";
_t = anywheresoftware.b4a.keywords.Common.Min(_x,_y);
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="x = Max(x, y)";
_x = anywheresoftware.b4a.keywords.Common.Max(_x,_y);
RDebugUtils.currentLine=4653063;
 //BA.debugLineNum = 4653063;BA.debugLine="t = t / x";
_t = _t/(double)_x;
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="Return x * Sqrt(1 + t * t)";
if (true) return _x*anywheresoftware.b4a.keywords.Common.Sqrt(1+_t*_t);
RDebugUtils.currentLine=4653067;
 //BA.debugLineNum = 4653067;BA.debugLine="End Sub";
return 0;
}
public static boolean  _is_finite(String _val) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "is_finite"))
	 {return ((Boolean) Debug.delegate(ba, "is_finite", new Object[] {_val}));}
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub is_finite(val As String) As Boolean";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Return Not(is_infinite(val))";
if (true) return anywheresoftware.b4a.keywords.Common.Not(_is_infinite(_val));
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="End Sub";
return false;
}
public static boolean  _is_infinite(String _val) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "is_infinite"))
	 {return ((Boolean) Debug.delegate(ba, "is_infinite", new Object[] {_val}));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub is_infinite(val As String) As Boolean";
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Return val = POSITIVE_INFINITY Or val = NEGATIVE_";
if (true) return (_val).equals(_positive_infinity) || (_val).equals(_negative_infinity);
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnan(double _d) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "isnan"))
	 {return ((Boolean) Debug.delegate(ba, "isnan", new Object[] {_d}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub IsNan(d As Double) As Boolean";
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Return d <> d";
if (true) return _d!=_d;
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="End Sub";
return false;
}
public static double  _rad2deg(double _number) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "rad2deg"))
	 {return ((Double) Debug.delegate(ba, "rad2deg", new Object[] {_number}));}
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub rad2deg(number As Double) As Double";
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="Return number * 57.29577951308232";
if (true) return _number*57.29577951308232;
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="End Sub";
return 0;
}
public static double  _sinh(double _number) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "sinh"))
	 {return ((Double) Debug.delegate(ba, "sinh", new Object[] {_number}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub sinh(number As Double) As Double";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Return (exp(number) - exp(-number)) / 2";
if (true) return (_exp(_number)-_exp(-_number))/(double)2;
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="End Sub";
return 0;
}
public static double  _tanh(double _number) throws Exception{
RDebugUtils.currentModule="mathutility";
if (Debug.shouldDelegate(ba, "tanh"))
	 {return ((Double) Debug.delegate(ba, "tanh", new Object[] {_number}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub tanh(number As Double) As Double";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Return 1 - 2 / (exp(2 * number) + 1)";
if (true) return 1-2/(double)(_exp(2*_number)+1);
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="End Sub";
return 0;
}
}