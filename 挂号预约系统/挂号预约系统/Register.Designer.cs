namespace 挂号预约系统
{
    partial class Register
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
            this.refillB = new System.Windows.Forms.Button();
            this.nameTB = new System.Windows.Forms.TextBox();
            this.label7 = new System.Windows.Forms.Label();
            this.againTB = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.warning2TB = new System.Windows.Forms.Label();
            this.warningTB = new System.Windows.Forms.Label();
            this.RegisterB = new System.Windows.Forms.Button();
            this.historyTB = new System.Windows.Forms.TextBox();
            this.label5 = new System.Windows.Forms.Label();
            this.genderCB = new System.Windows.Forms.ComboBox();
            this.dateTimePicker1 = new System.Windows.Forms.DateTimePicker();
            this.passwordTb = new System.Windows.Forms.TextBox();
            this.userNameTB = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.userTableAdapter = new 挂号预约系统.预约挂号DataSetTableAdapters.用户TableAdapter();
            this.warning3TB = new System.Windows.Forms.Label();
            this.SuspendLayout();
            // 
            // refillB
            // 
            this.refillB.Location = new System.Drawing.Point(282, 167);
            this.refillB.Name = "refillB";
            this.refillB.Size = new System.Drawing.Size(111, 27);
            this.refillB.TabIndex = 38;
            this.refillB.Text = "重新填写";
            this.refillB.UseVisualStyleBackColor = true;
            this.refillB.Click += new System.EventHandler(this.refillB_Click);
            // 
            // nameTB
            // 
            this.nameTB.Location = new System.Drawing.Point(312, 20);
            this.nameTB.Name = "nameTB";
            this.nameTB.Size = new System.Drawing.Size(81, 21);
            this.nameTB.TabIndex = 37;
            // 
            // label7
            // 
            this.label7.AutoSize = true;
            this.label7.Location = new System.Drawing.Point(265, 23);
            this.label7.Name = "label7";
            this.label7.Size = new System.Drawing.Size(41, 12);
            this.label7.TabIndex = 36;
            this.label7.Text = "姓名：";
            // 
            // againTB
            // 
            this.againTB.Location = new System.Drawing.Point(94, 96);
            this.againTB.MaxLength = 16;
            this.againTB.Name = "againTB";
            this.againTB.PasswordChar = '*';
            this.againTB.Size = new System.Drawing.Size(146, 21);
            this.againTB.TabIndex = 35;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(17, 99);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(65, 12);
            this.label6.TabIndex = 34;
            this.label6.Text = "重复密码：";
            // 
            // warning2TB
            // 
            this.warning2TB.AutoSize = true;
            this.warning2TB.Location = new System.Drawing.Point(92, 81);
            this.warning2TB.Name = "warning2TB";
            this.warning2TB.Size = new System.Drawing.Size(0, 12);
            this.warning2TB.TabIndex = 33;
            // 
            // warningTB
            // 
            this.warningTB.AutoSize = true;
            this.warningTB.Font = new System.Drawing.Font("SimSun", 7F);
            this.warningTB.Location = new System.Drawing.Point(92, 45);
            this.warningTB.Name = "warningTB";
            this.warningTB.Size = new System.Drawing.Size(0, 10);
            this.warningTB.TabIndex = 32;
            // 
            // RegisterB
            // 
            this.RegisterB.Location = new System.Drawing.Point(282, 118);
            this.RegisterB.Name = "RegisterB";
            this.RegisterB.Size = new System.Drawing.Size(111, 27);
            this.RegisterB.TabIndex = 31;
            this.RegisterB.Text = "注册";
            this.RegisterB.UseVisualStyleBackColor = true;
            this.RegisterB.Click += new System.EventHandler(this.RegisterB_Click);
            // 
            // historyTB
            // 
            this.historyTB.Location = new System.Drawing.Point(312, 57);
            this.historyTB.Name = "historyTB";
            this.historyTB.Size = new System.Drawing.Size(81, 21);
            this.historyTB.TabIndex = 30;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(265, 62);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(47, 12);
            this.label5.TabIndex = 29;
            this.label5.Text = "病历号:";
            // 
            // genderCB
            // 
            this.genderCB.FormattingEnabled = true;
            this.genderCB.Items.AddRange(new object[] {
            "男",
            "女"});
            this.genderCB.Location = new System.Drawing.Point(94, 133);
            this.genderCB.Name = "genderCB";
            this.genderCB.Size = new System.Drawing.Size(146, 20);
            this.genderCB.TabIndex = 28;
            this.genderCB.Text = "男";
            // 
            // dateTimePicker1
            // 
            this.dateTimePicker1.Location = new System.Drawing.Point(94, 174);
            this.dateTimePicker1.Name = "dateTimePicker1";
            this.dateTimePicker1.Size = new System.Drawing.Size(146, 21);
            this.dateTimePicker1.TabIndex = 27;
            // 
            // passwordTb
            // 
            this.passwordTb.Location = new System.Drawing.Point(94, 57);
            this.passwordTb.MaxLength = 16;
            this.passwordTb.Name = "passwordTb";
            this.passwordTb.PasswordChar = '*';
            this.passwordTb.Size = new System.Drawing.Size(146, 21);
            this.passwordTb.TabIndex = 26;
            // 
            // userNameTB
            // 
            this.userNameTB.Location = new System.Drawing.Point(94, 21);
            this.userNameTB.Name = "userNameTB";
            this.userNameTB.Size = new System.Drawing.Size(146, 21);
            this.userNameTB.TabIndex = 25;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(17, 174);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(65, 12);
            this.label4.TabIndex = 24;
            this.label4.Text = "出生日期：";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(17, 133);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(41, 12);
            this.label3.TabIndex = 23;
            this.label3.Text = "性别：";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(17, 60);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(41, 12);
            this.label2.TabIndex = 22;
            this.label2.Text = "密码：";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(17, 23);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(53, 12);
            this.label1.TabIndex = 21;
            this.label1.Text = "用户名：";
            // 
            // userTableAdapter
            // 
            this.userTableAdapter.ClearBeforeFill = true;
            // 
            // warning3TB
            // 
            this.warning3TB.AutoSize = true;
            this.warning3TB.Location = new System.Drawing.Point(92, 159);
            this.warning3TB.Name = "warning3TB";
            this.warning3TB.Size = new System.Drawing.Size(0, 12);
            this.warning3TB.TabIndex = 39;
            // 
            // Register
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(420, 217);
            this.Controls.Add(this.warning3TB);
            this.Controls.Add(this.refillB);
            this.Controls.Add(this.nameTB);
            this.Controls.Add(this.label7);
            this.Controls.Add(this.againTB);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.warning2TB);
            this.Controls.Add(this.warningTB);
            this.Controls.Add(this.RegisterB);
            this.Controls.Add(this.historyTB);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.genderCB);
            this.Controls.Add(this.dateTimePicker1);
            this.Controls.Add(this.passwordTb);
            this.Controls.Add(this.userNameTB);
            this.Controls.Add(this.label4);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.label1);
            this.Name = "Register";
            this.Text = "用户注册";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Button refillB;
        private System.Windows.Forms.TextBox nameTB;
        private System.Windows.Forms.Label label7;
        private System.Windows.Forms.TextBox againTB;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Label warning2TB;
        private System.Windows.Forms.Label warningTB;
        private System.Windows.Forms.Button RegisterB;
        private System.Windows.Forms.TextBox historyTB;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.ComboBox genderCB;
        private System.Windows.Forms.DateTimePicker dateTimePicker1;
        private System.Windows.Forms.TextBox passwordTb;
        private System.Windows.Forms.TextBox userNameTB;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private 预约挂号DataSetTableAdapters.用户TableAdapter userTableAdapter;
        private System.Windows.Forms.Label warning3TB;
    }
}