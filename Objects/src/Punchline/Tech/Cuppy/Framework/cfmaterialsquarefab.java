package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialsquarefab extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public String _meventname = "";
public Object _mcallback = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _mbase = null;
public anywheresoftware.b4j.objects.LabelWrapper _fab_btn = null;
public b4j.example.cssutils _cssutils = null;
public Punchline.Tech.Cuppy.Framework.main _main = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _cfconfigs = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _cfstringutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _cfdatageneratorutility = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _cffileutility = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _cfstylemanager = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _cfcontrolsutils = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _cfanimationmanager = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _cfmathutility = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _cfdatatypeutility = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _cfapputility = null;
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="FAB_Btn.PrefWidth = Width";
__ref._fab_btn.setPrefWidth(_width);
RDebugUtils.currentLine=20250628;
 //BA.debugLineNum = 20250628;BA.debugLine="FAB_Btn.PrefHeight = Width";
__ref._fab_btn.setPrefHeight(_width);
RDebugUtils.currentLine=20250630;
 //BA.debugLineNum = 20250630;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=20250632;
 //BA.debugLineNum = 20250632;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
RDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="Public FAB_Btn As Label";
_fab_btn = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=20054022;
 //BA.debugLineNum = 20054022;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=20185088;
 //BA.debugLineNum = 20185088;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="mBase.LoadLayout(\"CFMaterialSquareFABUI\")";
__ref._mbase.LoadLayout(ba,"CFMaterialSquareFABUI");
RDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"accent\"))";
__ref._setbg(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("accent"))));
RDebugUtils.currentLine=20185093;
 //BA.debugLineNum = 20185093;BA.debugLine="setRotation(135) 'rotate by default";
__ref._setrotation(null,(float) (135));
RDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="CFControlsUtils.SetBG( FAB_Btn, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._fab_btn.getObject())),_color);
RDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=20447234;
 //BA.debugLineNum = 20447234;BA.debugLine="CFControlsUtils.setRotation(FAB_Btn, angle) 'rota";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._fab_btn.getObject())),_angle);
RDebugUtils.currentLine=20447236;
 //BA.debugLineNum = 20447236;BA.debugLine="End Sub";
return "";
}
public String  _fab_btn_mouseentered(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "fab_btn_mouseentered"))
	 {return ((String) Debug.delegate(ba, "fab_btn_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Private Sub FAB_Btn_MouseEntered (EventData As Mou";
RDebugUtils.currentLine=20971522;
 //BA.debugLineNum = 20971522;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MouseEntered",(Object)(_eventdata));
RDebugUtils.currentLine=20971524;
 //BA.debugLineNum = 20971524;BA.debugLine="End Sub";
return "";
}
public String  _fab_btn_mouseexited(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "fab_btn_mouseexited"))
	 {return ((String) Debug.delegate(ba, "fab_btn_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Private Sub FAB_Btn_MouseExited (EventData As Mous";
RDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MouseExited",(Object)(_eventdata));
RDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="End Sub";
return "";
}
public String  _fab_btn_mousepressed(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "fab_btn_mousepressed"))
	 {return ((String) Debug.delegate(ba, "fab_btn_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Private Sub FAB_Btn_MousePressed (EventData As Mou";
RDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="FAB_Btn.RequestFocus 'set focus";
__ref._fab_btn.RequestFocus();
RDebugUtils.currentLine=20905988;
 //BA.debugLineNum = 20905988;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MousePressed",(Object)(_eventdata));
RDebugUtils.currentLine=20905990;
 //BA.debugLineNum = 20905990;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=20316161;
 //BA.debugLineNum = 20316161;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=20316162;
 //BA.debugLineNum = 20316162;BA.debugLine="End Sub";
return null;
}
public String  _geticon(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "geticon"))
	 {return ((String) Debug.delegate(ba, "geticon", null));}
RDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Public Sub getIcon As String";
RDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="Return FAB_Btn.Text";
if (true) return __ref._fab_btn.getText();
RDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="End Sub";
return "";
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="CFControlsUtils.removeEffect(FAB_Btn)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._fab_btn.getObject())));
RDebugUtils.currentLine=20709380;
 //BA.debugLineNum = 20709380;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="CFControlsUtils.setBorder(FAB_Btn, color, width)";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._fab_btn.getObject())),_color,_width);
RDebugUtils.currentLine=20512772;
 //BA.debugLineNum = 20512772;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="CFControlsUtils.setBorderRadius(FAB_Btn, radius)";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._fab_btn.getObject())),_radius);
RDebugUtils.currentLine=20578308;
 //BA.debugLineNum = 20578308;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=20643840;
 //BA.debugLineNum = 20643840;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="CFControlsUtils.setEffect(FAB_Btn, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._fab_btn.getObject())),_effect);
RDebugUtils.currentLine=20643844;
 //BA.debugLineNum = 20643844;BA.debugLine="End Sub";
return "";
}
public String  _seticon(Punchline.Tech.Cuppy.Framework.cfmaterialsquarefab __ref,String _icontext) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialsquarefab";
if (Debug.shouldDelegate(ba, "seticon"))
	 {return ((String) Debug.delegate(ba, "seticon", new Object[] {_icontext}));}
RDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Public Sub setIcon(IconText As String)";
RDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="FAB_Btn.Text = IconText";
__ref._fab_btn.setText(_icontext);
RDebugUtils.currentLine=20774916;
 //BA.debugLineNum = 20774916;BA.debugLine="End Sub";
return "";
}
}