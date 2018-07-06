B4J=true
Group=Cuppy\Controls\Material UI
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class

#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Public InnerCard As Pane
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CardLayout")
	'set using theme...
	setBorder(StyleManager.DefaultTheme.Get("divider"), 1)
	 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
	InnerCard.PrefWidth = Width
	InnerCard.PrefHeight = Height
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects

Public Sub SetBg(color As String)
 
	CSSUtils.SetStyleProperty( InnerCard, "-fx-background-color", color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
	ControlsUtils.setPaneRotationX(InnerCard, angle) 'rotate
	 
End Sub
 
Public Sub setBorder(color As String , width As Int)
	
	ControlsUtils.setPaneBorder(InnerCard, color, width)

End Sub
  
  
  
Public Sub setBorderRadius(radius As Int)
	
	ControlsUtils.setPaneBorderRadius(InnerCard, radius)
	
End Sub


Public Sub setPaneEffect(effect As String)
	
	ControlsUtils.setPaneEffect(InnerCard, effect)
	
End Sub

Public Sub removeEffects()
	
	ControlsUtils.removePaneEffect(InnerCard)
	
End Sub

#End Region
