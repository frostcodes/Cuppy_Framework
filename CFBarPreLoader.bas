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
#Event: Resize (Width As Double, Height As Double)


#RaisesSynchronousEvents: AnimationStarted
#RaisesSynchronousEvents: AnimationStopped
#RaisesSynchronousEvents: Resize

#DesignerProperty: Key: AnimationTime, DisplayName: Animation Time, FieldType: Int, DefaultValue: 400, MinRange: 100, MaxRange: 5000, Description: Time used to complete one animation cycle

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
	Private AnimationTime As Int = 400
	 
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
	
	setAnimationTime(Props.get("AnimationTime"))
	
	timer1.Initialize("Timer1", AnimationTime)
	timer2.Initialize("Timer2", AnimationTime)
	timer3.Initialize("Timer3", AnimationTime)
	
	 Start
 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
  
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
' 
'Public Sub SetBg(color As String)
' 
'	CFControlsUtils.SetBg( mBase, color)
' 
'End Sub
' 
'
'Public Sub SetRotation(angle As Float)
'	
'	CFControlsUtils.setRotation(mBase, angle) 'rotate
'	 
'End Sub
'  
'Public Sub SetBorder(color As String , width As Int)
'
'	CFControlsUtils.setBorder(mBase, color, width)
'
'End Sub
' 
'Public Sub SetEffect(effect As String)
'	
'	CFControlsUtils.setEffect(mBase, effect)
'	
'End Sub
'
'Public Sub RemoveEffects()
'	
'	CFControlsUtils.removeEffect(mBase)
'	
'End Sub

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

'Set the time required
'For one cycle of the animation
Public Sub setAnimationTime(TimeInMS As Int)
	
	If  TimeInMS > 5000 Or TimeInMS < 100 Then
		
		LogError($"Bar Preloader Animation Time can't be 
		greater than 5000 or less  than 100. Reseting time to 400 MS"$)
		
		AnimationTime = 400
		
		Else
		
		AnimationTime = TimeInMS
			
	End If
	 
End Sub

'Get the current time reuired
'for one cycle of the animation
Public Sub getAnimationTime As Int 
	
	Return AnimationTime
	
End Sub
 
#Else

#ExcludeFromLibrary: True
Sub Class_Globals

 End Sub


 #End If

