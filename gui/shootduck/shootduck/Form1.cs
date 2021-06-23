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
