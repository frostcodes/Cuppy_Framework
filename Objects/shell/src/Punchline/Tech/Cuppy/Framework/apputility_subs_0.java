package Punchline.Tech.Cuppy.Framework;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class apputility_subs_0 {


public static RemoteObject  _getpackagename(RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("GetPackageName (apputility) ","apputility",15,apputility.ba,apputility.mostCurrent,10);
if (RapidSub.canDelegate("getpackagename")) { return Punchline.Tech.Cuppy.Framework.apputility.remoteMe.runUserSub(false, "apputility","getpackagename", _module);}
RemoteObject _modjo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
RemoteObject _mostr = RemoteObject.createImmutable("");
Debug.locals.put("Module", _module);
 BA.debugLineNum = 10;BA.debugLine="Public Sub GetPackageName(Module As Object) As Str";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Dim ModJo As JavaObject = Module";
Debug.ShouldStop(1024);
_modjo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_modjo.setObject(_module);Debug.locals.put("ModJo", _modjo);
 BA.debugLineNum = 12;BA.debugLine="Dim MoStr As String = ModJo.RunMethod(\"toString\",";
Debug.ShouldStop(2048);
_mostr = BA.ObjectToString(_modjo.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("toString")),(Object)((apputility.__c.getField(false,"Null")))));Debug.locals.put("MoStr", _mostr);Debug.locals.put("MoStr", _mostr);
 BA.debugLineNum = 13;BA.debugLine="Return MoStr.SubString2(MoStr.LastIndexOf(\" \")+1,";
Debug.ShouldStop(4096);
if (true) return _mostr.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_mostr.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(" "))),RemoteObject.createImmutable(1)}, "+",1, 1)),(Object)(_mostr.runMethod(true,"lastIndexOf",(Object)(RemoteObject.createImmutable(".")))));
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
apputility._fx = RemoteObject.createNew ("anywheresoftware.b4j.objects.JFX");
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}