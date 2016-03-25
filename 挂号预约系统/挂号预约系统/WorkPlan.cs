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
    public partial class WorkPlan : Form
    {

        DateTime yesterday;
        public WorkPlan()
        {
            InitializeComponent();
        }

        private void 预约信息BindingNavigatorSaveItem_Click(object sender, EventArgs e)
        {
            this.Validate();
            this.预约信息BindingSource.EndEdit();
            this.tableAdapterManager.UpdateAll(this.预约挂号DataSet);

        }

        private void WorkPlan_Load(object sender, EventArgs e)
        {
            // TODO: 这行代码将数据加载到表“预约挂号DataSet.医生”中。您可以根据需要移动或删除它。
            this.医生TableAdapter.Fill(this.预约挂号DataSet.医生);
            // TODO: 这行代码将数据加载到表“预约挂号DataSet.预约信息”中。您可以根据需要移动或删除它。
            this.预约信息TableAdapter.Fill(this.预约挂号DataSet.预约信息);
            yesterday = DateTime.Today.AddDays(-1);
            预约时间ToolStripTextBox.Text = yesterday.ToString();
            planToolStripButton.PerformClick();//刷新到今天，安排后续工作
        }

        private void planToolStripButton_Click(object sender, EventArgs e)
        {
            try
            {
                this.预约信息TableAdapter.Plan(this.预约挂号DataSet.预约信息, new System.Nullable<System.DateTime>(((System.DateTime)(System.Convert.ChangeType(预约时间ToolStripTextBox.Text, typeof(System.DateTime))))));
            }
            catch (System.Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }

        }

        private void addPlanB_Click(object sender, EventArgs e)
        {
            int docId = (int)医生TableAdapter.GetDoctorByName(docNameTB.Text)[0]["医生ID"];
            string fee = 医生TableAdapter.GetDoctorByName(docNameTB.Text)[0]["费用"].ToString();
            DataTable dta = 工作时间TableAdapter1.GetDataByID(docId);
            DateTime date = dateTimePicker1.Value.Date;
            for (int i = 0; i < dta.Rows.Count; i++)
            {
                预约信息TableAdapter.AddPlan(null, docId, date,fee, false,dta.Rows[i]["工作时间"].ToString());
            }
            MessageBox.Show("工作日程添加成功", "添加成功");
            this.OnLoad(null);
        }

        private void addAllB_Click(object sender, EventArgs e)
        {
            DataTable ddta = 医生TableAdapter.GetData();
            DateTime date = dateTimePicker1.Value.Date;
            for (int i = 0; i < ddta.Rows.Count; i++)
            {
                int docID = (int)ddta.Rows[i]["医生ID"];
                string fee = ddta.Rows[i]["费用"].ToString();
                DataTable dta = 工作时间TableAdapter1.GetDataByID(docID);
                for (int j = 0; j < dta.Rows.Count; j++)
                {
                    预约信息TableAdapter.AddPlan(null, docID, date, fee, false, dta.Rows[j]["工作时间"].ToString());
                }
            }
            MessageBox.Show("工作日程添加成功", "添加成功");
            this.OnLoad(null);
        }

        private void addAWeekB_Click(object sender, EventArgs e)
        {

            DataTable ddta = 医生TableAdapter.GetData();
            
            for (int i = 0; i < ddta.Rows.Count; i++)
            {
                DateTime date = dateTimePicker1.Value.Date;
                int docID = (int)ddta.Rows[i]["医生ID"];
                string fee = ddta.Rows[i]["费用"].ToString();
                DataTable dta = 工作时间TableAdapter1.GetDataByID(docID);

                for (int k = 0; k <= 5; k++)
                {
                    date = date.AddDays(1).Date;
                    
                    for (int j = 0; j < dta.Rows.Count; j++)
                    {

                        预约信息TableAdapter.AddPlan(null, docID, date, fee, false, dta.Rows[j]["工作时间"].ToString());

                    }
                }
            }
            MessageBox.Show("工作日程添加成功", "添加成功");
            this.OnLoad(null);
        }
    }
}
