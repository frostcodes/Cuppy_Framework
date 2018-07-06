package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class stringutility extends Object{
public static stringutility mostCurrent = new stringutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.stringutility", null);
		ba.loadHtSubs(stringutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.stringutility", ba);
		}
	}
    public static Class<?> getObject() {
		return stringutility.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.configs _configs = null;
public static Punchline.Tech.Cuppy.Framework.mathutility _mathutility = null;
public static Punchline.Tech.Cuppy.Framework.datatypeutility _datatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.stylemanager _stylemanager = null;
public static Punchline.Tech.Cuppy.Framework.apputility _apputility = null;
public static Punchline.Tech.Cuppy.Framework.controlsutils _controlsutils = null;
public static Punchline.Tech.Cuppy.Framework.fileutility _fileutility = null;
public static Punchline.Tech.Cuppy.Framework.animationmanager _animationmanager = null;
public static Punchline.Tech.Cuppy.Framework.licensemanager _licensemanager = null;
public static Object  _breakstrat(String _haystack,String _after) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "breakstrat"))
	 {return ((Object) Debug.delegate(ba, "breakstrat", new Object[] {_haystack,_after}));}
String _found = "";
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub breakStrAt(haystack As String, after As";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim found As String = \"\"";
_found = "";
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="found= haystack.IndexOf(after)";
_found = BA.NumberToString(_haystack.indexOf(_after));
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="If found = -1 Then";
if ((_found).equals(BA.NumberToString(-1))) { 
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="Return False";
if (true) return (Object)(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="Return haystack.SubString(found)";
if (true) return (Object)(_haystack.substring((int)(Double.parseDouble(_found))));
 };
RDebugUtils.currentLine=3211280;
 //BA.debugLineNum = 3211280;BA.debugLine="End Sub";
return null;
}
public static String  _camelize(String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "camelize"))
	 {return ((String) Debug.delegate(ba, "camelize", new Object[] {_str}));}
String _firstchar = "";
String _result = "";
String _txt = "";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub camelize(str As String)  As String";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim firstChar, result As String =\"\"";
_firstchar = "";
_result = "";
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="str= str.Replace(\" \", \"_\") 'make all spaces _";
_str = _str.replace(" ","_");
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="firstChar = str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="firstChar = firstChar.ToLowerCase";
_firstchar = _firstchar.toLowerCase();
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="For Each txt As String In explode(\"_\", str)";
{
final anywheresoftware.b4a.BA.IterableList group5 = _explode("_",_str);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_txt = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="result = result & ucfirst(txt)";
_result = _result+_ucfirst(_txt);
 }
};
RDebugUtils.currentLine=2621452;
 //BA.debugLineNum = 2621452;BA.debugLine="Return firstChar & result.SubString(1)";
if (true) return _firstchar+_result.substring((int) (1));
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _explode(String _delimiter,String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "explode"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "explode", new Object[] {_delimiter,_str}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub explode(delimiter As String ,  str As S";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Return Split(str, delimiter)";
if (true) return _split(_str,_delimiter);
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return null;
}
public static String  _ucfirst(String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "ucfirst"))
	 {return ((String) Debug.delegate(ba, "ucfirst", new Object[] {_str}));}
String _firstchar = "";
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub ucfirst(str As String) As String";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="firstChar= str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="firstChar = firstChar.ToUpperCase";
_firstchar = _firstchar.toUpperCase();
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Return firstChar & str.SubString(1)";
if (true) return _firstchar+_str.substring((int) (1));
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="End Sub";
return "";
}
public static boolean  _containurl(String _text) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "containurl"))
	 {return ((Boolean) Debug.delegate(ba, "containurl", new Object[] {_text}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub ContainUrl(text As String) As Boolean";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="text = text.Trim";
_text = _text.trim();
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="Return text.Contains(\"http://\") Or text.Contains(";
if (true) return _text.contains("http://") || _text.contains("https://");
RDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="End Sub";
return false;
}
public static anywheresoftware.b4a.objects.collections.List  _split(String _str,String _delimiter) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "split"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "split", new Object[] {_str,_delimiter}));}
anywheresoftware.b4a.objects.collections.List _t = null;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub Split(str As String, delimiter As String) As L";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim t As List";
_t = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="t = Regex.Split(delimiter, str)";
_t = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(_delimiter,_str));
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Return t";
if (true) return _t;
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="End Sub";
return null;
}
public static int  _generatepincode(int _pinlength) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "generatepincode"))
	 {return ((Integer) Debug.delegate(ba, "generatepincode", new Object[] {_pinlength}));}
String _result = "";
String[] _randomarray = null;
int _i = 0;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Public Sub generatePinCode(PinLength As Int) As I";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim result As String =\"\"";
_result = "";
RDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="Dim RandomArray() As String = Array As String(1,2";
_randomarray = new String[]{BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(7),BA.NumberToString(8),BA.NumberToString(9),BA.NumberToString(0)};
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="For i = 0 To PinLength - 1";
{
final int step3 = 1;
final int limit3 = (int) (_pinlength-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="result = result &  RandomArray( Rnd( 0, Rnd(2, R";
_result = _result+_randomarray[anywheresoftware.b4a.keywords.Common.Rnd((int) (0),anywheresoftware.b4a.keywords.Common.Rnd((int) (2),(int) (_randomarray.length-1)))];
 }
};
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="Return  result";
if (true) return (int)(Double.parseDouble(_result));
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="End Sub";
return 0;
}
public static String  _generaterandomstring(int _strlength) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "generaterandomstring"))
	 {return ((String) Debug.delegate(ba, "generaterandomstring", new Object[] {_strlength}));}
String _rndstring = "";
int _rndnumber = 0;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub generateRandomString(StrLength As Int)";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim RndString As String";
_rndstring = "";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim RndNumber As Int";
_rndnumber = 0;
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Do While RndString.Length < StrLength";
while (_rndstring.length()<_strlength) {
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="RndNumber = Rnd(48,123) 'Yep, 123, because the l";
_rndnumber = anywheresoftware.b4a.keywords.Common.Rnd((int) (48),(int) (123));
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="If (RndNumber >= 48 And RndNumber <= 57) Or (Rnd";
if ((_rndnumber>=48 && _rndnumber<=57) || (_rndnumber>=65 && _rndnumber<=90) || (_rndnumber>=97 && _rndnumber<=112)) { 
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="RndString = RndString & Chr(RndNumber)";
_rndstring = _rndstring+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(_rndnumber));
 };
 }
;
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="Return RndString";
if (true) return _rndstring;
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="End Sub";
return "";
}
public static String  _generaterandomstring2(int _strlength) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "generaterandomstring2"))
	 {return ((String) Debug.delegate(ba, "generaterandomstring2", new Object[] {_strlength}));}
String[] _randomarray = null;
String _result = "";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Public Sub generateRandomString2(StrLength As Int)";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim RandomArray() As String = Array As String(\"!\"";
_randomarray = new String[]{"!","@","#","$","%"};
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Dim result As String";
_result = "";
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="result =  StringArray2String(shuffleArray(RandomA";
_result = _stringarray2string(_shufflearray(_randomarray));
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="result = result  & generateRandomString( Floor( S";
_result = _result+_generaterandomstring((int) (anywheresoftware.b4a.keywords.Common.Floor(_strlength/(double)2)));
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="result = result  & StringArray2String(shuffleArra";
_result = _result+_stringarray2string(_shufflearray(_randomarray));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="result = result  & generateRandomString( Floor( S";
_result = _result+_generaterandomstring((int) (anywheresoftware.b4a.keywords.Common.Floor(_strlength/(double)2)));
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="Return  result.SubString2( result.Length - StrLen";
if (true) return _result.substring((int) (_result.length()-_strlength),_result.length());
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="End Sub";
return "";
}
public static String  _stringarray2string(String[] _strarray) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "stringarray2string"))
	 {return ((String) Debug.delegate(ba, "stringarray2string", new Object[] {_strarray}));}
String _result = "";
String _str = "";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub StringArray2String(StrArray() As String";
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Dim result As String =\"\"";
_result = "";
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="For Each str As String In StrArray 'an array";
{
final String[] group2 = _strarray;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = group2[index2];
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="result = result & str";
_result = _result+_str;
 }
};
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=2031625;
 //BA.debugLineNum = 2031625;BA.debugLine="End Sub";
return "";
}
public static String[]  _shufflearray(String[] _stringarray) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "shufflearray"))
	 {return ((String[]) Debug.delegate(ba, "shufflearray", new Object[] {_stringarray}));}
String _arrayval = "";
int _random = 0;
int _i = 0;
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub shuffleArray(StringArray() As String) A";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Dim ArrayVal As String";
_arrayval = "";
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Dim Random As Int";
_random = 0;
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="For i = 0 To StringArray.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_stringarray.length-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="Random = Rnd(i, StringArray.Length)";
_random = anywheresoftware.b4a.keywords.Common.Rnd(_i,_stringarray.length);
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="ArrayVal = StringArray(i)";
_arrayval = _stringarray[_i];
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="StringArray(i) = StringArray(Random)";
_stringarray[_i] = _stringarray[_random];
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="StringArray(Random) = ArrayVal";
_stringarray[_random] = _arrayval;
 }
};
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Return StringArray";
if (true) return _stringarray;
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="End Sub";
return null;
}
public static String  _humanize(String _str,String _separator) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "humanize"))
	 {return ((String) Debug.delegate(ba, "humanize", new Object[] {_str,_separator}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub humanize(str As String, separator As St";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="str= str.ToLowerCase";
_str = _str.toLowerCase();
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Return ucwords(str.Replace(separator, \" \"))";
if (true) return _ucwords(_str.replace(_separator," "));
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="End Sub";
return "";
}
public static String  _ucwords(String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "ucwords"))
	 {return ((String) Debug.delegate(ba, "ucwords", new Object[] {_str}));}
String _result = "";
String _txt = "";
String _firstchar = "";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub ucwords(str As String) As String";
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Dim result As String =\"\"";
_result = "";
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="For Each txt As String In explode(\" \", str)";
{
final anywheresoftware.b4a.BA.IterableList group2 = _explode(" ",_str);
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_txt = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="firstChar= txt.CharAt(0)";
_firstchar = BA.ObjectToString(_txt.charAt((int) (0)));
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="firstChar = firstChar.ToUpperCase";
_firstchar = _firstchar.toUpperCase();
RDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="result = result & firstChar & txt.SubString(1) &";
_result = _result+_firstchar+_txt.substring((int) (1))+" ";
 }
};
RDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=2424846;
 //BA.debugLineNum = 2424846;BA.debugLine="End Sub";
return "";
}
public static String  _implode(String _separator,anywheresoftware.b4a.objects.collections.List _strlist) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "implode"))
	 {return ((String) Debug.delegate(ba, "implode", new Object[] {_separator,_strlist}));}
String _result = "";
String _str = "";
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub implode(separator As String, StrList As";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim result As String =\"\"";
_result = "";
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="For Each str As String In StrList 'an array";
{
final anywheresoftware.b4a.BA.IterableList group2 = _strlist;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="result = result & str & separator";
_result = _result+_str+_separator;
 }
};
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="Return trim_once(result, separator) ' trim separa";
if (true) return _trim_once(_result,_separator);
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="End Sub";
return "";
}
public static String  _trim_once(String _str,String _character) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "trim_once"))
	 {return ((String) Debug.delegate(ba, "trim_once", new Object[] {_str,_character}));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub trim_once(str As String, character As S";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="str = trim_left_once(str, character)";
_str = _trim_left_once(_str,_character);
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="str = trim_right_once(str, character)";
_str = _trim_right_once(_str,_character);
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="End Sub";
return "";
}
public static String  _increment_string(String _str,String _separator,int _first) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "increment_string"))
	 {return ((String) Debug.delegate(ba, "increment_string", new Object[] {_str,_separator,_first}));}
String _parsed_str = "";
String _foundint = "";
int _indexofseperator = 0;
long _foundlong = 0L;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub increment_string(str As String, separat";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Dim parsed_str, foundInt As String =\"\"";
_parsed_str = "";
_foundint = "";
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Dim IndexOfSeperator  As Int = 0";
_indexofseperator = (int) (0);
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="IndexOfSeperator = str.LastIndexOf(separator)  'f";
_indexofseperator = _str.lastIndexOf(_separator);
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="If  IndexOfSeperator <> 0 Then";
if (_indexofseperator!=0) { 
RDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="foundInt = str.SubString((IndexOfSeperator +1)";
_foundint = _str.substring((int) ((_indexofseperator+1)));
RDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="If IsNumber(foundInt) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_foundint)) { 
RDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="parsed_str = str.SubString2(0 , IndexOfSeperato";
_parsed_str = _str.substring((int) (0),_indexofseperator);
RDebugUtils.currentLine=2097173;
 //BA.debugLineNum = 2097173;BA.debugLine="Dim foundLong As Long = (foundInt + 1)";
_foundlong = (long) (((double)(Double.parseDouble(_foundint))+1));
RDebugUtils.currentLine=2097175;
 //BA.debugLineNum = 2097175;BA.debugLine="Return parsed_str & separator & foundLong";
if (true) return _parsed_str+_separator+BA.NumberToString(_foundlong);
 }else {
RDebugUtils.currentLine=2097180;
 //BA.debugLineNum = 2097180;BA.debugLine="Return str & separator & first";
if (true) return _str+_separator+BA.NumberToString(_first);
 };
 }else {
RDebugUtils.currentLine=2097187;
 //BA.debugLineNum = 2097187;BA.debugLine="Return str & separator & first";
if (true) return _str+_separator+BA.NumberToString(_first);
 };
RDebugUtils.currentLine=2097191;
 //BA.debugLineNum = 2097191;BA.debugLine="End Sub";
return "";
}
public static boolean  _isemail(String _emailaddress) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "isemail"))
	 {return ((Boolean) Debug.delegate(ba, "isemail", new Object[] {_emailaddress}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matchemail = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub IsEmail(EmailAddress As String) As Bool";
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
_matchemail = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matchemail = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$",_emailaddress);
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="If MatchEmail.Find = True Then";
if (_matchemail.Find()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="End Sub";
return false;
}
public static boolean  _isempty(String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "isempty"))
	 {return ((Boolean) Debug.delegate(ba, "isempty", new Object[] {_str}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Public Sub isEmpty(str As String) As Boolean";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="Return (str.Trim = \"\")";
if (true) return ((_str.trim()).equals(""));
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return false;
}
public static boolean  _isletter(String _c) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "isletter"))
	 {return ((Boolean) Debug.delegate(ba, "isletter", new Object[] {_c}));}
String _pattern = "";
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub IsLetter (c As String) As Boolean";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="Dim pattern As String = \"\\p{Alpha}\"";
_pattern = "\\p{Alpha}";
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
if (anywheresoftware.b4a.keywords.Common.IsDevTool("B4J")) { 
_pattern = "(?U)"+_pattern;};
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Return Regex.IsMatch(pattern, c)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_pattern,_c);
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="End Sub";
return false;
}
public static boolean  _isletters(String _text) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "isletters"))
	 {return ((Boolean) Debug.delegate(ba, "isletters", new Object[] {_text}));}
String _pattern = "";
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub IsLetters (text As String) As Boolean";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="Dim pattern As String = \"\\p{Alpha}+\"";
_pattern = "\\p{Alpha}+";
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
if (anywheresoftware.b4a.keywords.Common.IsDevTool("B4J")) { 
_pattern = "(?U)"+_pattern;};
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="Return Regex.IsMatch(pattern, text)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_pattern,_text);
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnull(Object _obj) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "isnull"))
	 {return ((Boolean) Debug.delegate(ba, "isnull", new Object[] {_obj}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub isNull(obj As Object) As Boolean";
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="Return (obj = Null)";
if (true) return (_obj== null);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return false;
}
public static boolean  _isurl(String _text) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "isurl"))
	 {return ((Boolean) Debug.delegate(ba, "isurl", new Object[] {_text}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub isUrl (text As String) As Boolean";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="text = text.Trim";
_text = _text.trim();
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Return text.StartsWith(\"http://\") Or text.StartsW";
if (true) return _text.startsWith("http://") || _text.startsWith("https://");
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="End Sub";
return false;
}
public static boolean  _isvalidip(String _ip) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "isvalidip"))
	 {return ((Boolean) Debug.delegate(ba, "isvalidip", new Object[] {_ip}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
int _i = 0;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub IsValidIp(ip As String) As Boolean";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="Dim m As Matcher";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="m = Regex.Matcher(\"^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$\",";
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$",_ip);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="If m.Find = False Then Return False";
if (_m.Find()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="For i = 1 To 4";
{
final int step4 = 1;
final int limit4 = (int) (4);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="If m.Group(i) > 255 Or m.Group(i) < 0 Then Retur";
if ((double)(Double.parseDouble(_m.Group(_i)))>255 || (double)(Double.parseDouble(_m.Group(_i)))<0) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
 }
};
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="End Sub";
return false;
}
public static String  _join(anywheresoftware.b4a.objects.collections.List _strlist,String _separator) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "join"))
	 {return ((String) Debug.delegate(ba, "join", new Object[] {_strlist,_separator}));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub join(StrList As List,separator As Strin";
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Return implode(separator, StrList)";
if (true) return _implode(_separator,_strlist);
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="End Sub";
return "";
}
public static String  _lcfirst(String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "lcfirst"))
	 {return ((String) Debug.delegate(ba, "lcfirst", new Object[] {_str}));}
String _firstchar = "";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub lcfirst(str As String) As String";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
RDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="firstChar= str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="firstChar = firstChar.ToLowerCase";
_firstchar = _firstchar.toLowerCase();
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="Return firstChar & str.SubString(1)";
if (true) return _firstchar+_str.substring((int) (1));
RDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="End Sub";
return "";
}
public static String  _prep_url(String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "prep_url"))
	 {return ((String) Debug.delegate(ba, "prep_url", new Object[] {_str}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub prep_url(str As String)  As String";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="str= str.Trim";
_str = _str.trim();
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="If isEmpty(str) Or str.EqualsIgnoreCase(\"http://\"";
if (_isempty(_str) || _str.equalsIgnoreCase("http://")) { 
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="Return  \"\"";
if (true) return "";
 }else {
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="If Not(str.StartsWith(\"http://\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_str.startsWith("http://"))) { 
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="Return \"http://\" & str";
if (true) return "http://"+_str;
 }else {
RDebugUtils.currentLine=2818064;
 //BA.debugLineNum = 2818064;BA.debugLine="Return str";
if (true) return _str;
 };
 };
RDebugUtils.currentLine=2818070;
 //BA.debugLineNum = 2818070;BA.debugLine="End Sub";
return "";
}
public static String  _quotes_to_entities(String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "quotes_to_entities"))
	 {return ((String) Debug.delegate(ba, "quotes_to_entities", new Object[] {_str}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub quotes_to_entities(str As String) As St";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="str = str.Replace(\"\\'\", \"&#39;\")";
_str = _str.replace("\\'","&#39;");
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="str = str.Replace(\"\\\"\"\",\"&quot;\")";
_str = _str.replace("\\\"","&quot;");
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="str = str.Replace(\"'\", \"&#39;\")";
_str = _str.replace("'","&#39;");
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="str = str.Replace(\"\"\"\",\"&quot;\")";
_str = _str.replace("\"","&quot;");
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="End Sub";
return "";
}
public static String  _reduce_double_slashes(String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "reduce_double_slashes"))
	 {return ((String) Debug.delegate(ba, "reduce_double_slashes", new Object[] {_str}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub reduce_double_slashes(str As String) As";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="If str.ToLowerCase.StartsWith(\"http://\") Then";
if (_str.toLowerCase().startsWith("http://")) { 
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
_str = _str.replace("//","/");
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="str =  str.Replace(\"http:/\" ,\"http://\")  'fix ba";
_str = _str.replace("http:/","http://");
 }else {
RDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
_str = _str.replace("//","/");
 };
RDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="End Sub";
return "";
}
public static String  _sprintf(String _fmt,Object[] _arg) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "sprintf"))
	 {return ((String) Debug.delegate(ba, "sprintf", new Object[] {_fmt,_arg}));}
int _ai = 0;
int _fi = 0;
int _i = 0;
int _exp = 0;
int _wid = 0;
String _stmp = "";
String _ptmp = "";
String _sres = "";
String _c = "";
String _t = "";
boolean _bdone = false;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub Sprintf(fmt As String, arg() As Object)";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim ai, fi, i As Int";
_ai = 0;
_fi = 0;
_i = 0;
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Dim exp, wid As Int";
_exp = 0;
_wid = 0;
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Dim stmp, ptmp, sres, c, t As String";
_stmp = "";
_ptmp = "";
_sres = "";
_c = "";
_t = "";
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Dim bdone As Boolean";
_bdone = false;
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="ai = 0";
_ai = (int) (0);
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="fi = 0";
_fi = (int) (0);
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="stmp = \"\"";
_stmp = "";
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="sres = \"\"";
_sres = "";
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="Do While (fi < fmt.Length)";
while ((_fi<_fmt.length())) {
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="c = fmt.CharAt(fi)";
_c = BA.ObjectToString(_fmt.charAt(_fi));
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="fi = fi + 1";
_fi = (int) (_fi+1);
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="If (c = \"%\") Then";
if (((_c).equals("%"))) { 
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="stmp = \"\"";
_stmp = "";
RDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="ptmp = \"\"";
_ptmp = "";
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="bdone = False";
_bdone = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="Do While ((fi < fmt.Length) And (bdone = False)";
while (((_fi<_fmt.length()) && (_bdone==anywheresoftware.b4a.keywords.Common.False))) {
RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="c = fmt.CharAt(fi)";
_c = BA.ObjectToString(_fmt.charAt(_fi));
RDebugUtils.currentLine=2883606;
 //BA.debugLineNum = 2883606;BA.debugLine="fi = fi + 1";
_fi = (int) (_fi+1);
RDebugUtils.currentLine=2883608;
 //BA.debugLineNum = 2883608;BA.debugLine="If ((IsNumber(c) = True) Or (c = \".\")) Then";
if (((anywheresoftware.b4a.keywords.Common.IsNumber(_c)==anywheresoftware.b4a.keywords.Common.True) || ((_c).equals(".")))) { 
RDebugUtils.currentLine=2883609;
 //BA.debugLineNum = 2883609;BA.debugLine="ptmp = ptmp & c";
_ptmp = _ptmp+_c;
RDebugUtils.currentLine=2883610;
 //BA.debugLineNum = 2883610;BA.debugLine="bdone = False";
_bdone = anywheresoftware.b4a.keywords.Common.False;
 }else 
{RDebugUtils.currentLine=2883611;
 //BA.debugLineNum = 2883611;BA.debugLine="Else If (c = \"s\") Then";
if (((_c).equals("s"))) { 
RDebugUtils.currentLine=2883612;
 //BA.debugLineNum = 2883612;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
RDebugUtils.currentLine=2883613;
 //BA.debugLineNum = 2883613;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
RDebugUtils.currentLine=2883614;
 //BA.debugLineNum = 2883614;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
RDebugUtils.currentLine=2883615;
 //BA.debugLineNum = 2883615;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else 
{RDebugUtils.currentLine=2883616;
 //BA.debugLineNum = 2883616;BA.debugLine="Else If (c = \"d\") Then";
if (((_c).equals("d"))) { 
RDebugUtils.currentLine=2883617;
 //BA.debugLineNum = 2883617;BA.debugLine="If (ptmp.Length > 0) Then";
if ((_ptmp.length()>0)) { 
RDebugUtils.currentLine=2883618;
 //BA.debugLineNum = 2883618;BA.debugLine="t = \" \"";
_t = " ";
RDebugUtils.currentLine=2883619;
 //BA.debugLineNum = 2883619;BA.debugLine="If (ptmp.CharAt(0) = \"0\") Then";
if ((_ptmp.charAt((int) (0))==BA.ObjectToChar("0"))) { 
RDebugUtils.currentLine=2883620;
 //BA.debugLineNum = 2883620;BA.debugLine="t = \"0\"";
_t = "0";
RDebugUtils.currentLine=2883621;
 //BA.debugLineNum = 2883621;BA.debugLine="ptmp = ptmp.SubString(1)";
_ptmp = _ptmp.substring((int) (1));
 };
 };
RDebugUtils.currentLine=2883625;
 //BA.debugLineNum = 2883625;BA.debugLine="If (ptmp.Length > 0) Then wid = ptmp Else wid";
if ((_ptmp.length()>0)) { 
_wid = (int)(Double.parseDouble(_ptmp));}
else {
_wid = (int) (0);};
RDebugUtils.currentLine=2883627;
 //BA.debugLineNum = 2883627;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
RDebugUtils.currentLine=2883629;
 //BA.debugLineNum = 2883629;BA.debugLine="Do While (stmp.Length < wid)";
while ((_stmp.length()<_wid)) {
RDebugUtils.currentLine=2883630;
 //BA.debugLineNum = 2883630;BA.debugLine="stmp = t & stmp";
_stmp = _t+_stmp;
 }
;
RDebugUtils.currentLine=2883633;
 //BA.debugLineNum = 2883633;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
RDebugUtils.currentLine=2883634;
 //BA.debugLineNum = 2883634;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
RDebugUtils.currentLine=2883635;
 //BA.debugLineNum = 2883635;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else 
{RDebugUtils.currentLine=2883636;
 //BA.debugLineNum = 2883636;BA.debugLine="Else If (c = \"f\") Then";
if (((_c).equals("f"))) { 
RDebugUtils.currentLine=2883637;
 //BA.debugLineNum = 2883637;BA.debugLine="If (ptmp.Length > 0) Then";
if ((_ptmp.length()>0)) { 
RDebugUtils.currentLine=2883638;
 //BA.debugLineNum = 2883638;BA.debugLine="i = ptmp.IndexOf(\".\")";
_i = _ptmp.indexOf(".");
RDebugUtils.currentLine=2883639;
 //BA.debugLineNum = 2883639;BA.debugLine="If (i >= 0) Then";
if ((_i>=0)) { 
RDebugUtils.currentLine=2883640;
 //BA.debugLineNum = 2883640;BA.debugLine="wid = ptmp.SubString2(0, i)";
_wid = (int)(Double.parseDouble(_ptmp.substring((int) (0),_i)));
RDebugUtils.currentLine=2883641;
 //BA.debugLineNum = 2883641;BA.debugLine="exp = ptmp.SubString(i+1)";
_exp = (int)(Double.parseDouble(_ptmp.substring((int) (_i+1))));
 }else {
RDebugUtils.currentLine=2883643;
 //BA.debugLineNum = 2883643;BA.debugLine="wid = ptmp";
_wid = (int)(Double.parseDouble(_ptmp));
RDebugUtils.currentLine=2883644;
 //BA.debugLineNum = 2883644;BA.debugLine="exp = 0";
_exp = (int) (0);
 };
RDebugUtils.currentLine=2883647;
 //BA.debugLineNum = 2883647;BA.debugLine="stmp = NumberFormat(arg(ai), wid, exp)";
_stmp = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_arg[_ai])),_wid,_exp);
 }else {
RDebugUtils.currentLine=2883649;
 //BA.debugLineNum = 2883649;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
 };
RDebugUtils.currentLine=2883652;
 //BA.debugLineNum = 2883652;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
RDebugUtils.currentLine=2883653;
 //BA.debugLineNum = 2883653;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
RDebugUtils.currentLine=2883654;
 //BA.debugLineNum = 2883654;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=2883656;
 //BA.debugLineNum = 2883656;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 }}}}
;
 }
;
 }else {
RDebugUtils.currentLine=2883661;
 //BA.debugLineNum = 2883661;BA.debugLine="sres = sres & c";
_sres = _sres+_c;
 };
 }
;
RDebugUtils.currentLine=2883665;
 //BA.debugLineNum = 2883665;BA.debugLine="Return(sres)";
if (true) return (_sres);
RDebugUtils.currentLine=2883667;
 //BA.debugLineNum = 2883667;BA.debugLine="End Sub";
return "";
}
public static String  _str_repeat(String _input,int _multiplier) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "str_repeat"))
	 {return ((String) Debug.delegate(ba, "str_repeat", new Object[] {_input,_multiplier}));}
String _result = "";
int _i = 0;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub str_repeat(input As String, multiplier As Int)";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If multiplier < 1 Then";
if (_multiplier<1) { 
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="Return \"\"";
if (true) return "";
 }else {
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Dim result As String = \"\"";
_result = "";
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="For i = 0 To multiplier - 1";
{
final int step5 = 1;
final int limit5 = (int) (_multiplier-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="result = result & input";
_result = _result+_input;
 }
};
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=3145748;
 //BA.debugLineNum = 3145748;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _str_split(String _str,int _splitlength) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "str_split"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "str_split", new Object[] {_str,_splitlength}));}
anywheresoftware.b4a.objects.collections.List _chunks = null;
int _divval = 0;
int _i = 0;
int _nextval = 0;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub str_split (str As String, splitLength A";
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Dim chunks As List";
_chunks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="chunks.Initialize";
_chunks.Initialize();
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="If (isEmpty(str) Or splitLength < 1)  Then";
if ((_isempty(_str) || _splitlength<1)) { 
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Return chunks 'empty list";
if (true) return _chunks;
 }else 
{RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="Else If  splitLength = str.Length Then";
if (_splitlength==_str.length()) { 
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="chunks.Add(str)";
_chunks.Add((Object)(_str));
RDebugUtils.currentLine=3407884;
 //BA.debugLineNum = 3407884;BA.debugLine="Return chunks";
if (true) return _chunks;
 }}
;
RDebugUtils.currentLine=3407888;
 //BA.debugLineNum = 3407888;BA.debugLine="Dim DivVal As Int  =  str.Length / splitLength";
_divval = (int) (_str.length()/(double)_splitlength);
RDebugUtils.currentLine=3407890;
 //BA.debugLineNum = 3407890;BA.debugLine="For i = 0 To DivVal";
{
final int step10 = 1;
final int limit10 = _divval;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=3407892;
 //BA.debugLineNum = 3407892;BA.debugLine="Dim nextVal As Int = i * splitLength";
_nextval = (int) (_i*_splitlength);
RDebugUtils.currentLine=3407894;
 //BA.debugLineNum = 3407894;BA.debugLine="If i = DivVal Then";
if (_i==_divval) { 
RDebugUtils.currentLine=3407897;
 //BA.debugLineNum = 3407897;BA.debugLine="chunks.add( str.SubString( nextVal))";
_chunks.Add((Object)(_str.substring(_nextval)));
 }else {
RDebugUtils.currentLine=3407902;
 //BA.debugLineNum = 3407902;BA.debugLine="chunks.add( str.SubString2( nextVal , nextVal +";
_chunks.Add((Object)(_str.substring(_nextval,(int) (_nextval+_splitlength))));
 };
 }
};
RDebugUtils.currentLine=3407908;
 //BA.debugLineNum = 3407908;BA.debugLine="Return chunks";
if (true) return _chunks;
RDebugUtils.currentLine=3407910;
 //BA.debugLineNum = 3407910;BA.debugLine="End Sub";
return null;
}
public static String  _string2ascii(String _text) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "string2ascii"))
	 {return ((String) Debug.delegate(ba, "string2ascii", new Object[] {_text}));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub String2Ascii(text As String) As String";
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Return String2AsciiWithSeperator(text, \"\")";
if (true) return _string2asciiwithseperator(_text,"");
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="End Sub";
return "";
}
public static String  _string2asciiwithseperator(String _text,String _seperator) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "string2asciiwithseperator"))
	 {return ((String) Debug.delegate(ba, "string2asciiwithseperator", new Object[] {_text,_seperator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _result = null;
int _i = 0;
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub String2AsciiWithSeperator(text As Strin";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Dim result As StringBuilder";
_result = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="For i = 0 To text.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_text.length()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="result.Append(Asc(text.CharAt(i)) & seperator)";
_result.Append(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Asc(_text.charAt(_i)))+_seperator);
 }
};
RDebugUtils.currentLine=3014667;
 //BA.debugLineNum = 3014667;BA.debugLine="Return result.ToString.Trim";
if (true) return _result.ToString().trim();
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="End Sub";
return "";
}
public static String  _strip_quotes(String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "strip_quotes"))
	 {return ((String) Debug.delegate(ba, "strip_quotes", new Object[] {_str}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub strip_quotes(str As String) As String";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="str = str.Replace(\"'\", \"\")";
_str = _str.replace("'","");
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="str = str.Replace(\"\"\"\",\"\")";
_str = _str.replace("\"","");
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="End Sub";
return "";
}
public static Object  _strpbrk(String _haystack,String _charlist) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "strpbrk"))
	 {return ((Object) Debug.delegate(ba, "strpbrk", new Object[] {_haystack,_charlist}));}
int _i = 0;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub strpbrk(haystack As String, charList As";
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="For i = 0 To haystack.Length - 1";
{
final int step1 = 1;
final int limit1 = (int) (_haystack.length()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="If charList.IndexOf(haystack.CharAt(i)) >= 0 Th";
if (_charlist.indexOf(BA.ObjectToString(_haystack.charAt(_i)))>=0) { 
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="Return haystack.SubString(i)";
if (true) return (Object)(_haystack.substring(_i));
 };
 }
};
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="Return False";
if (true) return (Object)(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _strtostrlist(String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "strtostrlist"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "strtostrlist", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _result = null;
int _i = 0;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub strToStrList(str As String) As List";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="For i = 0 To str.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_str.length()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="result.Add(str.CharAt(i))";
_result.Add((Object)(_str.charAt(_i)));
 }
};
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=3342349;
 //BA.debugLineNum = 3342349;BA.debugLine="End Sub";
return null;
}
public static String  _trim_left_once(String _str,String _character) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "trim_left_once"))
	 {return ((String) Debug.delegate(ba, "trim_left_once", new Object[] {_str,_character}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub trim_left_once(str As String, character";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="If isEmpty(character) Then";
if (_isempty(_character)) { 
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="character = \" \" 'empty space";
_character = " ";
 };
RDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="If str.StartsWith(character) Then";
if (_str.startsWith(_character)) { 
RDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="str = str.SubString(1)";
_str = _str.substring((int) (1));
 };
RDebugUtils.currentLine=1376270;
 //BA.debugLineNum = 1376270;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=1376272;
 //BA.debugLineNum = 1376272;BA.debugLine="End Sub";
return "";
}
public static String  _trim_right_once(String _str,String _character) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "trim_right_once"))
	 {return ((String) Debug.delegate(ba, "trim_right_once", new Object[] {_str,_character}));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub trim_right_once(str As String, characte";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="If isEmpty(character) Then";
if (_isempty(_character)) { 
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="character = \" \" 'empty space";
_character = " ";
 };
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="If str.EndsWith(character) Then";
if (_str.endsWith(_character)) { 
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="str = str.SubString2(0, str.Length - 1)";
_str = _str.substring((int) (0),(int) (_str.length()-1));
 };
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="End Sub";
return "";
}
public static String  _trim_slashes_once(String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "trim_slashes_once"))
	 {return ((String) Debug.delegate(ba, "trim_slashes_once", new Object[] {_str}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub trim_slashes_once(str As String) As Str";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Return trim_once( str, \"/\")";
if (true) return _trim_once(_str,"/");
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="End Sub";
return "";
}
public static String  _underscore(String _str) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "underscore"))
	 {return ((String) Debug.delegate(ba, "underscore", new Object[] {_str}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub underscore(str As String)  As String";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="str= str.ToLowerCase";
_str = _str.toLowerCase();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Return str.Replace(\" \",  \"_\")";
if (true) return _str.replace(" ","_");
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="End Sub";
return "";
}
public static String  _word_wrap(String _str,int _limit) throws Exception{
RDebugUtils.currentModule="stringutility";
if (Debug.shouldDelegate(ba, "word_wrap"))
	 {return ((String) Debug.delegate(ba, "word_wrap", new Object[] {_str,_limit}));}
int _divval = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _stringbuild = null;
int _i = 0;
int _nextval = 0;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub word_wrap(str As String, limit As Int) As Stri";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="str = str.Trim";
_str = _str.trim();
RDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="If str.Length = limit Then";
if (_str.length()==_limit) { 
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="Return str";
if (true) return _str;
 }else {
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="Dim DivVal As Int";
_divval = 0;
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="Dim stringBuild As StringBuilder";
_stringbuild = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="stringBuild.Initialize";
_stringbuild.Initialize();
RDebugUtils.currentLine=2949135;
 //BA.debugLineNum = 2949135;BA.debugLine="DivVal =  str.Length / limit";
_divval = (int) (_str.length()/(double)_limit);
RDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="For i = 0 To DivVal";
{
final int step9 = 1;
final int limit9 = _divval;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=2949139;
 //BA.debugLineNum = 2949139;BA.debugLine="Dim nextVal As Int = i * limit";
_nextval = (int) (_i*_limit);
RDebugUtils.currentLine=2949141;
 //BA.debugLineNum = 2949141;BA.debugLine="If i = DivVal Then";
if (_i==_divval) { 
RDebugUtils.currentLine=2949144;
 //BA.debugLineNum = 2949144;BA.debugLine="stringBuild.Append( str.SubString( nextVal).Tr";
_stringbuild.Append(_str.substring(_nextval).trim());
 }else {
RDebugUtils.currentLine=2949149;
 //BA.debugLineNum = 2949149;BA.debugLine="stringBuild.Append( str.SubString2( nextVal ,";
_stringbuild.Append(_str.substring(_nextval,(int) (_nextval+_limit)).trim());
RDebugUtils.currentLine=2949150;
 //BA.debugLineNum = 2949150;BA.debugLine="stringBuild.Append( CRLF)";
_stringbuild.Append(anywheresoftware.b4a.keywords.Common.CRLF);
 };
 }
};
RDebugUtils.currentLine=2949156;
 //BA.debugLineNum = 2949156;BA.debugLine="Return stringBuild.ToString";
if (true) return _stringbuild.ToString();
 };
RDebugUtils.currentLine=2949160;
 //BA.debugLineNum = 2949160;BA.debugLine="End Sub";
return "";
}
}