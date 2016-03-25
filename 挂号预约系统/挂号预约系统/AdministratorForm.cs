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
    public partial class AdministratorForm : Form
    {
        public AdministratorForm()
        {
            InitializeComponent();
        }

        private void before_Click(object sender, EventArgs e)
        {
            Book_Before book = new Book_Before();
            book.Show();

        }

        private void after_Click(object sender, EventArgs e)
        {
            WorkPlan plan = new WorkPlan();
            plan.Show();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            UpdateDoctors doc = new UpdateDoctors();
            doc.Show();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            UpdateWorkPlan workplan = new UpdateWorkPlan();
            workplan.Show();
        }
    }
}
