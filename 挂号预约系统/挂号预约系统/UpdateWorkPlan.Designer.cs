namespace 挂号预约系统
{
    partial class UpdateWorkPlan
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(UpdateWorkPlan));
            this.预约挂号DataSet = new 挂号预约系统.预约挂号DataSet();
            this.工作时间BindingSource = new System.Windows.Forms.BindingSource(this.components);
            this.工作时间TableAdapter = new 挂号预约系统.预约挂号DataSetTableAdapters.工作时间TableAdapter();
            this.tableAdapterManager = new 挂号预约系统.预约挂号DataSetTableAdapters.TableAdapterManager();
            this.工作时间BindingNavigator = new System.Windows.Forms.BindingNavigator(this.components);
            this.bindingNavigatorMoveFirstItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorMovePreviousItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorSeparator = new System.Windows.Forms.ToolStripSeparator();
            this.bindingNavigatorPositionItem = new System.Windows.Forms.ToolStripTextBox();
            this.bindingNavigatorCountItem = new System.Windows.Forms.ToolStripLabel();
            this.bindingNavigatorSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.bindingNavigatorMoveNextItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorMoveLastItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorSeparator2 = new System.Windows.Forms.ToolStripSeparator();
            this.bindingNavigatorAddNewItem = new System.Windows.Forms.ToolStripButton();
            this.bindingNavigatorDeleteItem = new System.Windows.Forms.ToolStripButton();
            this.工作时间BindingNavigatorSaveItem = new System.Windows.Forms.ToolStripButton();
            this.工作时间DataGridView = new System.Windows.Forms.DataGridView();
            this.dataGridViewTextBoxColumn1 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn2 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            this.dataGridViewTextBoxColumn3 = new System.Windows.Forms.DataGridViewTextBoxColumn();
            ((System.ComponentModel.ISupportInitialize)(this.预约挂号DataSet)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.工作时间BindingSource)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.工作时间BindingNavigator)).BeginInit();
            this.工作时间BindingNavigator.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.工作时间DataGridView)).BeginInit();
            this.SuspendLayout();
            // 
            // 预约挂号DataSet
            // 
            this.预约挂号DataSet.DataSetName = "预约挂号DataSet";
            this.预约挂号DataSet.SchemaSerializationMode = System.Data.SchemaSerializationMode.IncludeSchema;
            // 
            // 工作时间BindingSource
            // 
            this.工作时间BindingSource.DataMember = "工作时间";
            this.工作时间BindingSource.DataSource = this.预约挂号DataSet;
            // 
            // 工作时间TableAdapter
            // 
            this.工作时间TableAdapter.ClearBeforeFill = true;
            // 
            // tableAdapterManager
            // 
            this.tableAdapterManager.BackupDataSetBeforeUpdate = false;
            this.tableAdapterManager.UpdateOrder = 挂号预约系统.预约挂号DataSetTableAdapters.TableAdapterManager.UpdateOrderOption.InsertUpdateDelete;
            this.tableAdapterManager.医生TableAdapter = null;
            this.tableAdapterManager.医院TableAdapter = null;
            this.tableAdapterManager.工作时间TableAdapter = this.工作时间TableAdapter;
            this.tableAdapterManager.用户TableAdapter = null;
            this.tableAdapterManager.电子病历TableAdapter = null;
            this.tableAdapterManager.预约信息TableAdapter = null;
            // 
            // 工作时间BindingNavigator
            // 
            this.工作时间BindingNavigator.AddNewItem = this.bindingNavigatorAddNewItem;
            this.工作时间BindingNavigator.BindingSource = this.工作时间BindingSource;
            this.工作时间BindingNavigator.CountItem = this.bindingNavigatorCountItem;
            this.工作时间BindingNavigator.DeleteItem = this.bindingNavigatorDeleteItem;
            this.工作时间BindingNavigator.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
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
            this.工作时间BindingNavigatorSaveItem});
            this.工作时间BindingNavigator.Location = new System.Drawing.Point(0, 0);
            this.工作时间BindingNavigator.MoveFirstItem = this.bindingNavigatorMoveFirstItem;
            this.工作时间BindingNavigator.MoveLastItem = this.bindingNavigatorMoveLastItem;
            this.工作时间BindingNavigator.MoveNextItem = this.bindingNavigatorMoveNextItem;
            this.工作时间BindingNavigator.MovePreviousItem = this.bindingNavigatorMovePreviousItem;
            this.工作时间BindingNavigator.Name = "工作时间BindingNavigator";
            this.工作时间BindingNavigator.PositionItem = this.bindingNavigatorPositionItem;
            this.工作时间BindingNavigator.Size = new System.Drawing.Size(345, 25);
            this.工作时间BindingNavigator.TabIndex = 0;
            this.工作时间BindingNavigator.Text = "bindingNavigator1";
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
            // bindingNavigatorCountItem
            // 
            this.bindingNavigatorCountItem.Name = "bindingNavigatorCountItem";
            this.bindingNavigatorCountItem.Size = new System.Drawing.Size(32, 17);
            this.bindingNavigatorCountItem.Text = "/ {0}";
            this.bindingNavigatorCountItem.ToolTipText = "总项数";
            // 
            // bindingNavigatorSeparator1
            // 
            this.bindingNavigatorSeparator1.Name = "bindingNavigatorSeparator";
            this.bindingNavigatorSeparator1.Size = new System.Drawing.Size(6, 6);
            // 
            // bindingNavigatorMoveNextItem
            // 
            this.bindingNavigatorMoveNextItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMoveNextItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMoveNextItem.Image")));
            this.bindingNavigatorMoveNextItem.Name = "bindingNavigatorMoveNextItem";
            this.bindingNavigatorMoveNextItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMoveNextItem.Size = new System.Drawing.Size(23, 20);
            this.bindingNavigatorMoveNextItem.Text = "移到下一条记录";
            // 
            // bindingNavigatorMoveLastItem
            // 
            this.bindingNavigatorMoveLastItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorMoveLastItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorMoveLastItem.Image")));
            this.bindingNavigatorMoveLastItem.Name = "bindingNavigatorMoveLastItem";
            this.bindingNavigatorMoveLastItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorMoveLastItem.Size = new System.Drawing.Size(23, 20);
            this.bindingNavigatorMoveLastItem.Text = "移到最后一条记录";
            // 
            // bindingNavigatorSeparator2
            // 
            this.bindingNavigatorSeparator2.Name = "bindingNavigatorSeparator";
            this.bindingNavigatorSeparator2.Size = new System.Drawing.Size(6, 6);
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
            // bindingNavigatorDeleteItem
            // 
            this.bindingNavigatorDeleteItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.bindingNavigatorDeleteItem.Image = ((System.Drawing.Image)(resources.GetObject("bindingNavigatorDeleteItem.Image")));
            this.bindingNavigatorDeleteItem.Name = "bindingNavigatorDeleteItem";
            this.bindingNavigatorDeleteItem.RightToLeftAutoMirrorImage = true;
            this.bindingNavigatorDeleteItem.Size = new System.Drawing.Size(23, 20);
            this.bindingNavigatorDeleteItem.Text = "删除";
            // 
            // 工作时间BindingNavigatorSaveItem
            // 
            this.工作时间BindingNavigatorSaveItem.DisplayStyle = System.Windows.Forms.ToolStripItemDisplayStyle.Image;
            this.工作时间BindingNavigatorSaveItem.Image = ((System.Drawing.Image)(resources.GetObject("工作时间BindingNavigatorSaveItem.Image")));
            this.工作时间BindingNavigatorSaveItem.Name = "工作时间BindingNavigatorSaveItem";
            this.工作时间BindingNavigatorSaveItem.Size = new System.Drawing.Size(23, 23);
            this.工作时间BindingNavigatorSaveItem.Text = "保存数据";
            this.工作时间BindingNavigatorSaveItem.Click += new System.EventHandler(this.工作时间BindingNavigatorSaveItem_Click);
            // 
            // 工作时间DataGridView
            // 
            this.工作时间DataGridView.AutoGenerateColumns = false;
            this.工作时间DataGridView.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.工作时间DataGridView.Columns.AddRange(new System.Windows.Forms.DataGridViewColumn[] {
            this.dataGridViewTextBoxColumn1,
            this.dataGridViewTextBoxColumn2,
            this.dataGridViewTextBoxColumn3});
            this.工作时间DataGridView.DataSource = this.工作时间BindingSource;
            this.工作时间DataGridView.Location = new System.Drawing.Point(0, 28);
            this.工作时间DataGridView.Name = "工作时间DataGridView";
            this.工作时间DataGridView.RowTemplate.Height = 23;
            this.工作时间DataGridView.Size = new System.Drawing.Size(346, 421);
            this.工作时间DataGridView.TabIndex = 1;
            // 
            // dataGridViewTextBoxColumn1
            // 
            this.dataGridViewTextBoxColumn1.DataPropertyName = "ID";
            this.dataGridViewTextBoxColumn1.HeaderText = "ID";
            this.dataGridViewTextBoxColumn1.Name = "dataGridViewTextBoxColumn1";
            // 
            // dataGridViewTextBoxColumn2
            // 
            this.dataGridViewTextBoxColumn2.DataPropertyName = "医生ID";
            this.dataGridViewTextBoxColumn2.HeaderText = "医生ID";
            this.dataGridViewTextBoxColumn2.Name = "dataGridViewTextBoxColumn2";
            // 
            // dataGridViewTextBoxColumn3
            // 
            this.dataGridViewTextBoxColumn3.DataPropertyName = "工作时间";
            this.dataGridViewTextBoxColumn3.HeaderText = "工作时间";
            this.dataGridViewTextBoxColumn3.Name = "dataGridViewTextBoxColumn3";
            // 
            // UpdateWorkPlan
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 12F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(345, 447);
            this.Controls.Add(this.工作时间DataGridView);
            this.Controls.Add(this.工作时间BindingNavigator);
            this.Name = "UpdateWorkPlan";
            this.Text = "维护个人工作安排";
            this.Load += new System.EventHandler(this.UpdateWorkPlan_Load);
            ((System.ComponentModel.ISupportInitialize)(this.预约挂号DataSet)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.工作时间BindingSource)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.工作时间BindingNavigator)).EndInit();
            this.工作时间BindingNavigator.ResumeLayout(false);
            this.工作时间BindingNavigator.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.工作时间DataGridView)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private 预约挂号DataSet 预约挂号DataSet;
        private System.Windows.Forms.BindingSource 工作时间BindingSource;
        private 预约挂号DataSetTableAdapters.工作时间TableAdapter 工作时间TableAdapter;
        private 预约挂号DataSetTableAdapters.TableAdapterManager tableAdapterManager;
        private System.Windows.Forms.BindingNavigator 工作时间BindingNavigator;
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
        private System.Windows.Forms.ToolStripButton 工作时间BindingNavigatorSaveItem;
        private System.Windows.Forms.DataGridView 工作时间DataGridView;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn1;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn2;
        private System.Windows.Forms.DataGridViewTextBoxColumn dataGridViewTextBoxColumn3;
    }
}