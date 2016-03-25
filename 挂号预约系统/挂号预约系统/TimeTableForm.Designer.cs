namespace 挂号预约系统
{
    partial class TimeTableForm
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
            this.预约挂号DataSet = new 挂号预约系统.预约挂号DataSet();
            this.预约信息BindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.预约信息TableAdapter = new 挂号预约系统.预约挂号DataSetTableAdapters.预约信息TableAdapter();
            this.tableAdapterManager = new 挂号预约系统.预约挂号DataSetTableAdapters.TableAdapterManager();
            this.预约信息DataGridView = new System.Windows.Forms.DataGridView();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn4 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn5 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.fillByToolStrip = new System.Windows.Forms.ToolStrip();
            this.预约医生IDToolStripLabel = new System.Windows.Forms.ToolStripLabel();
            this.预约医生ID = new System.Windows.Forms.ToolStripTextBox();
            this.预约时间ToolStripLabel = new System.Windows.Forms.ToolStripLabel();
            this.预约时间 = new System.Windows.Forms.ToolStripTextBox();
            this.fillByToolStripButton = new System.Windows.Forms.ToolStripButton();
            this.IDcb = new System.Windows.Forms.ComboBox();
            this.label1 = new System.Windows.Forms.Label();
            this.introL = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.checkHistoryB = new System.Windows.Forms.Button();
            this.用户TableAdapter1 = new 挂号预约系统.预约挂号DataSetTableAdapters.用户TableAdapter();
            this.button1 = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.预约挂号DataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息BindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息DataGridView)).BeginInit();
            this.fillByToolStrip.SuspendLayout();
            this.SuspendLayout();
            // 
            // 预约挂号DataSet
            // 
            this.预约挂号DataSet.DataSetName = "预约挂号DataSet";
            this.预约挂号DataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
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
            this.tableAdapterManager.医生TableAdapter = null;
            this.tableAdapterManager.医院TableAdapter = null;
            this.tableAdapterManager.工作时间TableAdapter = null;
            this.tableAdapterManager.用户TableAdapter = null;
            this.tableAdapterManager.电子病历TableAdapter = null;
            this.tableAdapterManager.预约信息TableAdapter = this.预约信息TableAdapter;
            // 
            // 预约信息DataGridView
            // 
            this.预约信息DataGridView.AllowUserToAddRows = false;
            this.预约信息DataGridView.AllowUserToDeleteRows = false;
            this.预约信息DataGridView.AutoGenerateColumns = false;
            this.预约信息DataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.预约信息DataGridView.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.dataGridViewTextBoxColumn1,
            this.dataGridViewTextBoxColumn2,
            this.dataGridViewTextBoxColumn3,
            this.dataGridViewTextBoxColumn4,
            this.dataGridViewTextBoxColumn5});
            this.预约信息DataGridView.DataSource = this.预约信息BindingSource;
            this.预约信息DataGridView.Location = new System.Drawing.Point(0, 12);
            this.预约信息DataGridView.Name = "预约信息DataGridView";
            this.预约信息DataGridView.ReadOnly = true;
            this.预约信息DataGridView.RowTemplate.Height = 23;
            this.预约信息DataGridView.Size = new System.Drawing.Size(545, 367);
            this.预约信息DataGridView.TabIndex = 1;
            // 
            // dataGridViewTextBoxColumn1
            // 
            this.dataGridViewTextBoxColumn1.DataPropertyName = "流水号";
            this.dataGridViewTextBoxColumn1.HeaderText = "流水号";
            this.dataGridViewTextBoxColumn1.Name = "dataGridViewTextBoxColumn1";
            this.dataGridViewTextBoxColumn1.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn2
            // 
            this.dataGridViewTextBoxColumn2.DataPropertyName = "挂号者ID";
            this.dataGridViewTextBoxColumn2.HeaderText = "挂号者ID";
            this.dataGridViewTextBoxColumn2.Name = "dataGridViewTextBoxColumn2";
            this.dataGridViewTextBoxColumn2.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn3
            // 
            this.dataGridViewTextBoxColumn3.DataPropertyName = "预约医生ID";
            this.dataGridViewTextBoxColumn3.HeaderText = "预约医生ID";
            this.dataGridViewTextBoxColumn3.Name = "dataGridViewTextBoxColumn3";
            this.dataGridViewTextBoxColumn3.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn4
            // 
            this.dataGridViewTextBoxColumn4.DataPropertyName = "预约时间";
            this.dataGridViewTextBoxColumn4.HeaderText = "预约时间";
            this.dataGridViewTextBoxColumn4.Name = "dataGridViewTextBoxColumn4";
            this.dataGridViewTextBoxColumn4.ReadOnly = true;
            // 
            // dataGridViewTextBoxColumn5
            // 
            this.dataGridViewTextBoxColumn5.DataPropertyName = "预约状态";
            this.dataGridViewTextBoxColumn5.HeaderText = "预约状态";
            this.dataGridViewTextBoxColumn5.Name = "dataGridViewTextBoxColumn5";
            this.dataGridViewTextBoxColumn5.ReadOnly = true;
            // 
            // fillByToolStrip
            // 
            this.fillByToolStrip.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.预约医生IDToolStripLabel,
            this.预约医生ID,
            this.预约时间ToolStripLabel,
            this.预约时间,
            this.fillByToolStripButton});
            this.fillByToolStrip.Location = new System.Drawing.Point(0, 0);
            this.fillByToolStrip.Name = "fillByToolStrip";
            this.fillByToolStrip.Size = new System.Drawing.Size(553, 25);
            this.fillByToolStrip.TabIndex = 2;
            this.fillByToolStrip.Text = "fillByToolStrip";
            this.fillByToolStrip.Visible = false;
            // 
            // 预约医生IDToolStripLabel
            // 
            this.预约医生IDToolStripLabel.Name = "预约医生IDToolStripLabel";
            this.预约医生IDToolStripLabel.Size = new System.Drawing.Size(72, 22);
            this.预约医生IDToolStripLabel.Text = "预约医生ID:";
            // 
            // 预约医生ID
            // 
            this.预约医生ID.Name = "预约医生ID";
            this.预约医生ID.Size = new System.Drawing.Size(100, 25);
            // 
            // 预约时间ToolStripLabel
            // 
            this.预约时间ToolStripLabel.Name = "预约时间ToolStripLabel";
            this.预约时间ToolStripLabel.Size = new System.Drawing.Size(59, 22);
            this.预约时间ToolStripLabel.Text = "预约时间:";
            // 
            // 预约时间
            // 
            this.预约时间.Name = "预约时间";
            this.预约时间.Size = new System.Drawing.Size(100, 25);
            // 
            // fillByToolStripButton
            // 
            this.fillByToolStripButton.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Text;
            this.fillByToolStripButton.Name = "fillByToolStripButton";
            this.fillByToolStripButton.Size = new System.Drawing.Size(41, 22);
            this.fillByToolStripButton.Text = "FillBy";
            this.fillByToolStripButton.Click += new System.EventHandler(this.fillByToolStripButton_Click);
            // 
            // IDcb
            // 
            this.IDcb.DataSource = this.预约信息BindingSource;
            this.IDcb.DisplayMember = "挂号者ID";
            this.IDcb.FormattingEnabled = true;
            this.IDcb.Location = new System.Drawing.Point(616, 18);
            this.IDcb.Name = "IDcb";
            this.IDcb.Size = new System.Drawing.Size(103, 20);
            this.IDcb.TabIndex = 3;
            this.IDcb.DropDownClosed += new System.EventHandler(this.IDcb_DropDownClosed);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(551, 21);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(59, 12);
            this.label1.TabIndex = 4;
            this.label1.Text = "挂号者ID:";
            // 
            // introL
            // 
            this.introL.BackColor = System.Drawing.SystemColors.ControlLightLight;
            this.introL.Location = new System.Drawing.Point(553, 77);
            this.introL.Name = "introL";
            this.introL.Size = new System.Drawing.Size(166, 260);
            this.introL.TabIndex = 5;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(555, 53);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(65, 12);
            this.label3.TabIndex = 6;
            this.label3.Text = "个人简介：";
            // 
            // checkHistoryB
            // 
            this.checkHistoryB.Location = new System.Drawing.Point(553, 347);
            this.checkHistoryB.Name = "checkHistoryB";
            this.checkHistoryB.Size = new System.Drawing.Size(169, 32);
            this.checkHistoryB.TabIndex = 7;
            this.checkHistoryB.Text = "查看病历";
            this.checkHistoryB.UseVisualStyleBackColor = true;
            this.checkHistoryB.Click += new System.EventHandler(this.checkHistoryB_Click);
            // 
            // 用户TableAdapter1
            // 
            this.用户TableAdapter1.ClearBeforeFill = true;
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(621, 48);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(97, 26);
            this.button1.TabIndex = 8;
            this.button1.Text = "查看";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // TimeTableForm
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(732, 384);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.checkHistoryB);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.introL);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.IDcb);
            this.Controls.Add(this.fillByToolStrip);
            this.Controls.Add(this.预约信息DataGridView);
            this.Name = "TimeTableForm";
            this.Text = "查看时间表";
            this.Load += new System.EventHandler(this.TimeTableForm_Load);
            ((System.ComponentModel.ISupportInitialize)(this.预约挂号DataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息BindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息DataGridView)).EndInit();
            this.fillByToolStrip.ResumeLayout(false);
            this.fillByToolStrip.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private 预约挂号DataSet 预约挂号DataSet;
        private System.Windows.Forms.BindingSource 预约信息BindingSource;
        private 预约挂号DataSetTableAdapters.预约信息TableAdapter 预约信息TableAdapter;
        private 预约挂号DataSetTableAdapters.TableAdapterManager tableAdapterManager;
        private System.Windows.Forms.DataGridView 预约信息DataGridView;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn3;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn4;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn5;
        private System.Windows.Forms.ToolStrip fillByToolStrip;
        private System.Windows.Forms.ToolStripLabel 预约医生IDToolStripLabel;
        private System.Windows.Forms.ToolStripTextBox 预约医生ID;
        private System.Windows.Forms.ToolStripLabel 预约时间ToolStripLabel;
        private System.Windows.Forms.ToolStripTextBox 预约时间;
        private System.Windows.Forms.ToolStripButton fillByToolStripButton;
        private System.Windows.Forms.ComboBox IDcb;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label introL;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button checkHistoryB;
        private 预约挂号DataSetTableAdapters.用户TableAdapter 用户TableAdapter1;
        private System.Windows.Forms.Button button1;
    }
}