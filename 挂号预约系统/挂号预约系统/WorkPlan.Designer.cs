namespace 挂号预约系统
{
    partial class WorkPlan
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
            System.Windows.Forms.Label 医生姓名Label;
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(WorkPlan));
            this.预约信息BindingNavigator = new System.Windows.Forms.BindingNavigator(this.components);
            this.bindingNavigatorAddNewItem = new System.Windows.Forms.ToolStripButton();
            this.预约信息BindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.预约挂号DataSet = new 挂号预约系统.预约挂号DataSet();
            this.bindingNavigatorCountItem = new System.Windows.Forms.ToolStripLabel();
            this.bindingNavigatorDeleteItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorMoveFirstItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorMovePreviousItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorSeparator = new System.Windows.Forms.ToolStripSeparator();
            this.bindingNavigatorPositionItem = new System.Windows.Forms.ToolStripTextBox();
            this.bindingNavigatorSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.bindingNavigatorMoveNextItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorMoveLastItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorSeparator2 = new System.Windows.Forms.ToolStripSeparator();
            this.预约信息BindingNavigatorSaveItem = new System.Windows.Forms.ToolStripButton();
            this.预约信息DataGridView = new System.Windows.Forms.DataGridView();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.时间段 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn4 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn5 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewCheckBoxColumn1 = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            this.planToolStrip = new System.Windows.Forms.ToolStrip();
            this.预约时间ToolStripLabel = new System.Windows.Forms.ToolStripLabel();
            this.预约时间ToolStripTextBox = new System.Windows.Forms.ToolStripTextBox();
            this.planToolStripButton = new System.Windows.Forms.ToolStripButton();
            this.预约信息TableAdapter = new 挂号预约系统.预约挂号DataSetTableAdapters.预约信息TableAdapter();
            this.tableAdapterManager = new 挂号预约系统.预约挂号DataSetTableAdapters.TableAdapterManager();
            this.groupBox1 = new System.Windows.Forms.GroupBox();
            this.addAWeekB = new System.Windows.Forms.Button();
            this.addAllB = new System.Windows.Forms.Button();
            this.addPlanB = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.dateTimePicker1 = new System.Windows.Forms.DateTimePicker();
            this.docNameTB = new System.Windows.Forms.ComboBox();
            this.医生BindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.医生TableAdapter = new 挂号预约系统.预约挂号DataSetTableAdapters.医生TableAdapter();
            this.工作时间TableAdapter1 = new 挂号预约系统.预约挂号DataSetTableAdapters.工作时间TableAdapter();
            医生姓名Label = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息BindingNavigator)).BeginInit();
            this.预约信息BindingNavigator.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息BindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约挂号DataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息DataGridView)).BeginInit();
            this.planToolStrip.SuspendLayout();
            this.groupBox1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.医生BindingSource)).BeginInit();
            this.SuspendLayout();
            // 
            // 医生姓名Label
            // 
            医生姓名Label.AutoSize = true;
            医生姓名Label.Location = new System.Drawing.Point(11, 23);
            医生姓名Label.Name = "医生姓名Label";
            医生姓名Label.Size = new System.Drawing.Size(59, 12);
            医生姓名Label.TabIndex = 0;
            医生姓名Label.Text = "医生姓名:";
            // 
            // 预约信息BindingNavigator
            // 
            this.预约信息BindingNavigator.AddNewItem = this.bindingNavigatorAddNewItem;
            this.预约信息BindingNavigator.BindingSource = this.预约信息BindingSource;
            this.预约信息BindingNavigator.CountItem = this.bindingNavigatorCountItem;
            this.预约信息BindingNavigator.DeleteItem = this.bindingNavigatorDeleteItem;
            this.预约信息BindingNavigator.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.bindingNavigatorMoveFirstItem,
            this.bindingNavigatorMovePreviousItem,
            this.bindingNavigatorSeparator,
            this.bindingNavigatorPositionItem,
            this.bindingNavigatorCountItem,
            this.bindingNavigatorSeparator1,
            this.bindingNavigatorMoveNextItem,
            this.bindingNavigatorMoveLastItem,
            this.bindingNavigatorSeparator2,
            this.bindingNavigatorAddNewItem,
            this.bindingNavigatorDeleteItem,
            this.预约信息BindingNavigatorSaveItem});
            this.预约信息BindingNavigator.Location = new System.Drawing.Point(0, 0);
            this.预约信息BindingNavigator.MoveFirstItem = this.bindingNavigatorMoveFirstItem;
            this.预约信息BindingNavigator.MoveLastItem = this.bindingNavigatorMoveLastItem;
            this.预约信息BindingNavigator.MoveNextItem = this.bindingNavigatorMoveNextItem;
            this.预约信息BindingNavigator.MovePreviousItem = this.bindingNavigatorMovePreviousItem;
            this.预约信息BindingNavigator.Name = "预约信息BindingNavigator";
            this.预约信息BindingNavigator.PositionItem = this.bindingNavigatorPositionItem;
            this.预约信息BindingNavigator.Size = new System.Drawing.Size(734, 25);
            this.预约信息BindingNavigator.TabIndex = 0;
            this.预约信息BindingNavigator.Text = "bindingNavigator1";
            // 
            // bindingNavigatorAddNewItem
            // 
            this.bindingNavigatorAddNewItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorAddNewItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorAddNewItem.Image")));
            this.bindingNavigatorAddNewItem.Name = "bindingNavigatorAddNewItem";
            this.bindingNavigatorAddNewItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorAddNewItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorAddNewItem.Text = "新添";
            // 
            // 预约信息BindingSource
            // 
            this.预约信息BindingSource.DataMember = "预约信息";
            this.预约信息BindingSource.DataSource = this.预约挂号DataSet;
            // 
            // 预约挂号DataSet
            // 
            this.预约挂号DataSet.DataSetName = "预约挂号DataSet";
            this.预约挂号DataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // bindingNavigatorCountItem
            // 
            this.bindingNavigatorCountItem.Name = "bindingNavigatorCountItem";
            this.bindingNavigatorCountItem.Size = new System.Drawing.Size(32, 22);
            this.bindingNavigatorCountItem.Text = "/ {0}";
            this.bindingNavigatorCountItem.ToolTipText = "总项数";
            // 
            // bindingNavigatorDeleteItem
            // 
            this.bindingNavigatorDeleteItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorDeleteItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorDeleteItem.Image")));
            this.bindingNavigatorDeleteItem.Name = "bindingNavigatorDeleteItem";
            this.bindingNavigatorDeleteItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorDeleteItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorDeleteItem.Text = "删除";
            // 
            // bindingNavigatorMoveFirstItem
            // 
            this.bindingNavigatorMoveFirstItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMoveFirstItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMoveFirstItem.Image")));
            this.bindingNavigatorMoveFirstItem.Name = "bindingNavigatorMoveFirstItem";
            this.bindingNavigatorMoveFirstItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMoveFirstItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorMoveFirstItem.Text = "移到第一条记录";
            // 
            // bindingNavigatorMovePreviousItem
            // 
            this.bindingNavigatorMovePreviousItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMovePreviousItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMovePreviousItem.Image")));
            this.bindingNavigatorMovePreviousItem.Name = "bindingNavigatorMovePreviousItem";
            this.bindingNavigatorMovePreviousItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMovePreviousItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorMovePreviousItem.Text = "移到上一条记录";
            // 
            // bindingNavigatorSeparator
            // 
            this.bindingNavigatorSeparator.Name = "bindingNavigatorSeparator";
            this.bindingNavigatorSeparator.Size = new System.Drawing.Size(6, 25);
            // 
            // bindingNavigatorPositionItem
            // 
            this.bindingNavigatorPositionItem.AccessibleName = "位置";
            this.bindingNavigatorPositionItem.AutoSize = false;
            this.bindingNavigatorPositionItem.Name = "bindingNavigatorPositionItem";
            this.bindingNavigatorPositionItem.Size = new System.Drawing.Size(50, 23);
            this.bindingNavigatorPositionItem.Text = "0";
            this.bindingNavigatorPositionItem.ToolTipText = "当前位置";
            // 
            // bindingNavigatorSeparator1
            // 
            this.bindingNavigatorSeparator1.Name = "bindingNavigatorSeparator1";
            this.bindingNavigatorSeparator1.Size = new System.Drawing.Size(6, 25);
            // 
            // bindingNavigatorMoveNextItem
            // 
            this.bindingNavigatorMoveNextItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMoveNextItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMoveNextItem.Image")));
            this.bindingNavigatorMoveNextItem.Name = "bindingNavigatorMoveNextItem";
            this.bindingNavigatorMoveNextItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMoveNextItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorMoveNextItem.Text = "移到下一条记录";
            // 
            // bindingNavigatorMoveLastItem
            // 
            this.bindingNavigatorMoveLastItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMoveLastItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMoveLastItem.Image")));
            this.bindingNavigatorMoveLastItem.Name = "bindingNavigatorMoveLastItem";
            this.bindingNavigatorMoveLastItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMoveLastItem.Size = new System.Drawing.Size(23, 22);
            this.bindingNavigatorMoveLastItem.Text = "移到最后一条记录";
            // 
            // bindingNavigatorSeparator2
            // 
            this.bindingNavigatorSeparator2.Name = "bindingNavigatorSeparator2";
            this.bindingNavigatorSeparator2.Size = new System.Drawing.Size(6, 25);
            // 
            // 预约信息BindingNavigatorSaveItem
            // 
            this.预约信息BindingNavigatorSaveItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.预约信息BindingNavigatorSaveItem.Image = ((System.Drawing.Image)(resources.GetObject("预约信息BindingNavigatorSaveItem.Image")));
            this.预约信息BindingNavigatorSaveItem.Name = "预约信息BindingNavigatorSaveItem";
            this.预约信息BindingNavigatorSaveItem.Size = new System.Drawing.Size(23, 22);
            this.预约信息BindingNavigatorSaveItem.Text = "保存数据";
            this.预约信息BindingNavigatorSaveItem.Click += new System.EventHandler(this.预约信息BindingNavigatorSaveItem_Click);
            // 
            // 预约信息DataGridView
            // 
            this.预约信息DataGridView.AutoGenerateColumns = false;
            this.预约信息DataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.预约信息DataGridView.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.dataGridViewTextBoxColumn1,
            this.时间段,
            this.dataGridViewTextBoxColumn2,
            this.dataGridViewTextBoxColumn3,
            this.dataGridViewTextBoxColumn4,
            this.dataGridViewTextBoxColumn5,
            this.dataGridViewCheckBoxColumn1});
            this.预约信息DataGridView.DataSource = this.预约信息BindingSource;
            this.预约信息DataGridView.Location = new System.Drawing.Point(0, 28);
            this.预约信息DataGridView.Name = "预约信息DataGridView";
            this.预约信息DataGridView.RowTemplate.Height = 23;
            this.预约信息DataGridView.Size = new System.Drawing.Size(727, 284);
            this.预约信息DataGridView.TabIndex = 1;
            // 
            // dataGridViewTextBoxColumn1
            // 
            this.dataGridViewTextBoxColumn1.DataPropertyName = "流水号";
            this.dataGridViewTextBoxColumn1.HeaderText = "流水号";
            this.dataGridViewTextBoxColumn1.Name = "dataGridViewTextBoxColumn1";
            // 
            // 时间段
            // 
            this.时间段.DataPropertyName = "时间段";
            this.时间段.HeaderText = "时间段";
            this.时间段.Name = "时间段";
            // 
            // dataGridViewTextBoxColumn2
            // 
            this.dataGridViewTextBoxColumn2.DataPropertyName = "挂号者ID";
            this.dataGridViewTextBoxColumn2.HeaderText = "挂号者ID";
            this.dataGridViewTextBoxColumn2.Name = "dataGridViewTextBoxColumn2";
            // 
            // dataGridViewTextBoxColumn3
            // 
            this.dataGridViewTextBoxColumn3.DataPropertyName = "预约医生ID";
            this.dataGridViewTextBoxColumn3.HeaderText = "预约医生ID";
            this.dataGridViewTextBoxColumn3.Name = "dataGridViewTextBoxColumn3";
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
            // planToolStrip
            // 
            this.planToolStrip.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.预约时间ToolStripLabel,
            this.预约时间ToolStripTextBox,
            this.planToolStripButton});
            this.planToolStrip.Location = new System.Drawing.Point(0, 25);
            this.planToolStrip.Name = "planToolStrip";
            this.planToolStrip.Size = new System.Drawing.Size(672, 25);
            this.planToolStrip.TabIndex = 2;
            this.planToolStrip.Text = "planToolStrip";
            this.planToolStrip.Visible = false;
            // 
            // 预约时间ToolStripLabel
            // 
            this.预约时间ToolStripLabel.Name = "预约时间ToolStripLabel";
            this.预约时间ToolStripLabel.Size = new System.Drawing.Size(59, 22);
            this.预约时间ToolStripLabel.Text = "预约时间:";
            // 
            // 预约时间ToolStripTextBox
            // 
            this.预约时间ToolStripTextBox.Name = "预约时间ToolStripTextBox";
            this.预约时间ToolStripTextBox.Size = new System.Drawing.Size(100, 25);
            // 
            // planToolStripButton
            // 
            this.planToolStripButton.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Text;
            this.planToolStripButton.Name = "planToolStripButton";
            this.planToolStripButton.Size = new System.Drawing.Size(36, 22);
            this.planToolStripButton.Text = "Plan";
            this.planToolStripButton.Click += new System.EventHandler(this.planToolStripButton_Click);
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
            // groupBox1
            // 
            this.groupBox1.Controls.Add(this.addAWeekB);
            this.groupBox1.Controls.Add(this.addAllB);
            this.groupBox1.Controls.Add(this.addPlanB);
            this.groupBox1.Controls.Add(this.label1);
            this.groupBox1.Controls.Add(this.dateTimePicker1);
            this.groupBox1.Controls.Add(医生姓名Label);
            this.groupBox1.Controls.Add(this.docNameTB);
            this.groupBox1.Location = new System.Drawing.Point(10, 328);
            this.groupBox1.Name = "groupBox1";
            this.groupBox1.Size = new System.Drawing.Size(692, 94);
            this.groupBox1.TabIndex = 6;
            this.groupBox1.TabStop = false;
            this.groupBox1.Text = "按整日工作计划添加";
            // 
            // addAWeekB
            // 
            this.addAWeekB.Location = new System.Drawing.Point(514, 20);
            this.addAWeekB.Name = "addAWeekB";
            this.addAWeekB.Size = new System.Drawing.Size(132, 57);
            this.addAWeekB.TabIndex = 5;
            this.addAWeekB.Text = "全体医生批量添加5天";
            this.addAWeekB.UseVisualStyleBackColor = true;
            this.addAWeekB.Click += new System.EventHandler(this.addAWeekB_Click);
            // 
            // addAllB
            // 
            this.addAllB.Location = new System.Drawing.Point(357, 20);
            this.addAllB.Name = "addAllB";
            this.addAllB.Size = new System.Drawing.Size(132, 57);
            this.addAllB.TabIndex = 4;
            this.addAllB.Text = "全体医生批量添加";
            this.addAllB.UseVisualStyleBackColor = true;
            this.addAllB.Click += new System.EventHandler(this.addAllB_Click);
            // 
            // addPlanB
            // 
            this.addPlanB.Location = new System.Drawing.Point(229, 20);
            this.addPlanB.Name = "addPlanB";
            this.addPlanB.Size = new System.Drawing.Size(100, 57);
            this.addPlanB.TabIndex = 3;
            this.addPlanB.Text = "添加工作计划";
            this.addPlanB.UseVisualStyleBackColor = true;
            this.addPlanB.Click += new System.EventHandler(this.addPlanB_Click);
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(11, 65);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(29, 12);
            this.label1.TabIndex = 3;
            this.label1.Text = "日期";
            // 
            // dateTimePicker1
            // 
            this.dateTimePicker1.Location = new System.Drawing.Point(76, 59);
            this.dateTimePicker1.Name = "dateTimePicker1";
            this.dateTimePicker1.Size = new System.Drawing.Size(121, 21);
            this.dateTimePicker1.TabIndex = 2;
            // 
            // docNameTB
            // 
            this.docNameTB.DataBindings.Add(new System.Windows.Forms.Binding("Text", this.医生BindingSource, "医生姓名", true));
            this.docNameTB.DataSource = this.医生BindingSource;
            this.docNameTB.DisplayMember = "医生姓名";
            this.docNameTB.FormattingEnabled = true;
            this.docNameTB.Location = new System.Drawing.Point(76, 20);
            this.docNameTB.Name = "docNameTB";
            this.docNameTB.Size = new System.Drawing.Size(121, 20);
            this.docNameTB.TabIndex = 1;
            // 
            // 医生BindingSource
            // 
            this.医生BindingSource.DataMember = "医生";
            this.医生BindingSource.DataSource = this.预约挂号DataSet;
            // 
            // 医生TableAdapter
            // 
            this.医生TableAdapter.ClearBeforeFill = true;
            // 
            // 工作时间TableAdapter1
            // 
            this.工作时间TableAdapter1.ClearBeforeFill = true;
            // 
            // WorkPlan
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(734, 430);
            this.Controls.Add(this.groupBox1);
            this.Controls.Add(this.planToolStrip);
            this.Controls.Add(this.预约信息DataGridView);
            this.Controls.Add(this.预约信息BindingNavigator);
            this.Name = "WorkPlan";
            this.Text = "工作计划安排";
            this.Load += new System.EventHandler(this.WorkPlan_Load);
            ((System.ComponentModel.ISupportInitialize)(this.预约信息BindingNavigator)).EndInit();
            this.预约信息BindingNavigator.ResumeLayout(false);
            this.预约信息BindingNavigator.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息BindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约挂号DataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息DataGridView)).EndInit();
            this.planToolStrip.ResumeLayout(false);
            this.planToolStrip.PerformLayout();
            this.groupBox1.ResumeLayout(false);
            this.groupBox1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.医生BindingSource)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private 预约挂号DataSet 预约挂号DataSet;
        private System.Windows.Forms.BindingSource 预约信息BindingSource;
        private 预约挂号DataSetTableAdapters.预约信息TableAdapter 预约信息TableAdapter;
        private 预约挂号DataSetTableAdapters.TableAdapterManager tableAdapterManager;
        private System.Windows.Forms.BindingNavigator 预约信息BindingNavigator;
        private System.Windows.Forms.ToolStripButton bindingNavigatorAddNewItem;
        private System.Windows.Forms.ToolStripLabel bindingNavigatorCountItem;
        private System.Windows.Forms.ToolStripButton bindingNavigatorDeleteItem;
        private System.Windows.Forms.ToolStripButton bindingNavigatorMoveFirstItem;
        private System.Windows.Forms.ToolStripButton bindingNavigatorMovePreviousItem;
        private System.Windows.Forms.ToolStripSeparator bindingNavigatorSeparator;
        private System.Windows.Forms.ToolStripTextBox bindingNavigatorPositionItem;
        private System.Windows.Forms.ToolStripSeparator bindingNavigatorSeparator1;
        private System.Windows.Forms.ToolStripButton bindingNavigatorMoveNextItem;
        private System.Windows.Forms.ToolStripButton bindingNavigatorMoveLastItem;
        private System.Windows.Forms.ToolStripSeparator bindingNavigatorSeparator2;
        private System.Windows.Forms.ToolStripButton 预约信息BindingNavigatorSaveItem;
        private System.Windows.Forms.DataGridView 预约信息DataGridView;
        private System.Windows.Forms.ToolStrip planToolStrip;
        private System.Windows.Forms.ToolStripLabel 预约时间ToolStripLabel;
        private System.Windows.Forms.ToolStripTextBox 预约时间ToolStripTextBox;
        private System.Windows.Forms.ToolStripButton planToolStripButton;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn 时间段;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn3;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn4;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn5;
        private System.Windows.Forms.DataGridViewCheckBoxColumn dataGridViewCheckBoxColumn1;
        private System.Windows.Forms.GroupBox groupBox1;
        private System.Windows.Forms.BindingSource 医生BindingSource;
        private 预约挂号DataSetTableAdapters.医生TableAdapter 医生TableAdapter;
        private System.Windows.Forms.Button addPlanB;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.DateTimePicker dateTimePicker1;
        private System.Windows.Forms.ComboBox docNameTB;
        private System.Windows.Forms.Button addAllB;
        private 预约挂号DataSetTableAdapters.工作时间TableAdapter 工作时间TableAdapter1;
        private System.Windows.Forms.Button addAWeekB;
    }
}