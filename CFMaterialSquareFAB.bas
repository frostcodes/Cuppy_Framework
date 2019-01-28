B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class

#Event: MousePressed (EventData As MouseEvent)
#Event: MouseEntered (EventData As MouseEvent)
#Event: MouseExited (EventData As MouseEvent)
#Event: Resize (Width As Double, Height As Double)


#RaisesSynchronousEvents: MousePressed
#RaisesSynchronousEvents: MouseEntered
#RaisesSynchronousEvents: MouseExited
#RaisesSynchronousEvents: Resize
 
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
	mBase.LoadLayout("CFMaterialSquareFABUI")
	'set using theme...
	setBackgroundColor(CFStyleManager.DefaultTheme.Get("accent"))
	setRotation(135) 'rotate by default
	
	setTag(Lbl.Tag)
	setAlpha(Lbl.Alpha)
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	 'maintain aspect ratio
	FAB_Btn.PrefWidth = Width
	FAB_Btn.PrefHeight = Width
	
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects

Public Sub setBackgroundColor(color As String)
 
	CFControlsUtils.setBackgroundColor(FAB_Btn, color)
 
End Sub

Public Sub getBackgroundColor As String
  	
	Return CFControlsUtils.GetBackgroundColor(FAB_Btn)
	
End Sub

Public Sub setRotation(angle As Float)
	
	CFControlsUtils.setRotation(FAB_Btn, angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(FAB_Btn, color, width)

End Sub


Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(FAB_Btn, radius)
	
End Sub

Public Sub getBorderColor As String
	
	Return CFControlsUtils.GetBorderColor(FAB_Btn)
	
End Sub

Public Sub getBorderWidth As Int
	
	Return CFControlsUtils.GetBorderWidth(FAB_Btn)
	
End Sub

Public Sub getBorderRadius As Int
	
	Return CFControlsUtils.GetBorderRadius(FAB_Btn)
	
End Sub

Public Sub setEffect(effect As String)
	
	CFControlsUtils.setEffect(FAB_Btn, effect)
	
End Sub

Public Sub getEffect(effect As String) As String
	
	Return CFControlsUtils.GetEffect(FAB_Btn)
	
End Sub

Public Sub RemoveEffects()
	
	CFControlsUtils.removeEffect(FAB_Btn)
	
End Sub

#End Region

Public Sub setIcon(IconText As String)
	
	FAB_Btn.Text = IconText
	 
End Sub

Public Sub getIcon As String
	
	Return FAB_Btn.Text
	 
End Sub


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
  
'Get Node Parent
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

Private Sub FAB_Btn_MousePressed (EventData As MouseEvent)
	
	FAB_Btn.RequestFocus 'set focus
	
	CallSubDelayed2(mCallBack, mEventName & "_MousePressed", EventData)
	
End Sub

Private Sub FAB_Btn_MouseEntered (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_MouseEntered", EventData)
	
End Sub

Private Sub FAB_Btn_MouseExited (EventData As MouseEvent)
	
	CallSubDelayed2(mCallBack, mEventName & "_MouseExited", EventData)
	
End Sub 
