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
    public partial class myRecord : Form
    {
        int id;
        public myRecord(int getId)
        {
            InitializeComponent();
            id = getId;
        }

        private void myRecord_Load(object sender, EventArgs e)
        {
            string date, time, cost, doctor, place, no;
            DataTable dta = 预约信息TableAdapter1.GetDataByUserIDAndTime(id,DateTime.Today.AddDays(-1));

            DataTable sta = new DataTable();
            sta.Columns.Add("预约时间");
            sta.Columns.Add("医院地址");
            sta.Columns.Add("预约医生");
            sta.Columns.Add("医生联络方式");
            
            for (int i = 0; i < dta.Rows.Count; i++)
            {
                DataRow aRow = sta.NewRow();

                date = dta.Rows[i]["预约时间"].ToString();
                date = date.Substring(0, date.IndexOf(' '));
                time = dta.Rows[i]["时间段"].ToString();
                cost = dta.Rows[i]["费用"].ToString();
                int docID = (int)dta.Rows[i]["预约医生ID"];
                doctor = 医生TableAdapter1.GetDoctorByID(docID)[0]["医生姓名"].ToString();
                no = 医生TableAdapter1.GetDoctorByID(docID)[0]["联络方式"].ToString();
                int hosID = (int)医生TableAdapter1.GetDoctorByID(docID)[0]["所在医院ID"];
                place = 医院TableAdapter1.GetPlaceByID(hosID)[0]["医院地址"].ToString();
                aRow["预约时间"] = date + " " + time;
                aRow["医院地址"] = place;
                aRow["预约医生"] = doctor;
                aRow["医生联络方式"] = no;
                sta.Rows.Add(aRow);
                
            }
            dataGridView1.DataSource = sta;
            
        }

       

        
    }
}
