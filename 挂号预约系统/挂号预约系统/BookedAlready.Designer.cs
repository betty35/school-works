namespace 挂号预约系统
{
    partial class BookedAlready
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
            this.submitB = new System.Windows.Forms.Button();
            this.预约信息TableAdapter1 = new 挂号预约系统.预约挂号DataSetTableAdapters.预约信息TableAdapter();
            this.医生TableAdapter1 = new 挂号预约系统.预约挂号DataSetTableAdapters.医生TableAdapter();
            this.医院TableAdapter1 = new 挂号预约系统.预约挂号DataSetTableAdapters.医院TableAdapter();
            this.panel1 = new System.Windows.Forms.Panel();
            this.label1 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // submitB
            // 
            this.submitB.Location = new System.Drawing.Point(184, 361);
            this.submitB.Name = "submitB";
            this.submitB.Size = new System.Drawing.Size(88, 32);
            this.submitB.TabIndex = 1;
            this.submitB.Text = "确认";
            this.submitB.UseVisualStyleBackColor = true;
            this.submitB.Click += new System.EventHandler(this.submitB_Click);
            // 
            // 预约信息TableAdapter1
            // 
            this.预约信息TableAdapter1.ClearBeforeFill = true;
            // 
            // 医生TableAdapter1
            // 
            this.医生TableAdapter1.ClearBeforeFill = true;
            // 
            // 医院TableAdapter1
            // 
            this.医院TableAdapter1.ClearBeforeFill = true;
            // 
            // panel1
            // 
            this.panel1.Location = new System.Drawing.Point(12, 38);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(259, 317);
            this.panel1.TabIndex = 2;
            // 
            // label1
            // 
            this.label1.Location = new System.Drawing.Point(16, 11);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(254, 32);
            this.label1.TabIndex = 3;
            this.label1.Text = "抱歉，但您不能取消据预约时间3天以内的预约，它们将不会显示";
            // 
            // BookedAlready
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(284, 405);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.submitB);
            this.Name = "BookedAlready";
            this.Text = "可取消的预约记录";
            this.Load += new System.EventHandler(this.BookedAlready_Load);
            this.ResumeLayout(false);

        }

        #endregion

        private 预约挂号DataSetTableAdapters.预约信息TableAdapter 预约信息TableAdapter1;
        private 预约挂号DataSetTableAdapters.医生TableAdapter 医生TableAdapter1;
        private 预约挂号DataSetTableAdapters.医院TableAdapter 医院TableAdapter1;
        private System.Windows.Forms.Button submitB;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label label1;
    }
}