using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace _16进制xor
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            string s1 = tb1.Text;
            string s2 = tb2.Text;
            string s3; string s4;
            sum.Text = "";
            if (s1.Length > 8)
            {
                for (int i = 0; i < s1.Length / 8; i++)
                {
                    s3 = s1.Substring(i * 8, 8);
                    s4 = s2.Substring(i * 8, 8);
                    long dec1 = Convert.ToInt64(s3, 16);
                    long dec2 = Convert.ToInt64(s4, 16);
                    long d1 = dec1 ^ dec2;
                    sum.Text += d1.ToString("x8");
                }
            }
            
            

        }

        private void moddiv_Click(object sender, EventArgs e)
        {
            int t = Int16.Parse(tb1.Text);
            int b = Int16.Parse(tb2.Text);
            long c=0;
            for (int a = 1; a < b; a++)
            {
                c = t * a % b;
                if (c == 1)
                {sum.Text = a.ToString(); break; }
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            int g = Int16.Parse(tb1.Text);
            int b = Int16.Parse(tb2.Text);
            int[] c = new int[b+1];
            int count=0;
            double d = 0;
            for (int a = 1; a < b; a++)
            {
                Boolean same = false;
                d = Math.Pow(g, a)%b;
                for (int i = 1; i < b+1; i++)
                {
                    if (d == c[i])
                        same = true;
                }
                if (same!=true)
                {
                    c[a] = (int)d;
                    count++;
                }

            }
            sum.Text = count.ToString();
        }
    }
}
