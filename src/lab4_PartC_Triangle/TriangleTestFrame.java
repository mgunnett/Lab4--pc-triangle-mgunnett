package lab4_PartC_Triangle;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TriangleTestFrame {

	private JFrame frmTriangle;
	private Triangle myTriangle;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TriangleTestFrame window = new TriangleTestFrame();
					window.frmTriangle.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TriangleTestFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTriangle = new JFrame();
		frmTriangle.setTitle("TriangleTestFrame");
		frmTriangle.setBounds(100, 100, 397, 320);
		frmTriangle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTriangle.getContentPane().setLayout(null);
		
		JLabel lblInputA = new JLabel("Input A:");
		lblInputA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInputA.setBounds(10, 44, 61, 18);
		frmTriangle.getContentPane().add(lblInputA);
		
		JLabel lblInputB = new JLabel("Input B:");
		lblInputB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInputB.setBounds(10, 73, 61, 19);
		frmTriangle.getContentPane().add(lblInputB);
		
		JLabel lblInputC = new JLabel("Input C:");
		lblInputC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblInputC.setBounds(10, 103, 61, 20);
		frmTriangle.getContentPane().add(lblInputC);
		
		JTextField txtFldA_Xcord = new JTextField();
		txtFldA_Xcord.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFldA_Xcord.setText("0.0");
		txtFldA_Xcord.setBounds(75, 44, 61, 23);
		frmTriangle.getContentPane().add(txtFldA_Xcord);
		txtFldA_Xcord.setColumns(10);
		
		JTextField txtFldA_Ycord = new JTextField();
		txtFldA_Ycord.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFldA_Ycord.setText("0.0");
		txtFldA_Ycord.setColumns(10);
		txtFldA_Ycord.setBounds(158, 44, 61, 23);
		frmTriangle.getContentPane().add(txtFldA_Ycord);
		
		JTextField txtFldB_Xcord = new JTextField();
		txtFldB_Xcord.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFldB_Xcord.setText("0.0");
		txtFldB_Xcord.setColumns(10);
		txtFldB_Xcord.setBounds(75, 73, 61, 23);
		frmTriangle.getContentPane().add(txtFldB_Xcord);
		
		JTextField txtFldB_Ycord = new JTextField();
		txtFldB_Ycord.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFldB_Ycord.setText("1.0");
		txtFldB_Ycord.setColumns(10);
		txtFldB_Ycord.setBounds(158, 73, 61, 23);
		frmTriangle.getContentPane().add(txtFldB_Ycord);
		
		JTextField txtFldC_Xcord = new JTextField();
		txtFldC_Xcord.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFldC_Xcord.setText("1.0");
		txtFldC_Xcord.setColumns(10);
		txtFldC_Xcord.setBounds(75, 103, 61, 23);
		frmTriangle.getContentPane().add(txtFldC_Xcord);
		
		JTextField txtFldC_Ycord = new JTextField();
		txtFldC_Ycord.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtFldC_Ycord.setText("0.0");
		txtFldC_Ycord.setColumns(10);
		txtFldC_Ycord.setBounds(158, 103, 61, 23);
		frmTriangle.getContentPane().add(txtFldC_Ycord);
		
		JLabel lblLenAB = new JLabel("Len(AB):");
		lblLenAB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLenAB.setBounds(10, 158, 67, 19);
		frmTriangle.getContentPane().add(lblLenAB);
		
		JLabel lblLenAC = new JLabel("Len(AC):");
		lblLenAC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLenAC.setBounds(10, 183, 67, 20);
		frmTriangle.getContentPane().add(lblLenAC);
		
		JLabel lblLenBC = new JLabel("Len(BC):");
		lblLenBC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLenBC.setBounds(10, 206, 67, 23);
		frmTriangle.getContentPane().add(lblLenBC);
		
		JLabel lblLenABVal = new JLabel("1.00");
		lblLenABVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLenABVal.setBounds(87, 158, 49, 19);
		frmTriangle.getContentPane().add(lblLenABVal);
		
		JLabel lblLenACVal = new JLabel("1.00");
		lblLenACVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLenACVal.setBounds(87, 183, 49, 20);
		frmTriangle.getContentPane().add(lblLenACVal);
		
		JLabel lblLenBCVal = new JLabel("1.41");
		lblLenBCVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLenBCVal.setBounds(87, 206, 49, 23);
		frmTriangle.getContentPane().add(lblLenBCVal);
		
		JLabel lblPerimeter = new JLabel("Perimeter:");
		lblPerimeter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPerimeter.setBounds(158, 158, 73, 19);
		frmTriangle.getContentPane().add(lblPerimeter);
		
		JLabel lblArea = new JLabel("Area:");
		lblArea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblArea.setBounds(189, 183, 39, 20);
		frmTriangle.getContentPane().add(lblArea);
		
		JLabel lblNewLabel = new JLabel("X");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(95, 11, 20, 22);
		frmTriangle.getContentPane().add(lblNewLabel);
		
		JLabel lblY = new JLabel("Y");
		lblY.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblY.setBounds(178, 11, 20, 22);
		frmTriangle.getContentPane().add(lblY);
				
		JLabel lblY_1 = new JLabel("Angle, deg.");
		lblY_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblY_1.setBounds(279, 11, 80, 22);
		frmTriangle.getContentPane().add(lblY_1);
		
		JLabel lblPerimtrVal = new JLabel("3.41");
		lblPerimtrVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPerimtrVal.setBounds(248, 158, 49, 19);
		frmTriangle.getContentPane().add(lblPerimtrVal);
		
		JLabel lblAreaVal = new JLabel("0.50");
		lblAreaVal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAreaVal.setBounds(248, 184, 49, 19);
		frmTriangle.getContentPane().add(lblAreaVal);
		
		JLabel lblAngleA = new JLabel("90.00");
		lblAngleA.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAngleA.setBounds(304, 44, 49, 19);
		frmTriangle.getContentPane().add(lblAngleA);
		
		JLabel lblAngleB = new JLabel("45.00");
		lblAngleB.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAngleB.setBounds(304, 73, 49, 19);
		frmTriangle.getContentPane().add(lblAngleB);
		
		JLabel lblAngleC = new JLabel("45.00");
		lblAngleC.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAngleC.setBounds(304, 103, 49, 19);
		frmTriangle.getContentPane().add(lblAngleC);
		
		JButton btnNewButton = new JButton("Calculate Triangle Properties");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(10, 247, 361, 25);
		frmTriangle.getContentPane().add(btnNewButton);

	}
}
