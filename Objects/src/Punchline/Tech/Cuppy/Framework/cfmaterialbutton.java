package Punchline.Tech.Cuppy.Framework;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class cfmaterialbutton extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.ShellBA("Punchline.Tech.Cuppy.Framework", "Punchline.Tech.Cuppy.Framework.cfmaterialbutton", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", Punchline.Tech.Cuppy.Framework.cfmaterialbutton.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4j.objects.ButtonWrapper _innerbutton = null;
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
public String  _base_resize(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "base_resize"))
	 {return ((String) Debug.delegate(ba, "base_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
RDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="InnerButton.PrefWidth = Width";
__ref._innerbutton.setPrefWidth(_width);
RDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="InnerButton.PrefHeight =  Height";
__ref._innerbutton.setPrefHeight(_height);
RDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="CallSubDelayed3(mCallBack, mEventName & \"_Resize\"";
__c.CallSubDelayed3(ba,__ref._mcallback,__ref._meventname+"_Resize",(Object)(_width),(Object)(_height));
RDebugUtils.currentLine=18153479;
 //BA.debugLineNum = 18153479;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
RDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
RDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="Private mEventName As String 'ignore";
_meventname = "";
RDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="Private mCallBack As Object 'ignore";
_mcallback = new Object();
RDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="Private mBase As Pane";
_mbase = new anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper();
RDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="Public InnerButton As Button";
_innerbutton = new anywheresoftware.b4j.objects.ButtonWrapper();
RDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref,anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper _base,anywheresoftware.b4j.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "designercreateview"))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
RDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Public Sub DesignerCreateView (Base As Pane, Lbl A";
RDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="mBase = Base";
__ref._mbase = _base;
RDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="mBase.LoadLayout(\"CFMaterialButtonUI\")";
__ref._mbase.LoadLayout(ba,"CFMaterialButtonUI");
RDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="setBg(CFStyleManager.DefaultTheme.Get(\"accent\"))";
__ref._setbg(null,BA.ObjectToString(_cfstylemanager._defaulttheme.Get((Object)("accent"))));
RDebugUtils.currentLine=18087942;
 //BA.debugLineNum = 18087942;BA.debugLine="InnerButton.Font = CFStyleManager.FONT_REGULAR_FO";
__ref._innerbutton.setFont(_cfstylemanager._font_regular_font);
RDebugUtils.currentLine=18087943;
 //BA.debugLineNum = 18087943;BA.debugLine="InnerButton.MouseCursor = fx.Cursors.HAND";
__ref._innerbutton.setMouseCursor(__ref._fx.Cursors.HAND);
RDebugUtils.currentLine=18087945;
 //BA.debugLineNum = 18087945;BA.debugLine="setText(Props.Get(\"Text\"))";
__ref._settext(null,BA.ObjectToString(_props.Get((Object)("Text"))));
RDebugUtils.currentLine=18087947;
 //BA.debugLineNum = 18087947;BA.debugLine="End Sub";
return "";
}
public String  _setbg(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "setbg"))
	 {return ((String) Debug.delegate(ba, "setbg", new Object[] {_color}));}
RDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Public Sub setBg(color As String)";
RDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="CFControlsUtils.SetBG( InnerButton, color)";
_cfcontrolsutils._setbg((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerbutton.getObject())),_color);
RDebugUtils.currentLine=18284548;
 //BA.debugLineNum = 18284548;BA.debugLine="End Sub";
return "";
}
public String  _settext(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "settext"))
	 {return ((String) Debug.delegate(ba, "settext", new Object[] {_text}));}
RDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Public Sub setText(text As String)";
RDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="InnerButton.Text = text";
__ref._innerbutton.setText(_text);
RDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper  _getbase(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "getbase"))
	 {return ((anywheresoftware.b4j.objects.PaneWrapper.ConcretePaneWrapper) Debug.delegate(ba, "getbase", null));}
RDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub GetBase As Pane";
RDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="Return mBase";
if (true) return __ref._mbase;
RDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="End Sub";
return null;
}
public String  _gettext(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "gettext"))
	 {return ((String) Debug.delegate(ba, "gettext", null));}
RDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Public Sub getText() As String";
RDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="Return InnerButton.Text";
if (true) return __ref._innerbutton.getText();
RDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="End Sub";
return "";
}
public String  _initialize(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref,anywheresoftware.b4a.BA _ba,Object _callback,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "initialize"))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_callback,_eventname}));}
RDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
RDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="mEventName = EventName";
__ref._meventname = _eventname;
RDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="mCallBack = Callback";
__ref._mcallback = _callback;
RDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mouseentered(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "innerbutton_mouseentered"))
	 {return ((String) Debug.delegate(ba, "innerbutton_mouseentered", new Object[] {_eventdata}));}
RDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Private Sub InnerButton_MouseEntered (EventData As";
RDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEn";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MouseEntered",(Object)(_eventdata));
RDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mouseexited(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "innerbutton_mouseexited"))
	 {return ((String) Debug.delegate(ba, "innerbutton_mouseexited", new Object[] {_eventdata}));}
RDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Private Sub InnerButton_MouseExited (EventData As";
RDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MouseEx";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MouseExited",(Object)(_eventdata));
RDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="End Sub";
return "";
}
public String  _innerbutton_mousepressed(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref,anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "innerbutton_mousepressed"))
	 {return ((String) Debug.delegate(ba, "innerbutton_mousepressed", new Object[] {_eventdata}));}
RDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Private Sub InnerButton_MousePressed (EventData As";
RDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="InnerButton.RequestFocus 'set focus";
__ref._innerbutton.RequestFocus();
RDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_MousePr";
__c.CallSubDelayed2(ba,__ref._mcallback,__ref._meventname+"_MousePressed",(Object)(_eventdata));
RDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="End Sub";
return "";
}
public String  _removeeffects(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "removeeffects"))
	 {return ((String) Debug.delegate(ba, "removeeffects", null));}
RDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Public Sub RemoveEffects()";
RDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="CFControlsUtils.removeEffect(InnerButton)";
_cfcontrolsutils._removeeffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerbutton.getObject())));
RDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="End Sub";
return "";
}
public String  _setborder(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref,String _color,int _width) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "setborder"))
	 {return ((String) Debug.delegate(ba, "setborder", new Object[] {_color,_width}));}
RDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Public Sub setBorder(color As String , width As In";
RDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="CFControlsUtils.setBorder(InnerButton, color, wid";
_cfcontrolsutils._setborder((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerbutton.getObject())),_color,_width);
RDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="End Sub";
return "";
}
public String  _setborderradius(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref,int _radius) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "setborderradius"))
	 {return ((String) Debug.delegate(ba, "setborderradius", new Object[] {_radius}));}
RDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Public Sub setBorderRadius(radius As Int)";
RDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="CFControlsUtils.setBorderRadius(InnerButton, radi";
_cfcontrolsutils._setborderradius((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerbutton.getObject())),_radius);
RDebugUtils.currentLine=18481156;
 //BA.debugLineNum = 18481156;BA.debugLine="End Sub";
return "";
}
public String  _seteffect(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref,String _effect) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "seteffect"))
	 {return ((String) Debug.delegate(ba, "seteffect", new Object[] {_effect}));}
RDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Public Sub setEffect(effect As String)";
RDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="CFControlsUtils.setEffect(InnerButton, effect)";
_cfcontrolsutils._seteffect((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerbutton.getObject())),_effect);
RDebugUtils.currentLine=18546692;
 //BA.debugLineNum = 18546692;BA.debugLine="End Sub";
return "";
}
public String  _setrotation(Punchline.Tech.Cuppy.Framework.cfmaterialbutton __ref,float _angle) throws Exception{
__ref = this;
RDebugUtils.currentModule="cfmaterialbutton";
if (Debug.shouldDelegate(ba, "setrotation"))
	 {return ((String) Debug.delegate(ba, "setrotation", new Object[] {_angle}));}
RDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Public Sub setRotation(angle As Float)";
RDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="CFControlsUtils.setRotation(InnerButton, angle) '";
_cfcontrolsutils._setrotation((anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.objects.NodeWrapper.ConcreteNodeWrapper(), (javafx.scene.Node)(__ref._innerbutton.getObject())),_angle);
RDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="End Sub";
return "";
}
}