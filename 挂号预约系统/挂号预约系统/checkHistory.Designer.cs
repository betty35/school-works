namespace 挂号预约系统
{
    partial class checkHistory
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
            this.label1 = new System.Windows.Forms.Label();
            this.recordTB = new System.Windows.Forms.TextBox();
            this.addB = new System.Windows.Forms.Button();
            this.电子病历TableAdapter1 = new 挂号预约系统.预约挂号DataSetTableAdapters.电子病历TableAdapter();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).BeginInit();
            this.SuspendLayout();
            // 
            // dataGridView1
            // 
            this.dataGridView1.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridView1.Location = new System.Drawing.Point(2, 2);
            this.dataGridView1.Name = "dataGridView1";
            this.dataGridView1.RowTemplate.Height = 23;
            this.dataGridView1.Size = new System.Drawing.Size(380, 304);
            this.dataGridView1.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("宋体", 13F);
            this.label1.Location = new System.Drawing.Point(402, 9);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(80, 18);
            this.label1.TabIndex = 1;
            this.label1.Text = "诊断内容";
            // 
            // recordTB
            // 
            this.recordTB.Location = new System.Drawing.Point(403, 40);
            this.recordTB.Multiline = true;
            this.recordTB.Name = "recordTB";
            this.recordTB.Size = new System.Drawing.Size(292, 210);
            this.recordTB.TabIndex = 2;
            // 
            // addB
            // 
            this.addB.Location = new System.Drawing.Point(576, 262);
            this.addB.Name = "addB";
            this.addB.Size = new System.Drawing.Size(119, 32);
            this.addB.TabIndex = 3;
            this.addB.Text = "添加记录";
            this.addB.UseVisualStyleBackColor = true;
            this.addB.Click += new System.EventHandler(this.addB_Click);
            // 
            // 电子病历TableAdapter1
            // 
            this.电子病历TableAdapter1.ClearBeforeFill = true;
            // 
            // checkHistory
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(707, 307);
            this.Controls.Add(this.addB);
            this.Controls.Add(this.recordTB);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.dataGridView1);
            this.Name = "checkHistory";
            this.Text = "查看病历";
            this.Load += new System.EventHandler(this.checkHistory_Load);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridView1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private 预约挂号DataSetTableAdapters.电子病历TableAdapter 电子病历TableAdapter1;
        private System.Windows.Forms.DataGridView dataGridView1;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox recordTB;
        private System.Windows.Forms.Button addB;
    }
}