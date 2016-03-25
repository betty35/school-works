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
    public partial class UpdateDoctors : Form
    {
        public UpdateDoctors()
        {
            InitializeComponent();
        }

        private void 医生BindingNavigatorSaveItem_Click(object sender, EventArgs e)
        {
            this.Validate();
            this.医生BindingSource.EndEdit();
            this.tableAdapterManager.UpdateAll(this.预约挂号DataSet);

        }

        private void UpdateDoctors_Load(object sender, EventArgs e)
        {
            // TODO: 这行代码将数据加载到表“预约挂号DataSet.医生”中。您可以根据需要移动或删除它。
            this.医生TableAdapter.Fill(this.预约挂号DataSet.医生);

        }
    }
}
