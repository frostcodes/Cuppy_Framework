package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cfstringutility extends Object{
public static cfstringutility mostCurrent = new cfstringutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfstringutility", null);
		ba.loadHtSubs(cfstringutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cfstringutility", ba);
		}
	}
    public static Class<?> getObject() {
		return cfstringutility.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static Object  _breakstrat(String _haystack,String _after) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "breakstrat"))
	 {return ((Object) Debug.delegate(ba, "breakstrat", new Object[] {_haystack,_after}));}
String _found = "";
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub BreakStrAt(haystack As String, after As";
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Dim found As String = \"\"";
_found = "";
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="found= haystack.IndexOf(after)";
_found = BA.NumberToString(_haystack.indexOf(_after));
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="If found = -1 Then";
if ((_found).equals(BA.NumberToString(-1))) { 
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="Return False";
if (true) return (Object)(anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="Return haystack.SubString(found)";
if (true) return (Object)(_haystack.substring((int)(Double.parseDouble(_found))));
 };
RDebugUtils.currentLine=4653072;
 //BA.debugLineNum = 4653072;BA.debugLine="End Sub";
return null;
}
public static String  _camelize(String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "camelize"))
	 {return ((String) Debug.delegate(ba, "camelize", new Object[] {_str}));}
String _firstchar = "";
String _result = "";
String _txt = "";
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub Camelize(str As String)  As String";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim firstChar, result As String =\"\"";
_firstchar = "";
_result = "";
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="str= str.Replace(\" \", \"_\") 'make all spaces _";
_str = _str.replace(" ","_");
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="firstChar = str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="firstChar = firstChar.ToLowerCase";
_firstchar = _firstchar.toLowerCase();
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="For Each txt As String In Explode(\"_\", str)";
{
final anywheresoftware.b4a.BA.IterableList group5 = _explode("_",_str);
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_txt = BA.ObjectToString(group5.Get(index5));
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="result = result & Ucfirst(txt)";
_result = _result+_ucfirst(_txt);
 }
};
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="Return firstChar & result.SubString(1)";
if (true) return _firstchar+_result.substring((int) (1));
RDebugUtils.currentLine=4063246;
 //BA.debugLineNum = 4063246;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _explode(String _delimiter,String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "explode"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "explode", new Object[] {_delimiter,_str}));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Public Sub Explode(delimiter As String ,  str As S";
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Return Split(str, delimiter)";
if (true) return _split(_str,_delimiter);
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="End Sub";
return null;
}
public static String  _ucfirst(String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "ucfirst"))
	 {return ((String) Debug.delegate(ba, "ucfirst", new Object[] {_str}));}
String _firstchar = "";
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub Ucfirst(str As String) As String";
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="str = str.ToLowerCase";
_str = _str.toLowerCase();
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="firstChar= str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="firstChar = firstChar.ToUpperCase";
_firstchar = _firstchar.toUpperCase();
RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="Return firstChar & str.SubString(1)";
if (true) return _firstchar+_str.substring((int) (1));
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="End Sub";
return "";
}
public static boolean  _containurl(String _text) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "containurl"))
	 {return ((Boolean) Debug.delegate(ba, "containurl", new Object[] {_text}));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Public Sub ContainUrl(text As String) As Boolean";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="text = text.Trim";
_text = _text.trim();
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Return text.Contains(\"http://\") Or text.Contains(";
if (true) return _text.contains("http://") || _text.contains("https://");
RDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="End Sub";
return false;
}
public static String  _dateordinal(int _date) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "dateordinal"))
	 {return ((String) Debug.delegate(ba, "dateordinal", new Object[] {_date}));}
String[] _sufixes = null;
String _ival = "";
int _val = 0;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Public Sub DateOrdinal(date As Int) As String";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Dim sufixes() As String = Array As String(\"th\", \"";
_sufixes = new String[]{"th","st","nd","rd","th","th","th","th","th","th"};
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="Dim iVal As String = date";
_ival = BA.NumberToString(_date);
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="Dim val As Int =  (date Mod 100)";
_val = (int) ((_date%100));
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="If val = 11 Or val =  12 Or val = 13 Then";
if (_val==11 || _val==12 || _val==13) { 
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="Return iVal & \"th\"";
if (true) return _ival+"th";
 }else {
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="Return iVal & sufixes(date Mod 10)";
if (true) return _ival+_sufixes[(int) (_date%10)];
 };
RDebugUtils.currentLine=5701647;
 //BA.debugLineNum = 5701647;BA.debugLine="End Sub";
return "";
}
public static String  _escapestring(String _value) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "escapestring"))
	 {return ((String) Debug.delegate(ba, "escapestring", new Object[] {_value}));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub EscapeString(value As String) As String";
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Return \"\\\" & value";
if (true) return "\\"+_value;
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _split(String _str,String _delimiter) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "split"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "split", new Object[] {_str,_delimiter}));}
anywheresoftware.b4a.objects.collections.List _t = null;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub Split(str As String, delimiter As String) As L";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim t As List";
_t = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="t = Regex.Split(EscapeString(delimiter), str)";
_t = anywheresoftware.b4a.keywords.Common.ArrayToList(anywheresoftware.b4a.keywords.Common.Regex.Split(_escapestring(_delimiter),_str));
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Return t";
if (true) return _t;
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="End Sub";
return null;
}
public static int  _generatepincode(int _pinlength) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "generatepincode"))
	 {return ((Integer) Debug.delegate(ba, "generatepincode", new Object[] {_pinlength}));}
String _result = "";
String[] _randomarray = null;
int _i = 0;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Public Sub GeneratePinCode(PinLength As Int) As In";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Dim result As String =\"\"";
_result = "";
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="Dim RandomArray() As String = Array As String(1,2";
_randomarray = new String[]{BA.NumberToString(1),BA.NumberToString(2),BA.NumberToString(3),BA.NumberToString(4),BA.NumberToString(5),BA.NumberToString(6),BA.NumberToString(7),BA.NumberToString(8),BA.NumberToString(9),BA.NumberToString(0)};
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="For i = 0 To PinLength - 1";
{
final int step3 = 1;
final int limit3 = (int) (_pinlength-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="result = result &  RandomArray( Rnd( 0, Rnd(2, R";
_result = _result+_randomarray[anywheresoftware.b4a.keywords.Common.Rnd((int) (0),anywheresoftware.b4a.keywords.Common.Rnd((int) (2),(int) (_randomarray.length-1)))];
 }
};
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="Return  result";
if (true) return (int)(Double.parseDouble(_result));
RDebugUtils.currentLine=3342349;
 //BA.debugLineNum = 3342349;BA.debugLine="End Sub";
return 0;
}
public static String  _generaterandomstring(int _strlength) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "generaterandomstring"))
	 {return ((String) Debug.delegate(ba, "generaterandomstring", new Object[] {_strlength}));}
String _rndstring = "";
int _rndnumber = 0;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Public Sub GenerateRandomString(StrLength As Int)";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim RndString As String";
_rndstring = "";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim RndNumber As Int";
_rndnumber = 0;
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="Do While RndString.Length < StrLength";
while (_rndstring.length()<_strlength) {
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="RndNumber = Rnd(48,123) 'Yep, 123, because the l";
_rndnumber = anywheresoftware.b4a.keywords.Common.Rnd((int) (48),(int) (123));
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="If (RndNumber >= 48 And RndNumber <= 57) Or (Rnd";
if ((_rndnumber>=48 && _rndnumber<=57) || (_rndnumber>=65 && _rndnumber<=90) || (_rndnumber>=97 && _rndnumber<=112)) { 
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="RndString = RndString & Chr(RndNumber)";
_rndstring = _rndstring+BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(_rndnumber));
 };
 }
;
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="Return RndString";
if (true) return _rndstring;
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="End Sub";
return "";
}
public static String  _generaterandomstring2(int _strlength) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "generaterandomstring2"))
	 {return ((String) Debug.delegate(ba, "generaterandomstring2", new Object[] {_strlength}));}
String[] _randomarray = null;
String _result = "";
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Public Sub GenerateRandomString2(StrLength As Int)";
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Dim RandomArray() As String = Array As String(\"!\"";
_randomarray = new String[]{"!","@","#","$","%"};
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Dim result As String";
_result = "";
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="result =  StringArray2String(ShuffleArray(RandomA";
_result = _stringarray2string(_shufflearray(_randomarray));
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="result = result  & GenerateRandomString( Floor( S";
_result = _result+_generaterandomstring((int) (anywheresoftware.b4a.keywords.Common.Floor(_strlength/(double)2)));
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="result = result  & StringArray2String(ShuffleArra";
_result = _result+_stringarray2string(_shufflearray(_randomarray));
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="result = result  & GenerateRandomString( Floor( S";
_result = _result+_generaterandomstring((int) (anywheresoftware.b4a.keywords.Common.Floor(_strlength/(double)2)));
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="Return  result.SubString2( result.Length - StrLen";
if (true) return _result.substring((int) (_result.length()-_strlength),_result.length());
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="End Sub";
return "";
}
public static String  _stringarray2string(String[] _strarray) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "stringarray2string"))
	 {return ((String) Debug.delegate(ba, "stringarray2string", new Object[] {_strarray}));}
String _result = "";
String _str = "";
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Public Sub StringArray2String(StrArray() As String";
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Dim result As String =\"\"";
_result = "";
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="For Each str As String In StrArray 'an array";
{
final String[] group2 = _strarray;
final int groupLen2 = group2.length
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = group2[index2];
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="result = result & str";
_result = _result+_str;
 }
};
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="End Sub";
return "";
}
public static String[]  _shufflearray(String[] _stringarray) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "shufflearray"))
	 {return ((String[]) Debug.delegate(ba, "shufflearray", new Object[] {_stringarray}));}
String _arrayval = "";
int _random = 0;
int _i = 0;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Public Sub ShuffleArray(StringArray() As String) A";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Dim ArrayVal As String";
_arrayval = "";
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Dim Random As Int";
_random = 0;
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="For i = 0 To StringArray.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_stringarray.length-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="Random = Rnd(i, StringArray.Length)";
_random = anywheresoftware.b4a.keywords.Common.Rnd(_i,_stringarray.length);
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="ArrayVal = StringArray(i)";
_arrayval = _stringarray[_i];
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="StringArray(i) = StringArray(Random)";
_stringarray[_i] = _stringarray[_random];
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="StringArray(Random) = ArrayVal";
_stringarray[_random] = _arrayval;
 }
};
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="Return StringArray";
if (true) return _stringarray;
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="End Sub";
return null;
}
public static String  _humanize(String _str,String _separator) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "humanize"))
	 {return ((String) Debug.delegate(ba, "humanize", new Object[] {_str,_separator}));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub Humanize(str As String, separator As St";
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="str= str.ToLowerCase";
_str = _str.toLowerCase();
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="Return Ucwords(str.Replace(separator, \" \"))";
if (true) return _ucwords(_str.replace(_separator," "));
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="End Sub";
return "";
}
public static String  _ucwords(String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "ucwords"))
	 {return ((String) Debug.delegate(ba, "ucwords", new Object[] {_str}));}
String _result = "";
String _txt = "";
String _firstchar = "";
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub Ucwords(str As String) As String";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="Dim result As String =\"\"";
_result = "";
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="For Each txt As String In Explode(\" \", str.ToLowe";
{
final anywheresoftware.b4a.BA.IterableList group2 = _explode(" ",_str.toLowerCase());
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_txt = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="firstChar= txt.CharAt(0)";
_firstchar = BA.ObjectToString(_txt.charAt((int) (0)));
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="firstChar = firstChar.ToUpperCase";
_firstchar = _firstchar.toUpperCase();
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="result = result & firstChar & txt.SubString(1) &";
_result = _result+_firstchar+_txt.substring((int) (1))+" ";
 }
};
RDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=3866639;
 //BA.debugLineNum = 3866639;BA.debugLine="End Sub";
return "";
}
public static String  _implode(String _separator,anywheresoftware.b4a.objects.collections.List _strlist) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "implode"))
	 {return ((String) Debug.delegate(ba, "implode", new Object[] {_separator,_strlist}));}
String _result = "";
String _str = "";
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Public Sub Implode(separator As String, StrList As";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim result As String =\"\"";
_result = "";
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="For Each str As String In StrList 'an array";
{
final anywheresoftware.b4a.BA.IterableList group2 = _strlist;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_str = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="result = result & str & separator";
_result = _result+_str+_separator;
 }
};
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="Return Trim_Once(result, separator) ' trim separa";
if (true) return _trim_once(_result,_separator);
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="End Sub";
return "";
}
public static String  _trim_once(String _str,String _character) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "trim_once"))
	 {return ((String) Debug.delegate(ba, "trim_once", new Object[] {_str,_character}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Public Sub Trim_Once(str As String, character As S";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="str = Trim_Left_Once(str, character)";
_str = _trim_left_once(_str,_character);
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="str = Trim_Right_Once(str, character)";
_str = _trim_right_once(_str,_character);
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="End Sub";
return "";
}
public static String  _increment_string(String _str,String _separator,int _first) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "increment_string"))
	 {return ((String) Debug.delegate(ba, "increment_string", new Object[] {_str,_separator,_first}));}
String _parsed_str = "";
String _foundint = "";
int _indexofseperator = 0;
long _foundlong = 0L;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Public Sub Increment_String(str As String, separat";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="Dim parsed_str, foundInt As String =\"\"";
_parsed_str = "";
_foundint = "";
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Dim IndexOfSeperator  As Int = 0";
_indexofseperator = (int) (0);
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="IndexOfSeperator = str.LastIndexOf(separator)  'f";
_indexofseperator = _str.lastIndexOf(_separator);
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="If  IndexOfSeperator <> 0 Then";
if (_indexofseperator!=0) { 
RDebugUtils.currentLine=3473418;
 //BA.debugLineNum = 3473418;BA.debugLine="foundInt = str.SubString((IndexOfSeperator +1) )";
_foundint = _str.substring((int) ((_indexofseperator+1)));
RDebugUtils.currentLine=3473422;
 //BA.debugLineNum = 3473422;BA.debugLine="If IsNumber(foundInt) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(_foundint)) { 
RDebugUtils.currentLine=3473424;
 //BA.debugLineNum = 3473424;BA.debugLine="parsed_str = str.SubString2(0 , IndexOfSeperato";
_parsed_str = _str.substring((int) (0),_indexofseperator);
RDebugUtils.currentLine=3473429;
 //BA.debugLineNum = 3473429;BA.debugLine="Dim foundLong As Long = (foundInt + 1)";
_foundlong = (long) (((double)(Double.parseDouble(_foundint))+1));
RDebugUtils.currentLine=3473431;
 //BA.debugLineNum = 3473431;BA.debugLine="Return parsed_str & separator & foundLong";
if (true) return _parsed_str+_separator+BA.NumberToString(_foundlong);
 }else {
RDebugUtils.currentLine=3473436;
 //BA.debugLineNum = 3473436;BA.debugLine="Return str & separator & first";
if (true) return _str+_separator+BA.NumberToString(_first);
 };
 }else {
RDebugUtils.currentLine=3473443;
 //BA.debugLineNum = 3473443;BA.debugLine="Return str & separator & first";
if (true) return _str+_separator+BA.NumberToString(_first);
 };
RDebugUtils.currentLine=3473447;
 //BA.debugLineNum = 3473447;BA.debugLine="End Sub";
return "";
}
public static boolean  _isemail(String _emailaddress) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "isemail"))
	 {return ((Boolean) Debug.delegate(ba, "isemail", new Object[] {_emailaddress}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _matchemail = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub IsEmail(EmailAddress As String) As Bool";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="Dim MatchEmail As Matcher = Regex.Matcher(\"^(?i)[";
_matchemail = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_matchemail = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(?i)[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])$",_emailaddress);
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="If MatchEmail.Find = True Then";
if (_matchemail.Find()==anywheresoftware.b4a.keywords.Common.True) { 
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="End Sub";
return false;
}
public static boolean  _isempty(String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "isempty"))
	 {return ((Boolean) Debug.delegate(ba, "isempty", new Object[] {_str}));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub IsEmpty(str As String) As Boolean";
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Return (str.Trim = \"\")";
if (true) return ((_str.trim()).equals(""));
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="End Sub";
return false;
}
public static boolean  _isletter(String _c) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "isletter"))
	 {return ((Boolean) Debug.delegate(ba, "isletter", new Object[] {_c}));}
String _pattern = "";
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Public Sub IsLetter (c As String) As Boolean";
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Dim pattern As String = \"\\p{Alpha}\"";
_pattern = "\\p{Alpha}";
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
if (anywheresoftware.b4a.keywords.Common.IsDevTool("B4J")) { 
_pattern = "(?U)"+_pattern;};
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Return Regex.IsMatch(pattern, c)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_pattern,_c);
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="End Sub";
return false;
}
public static boolean  _isletters(String _text) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "isletters"))
	 {return ((Boolean) Debug.delegate(ba, "isletters", new Object[] {_text}));}
String _pattern = "";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Public Sub IsLetters (text As String) As Boolean";
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="Dim pattern As String = \"\\p{Alpha}+\"";
_pattern = "\\p{Alpha}+";
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="If IsDevTool(\"B4J\") Then pattern = \"(?U)\" & patte";
if (anywheresoftware.b4a.keywords.Common.IsDevTool("B4J")) { 
_pattern = "(?U)"+_pattern;};
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="Return Regex.IsMatch(pattern, text)";
if (true) return anywheresoftware.b4a.keywords.Common.Regex.IsMatch(_pattern,_text);
RDebugUtils.currentLine=2424839;
 //BA.debugLineNum = 2424839;BA.debugLine="End Sub";
return false;
}
public static boolean  _isnull(Object _obj) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "isnull"))
	 {return ((Boolean) Debug.delegate(ba, "isnull", new Object[] {_obj}));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub IsNull(obj As Object) As Boolean";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Return (obj = Null)";
if (true) return (_obj== null);
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="End Sub";
return false;
}
public static boolean  _isurl(String _text) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "isurl"))
	 {return ((Boolean) Debug.delegate(ba, "isurl", new Object[] {_text}));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Public Sub IsUrl (text As String) As Boolean";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="text = text.Trim";
_text = _text.trim();
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Return text.StartsWith(\"http://\") Or text.StartsW";
if (true) return _text.startsWith("http://") || _text.startsWith("https://");
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="End Sub";
return false;
}
public static boolean  _isvalidip(String _ip) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "isvalidip"))
	 {return ((Boolean) Debug.delegate(ba, "isvalidip", new Object[] {_ip}));}
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
int _i = 0;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub IsValidIp(ip As String) As Boolean";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Dim m As Matcher";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="m = Regex.Matcher(\"^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$\",";
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher("^(\\d+)\\.(\\d+)\\.(\\d+)\\.(\\d+)$",_ip);
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="If m.Find = False Then Return False";
if (_m.Find()==anywheresoftware.b4a.keywords.Common.False) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="For i = 1 To 4";
{
final int step4 = 1;
final int limit4 = (int) (4);
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="If m.Group(i) > 255 Or m.Group(i) < 0 Then Retur";
if ((double)(Double.parseDouble(_m.Group(_i)))>255 || (double)(Double.parseDouble(_m.Group(_i)))<0) { 
if (true) return anywheresoftware.b4a.keywords.Common.False;};
 }
};
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="End Sub";
return false;
}
public static String  _join(anywheresoftware.b4a.objects.collections.List _strlist,String _separator) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "join"))
	 {return ((String) Debug.delegate(ba, "join", new Object[] {_strlist,_separator}));}
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Public Sub Join(StrList As List,separator As Strin";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Return Implode(separator, StrList)";
if (true) return _implode(_separator,_strlist);
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="End Sub";
return "";
}
public static String  _lcfirst(String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "lcfirst"))
	 {return ((String) Debug.delegate(ba, "lcfirst", new Object[] {_str}));}
String _firstchar = "";
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub Lcfirst(str As String) As String";
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Dim firstChar As String =\"\"";
_firstchar = "";
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="firstChar= str.CharAt(0)";
_firstchar = BA.ObjectToString(_str.charAt((int) (0)));
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="firstChar = firstChar.ToLowerCase";
_firstchar = _firstchar.toLowerCase();
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="Return firstChar & str.SubString(1)";
if (true) return _firstchar+_str.substring((int) (1));
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="End Sub";
return "";
}
public static String  _nicelyformatteddate() throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "nicelyformatteddate"))
	 {return ((String) Debug.delegate(ba, "nicelyformatteddate", null));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub NicelyFormattedDate As String";
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="DateTime.DateFormat = \"MMMM '\" & DateOrdinal(Date";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("MMMM '"+_dateordinal(anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow()))+"', yyyy");
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="Return DateTime.Date(DateTime.Now)";
if (true) return anywheresoftware.b4a.keywords.Common.DateTime.Date(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
RDebugUtils.currentLine=5767173;
 //BA.debugLineNum = 5767173;BA.debugLine="End Sub";
return "";
}
public static String  _nl2br(String _text) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "nl2br"))
	 {return ((String) Debug.delegate(ba, "nl2br", new Object[] {_text}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Public Sub Nl2Br(text As String) As String";
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="Return text.Replace(CRLF, \"<br>\")";
if (true) return _text.replace(anywheresoftware.b4a.keywords.Common.CRLF,"<br>");
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.Map  _parsequerystring(String _querystring) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "parsequerystring"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "parsequerystring", new Object[] {_querystring}));}
anywheresoftware.b4a.objects.collections.Map _data = null;
anywheresoftware.b4a.objects.collections.List _temp_list = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.List _querylist = null;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub ParseQueryString(QueryString As String)";
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Dim Data As Map 'total data";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Data.Initialize";
_data.Initialize();
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="Try";
try {RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="Dim temp_list As List = Split(QueryString, \"&\")";
_temp_list = new anywheresoftware.b4a.objects.collections.List();
_temp_list = _split(_querystring,"&");
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="For i = 0 To temp_list.Size - 1";
{
final int step5 = 1;
final int limit5 = (int) (_temp_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="Dim QueryList As List = Split(temp_list.Get(i)";
_querylist = new anywheresoftware.b4a.objects.collections.List();
_querylist = _split(BA.ObjectToString(_temp_list.Get(_i)),"=");
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="If Not(Data.ContainsKey(QueryList.Get(0))) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_data.ContainsKey(_querylist.Get((int) (0))))) { 
RDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="Data.Put(QueryList.Get(0), QueryList.Get(1))";
_data.Put(_querylist.Get((int) (0)),_querylist.Get((int) (1)));
 };
 }
};
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=5505048;
 //BA.debugLineNum = 5505048;BA.debugLine="LogError(\"The parser for < parseQueryString() >";
anywheresoftware.b4a.keywords.Common.LogError("The parser for < parseQueryString() > got broken. Please check input data");
 };
RDebugUtils.currentLine=5505052;
 //BA.debugLineNum = 5505052;BA.debugLine="Return Data";
if (true) return _data;
RDebugUtils.currentLine=5505054;
 //BA.debugLineNum = 5505054;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _parsequerystringurl(String _url) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "parsequerystringurl"))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "parsequerystringurl", new Object[] {_url}));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub ParseQueryStringUrl(url As String) As M";
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="url= BreakStrAt(url, \"?\") ' Split URL from Query";
_url = BA.ObjectToString(_breakstrat(_url,"?"));
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="url =  Trim_Left_Once(url, \"?\")";
_url = _trim_left_once(_url,"?");
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="Return ParseQueryString(url)";
if (true) return _parsequerystring(_url);
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="End Sub";
return null;
}
public static String  _trim_left_once(String _str,String _character) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "trim_left_once"))
	 {return ((String) Debug.delegate(ba, "trim_left_once", new Object[] {_str,_character}));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Public Sub Trim_Left_Once(str As String, character";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="If IsEmpty(character) Then";
if (_isempty(_character)) { 
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="character = \" \" 'empty space";
_character = " ";
 };
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="If str.StartsWith(character) Then";
if (_str.startsWith(_character)) { 
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="str = str.SubString(1)";
_str = _str.substring((int) (1));
 };
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=2686992;
 //BA.debugLineNum = 2686992;BA.debugLine="End Sub";
return "";
}
public static String  _plurify(String _text,int _count,String _suffix) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "plurify"))
	 {return ((String) Debug.delegate(ba, "plurify", new Object[] {_text,_count,_suffix}));}
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Public Sub Plurify(text As String, count As Int, s";
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="If count < 2 Then";
if (_count<2) { 
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="Return text";
if (true) return _text;
 }else {
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="Return text & suffix";
if (true) return _text+_suffix;
 };
RDebugUtils.currentLine=5898252;
 //BA.debugLineNum = 5898252;BA.debugLine="End Sub";
return "";
}
public static String  _prep_url(String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "prep_url"))
	 {return ((String) Debug.delegate(ba, "prep_url", new Object[] {_str}));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub Prep_url(str As String)  As String";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="str = str.Trim";
_str = _str.trim();
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="If IsEmpty(str) Or str.EqualsIgnoreCase(\"http://\"";
if (_isempty(_str) || _str.equalsIgnoreCase("http://")) { 
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="Return  \"\"";
if (true) return "";
 }else 
{RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="Else If str.StartsWith(\"#\") Then";
if (_str.startsWith("#")) { 
RDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="Return str";
if (true) return _str;
 }else {
RDebugUtils.currentLine=4259854;
 //BA.debugLineNum = 4259854;BA.debugLine="If Not(str.StartsWith(\"http://\")) Then";
if (anywheresoftware.b4a.keywords.Common.Not(_str.startsWith("http://"))) { 
RDebugUtils.currentLine=4259856;
 //BA.debugLineNum = 4259856;BA.debugLine="Return \"http://\" & str";
if (true) return "http://"+_str;
 }else {
RDebugUtils.currentLine=4259860;
 //BA.debugLineNum = 4259860;BA.debugLine="Return str";
if (true) return _str;
 };
 }}
;
RDebugUtils.currentLine=4259866;
 //BA.debugLineNum = 4259866;BA.debugLine="End Sub";
return "";
}
public static String  _prepend_zero(int _num) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "prepend_zero"))
	 {return ((String) Debug.delegate(ba, "prepend_zero", new Object[] {_num}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub Prepend_Zero(num As Int) As String";
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="If num < 10 And num > 0 Then";
if (_num<10 && _num>0) { 
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="Return \"0\" & num";
if (true) return "0"+BA.NumberToString(_num);
 }else {
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="Return num";
if (true) return BA.NumberToString(_num);
 };
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="End Sub";
return "";
}
public static String  _quotes_to_entities(String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "quotes_to_entities"))
	 {return ((String) Debug.delegate(ba, "quotes_to_entities", new Object[] {_str}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Public Sub Quotes_To_Entities(str As String) As St";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="str = str.Replace(\"\\'\", \"&#39;\")";
_str = _str.replace("\\'","&#39;");
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="str = str.Replace(\"\\\"\"\",\"&quot;\")";
_str = _str.replace("\\\"","&quot;");
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="str = str.Replace(\"'\", \"&#39;\")";
_str = _str.replace("'","&#39;");
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="str = str.Replace(\"\"\"\",\"&quot;\")";
_str = _str.replace("\"","&quot;");
RDebugUtils.currentLine=2949128;
 //BA.debugLineNum = 2949128;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="End Sub";
return "";
}
public static Object  _randlistvalue(anywheresoftware.b4a.objects.collections.List _listx) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "randlistvalue"))
	 {return ((Object) Debug.delegate(ba, "randlistvalue", new Object[] {_listx}));}
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Public Sub RandListValue(ListX As List) As Object";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Return ListX.Get(Rnd(0, ListX.Size -1))";
if (true) return _listx.Get(anywheresoftware.b4a.keywords.Common.Rnd((int) (0),(int) (_listx.getSize()-1)));
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="End Sub";
return null;
}
public static String  _reduce_double_slashes(String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "reduce_double_slashes"))
	 {return ((String) Debug.delegate(ba, "reduce_double_slashes", new Object[] {_str}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Public Sub Reduce_Double_Slashes(str As String) As";
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="If str.ToLowerCase.StartsWith(\"http://\") Then";
if (_str.toLowerCase().startsWith("http://")) { 
RDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
_str = _str.replace("//","/");
RDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="str =  str.Replace(\"http:/\" ,\"http://\")  'fix ba";
_str = _str.replace("http:/","http://");
 }else {
RDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="str = str.Replace(\"//\" ,\"/\")";
_str = _str.replace("//","/");
 };
RDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=3014671;
 //BA.debugLineNum = 3014671;BA.debugLine="End Sub";
return "";
}
public static String  _sprintf(String _fmt,Object[] _arg) throws Exception{
RDebugUtils.currentModule="cfstringutility";
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
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub Sprintf(fmt As String, arg() As Object)";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim ai, fi, i As Int";
_ai = 0;
_fi = 0;
_i = 0;
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Dim exp, wid As Int";
_exp = 0;
_wid = 0;
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Dim stmp, ptmp, sres, c, t As String";
_stmp = "";
_ptmp = "";
_sres = "";
_c = "";
_t = "";
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="Dim bdone As Boolean";
_bdone = false;
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="ai = 0";
_ai = (int) (0);
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="fi = 0";
_fi = (int) (0);
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="stmp = \"\"";
_stmp = "";
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="sres = \"\"";
_sres = "";
RDebugUtils.currentLine=4325387;
 //BA.debugLineNum = 4325387;BA.debugLine="Do While (fi < fmt.Length)";
while ((_fi<_fmt.length())) {
RDebugUtils.currentLine=4325388;
 //BA.debugLineNum = 4325388;BA.debugLine="c = fmt.CharAt(fi)";
_c = BA.ObjectToString(_fmt.charAt(_fi));
RDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="fi = fi + 1";
_fi = (int) (_fi+1);
RDebugUtils.currentLine=4325391;
 //BA.debugLineNum = 4325391;BA.debugLine="If (c = \"%\") Then";
if (((_c).equals("%"))) { 
RDebugUtils.currentLine=4325392;
 //BA.debugLineNum = 4325392;BA.debugLine="stmp = \"\"";
_stmp = "";
RDebugUtils.currentLine=4325393;
 //BA.debugLineNum = 4325393;BA.debugLine="ptmp = \"\"";
_ptmp = "";
RDebugUtils.currentLine=4325394;
 //BA.debugLineNum = 4325394;BA.debugLine="bdone = False";
_bdone = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=4325396;
 //BA.debugLineNum = 4325396;BA.debugLine="Do While ((fi < fmt.Length) And (bdone = False)";
while (((_fi<_fmt.length()) && (_bdone==anywheresoftware.b4a.keywords.Common.False))) {
RDebugUtils.currentLine=4325397;
 //BA.debugLineNum = 4325397;BA.debugLine="c = fmt.CharAt(fi)";
_c = BA.ObjectToString(_fmt.charAt(_fi));
RDebugUtils.currentLine=4325398;
 //BA.debugLineNum = 4325398;BA.debugLine="fi = fi + 1";
_fi = (int) (_fi+1);
RDebugUtils.currentLine=4325400;
 //BA.debugLineNum = 4325400;BA.debugLine="If ((IsNumber(c) = True) Or (c = \".\")) Then";
if (((anywheresoftware.b4a.keywords.Common.IsNumber(_c)==anywheresoftware.b4a.keywords.Common.True) || ((_c).equals(".")))) { 
RDebugUtils.currentLine=4325401;
 //BA.debugLineNum = 4325401;BA.debugLine="ptmp = ptmp & c";
_ptmp = _ptmp+_c;
RDebugUtils.currentLine=4325402;
 //BA.debugLineNum = 4325402;BA.debugLine="bdone = False";
_bdone = anywheresoftware.b4a.keywords.Common.False;
 }else 
{RDebugUtils.currentLine=4325403;
 //BA.debugLineNum = 4325403;BA.debugLine="Else If (c = \"s\") Then";
if (((_c).equals("s"))) { 
RDebugUtils.currentLine=4325404;
 //BA.debugLineNum = 4325404;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
RDebugUtils.currentLine=4325405;
 //BA.debugLineNum = 4325405;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
RDebugUtils.currentLine=4325406;
 //BA.debugLineNum = 4325406;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
RDebugUtils.currentLine=4325407;
 //BA.debugLineNum = 4325407;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else 
{RDebugUtils.currentLine=4325408;
 //BA.debugLineNum = 4325408;BA.debugLine="Else If (c = \"d\") Then";
if (((_c).equals("d"))) { 
RDebugUtils.currentLine=4325409;
 //BA.debugLineNum = 4325409;BA.debugLine="If (ptmp.Length > 0) Then";
if ((_ptmp.length()>0)) { 
RDebugUtils.currentLine=4325410;
 //BA.debugLineNum = 4325410;BA.debugLine="t = \" \"";
_t = " ";
RDebugUtils.currentLine=4325411;
 //BA.debugLineNum = 4325411;BA.debugLine="If (ptmp.CharAt(0) = \"0\") Then";
if ((_ptmp.charAt((int) (0))==BA.ObjectToChar("0"))) { 
RDebugUtils.currentLine=4325412;
 //BA.debugLineNum = 4325412;BA.debugLine="t = \"0\"";
_t = "0";
RDebugUtils.currentLine=4325413;
 //BA.debugLineNum = 4325413;BA.debugLine="ptmp = ptmp.SubString(1)";
_ptmp = _ptmp.substring((int) (1));
 };
 };
RDebugUtils.currentLine=4325417;
 //BA.debugLineNum = 4325417;BA.debugLine="If (ptmp.Length > 0) Then wid = ptmp Else wid";
if ((_ptmp.length()>0)) { 
_wid = (int)(Double.parseDouble(_ptmp));}
else {
_wid = (int) (0);};
RDebugUtils.currentLine=4325419;
 //BA.debugLineNum = 4325419;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
RDebugUtils.currentLine=4325421;
 //BA.debugLineNum = 4325421;BA.debugLine="Do While (stmp.Length < wid)";
while ((_stmp.length()<_wid)) {
RDebugUtils.currentLine=4325422;
 //BA.debugLineNum = 4325422;BA.debugLine="stmp = t & stmp";
_stmp = _t+_stmp;
 }
;
RDebugUtils.currentLine=4325425;
 //BA.debugLineNum = 4325425;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
RDebugUtils.currentLine=4325426;
 //BA.debugLineNum = 4325426;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
RDebugUtils.currentLine=4325427;
 //BA.debugLineNum = 4325427;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else 
{RDebugUtils.currentLine=4325428;
 //BA.debugLineNum = 4325428;BA.debugLine="Else If (c = \"f\") Then";
if (((_c).equals("f"))) { 
RDebugUtils.currentLine=4325429;
 //BA.debugLineNum = 4325429;BA.debugLine="If (ptmp.Length > 0) Then";
if ((_ptmp.length()>0)) { 
RDebugUtils.currentLine=4325430;
 //BA.debugLineNum = 4325430;BA.debugLine="i = ptmp.IndexOf(\".\")";
_i = _ptmp.indexOf(".");
RDebugUtils.currentLine=4325431;
 //BA.debugLineNum = 4325431;BA.debugLine="If (i >= 0) Then";
if ((_i>=0)) { 
RDebugUtils.currentLine=4325432;
 //BA.debugLineNum = 4325432;BA.debugLine="wid = ptmp.SubString2(0, i)";
_wid = (int)(Double.parseDouble(_ptmp.substring((int) (0),_i)));
RDebugUtils.currentLine=4325433;
 //BA.debugLineNum = 4325433;BA.debugLine="exp = ptmp.SubString(i+1)";
_exp = (int)(Double.parseDouble(_ptmp.substring((int) (_i+1))));
 }else {
RDebugUtils.currentLine=4325435;
 //BA.debugLineNum = 4325435;BA.debugLine="wid = ptmp";
_wid = (int)(Double.parseDouble(_ptmp));
RDebugUtils.currentLine=4325436;
 //BA.debugLineNum = 4325436;BA.debugLine="exp = 0";
_exp = (int) (0);
 };
RDebugUtils.currentLine=4325439;
 //BA.debugLineNum = 4325439;BA.debugLine="stmp = NumberFormat(arg(ai), wid, exp)";
_stmp = anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_arg[_ai])),_wid,_exp);
 }else {
RDebugUtils.currentLine=4325441;
 //BA.debugLineNum = 4325441;BA.debugLine="stmp = arg(ai)";
_stmp = BA.ObjectToString(_arg[_ai]);
 };
RDebugUtils.currentLine=4325444;
 //BA.debugLineNum = 4325444;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
RDebugUtils.currentLine=4325445;
 //BA.debugLineNum = 4325445;BA.debugLine="sres = sres & stmp";
_sres = _sres+_stmp;
RDebugUtils.currentLine=4325446;
 //BA.debugLineNum = 4325446;BA.debugLine="bdone = True";
_bdone = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=4325448;
 //BA.debugLineNum = 4325448;BA.debugLine="ai = ai + 1";
_ai = (int) (_ai+1);
 }}}}
;
 }
;
 }else {
RDebugUtils.currentLine=4325453;
 //BA.debugLineNum = 4325453;BA.debugLine="sres = sres & c";
_sres = _sres+_c;
 };
 }
;
RDebugUtils.currentLine=4325457;
 //BA.debugLineNum = 4325457;BA.debugLine="Return(sres)";
if (true) return (_sres);
RDebugUtils.currentLine=4325459;
 //BA.debugLineNum = 4325459;BA.debugLine="End Sub";
return "";
}
public static String  _str_repeat(String _input,int _multiplier) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "str_repeat"))
	 {return ((String) Debug.delegate(ba, "str_repeat", new Object[] {_input,_multiplier}));}
String _result = "";
int _i = 0;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub Str_Repeat(input As String, multiplier As Int)";
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="If multiplier < 1 Then";
if (_multiplier<1) { 
RDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="Return \"\"";
if (true) return "";
 }else {
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="Dim result As String = \"\"";
_result = "";
RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="For i = 0 To multiplier - 1";
{
final int step5 = 1;
final int limit5 = (int) (_multiplier-1);
_i = (int) (0) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="result = result & input";
_result = _result+_input;
 }
};
RDebugUtils.currentLine=4587536;
 //BA.debugLineNum = 4587536;BA.debugLine="Return result";
if (true) return _result;
 };
RDebugUtils.currentLine=4587540;
 //BA.debugLineNum = 4587540;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _str_split(String _str,int _splitlength) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "str_split"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "str_split", new Object[] {_str,_splitlength}));}
anywheresoftware.b4a.objects.collections.List _chunks = null;
int _divval = 0;
int _i = 0;
int _nextval = 0;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub Str_Split (str As String, splitLength A";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="Dim chunks As List";
_chunks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="chunks.Initialize";
_chunks.Initialize();
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="If (IsEmpty(str) Or splitLength < 1)  Then";
if ((_isempty(_str) || _splitlength<1)) { 
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="Return chunks 'empty list";
if (true) return _chunks;
 }else 
{RDebugUtils.currentLine=4849673;
 //BA.debugLineNum = 4849673;BA.debugLine="Else If  splitLength = str.Length Then";
if (_splitlength==_str.length()) { 
RDebugUtils.currentLine=4849675;
 //BA.debugLineNum = 4849675;BA.debugLine="chunks.Add(str)";
_chunks.Add((Object)(_str));
RDebugUtils.currentLine=4849676;
 //BA.debugLineNum = 4849676;BA.debugLine="Return chunks";
if (true) return _chunks;
 }}
;
RDebugUtils.currentLine=4849680;
 //BA.debugLineNum = 4849680;BA.debugLine="Dim DivVal As Int  =  str.Length / splitLength";
_divval = (int) (_str.length()/(double)_splitlength);
RDebugUtils.currentLine=4849682;
 //BA.debugLineNum = 4849682;BA.debugLine="For i = 0 To DivVal";
{
final int step10 = 1;
final int limit10 = _divval;
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=4849684;
 //BA.debugLineNum = 4849684;BA.debugLine="Dim nextVal As Int = i * splitLength";
_nextval = (int) (_i*_splitlength);
RDebugUtils.currentLine=4849686;
 //BA.debugLineNum = 4849686;BA.debugLine="If i = DivVal Then";
if (_i==_divval) { 
RDebugUtils.currentLine=4849689;
 //BA.debugLineNum = 4849689;BA.debugLine="chunks.add( str.SubString( nextVal))";
_chunks.Add((Object)(_str.substring(_nextval)));
 }else {
RDebugUtils.currentLine=4849694;
 //BA.debugLineNum = 4849694;BA.debugLine="chunks.add( str.SubString2( nextVal , nextVal +";
_chunks.Add((Object)(_str.substring(_nextval,(int) (_nextval+_splitlength))));
 };
 }
};
RDebugUtils.currentLine=4849700;
 //BA.debugLineNum = 4849700;BA.debugLine="Return chunks";
if (true) return _chunks;
RDebugUtils.currentLine=4849702;
 //BA.debugLineNum = 4849702;BA.debugLine="End Sub";
return null;
}
public static String  _string2ascii(String _text) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "string2ascii"))
	 {return ((String) Debug.delegate(ba, "string2ascii", new Object[] {_text}));}
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub String2Ascii(text As String) As String";
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Return String2AsciiWithSeperator(text, \"\")";
if (true) return _string2asciiwithseperator(_text,"");
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="End Sub";
return "";
}
public static String  _string2asciiwithseperator(String _text,String _seperator) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "string2asciiwithseperator"))
	 {return ((String) Debug.delegate(ba, "string2asciiwithseperator", new Object[] {_text,_seperator}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _result = null;
int _i = 0;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Public Sub String2AsciiWithSeperator(text As Strin";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="Dim result As StringBuilder";
_result = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="For i = 0 To text.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_text.length()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="result.Append(Asc(text.CharAt(i)) & seperator)";
_result.Append(BA.NumberToString(anywheresoftware.b4a.keywords.Common.Asc(_text.charAt(_i)))+_seperator);
 }
};
RDebugUtils.currentLine=4456459;
 //BA.debugLineNum = 4456459;BA.debugLine="Return result.ToString.Trim";
if (true) return _result.ToString().trim();
RDebugUtils.currentLine=4456461;
 //BA.debugLineNum = 4456461;BA.debugLine="End Sub";
return "";
}
public static String  _strip_quotes(String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "strip_quotes"))
	 {return ((String) Debug.delegate(ba, "strip_quotes", new Object[] {_str}));}
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Public Sub Strip_Quotes(str As String) As String";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="str = str.Replace(\"'\", \"\")";
_str = _str.replace("'","");
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="str = str.Replace(\"\"\"\",\"\")";
_str = _str.replace("\"","");
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="End Sub";
return "";
}
public static int  _stripos(String _haystack,String _find) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "stripos"))
	 {return ((Integer) Debug.delegate(ba, "stripos", new Object[] {_haystack,_find}));}
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub Stripos(haystack As String , find As St";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="haystack = haystack.ToLowerCase";
_haystack = _haystack.toLowerCase();
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="find = find.ToLowerCase";
_find = _find.toLowerCase();
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="Return haystack.IndexOf(find)";
if (true) return _haystack.indexOf(_find);
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="End Sub";
return 0;
}
public static int  _stripos2(String _haystack,String _find,int _start) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "stripos2"))
	 {return ((Integer) Debug.delegate(ba, "stripos2", new Object[] {_haystack,_find,_start}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub Stripos2(haystack As String , find As S";
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="haystack = haystack.ToLowerCase";
_haystack = _haystack.toLowerCase();
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="find = find.ToLowerCase";
_find = _find.toLowerCase();
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="Return haystack.IndexOf2(find, start)";
if (true) return _haystack.indexOf(_find,_start);
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="End Sub";
return 0;
}
public static Object  _strpbrk(String _haystack,String _charlist) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "strpbrk"))
	 {return ((Object) Debug.delegate(ba, "strpbrk", new Object[] {_haystack,_charlist}));}
int _i = 0;
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Public Sub Strpbrk(haystack As String, charList As";
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="For i = 0 To haystack.Length - 1";
{
final int step1 = 1;
final int limit1 = (int) (_haystack.length()-1);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="If charList.IndexOf(haystack.CharAt(i)) >= 0 The";
if (_charlist.indexOf(BA.ObjectToString(_haystack.charAt(_i)))>=0) { 
RDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="Return haystack.SubString(i)";
if (true) return (Object)(_haystack.substring(_i));
 };
 }
};
RDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="Return False";
if (true) return (Object)(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="End Sub";
return null;
}
public static int  _strpos(String _haystack,String _find) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "strpos"))
	 {return ((Integer) Debug.delegate(ba, "strpos", new Object[] {_haystack,_find}));}
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub Strpos(haystack As String , find As Str";
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Return haystack.IndexOf(find)";
if (true) return _haystack.indexOf(_find);
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="End Sub";
return 0;
}
public static int  _strpos2(String _haystack,String _find,int _start) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "strpos2"))
	 {return ((Integer) Debug.delegate(ba, "strpos2", new Object[] {_haystack,_find,_start}));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub Strpos2(haystack As String , find As St";
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Return haystack.IndexOf2(find, start)";
if (true) return _haystack.indexOf(_find,_start);
RDebugUtils.currentLine=4980740;
 //BA.debugLineNum = 4980740;BA.debugLine="End Sub";
return 0;
}
public static int  _strripos(String _haystack,String _find) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "strripos"))
	 {return ((Integer) Debug.delegate(ba, "strripos", new Object[] {_haystack,_find}));}
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub Strripos(haystack As String , find As S";
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="haystack = haystack.ToLowerCase";
_haystack = _haystack.toLowerCase();
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="find = find.ToLowerCase";
_find = _find.toLowerCase();
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="Return haystack.LastIndexOf(find)";
if (true) return _haystack.lastIndexOf(_find);
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="End Sub";
return 0;
}
public static int  _strripos2(String _haystack,String _find,int _start) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "strripos2"))
	 {return ((Integer) Debug.delegate(ba, "strripos2", new Object[] {_haystack,_find,_start}));}
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub Strripos2 (haystack As String , find As";
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="haystack = haystack.ToLowerCase";
_haystack = _haystack.toLowerCase();
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="find = find.ToLowerCase";
_find = _find.toLowerCase();
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="Return haystack.LastIndexOf2(find, start)";
if (true) return _haystack.lastIndexOf(_find,_start);
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="End Sub";
return 0;
}
public static int  _strrpos(String _haystack,String _find) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "strrpos"))
	 {return ((Integer) Debug.delegate(ba, "strrpos", new Object[] {_haystack,_find}));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub Strrpos(haystack As String , find As St";
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Return haystack.LastIndexOf(find)";
if (true) return _haystack.lastIndexOf(_find);
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="End Sub";
return 0;
}
public static int  _strrpos2(String _haystack,String _find,int _start) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "strrpos2"))
	 {return ((Integer) Debug.delegate(ba, "strrpos2", new Object[] {_haystack,_find,_start}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub Strrpos2(haystack As String , find As S";
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Return haystack.LastIndexOf2(find, start)";
if (true) return _haystack.lastIndexOf(_find,_start);
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="End Sub";
return 0;
}
public static anywheresoftware.b4a.objects.collections.List  _strtostrlist(String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "strtostrlist"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "strtostrlist", new Object[] {_str}));}
anywheresoftware.b4a.objects.collections.List _result = null;
int _i = 0;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub StrToStrList(str As String) As List";
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Dim result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="For i = 0 To str.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_str.length()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="result.Add(str.CharAt(i))";
_result.Add((Object)(_str.charAt(_i)));
 }
};
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="Return result";
if (true) return _result;
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="End Sub";
return null;
}
public static String  _trim_right_once(String _str,String _character) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "trim_right_once"))
	 {return ((String) Debug.delegate(ba, "trim_right_once", new Object[] {_str,_character}));}
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Public Sub Trim_Right_Once(str As String, characte";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="If IsEmpty(character) Then";
if (_isempty(_character)) { 
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="character = \" \" 'empty space";
_character = " ";
 };
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="If str.EndsWith(character) Then";
if (_str.endsWith(_character)) { 
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="str = str.SubString2(0, str.Length - 1)";
_str = _str.substring((int) (0),(int) (_str.length()-1));
 };
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="Return str";
if (true) return _str;
RDebugUtils.currentLine=2752528;
 //BA.debugLineNum = 2752528;BA.debugLine="End Sub";
return "";
}
public static String  _trim_slashes_once(String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "trim_slashes_once"))
	 {return ((String) Debug.delegate(ba, "trim_slashes_once", new Object[] {_str}));}
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Public Sub Trim_Slashes_Once(str As String) As Str";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Return Trim_Once( str, \"/\")";
if (true) return _trim_once(_str,"/");
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="End Sub";
return "";
}
public static String  _truncate(String _txt,int _length) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "truncate"))
	 {return ((String) Debug.delegate(ba, "truncate", new Object[] {_txt,_length}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Public Sub Truncate(txt As String, length As Int)";
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="If length > txt.Length Then";
if (_length>_txt.length()) { 
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="Return txt";
if (true) return _txt;
 }else {
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="Return txt.Substring2(0, length)";
if (true) return _txt.substring((int) (0),_length);
 };
RDebugUtils.currentLine=5636111;
 //BA.debugLineNum = 5636111;BA.debugLine="End Sub";
return "";
}
public static String  _underscore(String _str) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "underscore"))
	 {return ((String) Debug.delegate(ba, "underscore", new Object[] {_str}));}
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub Underscore(str As String)  As String";
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="str= str.ToLowerCase";
_str = _str.toLowerCase();
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Return str.Replace(\" \",  \"_\")";
if (true) return _str.replace(" ","_");
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="End Sub";
return "";
}
public static String  _word_wrap(String _str,int _limit) throws Exception{
RDebugUtils.currentModule="cfstringutility";
if (Debug.shouldDelegate(ba, "word_wrap"))
	 {return ((String) Debug.delegate(ba, "word_wrap", new Object[] {_str,_limit}));}
int _divval = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _stringbuild = null;
int _i = 0;
int _nextval = 0;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub Word_Wrap(str As String, limit As Int) As Stri";
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="str = str.Trim";
_str = _str.trim();
RDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="If str.Length = limit Then";
if (_str.length()==_limit) { 
RDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="Return str";
if (true) return _str;
 }else {
RDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="Dim DivVal As Int";
_divval = 0;
RDebugUtils.currentLine=4390924;
 //BA.debugLineNum = 4390924;BA.debugLine="Dim stringBuild As StringBuilder";
_stringbuild = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4390925;
 //BA.debugLineNum = 4390925;BA.debugLine="stringBuild.Initialize";
_stringbuild.Initialize();
RDebugUtils.currentLine=4390927;
 //BA.debugLineNum = 4390927;BA.debugLine="DivVal =  str.Length / limit";
_divval = (int) (_str.length()/(double)_limit);
RDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="For i = 0 To DivVal";
{
final int step9 = 1;
final int limit9 = _divval;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=4390931;
 //BA.debugLineNum = 4390931;BA.debugLine="Dim nextVal As Int = i * limit";
_nextval = (int) (_i*_limit);
RDebugUtils.currentLine=4390933;
 //BA.debugLineNum = 4390933;BA.debugLine="If i = DivVal Then";
if (_i==_divval) { 
RDebugUtils.currentLine=4390936;
 //BA.debugLineNum = 4390936;BA.debugLine="stringBuild.Append( str.SubString( nextVal).Tr";
_stringbuild.Append(_str.substring(_nextval).trim());
 }else {
RDebugUtils.currentLine=4390941;
 //BA.debugLineNum = 4390941;BA.debugLine="stringBuild.Append( str.SubString2( nextVal ,";
_stringbuild.Append(_str.substring(_nextval,(int) (_nextval+_limit)).trim());
RDebugUtils.currentLine=4390942;
 //BA.debugLineNum = 4390942;BA.debugLine="stringBuild.Append( CRLF)";
_stringbuild.Append(anywheresoftware.b4a.keywords.Common.CRLF);
 };
 }
};
RDebugUtils.currentLine=4390948;
 //BA.debugLineNum = 4390948;BA.debugLine="Return stringBuild.ToString";
if (true) return _stringbuild.ToString();
 };
RDebugUtils.currentLine=4390952;
 //BA.debugLineNum = 4390952;BA.debugLine="End Sub";
return "";
}
}