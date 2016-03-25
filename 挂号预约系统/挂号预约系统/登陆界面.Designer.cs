namespace 挂号预约系统
{
    partial class 登陆界面
    {
        /// <summary>
        /// 必需的设计器变量。
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// 清理所有正在使用的资源。
        /// </summary>
        /// <param name="disposing">如果应释放托管资源，为 true；否则为 false。</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows 窗体设计器生成的代码

        /// <summary>
        /// 设计器支持所需的方法 - 不要
        /// 使用代码编辑器修改此方法的内容。
        /// </summary>
        private void InitializeComponent()
        {
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.RigiB = new System.Windows.Forms.Button();
            this.LoginB = new System.Windows.Forms.Button();
            this.usernameTB = new System.Windows.Forms.TextBox();
            this.passwordTB = new System.Windows.Forms.MaskedTextBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.TableAdapter = new 挂号预约系统.预约挂号DataSetTableAdapters.用户TableAdapter();
            this.skinEngine1 = new Sunisoft.IrisSkin.SkinEngine();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.RigiB);
            this.groupBox1.Controls.Add(this.LoginB);
            this.groupBox1.Controls.Add(this.usernameTB);
            this.groupBox1.Controls.Add(this.passwordTB);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Location = new System.Drawing.Point(21, 31);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(242, 200);
            this.groupBox1.TabIndex = 3;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "用户登陆";
            // 
            // RigiB
            // 
            this.RigiB.Location = new System.Drawing.Point(127, 147);
            this.RigiB.Name = "RigiB";
            this.RigiB.Size = new System.Drawing.Size(87, 24);
            this.RigiB.TabIndex = 4;
            this.RigiB.Text = "注册";
            this.RigiB.UseVisualStyleBackColor = true;
            this.RigiB.Click += new System.EventHandler(this.RigiB_Click);
            // 
            // LoginB
            // 
            this.LoginB.Location = new System.Drawing.Point(17, 147);
            this.LoginB.Name = "LoginB";
            this.LoginB.Size = new System.Drawing.Size(87, 24);
            this.LoginB.TabIndex = 3;
            this.LoginB.Text = "登陆";
            this.LoginB.UseVisualStyleBackColor = true;
            this.LoginB.Click += new System.EventHandler(this.LoginB_Click);
            // 
            // usernameTB
            // 
            this.usernameTB.Location = new System.Drawing.Point(87, 42);
            this.usernameTB.Name = "usernameTB";
            this.usernameTB.Size = new System.Drawing.Size(127, 21);
            this.usernameTB.TabIndex = 1;
            // 
            // passwordTB
            // 
            this.passwordTB.Location = new System.Drawing.Point(87, 83);
            this.passwordTB.Name = "passwordTB";
            this.passwordTB.Size = new System.Drawing.Size(127, 21);
            this.passwordTB.TabIndex = 2;
            this.passwordTB.UseSystemPasswordChar = true;
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(15, 86);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(41, 12);
            this.label2.TabIndex = 1;
            this.label2.Text = "密码：";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(15, 45);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(53, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "用户名：";
            // 
            // TableAdapter
            // 
            this.TableAdapter.ClearBeforeFill = true;
            // 
            // skinEngine1
            // 
            this.skinEngine1.@__DrawButtonFocusRectangle = true;
            this.skinEngine1.DisabledButtonTextColor = System.Drawing.Color.Gray;
            this.skinEngine1.DisabledMenuFontColor = System.Drawing.SystemColors.GrayText;
            this.skinEngine1.InactiveCaptionColor = System.Drawing.SystemColors.InactiveCaptionText;
            this.skinEngine1.SerialNumber = "";
            this.skinEngine1.SkinFile = null;
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::挂号预约系统.Properties.Resources.箭_绿色图标符号_21855458;
            this.pictureBox1.Location = new System.Drawing.Point(269, 39);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(265, 191);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 4;
            this.pictureBox1.TabStop = false;
            // 
            // 登陆界面
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(540, 262);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.groupBox1);
            this.Name = "登陆界面";
            this.Text = "欢迎使用XXX挂号预约系统";
            this.Load += new System.EventHandler(this.登陆界面_Load);
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion
       
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Button RigiB;
        private System.Windows.Forms.Button LoginB;
        private System.Windows.Forms.TextBox usernameTB;
        private System.Windows.Forms.MaskedTextBox passwordTB;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private 预约挂号DataSetTableAdapters.用户TableAdapter TableAdapter;
        private Sunisoft.IrisSkin.SkinEngine skinEngine1;
        private System.Windows.Forms.PictureBox pictureBox1;
    }
}

