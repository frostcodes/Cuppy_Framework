﻿B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class

'TODO: implement indeterminate progress bar 
'TODO: circular progress bar
'https://material.io/design/components/progress-indicators.html#circular-progress-indicators
 
#If Free
 
'Remove from Library if Free version
 
#ExcludeFromLibrary: True
Sub Class_Globals

End Sub

 #Else
 
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
	setBg(CFStyleManager.DefaultTheme.Get("divider"))
	setProgressColor(CFStyleManager.DefaultTheme.Get("primary"))
	
	setProgress(Props.Get("Progress")) 'set initial progress value
	
	setTag(Lbl.Tag)
	setAlpha(Lbl.Alpha)
	
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

Public Sub setBg(color As String)
 
	CFControlsUtils.SetBG( ProgressPane, color)
 
End Sub

Public Sub setRotation(angle As Float)
	
	CFControlsUtils.SetRotation(ProgressPane, angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.SetBorder(ProgressPane, color, width)

End Sub
 
Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.SetBorderRadius(ProgressPane, radius)
	
End Sub
 
Public Sub setEffect(effect As String)
	
	CFControlsUtils.SetEffect(ProgressPane, effect)
	
End Sub
 
Public Sub getEffect(effect As String) As String
	
	Return CFControlsUtils.GetEffect(ProgressPane)
	
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
	
	ProgressBar.SetLayoutAnimated(300, 0 ,0 , (value / 100) * mBase.PrefWidth , mBase.PrefHeight)
	
End Sub

Public Sub getProgress()  As Int
 
	Return (ProgressBar.PrefWidth / mBase.PrefWidth ) * 100
	
End Sub

#End if


#Region General Functions and Properties

'Get or set whether Node is Enabled?
Public Sub getEnabled As Boolean
	
	Return mBase.Enabled
	
End Sub

Public Sub setEnabled(Enabled As Boolean)
	
	mBase.Enabled = Enabled

End Sub
 
'Get or set whether Node is Visible?
Public Sub getVisible As Boolean
	
	Return mBase.Visible
	
End Sub

Public Sub setVisible(Visible As Boolean)
	
	mBase.Visible = Visible

End Sub
 
'Get or set the Node Alpha level: 0 - transparent, 1 - Fully Opaque
Public Sub getAlpha As Double
	
	Return mBase.Alpha
	
End Sub

Public Sub setAlpha(Alpha As Double)
	
	mBase.Alpha = Alpha

End Sub
 
'Get the Node Height
Public Sub getHeight As Double
	
	Return mBase.PrefHeight
	
End Sub
  
'Get the Node Width
Public Sub getWidth As Double
	
	Return mBase.PrefWidth
	
End Sub
 
'Get the top property of the Node (related to its parent)
Public Sub getTop As Double
	
	Return mBase.Top
	
End Sub
  
'Get or set the Node Parent
Public Sub getParent As Node
	
	Return mBase.Parent
	 
End Sub
  
'Get or set the Node tag.
'This is placeholder for any object you need to tie to the node
Public Sub getTag As Object
	
	Return mBase.Tag
	
End Sub

Public Sub setTag(Tag As Object)
	
	mBase.Tag = Tag

End Sub
 
'Get the Left property of the Node (related to its parent)
Public Sub getLeft As Double
	
	Return mBase.Left
	
End Sub
   
'FUNCTIONS

'Removes the node from its parent
Public Sub RemoveNodeFromParent
	
	mBase.RemoveNodeFromParent
	
End Sub

'Captures the node appearance and returns the rendered image
Public Sub Snapshot As Image
	
	Return mBase.Snapshot
	
End Sub
 
'Similar to Snapshot. Allow you to set the background color
Public Sub Snapshot2(BackgroundColor As Paint) As Image
	
	Return mBase.Snapshot2(BackgroundColor)
	
End Sub
  
'tooltip
'	

#End Region

