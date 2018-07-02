Type=Class
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
 'Custom View class
 
'#Event: MousePressed (EventData As MouseEvent)

#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
'	Public InnerLabel As Label
	Private ContentPane As Pane
	Private TopPane As Pane
	Private Container As Pane
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("MetroFormUI")
	
	
	
	'set using theme...
 
	'setTextColor(StyleManager.DefaultTheme.Get("primary_text"))
	'InnerLabel.Font = StyleManager.SelectFont("Regular", 12)
	
	
'	Dim ParentForm As Form = mBase.Parent.pa
'	
'	ParentForm.SetFormStyle("UNDECORATED")
'	
	
	CSSUtils.SetStyleProperty(Container, "-fx-effect", "dropshadow(three-pass-box, derive(gray, -20%), 10, 0, 4, 4)")
	'CSSUtils.SetStyleProperty(Container, "-fx-background-color", "derive(cadetblue, -20%)")
	
	CSSUtils.SetStyleProperty(Container, "-fx-background-insets", "12")
	CSSUtils.SetStyleProperty(Container, "-fx-background-radius", "6")
	
	 
''	-fx-effect: dropshadow(three-pass-box, derive(cadetblue, -20%), 10, 0, 4, 4);
'	-fx-background-color: derive(cadetblue, -20%);
'	-fx-background-insets: 12;
'	-fx-background-radius: 6;
'	
'	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
'	InnerLabel.PrefWidth = Width
'	InnerLabel.PrefHeight =  Height
'	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

'#Region Actions and Effects
' 
'Public Sub SetBg(color As String)
' 
'	ControlsUtils.SetBg( InnerLabel, color)
' 
'End Sub
'
'Public Sub setTextColor(color As String)
' 
'	ControlsUtils.setTextColor (InnerLabel, color)
' 
'End Sub
'
'Public Sub setRotationX(angle As Float)
'	
'	ControlsUtils.setRotationX(InnerLabel, angle) 'rotate
'	 
'End Sub
'  
'Public Sub setBorder(color As String , width As Int)
'	
'	ControlsUtils.setBorder(InnerLabel, color, width)
'
'End Sub
'
'
'Public Sub setBorderRadius(radius As Int)
'	
'	ControlsUtils.setBorderRadius(InnerLabel, radius)
'	
'End Sub
'
'
'Public Sub setEffect(effect As String)
'	
'	ControlsUtils.setEffect(InnerLabel, effect)
'	
'End Sub
'
'Public Sub removeEffects()
'	
'	ControlsUtils.removeEffect(InnerLabel)
'	
'End Sub
'
'#End Region


Public Sub InnerLabel_MousePressed (EventData As MouseEvent)
	
'	fx.ShowExternalDocument(InnerLabel.Text)
	  
'	CallSubDelayed2(mCallBack, mEventName & "_MousePressed", EventData) 'ignore
	 
End Sub



