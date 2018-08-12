B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class
 #If trial
   
#Event: AnimationStarted
#Event: AnimationStopped

'#RaisesSynchronousEvents: AnimationStarted
'#RaisesSynchronousEvents: AnimationStopped
'  
  
'#Event: MousePressed (EventData As MouseEvent)

'#RaisesSynchronousEvents: MousePressed

#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
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
	timer2.Initialize("Timer2", 400)
	timer3.Initialize("Timer3", 400)
	
	 Start
 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
  
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region
 
Private Sub Timer1_Tick
	'Handle tick events
	
	Dim height As Int = (Rnd(30, 100) / 100 ) *  mBase.PrefHeight
	
	Pane1.SetLayoutAnimated( 300 , Pane1.Left, Pane1.Top, Pane1.PrefWidth , height)
	
End Sub
 
Private Sub Timer2_Tick
	 
	Dim height As Int = (Rnd(30, 100) / 100  ) *  mBase.PrefHeight
	 
	Pane2.SetLayoutAnimated(300 , Pane2.Left, Pane2.Top, Pane2.PrefWidth , height)
	 
End Sub
 
Private Sub Timer3_Tick
	 
	Dim height As Int = (Rnd(30, 100) /100 ) *  mBase.PrefHeight
	
	Pane3.SetLayoutAnimated(300 , Pane3.Left, Pane3.Top, Pane3.PrefWidth , height)
	 
End Sub

#Region Actions and Effects
 
Public Sub SetBg(color As String)
 
'	ControlsUtils.SetBg( InnerLabel, color)
 
End Sub

Public Sub SetTextColor(color As String)
 
'	ControlsUtils.setTextColor (InnerLabel, color)
 
End Sub

Public Sub SetRotationX(angle As Float)
	
'	ControlsUtils.setRotationX(InnerLabel, angle) 'rotate
	 
End Sub
  
Public Sub SetBorder(color As String , width As Int)
	
'	ControlsUtils.setBorder(InnerLabel, color, width)

End Sub


Public Sub SetBorderRadius(radius As Int)
	
'	ControlsUtils.setBorderRadius(InnerLabel, radius)
	
End Sub


Public Sub SetEffect(effect As String)
	
'	ControlsUtils.setEffect(InnerLabel, effect)
	
End Sub

Public Sub RemoveEffects()
	
'	ControlsUtils.removeEffect(InnerLabel)
	
End Sub

#End Region

'
'Public Sub InnerLabel_MousePressed (EventData As MouseEvent)
'	  
'	CallSubDelayed2(mCallBack, mEventName & "_MousePressed", EventData) 
'	 
'End Sub

#Region Control specific actions

Private Sub EnableTimers(enabled As Boolean)
	
	timer1.Enabled =  enabled
	timer2.Enabled =  enabled
	timer3.Enabled =  enabled
	
End Sub

'Starts the Pre Loader
Public Sub Start()
	
	EnableTimers(True)
	CallSubDelayed(mCallBack, mEventName & "_AnimationStarted" )
	 
End Sub

'Stops the Pre Loader
Public Sub Stop()
	
	EnableTimers(False)
	CallSubDelayed( mCallBack, mEventName & "_AnimationStopped" )

End Sub
 
#Else

#ExcludeFromLibrary: True
Sub Class_Globals

 End Sub


 #End If

