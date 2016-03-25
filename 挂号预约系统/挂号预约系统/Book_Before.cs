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
    public partial class Book_Before : Form
    {
        public Book_Before()
        {
            InitializeComponent();
        }

        private void 预约信息BindingNavigatorSaveItem_Click(object sender, EventArgs e)
        {
            this.Validate();
            this.预约信息BindingSource.EndEdit();
            this.tableAdapterManager.UpdateAll(this.预约挂号DataSet);

        }

        private void Book_Before_Load(object sender, EventArgs e)
        {
            // TODO: 这行代码将数据加载到表“预约挂号DataSet.预约信息”中。您可以根据需要移动或删除它。
            this.预约信息TableAdapter.Fill(this.预约挂号DataSet.预约信息);

        }

        private void fillBy2ToolStripButton_Click(object sender, EventArgs e)
        {
            try
            {
                this.预约信息TableAdapter.FillBy2(this.预约挂号DataSet.预约信息, new System.Nullable<int>(((int)(System.Convert.ChangeType(预约医生IDToolStripTextBox.Text, typeof(int))))), new System.Nullable<System.DateTime>(((System.DateTime)(System.Convert.ChangeType(预约时间ToolStripTextBox.Text, typeof(System.DateTime))))), ((bool)(System.Convert.ChangeType(预约状态ToolStripTextBox.Text, typeof(bool)))));
            }
            catch (System.Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }

        }
    }
}
