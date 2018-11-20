package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class cffileutility extends Object{
public static cffileutility mostCurrent = new cffileutility();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cffileutility", null);
		ba.loadHtSubs(cffileutility.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "Punchline.Tech.Cuppy.Framework.cffileutility", ba);
		}
	}
    public static Class<?> getObject() {
		return cffileutility.class;
	}

 
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static b4j.example.cssutils _cssutils = null;
public static Punchline.Tech.Cuppy.Framework.main _main = null;
public static Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public static Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public static Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public static Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public static Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public static Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public static Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public static Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public static String  _bytestofile(String _dir,String _filename,byte[] _data) throws Exception{
RDebugUtils.currentModule="cffileutility";
if (Debug.shouldDelegate(ba, "bytestofile"))
	 {return ((String) Debug.delegate(ba, "bytestofile", new Object[] {_dir,_filename,_data}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub BytesToFile (Dir As String, FileName As";
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(_dir,_filename,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
_out.WriteBytes(_data,(int) (0),_data.length);
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper  _bytestoimage(byte[] _bytes) throws Exception{
RDebugUtils.currentModule="cffileutility";
if (Debug.shouldDelegate(ba, "bytestoimage"))
	 {return ((anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper) Debug.delegate(ba, "bytestoimage", new Object[] {_bytes}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in = null;
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bmp = null;
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As Image";
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Dim in As InputStream";
_in = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="in.InitializeFromBytesArray(bytes,0,bytes.Length)";
_in.InitializeFromBytesArray(_bytes,(int) (0),_bytes.length);
RDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="Dim bmp As Image";
_bmp = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
RDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="bmp.Initialize2(in)";
_bmp.Initialize2((java.io.InputStream)(_in.getObject()));
RDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="Return bmp";
if (true) return _bmp;
RDebugUtils.currentLine=8257546;
 //BA.debugLineNum = 8257546;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.List  _filesinfolder(String _dir,boolean _includesubdir) throws Exception{
RDebugUtils.currentModule="cffileutility";
if (Debug.shouldDelegate(ba, "filesinfolder"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "filesinfolder", new Object[] {_dir,_includesubdir}));}
anywheresoftware.b4a.objects.collections.List _files = null;
String _filename = "";
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub FilesInFolder(dir As String, IncludeSub";
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="Dim files As List";
_files = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="files.Initialize";
_files.Initialize();
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="dir = CFStringUtility.Trim_Slashes_Once(dir)";
_dir = _cfstringutility._trim_slashes_once(_dir);
RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="For Each filename As String In File.ListFiles(dir";
{
final anywheresoftware.b4a.BA.IterableList group4 = anywheresoftware.b4a.keywords.Common.File.ListFiles(_dir);
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_filename = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="If File.IsDirectory(dir, filename) = False Then";
if (anywheresoftware.b4a.keywords.Common.File.IsDirectory(_dir,_filename)==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="files.Add(FixWinPaths(dir & \"\\\" & filename))";
_files.Add((Object)(_fixwinpaths(_dir+"\\"+_filename)));
 }else 
{RDebugUtils.currentLine=7995405;
 //BA.debugLineNum = 7995405;BA.debugLine="Else if IncludeSubDir Then";
if (_includesubdir) { 
RDebugUtils.currentLine=7995407;
 //BA.debugLineNum = 7995407;BA.debugLine="files.AddAll(FilesInFolder(FixWinPaths(dir & \"\\";
_files.AddAll(_filesinfolder(_fixwinpaths(_dir+"\\"+_filename),anywheresoftware.b4a.keywords.Common.True));
 }}
;
 }
};
RDebugUtils.currentLine=7995413;
 //BA.debugLineNum = 7995413;BA.debugLine="Return files";
if (true) return _files;
RDebugUtils.currentLine=7995415;
 //BA.debugLineNum = 7995415;BA.debugLine="End Sub";
return null;
}
public static String  _fixwinpaths(String _path) throws Exception{
RDebugUtils.currentModule="cffileutility";
if (Debug.shouldDelegate(ba, "fixwinpaths"))
	 {return ((String) Debug.delegate(ba, "fixwinpaths", new Object[] {_path}));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub FixWinPaths(path As String) As String";
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Return path.Replace(\"//\", \"/\")";
if (true) return _path.replace("//","/");
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.collections.List  _filesinfolder2(String _dir) throws Exception{
RDebugUtils.currentModule="cffileutility";
if (Debug.shouldDelegate(ba, "filesinfolder2"))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "filesinfolder2", new Object[] {_dir}));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub FilesInFolder2(dir As String) As List";
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Return FilesInFolder(dir, True)";
if (true) return _filesinfolder(_dir,anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="End Sub";
return null;
}
public static byte[]  _filetobytes(String _dir,String _filename) throws Exception{
RDebugUtils.currentModule="cffileutility";
if (Debug.shouldDelegate(ba, "filetobytes"))
	 {return ((byte[]) Debug.delegate(ba, "filetobytes", new Object[] {_dir,_filename}));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub FileToBytes (Dir As String, FileName As";
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="Return Bit.InputStreamToBytes(File.OpenInput(Dir,";
if (true) return anywheresoftware.b4a.keywords.Common.Bit.InputStreamToBytes((java.io.InputStream)(anywheresoftware.b4a.keywords.Common.File.OpenInput(_dir,_filename).getObject()));
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="End Sub";
return null;
}
public static String  _formatfilesize(float _bytes) throws Exception{
RDebugUtils.currentModule="cffileutility";
if (Debug.shouldDelegate(ba, "formatfilesize"))
	 {return ((String) Debug.delegate(ba, "formatfilesize", new Object[] {_bytes}));}
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub FormatFileSize(Bytes As Float) As Strin";
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
RDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
RDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
RDebugUtils.currentLine=8323083;
 //BA.debugLineNum = 8323083;BA.debugLine="Private I As Int";
_i = 0;
RDebugUtils.currentLine=8323085;
 //BA.debugLineNum = 8323085;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (anywheresoftware.b4a.keywords.Common.Abs(_bytes));
RDebugUtils.currentLine=8323087;
 //BA.debugLineNum = 8323087;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (anywheresoftware.b4a.keywords.Common.Floor(anywheresoftware.b4a.keywords.Common.Logarithm(_bytes,1024)));
RDebugUtils.currentLine=8323088;
 //BA.debugLineNum = 8323088;BA.debugLine="Po = Power(1024, I)";
_po = anywheresoftware.b4a.keywords.Common.Power(1024,_i);
RDebugUtils.currentLine=8323089;
 //BA.debugLineNum = 8323089;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
RDebugUtils.currentLine=8323091;
 //BA.debugLineNum = 8323091;BA.debugLine="Return NumberFormat(Si, 1, 3) & Unit(I)";
if (true) return anywheresoftware.b4a.keywords.Common.NumberFormat(_si,(int) (1),(int) (3))+_unit[_i];
 };
RDebugUtils.currentLine=8323095;
 //BA.debugLineNum = 8323095;BA.debugLine="End Sub";
return "";
}
public static long  _sizeofcurrentfilesinfolder(String _dir) throws Exception{
RDebugUtils.currentModule="cffileutility";
if (Debug.shouldDelegate(ba, "sizeofcurrentfilesinfolder"))
	 {return ((Long) Debug.delegate(ba, "sizeofcurrentfilesinfolder", new Object[] {_dir}));}
long _total = 0L;
String _filename = "";
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub SizeOfCurrentFilesInFolder(dir As Strin";
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Dim total As Long";
_total = 0L;
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="dir = CFStringUtility.Trim_Slashes_Once(dir)";
_dir = _cfstringutility._trim_slashes_once(_dir);
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="For Each filename As String In FilesInFolder(dir,";
{
final anywheresoftware.b4a.BA.IterableList group3 = _filesinfolder(_dir,anywheresoftware.b4a.keywords.Common.False);
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_filename = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="total = total + File.Size(\"\" , filename)";
_total = (long) (_total+anywheresoftware.b4a.keywords.Common.File.Size("",_filename));
 }
};
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="Return total";
if (true) return _total;
RDebugUtils.currentLine=7864333;
 //BA.debugLineNum = 7864333;BA.debugLine="End Sub";
return 0L;
}
public static long  _sizeoffilesinfolder(String _dir) throws Exception{
RDebugUtils.currentModule="cffileutility";
if (Debug.shouldDelegate(ba, "sizeoffilesinfolder"))
	 {return ((Long) Debug.delegate(ba, "sizeoffilesinfolder", new Object[] {_dir}));}
long _total = 0L;
String _filename = "";
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub SizeOfFilesInFolder(dir As String) As L";
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="Dim total As Long";
_total = 0L;
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="dir = CFStringUtility.Trim_Slashes_Once(dir)";
_dir = _cfstringutility._trim_slashes_once(_dir);
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="For Each filename As String In FilesInFolder(dir,";
{
final anywheresoftware.b4a.BA.IterableList group3 = _filesinfolder(_dir,anywheresoftware.b4a.keywords.Common.True);
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_filename = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=7929863;
 //BA.debugLineNum = 7929863;BA.debugLine="total = total + File.Size(\"\" , filename)";
_total = (long) (_total+anywheresoftware.b4a.keywords.Common.File.Size("",_filename));
 }
};
RDebugUtils.currentLine=7929867;
 //BA.debugLineNum = 7929867;BA.debugLine="Return total";
if (true) return _total;
RDebugUtils.currentLine=7929869;
 //BA.debugLineNum = 7929869;BA.debugLine="End Sub";
return 0L;
}
}