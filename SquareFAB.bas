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
	Public FAB_Btn As Label
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("SquareFABLayout")
	'set using theme...
	SetBg(CFStyleManager.DefaultTheme.Get("accent"))
	setRotationX(135) 'rotate by default
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	 'maintain aspect ratio
	FAB_Btn.PrefWidth = Width
	FAB_Btn.PrefHeight = Width
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects

Public Sub SetBg(color As String)
 
	CSSUtils.SetStyleProperty( FAB_Btn, "-fx-background-color", color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
	CFControlsUtils.setRotationX(FAB_Btn, angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(FAB_Btn, color, width)

End Sub


Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(FAB_Btn, radius)
	
End Sub


Public Sub setPaneEffect(effect As String)
	
	CFControlsUtils.setEffect(FAB_Btn, effect)
	
End Sub

Public Sub removeEffects()
	
	CFControlsUtils.removeEffect(FAB_Btn)
	
End Sub

#End Region
  