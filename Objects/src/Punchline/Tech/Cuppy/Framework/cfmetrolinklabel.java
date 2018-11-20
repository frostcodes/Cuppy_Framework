package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmetrolinklabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmetrolinklabel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmetrolinklabel.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.LabelWrapper _innerlabel = null;
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="InnerLabel.PrefWidth = Width";
__ref._innerlabel.setPrefWidth(_width);
RDebugUtils.currentLine=14221315;
 //BA.debugLineNum = 14221315;BA.debugLine="InnerLabel.PrefHeight =  Height";
__ref._innerlabel.setPrefHeight(_height);
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=14221319;
 //BA.debugLineNum = 14221319;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="Public InnerLabel As Label";
_innerlabel = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=14024710;
 //BA.debugLineNum = 14024710;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="mBase.LoadLayout(\"CFMetroLinkLabelUI\")";
__ref._mbase.LoadLayout(ba,"CFMetroLinkLabelUI");
RDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="setTextColor(CFStyleManager.DefaultTheme.Get(\"pri";
__ref._settextcolor(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary_text"))));
RDebugUtils.currentLine=14155782;
 //BA.debugLineNum = 14155782;BA.debugLine="InnerLabel.Font = CFStyleManager.SelectFont(\"Regu";
__ref._innerlabel.setFont(_cfstylemanager._selectfont("Regular",12));
RDebugUtils.currentLine=14155783;
 //BA.debugLineNum = 14155783;BA.debugLine="InnerLabel.MouseCursor = fx.Cursors.HAND";
__ref._innerlabel.setMouseCursor(__ref._fx.Cursors.HAND);
RDebugUtils.currentLine=14155786;
 //BA.debugLineNum = 14155786;BA.debugLine="setLink(Props.Get(\"Link\"))";
__ref._setlink(null,BA.ObjectToString(_props.Get((Object)("Link"))));
RDebugUtils.currentLine=14155788;
 //BA.debugLineNum = 14155788;BA.debugLine="End Sub";
return "";
}
public String  _settextcolor(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "settextcolor"))
	 {return ((String) Debug.delegate(ba, "settextcolor", new Object[] {_color}));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Public Sub setTextColor(color As String)";
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="CFControlsUtils.setTextColor (InnerLabel, color)";
_cfcontrolsutils._settextcolor((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerlabel.getObject())),_color);
RDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="End Sub";
return "";
}
public String  _setlink(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref,String _link) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "setlink"))
	 {return ((String) Debug.delegate(ba, "setlink", new Object[] {_link}));}
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Public Sub setLink(link As String)";
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="InnerLabel.Text = link";
__ref._innerlabel.setText(_link);
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="End Sub";
return null;
}
public String  _getlink(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "getlink"))
	 {return ((String) Debug.delegate(ba, "getlink", null));}
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Public Sub getLink() As String";
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="Return InnerLabel.Text";
if (true) return __ref._innerlabel.getText();
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="End Sub";
return "";
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="End Sub";
return "";
}
public String  _innerlabel_mousepressed(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "innerlabel_mousepressed"))
	 {return ((String) Debug.delegate(ba, "innerlabel_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub InnerLabel_MousePressed (EventData As";
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="InnerLabel.RequestFocus 'set focus";
__ref._innerlabel.RequestFocus();
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="fx.ShowExternalDocument(InnerLabel.Text)";
__ref._fx.ShowExternalDocument(__ref._innerlabel.getText());
RDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MousePressed",(Object)(_eventdata));
RDebugUtils.currentLine=14942216;
 //BA.debugLineNum = 14942216;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="CFControlsUtils.removeEffect(InnerLabel)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerlabel.getObject())));
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="CFControlsUtils.SetBg( InnerLabel, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerlabel.getObject())),_color);
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="CFControlsUtils.setBorder(InnerLabel, color, widt";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerlabel.getObject())),_color,_width);
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="CFControlsUtils.setBorderRadius(InnerLabel, radiu";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerlabel.getObject())),_radius);
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="CFControlsUtils.setEffect(InnerLabel, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerlabel.getObject())),_effect);
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmetrolinklabel __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmetrolinklabel";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="CFControlsUtils.setRotation(InnerLabel, angle) 'r";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerlabel.getObject())),_angle);
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="End Sub";
return "";
}
}