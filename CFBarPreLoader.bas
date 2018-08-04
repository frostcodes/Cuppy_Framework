B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class
 #If trial
 
 
#Event: MousePressed (EventData As MouseEvent)

#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	'Public InnerLabel As Label
	Private timer1 As Timer
	Private timer2 As Timer
	Private timer3 As Timer
	
	 
	Private Pane1 As Pane
	Private Pane2 As Pane
	Private Pane3 As Pane
	
	 
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
 
End Sub



Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFBarPreLoaderUI")
	'set using theme...
 
	'setTextColor(StyleManager.DefaultTheme.Get("primary_text"))
	'InnerLabel.Font = StyleManager.SelectFont("Light", 12)
	
	timer1.Initialize("Timer1", 400)
	timer1.Enabled = True

	timer2.Initialize("Timer2", 400)
	timer2.Enabled = True
	
	
	timer3.Initialize("Timer3", 400)
	timer3.Enabled = True

	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region




Private Sub Timer1_Tick
	'Handle tick events
	
	Dim height As Int = ( Rnd(30, 100) / 100 ) *  mBase.PrefHeight
	
	Pane1.SetLayoutAnimated( 300 , Pane1.Left, Pane1.Top, Pane1.PrefWidth , height)
	
End Sub
 
Private Sub Timer2_Tick
	 
	Dim height As Int = ( Rnd(30, 100) / 100  ) *  mBase.PrefHeight
	
	
	
	Pane2.SetLayoutAnimated(300 , Pane2.Left, Pane2.Top, Pane2.PrefWidth , height)
	 
End Sub
 
Private Sub Timer3_Tick
	 
	Dim height As Int =(  Rnd(30, 100) /100 ) *  mBase.PrefHeight
	
	Pane3.SetLayoutAnimated(300 , Pane3.Left, Pane3.Top, Pane3.PrefWidth , height)
	 
End Sub

#Region Actions and Effects
 
Public Sub SetBg(color As String)
 
'	ControlsUtils.SetBg( InnerLabel, color)
 
End Sub

Public Sub setTextColor(color As String)
 
'	ControlsUtils.setTextColor (InnerLabel, color)
 
End Sub

Public Sub setRotationX(angle As Float)
	
'	ControlsUtils.setRotationX(InnerLabel, angle) 'rotate
	 
End Sub
  
Public Sub setBorder(color As String , width As Int)
	
'	ControlsUtils.setBorder(InnerLabel, color, width)

End Sub


Public Sub setBorderRadius(radius As Int)
	
'	ControlsUtils.setBorderRadius(InnerLabel, radius)
	
End Sub


Public Sub setEffect(effect As String)
	
'	ControlsUtils.setEffect(InnerLabel, effect)
	
End Sub

Public Sub removeEffects()
	
'	ControlsUtils.removeEffect(InnerLabel)
	
End Sub

#End Region

'
'Public Sub InnerLabel_MousePressed (EventData As MouseEvent)
'	  
'	CallSubDelayed2(mCallBack, mEventName & "_MousePressed", EventData) 'ignore
'	 
'End Sub


#Else

#ExcludeFromLibrary: True
Sub Class_Globals

 End Sub


 #End If

