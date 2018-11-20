package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cfapputility_subs_0 {


public static RemoteObject  _getpackagename(RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("GetPackageName (cfapputility) ","cfapputility",28,cfapputility.ba,cfapputility.mostCurrent,9);
if (RapidSub.canDelegate("getpackagename")) { return Punchline.Tech.Cuppy.Framework.cfapputility.remoteMe.runUserSub(false, "cfapputility","getpackagename", _module);}
RemoteObject _modjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _mostr = RemoteObject.createImmutable("");
Debug.locals.put("Module", _module);
 BA.debugLineNum = 9;BA.debugLine="Public Sub GetPackageName(Module As Object) As Str";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Dim ModJo As JavaObject = Module";
Debug.ShouldStop(512);
_modjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_modjo.setObject(_module);Debug.locals.put("ModJo", _modjo);
 BA.debugLineNum = 11;BA.debugLine="Dim MoStr As String = ModJo.RunMethod(\"toString\",";
Debug.ShouldStop(1024);
_mostr = BA.ObjectToString(_modjo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toString")),(Object)((cfapputility.__c.getField(false,"Null")))));Debug.locals.put("MoStr", _mostr);Debug.locals.put("MoStr", _mostr);
 BA.debugLineNum = 12;BA.debugLine="Return MoStr.SubString2(MoStr.LastIndexOf(\" \")+1,";
Debug.ShouldStop(2048);
if (true) return _mostr.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mostr.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(" "))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_mostr.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")))));
 BA.debugLineNum = 13;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
cfapputility._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}