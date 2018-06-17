Type=Class
Version=5.51
ModulesStructureVersion=1
B4J=true
@EndOfDesignText@
'Custom View class
 
#Event: MousePressed (EventData As MouseEvent)

#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Public InnerButton As Button
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("MaterialButtonLayout")
	'set using theme...
	SetBg(StyleManager.DefaultTheme.Get("accent"))
	InnerButton.Font = StyleManager.DefaultFont
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	InnerButton.PrefWidth = Width
	InnerButton.PrefHeight =  Height
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region


Public Sub InnerButton_MousePressed (EventData As MouseEvent)
	  
	CallSub2(mCallBack, mEventName & "_MousePressed", EventData) 'ignore
	 
End Sub


#Region Actions and Effects

Public Sub SetBg(color As String)
 
	CSSUtils.SetStyleProperty( InnerButton, "-fx-background-color", color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
	ControlsUtils.setRotationX(InnerButton, angle) 'rotate
	 
End Sub
  
Public Sub setBorder(color As String , width As Int)
	
	ControlsUtils.setBorder(InnerButton, color, width)

End Sub


Sub setBorderRadius(radius As Int)
	
	ControlsUtils.setBorderRadius(InnerButton, radius)
	
End Sub


Public Sub setPaneEffect(effect As String)
	
	ControlsUtils.setEffect(InnerButton, effect)
	
End Sub

Public Sub removeEffects()
	
	ControlsUtils.removeEffect(InnerButton)
	
End Sub

#End Region

