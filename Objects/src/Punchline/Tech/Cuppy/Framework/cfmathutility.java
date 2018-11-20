package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfmathutility extends Object{
public static cfmathutility mostCurrent = new cfmathutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmathutility", null);
		ba.loadHtSubs(cfmathutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cfmathutility", ba);
		}
	}
    public static Class<?> getObject() {
		return cfmathutility.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static double _exponential_equivalent = 0;
public static String _negative_infinity = "";
public static String _positive_infinity = "";
public static String _max_safe_integer = "";
public static String _min_safe_integer = "";
public static String _min_value = "";
public static String _max_value = "";
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static double  _acosh(double _arg) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "acosh"))
	 {return ((Double) Debug.delegate(ba, "acosh", new Object[] {_arg}));}
RDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Public Sub Acosh (arg As Double) As Double";
RDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="Return Logarithm(arg  + Sqrt(arg * arg - 1) , Exp";
if (true) return anywheresoftware.b4a.keywords.Common.Logarithm(_arg+anywheresoftware.b4a.keywords.Common.Sqrt(_arg*_arg-1),_exponential_equivalent);
RDebugUtils.currentLine=25231364;
 //BA.debugLineNum = 25231364;BA.debugLine="End Sub";
return 0;
}
public static double  _asinh(double _arg) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "asinh"))
	 {return ((Double) Debug.delegate(ba, "asinh", new Object[] {_arg}));}
RDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Public Sub Asinh (arg As Double) As Double";
RDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="Return Logarithm(arg  + Sqrt(arg * arg + 1) , Exp";
if (true) return anywheresoftware.b4a.keywords.Common.Logarithm(_arg+anywheresoftware.b4a.keywords.Common.Sqrt(_arg*_arg+1),_exponential_equivalent);
RDebugUtils.currentLine=25296900;
 //BA.debugLineNum = 25296900;BA.debugLine="End Sub";
return 0;
}
public static double  _atanh(double _arg) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "atanh"))
	 {return ((Double) Debug.delegate(ba, "atanh", new Object[] {_arg}));}
RDebugUtils.currentLine=25362432;
 //BA.debugLineNum = 25362432;BA.debugLine="Public Sub Atanh (arg As Double) As Double";
RDebugUtils.currentLine=25362434;
 //BA.debugLineNum = 25362434;BA.debugLine="Return 0.5 * Logarithm((1 + arg) / (1 - arg) , Ex";
if (true) return 0.5*anywheresoftware.b4a.keywords.Common.Logarithm((1+_arg)/(double)(1-_arg),_exponential_equivalent);
RDebugUtils.currentLine=25362436;
 //BA.debugLineNum = 25362436;BA.debugLine="End Sub";
return 0;
}
public static int  _convertfromdecimal(int _n,int _base) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "convertfromdecimal"))
	 {return ((Integer) Debug.delegate(ba, "convertfromdecimal", new Object[] {_n,_base}));}
int _result = 0;
int _multiplier = 0;
RDebugUtils.currentLine=25559040;
 //BA.debugLineNum = 25559040;BA.debugLine="Public Sub ConvertFromDecimal(n As Int, base As In";
RDebugUtils.currentLine=25559042;
 //BA.debugLineNum = 25559042;BA.debugLine="Dim result As Int = 0";
_result = (int) (0);
RDebugUtils.currentLine=25559043;
 //BA.debugLineNum = 25559043;BA.debugLine="Dim multiplier As Int = 1";
_multiplier = (int) (1);
RDebugUtils.currentLine=25559045;
 //BA.debugLineNum = 25559045;BA.debugLine="Do While n > 0";
while (_n>0) {
RDebugUtils.currentLine=25559047;
 //BA.debugLineNum = 25559047;BA.debugLine="result = result + (n Mod base) * multiplier";
_result = (int) (_result+(_n%_base)*_multiplier);
RDebugUtils.currentLine=25559048;
 //BA.debugLineNum = 25559048;BA.debugLine="multiplier = multiplier * 10";
_multiplier = (int) (_multiplier*10);
RDebugUtils.currentLine=25559049;
 //BA.debugLineNum = 25559049;BA.debugLine="n = n / base";
_n = (int) (_n/(double)_base);
 }
;
RDebugUtils.currentLine=25559053;
 //BA.debugLineNum = 25559053;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=25559055;
 //BA.debugLineNum = 25559055;BA.debugLine="End Sub";
return 0;
}
public static String  _convertfromdecimal2(int _n,int _base) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "convertfromdecimal2"))
	 {return ((String) Debug.delegate(ba, "convertfromdecimal2", new Object[] {_n,_base}));}
String _chars = "";
String _result = "";
RDebugUtils.currentLine=25624576;
 //BA.debugLineNum = 25624576;BA.debugLine="Public Sub ConvertFromDecimal2(n As Int, base As I";
RDebugUtils.currentLine=25624578;
 //BA.debugLineNum = 25624578;BA.debugLine="Dim chars As  String =\"0123456789ABCDEFGHIJ\"";
_chars = "0123456789ABCDEFGHIJ";
RDebugUtils.currentLine=25624579;
 //BA.debugLineNum = 25624579;BA.debugLine="Dim result As String = \"\"";
_result = "";
RDebugUtils.currentLine=25624581;
 //BA.debugLineNum = 25624581;BA.debugLine="Do While n > 0";
while (_n>0) {
RDebugUtils.currentLine=25624583;
 //BA.debugLineNum = 25624583;BA.debugLine="result = chars.charAt(n Mod base) & result";
_result = BA.ObjectToString(_chars.charAt((int) (_n%_base)))+_result;
RDebugUtils.currentLine=25624584;
 //BA.debugLineNum = 25624584;BA.debugLine="n = n / base";
_n = (int) (_n/(double)_base);
 }
;
RDebugUtils.currentLine=25624588;
 //BA.debugLineNum = 25624588;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=25624590;
 //BA.debugLineNum = 25624590;BA.debugLine="End Sub";
return "";
}
public static int  _convertfromto(int _n,int _frombase,int _tobase) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "convertfromto"))
	 {return ((Integer) Debug.delegate(ba, "convertfromto", new Object[] {_n,_frombase,_tobase}));}
int _t = 0;
RDebugUtils.currentLine=25755648;
 //BA.debugLineNum = 25755648;BA.debugLine="Public Sub ConvertFromTo(n As Int, frombase As Int";
RDebugUtils.currentLine=25755650;
 //BA.debugLineNum = 25755650;BA.debugLine="Dim t As Int = ConvertToDecimal(n,frombase)";
_t = _converttodecimal(_n,_frombase);
RDebugUtils.currentLine=25755651;
 //BA.debugLineNum = 25755651;BA.debugLine="Return ConvertFromDecimal(t,tobase)";
if (true) return _convertfromdecimal(_t,_tobase);
RDebugUtils.currentLine=25755653;
 //BA.debugLineNum = 25755653;BA.debugLine="End Sub";
return 0;
}
public static int  _converttodecimal(int _n,int _base) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "converttodecimal"))
	 {return ((Integer) Debug.delegate(ba, "converttodecimal", new Object[] {_n,_base}));}
int _result = 0;
int _multiplier = 0;
RDebugUtils.currentLine=25493504;
 //BA.debugLineNum = 25493504;BA.debugLine="Public Sub ConvertToDecimal( n As Int, base As Int";
RDebugUtils.currentLine=25493506;
 //BA.debugLineNum = 25493506;BA.debugLine="Dim result As Int = 0";
_result = (int) (0);
RDebugUtils.currentLine=25493507;
 //BA.debugLineNum = 25493507;BA.debugLine="Dim multiplier As Int = 1";
_multiplier = (int) (1);
RDebugUtils.currentLine=25493509;
 //BA.debugLineNum = 25493509;BA.debugLine="Do While n > 0";
while (_n>0) {
RDebugUtils.currentLine=25493511;
 //BA.debugLineNum = 25493511;BA.debugLine="result = result + (n Mod 10) * multiplier";
_result = (int) (_result+(_n%10)*_multiplier);
RDebugUtils.currentLine=25493512;
 //BA.debugLineNum = 25493512;BA.debugLine="multiplier = multiplier * base";
_multiplier = (int) (_multiplier*_base);
RDebugUtils.currentLine=25493513;
 //BA.debugLineNum = 25493513;BA.debugLine="n = n / 10";
_n = (int) (_n/(double)10);
 }
;
RDebugUtils.currentLine=25493517;
 //BA.debugLineNum = 25493517;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=25493519;
 //BA.debugLineNum = 25493519;BA.debugLine="End Sub";
return 0;
}
public static int  _converttodecimal2(String _n,int _base) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "converttodecimal2"))
	 {return ((Integer) Debug.delegate(ba, "converttodecimal2", new Object[] {_n,_base}));}
int _result = 0;
String _st = "";
String _chars = "";
int _k = 0;
int _multiplier = 0;
int _i = 0;
RDebugUtils.currentLine=25690112;
 //BA.debugLineNum = 25690112;BA.debugLine="Public Sub ConvertToDecimal2( n As String, base As";
RDebugUtils.currentLine=25690114;
 //BA.debugLineNum = 25690114;BA.debugLine="n = n.ToUpperCase";
_n = _n.toUpperCase();
RDebugUtils.currentLine=25690115;
 //BA.debugLineNum = 25690115;BA.debugLine="Dim result As Int = 0";
_result = (int) (0);
RDebugUtils.currentLine=25690116;
 //BA.debugLineNum = 25690116;BA.debugLine="Dim st As String";
_st = "";
RDebugUtils.currentLine=25690118;
 //BA.debugLineNum = 25690118;BA.debugLine="Dim chars As  String =\"0123456789ABCDEFGHIJ\"";
_chars = "0123456789ABCDEFGHIJ";
RDebugUtils.currentLine=25690119;
 //BA.debugLineNum = 25690119;BA.debugLine="Dim k As Int = n.length - 1";
_k = (int) (_n.length()-1);
RDebugUtils.currentLine=25690120;
 //BA.debugLineNum = 25690120;BA.debugLine="Dim multiplier As Int = 1";
_multiplier = (int) (1);
RDebugUtils.currentLine=25690122;
 //BA.debugLineNum = 25690122;BA.debugLine="For i =  k To 0 Step -1";
{
final int step7 = -1;
final int limit7 = (int) (0);
_i = _k ;
for (;_i >= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=25690124;
 //BA.debugLineNum = 25690124;BA.debugLine="st = n.CharAt(i)";
_st = BA.ObjectToString(_n.charAt(_i));
RDebugUtils.currentLine=25690125;
 //BA.debugLineNum = 25690125;BA.debugLine="result = chars.IndexOf(st) * multiplier  + resul";
_result = (int) (_chars.indexOf(_st)*_multiplier+_result);
RDebugUtils.currentLine=25690126;
 //BA.debugLineNum = 25690126;BA.debugLine="multiplier = multiplier * base";
_multiplier = (int) (_multiplier*_base);
 }
};
RDebugUtils.currentLine=25690130;
 //BA.debugLineNum = 25690130;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=25690132;
 //BA.debugLineNum = 25690132;BA.debugLine="End Sub";
return 0;
}
public static double  _cosh(double _arg) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "cosh"))
	 {return ((Double) Debug.delegate(ba, "cosh", new Object[] {_arg}));}
RDebugUtils.currentLine=25427968;
 //BA.debugLineNum = 25427968;BA.debugLine="Public Sub Cosh (arg As Double) As Double";
RDebugUtils.currentLine=25427970;
 //BA.debugLineNum = 25427970;BA.debugLine="Return (Exp(arg) + Exp(-arg)) / 2";
if (true) return (_exp(_arg)+_exp(-_arg))/(double)2;
RDebugUtils.currentLine=25427972;
 //BA.debugLineNum = 25427972;BA.debugLine="End Sub";
return 0;
}
public static double  _exp(double _arg) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "exp"))
	 {return ((Double) Debug.delegate(ba, "exp", new Object[] {_arg}));}
RDebugUtils.currentLine=25821184;
 //BA.debugLineNum = 25821184;BA.debugLine="Public Sub Exp(arg As Double) As Double";
RDebugUtils.currentLine=25821186;
 //BA.debugLineNum = 25821186;BA.debugLine="Return Power(Exponential_Equivalent, arg)";
if (true) return anywheresoftware.b4a.keywords.Common.Power(_exponential_equivalent,_arg);
RDebugUtils.currentLine=25821188;
 //BA.debugLineNum = 25821188;BA.debugLine="End Sub";
return 0;
}
public static double  _deg2rad(double _angle) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "deg2rad"))
	 {return ((Double) Debug.delegate(ba, "deg2rad", new Object[] {_angle}));}
RDebugUtils.currentLine=26148864;
 //BA.debugLineNum = 26148864;BA.debugLine="Public Sub Deg2rad(angle As Double) As Double";
RDebugUtils.currentLine=26148866;
 //BA.debugLineNum = 26148866;BA.debugLine="Return angle * 0.017453292519943295";
if (true) return _angle*0.017453292519943295;
RDebugUtils.currentLine=26148868;
 //BA.debugLineNum = 26148868;BA.debugLine="End Sub";
return 0;
}
public static double  _hypot(double _x,double _y) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "hypot"))
	 {return ((Double) Debug.delegate(ba, "hypot", new Object[] {_x,_y}));}
double _t = 0;
RDebugUtils.currentLine=26279936;
 //BA.debugLineNum = 26279936;BA.debugLine="Public Sub Hypot(x As Double, y As Double) As Doub";
RDebugUtils.currentLine=26279938;
 //BA.debugLineNum = 26279938;BA.debugLine="x = Abs(x)";
_x = anywheresoftware.b4a.keywords.Common.Abs(_x);
RDebugUtils.currentLine=26279939;
 //BA.debugLineNum = 26279939;BA.debugLine="y = Abs(y)";
_y = anywheresoftware.b4a.keywords.Common.Abs(_y);
RDebugUtils.currentLine=26279941;
 //BA.debugLineNum = 26279941;BA.debugLine="Dim t As Double = Min(x, y)";
_t = anywheresoftware.b4a.keywords.Common.Min(_x,_y);
RDebugUtils.currentLine=26279942;
 //BA.debugLineNum = 26279942;BA.debugLine="x = Max(x, y)";
_x = anywheresoftware.b4a.keywords.Common.Max(_x,_y);
RDebugUtils.currentLine=26279943;
 //BA.debugLineNum = 26279943;BA.debugLine="t = t / x";
_t = _t/(double)_x;
RDebugUtils.currentLine=26279945;
 //BA.debugLineNum = 26279945;BA.debugLine="Return x * Sqrt(1 + t * t)";
if (true) return _x*anywheresoftware.b4a.keywords.Common.Sqrt(1+_t*_t);
RDebugUtils.currentLine=26279947;
 //BA.debugLineNum = 26279947;BA.debugLine="End Sub";
return 0;
}
public static boolean  _is_finite(String _val) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "is_finite"))
	 {return ((Boolean) Debug.delegate(ba, "is_finite", new Object[] {_val}));}
RDebugUtils.currentLine=26083328;
 //BA.debugLineNum = 26083328;BA.debugLine="Public Sub Is_finite(val As String) As Boolean";
RDebugUtils.currentLine=26083330;
 //BA.debugLineNum = 26083330;BA.debugLine="Return Not(Is_infinite(val))";
if (true) return anywheresoftware.b4a.keywords.Common.Not(_is_infinite(_val));
RDebugUtils.currentLine=26083332;
 //BA.debugLineNum = 26083332;BA.debugLine="End Sub";
return false;
}
public static boolean  _is_infinite(String _val) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "is_infinite"))
	 {return ((Boolean) Debug.delegate(ba, "is_infinite", new Object[] {_val}));}
RDebugUtils.currentLine=26017792;
 //BA.debugLineNum = 26017792;BA.debugLine="Public Sub Is_infinite(val As String) As Boolean";
RDebugUtils.currentLine=26017794;
 //BA.debugLineNum = 26017794;BA.debugLine="Return val = POSITIVE_INFINITY Or val = NEGATIVE_";
if (true) return (_val).equals(_positive_infinity) || (_val).equals(_negative_infinity);
RDebugUtils.currentLine=26017796;
 //BA.debugLineNum = 26017796;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnan(double _d) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "isnan"))
	 {return ((Boolean) Debug.delegate(ba, "isnan", new Object[] {_d}));}
RDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Public Sub IsNan(d As Double) As Boolean";
RDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="Return d <> d";
if (true) return _d!=_d;
RDebugUtils.currentLine=25165828;
 //BA.debugLineNum = 25165828;BA.debugLine="End Sub";
return false;
}
public static double  _numbersaverage(anywheresoftware.b4a.objects.collections.List _data,boolean _roundup) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "numbersaverage"))
	 {return ((Double) Debug.delegate(ba, "numbersaverage", new Object[] {_data,_roundup}));}
int _total = 0;
int _value = 0;
RDebugUtils.currentLine=26345472;
 //BA.debugLineNum = 26345472;BA.debugLine="Public Sub NumbersAverage(data As List ,roundUp As";
RDebugUtils.currentLine=26345474;
 //BA.debugLineNum = 26345474;BA.debugLine="Dim total As Int = 0";
_total = (int) (0);
RDebugUtils.currentLine=26345478;
 //BA.debugLineNum = 26345478;BA.debugLine="For Each value As Int In data";
{
final anywheresoftware.b4a.BA.IterableList group2 = _data;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_value = (int)(BA.ObjectToNumber(group2.Get(index2)));
RDebugUtils.currentLine=26345480;
 //BA.debugLineNum = 26345480;BA.debugLine="total= total + value";
_total = (int) (_total+_value);
 }
};
RDebugUtils.currentLine=26345484;
 //BA.debugLineNum = 26345484;BA.debugLine="If roundUp Then";
if (_roundup) { 
RDebugUtils.currentLine=26345487;
 //BA.debugLineNum = 26345487;BA.debugLine="Return Ceil(total / data.Size)";
if (true) return anywheresoftware.b4a.keywords.Common.Ceil(_total/(double)_data.getSize());
 }else {
RDebugUtils.currentLine=26345493;
 //BA.debugLineNum = 26345493;BA.debugLine="Return total / data.Size";
if (true) return _total/(double)_data.getSize();
 };
RDebugUtils.currentLine=26345497;
 //BA.debugLineNum = 26345497;BA.debugLine="End Sub";
return 0;
}
public static double  _numbersaverage2(anywheresoftware.b4a.objects.collections.List _data) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "numbersaverage2"))
	 {return ((Double) Debug.delegate(ba, "numbersaverage2", new Object[] {_data}));}
RDebugUtils.currentLine=26411008;
 //BA.debugLineNum = 26411008;BA.debugLine="Public Sub NumbersAverage2(data As List) As Double";
RDebugUtils.currentLine=26411010;
 //BA.debugLineNum = 26411010;BA.debugLine="Return NumbersAverage(data, True)";
if (true) return _numbersaverage(_data,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=26411012;
 //BA.debugLineNum = 26411012;BA.debugLine="End Sub";
return 0;
}
public static double  _rad2deg(double _number) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "rad2deg"))
	 {return ((Double) Debug.delegate(ba, "rad2deg", new Object[] {_number}));}
RDebugUtils.currentLine=26214400;
 //BA.debugLineNum = 26214400;BA.debugLine="Public Sub Rad2deg(number As Double) As Double";
RDebugUtils.currentLine=26214402;
 //BA.debugLineNum = 26214402;BA.debugLine="Return number * 57.29577951308232";
if (true) return _number*57.29577951308232;
RDebugUtils.currentLine=26214404;
 //BA.debugLineNum = 26214404;BA.debugLine="End Sub";
return 0;
}
public static double  _sinh(double _number) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "sinh"))
	 {return ((Double) Debug.delegate(ba, "sinh", new Object[] {_number}));}
RDebugUtils.currentLine=25952256;
 //BA.debugLineNum = 25952256;BA.debugLine="Public Sub Sinh(number As Double) As Double";
RDebugUtils.currentLine=25952258;
 //BA.debugLineNum = 25952258;BA.debugLine="Return (Exp(number) - Exp(-number)) / 2";
if (true) return (_exp(_number)-_exp(-_number))/(double)2;
RDebugUtils.currentLine=25952260;
 //BA.debugLineNum = 25952260;BA.debugLine="End Sub";
return 0;
}
public static double  _tanh(double _number) throws Exception{
RDebugUtils.currentModule="cfmathutility";
if (Debug.shouldDelegate(ba, "tanh"))
	 {return ((Double) Debug.delegate(ba, "tanh", new Object[] {_number}));}
RDebugUtils.currentLine=25886720;
 //BA.debugLineNum = 25886720;BA.debugLine="Public Sub Tanh(number As Double) As Double";
RDebugUtils.currentLine=25886722;
 //BA.debugLineNum = 25886722;BA.debugLine="Return 1 - 2 / (Exp(2 * number) + 1)";
if (true) return 1-2/(double)(_exp(2*_number)+1);
RDebugUtils.currentLine=25886724;
 //BA.debugLineNum = 25886724;BA.debugLine="End Sub";
return 0;
}
}