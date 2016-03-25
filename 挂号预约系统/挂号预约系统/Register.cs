using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;

namespace 挂号预约系统
{
    public partial class Register : Form
    {
        public Register()
        {
            InitializeComponent();
        }

        private void RegisterB_Click(object sender, EventArgs e)
        {
            warningTB.Text = "";
            warning2TB.Text = "";
            if (userNameTB.Text == "")
                warningTB.Text = "用户名不能为空";
            else if (userNameTB.Text.Length>6&&userNameTB.Text.Substring(0, 5) == "Admin")
                warningTB.Text = "您不能注册管理员账户";
            else if (userNameTB.Text.Length>6&&userNameTB.Text.Substring(0, 5) == "doctor")
                warningTB.Text = "您不能注册医生用户";
            else if (this.userTableAdapter.NameExisted(userNameTB.Text) == 1)
                warningTB.Text = "用户名已存在，请更换";
            else if (passwordTb.Text == "")
                warning2TB.Text = "密码不能为空";
            else if (passwordTb.Text.Length < 6 || passwordTb.Text.Length > 16)
                warning2TB.Text = "密码应在6至16位";
            else if (againTB.Text != passwordTb.Text)
                warning2TB.Text = "两次密码输入不一致，请确认";
            else if (genderCB.Text == "")
                warning3TB.Text="请填写性别"; 
            else if (historyTB.Text != "")
            {
                if (!isNumberic(historyTB.Text))
                    warning2TB.Text = "病例号应为数字";
                else if (userTableAdapter.HistoryExisted(Convert.ToInt32(historyTB.Text)) == 1)
                {
                    MessageBox.Show("该病历号已被注册", "请更改");
                }
                else
                {
                    this.userTableAdapter.NewUser(passwordTb.Text, nameTB.Text, genderCB.Text, dateTimePicker1.Value.Date, Convert.ToInt32(historyTB.Text), userNameTB.Text);
                    MessageBox.Show("注册成功", "请返回登陆");
                }
            }
            else
            {
                int historyID = (int)userTableAdapter.GetHighHistoryID()[0]["电子病历号"] + 1;
                this.userTableAdapter.NewUser(passwordTb.Text, nameTB.Text, genderCB.Text, dateTimePicker1.Value.Date, historyID, userNameTB.Text);
                MessageBox.Show("注册成功", "请返回登陆");
            }
        }


        protected bool isNumberic(string message)
        {
            //判断是否为整数字符串
            //是的话返回true, 否则为false
            int result = -1;
            try
            {

                result = Convert.ToInt32(message);
                return true;
            }
            catch
            {
                return false;
            }
        }

        private void refillB_Click(object sender, EventArgs e)
        {
            userNameTB.Text = "";
            passwordTb.Text = "";
            historyTB.Text = "";
            nameTB.Text = "";
            againTB.Text = "";

        }

    }
}
