
package GUI;

import DataAccess.FileBD;
import DataAccess.FileMH;
import DataAccess.FileSV;
import Entity.bangDiem;
import Entity.monHoc;
import Entity.sinhVien;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class GuiManager extends javax.swing.JFrame {

	ArrayList<sinhVien> listSV = new ArrayList<sinhVien>();
	ArrayList<monHoc> listMH = new ArrayList<monHoc>();
	ArrayList<bangDiem> listBD = new ArrayList<bangDiem>();

	public GuiManager() {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(GuiManager.class.getName()).log(Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(GuiManager.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(GuiManager.class.getName()).log(Level.SEVERE, null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			Logger.getLogger(GuiManager.class.getName()).log(Level.SEVERE, null, ex);
		}
		initComponents();
		try {
			listSV = new FileSV().docSV();
			listMH = new FileMH().docMH();
			listBD = new FileBD().docBD();
		} catch (FileNotFoundException ex) {
			Logger.getLogger(GuiManager.class.getName()).log(Level.SEVERE, null, ex);
		} catch (IOException ex) {
			Logger.getLogger(GuiManager.class.getName()).log(Level.SEVERE, null, ex);
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(GuiManager.class.getName()).log(Level.SEVERE, null, ex);
		}
		taoBangSV();
		taoBangMH();
		taoBangDiem();
		indexComboBox();
	}

	public void taoBangSV() {
		DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
		m.getDataVector().removeAllElements();
		m.fireTableDataChanged();
		TableRowSorter sorter = new TableRowSorter(m);
		jTable1.setRowSorter(sorter);
		for (sinhVien i : listSV) {
			m.addRow(i.toArray());
		}
	}

	public void taoBangMH() {
		DefaultTableModel m = (DefaultTableModel) jTable2.getModel();
		m.getDataVector().removeAllElements();
		m.fireTableDataChanged();
		TableRowSorter t = new TableRowSorter(m);
		jTable2.setRowSorter(t);
		for (monHoc i : listMH) {
			m.addRow(i.toArray());
		}
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jTabbedPane2 = new javax.swing.JTabbedPane();
		jPanel4 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		txtMasv = new javax.swing.JTextField();
		txtHo = new javax.swing.JTextField();
		txtTen = new javax.swing.JTextField();
		txtDiachi = new javax.swing.JTextField();
		btnThemSv = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jLabel7 = new javax.swing.JLabel();
		txtTim = new javax.swing.JTextField();
		btnTimKiem = new javax.swing.JButton();
		cbLop = new javax.swing.JComboBox();
		jPanel3 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		txtMamon = new javax.swing.JTextField();
		txtTenMon = new javax.swing.JTextField();
		txtSodvht = new javax.swing.JTextField();
		btnNhapmonhoc = new javax.swing.JButton();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jLabel11 = new javax.swing.JLabel();
		jPanel5 = new javax.swing.JPanel();
		cbSinhvien = new javax.swing.JComboBox();
		jLabel14 = new javax.swing.JLabel();
		cbMonHoc = new javax.swing.JComboBox();
		jLabel15 = new javax.swing.JLabel();
		txtDiem = new javax.swing.JTextField();
		jLabel16 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jScrollPane6 = new javax.swing.JScrollPane();
		jTable4 = new javax.swing.JTable();
		cbChonLop = new javax.swing.JComboBox();
		jLabel17 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle(". . . : : : Quản Lý Học Sinh : : : . . . ");
		setBackground(new java.awt.Color(255, 255, 255));
		setBounds(new java.awt.Rectangle(250, 100, 0, 0));

		jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

		jPanel1.setOpaque(false);

		jPanel4.setOpaque(false);

		jLabel2.setText("Mã Học Sinh");

		jLabel3.setText("Họ");

		jLabel4.setText("Tên");

		jLabel5.setText("Địa Chỉ");

		jLabel6.setText("Lớp");

		btnThemSv.setText("Thêm Học Sinh");
		btnThemSv.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnThemSvActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null } },
				new String[] { "Mã Học Sinh", "Họ", "Tên", "Địa Chỉ", "Lớp" }) {
			boolean[] canEdit = new boolean[] { false, true, false, false, true };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable1.setRowHeight(20);
		jScrollPane1.setViewportView(jTable1);
		jTable1.getColumnModel().getColumn(3).setHeaderValue("Địa Chỉ");
		jTable1.getColumnModel().getColumn(4).setHeaderValue("Lớp");

		jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18));
		jLabel7.setForeground(new java.awt.Color(255, 0, 51));
		jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel7.setText("Danh Sách Học SInh");

		txtTim.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtTimKeyPressed(evt);
			}
		});

		btnTimKiem.setText("   Tìm   ");
		btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnTimKiemActionPerformed(evt);
			}
		});

		cbLop.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "12a1", "12a2", "12a3", "12a4", "11a1", "11a2", "11a3", "11a4", "11a5", "11a6", "11a7",
						"11a8", "11a9", "11a10", "10a1", "10a2", "10a3", "10a4", "10a5", "10a6", "10a7", "10a8", "10a9",
						"10a10", "12b1", "12b2", "12b3", "12b4", "12b5", "12b6", "12b7", "12b8" }));

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel4Layout.createSequentialGroup().addContainerGap(410, Short.MAX_VALUE)
								.addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 322,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(76, 76, 76))
				.addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup().addGap(43, 43, 43)
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel2).addComponent(jLabel3).addComponent(jLabel4)
										.addComponent(jLabel5).addComponent(jLabel6))
								.addGap(38, 38, 38)
								.addGroup(jPanel4Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(txtDiachi, javax.swing.GroupLayout.DEFAULT_SIZE, 180,
												Short.MAX_VALUE)
										.addComponent(txtTen, javax.swing.GroupLayout.DEFAULT_SIZE, 180,
												Short.MAX_VALUE)
										.addComponent(txtHo, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
										.addComponent(txtMasv, javax.swing.GroupLayout.DEFAULT_SIZE, 180,
												Short.MAX_VALUE)
										.addComponent(cbLop, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(jPanel4Layout.createSequentialGroup().addGap(140, 140, 140).addComponent(btnThemSv)))
						.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel4Layout.createSequentialGroup()
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26,
												Short.MAX_VALUE)
										.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
								.addGroup(jPanel4Layout.createSequentialGroup().addGap(104, 104, 104)
										.addComponent(txtTim, javax.swing.GroupLayout.PREFERRED_SIZE, 166,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(51, 51, 51).addComponent(btnTimKiem).addContainerGap()))));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel4Layout.createSequentialGroup().addContainerGap().addComponent(jLabel7)
								.addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel4Layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel4Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2).addComponent(txtMasv,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(jPanel4Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3).addComponent(txtHo,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(jPanel4Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(jPanel4Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5).addComponent(txtDiachi,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18)
												.addGroup(jPanel4Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel6).addComponent(cbLop,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(29, 29, 29).addComponent(btnThemSv))
										.addGroup(jPanel4Layout.createSequentialGroup().addGap(36, 36, 36)
												.addGroup(jPanel4Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(btnTimKiem).addComponent(txtTim,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18, 18, 18).addComponent(jScrollPane1,
														javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
								.addContainerGap()));

		jTabbedPane2.addTab("Thông tin học sinh", jPanel4);

		jPanel3.setOpaque(false);

		jLabel8.setText("Giáo Viên Dạy");

		jLabel9.setText("Tên môn học");

		jLabel10.setText("Học Kỳ");

		btnNhapmonhoc.setText("Nhập môn học");
		btnNhapmonhoc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnNhapmonhocActionPerformed(evt);
			}
		});

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null }, { null, null, null }, { null, null, null }, { null, null, null },
						{ null, null, null }, { null, null, null }, { null, null, null }, { null, null, null } },
				new String[] { "Giáo Viên Dạy", "Tên Môn Học", "Học Kỳ" }) {
			boolean[] canEdit = new boolean[] { false, true, false };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable2.setRowHeight(20);
		jScrollPane2.setViewportView(jTable2);

		jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18));
		jLabel11.setForeground(new java.awt.Color(255, 0, 51));
		jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel11.setText("Danh sách môn học");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(31, 31, 31).addGroup(jPanel3Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel10)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtSodvht, javax.swing.GroupLayout.PREFERRED_SIZE, 154,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel9)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 154,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel8).addGap(59, 59, 59)
										.addComponent(txtMamon, javax.swing.GroupLayout.PREFERRED_SIZE, 154,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addGroup(jPanel3Layout
								.createSequentialGroup().addGap(113, 113, 113).addComponent(btnNhapmonhoc)))
						.addGap(31, 31, 31)
						.addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
						.addContainerGap(405, Short.MAX_VALUE).addComponent(jLabel11,
								javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(81, 81, 81)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(35, 35, 35).addGroup(jPanel3Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel8)
								.addComponent(txtMamon, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap().addComponent(jLabel11)))
						.addGroup(
								jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(jPanel3Layout.createSequentialGroup().addGap(42, 42, 42)
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel9).addComponent(txtTenMon,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(46, 46, 46)
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel10).addComponent(txtSodvht,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(40, 40, 40).addComponent(btnNhapmonhoc))
										.addGroup(jPanel3Layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jScrollPane2, 0, 0, Short.MAX_VALUE)))
						.addContainerGap(109, Short.MAX_VALUE)));

		jTabbedPane2.addTab("Thông tin môn học", jPanel3);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout
						.createSequentialGroup().addGap(37, 37, 37).addComponent(jTabbedPane2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(22, Short.MAX_VALUE)));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(36, Short.MAX_VALUE).addComponent(jTabbedPane2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(24, 24, 24)));

		jTabbedPane1.addTab("Nhập thông tin môn học", jPanel1);

		cbSinhvien.setName(""); // NOI18N
		cbSinhvien.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cbSinhvienActionPerformed(evt);
			}
		});

		jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jLabel14.setText("Các Học SInh");

		jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jLabel15.setText("Môn học");

		jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jLabel16.setText("điểm trung binh");

		jButton2.setText("Nhập");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jTable4.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null },
						{ null, null, null, null, null }, { null, null, null, null, null } },
				new String[] { "Mã Học Sinh", "Họ Và Tên", "Lớp", "Môn Học", "Điểm Trung Bình" }) {
			boolean[] canEdit = new boolean[] { false, false, true, false, true };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
		jTable4.setRowHeight(20);
		jScrollPane6.setViewportView(jTable4);

		cbChonLop.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "12a1", "12a2", "12a3", "12a4", "11a1", "11a2", "11a3", "11a4", "11a5", "11a6", "11a7",
						"11a8", "11a9", "11a10", "10a1", "10a2", "10a3", "10a4", "10a5", "10a6", "10a7", "10a8", "10a9",
						"10a10", "12b1", "12b2", "12b3", "12b4", "12b5", "12b6", "12b7", "12b8" }));
		cbChonLop.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				cbChonLopActionPerformed(evt);
			}
		});

		jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
		jLabel17.setText("Lớp");

		jTextField1.setEnabled(false);

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addGroup(jPanel5Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addGroup(jPanel5Layout.createSequentialGroup().addGap(355, 355, 355).addComponent(jButton2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel5Layout.createSequentialGroup().addContainerGap()
										.addComponent(cbChonLop, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 48,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(cbSinhvien, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18)
										.addComponent(cbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 174,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(txtDiem,
												javax.swing.GroupLayout.PREFERRED_SIZE, 165,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(javax.swing.GroupLayout.Alignment.LEADING,
										jPanel5Layout.createSequentialGroup().addGap(37, 37, 37).addComponent(
												jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 792,
												javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(43, Short.MAX_VALUE))
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel5Layout.createSequentialGroup().addContainerGap(128, Short.MAX_VALUE)
								.addComponent(jLabel17).addGap(183, 183, 183).addComponent(jLabel14)
								.addGap(119, 119, 119).addComponent(jLabel15).addGap(129, 129, 129)
								.addComponent(jLabel16).addGap(99, 99, 99)));
		jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel5Layout.createSequentialGroup().addGap(32, 32, 32)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel17).addComponent(jLabel16).addComponent(jLabel15)
								.addComponent(jLabel14))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(txtDiem, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(cbChonLop, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(cbMonHoc, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(cbSinhvien, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(28, 28, 28).addComponent(jButton2).addGap(27, 27, 27)
						.addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
						.addGap(119, 119, 119)));

		jTabbedPane1.addTab("                     Nhập Điểm Cho Học Sinh                 ", jPanel5);

		jLabel1.setFont(new java.awt.Font("Constantia", 1, 24));
		jLabel1.setForeground(new java.awt.Color(0, 0, 255));
		jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jLabel1.setText("Quản Lý Điểm Học Sinh");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(284, 284, 284).addComponent(jLabel1,
								javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 877, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(27, 27, 27).addComponent(jLabel1).addGap(31, 31, 31)
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
						.addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	boolean ktraTrungMaSv(String a) {
		boolean ok = true;
		for (sinhVien i : listSV) {
			if (i.getMaSV().equalsIgnoreCase(a))
				ok = false;
		}
		return ok;
	}

	private void btnThemSvActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnThemSvActionPerformed
		try {
			if (txtMasv.getText().equals("") || txtHo.getText().equals("") || txtTen.getText().equals("")
					|| txtDiachi.getText().equals("")) {
				JOptionPane.showMessageDialog(rootPane, " Bạn Cần Nhập Đầy Đủ Thông Tin");
			} else {
				if (ktraTrungMaSv(txtMasv.getText())) {
					sinhVien a = new sinhVien(txtMasv.getText(), cbLop.getSelectedItem().toString(), txtHo.getText(),
							txtTen.getText(), txtDiachi.getText());
					listSV.add(a);
					new FileSV().ghiSV(listSV);
					taoBangSV();
				} else {
					JOptionPane.showMessageDialog(rootPane, "Mã Học Sinh Này Tồn Tại");
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(rootPane, e.getMessage());
		}
	}

	boolean ktraTrungMonHoc(String a) {
		boolean ok = true;
		for (monHoc i : listMH) {
			if (i.getMaMon().equalsIgnoreCase(a))
				ok = false;
		}
		return ok;
	}

	private void btnNhapmonhocActionPerformed(java.awt.event.ActionEvent evt) {
		try {
			if (txtMamon.getText().equals("") || txtTenMon.getText().equals("") || txtSodvht.getText().equals("")) {
				JOptionPane.showMessageDialog(rootPane, " Bạn Cần Nhập Đầy Đủ Thông Tin");
			} else {
				if (ktraTrungMonHoc(txtMamon.getText())) {
					monHoc a = new monHoc(txtMamon.getText(), txtTenMon.getText(),
							Integer.parseInt(txtSodvht.getText()));
					listMH.add(a);
					new FileMH().ghiMH(listMH);
					taoBangMH();
					indexComboBox();
				} else {
					JOptionPane.showMessageDialog(rootPane, "Mã Môn Học Tồn Tại");
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(rootPane, e.getMessage());
		}
	}// GEN-LAST:event_btnNhapmonhocActionPerformed

	private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnTimKiemActionPerformed
		// TODO add your handling code here:
		DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
		m.fireTableDataChanged();
		TableRowSorter sorter = new TableRowSorter(m);
		jTable1.setRowSorter(sorter);
		sorter.setRowFilter(RowFilter.regexFilter(txtTim.getText()));
	}// GEN-LAST:event_btnTimKiemActionPerformed

	private void txtTimKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtTimKeyPressed
		// TODO add your handling code here:
		DefaultTableModel m = (DefaultTableModel) jTable1.getModel();
		m.fireTableDataChanged();
		TableRowSorter sorter = new TableRowSorter(m);
		jTable1.setRowSorter(sorter);
		sorter.setRowFilter(RowFilter.regexFilter(txtTim.getText()));
	}// GEN-LAST:event_txtTimKeyPressed

	void indexComboBox() {
		cbMonHoc.removeAllItems();
		for (monHoc i : listMH) {
			cbMonHoc.addItem(i.getTenMon());
		}
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
		try {
			if (Integer.parseInt(txtDiem.getText()) < 0 || Integer.parseInt(txtDiem.getText()) > 10) {
				JOptionPane.showMessageDialog(rootPane, "Nhập Sai Điểm");
			} else {
				bangDiem a = new bangDiem(Integer.parseInt(txtDiem.getText()), returnHocSinh(jTextField1.getText()),
						listMH.get(cbMonHoc.getSelectedIndex()));
				System.out.println("" + a.getMh().getTenMon());
				listBD.add(a);
				new FileBD().ghiBD(listBD);
				taoBangDiem();
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(rootPane, e.getMessage());
		}
	}// GEN-LAST:event_jButton2ActionPerformed

	sinhVien returnHocSinh(String b) {
		sinhVien a = new sinhVien();
		for (sinhVien i : listSV) {
			if (i.getMaSV().equals(b)) {
				a = i;
			}
		}
		return a;
	}

	private void cbChonLopActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbChonLopActionPerformed
		// TODO add your handling code here:
		cbSinhvien.removeAllItems();
		for (sinhVien i : listSV) {
			if (i.getLop().equals(cbChonLop.getSelectedItem())) {
				cbSinhvien.addItem(i.getHo() + " " + i.getTen());
			}
		}

	}// GEN-LAST:event_cbChonLopActionPerformed

	private void cbSinhvienActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cbSinhvienActionPerformed
		// TODO add your handling code here:
		for (sinhVien i : listSV) {
			if ((i.getHo() + " " + i.getTen()).equals(cbSinhvien.getSelectedItem().toString())) {
				jTextField1.setText(i.getMaSV());
			}
		}
	}// GEN-LAST:event_cbSinhvienActionPerformed

	void taoBangDiem() {
		DefaultTableModel m = (DefaultTableModel) jTable4.getModel();
		m.getDataVector().removeAllElements();
		m.fireTableDataChanged();
		TableRowSorter sorter = new TableRowSorter(m);
		jTable4.setRowSorter(sorter);
		for (bangDiem i : listBD) {
			m.addRow(new Object[] { i.getSv().getMaSV(), i.getSv().getHo() + " " + i.getSv().getTen(),
					i.getSv().getLop(), i.getMh().getTenMon(), i.getDiem() });
		}
	}

	monHoc returnMonHoc(String a) {
		monHoc s = new monHoc();
		for (monHoc i : listMH) {
			if (i.getTenMon().equals(s)) {
				s = i;
			}
		}
		return s;
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(GuiManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(GuiManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(GuiManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(GuiManager.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new GuiManager().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnNhapmonhoc;
	private javax.swing.JButton btnThemSv;
	private javax.swing.JButton btnTimKiem;
	private javax.swing.JComboBox cbChonLop;
	private javax.swing.JComboBox cbLop;
	private javax.swing.JComboBox cbMonHoc;
	private javax.swing.JComboBox cbSinhvien;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel14;
	private javax.swing.JLabel jLabel15;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel17;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTabbedPane jTabbedPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable4;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField txtDiachi;
	private javax.swing.JTextField txtDiem;
	private javax.swing.JTextField txtHo;
	private javax.swing.JTextField txtMamon;
	private javax.swing.JTextField txtMasv;
	private javax.swing.JTextField txtSodvht;
	private javax.swing.JTextField txtTen;
	private javax.swing.JTextField txtTenMon;
	private javax.swing.JTextField txtTim;
	// End of variables declaration//GEN-END:variables
}
