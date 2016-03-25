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
    public partial class checkHistory : Form
    {
        int id;
        public checkHistory(int getId)
        {
            InitializeComponent();
            id = getId;
        }

        private void checkHistory_Load(object sender, EventArgs e)
        {
            DataTable dta=电子病历TableAdapter1.GetDataByID(id);
            dataGridView1.DataSource = dta;

        }

        private void addB_Click(object sender, EventArgs e)
        {
            if (recordTB.Text != "")
            { 
                电子病历TableAdapter1.AddNewRecord(id, recordTB.Text, DateTime.Today.Date);
                dataGridView1.DataSource = 电子病历TableAdapter1.GetDataByID(id);
            }
            else
                MessageBox.Show("未填写诊断内容", "无需添加");
        }
    }
}
