package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cffileutility_subs_0 {


public static RemoteObject  _bytestofile(RemoteObject _dir,RemoteObject _filename,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("BytesToFile (cffileutility) ","cffileutility",7,cffileutility.ba,cffileutility.mostCurrent,94);
if (RapidSub.canDelegate("bytestofile")) { return Punchline.Tech.Cuppy.Framework.cffileutility.remoteMe.runUserSub(false, "cffileutility","bytestofile", _dir, _filename, _data);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 94;BA.debugLine="Public Sub BytesToFile (Dir As String, FileName As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 96;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
Debug.ShouldStop(-2147483648);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = cffileutility.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_dir),(Object)(_filename),(Object)(cffileutility.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 97;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
Debug.ShouldStop(1);
_out.runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 BA.debugLineNum = 98;BA.debugLine="out.Close";
Debug.ShouldStop(2);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _bytestoimage(RemoteObject _bytes) throws Exception{
try {
		Debug.PushSubsStack("BytesToImage (cffileutility) ","cffileutility",7,cffileutility.ba,cffileutility.mostCurrent,111);
if (RapidSub.canDelegate("bytestoimage")) { return Punchline.Tech.Cuppy.Framework.cffileutility.remoteMe.runUserSub(false, "cffileutility","bytestoimage", _bytes);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 111;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As Image";
Debug.ShouldStop(16384);
 BA.debugLineNum = 113;BA.debugLine="Dim in As InputStream";
Debug.ShouldStop(65536);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 114;BA.debugLine="in.InitializeFromBytesArray(bytes,0,bytes.Length)";
Debug.ShouldStop(131072);
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_bytes),(Object)(BA.numberCast(int.class, 0)),(Object)(_bytes.getField(true,"length")));
 BA.debugLineNum = 116;BA.debugLine="Dim bmp As Image";
Debug.ShouldStop(524288);
_bmp = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 117;BA.debugLine="bmp.Initialize2(in)";
Debug.ShouldStop(1048576);
_bmp.runVoidMethod ("Initialize2",(Object)((_in.getObject())));
 BA.debugLineNum = 119;BA.debugLine="Return bmp";
Debug.ShouldStop(4194304);
if (true) return _bmp;
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filesinfolder(RemoteObject _dir,RemoteObject _includesubdir) throws Exception{
try {
		Debug.PushSubsStack("FilesInFolder (cffileutility) ","cffileutility",7,cffileutility.ba,cffileutility.mostCurrent,59);
if (RapidSub.canDelegate("filesinfolder")) { return Punchline.Tech.Cuppy.Framework.cffileutility.remoteMe.runUserSub(false, "cffileutility","filesinfolder", _dir, _includesubdir);}
RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("dir", _dir);
Debug.locals.put("IncludeSubDir", _includesubdir);
 BA.debugLineNum = 59;BA.debugLine="Public Sub FilesInFolder(dir As String, IncludeSub";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="Dim files As List";
Debug.ShouldStop(268435456);
_files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("files", _files);
 BA.debugLineNum = 62;BA.debugLine="files.Initialize";
Debug.ShouldStop(536870912);
_files.runVoidMethod ("Initialize");
 BA.debugLineNum = 64;BA.debugLine="dir = CFStringUtility.Trim_Slashes_Once(dir)";
Debug.ShouldStop(-2147483648);
_dir = cffileutility._cfstringutility.runMethod(true,"_trim_slashes_once",(Object)(_dir));Debug.locals.put("dir", _dir);
 BA.debugLineNum = 66;BA.debugLine="For Each filename As String In File.ListFiles(dir";
Debug.ShouldStop(2);
{
final RemoteObject group4 = cffileutility.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_dir));
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_filename = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("filename", _filename);
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 68;BA.debugLine="If File.IsDirectory(dir, filename) = False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",cffileutility.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_dir),(Object)(_filename)),cffileutility.__c.getField(true,"False"))) { 
 BA.debugLineNum = 70;BA.debugLine="files.Add(FixWinPaths(dir & \"\\\" & filename))";
Debug.ShouldStop(32);
_files.runVoidMethod ("Add",(Object)((_fixwinpaths(RemoteObject.concat(_dir,RemoteObject.createImmutable("\\"),_filename)))));
 }else 
{ BA.debugLineNum = 72;BA.debugLine="Else if IncludeSubDir Then";
Debug.ShouldStop(128);
if (_includesubdir.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 74;BA.debugLine="files.AddAll(FilesInFolder(FixWinPaths(dir & \"\\";
Debug.ShouldStop(512);
_files.runVoidMethod ("AddAll",(Object)(_filesinfolder(_fixwinpaths(RemoteObject.concat(_dir,RemoteObject.createImmutable("\\"),_filename)),cffileutility.__c.getField(true,"True"))));
 }}
;
 }
}Debug.locals.put("filename", _filename);
;
 BA.debugLineNum = 80;BA.debugLine="Return files";
Debug.ShouldStop(32768);
if (true) return _files;
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filesinfolder2(RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("FilesInFolder2 (cffileutility) ","cffileutility",7,cffileutility.ba,cffileutility.mostCurrent,86);
if (RapidSub.canDelegate("filesinfolder2")) { return Punchline.Tech.Cuppy.Framework.cffileutility.remoteMe.runUserSub(false, "cffileutility","filesinfolder2", _dir);}
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 86;BA.debugLine="Public Sub FilesInFolder2(dir As String) As List";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="Return FilesInFolder(dir, True)";
Debug.ShouldStop(8388608);
if (true) return _filesinfolder(_dir,cffileutility.__c.getField(true,"True"));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filetobytes(RemoteObject _dir,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("FileToBytes (cffileutility) ","cffileutility",7,cffileutility.ba,cffileutility.mostCurrent,104);
if (RapidSub.canDelegate("filetobytes")) { return Punchline.Tech.Cuppy.Framework.cffileutility.remoteMe.runUserSub(false, "cffileutility","filetobytes", _dir, _filename);}
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 104;BA.debugLine="Public Sub FileToBytes (Dir As String, FileName As";
Debug.ShouldStop(128);
 BA.debugLineNum = 106;BA.debugLine="Return Bit.InputStreamToBytes(File.OpenInput(Dir,";
Debug.ShouldStop(512);
if (true) return cffileutility.__c.getField(false,"Bit").runMethod(false,"InputStreamToBytes",(Object)((cffileutility.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename)).getObject())));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fixwinpaths(RemoteObject _path) throws Exception{
try {
		Debug.PushSubsStack("FixWinPaths (cffileutility) ","cffileutility",7,cffileutility.ba,cffileutility.mostCurrent,151);
if (RapidSub.canDelegate("fixwinpaths")) { return Punchline.Tech.Cuppy.Framework.cffileutility.remoteMe.runUserSub(false, "cffileutility","fixwinpaths", _path);}
Debug.locals.put("path", _path);
 BA.debugLineNum = 151;BA.debugLine="Public Sub FixWinPaths(path As String) As String";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 153;BA.debugLine="Return path.Replace(\"//\", \"/\")";
Debug.ShouldStop(16777216);
if (true) return _path.runMethod(true,"replace",(Object)(BA.ObjectToString("//")),(Object)(RemoteObject.createImmutable("/")));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatfilesize(RemoteObject _bytes) throws Exception{
try {
		Debug.PushSubsStack("FormatFileSize (cffileutility) ","cffileutility",7,cffileutility.ba,cffileutility.mostCurrent,124);
if (RapidSub.canDelegate("formatfilesize")) { return Punchline.Tech.Cuppy.Framework.cffileutility.remoteMe.runUserSub(false, "cffileutility","formatfilesize", _bytes);}
RemoteObject _unit = null;
RemoteObject _po = RemoteObject.createImmutable(0);
RemoteObject _si = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Bytes", _bytes);
 BA.debugLineNum = 124;BA.debugLine="Public Sub FormatFileSize(Bytes As Float) As Strin";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 126;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
Debug.ShouldStop(536870912);
_unit = RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString(" Byte"),BA.ObjectToString(" KB"),BA.ObjectToString(" MB"),BA.ObjectToString(" GB"),BA.ObjectToString(" TB"),BA.ObjectToString(" PB"),BA.ObjectToString(" EB"),BA.ObjectToString(" ZB"),RemoteObject.createImmutable(" YB")});Debug.locals.put("Unit", _unit);Debug.locals.put("Unit", _unit);
 BA.debugLineNum = 128;BA.debugLine="If Bytes = 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_bytes,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 130;BA.debugLine="Return \"0 Bytes\"";
Debug.ShouldStop(2);
if (true) return BA.ObjectToString("0 Bytes");
 }else {
 BA.debugLineNum = 134;BA.debugLine="Private Po, Si As Double";
Debug.ShouldStop(32);
_po = RemoteObject.createImmutable(0);Debug.locals.put("Po", _po);
_si = RemoteObject.createImmutable(0);Debug.locals.put("Si", _si);
 BA.debugLineNum = 135;BA.debugLine="Private I As Int";
Debug.ShouldStop(64);
_i = RemoteObject.createImmutable(0);Debug.locals.put("I", _i);
 BA.debugLineNum = 137;BA.debugLine="Bytes = Abs(Bytes)";
Debug.ShouldStop(256);
_bytes = BA.numberCast(float.class, cffileutility.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _bytes))));Debug.locals.put("Bytes", _bytes);
 BA.debugLineNum = 139;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
Debug.ShouldStop(1024);
_i = BA.numberCast(int.class, cffileutility.__c.runMethod(true,"Floor",(Object)(cffileutility.__c.runMethod(true,"Logarithm",(Object)(BA.numberCast(double.class, _bytes)),(Object)(BA.numberCast(double.class, 1024))))));Debug.locals.put("I", _i);
 BA.debugLineNum = 140;BA.debugLine="Po = Power(1024, I)";
Debug.ShouldStop(2048);
_po = cffileutility.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, 1024)),(Object)(BA.numberCast(double.class, _i)));Debug.locals.put("Po", _po);
 BA.debugLineNum = 141;BA.debugLine="Si = Bytes / Po";
Debug.ShouldStop(4096);
_si = RemoteObject.solve(new RemoteObject[] {_bytes,_po}, "/",0, 0);Debug.locals.put("Si", _si);
 BA.debugLineNum = 143;BA.debugLine="Return NumberFormat(Si, 1, 3) & Unit(I)";
Debug.ShouldStop(16384);
if (true) return RemoteObject.concat(cffileutility.__c.runMethod(true,"NumberFormat",(Object)(_si),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),_unit.getArrayElement(true,_i));
 };
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Private Sub Process_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
cffileutility._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sizeofcurrentfilesinfolder(RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("SizeOfCurrentFilesInFolder (cffileutility) ","cffileutility",7,cffileutility.ba,cffileutility.mostCurrent,19);
if (RapidSub.canDelegate("sizeofcurrentfilesinfolder")) { return Punchline.Tech.Cuppy.Framework.cffileutility.remoteMe.runUserSub(false, "cffileutility","sizeofcurrentfilesinfolder", _dir);}
RemoteObject _total = RemoteObject.createImmutable(0L);
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 19;BA.debugLine="Public Sub SizeOfCurrentFilesInFolder(dir As Strin";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Dim total As Long";
Debug.ShouldStop(1048576);
_total = RemoteObject.createImmutable(0L);Debug.locals.put("total", _total);
 BA.debugLineNum = 22;BA.debugLine="dir = CFStringUtility.Trim_Slashes_Once(dir)";
Debug.ShouldStop(2097152);
_dir = cffileutility._cfstringutility.runMethod(true,"_trim_slashes_once",(Object)(_dir));Debug.locals.put("dir", _dir);
 BA.debugLineNum = 24;BA.debugLine="For Each filename As String In FilesInFolder(dir,";
Debug.ShouldStop(8388608);
{
final RemoteObject group3 = _filesinfolder(_dir,cffileutility.__c.getField(true,"False"));
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_filename = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("filename", _filename);
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 26;BA.debugLine="total = total + File.Size(\"\" , filename)";
Debug.ShouldStop(33554432);
_total = RemoteObject.solve(new RemoteObject[] {_total,cffileutility.__c.getField(false,"File").runMethod(true,"Size",(Object)(BA.ObjectToString("")),(Object)(_filename))}, "+",1, 2);Debug.locals.put("total", _total);
 }
}Debug.locals.put("filename", _filename);
;
 BA.debugLineNum = 30;BA.debugLine="Return total";
Debug.ShouldStop(536870912);
if (true) return _total;
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sizeoffilesinfolder(RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("SizeOfFilesInFolder (cffileutility) ","cffileutility",7,cffileutility.ba,cffileutility.mostCurrent,40);
if (RapidSub.canDelegate("sizeoffilesinfolder")) { return Punchline.Tech.Cuppy.Framework.cffileutility.remoteMe.runUserSub(false, "cffileutility","sizeoffilesinfolder", _dir);}
RemoteObject _total = RemoteObject.createImmutable(0L);
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 40;BA.debugLine="Public Sub SizeOfFilesInFolder(dir As String) As L";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="Dim total As Long";
Debug.ShouldStop(512);
_total = RemoteObject.createImmutable(0L);Debug.locals.put("total", _total);
 BA.debugLineNum = 43;BA.debugLine="dir = CFStringUtility.Trim_Slashes_Once(dir)";
Debug.ShouldStop(1024);
_dir = cffileutility._cfstringutility.runMethod(true,"_trim_slashes_once",(Object)(_dir));Debug.locals.put("dir", _dir);
 BA.debugLineNum = 45;BA.debugLine="For Each filename As String In FilesInFolder(dir,";
Debug.ShouldStop(4096);
{
final RemoteObject group3 = _filesinfolder(_dir,cffileutility.__c.getField(true,"True"));
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_filename = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("filename", _filename);
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 47;BA.debugLine="total = total + File.Size(\"\" , filename)";
Debug.ShouldStop(16384);
_total = RemoteObject.solve(new RemoteObject[] {_total,cffileutility.__c.getField(false,"File").runMethod(true,"Size",(Object)(BA.ObjectToString("")),(Object)(_filename))}, "+",1, 2);Debug.locals.put("total", _total);
 }
}Debug.locals.put("filename", _filename);
;
 BA.debugLineNum = 51;BA.debugLine="Return total";
Debug.ShouldStop(262144);
if (true) return _total;
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}