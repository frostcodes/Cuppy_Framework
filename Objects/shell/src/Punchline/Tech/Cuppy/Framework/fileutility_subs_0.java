package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class fileutility_subs_0 {


public static RemoteObject  _bytestofile(RemoteObject _dir,RemoteObject _filename,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("BytesToFile (fileutility) ","fileutility",19,fileutility.ba,fileutility.mostCurrent,69);
if (RapidSub.canDelegate("bytestofile")) { return Punchline.Tech.Cuppy.Framework.fileutility.remoteMe.runUserSub(false, "fileutility","bytestofile", _dir, _filename, _data);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
Debug.locals.put("Data", _data);
 BA.debugLineNum = 69;BA.debugLine="Public Sub BytesToFile (Dir As String, FileName As";
Debug.ShouldStop(16);
 BA.debugLineNum = 71;BA.debugLine="Dim out As OutputStream = File.OpenOutput(Dir, Fi";
Debug.ShouldStop(64);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
_out = fileutility.__c.getField(false,"File").runMethod(false,"OpenOutput",(Object)(_dir),(Object)(_filename),(Object)(fileutility.__c.getField(true,"False")));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 72;BA.debugLine="out.WriteBytes(Data, 0, Data.Length)";
Debug.ShouldStop(128);
_out.runVoidMethod ("WriteBytes",(Object)(_data),(Object)(BA.numberCast(int.class, 0)),(Object)(_data.getField(true,"length")));
 BA.debugLineNum = 73;BA.debugLine="out.Close";
Debug.ShouldStop(256);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("BytesToImage (fileutility) ","fileutility",19,fileutility.ba,fileutility.mostCurrent,86);
if (RapidSub.canDelegate("bytestoimage")) { return Punchline.Tech.Cuppy.Framework.fileutility.remoteMe.runUserSub(false, "fileutility","bytestoimage", _bytes);}
RemoteObject _in = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");
Debug.locals.put("bytes", _bytes);
 BA.debugLineNum = 86;BA.debugLine="Public Sub BytesToImage(bytes() As Byte) As Image";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="Dim in As InputStream";
Debug.ShouldStop(8388608);
_in = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("in", _in);
 BA.debugLineNum = 89;BA.debugLine="in.InitializeFromBytesArray(bytes,0,bytes.Length)";
Debug.ShouldStop(16777216);
_in.runVoidMethod ("InitializeFromBytesArray",(Object)(_bytes),(Object)(BA.numberCast(int.class, 0)),(Object)(_bytes.getField(true,"length")));
 BA.debugLineNum = 91;BA.debugLine="Dim bmp As Image";
Debug.ShouldStop(67108864);
_bmp = RemoteObject.createNew ("anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 92;BA.debugLine="bmp.Initialize2(in)";
Debug.ShouldStop(134217728);
_bmp.runVoidMethod ("Initialize2",(Object)((_in.getObject())));
 BA.debugLineNum = 94;BA.debugLine="Return bmp";
Debug.ShouldStop(536870912);
if (true) return _bmp;
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("FileToBytes (fileutility) ","fileutility",19,fileutility.ba,fileutility.mostCurrent,79);
if (RapidSub.canDelegate("filetobytes")) { return Punchline.Tech.Cuppy.Framework.fileutility.remoteMe.runUserSub(false, "fileutility","filetobytes", _dir, _filename);}
Debug.locals.put("Dir", _dir);
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 79;BA.debugLine="Public Sub FileToBytes (Dir As String, FileName As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 81;BA.debugLine="Return Bit.InputStreamToBytes(File.OpenInput(Dir,";
Debug.ShouldStop(65536);
if (true) return fileutility.__c.getField(false,"Bit").runMethod(false,"InputStreamToBytes",(Object)((fileutility.__c.getField(false,"File").runMethod(false,"OpenInput",(Object)(_dir),(Object)(_filename)).getObject())));
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _formatfilesize(RemoteObject _bytes) throws Exception{
try {
		Debug.PushSubsStack("FormatFileSize (fileutility) ","fileutility",19,fileutility.ba,fileutility.mostCurrent,99);
if (RapidSub.canDelegate("formatfilesize")) { return Punchline.Tech.Cuppy.Framework.fileutility.remoteMe.runUserSub(false, "fileutility","formatfilesize", _bytes);}
RemoteObject _unit = null;
RemoteObject _po = RemoteObject.createImmutable(0);
RemoteObject _si = RemoteObject.createImmutable(0);
RemoteObject _i = RemoteObject.createImmutable(0);
Debug.locals.put("Bytes", _bytes);
 BA.debugLineNum = 99;BA.debugLine="Public Sub FormatFileSize(Bytes As Float) As Strin";
Debug.ShouldStop(4);
 BA.debugLineNum = 101;BA.debugLine="Private Unit() As String = Array As String(\" Byte";
Debug.ShouldStop(16);
_unit = RemoteObject.createNewArray("String",new int[] {9},new Object[] {BA.ObjectToString(" Byte"),BA.ObjectToString(" KB"),BA.ObjectToString(" MB"),BA.ObjectToString(" GB"),BA.ObjectToString(" TB"),BA.ObjectToString(" PB"),BA.ObjectToString(" EB"),BA.ObjectToString(" ZB"),RemoteObject.createImmutable(" YB")});Debug.locals.put("Unit", _unit);Debug.locals.put("Unit", _unit);
 BA.debugLineNum = 103;BA.debugLine="If Bytes = 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_bytes,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 105;BA.debugLine="Return \"0 Bytes\"";
Debug.ShouldStop(256);
if (true) return BA.ObjectToString("0 Bytes");
 }else {
 BA.debugLineNum = 109;BA.debugLine="Private Po, Si As Double";
Debug.ShouldStop(4096);
_po = RemoteObject.createImmutable(0);Debug.locals.put("Po", _po);
_si = RemoteObject.createImmutable(0);Debug.locals.put("Si", _si);
 BA.debugLineNum = 110;BA.debugLine="Private I As Int";
Debug.ShouldStop(8192);
_i = RemoteObject.createImmutable(0);Debug.locals.put("I", _i);
 BA.debugLineNum = 112;BA.debugLine="Bytes = Abs(Bytes)";
Debug.ShouldStop(32768);
_bytes = BA.numberCast(float.class, fileutility.__c.runMethod(true,"Abs",(Object)(BA.numberCast(double.class, _bytes))));Debug.locals.put("Bytes", _bytes);
 BA.debugLineNum = 114;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
Debug.ShouldStop(131072);
_i = BA.numberCast(int.class, fileutility.__c.runMethod(true,"Floor",(Object)(fileutility.__c.runMethod(true,"Logarithm",(Object)(BA.numberCast(double.class, _bytes)),(Object)(BA.numberCast(double.class, 1024))))));Debug.locals.put("I", _i);
 BA.debugLineNum = 115;BA.debugLine="Po = Power(1024, I)";
Debug.ShouldStop(262144);
_po = fileutility.__c.runMethod(true,"Power",(Object)(BA.numberCast(double.class, 1024)),(Object)(BA.numberCast(double.class, _i)));Debug.locals.put("Po", _po);
 BA.debugLineNum = 116;BA.debugLine="Si = Bytes / Po";
Debug.ShouldStop(524288);
_si = RemoteObject.solve(new RemoteObject[] {_bytes,_po}, "/",0, 0);Debug.locals.put("Si", _si);
 BA.debugLineNum = 118;BA.debugLine="Return NumberFormat(Si, 1, 3) & Unit(I)";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.concat(fileutility.__c.runMethod(true,"NumberFormat",(Object)(_si),(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 3))),_unit.getArrayElement(true,_i));
 };
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
fileutility._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _sizeofcurrentfilesinfolder(RemoteObject _dir) throws Exception{
try {
		Debug.PushSubsStack("SizeOfCurrentFilesInFolder (fileutility) ","fileutility",19,fileutility.ba,fileutility.mostCurrent,19);
if (RapidSub.canDelegate("sizeofcurrentfilesinfolder")) { return Punchline.Tech.Cuppy.Framework.fileutility.remoteMe.runUserSub(false, "fileutility","sizeofcurrentfilesinfolder", _dir);}
RemoteObject _total = RemoteObject.createImmutable(0L);
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 19;BA.debugLine="Public Sub SizeOfCurrentFilesInFolder(dir As Strin";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="Dim total As Long";
Debug.ShouldStop(1048576);
_total = RemoteObject.createImmutable(0L);Debug.locals.put("total", _total);
 BA.debugLineNum = 23;BA.debugLine="For Each filename As String In File.ListFiles(dir";
Debug.ShouldStop(4194304);
{
final RemoteObject group2 = fileutility.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_dir));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_filename = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("filename", _filename);
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 25;BA.debugLine="If File.IsDirectory(dir, filename) = False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",fileutility.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_dir),(Object)(_filename)),fileutility.__c.getField(true,"False"))) { 
 BA.debugLineNum = 27;BA.debugLine="total = total + File.Size(dir , filename)";
Debug.ShouldStop(67108864);
_total = RemoteObject.solve(new RemoteObject[] {_total,fileutility.__c.getField(false,"File").runMethod(true,"Size",(Object)(_dir),(Object)(_filename))}, "+",1, 2);Debug.locals.put("total", _total);
 };
 }
}Debug.locals.put("filename", _filename);
;
 BA.debugLineNum = 33;BA.debugLine="Return total";
Debug.ShouldStop(1);
if (true) return _total;
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("SizeOfFilesInFolder (fileutility) ","fileutility",19,fileutility.ba,fileutility.mostCurrent,43);
if (RapidSub.canDelegate("sizeoffilesinfolder")) { return Punchline.Tech.Cuppy.Framework.fileutility.remoteMe.runUserSub(false, "fileutility","sizeoffilesinfolder", _dir);}
RemoteObject _total = RemoteObject.createImmutable(0L);
RemoteObject _filename = RemoteObject.createImmutable("");
Debug.locals.put("dir", _dir);
 BA.debugLineNum = 43;BA.debugLine="Public Sub SizeOfFilesInFolder(dir As String) As L";
Debug.ShouldStop(1024);
 BA.debugLineNum = 45;BA.debugLine="Dim total As Long";
Debug.ShouldStop(4096);
_total = RemoteObject.createImmutable(0L);Debug.locals.put("total", _total);
 BA.debugLineNum = 47;BA.debugLine="For Each filename As String In File.ListFiles(dir";
Debug.ShouldStop(16384);
{
final RemoteObject group2 = fileutility.__c.getField(false,"File").runMethod(false,"ListFiles",(Object)(_dir));
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_filename = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("filename", _filename);
Debug.locals.put("filename", _filename);
 BA.debugLineNum = 49;BA.debugLine="If File.IsDirectory(dir, filename) = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",fileutility.__c.getField(false,"File").runMethod(true,"IsDirectory",(Object)(_dir),(Object)(_filename)),fileutility.__c.getField(true,"False"))) { 
 BA.debugLineNum = 51;BA.debugLine="total = total + File.Size(dir, filename)";
Debug.ShouldStop(262144);
_total = RemoteObject.solve(new RemoteObject[] {_total,fileutility.__c.getField(false,"File").runMethod(true,"Size",(Object)(_dir),(Object)(_filename))}, "+",1, 2);Debug.locals.put("total", _total);
 }else {
 BA.debugLineNum = 55;BA.debugLine="total = total + SizeOfFilesInFolder(dir & \"\\\" &";
Debug.ShouldStop(4194304);
_total = RemoteObject.solve(new RemoteObject[] {_total,_sizeoffilesinfolder(RemoteObject.concat(_dir,RemoteObject.createImmutable("\\"),_filename))}, "+",1, 2);Debug.locals.put("total", _total);
 };
 }
}Debug.locals.put("filename", _filename);
;
 BA.debugLineNum = 61;BA.debugLine="Return total";
Debug.ShouldStop(268435456);
if (true) return _total;
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}