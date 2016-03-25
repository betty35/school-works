namespace 挂号预约系统
{
    partial class AdministratorForm
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
            this.before = new System.Windows.Forms.Button();
            this.after = new System.Windows.Forms.Button();
            this.button1 = new System.Windows.Forms.Button();
            this.button2 = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // before
            // 
            this.before.Location = new System.Drawing.Point(46, 41);
            this.before.Name = "before";
            this.before.Size = new System.Drawing.Size(121, 32);
            this.before.TabIndex = 0;
            this.before.Text = "查看预约记录";
            this.before.UseVisualStyleBackColor = true;
            this.before.Click += new System.EventHandler(this.before_Click);
            // 
            // after
            // 
            this.after.Location = new System.Drawing.Point(230, 41);
            this.after.Name = "after";
            this.after.Size = new System.Drawing.Size(121, 32);
            this.after.TabIndex = 1;
            this.after.Text = "更新后续工作安排";
            this.after.UseVisualStyleBackColor = true;
            this.after.Click += new System.EventHandler(this.after_Click);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(46, 111);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(121, 32);
            this.button1.TabIndex = 2;
            this.button1.Text = "维护医生信息";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(230, 111);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(121, 32);
            this.button2.TabIndex = 3;
            this.button2.Text = "维护个人工作安排";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // AdministratorForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(402, 182);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.after);
            this.Controls.Add(this.before);
            this.Name = "AdministratorForm";
            this.Text = "您好，管理员";
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Button before;
        private System.Windows.Forms.Button after;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.Button button2;
    }
}