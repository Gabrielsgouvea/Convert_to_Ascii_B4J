package b4j.example;


import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 600, 400);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4j.objects.ButtonWrapper _btok = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbstring = null;
public static anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtin = null;
public static anywheresoftware.b4j.objects.LabelWrapper _lbascii = null;
public static String _guard = "";
public static String _c = "";
public static int _b = 0;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 18;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 19;BA.debugLine="MainForm.RootPane.LoadLayout(\"converttoascii\") 'L";
_mainform.getRootPane().LoadLayout(ba,"converttoascii");
 //BA.debugLineNum = 20;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 21;BA.debugLine="MainForm.WindowWidth = 315";
_mainform.setWindowWidth(315);
 //BA.debugLineNum = 22;BA.debugLine="MainForm.WindowHeight = 145";
_mainform.setWindowHeight(145);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public static String  _btok_action() throws Exception{
 //BA.debugLineNum = 25;BA.debugLine="Sub btok_Action";
 //BA.debugLineNum = 26;BA.debugLine="guard = txtin.Text";
_guard = _txtin.getText();
 //BA.debugLineNum = 27;BA.debugLine="B = Asc(guard)";
_b = anywheresoftware.b4a.keywords.Common.Asc(BA.ObjectToChar(_guard));
 //BA.debugLineNum = 28;BA.debugLine="lbascii.Text = B";
_lbascii.setText(BA.NumberToString(_b));
 //BA.debugLineNum = 29;BA.debugLine="C = Chr(B)";
_c = BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr(_b));
 //BA.debugLineNum = 30;BA.debugLine="lbstring.Text = C";
_lbstring.setText(_c);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Private btok As Button";
_btok = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private lbstring As Label";
_lbstring = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private txtin As TextField";
_txtin = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private lbascii As Label";
_lbascii = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private guard, C As String";
_guard = "";
_c = "";
 //BA.debugLineNum = 14;BA.debugLine="Private B As Int";
_b = 0;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public static String  _txtin_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub txtin_TextChanged(Old As String, New As String";
 //BA.debugLineNum = 33;BA.debugLine="If New.Length > 1 Then";
if (_new.length()>1) { 
 //BA.debugLineNum = 34;BA.debugLine="txtin.Text = Old";
_txtin.setText(_old);
 //BA.debugLineNum = 35;BA.debugLine="txtin.SetSelection(1, 1)";
_txtin.SetSelection((int) (1),(int) (1));
 };
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
}
