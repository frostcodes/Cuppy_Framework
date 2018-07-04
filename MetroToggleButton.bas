B4J=true
Group=Cuppy\Controls\Metro
ModulesStructureVersion=1
Type=Class
Version=6.3
@EndOfDesignText@
'Custom View class
 
#Event: CheckedChanged(value as int)
 
 'TODO: make font adjust when resized
#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
  
	'Checkbox states
	Public CHECKED_STATE As Int = 0
	Public UNCHECKED_STATE As Int = 1
	 
	Private CheckedStatus As Boolean = False
	Public ToggleButton As Label
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("ToggleButtonUI")
	 
	
	'TODO: create a designer prorerty for this...
	setCheckState(UNCHECKED_STATE) 'set initial value
	  
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	'we are not handling resizes here...
	
	ToggleButton.PrefHeight = Width
	ToggleButton.PrefWidth = Width
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects

Public Sub SetBg(color As String)
 
	ControlsUtils.setBG(ToggleButton, color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
	ControlsUtils.setRotationX(ToggleButton, angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	ControlsUtils.setBorder(ToggleButton, color, width)

End Sub
 
Public Sub setBorderRadius(radius As Int)
	
	ControlsUtils.setBorderRadius(ToggleButton, radius)
	
End Sub
 
Public Sub setPaneEffect(effect As String)
	
	ControlsUtils.setPaneEffect(ToggleButton, effect)
	
End Sub

Public Sub removeEffects()
	
	ControlsUtils.removeEffect(ToggleButton)
	
End Sub

#End Region
  
 
Public Sub setCheckState(value As Int)
	 
	If value = UNCHECKED_STATE Then
		 
		 SetBg("white")
		setBorder("#D6D6D6", 2)
		  
		CheckedStatus = False
		  
	Else if value = CHECKED_STATE Then
	 
		SetBg("#FF41B1E1")
		setBorder("#2EA9DE", 2)
		 
		CheckedStatus = True
		 
	End If
	 
	'call callback for checked changed status
	CallSubDelayed2(mCallBack, mEventName & "_CheckedChanged" , value)
	 
End Sub

Public Sub checked As Boolean

	Return CheckedStatus
	 
End Sub
  
Private Sub CheckedStatus_MousePressed (EventData As MouseEvent)
	 
	If Not(checked) Then
	
		setCheckState(CHECKED_STATE)
	
	Else
	
		setCheckState(UNCHECKED_STATE)
 
	End If
	 
End Sub