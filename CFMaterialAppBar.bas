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

#DesignerProperty: Key: Title, DisplayName: Form/App BAr Title, FieldType: String, DefaultValue: Form Title
#DesignerProperty: Key: HideIcon, DisplayName: Hide App Bar icon?, FieldType: Boolean, DefaultValue: False
#DesignerProperty: Key: HideTitle, DisplayName: Hide Title of App Bar?, FieldType: Boolean, DefaultValue: False
#DesignerProperty: Key: EnableShadow, DisplayName: Enable App Bar Shadow? , FieldType: Boolean, DefaultValue: True

 
#Region Internal Segment

Sub Class_Globals
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
	SetBg(CFStyleManager.DefaultTheme.Get("primary"))
	
	TitleLabel.Font = CFStyleManager.SelectFont("Black", 14)
	setTitle(Props.Get("Title"))
	setEnableShadow(Props.Get("EnableShadow"))
	
End Sub

Private Sub Base_Resize (Width As Double, Height As Double)
	
	CallSubDelayed3(mCallBack, mEventName & "_Resize", Width, Height)
	
End Sub

Public Sub GetBase As Pane
	Return mBase
End Sub

#End Region


#Region Actions and Effects


Public Sub SetBg(color As String)
	
	CFControlsUtils.SetBG( Label1,  color)
	CFControlsUtils.SetPaneBG( InnerPane, color)
 
End Sub
 
Public Sub setRotation(angle As Float)
	
	CFControlsUtils.setRotation(Label1, angle) 'rotate
	CFControlsUtils.setPaneRotation(InnerPane , angle) 'rotate
	 
End Sub

Public Sub SetBorder(color As String , width As Int)
	
	CFControlsUtils.setBorder(Label1, color, width)
	CFControlsUtils.setPaneBorder(InnerPane, color, width)
	
End Sub

Public Sub SetBorderRadius(radius As Int)
	
	CFControlsUtils.setBorderRadius(Label1, radius)
	CFControlsUtils.setPaneBorderRadius(InnerPane, radius)
	
End Sub

Public Sub SetPaneEffect(effect As String)
	
	CFControlsUtils.setEffect(Label1, effect)
	
End Sub

Public Sub RemoveEffects()
	
	CFControlsUtils.removeEffect(Label1)
	
End Sub

#End Region

Public Sub setIcon(IconText As String)
	
	Label1.Text = IconText
	 
End Sub

Public Sub getIcon As String
	
	Return Label1.Text
	 
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