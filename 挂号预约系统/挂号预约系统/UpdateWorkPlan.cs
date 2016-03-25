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
    public partial class UpdateWorkPlan : Form
    {
        public UpdateWorkPlan()
        {
            InitializeComponent();
        }

        private void 工作时间BindingNavigatorSaveItem_Click(object sender, EventArgs e)
        {
            this.Validate();
            this.工作时间BindingSource.EndEdit();
            this.tableAdapterManager.UpdateAll(this.预约挂号DataSet);

        }

        private void UpdateWorkPlan_Load(object sender, EventArgs e)
        {
            // TODO: 这行代码将数据加载到表“预约挂号DataSet.工作时间”中。您可以根据需要移动或删除它。
            this.工作时间TableAdapter.Fill(this.预约挂号DataSet.工作时间);

        }
    }
}
