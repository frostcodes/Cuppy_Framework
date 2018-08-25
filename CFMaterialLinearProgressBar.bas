B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class

'TODO: implement indeterminate progress bar 
'TODO: circular progress bar
'https://material.io/design/components/progress-indicators.html#circular-progress-indicators

#Event: ProgressFinished
#Event: Resize (Width As Double, Height As Double)
 
#RaisesSynchronousEvents: ProgressFinished
#RaisesSynchronousEvents: Resize

#DesignerProperty: Key: Progress, DisplayName: Current progress percent, FieldType: Int, DefaultValue: 30, MinRange: 0, MaxRange: 100
 
#Region Internal Segment

Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Public ProgressBar As Pane
	Public ProgressPane As Pane
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFMaterialLinearProgressBarUI")
	'set using theme...
	SetBg(CFStyleManager.DefaultTheme.Get("divider"))
	setProgressColor(CFStyleManager.DefaultTheme.Get("primary"))
	
	setProgress(Props.Get("Progress")) 'set initial progress value
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	ProgressPane.PrefWidth = Width
	ProgressPane.PrefHeight = Height
	ProgressBar.PrefHeight = Height
	
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects

Public Sub SetBg(color As String)
 
	CFControlsUtils.SetBG( ProgressPane, color)
 
End Sub

Public Sub setRotation(angle As Float)
	
	CFControlsUtils.SetRotation(ProgressPane, angle) 'rotate
	 
End Sub

Public Sub SetBorder(color As String , width As Int)
	
	CFControlsUtils.SetBorder(ProgressPane, color, width)

End Sub
 
Public Sub SetBorderRadius(radius As Int)
	
	CFControlsUtils.SetBorderRadius(ProgressPane, radius)
	
End Sub
 
Public Sub SetEffect(effect As String)
	
	CFControlsUtils.SetEffect(ProgressPane, effect)
	
End Sub

Public Sub RemoveEffects()
	
	CFControlsUtils.RemoveEffect(ProgressPane)
	
End Sub

#End Region
  
Public Sub setProgressColor(color As String)
  	
	CFControlsUtils.SetBG( ProgressBar, color)
	
End Sub

Public Sub setProgress(value As Int)
	
	If value >= 100 Then
		value = 100
		
		'call callback for progress finished...
		CallSub(mCallBack, mEventName & "_ProgressFinished")  
		
	End If
	
	ProgressBar.SetLayoutAnimated(400, 0 ,0 , (value / 100) * mBase.PrefWidth , mBase.PrefHeight)
	
End Sub

Public Sub getProgress()  As Int
 
	Return (ProgressBar.PrefWidth / mBase.PrefWidth ) * 100
	
End Sub