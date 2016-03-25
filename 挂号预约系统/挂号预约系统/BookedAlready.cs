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
    public partial class BookedAlready : Form
    {
        int id;
        public BookedAlready(int getId)
        {
            InitializeComponent();
            id = getId;
        }

        private void BookedAlready_Load(object sender, EventArgs e)
        {
            string date, time, cost, doctor, place,no;
            DataTable dta = 预约信息TableAdapter1.GetDataByUserIDAndTime(id, DateTime.Today.AddDays(3));
            
            for (int i = 0; i < dta.Rows.Count; i++)
            {
                CheckBox eachrow = new CheckBox();
                eachrow.AutoSize = false;
                eachrow.Width = 250;
                eachrow.Height = 55;
                eachrow.Location = new Point(5, 60 * i +10);
                no = dta.Rows[i]["流水号"].ToString();
                eachrow.Name = no.ToString();
                date = dta.Rows[i]["预约时间"].ToString();
                date = date.Substring(0, date.IndexOf(' '));
                time = dta.Rows[i]["时间段"].ToString();
                cost = dta.Rows[i]["费用"].ToString();
                int docID = (int)dta.Rows[i]["预约医生ID"];
                doctor = 医生TableAdapter1.GetDoctorByID(docID)[0]["医生姓名"].ToString();
                int hosID = (int)医生TableAdapter1.GetDoctorByID(docID)[0]["所在医院ID"];
                place = 医院TableAdapter1.GetPlaceByID(hosID)[0]["医院地址"].ToString();
                eachrow.Text = "时间：" + date + " " + time + "\n费用： " + cost +
                    "地址：" + place + "\n预约医生：" + doctor+"  是否取消？";
                panel1.Controls.Add(eachrow);
            }
            
            
        }

        private void submitB_Click(object sender, EventArgs e)
        {
            bool changed = false;
            for (int i = 0; i < this.panel1.Controls.Count; i++)
            {
                if (this.panel1.Controls[i] is CheckBox)
                {
                    CheckBox record = (CheckBox)this.panel1.Controls[i];
                    if (record.Checked)
                    {
                        预约信息TableAdapter1.Book(null, false,Convert.ToInt32(record.Name));
                        changed = true;
                        this.panel1.Controls.RemoveAt(i);
                        panel1.Refresh();
                    }
                   
                }
            }
            if (changed)
                MessageBox.Show("预约取消成功");
        }

       
    }
}
