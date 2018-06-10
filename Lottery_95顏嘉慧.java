import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.border.EmptyBorder;






public class Lottery_95顏嘉慧
  extends JFrame
{
  private JPanel contentPane;
  private JTextField txt_input;
  JTextField[] txtNums = new JTextField[6];
  JTextField[] txtWinNums = new JTextField[7];
  private JButton[] btnNum = new JButton[49];
  ArrayList<Integer> selectedNumAL = new ArrayList();
  ArrayList<Integer> winNumAL = new ArrayList();
  private JButton btn_random;
  private JButton btn_confirm;
  private JButton btn_clear;
  private JButton btn_check;
  private JList list;
  private JButton btn_del;
  private JPanel panel_1;
  private JPanel panel;
  private JPanel panel_2;
  private JPanel panel_6;
  private DefaultListModel<String> listModel;
  private JScrollPane scrollPane;
  private JScrollPane scrollPane_1;
  private JTextPane txtResult;
  private JPanel panel_5;
  private JPanel panel_3;
  private JPanel panel_4;
  private JLabel label_1;
  
  public static void main(String[] args)
  {
    EventQueue.invokeLater(new Runnable()
    {
      public void run()
      {
        try
        {
          Lottery_95顏嘉慧 frame = new Lottery_95顏嘉慧();
          frame.setLocationRelativeTo(null);
          frame.setVisible(true);
        }
        catch (Exception e)
        {
          e.printStackTrace();
        }
      }
    });
  }
  
  public Lottery_95顏嘉慧()
  {
    setBackground(new Color(255, 222, 173));
    setResizable(false);
    setTitle("Lottery");
    setDefaultCloseOperation(3);
    setBounds(100, 100, 753, 666);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(255, 255, 204));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(new BorderLayout(5, 10));
    panel = new JPanel();
    panel.setBackground(new Color(255, 255, 204));
    panel.setPreferredSize(new Dimension(150, 170));
    contentPane.add(panel, "North");
    panel.setLayout(null);
    JLabel lblNewLabel = new JLabel("按Enter輸入號碼:");
    lblNewLabel.setFont(new Font("微軟正黑體", 0, 18));
    lblNewLabel.setBounds(506, 5, 147, 40);
    panel.add(lblNewLabel);
    txt_input = new JTextField();
    txt_input.setBackground(Color.WHITE);
    txt_input.setHorizontalAlignment(0);
    txt_input.setFont(new Font("微軟正黑體", 0, 16));
    txt_input.setBounds(665, 7, 57, 40);
    panel.add(txt_input);
    txt_input.setColumns(10);
    JLabel lblNewLabel_2 = new JLabel("選取的號碼:");
    lblNewLabel_2.setFont(new Font("微軟正黑體", 0, 17));
    lblNewLabel_2.setBounds(15, 60, 89, 40);
    panel.add(lblNewLabel_2);
    for (int i = 0; i < txtNums.length; i++)
    {
      txtNums[i] = new JTextField();
      txtNums[i].setHorizontalAlignment(0);
      txtNums[i].setFont(new Font("微軟正黑體", 0, 20));
      txtNums[i].setBounds(115 + i * 50, 60, 50, 50);
      txtNums[i].setEditable(false);
      txtNums[i].setBackground(Color.white);
      panel.add(txtNums[i]);
    }
    for (int i = 0; i < txtWinNums.length; i++)
    {
      txtWinNums[i] = new JTextField();
      txtWinNums[i].setHorizontalAlignment(0);
      txtWinNums[i].setFont(new Font("微軟正黑體", 0, 20));
      txtWinNums[i].setBounds(115 + i * 50, 110, 50, 50);
      txtWinNums[i].setEditable(false);
      txtWinNums[i].setBackground(Color.white);
      panel.add(txtWinNums[i]);
    }
    txtWinNums[6].setBackground(new Color(235, 222, 208));
    
    btn_random = new JButton("電腦選號");
    btn_random.setBackground(new Color(204, 255, 204));
    btn_random.setFont(new Font("微軟正黑體", 1, 18));
    btn_random.setBounds(15, 5, 113, 40);
    panel.add(btn_random);
    
    btn_confirm = new JButton("選號保留");
    btn_confirm.setBackground(new Color(204, 255, 204));
    btn_confirm.setFont(new Font("微軟正黑體", 1, 18));
    btn_confirm.setBounds(143, 5, 113, 40);
    panel.add(btn_confirm);
    
    btn_clear = new JButton("選號清除");
    btn_clear.setBackground(new Color(255, 192, 203));
    btn_clear.setFont(new Font("微軟正黑體", 1, 18));
    btn_clear.setBounds(506, 60, 216, 40);
    panel.add(btn_clear);
    
    btn_check = new JButton("開獎");
    btn_check.setBackground(new Color(135, 206, 250));
    btn_check.setForeground(new Color(0, 0, 0));
    btn_check.setFont(new Font("微軟正黑體", 1, 20));
    btn_check.setBounds(319, 5, 147, 40);
    panel.add(btn_check);
    
    JLabel label = new JLabel("開獎號碼:");
    label.setBackground(Color.WHITE);
    label.setFont(new Font("微軟正黑體", 0, 17));
    label.setBounds(15, 115, 80, 26);
    panel.add(label);
    
    panel_1 = new JPanel();
    panel_1.setBackground(new Color(255, 255, 204));
    panel_1.setPreferredSize(new Dimension(50, 50));
    contentPane.add(panel_1, "Center");
    panel_1.setLayout(new GridLayout(0, 7, 0, 0));
    
    panel_2 = new JPanel();
    contentPane.add(panel_2, "South");
    panel_2.setLayout(new BoxLayout(panel_2, 0));
    
    panel_3 = new JPanel();
    panel_3.setPreferredSize(new Dimension(120, 70));
    panel_3.setBackground(Color.WHITE);
    panel_2.add(panel_3);
    panel_3.setLayout(new BorderLayout(0, 0));
    
    scrollPane_1 = new JScrollPane();
    panel_3.add(scrollPane_1, "Center");
    
    txtResult = new JTextPane();
    txtResult.setEditable(false);
    txtResult.setFont(new Font("微軟正黑體", 0, 20));
    scrollPane_1.setViewportView(txtResult);
    
    label_1 = new JLabel("開獎結果");
    label_1.setForeground(new Color(0, 0, 255));
    label_1.setFont(new Font("微軟正黑體", 3, 22));
    label_1.setHorizontalAlignment(0);
    scrollPane_1.setColumnHeaderView(label_1);
    
    panel_5 = new JPanel();
    panel_5.setBackground(new Color(255, 255, 204));
    panel_2.add(panel_5);
    
    panel_4 = new JPanel();
    panel_4.setPreferredSize(new Dimension(10, 170));
    panel_2.add(panel_4);
    panel_4.setLayout(new BorderLayout(3, 3));
    
    JLabel lblNewLabel_3 = new JLabel(
      "號碼儲存區");
    lblNewLabel_3.setBackground(new Color(0, 36, 128));
    lblNewLabel_3.setHorizontalAlignment(0);
    lblNewLabel_3.setFont(new Font("微軟正黑體", 0, 20));
    lblNewLabel_3.setPreferredSize(new Dimension(50, 30));
    panel_4.add(lblNewLabel_3, "South");
    
    scrollPane = new JScrollPane();
    panel_4.add(scrollPane, "Center");
    
    listModel = new DefaultListModel();
    list = new JList(listModel);
    list.setFont(new Font("微軟正黑體", 0, 20));
    list.setSelectionMode(0);
    scrollPane.setViewportView(list);
    
    btn_del = new JButton("點我清除保留號碼");
    btn_del.setForeground(new Color(0, 128, 128));
    btn_del.setBackground(new Color(175, 238, 238));
    scrollPane.setColumnHeaderView(btn_del);
    btn_del.setPreferredSize(new Dimension(90, 25));
    btn_del.setFont(new Font("微軟正黑體", 1, 24));
    
    panel_6 = new JPanel();
    contentPane.add(panel_6, "East");
    panel_6.setLayout(new BoxLayout(panel_6, 1));
    for (int i = 0; i < btnNum.length; i++)
    {
      btnNum[i] = new JButton(String.format("%02d", new Object[] { Integer.valueOf(i + 1) }));
      btnNum[i].setBackground(Color.WHITE);
      btnNum[i].setFont(new Font("微軟正黑體", 0, 18));
      panel_1.add(btnNum[i]);
    }
    invokeNumbtn();
    inputNum();
    ranNum();
    save();
    delete();
    chkWin();
    reset();
  }
  
  public void invokeNumbtn()
  {
    for (int i = 0; i < btnNum.length; i++) {
      btnNum[i].addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          JButton button = (JButton)e.getSource();
          int selectedNum = Integer.parseInt(button.getText());
          if (button.getBackground() == Color.WHITE)
          {
            if (selectedNumAL.size() < 6)
            {
              button.setBackground(Color.yellow);
              selectedNumAL.add(Integer.valueOf(selectedNum));
            }
            else
            {
              JOptionPane.showMessageDialog(null, new JLabel("<html><h2>只能選擇6個號碼!</h2></html>"));
            }
          }
          else if (selectedNumAL.contains(Integer.valueOf(selectedNum)))
          {
            selectedNumAL.remove(Integer.valueOf(selectedNum));
            button.setBackground(Color.WHITE);
          }
          showNum();
        }
      });
    }
  }
  
  public void showNum()
  {
    try
    {
      Collections.sort(selectedNumAL);
      for (int i = 0; i < txtNums.length; i++) {
        txtNums[i].setText("");
      }
      for (int i = 0; i < selectedNumAL.size(); i++) {
        if (selectedNumAL.contains(selectedNumAL.get(i))) {
          txtNums[i].setText(String.format("%02d", new Object[] { Integer.valueOf(((Integer)selectedNumAL.get(i)).intValue()) }));
        } else {
          txtNums[i].setText("");
        }
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  public void inputNum()
  {
    txt_input.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent arg0)
      {
        if (txt_input.getText().length() > 0)
        {
          if (txt_input.getText().matches("\\d{1,2}"))
          {
            int inputNum = Integer.parseInt(txt_input.getText());
            if ((inputNum >= 1) && (inputNum <= 49))
            {
              if (selectedNumAL.size() < 6)
              {
                if (!selectedNumAL.contains(Integer.valueOf(inputNum)))
                {
                  selectedNumAL.add(Integer.valueOf(txt_input.getText()));
                  btnNum[(inputNum - 1)].setBackground(Color.yellow);
                }
                else
                {
                  JOptionPane.showMessageDialog(null, new JLabel("<html><h2>這個號碼已被選,換一個吧!</h2></html>"));
                }
              }
              else {
                JOptionPane.showMessageDialog(null, new JLabel("<html><h2>只能選擇6個號碼!</h2></html>"));
              }
            }
            else {
              JOptionPane.showMessageDialog(null, new JLabel("<html><h2>只能輸入1~49</h2></html>"), "錯誤", 0);
            }
            txt_input.setText("");
            showNum();
          }
          else
          {
            JOptionPane.showMessageDialog(null, new JLabel("<html><h2>只能輸入1~49</h2></html>"), "錯誤", 0);
          }
        }
        else {
          JOptionPane.showMessageDialog(null, new JLabel("<html><h2>請填滿欄位, 選擇1~49的任一數字</h2></html>"), "錯誤", 0);
        }
      }
    });
  }
  
  public void ranNum()
  {
    btn_random.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent arg0)
      {
        selectedNumAL.clear();
        new Thread()
        {
          public void run()
          {
            for (int x = 0; x < 15; x++)
            {
              try
              {
                Thread.sleep(100L);
              }
              catch (InterruptedException e)
              {
                e.printStackTrace();
              }
              for (int j = 0; j < 6; j++)
              {
                for (int k = 0; k < 49; k++) {
                  btnNum[k].setBackground(Color.WHITE);
                }
                int ran = (int)(Math.random() * 49.0D);
                btnNum[ran].setBackground(Color.yellow);
                txtNums[j].setText(String.format("%d", new Object[] { Integer.valueOf(ran) }));
              }
            }
            JButton[] arrayOfJButton;
            int ran = (arrayOfJButton = btnNum).length;
            for (int j = 0; j < ran; j++)
            {
              JButton btn = arrayOfJButton[j];
              btn.setBackground(Color.white);
            }
            for (int i = 0; i < 6; i++)
            {
              int num;
              do
              {
                num = (int)(Math.random() * 49.0D) + 1;
              } while (selectedNumAL.contains(Integer.valueOf(num)));
              selectedNumAL.add(Integer.valueOf(num));
              btnNum[(num - 1)].setBackground(Color.pink);
            }
            showNum();
          }
        }.start();
      }
    });
  }
  
  public void save()
  {
    btn_confirm.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent arg0)
      {
        if (selectedNumAL.size() < 6)
        {
          JOptionPane.showMessageDialog(null, new JLabel("<html><h2>請填滿欄位, 選擇1~49的任一數字</h2></html>"), "錯誤", 0);
        }
        else
        {
          String strNums = "";
          for (int i = 0; i < selectedNumAL.size(); i++) {
            strNums = strNums + String.format(" %02d ", new Object[] { Integer.valueOf(((Integer)selectedNumAL.get(i)).intValue()) });
          }
          listModel.addElement(strNums);
          clear();
        }
      }
    });
  }
  
  public void clear()
  {
    selectedNumAL.clear();
    for (int i = 0; i < 6; i++)
    {
      txtNums[i].setText("");
      txtWinNums[i].setText("");
    }
    txtWinNums[6].setText("");
    for (int i = 0; i < btnNum.length; i++) {
      btnNum[i].setBackground(Color.WHITE);
    }
  }
  
  public void reset()
  {
    btn_clear.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent arg0)
      {
        btn_random.setEnabled(true);
        btn_confirm.setEnabled(true);
        txt_input.setEnabled(true);
        clear();
        listModel.clear();
        txtResult.setText("");
        for (int z = 0; z < btnNum.length; z++) {
          btnNum[z].setEnabled(true);
        }
      }
    });
  }
  
  public void delete()
  {
    btn_del.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent arg0)
      {
        if (list.getSelectedIndex() == -1) {
          JOptionPane.showMessageDialog(null, new JLabel("<html><h2>請點選要刪除的號碼組</h2></html>"), "錯誤", 0);
        } else {
          listModel.remove(list.getSelectedIndex());
        }
      }
    });
  }
  
  public void chkWin()
  {
    btn_check.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        clear();
        winNumAL.clear();
        if (list.getModel().getSize() <= 0) {
          JOptionPane.showMessageDialog(null, new JLabel("<html><h2>請儲存至少一組數字</h2></html>"), "錯誤", 0);
















































































        }
        else
        {
















































































          new Thread()
          {
            public void run()
            {
              int speNum = 0;
              String result = "\n";
              for (int x = 0; x < 15; x++)
              {
                try
                {
                  Thread.sleep(90L);
                }
                catch (InterruptedException e)
                {
                  e.printStackTrace();
                }
                for (int j = 0; j < 7; j++)
                {
                  for (int k = 0; k < 49; k++) {
                    btnNum[k].setBackground(new Color(236, 246, 233));
                  }
                  int ran = (int)(Math.random() * 49.0D);
                  btnNum[ran].setBackground(new Color(164, 238, 17));
                  txtWinNums[j].setText(String.format("%d", new Object[] { Integer.valueOf(ran) }));
                }
              }
              JButton[] arrayOfJButton;
              int ran = (arrayOfJButton = btnNum).length;
              for (int j = 0; j < ran; j++)
              {
                JButton btn = arrayOfJButton[j];
                btn.setBackground(Color.white);
              }
              for (int i = 0; i < 6; i++)
              {
                int winNum;
                do
                {
                  winNum = (int)(Math.random() * 49.0D) + 1;
                } while (winNumAL.contains(Integer.valueOf(winNum)));
                winNumAL.add(Integer.valueOf(winNum));
              }
              try
              {
                Collections.sort(winNumAL);
                for (int i = 0; i < txtWinNums.length; i++) {
                  txtWinNums[i].setText("");
                }
                for (int i = 0; i < winNumAL.size(); i++) {
                  if (winNumAL.contains(winNumAL.get(i))) {
                    txtWinNums[i].setText(String.format("%02d", new Object[] { Integer.valueOf(((Integer)winNumAL.get(i)).intValue()) }));
                  } else {
                    txtWinNums[i].setText("");
                  }
                }
                do
                {
                  speNum = (int)(Math.random() * 49.0D) + 1;
                } while (winNumAL.contains(Integer.valueOf(speNum)));
                txtWinNums[6].setText(String.format("%02d", new Object[] { Integer.valueOf(speNum) }));
              }
              catch (Exception ex)
              {
                ex.printStackTrace();
              }
              for (int j = 0; j < 6; j++) {
                btnNum[(Integer.parseInt(txtWinNums[j].getText()) - 1)].setBackground(new Color(164, 238, 17));
              }
              btnNum[(speNum - 1)].setBackground(new Color(199, 208, 255));
              
              String[] strNums = new String[6];
              int[] intNums = new int[6];
              for (int i = 0; i < list.getModel().getSize(); i++)
              {
                String listItem = (String)list.getModel().getElementAt(i);
                listItem.trim();
                strNums = listItem.split("  ");
                for (int idx = 0; idx < 6; idx++) {
                  intNums[idx] = Integer.parseInt(strNums[idx].trim());
                }
                result = result + String.format("第 %d 組號碼", new Object[] { Integer.valueOf(i + 1) });
                for (int b = 0; b < 6; b++) {
                  result = result + String.format("%02d ", new Object[] { Integer.valueOf(intNums[b]) });
                }
                result = result + "\n";
                
                boolean ifDif = false;
                for (int a = 0; a < intNums.length; a++) {
                  if (intNums[a] == speNum)
                  {
                    ifDif = true;
                    break;
                  }
                }
                int wincount = 0;
                int[] arrayOfInt1;
                int j = (arrayOfInt1 = intNums).length;
                for (int i1 = 0; i1 < j; i1++)
                {
                  int w = arrayOfInt1[i1];
                  if (winNumAL.contains(Integer.valueOf(w))) {
                    wincount++;
                  }
                }
                if (ifDif)
                  switch (wincount)
                  {
                  case 1: 
                    result = result + "對中\"特別號\"& 1 個號碼, 再接再厲!!";
                    break;
                  case 2: 
                    result = result + "對中\"特別號\"& 2 個號碼, 恭喜您獲得\"柒獎\" !";
                    break;
                  case 3: 
                    result = result + "對中\"特別號\"& 3 個號碼, 恭喜您獲得\"陸獎\" !";
                    break;
                  case 4: 
                    result = result + "對中\"特別號\"& 4 個號碼, 恭喜您獲得\"肆獎\" !";
                    break;
                  case 5: 
                    result = result + "對中\"特別號\"& 5 個號碼, 恭喜您獲得\"貳獎\" !";
                    break;
                  default: 
                    result = result + "只中\"特別號\", 再玩一次吧!!";
                    


                    break; } else {
                  switch (wincount)
                  {
                  case 1: 
                    result = result + "對中  1 個號碼, 多玩幾次吧!!";
                    break;
                  case 2: 
                    result = result + "對中  2 個號碼, 再接再厲!!";
                    break;
                  case 3: 
                    result = result + "對中  3 個號碼, 恭喜您獲得\"普獎\" !";
                    break;
                  case 4: 
                    result = result + "對中  4 個號碼, 恭喜您獲得\"伍獎\" !";
                    break;
                  case 5: 
                    result = result + "對中  5 個號碼, 恭喜您獲得\"參獎\" !";
                    break;
                  case 6: 
                    result = result + "對中  6 個號碼, 恭喜您獲得\"頭獎\" !";
                    break;
                  default: 
                    result = result + "沒有對中任何一個號碼, 繼續努力!!";
                  }
                }
                result = result + "\n";
                txtResult.setText(result);
                btn_random.setEnabled(false);
                btn_confirm.setEnabled(false);
                txt_input.setEnabled(false);
                for (int z = 0; z < btnNum.length; z++) {
                  btnNum[z].setEnabled(false);
                }
              }
            }
          }.start();
        }
      }
    });
  }
}
