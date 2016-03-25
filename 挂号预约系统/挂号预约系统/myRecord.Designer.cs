namespace 挂号预约系统
{
    partial class myRecord
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.dataGridView1 = new System.Windows.Forms.DataGridView();
            this.预约信息TableAdapter1 = new 挂号预约系统.预约挂号DataSetTableAdapters.预约信息TableAdapter();
            this.医院TableAdapter1 = new 挂号预约系统.预约挂号DataSetTableAdapters.医院TableAdapter();
            this.医生TableAdapter1 = new 挂号预约系统.预约挂号DataSetTableAdapters.医生TableAdapter();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Location = new System.Drawing.Point(19, 16);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 23;
            this.dataGridView1.Size = new System.Drawing.Size(444, 413);
            this.dataGridView1.TabIndex = 0;
            // 
            // 预约信息TableAdapter1
            // 
            this.预约信息TableAdapter1.ClearBeforeFill = true;
            // 
            // 医院TableAdapter1
            // 
            this.医院TableAdapter1.ClearBeforeFill = true;
            // 
            // 医生TableAdapter1
            // 
            this.医生TableAdapter1.ClearBeforeFill = true;
            // 
            // myRecord
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(482, 441);
            this.Controls.Add(this.dataGridView1);
            this.Name = "myRecord";
            this.Text = "我的预约记录";
            this.Load += new System.EventHandler(this.myRecord_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.DataGridView dataGridView1;
        private 预约挂号DataSetTableAdapters.预约信息TableAdapter 预约信息TableAdapter1;
        private 预约挂号DataSetTableAdapters.医院TableAdapter 医院TableAdapter1;
        private 预约挂号DataSetTableAdapters.医生TableAdapter 医生TableAdapter1;

    }
}