B4J=true
Group=Cuppy Framework\Cuppy\Controls
ModulesStructureVersion=1
Type=Class
Version=5.51
@EndOfDesignText@
'Custom View class

#Event: MousePressed (EventData As MouseEvent)
#Event: PaneMousePressed (EventData As MouseEvent)
#Event: Resize (Width As Double, Height As Double)

#RaisesSynchronousEvents: MousePressed
#RaisesSynchronousEvents: PaneMousePressed
#RaisesSynchronousEvents: Resize

#DesignerProperty: Key: Title, DisplayName: Title, FieldType: String, DefaultValue: Form Title
#DesignerProperty: Key: HideIcon, DisplayName: Hide App Bar icon?, FieldType: Boolean, DefaultValue: False
#DesignerProperty: Key: HideTitle, DisplayName: Hide Title of App Bar?, FieldType: Boolean, DefaultValue: False
#DesignerProperty: Key: EnableShadow, DisplayName: Enable App Bar Shadow? , FieldType: Boolean, DefaultValue: True

 
#Region Internal Segment

Private Sub Class_Globals
	Private fx As JFX
	Private mEventName As String 'ignore
	Private mCallBack As Object 'ignore
	Private mBase As Pane
	Private Label1 As Label
	Public InnerPane As Pane
	Public InnerButton As Button
	Public TitleLabel As Label
End Sub

Public Sub Initialize (Callback As Object, EventName As String)
	mEventName = EventName
	mCallBack = Callback
End Sub

Public Sub DesignerCreateView (Base As Pane, Lbl As Label, Props As Map)
	mBase = Base
	mBase.LoadLayout("CFMaterialAppBarUI")
	
	'set using theme...
	setBackgroundColor(CFStyleManager.DefaultTheme.Get("primary"))
	TitleLabel.Font = CFStyleManager.SelectFont("Black", 14)
	
	setTitle(Props.Get("Title"))
	setEnableShadow(Props.Get("EnableShadow"))
	
	setHideIcon(Props.Get("HideIcon"))
	setHideTitle(Props.Get("HideTitle"))
	 
	setTag(Lbl.Tag)
	setAlpha(Lbl.Alpha)
 
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
	
End Sub

Public Sub GetBase As Pane
	Return mBase
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



#Region Actions and Effects


Public Sub setBackgroundColor(color As String)
	
	CFControlsUtils.SetBackgroundColor( Label1,  color)
	CFControlsUtils.SetBackgroundColor( InnerPane, color)
 
End Sub
 
Public Sub getBackgroundColor As String
  	
	Return CFControlsUtils.GetBackgroundColor(InnerPane)
	
End Sub
  
Public Sub setRotation(angle As Float)
	
	CFControlsUtils.setRotation(Label1, angle) 'rotate
	CFControlsUtils.setRotation(InnerPane , angle) 'rotate
	 
End Sub

Public Sub setBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(Label1, color, width)
	CFControlsUtils.setBorder(InnerPane, color, width)
	
End Sub

Public Sub setBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(Label1, radius)
	CFControlsUtils.setBorderRadius(InnerPane, radius)
	
End Sub

Public Sub setEffect(effect As String)
	
	CFControlsUtils.setEffect(Label1, effect)
	
End Sub
 
Public Sub getEffect(effect As String) As String
	
	Return CFControlsUtils.GetEffect(Label1)
	
End Sub

Public Sub RemoveEffects()
	
	CFControlsUtils.removeEffect(Label1)
	
End Sub

#End Region

'The app bar Icon
Public Sub setIcon(IconText As String)
	
	InnerButton.Text = IconText
	 
End Sub

'The app bar Icon
Public Sub getIcon As String
	
	Return InnerButton.Text
	 
End Sub

Public Sub getTitle As String
	
	Return TitleLabel.Text
	
End Sub

Public Sub setTitle(Title As String)
	
	TitleLabel.Text = Title
	
End Sub

Public Sub setHideTitle(BoolVal As Boolean)
	
	TitleLabel.Visible = Not(BoolVal)
	
End Sub

Public Sub setHideIcon(BoolVal As Boolean)
	
	 InnerButton.Visible = Not(BoolVal)
	
End Sub

Public Sub setEnableShadow(BoolVal As Boolean)
	
	Label1.Visible = BoolVal
	 
End Sub

Public Sub getShadowEnabled As Boolean
	
	Return Label1.Visible
	 
End Sub

Private Sub InnerButton_MousePressed (EventData As MouseEvent)
	
	InnerButton.RequestFocus 'set focus
	
	CallSubDelayed2(mCallBack, mEventName & "_MousePressed", EventData)
	
End Sub
 
Private Sub InnerPane_MousePressed (EventData As MouseEvent)
	 
	InnerPane.RequestFocus 'set focus
	 
	CallSubDelayed2(mCallBack, mEventName & "_PaneMousePressed", EventData)
	 
End Sub
