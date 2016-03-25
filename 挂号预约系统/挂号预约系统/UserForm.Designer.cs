namespace 挂号预约系统
{
    partial class UserForm
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
            this.components = new System.ComponentModel.Container();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.hospitalCB = new System.Windows.Forms.ComboBox();
            this.医院BindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.预约挂号DataSet = new 挂号预约系统.预约挂号DataSet();
            this.directionCB = new System.Windows.Forms.ComboBox();
            this.医院TableAdapter = new 挂号预约系统.预约挂号DataSetTableAdapters.医院TableAdapter();
            this.医生TableAdapter1 = new 挂号预约系统.预约挂号DataSetTableAdapters.医生TableAdapter();
            this.doctorCB = new System.Windows.Forms.ComboBox();
            this.label3 = new System.Windows.Forms.Label();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.check = new System.Windows.Forms.Button();
            this.introL = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.预约信息BindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.预约信息TableAdapter = new 挂号预约系统.预约挂号DataSetTableAdapters.预约信息TableAdapter();
            this.tableAdapterManager = new 挂号预约系统.预约挂号DataSetTableAdapters.TableAdapterManager();
            this.label5 = new System.Windows.Forms.Label();
            this.alrightB = new System.Windows.Forms.Button();
            this.cancelB = new System.Windows.Forms.Button();
            this.预约信息DataGridView = new System.Windows.Forms.DataGridView();
            this.dataGridViewTextBoxColumn4 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn5 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewCheckBoxColumn1 = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            this.dataGridViewTextBoxColumn6 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.checkB = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.医院BindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约挂号DataSet)).BeginInit();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息BindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息DataGridView)).BeginInit();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(10, 36);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(53, 12);
            this.label1.TabIndex = 0;
            this.label1.Text = "医院地址";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(10, 85);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(53, 12);
            this.label2.TabIndex = 1;
            this.label2.Text = "治疗方向";
            // 
            // hospitalCB
            // 
            this.hospitalCB.DataSource = this.医院BindingSource;
            this.hospitalCB.DisplayMember = "医院地址";
            this.hospitalCB.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.hospitalCB.FormattingEnabled = true;
            this.hospitalCB.Location = new System.Drawing.Point(81, 33);
            this.hospitalCB.Name = "hospitalCB";
            this.hospitalCB.Size = new System.Drawing.Size(157, 20);
            this.hospitalCB.TabIndex = 1;
            this.hospitalCB.ValueMember = "医院ID";
            // 
            // 医院BindingSource
            // 
            this.医院BindingSource.DataMember = "医院";
            this.医院BindingSource.DataSource = this.预约挂号DataSet;
            // 
            // 预约挂号DataSet
            // 
            this.预约挂号DataSet.DataSetName = "预约挂号DataSet";
            this.预约挂号DataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // directionCB
            // 
            this.directionCB.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.directionCB.FormattingEnabled = true;
            this.directionCB.Location = new System.Drawing.Point(81, 82);
            this.directionCB.Name = "directionCB";
            this.directionCB.Size = new System.Drawing.Size(157, 20);
            this.directionCB.TabIndex = 2;
            this.directionCB.DropDown += new System.EventHandler(this.directionCB_DropDown);
            // 
            // 医院TableAdapter
            // 
            this.医院TableAdapter.ClearBeforeFill = true;
            // 
            // 医生TableAdapter1
            // 
            this.医生TableAdapter1.ClearBeforeFill = true;
            // 
            // doctorCB
            // 
            this.doctorCB.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList;
            this.doctorCB.FormattingEnabled = true;
            this.doctorCB.Location = new System.Drawing.Point(81, 135);
            this.doctorCB.Name = "doctorCB";
            this.doctorCB.Size = new System.Drawing.Size(157, 20);
            this.doctorCB.TabIndex = 3;
            this.doctorCB.DropDown += new System.EventHandler(this.doctorCB_DropDown);
            this.doctorCB.SelectedIndexChanged += new System.EventHandler(this.doctorCB_SelectedIndexChanged);
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(10, 138);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(53, 12);
            this.label3.TabIndex = 4;
            this.label3.Text = "医师选择";
            // 
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.check);
            this.groupBox1.Controls.Add(this.introL);
            this.groupBox1.Controls.Add(this.label4);
            this.groupBox1.Controls.Add(this.doctorCB);
            this.groupBox1.Controls.Add(this.label3);
            this.groupBox1.Controls.Add(this.directionCB);
            this.groupBox1.Controls.Add(this.hospitalCB);
            this.groupBox1.Controls.Add(this.label2);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Location = new System.Drawing.Point(19, 12);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(255, 365);
            this.groupBox1.TabIndex = 6;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "医师查询";
            // 
            // check
            // 
            this.check.Location = new System.Drawing.Point(115, 325);
            this.check.Name = "check";
            this.check.Size = new System.Drawing.Size(123, 32);
            this.check.TabIndex = 4;
            this.check.Text = "查询时间";
            this.check.UseVisualStyleBackColor = true;
            this.check.Click += new System.EventHandler(this.check_Click);
            // 
            // introL
            // 
            this.introL.BackColor = System.Drawing.SystemColors.ButtonHighlight;
            this.introL.Location = new System.Drawing.Point(13, 199);
            this.introL.Name = "introL";
            this.introL.Size = new System.Drawing.Size(224, 111);
            this.introL.TabIndex = 10;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(10, 178);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(65, 12);
            this.label4.TabIndex = 11;
            this.label4.Text = "医生简介：";
            // 
            // 预约信息BindingSource
            // 
            this.预约信息BindingSource.DataMember = "预约信息";
            this.预约信息BindingSource.DataSource = this.预约挂号DataSet;
            // 
            // 预约信息TableAdapter
            // 
            this.预约信息TableAdapter.ClearBeforeFill = true;
            // 
            // tableAdapterManager
            // 
            this.tableAdapterManager.BackupDataSetBeforeUpdate = false;
            this.tableAdapterManager.UpdateOrder = 挂号预约系统.预约挂号DataSetTableAdapters.TableAdapterManager.UpdateOrderOption.InsertUpdateDelete;
            this.tableAdapterManager.医生TableAdapter = this.医生TableAdapter1;
            this.tableAdapterManager.医院TableAdapter = this.医院TableAdapter;
            this.tableAdapterManager.工作时间TableAdapter = null;
            this.tableAdapterManager.用户TableAdapter = null;
            this.tableAdapterManager.电子病历TableAdapter = null;
            this.tableAdapterManager.预约信息TableAdapter = this.预约信息TableAdapter;
            // 
            // label5
            // 
            this.label5.Location = new System.Drawing.Point(287, 333);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(165, 44);
            this.label5.TabIndex = 9;
            this.label5.Text = "请勾选需要预约的时间,并单击“确认”按钮。如需取消预约，请单击取消预约按钮";
            // 
            // alrightB
            // 
            this.alrightB.Location = new System.Drawing.Point(655, 329);
            this.alrightB.Name = "alrightB";
            this.alrightB.Size = new System.Drawing.Size(66, 40);
            this.alrightB.TabIndex = 6;
            this.alrightB.Text = "确认";
            this.alrightB.UseVisualStyleBackColor = true;
            this.alrightB.Click += new System.EventHandler(this.alrightB_Click);
            // 
            // cancelB
            // 
            this.cancelB.Location = new System.Drawing.Point(566, 329);
            this.cancelB.Name = "cancelB";
            this.cancelB.Size = new System.Drawing.Size(83, 41);
            this.cancelB.TabIndex = 8;
            this.cancelB.Text = "取消预约";
            this.cancelB.UseVisualStyleBackColor = true;
            this.cancelB.Click += new System.EventHandler(this.cancelB_Click);
            // 
            // 预约信息DataGridView
            // 
            this.预约信息DataGridView.AutoGenerateColumns = false;
            this.预约信息DataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.预约信息DataGridView.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.dataGridViewTextBoxColumn4,
            this.dataGridViewTextBoxColumn5,
            this.dataGridViewCheckBoxColumn1,
            this.dataGridViewTextBoxColumn6});
            this.预约信息DataGridView.DataSource = this.预约信息BindingSource;
            this.预约信息DataGridView.Location = new System.Drawing.Point(289, 23);
            this.预约信息DataGridView.Name = "预约信息DataGridView";
            this.预约信息DataGridView.RowTemplate.Height = 23;
            this.预约信息DataGridView.Size = new System.Drawing.Size(432, 299);
            this.预约信息DataGridView.TabIndex = 5;
            // 
            // dataGridViewTextBoxColumn4
            // 
            this.dataGridViewTextBoxColumn4.DataPropertyName = "预约时间";
            this.dataGridViewTextBoxColumn4.HeaderText = "预约时间";
            this.dataGridViewTextBoxColumn4.Name = "dataGridViewTextBoxColumn4";
            // 
            // dataGridViewTextBoxColumn5
            // 
            this.dataGridViewTextBoxColumn5.DataPropertyName = "费用";
            this.dataGridViewTextBoxColumn5.HeaderText = "费用";
            this.dataGridViewTextBoxColumn5.Name = "dataGridViewTextBoxColumn5";
            // 
            // dataGridViewCheckBoxColumn1
            // 
            this.dataGridViewCheckBoxColumn1.DataPropertyName = "预约状态";
            this.dataGridViewCheckBoxColumn1.HeaderText = "预约状态";
            this.dataGridViewCheckBoxColumn1.Name = "dataGridViewCheckBoxColumn1";
            // 
            // dataGridViewTextBoxColumn6
            // 
            this.dataGridViewTextBoxColumn6.DataPropertyName = "时间段";
            this.dataGridViewTextBoxColumn6.HeaderText = "时间段";
            this.dataGridViewTextBoxColumn6.Name = "dataGridViewTextBoxColumn6";
            // 
            // checkB
            // 
            this.checkB.Location = new System.Drawing.Point(450, 328);
            this.checkB.Name = "checkB";
            this.checkB.Size = new System.Drawing.Size(110, 41);
            this.checkB.TabIndex = 7;
            this.checkB.Text = "查看我的预约记录";
            this.checkB.UseVisualStyleBackColor = true;
            this.checkB.Click += new System.EventHandler(this.checkB_Click);
            // 
            // UserForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(741, 397);
            this.Controls.Add(this.checkB);
            this.Controls.Add(this.预约信息DataGridView);
            this.Controls.Add(this.cancelB);
            this.Controls.Add(this.alrightB);
            this.Controls.Add(this.label5);
            this.Controls.Add(this.groupBox1);
            this.Name = "UserForm";
            this.Text = "欢迎使用";
            this.Load += new System.EventHandler(this.UserForm_Load);
            ((System.ComponentModel.ISupportInitialize)(this.医院BindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约挂号DataSet)).EndInit();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息BindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息DataGridView)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.ComboBox hospitalCB;
        private System.Windows.Forms.ComboBox directionCB;
        private 预约挂号DataSet 预约挂号DataSet;
        private System.Windows.Forms.BindingSource 医院BindingSource;
        private 预约挂号DataSetTableAdapters.医院TableAdapter 医院TableAdapter;
        private 预约挂号DataSetTableAdapters.医生TableAdapter 医生TableAdapter1;
        private System.Windows.Forms.ComboBox doctorCB;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.Label introL;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Button check;
        private System.Windows.Forms.BindingSource 预约信息BindingSource;
        private 预约挂号DataSetTableAdapters.预约信息TableAdapter 预约信息TableAdapter;
        private 预约挂号DataSetTableAdapters.TableAdapterManager tableAdapterManager;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Button alrightB;
        private System.Windows.Forms.Button cancelB;
        private System.Windows.Forms.DataGridView 预约信息DataGridView;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn4;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn5;
        private System.Windows.Forms.DataGridViewCheckBoxColumn dataGridViewCheckBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn6;
        private System.Windows.Forms.Button checkB;
    }
}