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
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.componentsmanager _componentsmanager = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.cuppyglobals _cuppyglobals = null;
public static Punchline.Tech.Cuppy.Framework.numbersutility _numbersutility = null;
public static Punchline.Tech.Cuppy.Framework.stringutility _stringutility = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static double  _acosh(double _arg) throws Exception{
 //BA.debugLineNum = 14;BA.debugLine="Public Sub acosh (arg As Double) As Double";
 //BA.debugLineNum = 16;BA.debugLine="Return Logarithm(arg  + Sqrt(arg * arg - 1) , 2.7";
if (true) return anywheresoftware.b4a.keywords.Common.Logarithm(_arg+anywheresoftware.b4a.keywords.Common.Sqrt(_arg*_arg-1),2.7182818284590452354);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return 0;
}
public static double  _asinh(double _arg) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Public Sub asinh (arg As Double) As Double";
 //BA.debugLineNum = 23;BA.debugLine="Return Logarithm(arg  + Sqrt(arg * arg + 1) , 2.7";
if (true) return anywheresoftware.b4a.keywords.Common.Logarithm(_arg+anywheresoftware.b4a.keywords.Common.Sqrt(_arg*_arg+1),2.7182818284590452354);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return 0;
}
public static double  _atanh(double _arg) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Public Sub atanh (arg As Double) As Double";
 //BA.debugLineNum = 30;BA.debugLine="Return 0.5 * Logarithm((1 + arg) / (1 - arg) , 2.";
if (true) return 0.5*anywheresoftware.b4a.keywords.Common.Logarithm((1+_arg)/(double)(1-_arg),2.7182818284590452354);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return 0;
}
public static int  _convertfromdecimal(int _n,int _base) throws Exception{
int _result = 0;
int _multiplier = 0;
 //BA.debugLineNum = 55;BA.debugLine="Public Sub ConvertfromDecimal(n As Int, base As In";
 //BA.debugLineNum = 57;BA.debugLine="Dim result As Int = 0";
_result = (int) (0);
 //BA.debugLineNum = 58;BA.debugLine="Dim multiplier As Int = 1";
_multiplier = (int) (1);
 //BA.debugLineNum = 60;BA.debugLine="Do While n > 0";
while (_n>0) {
 //BA.debugLineNum = 62;BA.debugLine="result = result + (n Mod base) * multiplier";
_result = (int) (_result+(_n%_base)*_multiplier);
 //BA.debugLineNum = 63;BA.debugLine="multiplier = multiplier * 10";
_multiplier = (int) (_multiplier*10);
 //BA.debugLineNum = 64;BA.debugLine="n = n / base";
_n = (int) (_n/(double)_base);
 }
;
 //BA.debugLineNum = 68;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return 0;
}
public static String  _convertfromdecimal2(int _n,int _base) throws Exception{
String _chars = "";
String _result = "";
 //BA.debugLineNum = 74;BA.debugLine="Public Sub ConvertfromDecimal2(n As Int, base As I";
 //BA.debugLineNum = 76;BA.debugLine="Dim chars As  String =\"0123456789ABCDEFGHIJ\"";
_chars = "0123456789ABCDEFGHIJ";
 //BA.debugLineNum = 77;BA.debugLine="Dim result As String = \"\"";
_result = "";
 //BA.debugLineNum = 79;BA.debugLine="Do While n > 0";
while (_n>0) {
 //BA.debugLineNum = 81;BA.debugLine="result = chars.charAt(n Mod base) & result";
_result = BA.ObjectToString(_chars.charAt((int) (_n%_base)))+_result;
 //BA.debugLineNum = 82;BA.debugLine="n = n / base";
_n = (int) (_n/(double)_base);
 }
;
 //BA.debugLineNum = 86;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public static int  _convertfromto(int _n,int _frombase,int _tobase) throws Exception{
int _t = 0;
 //BA.debugLineNum = 116;BA.debugLine="Public Sub ConvertFromTo(n As Int, frombase As Int";
 //BA.debugLineNum = 118;BA.debugLine="Dim t As Int = ConvertToDecimal(n,frombase)";
_t = _converttodecimal(_n,_frombase);
 //BA.debugLineNum = 119;BA.debugLine="Return ConvertfromDecimal(t,tobase)";
if (true) return _convertfromdecimal(_t,_tobase);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return 0;
}
public static int  _converttodecimal(int _n,int _base) throws Exception{
int _result = 0;
int _multiplier = 0;
 //BA.debugLineNum = 36;BA.debugLine="Public Sub ConvertToDecimal( n As Int, base As Int";
 //BA.debugLineNum = 38;BA.debugLine="Dim result As Int = 0";
_result = (int) (0);
 //BA.debugLineNum = 39;BA.debugLine="Dim multiplier As Int = 1";
_multiplier = (int) (1);
 //BA.debugLineNum = 41;BA.debugLine="Do While n > 0";
while (_n>0) {
 //BA.debugLineNum = 43;BA.debugLine="result = result + (n Mod 10) * multiplier";
_result = (int) (_result+(_n%10)*_multiplier);
 //BA.debugLineNum = 44;BA.debugLine="multiplier = multiplier * base";
_multiplier = (int) (_multiplier*_base);
 //BA.debugLineNum = 45;BA.debugLine="n = n / 10";
_n = (int) (_n/(double)10);
 }
;
 //BA.debugLineNum = 49;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return 0;
}
public static int  _converttodecimal2(String _n,int _base) throws Exception{
int _result = 0;
String _st = "";
String _chars = "";
int _k = 0;
int _multiplier = 0;
int _i = 0;
 //BA.debugLineNum = 92;BA.debugLine="Public Sub ConverttoDecimal2( n As String, base As";
 //BA.debugLineNum = 94;BA.debugLine="n = n.ToUpperCase";
_n = _n.toUpperCase();
 //BA.debugLineNum = 95;BA.debugLine="Dim result As Int = 0";
_result = (int) (0);
 //BA.debugLineNum = 96;BA.debugLine="Dim st As String";
_st = "";
 //BA.debugLineNum = 98;BA.debugLine="Dim chars As  String =\"0123456789ABCDEFGHIJ\"";
_chars = "0123456789ABCDEFGHIJ";
 //BA.debugLineNum = 99;BA.debugLine="Dim k As Int = n.length - 1";
_k = (int) (_n.length()-1);
 //BA.debugLineNum = 100;BA.debugLine="Dim multiplier As Int = 1";
_multiplier = (int) (1);
 //BA.debugLineNum = 102;BA.debugLine="For i =  k To 0 Step -1";
{
final int step7 = (int) (-1);
final int limit7 = (int) (0);
_i = _k ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
 //BA.debugLineNum = 104;BA.debugLine="st = n.CharAt(i)";
_st = BA.ObjectToString(_n.charAt(_i));
 //BA.debugLineNum = 105;BA.debugLine="result = chars.IndexOf(st) * multiplier  + resul";
_result = (int) (_chars.indexOf(_st)*_multiplier+_result);
 //BA.debugLineNum = 106;BA.debugLine="multiplier = multiplier * base";
_multiplier = (int) (_multiplier*_base);
 }
};
 //BA.debugLineNum = 110;BA.debugLine="Return result";
if (true) return _result;
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return 0;
}
public static boolean  _isnan(double _d) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Public Sub IsNan(d As Double) As Boolean";
 //BA.debugLineNum = 9;BA.debugLine="Return d <> d";
if (true) return _d!=_d;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return false;
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
}
