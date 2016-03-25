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
    public partial class 登陆界面 : Form
    {
        public 登陆界面()
        {
            InitializeComponent();
           
            
            this.skinEngine1.SkinFile = Application.StartupPath + "//Midsummer.ssk";
        }

        private void LoginB_Click(object sender, EventArgs e)
        {


            if (usernameTB.Text == "" || passwordTB.Text == "")
            {
                MessageBox.Show("请填写用户名和密码", "登陆信息不完整");
            }
            else
            {
                
                if (this.TableAdapter.NameExisted(usernameTB.Text) != 1)
                {
                    MessageBox.Show("该用户不存在", "用户名错误");
                }
                else
                {
                    string password = this.TableAdapter.GetPassword(usernameTB.Text)[0]["密码"].ToString();
                    if (password != passwordTB.Text)
                    {
                        MessageBox.Show("用户名不存在或密码错误", "请重新输入", MessageBoxButtons.OK, MessageBoxIcon.Asterisk);
                    }
                    else if (usernameTB.Text.Length > 6)
                    {
                        if (usernameTB.Text.Substring(0, 5) == "Admin")
                        {
                            AdministratorForm Admin = new AdministratorForm();
                            Admin.Show();
                        }
                        else if (usernameTB.Text.Substring(0, 6) == "doctor")
                        {
                            DoctorForm Doctor = new DoctorForm(getId(usernameTB.Text));
                            Doctor.Show();
                        }
                        else
                        {
                            UserForm User = new UserForm(Convert.ToInt32(TableAdapter.GetId(usernameTB.Text)[0][0]));
                            User.Show();

                        }
                    }
                    else
                    {
                        UserForm User = new UserForm(Convert.ToInt32(TableAdapter.GetId(usernameTB.Text)[0][0]));
                        User.Show();

                    }
                }
                
            }
        }

        private void RigiB_Click(object sender, EventArgs e)
        {
            Register RegiForm = new Register();
            RegiForm.Show();
        }

        private void 登陆界面_Load(object sender, EventArgs e)
        {

        }

        private int getId(string username)
        {
            int idNeeded;
            string number = username.Substring(username.Length - 3, 3);
            if (number[1] == 0&number[0]==0)
            {
                idNeeded = Convert.ToInt32(number[2]);
            }
            else if (number[0] == 0)
            {
                idNeeded = Convert.ToInt32(number.Substring(1, 2));
            }
            else
            {
                idNeeded = Convert.ToInt32(number);
            }
            return idNeeded;
        }
    }
}
