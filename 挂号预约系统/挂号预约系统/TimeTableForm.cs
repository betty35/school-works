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
    public partial class TimeTableForm : Form
    {

        int id;
        
        public TimeTableForm(int anId)
        {
            InitializeComponent();
            id = anId;
        }

        private void TimeTableForm_Load(object sender, EventArgs e)
        {
            // TODO: 这行代码将数据加载到表“预约挂号DataSet.预约信息”中。您可以根据需要移动或删除它。
            this.预约信息TableAdapter.Fill(this.预约挂号DataSet.预约信息);
            预约医生ID.Text = id.ToString();
            DateTime date = new DateTime();
            date = DateTime.Today.AddDays(-1);
            预约时间.Text = date.ToString();
            fillByToolStripButton.PerformClick();
        }

        private void 预约信息BindingNavigatorSaveItem_Click(object sender, EventArgs e)
        {
            this.Validate();
            this.预约信息BindingSource.EndEdit();
            this.tableAdapterManager.UpdateAll(this.预约挂号DataSet);

        }

        private void fillByToolStripButton_Click(object sender, EventArgs e)
        {
            try
            {
                this.预约信息TableAdapter.FillBy(this.预约挂号DataSet.预约信息, new System.Nullable<int>(((int)(System.Convert.ChangeType(预约医生ID.Text, typeof(int))))), new System.Nullable<System.DateTime>(((System.DateTime)(System.Convert.ChangeType(预约时间.Text, typeof(System.DateTime))))));
            }
            catch (System.Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }

        }

        private void IDcb_DropDownClosed(object sender, EventArgs e)
        {
           
        }

        private void checkHistoryB_Click(object sender, EventArgs e)
        {
            DataTable dta = 用户TableAdapter1.GetDataByID(Int32.Parse(IDcb.Text));
            int id3 = (int)dta.Rows[0]["电子病历号"];
            checkHistory history = new checkHistory(id3);
            history.Show();

        }


        private void button1_Click(object sender, EventArgs e)
        {
            if (IDcb.Text != "")
            {
                int id2 = Int32.Parse(IDcb.Text);
                DataTable dta = 用户TableAdapter1.GetDataByID(id2);
                string name = dta.Rows[0]["姓名"].ToString();
                string sex = dta.Rows[0]["性别"].ToString();
                string birthday = dta.Rows[0]["出生日期"].ToString();
                birthday = birthday.Substring(0, birthday.IndexOf(' '));
                introL.Text = "姓名：" + name + "\n\n性别：" + sex + "\n\n生日：" + birthday;
            }
            else
                MessageBox.Show("请先选择预约者ID", "请选择");
        }
    }
}
