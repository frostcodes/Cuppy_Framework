B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@

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
	Public InnerButton As Button
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
'	CFStyleManager.ActiveControls.add(Me)
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	
	mBase = Base
	mBase.LoadLayout("CFMaterialButtonUI")
	 
	'set using theme...
	setBackgroundColor(CFStyleManager.DefaultTheme.Get("accent"))
	InnerButton.Font = CFStyleManager.FONT_REGULAR
	InnerButton.MouseCursor = fx.Cursors.HAND
	
	setTextSize(Lbl.TextSize)
	setText(Lbl.Text)
	
	setTag(Lbl.Tag)
	setAlpha(Lbl.Alpha)
	
	 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
 
	InnerButton.PrefWidth = Width
	InnerButton.PrefHeight =  Height
	
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
	 
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region

#Region Actions and Effects
 
Public Sub setBackgroundColor(color As String)
 
	CFControlsUtils.SetBackgroundColor( InnerButton, color)
 
End Sub

Public Sub getBackgroundColor As String
  	
	Return CFControlsUtils.GetBackgroundColor(InnerButton)
	
End Sub

Public Sub setRotation(angle As Float)
	
	CFControlsUtils.setRotation(InnerButton, angle) 'rotate
	 
End Sub
  
Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(InnerButton, color, width)

End Sub
 
Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(InnerButton, radius)
	
End Sub


Public Sub getBorderColor As String
	
	Return CFControlsUtils.GetBorderColor(InnerButton)
	
End Sub

Public Sub getBorderWidth As Int
	
	Return CFControlsUtils.GetBorderWidth(InnerButton)
	
End Sub

Public Sub getBorderRadius As Int
	
	Return CFControlsUtils.GetBorderRadius(InnerButton)
	
End Sub
 
Public Sub setEffect(effect As String)
	
	CFControlsUtils.setEffect(InnerButton, effect)
	
End Sub

Public Sub getEffect(effect As String) As String
	
	Return CFControlsUtils.GetEffect(InnerButton)
	
End Sub
 
Public Sub RemoveEffects()
	
	CFControlsUtils.removeEffect(InnerButton)
	
End Sub

#End Region

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
  
'Get the Node Parent
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

#Region Control Specific

Public Sub setFont(font As Font)
	
	InnerButton.Font = font
	
End Sub

Public Sub getFont() As Font
	
	Return InnerButton.font
	
End Sub
 
Public Sub setText(text As String)
	
	InnerButton.Text = text
	
End Sub

Public Sub getText() As String
	
	Return InnerButton.Text
	
End Sub

Public Sub setTextSize(TextSize As Double)
	
	InnerButton.TextSize = TextSize
	
End Sub

Public Sub getTextSize() As Double
	
	Return InnerButton.TextSize
	
End Sub

Public Sub setTextColor(TextColor As Paint)
	
	InnerButton.TextColor = TextColor
	
End Sub

Public Sub getTextColor As Paint
	
	Return InnerButton.TextColor
	
End Sub


#End Region

Private Sub InnerButton_MousePressed (EventData As MouseEvent)
	
	InnerButton.RequestFocus 'set focus
	CallSubDelayed2(mCallBack, mEventName & "_MousePressed", EventData)
	 
End Sub
 
Private Sub InnerButton_MouseEntered (EventData As MouseEvent)
	  
	CallSubDelayed2(mCallBack, mEventName & "_MouseEntered", EventData)
	 
End Sub

Private Sub InnerButton_MouseExited (EventData As MouseEvent)
	  
	CallSubDelayed2(mCallBack, mEventName & "_MouseExited", EventData)
	 
End Sub