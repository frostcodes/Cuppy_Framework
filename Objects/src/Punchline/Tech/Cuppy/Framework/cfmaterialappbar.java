package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialappbar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialappbar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialappbar.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _innerpane = null;
public anywheresoftware.b4j.objects.ButtonWrapper _innerbutton = null;
public anywheresoftware.b4j.objects.LabelWrapper _titlelabel = null;
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=655361;
 //BA.debugLineNum = 655361;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=655363;
 //BA.debugLineNum = 655363;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Public InnerPane As Pane";
_innerpane = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=655367;
 //BA.debugLineNum = 655367;BA.debugLine="Public InnerButton As Button";
_innerbutton = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=655368;
 //BA.debugLineNum = 655368;BA.debugLine="Public TitleLabel As Label";
_titlelabel = new anywheresoftware.b4j.objects.LabelWrapper();
RDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="mBase.LoadLayout(\"CFMaterialAppBarUI\")";
__ref._mbase.LoadLayout(ba,"CFMaterialAppBarUI");
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"primary\"))";
__ref._setbg(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("primary"))));
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="TitleLabel.Font = CFStyleManager.SelectFont(\"Blac";
__ref._titlelabel.setFont(_cfstylemanager._selectfont("Black",14));
RDebugUtils.currentLine=786440;
 //BA.debugLineNum = 786440;BA.debugLine="setTitle(Props.Get(\"Title\"))";
__ref._settitle(null,BA.ObjectToString(_props.Get((Object)("Title"))));
RDebugUtils.currentLine=786441;
 //BA.debugLineNum = 786441;BA.debugLine="setEnableShadow(Props.Get(\"EnableShadow\"))";
__ref._setenableshadow(null,BA.ObjectToBoolean(_props.Get((Object)("EnableShadow"))));
RDebugUtils.currentLine=786443;
 //BA.debugLineNum = 786443;BA.debugLine="setHideIcon(Props.Get(\"HideIcon\"))";
__ref._sethideicon(null,BA.ObjectToBoolean(_props.Get((Object)("HideIcon"))));
RDebugUtils.currentLine=786444;
 //BA.debugLineNum = 786444;BA.debugLine="setHideTitle(Props.Get(\"HideTitle\"))";
__ref._sethidetitle(null,BA.ObjectToBoolean(_props.Get((Object)("HideTitle"))));
RDebugUtils.currentLine=786446;
 //BA.debugLineNum = 786446;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="CFControlsUtils.SetBG( Label1,  color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._label1.getObject())),_color);
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="CFControlsUtils.SetBG( InnerPane, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerpane.getObject())),_color);
RDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="End Sub";
return "";
}
public String  _settitle(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,String _title) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "settitle"))
	 {return ((String) Debug.delegate(ba, "settitle", new Object[] {_title}));}
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Public Sub setTitle(Title As String)";
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="TitleLabel.Text = Title";
__ref._titlelabel.setText(_title);
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="End Sub";
return "";
}
public String  _setenableshadow(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,boolean _boolval) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "setenableshadow"))
	 {return ((String) Debug.delegate(ba, "setenableshadow", new Object[] {_boolval}));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Public Sub setEnableShadow(BoolVal As Boolean)";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Label1.Visible = BoolVal";
__ref._label1.setVisible(_boolval);
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="End Sub";
return "";
}
public String  _sethideicon(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,boolean _boolval) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "sethideicon"))
	 {return ((String) Debug.delegate(ba, "sethideicon", new Object[] {_boolval}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub setHideIcon(BoolVal As Boolean)";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="InnerButton.Visible = Not(BoolVal)";
__ref._innerbutton.setVisible(__c.Not(_boolval));
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="End Sub";
return "";
}
public String  _sethidetitle(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,boolean _boolval) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "sethidetitle"))
	 {return ((String) Debug.delegate(ba, "sethidetitle", new Object[] {_boolval}));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Public Sub setHideTitle(BoolVal As Boolean)";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="TitleLabel.Visible = Not(BoolVal)";
__ref._titlelabel.setVisible(__c.Not(_boolval));
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="End Sub";
return null;
}
public String  _geticon(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "geticon"))
	 {return ((String) Debug.delegate(ba, "geticon", null));}
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Public Sub getIcon As String";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Return InnerButton.Text";
if (true) return __ref._innerbutton.getText();
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="End Sub";
return "";
}
public boolean  _getshadowenabled(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "getshadowenabled"))
	 {return ((Boolean) Debug.delegate(ba, "getshadowenabled", null));}
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Public Sub getShadowEnabled As Boolean";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Return Label1.Visible";
if (true) return __ref._label1.getVisible();
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="End Sub";
return false;
}
public String  _gettitle(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "gettitle"))
	 {return ((String) Debug.delegate(ba, "gettitle", null));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub getTitle As String";
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Return TitleLabel.Text";
if (true) return __ref._titlelabel.getText();
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="End Sub";
return "";
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mousepressed(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "innerbutton_mousepressed"))
	 {return ((String) Debug.delegate(ba, "innerbutton_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Private Sub InnerButton_MousePressed (EventData As";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="InnerButton.RequestFocus 'set focus";
__ref._innerbutton.RequestFocus();
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MousePressed",(Object)(_eventdata));
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="End Sub";
return "";
}
public String  _innerpane_mousepressed(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "innerpane_mousepressed"))
	 {return ((String) Debug.delegate(ba, "innerpane_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Private Sub InnerPane_MousePressed (EventData As M";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="InnerPane.RequestFocus 'set focus";
__ref._innerpane.RequestFocus();
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_PaneMou";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_PaneMousePressed",(Object)(_eventdata));
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="CFControlsUtils.removeEffect(Label1)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._label1.getObject())));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="CFControlsUtils.setBorder(Label1, color, width)";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._label1.getObject())),_color,_width);
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="CFControlsUtils.setBorder(InnerPane, color, width";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerpane.getObject())),_color,_width);
RDebugUtils.currentLine=1114117;
 //BA.debugLineNum = 1114117;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="CFControlsUtils.setBorderRadius(Label1, radius)";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._label1.getObject())),_radius);
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="CFControlsUtils.setBorderRadius(InnerPane, radius";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerpane.getObject())),_radius);
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="CFControlsUtils.setEffect(Label1, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._label1.getObject())),_effect);
RDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="End Sub";
return "";
}
public String  _seticon(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,String _icontext) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "seticon"))
	 {return ((String) Debug.delegate(ba, "seticon", new Object[] {_icontext}));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Public Sub setIcon(IconText As String)";
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="InnerButton.Text = IconText";
__ref._innerbutton.setText(_icontext);
RDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmaterialappbar __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialappbar";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="CFControlsUtils.setRotation(Label1, angle) 'rotat";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._label1.getObject())),_angle);
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="CFControlsUtils.setRotation(InnerPane , angle) 'r";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerpane.getObject())),_angle);
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="End Sub";
return "";
}
}