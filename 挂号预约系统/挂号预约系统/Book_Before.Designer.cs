namespace 挂号预约系统
{
    partial class Book_Before
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Book_Before));
            this.预约挂号DataSet = new 挂号预约系统.预约挂号DataSet();
            this.预约信息BindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.预约信息TableAdapter = new 挂号预约系统.预约挂号DataSetTableAdapters.预约信息TableAdapter();
            this.tableAdapterManager = new 挂号预约系统.预约挂号DataSetTableAdapters.TableAdapterManager();
            this.预约信息BindingNavigator = new System.Windows.Forms.BindingNavigator(this.components);
            this.bindingNavigatorAddNewItem = new System.Windows.Forms.ToolStripButton();
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
            this.fillBy2ToolStrip = new System.Windows.Forms.ToolStrip();
            this.预约医生IDToolStripLabel = new System.Windows.Forms.ToolStripLabel();
            this.预约医生IDToolStripTextBox = new System.Windows.Forms.ToolStripTextBox();
            this.预约时间ToolStripLabel = new System.Windows.Forms.ToolStripLabel();
            this.预约时间ToolStripTextBox = new System.Windows.Forms.ToolStripTextBox();
            this.预约状态ToolStripLabel = new System.Windows.Forms.ToolStripLabel();
            this.预约状态ToolStripTextBox = new System.Windows.Forms.ToolStripTextBox();
            this.fillBy2ToolStripButton = new System.Windows.Forms.ToolStripButton();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.时间段 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn4 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn5 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewCheckBoxColumn1 = new System.Windows.Forms.DataGridViewCheckBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.预约挂号DataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息BindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息BindingNavigator)).BeginInit();
            this.预约信息BindingNavigator.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息DataGridView)).BeginInit();
            this.fillBy2ToolStrip.SuspendLayout();
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
            this.预约信息BindingNavigator.Size = new System.Drawing.Size(747, 25);
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
            this.预约信息DataGridView.Location = new System.Drawing.Point(0, 53);
            this.预约信息DataGridView.Name = "预约信息DataGridView";
            this.预约信息DataGridView.RowTemplate.Height = 23;
            this.预约信息DataGridView.Size = new System.Drawing.Size(746, 324);
            this.预约信息DataGridView.TabIndex = 1;
            // 
            // fillBy2ToolStrip
            // 
            this.fillBy2ToolStrip.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.预约医生IDToolStripLabel,
            this.预约医生IDToolStripTextBox,
            this.预约时间ToolStripLabel,
            this.预约时间ToolStripTextBox,
            this.预约状态ToolStripLabel,
            this.预约状态ToolStripTextBox,
            this.fillBy2ToolStripButton});
            this.fillBy2ToolStrip.Location = new System.Drawing.Point(0, 25);
            this.fillBy2ToolStrip.Name = "fillBy2ToolStrip";
            this.fillBy2ToolStrip.Size = new System.Drawing.Size(747, 25);
            this.fillBy2ToolStrip.TabIndex = 2;
            this.fillBy2ToolStrip.Text = "fillBy2ToolStrip";
            // 
            // 预约医生IDToolStripLabel
            // 
            this.预约医生IDToolStripLabel.Name = "预约医生IDToolStripLabel";
            this.预约医生IDToolStripLabel.Size = new System.Drawing.Size(72, 22);
            this.预约医生IDToolStripLabel.Text = "预约医生ID:";
            // 
            // 预约医生IDToolStripTextBox
            // 
            this.预约医生IDToolStripTextBox.Name = "预约医生IDToolStripTextBox";
            this.预约医生IDToolStripTextBox.Size = new System.Drawing.Size(100, 25);
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
            // 预约状态ToolStripLabel
            // 
            this.预约状态ToolStripLabel.Name = "预约状态ToolStripLabel";
            this.预约状态ToolStripLabel.Size = new System.Drawing.Size(59, 22);
            this.预约状态ToolStripLabel.Text = "预约状态:";
            // 
            // 预约状态ToolStripTextBox
            // 
            this.预约状态ToolStripTextBox.Name = "预约状态ToolStripTextBox";
            this.预约状态ToolStripTextBox.Size = new System.Drawing.Size(100, 25);
            // 
            // fillBy2ToolStripButton
            // 
            this.fillBy2ToolStripButton.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Text;
            this.fillBy2ToolStripButton.Name = "fillBy2ToolStripButton";
            this.fillBy2ToolStripButton.Size = new System.Drawing.Size(36, 22);
            this.fillBy2ToolStripButton.Text = "查询";
            this.fillBy2ToolStripButton.Click += new System.EventHandler(this.fillBy2ToolStripButton_Click);
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
            // Book_Before
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(747, 377);
            this.Controls.Add(this.fillBy2ToolStrip);
            this.Controls.Add(this.预约信息DataGridView);
            this.Controls.Add(this.预约信息BindingNavigator);
            this.Name = "Book_Before";
            this.Text = "预约详情";
            this.Load += new System.EventHandler(this.Book_Before_Load);
            ((System.ComponentModel.ISupportInitialize)(this.预约挂号DataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息BindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息BindingNavigator)).EndInit();
            this.预约信息BindingNavigator.ResumeLayout(false);
            this.预约信息BindingNavigator.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.预约信息DataGridView)).EndInit();
            this.fillBy2ToolStrip.ResumeLayout(false);
            this.fillBy2ToolStrip.PerformLayout();
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
        private System.Windows.Forms.ToolStrip fillBy2ToolStrip;
        private System.Windows.Forms.ToolStripLabel 预约医生IDToolStripLabel;
        private System.Windows.Forms.ToolStripTextBox 预约医生IDToolStripTextBox;
        private System.Windows.Forms.ToolStripLabel 预约时间ToolStripLabel;
        private System.Windows.Forms.ToolStripTextBox 预约时间ToolStripTextBox;
        private System.Windows.Forms.ToolStripLabel 预约状态ToolStripLabel;
        private System.Windows.Forms.ToolStripTextBox 预约状态ToolStripTextBox;
        private System.Windows.Forms.ToolStripButton fillBy2ToolStripButton;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn 时间段;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn3;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn4;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn5;
        private System.Windows.Forms.DataGridViewCheckBoxColumn dataGridViewCheckBoxColumn1;
    }
}