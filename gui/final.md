# GUI期末  
## 题型  
判断题 10题/20分  
单选 10题/30分  
*判断选择共50分，其中40分来自文档，10分来自代码*  
描述程序结果/运行效果 10分  
程序填空（5分填空5分选择） 10分  
问答 10分  
## 要看的代码  
### Java Swing  
#### [打鸭子](shootduck.java)  
↑上面是java版本的 点进去看源码 下面是[c#](shootduck)的  
![shoot duck](https://cdn.jsdelivr.net/gh/cky008/note-nuist@main/gui/img/20210616/shoot%20duck.jpg)  
```csharp
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace shootduck
{
    public partial class Form1 : Form
    {
        int count = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            

        }

        private void button1_Click1(object sender, EventArgs e)
        {
            count++;
            string s1 = count.ToString();
            label1.Text = "击中次数：" + s1;

        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            
            Random rd =  new  Random();
            int  i = rd.Next(0,740);
            int j= rd.Next(0, 336);
            button1.Location = new Point(i,j);
        }
    }
}
```
```csharp
namespace shootduck
{
    partial class Form1
    {
        /// <summary>
        /// 必需的设计器变量。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 清理所有正在使用的资源。
        /// </summary>
        /// <param name="disposing">如果应释放托管资源，为 true；否则为 false。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows 窗体设计器生成的代码

        /// <summary>
        /// 设计器支持所需的方法 - 不要
        /// 使用代码编辑器修改此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.button1 = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.timer1 = new System.Windows.Forms.Timer(this.components);
            this.SuspendLayout();
            // 
            // button1
            // 
            this.button1.BackgroundImage = ((System.Drawing.Image)(resources.GetObject("button1.BackgroundImage")));
            this.button1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Stretch;
            this.button1.Location = new System.Drawing.Point(508, 142);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(94, 70);
            this.button1.TabIndex = 0;
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            this.button1.Click += new System.EventHandler(this.button1_Click1);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 353);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(98, 18);
            this.label1.TabIndex = 1;
            this.label1.Text = "击中次数：";
            // 
            // timer1
            // 
            this.timer1.Enabled = true;
            this.timer1.Interval = 1000;
            this.timer1.Tick += new System.EventHandler(this.timer1_Tick);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(9F, 18F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(918, 380);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.button1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Timer timer1;
    }
}
```
#### P36  
> Java KeyListener: Count Words & Characters Define a Frame, add a TextArea, a Label and Keyboard listerner to the Frame. When the keyboard stroke is observed in the TextArea, trigger the corresponding function to change the content of Label.
```java
import java.awt.*;  
import java.awt.event.*;  
public class KeyListenerExample extends Frame implements KeyListener{  
    Label l;  
    TextArea area;  
    KeyListenerExample(){  
          
        l=new Label();  
        l.setBounds(20,50,200,20);  
        area=new TextArea();  
        area.setBounds(20,80,300, 300);  
        area.addKeyListener(this);  
          
        add(l);add(area);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) {}  
    public void keyReleased(KeyEvent e) {  
        String text=area.getText();  
        String words[]=text.split("\\s");  
        l.setText("Words: "+words.length+" Characters:"+text.length());  
    }  
    public void keyTyped(KeyEvent e) {}  
  
    public static void main(String[] args) {  
        new KeyListenerExample();  
    }  
}
```
### JavaFX  
#### 在Eclipse中的配置流程  
**Enable JavaFX**  
> JavaFX is embedded in JDK 8 or higher version.
Create a normal java project, right click on your project, choose “Build Path” --> ”Configure Build Path” --> ”Libraries” --> ”Access Rules” in JRE --> ”Edit” --> ”Add” --> ”Accessible” in Resolution and “javafx/**” in rule pattern  
![fig1](https://cdn.jsdelivr.net/gh/cky008/note-nuist@main/gui/img/20210616/fig1.png)  
![fig2](https://cdn.jsdelivr.net/gh/cky008/note-nuist@main/gui/img/20210616/fig2.png)  
![fig3](https://cdn.jsdelivr.net/gh/cky008/note-nuist@main/gui/img/20210616/fig3.png)  

[JavaFX with Eclipse on javatpoint](https://www.javatpoint.com/javafx-with-eclipse)  
#### P22 
![MouseEvent](https://cdn.jsdelivr.net/gh/cky008/note-nuist@main/gui/img/20210616/MouseEvent.png)  
```java
public class MouseEventDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a pane and set its properties
    Pane pane = new Pane();
    Text text = new Text(20, 20, "Programming is fun");
    pane.getChildren().addAll(text);
    text.setOnMouseDragged(e -> {       
      text.setX(e.getX());
      text.setY(e.getY());
    });
    
    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 300, 100);
    primaryStage.setTitle("MouseEventDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

 public static void main(String[] args) {
    launch(args);
  }
}
``` 
#### P34  
> **PathTransition** and **FadeTransition** define specialized animations. The **Timeline** class can be used to program any animation using one or more **KeyFrames**. Each **KeyFrame** is executed sequentially at a specified time interval. **Timeline** inherits from **Animation**.  
```java
public void start(Stage primaryStage) {
   StackPane pane = new StackPane();
   Text text = new Text(20, 50, "Programming if fun");
   text.setFill(Color.RED);
   pane.getChildren().add(text); // Place text into the stack pane
   
   // Create a handler for changing text
   EventHandler<ActionEvent> eventHandler = e -> {
      if (text.getText().length() != 0) {
         text.setText("");
      }
      else {
         text.setText("Programming is fun");
      }
   };
	    
   // Create an animation for alternating text
   Timeline animation = new Timeline(
   new KeyFrame(Duration.millis(500), eventHandler));
   animation.setCycleCount(Timeline.INDEFINITE);
   animation.play(); // Start animation
   // Pause and resume animation
   text.setOnMouseClicked(e -> {
   if (animation.getStatus() == Animation.Status.PAUSED) {
	animation.play();
	}
	else {
	animation.pause();
	}
   });
	    
   // Create a scene and place it in the stage
   Scene scene = new Scene(pane, 250, 50);
   primaryStage.setTitle("TimelineDemo"); // Set the stage title
   primaryStage.setScene(scene); // Place the scene in the stage
   primaryStage.show(); // Display the stage	  
}
```
### JDBC  
#### P3~5  
**Import Driver Jar File!**  
![Import Driver Jar File](https://cdn.jsdelivr.net/gh/cky008/note-nuist@main/gui/img/20210616/Import%20Driver%20Jar%20File.png)  
**JDBC Example**  
![JDBC example](https://cdn.jsdelivr.net/gh/cky008/note-nuist@main/gui/img/20210616/JDBC%20example.png)  
#### 怎么从数据库中取/更新数据  
[JDBC on 廖雪峰的官方网站](https://www.liaoxuefeng.com/wiki/1252599548343744/1255943820274272)  
### C#  Socket  
#### P25~33  
**Server Broadcast example**  
```csharp
using System;
using System.Net;
using System.Text;
using System.Net.Sockets;
using System.Collections;  		 // for ArrayList
using System.Threading;

public class server
{
	static ArrayList list = new ArrayList();  
	static ReaderWriterLock rw = new ReaderWriterLock(); 

	static public void remove(object obj)
	{
		rw.AcquireWriterLock(Timeout.Infinite);  
		list.Remove(obj) ;
		rw.ReleaseWriterLock(); 
	}
	
	static public void AddList(object obj)
	{
		rw.AcquireWriterLock(Timeout.Infinite);  
		list.Add(obj) ;
		rw.ReleaseWriterLock(); 
	}

	static public void SendToAll(byte[] binData)
	{
		rw.AcquireWriterLock(Timeout.Infinite);  
		for(int k = 0; k<list.Count; k++)
		{
			Communication com = (Communication)list[k]; 
			Socket sock = com.socket;
			sock.Send(binData); 
		}
		rw.ReleaseWriterLock();  
	}
	
	public static void Main() 
	{
		bool connected =false;
		int count =0;
		TcpListener myListener = null;
		try  {
			string hostName = Dns.GetHostName();
			IPHostEntry ipEntry = Dns.GetHostByName(hostName);
			myListener = new TcpListener(ipEntry.AddressList[0],8001);	
			myListener.Start();
			Console.WriteLine("The server is running at port: " + myListener.LocalEndpoint);
			Console.WriteLine("Waiting for a connection.....");
			while(true) {
			Socket socket=myListener.AcceptSocket();	
			count++;
			Console.WriteLine("Connection " + count + " accepted from "+socket.RemoteEndPoint);
			Communication com = new Communication(socket, count);
			AddList(com); 
			}
		}
		catch (Exception e) 
		{
			if(!connected)Console.WriteLine("Error..... " + e.ToString() );
		}		
		myListener.Stop();
		Console.WriteLine("\nClient closed connection");
		Console.ReadLine();
	}

	public class Communication
	{
		public Socket socket=null;
		int n;
		public Communication(Socket sock, int k)
		{
			socket = sock;
			n = k;
			Thread t = new Thread (new ThreadStart (Talk));
			t.Start(); 
		}
		
		public void Talk()
		{
			byte[] binDataIn = new byte [255];
			Console.WriteLine("The socket " + n + " begin to work... ");	
			try  {
				while(true) {			
					int k=socket.Receive(binDataIn);
					if(k==0) break;	// if client closed
					ASCIIEncoding asciiEnc = new ASCIIEncoding();
					string msg = asciiEnc.GetString(binDataIn,0,k);	
					msg = "from client " + n +": " + msg;
					byte[] binDataOut = asciiEnc.GetBytes(msg); 
					SendToAll(binDataOut);
					Console.WriteLine(msg);				
				}
			}
			catch(Exception) { }
			Console.WriteLine("Client " + n +" Disconnected");	
			remove(this);
			socket.Close();
		}
	}
}
```
**Client side**  
> In client side we need to add one thread to take care the messages from broadcasting.  

```csharp
using System;
using System.IO;
using System.Net;
using System.Text;
using System.Net.Sockets;
using System.Threading ;

public class client
{
	static bool connected = false;
	static Socket socket = null;
	
	public static void Main() 
	{
		Console.WriteLine("Please enter the Server IP address");
		string IP = Console.ReadLine();
		Console.WriteLine("Please enter the Server HTTP port number");
		string port = Console.ReadLine();
		int p;
		try{   
			p = Int32.Parse(port);    
		}
		catch(Exception)
		{
			Console.WriteLine("Wrong port number");
			return;
		}
		socket = new Socket(AddressFamily.InterNetwork, SocketType.Stream, ProtocolType.Tcp );
		IPHostEntry IpEntry = Dns.GetHostByAddress(IP);
		IPAddress hostAddress = IpEntry.AddressList[0];
		IPEndPoint hostEndPoint = new IPEndPoint(hostAddress, p);
		Console.WriteLine("Connecting.....");
		try {
			socket.Connect(hostEndPoint); 
		}
		catch(Exception) {
			Console.WriteLine("No connection to server\nPress enter to exit");
			Console.ReadLine(); 
			return;
		}
		connected = socket.Connected;
		if(connected) Console.WriteLine("Connected");
		Console.WriteLine("Enter the string to be transmitted : ");
		ASCIIEncoding asciiEnc= new ASCIIEncoding();
		Thread t = new Thread(new ThreadStart(GetMsg));
		t.Start(); 
		while(connected){
			String str=Console.ReadLine();
			if(str.ToLower() =="quit") break;
			byte[] binData = asciiEnc.GetBytes(str);
			socket.Send(binData, 0, binData.Length, SocketFlags.None); 	
			socket.Close(); 
		}
	}
	
	static private void GetMsg()
	{
		ASCIIEncoding asciiEnc= new ASCIIEncoding();
		while(connected)
		{
			byte[] bb=new byte[255];
			int k = socket.Receive(bb, 0, bb.Length , SocketFlags.None); 
			string msg = asciiEnc.GetString(bb,0,k);
			Console.WriteLine( msg);
		}
	}
}


```
[Socket Programming in C# on geeksforgeeks](https://www.geeksforgeeks.org/socket-programming-in-c-sharp/)  
### 其他  
#### Swing/JavaFX/C# 的 EventHandler 的核心机制 --> 怎么处理 --> 给代码要认得是什么语言  
[Swing on tutorialspoint](https://www.tutorialspoint.com/swing/swing_event_handling.htm)  
[JavaFX on tutorialspoint](https://www.tutorialspoint.com/javafx/javafx_event_handling.htm)  
[C# on runoob](https://www.runoob.com/csharp/csharp-event.html)  

#### 能够辨别Anonymous inner class listener/Multiple implementation listener/Separated listener class  
**Inner Classes**  
![Inner Classes](https://cdn.jsdelivr.net/gh/cky008/note-nuist@main/gui/img/20210616/Inner%20Classes.png)  
**Anonymous inner class listener**  
```java
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
public class ButtonEvent1 {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	JFrame f=new JFrame("Button Example");
	JButton b1=new JButton("OK");
	JButton b2=new JButton("Cancel");
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		System.out.println("OK Button Clicked");
	}});
	b2.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
		System.out.println("Cancel Button Clicked");
	}});
	f.add(b1);f.add(b2);
	f.setLayout(new FlowLayout());
	f.pack();
	f.setVisible(true);
	}
}
```
**Multiple implementation listener**  
```java
import java.awt.*;  
import java.awt.event.*;  
public class multiple_implementation extends Frame 
         implements MouseListener, MouseMotionListener{
```
![Multiple implementation listener](https://cdn.jsdelivr.net/gh/cky008/note-nuist@main/gui/img/20210616/Multiple%20implementation%20listener.png)  
**Separated listener class**  
![Separated listener class](https://cdn.jsdelivr.net/gh/cky008/note-nuist@main/gui/img/20210616/Separated%20listener%20class.png)  
