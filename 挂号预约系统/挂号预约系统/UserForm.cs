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
    public partial class UserForm : Form
    {
        int id;
        DataTable doctor;

        public UserForm(int getId)
        {
            InitializeComponent();
            id = getId;
        }

        private void UserForm_Load(object sender, EventArgs e)
        {

            // TODO: 这行代码将数据加载到表“预约挂号DataSet.医院”中。您可以根据需要移动或删除它。
            this.医院TableAdapter.Fill(this.预约挂号DataSet.医院);


        }

        private void directionCB_DropDown(object sender, EventArgs e)
        {

            directionCB.Items.Clear();
            if (hospitalCB.SelectedValue != null)
            {
                DataTable dta = 医生TableAdapter1.GetDirectionByHospitalID((int)hospitalCB.SelectedValue);
                for (int i = 0; i < dta.Rows.Count; i++)
                {
                    directionCB.Items.Add(dta.Rows[i]["治疗方向"]);
                }
            }
            else
                MessageBox.Show("请先选择医院地址", "地址未选择");


        }

        private void doctorCB_DropDown(object sender, EventArgs e)
        {
            doctorCB.Items.Clear();
            if (directionCB.Text == "")
            {
                MessageBox.Show("请先选择需要治疗、诊断的方向", "请选择");
            }
            else
            {
                doctor = 医生TableAdapter1.GetDoctorInfor((int)hospitalCB.SelectedValue, directionCB.Text);

                for (int i = 0; i < doctor.Rows.Count; i++)
                {
                    doctorCB.Items.Add(doctor.Rows[i]["医生姓名"]);
                }
            }
        }

        private void doctorCB_SelectedIndexChanged(object sender, EventArgs e)
        {
            if (doctorCB.Text != "")
            {
                int i = doctorCB.SelectedIndex;
                introL.Text = "联络方式（手机）： " + doctor.Rows[i]["联络方式"] + "\n\n" +
                    doctor.Rows[i]["个人简介"];
            }
        }

        private void check_Click(object sender, EventArgs e)
        {
            DateTime today = DateTime.Today;
            int docid;
            if (doctorCB.Text != "")
            {
                docid = (int)医生TableAdapter1.GetDoctorByName(doctorCB.Text)[0]["医生ID"];
                this.预约信息TableAdapter.FindTime(预约挂号DataSet.预约信息, docid, today, false);
            }
            else
                MessageBox.Show("请先选定医生", "医生未选择");

           
        }

        private void alrightB_Click(object sender, EventArgs e)
        {
            bool changed = false;
            for(int i=0;i<预约挂号DataSet.预约信息.Rows.Count;i++)
            {
                if((bool)预约挂号DataSet.预约信息.Rows[i]["预约状态"])
                {
                    预约信息TableAdapter.Book(id, true, (int)预约挂号DataSet.预约信息.Rows[i]["流水号"]);
                    changed = true;
                }
            }
            if (changed)
            {
                MessageBox.Show("预约成功", "恭喜~");
                check.PerformClick();
            }
        }

        private void cancelB_Click(object sender, EventArgs e)
        {
           
            BookedAlready recordForm = new BookedAlready(id);
            recordForm.Show();
        }

        private void checkB_Click(object sender, EventArgs e)
        {
            myRecord myrecord = new myRecord(id);
            myrecord.Show();
        }



    }   
    
}
