import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

class SF extends JFrame implements ActionListener
{
	JLabel LbHeadline,LbLine,LbFirstNo,LbSecondNo,LbOperation,LbTotal;
	JTextField TxFirstNo,TxSecondNo,TxTotal;
	JComboBox CmbOperation;
	JButton BtnCalculate;

	SF()
	{
			setSize(500,450);
			setLocation(350,200);
			setTitle("My Calculator Developed By Bhavesh Sonawane");
			setLayout(null);
			setBackground(Color.red);
			setResizable(false);

			LbHeadline=new JLabel("MY CALCULATOR");
			LbHeadline.setBounds(150,10,250,20);
			add(LbHeadline);
			LbHeadline.setLayout(null);
			LbHeadline.setFont(new Font("Times New Roman",Font.BOLD,20));

			LbLine=new JLabel("_______________________________________________________________________");
			LbLine.setBounds(0,30,1000,20);
			add(LbLine);
			LbLine.setLayout(null);
			LbLine.setForeground(Color.red);

			LbFirstNo=new JLabel("First Number :");
			LbFirstNo.setBounds(10,90,200,20);
			add(LbFirstNo);
			LbFirstNo.setLayout(null);
			LbFirstNo.setFont(new Font("Times New Roman",Font.BOLD,17));
			TxFirstNo= new JTextField();
			TxFirstNo.setBounds(150,90,150,20);
			TxFirstNo.setFont(new Font("Times New Roman",Font.BOLD,15));
			add(TxFirstNo);

			LbSecondNo=new JLabel("Second Number :");
			LbSecondNo.setBounds(10,170,200,20);
			add(LbSecondNo);
			LbSecondNo.setLayout(null);
			LbSecondNo.setFont(new Font("Times New Roman",Font.BOLD,17));
			TxSecondNo= new JTextField();
			TxSecondNo.setBounds(150,170,150,20);
			TxSecondNo.setFont(new Font("Times New Roman",Font.BOLD,15));
			add(TxSecondNo);

			LbOperation=new JLabel("Operation :");
			LbOperation.setBounds(50,250,200,20);
			add(LbOperation);
			LbOperation.setLayout(null);
			LbOperation.setFont(new Font("Times New Roman",Font.BOLD,17));

			CmbOperation= new JComboBox();
			CmbOperation.setBounds(150,250,150,20);
			add(CmbOperation);
			CmbOperation.setFont(new Font("Times New Roman",Font.BOLD,15));

			CmbOperation.addItem("Addition");
			CmbOperation.addItem("Subtraction");
			CmbOperation.addItem("Multiplication");
			CmbOperation.addItem("Division");

			LbTotal=new JLabel("Total :");
			LbTotal.setBounds(30,330,200,20);
			add(LbTotal);
			LbTotal.setLayout(null);
			LbTotal.setFont(new Font("Times New Roman",Font.BOLD,17));
			TxTotal= new JTextField();
			TxTotal.setBounds(150,330,150,20);
			TxTotal.setFont(new Font("Times New Roman",Font.BOLD,15));
			add(TxTotal);

			BtnCalculate= new JButton("Calculate");
			BtnCalculate.setBounds(180,380,100,20);
			BtnCalculate.setFont(new Font("Times New Roman",Font.BOLD,15));
			add(BtnCalculate);
			BtnCalculate.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{

			if(e.getSource()==BtnCalculate);
			{

				if(CmbOperation.getSelectedItem().equals("Addition"))
					{
						float n1,n2,ans;
						n1 = Float.valueOf(TxFirstNo.getText()).floatValue();
						n2 = Float.valueOf(TxSecondNo.getText()).floatValue();
						ans = n1+n2;
						TxTotal.setText(Float.toString(ans));
						LbTotal.setText("Addition");
				}

				if(CmbOperation.getSelectedItem().equals("Subtraction"))
				{
						float n1,n2,ans;
						n1 = Float.valueOf(TxFirstNo.getText()).floatValue();
						n2 = Float.valueOf(TxSecondNo.getText()).floatValue();
						ans = n1-n2;
						TxTotal.setText(Float.toString(ans));
						LbTotal.setText("Subtraction");
				}

				if(CmbOperation.getSelectedItem().equals("Multiplication"))
				{
						float n1,n2,ans;
						n1 = Float.valueOf(TxFirstNo.getText()).floatValue();
						n2 = Float.valueOf(TxSecondNo.getText()).floatValue();
						ans = n1*n2;
						TxTotal.setText(Float.toString(ans));
						LbTotal.setText("Multiplication");
				}

				if(CmbOperation.getSelectedItem().equals("Division"))
				{
						float n1,n2,ans;
						n1 = Float.valueOf(TxFirstNo.getText()).floatValue();
						n2 = Float.valueOf(TxSecondNo.getText()).floatValue();
						ans = n1/n2;
						TxTotal.setText(Float.toString(ans));
						LbTotal.setText("Division");
				}
			}
	}
}

class MY_CALCULATOR
	{
		public static void main(String args[])
		{
			SF obj = new SF();
			 obj.show();
			 obj.setDefaultCloseOperation(3);
		}
	}
