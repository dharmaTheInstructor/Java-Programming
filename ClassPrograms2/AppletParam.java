/*
<applet code="AppletParam" width="1000" height="500">
<param name="uname" value="GMRIT"/>
<param name="age" value="28"/>
<param name="salary" value="35000.20"/>
</applet>
*/

import java.applet.*;
import java.awt.*;
public class AppletParam extends Applet{
 String s;
 int a;
 double sal;
 public void init(){
  s=getParameter("uname");
  a=Integer.parseInt(getParameter("age"));
  sal=Double.parseDouble(getParameter("salary"));
 }
 public void paint(Graphics g){
	g.drawString(s,10,20);
	g.drawString(a,10,40);
	g.drawString(sal,10,60);
 }
}