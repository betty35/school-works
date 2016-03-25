namespace 挂号预约系统
{
    partial class DoctorForm
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
            this.timetableB = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // timetableB
            // 
            this.timetableB.Location = new System.Drawing.Point(165, 20);
            this.timetableB.Name = "timetableB";
            this.timetableB.Size = new System.Drawing.Size(139, 46);
            this.timetableB.TabIndex = 0;
            this.timetableB.Text = "查看预约时间表";
            this.timetableB.UseVisualStyleBackColor = true;
            this.timetableB.Click += new System.EventHandler(this.timetableB_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("宋体", 15.75F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(134)));
            this.label1.Location = new System.Drawing.Point(31, 31);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(94, 21);
            this.label1.TabIndex = 2;
            this.label1.Text = "欢迎登陆";
            // 
            // DoctorForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(346, 102);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.timetableB);
            this.Name = "DoctorForm";
            this.Text = "医生端主界面";
            this.Load += new System.EventHandler(this.DoctorForm_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button timetableB;
        private System.Windows.Forms.Label label1;
    }
}