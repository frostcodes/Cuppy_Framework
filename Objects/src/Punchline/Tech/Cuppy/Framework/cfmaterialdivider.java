package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialdivider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialdivider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialdivider.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _vvvvvvvvvvvvvvvv2 = null;
public String _vvvvvvvvvvvvvvvvvvv3 = "";
public Object _vvvvvvvvvvvvvvvvvvv4 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _vvvvvvvvvvvvvvvvvvv5 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _line = null;
public b4j.example.cssutils _vvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfconfigs _vvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfstylemanager _vvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfstringutility _vvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cffileutility _vvvvvvvvvvvvvvvv7 = null;
public Punchline.Tech.Cuppy.Framework.cfmathutility _vvvvvvvvvvvvvvvv0 = null;
public Punchline.Tech.Cuppy.Framework.cfdatatypeutility _vvvvvvvvvvvvvvvvv1 = null;
public Punchline.Tech.Cuppy.Framework.cfanimationmanager _vvvvvvvvvvvvvvvvv2 = null;
public Punchline.Tech.Cuppy.Framework.cflicensemanager _vvvvvvvvvvvvvvvvv3 = null;
public Punchline.Tech.Cuppy.Framework.cfdatageneratorutility _vvvvvvvvvvvvvvvvv4 = null;
public Punchline.Tech.Cuppy.Framework.cfapputility _vvvvvvvvvvvvvvvvv5 = null;
public Punchline.Tech.Cuppy.Framework.cfcontrolsutils _vvvvvvvvvvvvvvvvv6 = null;
public Punchline.Tech.Cuppy.Framework.cfhtmlutility _vvvvvvvvvvvvvvvvv7 = null;
public String  _base_resize(double _width,double _height) throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
 //BA.debugLineNum = 41;BA.debugLine="line.PrefWidth = Width";
_line.setPrefWidth(_width);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Private fx As JFX";
_vvvvvvvvvvvvvvvv2 = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 9;BA.debugLine="Private mEventName As String 'ignore";
_vvvvvvvvvvvvvvvvvvv3 = "";
 //BA.debugLineNum = 10;BA.debugLine="Private mCallBack As Object 'ignore";
_vvvvvvvvvvvvvvvvvvv4 = new Object();
 //BA.debugLineNum = 11;BA.debugLine="Private mBase As Pane";
_vvvvvvvvvvvvvvvvvvv5 = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Public line As Pane";
_line = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
 //BA.debugLineNum = 21;BA.debugLine="mBase = Base";
_vvvvvvvvvvvvvvvvvvv5 = _base;
 //BA.debugLineNum = 22;BA.debugLine="mBase.LoadLayout(\"CFMaterialDividerUI\")";
_vvvvvvvvvvvvvvvvvvv5.LoadLayout(ba,"CFMaterialDividerUI");
 //BA.debugLineNum = 24;BA.debugLine="SetBg(CFStyleManager.DefaultTheme.Get(\"divider\"))";
_vvvvvvvvvvvvvv7(BA.ObjectToString(_vvvvvvvvvvvvvvvv5._vv5.Get((Object)("divider"))));
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _vvvvvvvvvvvvvvvvvv1() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub GetBase As Pane";
 //BA.debugLineNum = 46;BA.debugLine="Return mBase";
if (true) return _vvvvvvvvvvvvvvvvvvv5;
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public double  _vvvvvvvvvvvvvvvvvvvvv7() throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Public Sub getSize() As Double";
 //BA.debugLineNum = 104;BA.debugLine="Return line.PrefHeight";
if (true) return _line.getPrefHeight();
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return 0;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
 //BA.debugLineNum = 16;BA.debugLine="mEventName = EventName";
_vvvvvvvvvvvvvvvvvvv3 = _eventname;
 //BA.debugLineNum = 17;BA.debugLine="mCallBack = Callback";
_vvvvvvvvvvvvvvvvvvv4 = _callback;
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return "";
}
public String  _line_mousepressed(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub line_MousePressed (EventData As MouseEvent)";
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvv3() throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Public Sub removeEffects()";
 //BA.debugLineNum = 88;BA.debugLine="CFControlsUtils.removePaneEffect(line)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvv5(_line);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv7(String _color) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub SetBg(color As String)";
 //BA.debugLineNum = 56;BA.debugLine="CSSUtils.SetStyleProperty( line, \"-fx-background-";
_vvvvvvvvvvvvvvvv3._setstyleproperty((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(_line.getObject())),"-fx-background-color",_color);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvv0(String _color,int _width) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub setBorder(color As String , width As In";
 //BA.debugLineNum = 68;BA.debugLine="CFControlsUtils.setPaneBorder(line, color, width)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv4(_line,_color,_width);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvv6(int _radius) throws Exception{
 //BA.debugLineNum = 73;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
 //BA.debugLineNum = 75;BA.debugLine="CFControlsUtils.setPaneBorderRadius(line, radius)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv5(_line,_radius);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv1(String _effect) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Public Sub setPaneEffect(effect As String)";
 //BA.debugLineNum = 82;BA.debugLine="CFControlsUtils.setPaneEffect(line, effect)";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv6(_line,_effect);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return "";
}
public String  _setvvvvvvvvvvvvvvvvvvv2(float _angle) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Public Sub setRotationX(angle As Float)";
 //BA.debugLineNum = 62;BA.debugLine="CFControlsUtils.setPaneRotationX(line, angle) 'ro";
_vvvvvvvvvvvvvvvvv6._vvvvvvvvvvvvvvv7(_line,_angle);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _vvvvvvvvvvvvvvvvvvvvv0(int _sizex) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Public Sub setSize(sizeX As Int)";
 //BA.debugLineNum = 98;BA.debugLine="line.PrefHeight =  sizeX";
_line.setPrefHeight(_sizex);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
