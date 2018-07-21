B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
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
	SetBg(CFStyleManager.DefaultTheme.Get("accent"))
	InnerButton.Font = CFStyleManager.DefaultFont
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	InnerButton.PrefWidth = Width
	InnerButton.PrefHeight =  Height
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects
 
Public Sub SetBg(color As String)
 
	CSSUtils.SetStyleProperty( InnerButton, "-fx-background-color", color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
	CFControlsUtils.setRotationX(InnerButton, angle) 'rotate
	 
End Sub
  
Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(InnerButton, color, width)

End Sub


Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(InnerButton, radius)
	
End Sub


Public Sub setEffect(effect As String)
	
	CFControlsUtils.setEffect(InnerButton, effect)
	
End Sub

Public Sub removeEffects()
	
	CFControlsUtils.removeEffect(InnerButton)
	
End Sub

#End Region


Public Sub InnerButton_MousePressed (EventData As MouseEvent)
	  
	CallSubDelayed2(mCallBack, mEventName & "_MousePressed", EventData) 'ignore
	 
End Sub

