import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PersonalDetailsDemo {
   private JFrame mainFrame;
   private JPanel headerPanel;
   private JPanel detailsPanel;
   private JTextArea detailsArea;
   private JButton submitButton;

   public PersonalDetailsDemo(){
      prepareGUI();
   }

   public static void main(String[] args){
      PersonalDetailsDemo personalDetailsDemo = new PersonalDetailsDemo();  
      personalDetailsDemo.showPersonalDetails();       
   }

   private void prepareGUI(){
      mainFrame = new JFrame("Personal Details");
      mainFrame.setSize(600,400);
      mainFrame.setLayout(new BorderLayout());

      headerPanel = new JPanel();
      headerPanel.setBackground(new Color(102, 178, 255));
      JLabel headerLabel = new JLabel("Your Personal Details");
      headerLabel.setFont(new Font("Arial", Font.BOLD, 20));
      headerPanel.add(headerLabel);
      mainFrame.add(headerPanel, BorderLayout.NORTH);

      detailsPanel = new JPanel();
      detailsPanel.setLayout(new GridLayout(11, 2, 10, 10));
      mainFrame.add(detailsPanel, BorderLayout.CENTER);

      detailsArea = new JTextArea(10, 30);
      detailsArea.setEditable(false);
      detailsArea.setFont(new Font("Arial", Font.PLAIN, 14));
      JScrollPane scrollPane = new JScrollPane(detailsArea);
      mainFrame.add(scrollPane, BorderLayout.EAST);

      mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }

   private void showPersonalDetails(){
      String[] labelsText = {
         "Hometown:", "Passion:", "Hobbies:", "Field of Interest:",
         "Father's Name:", "Father's Occupation:", "Father's Annual Income:",
         "Mother's Name:", "Mother's Occupation:", "Mother's Annual Income:"
      };

      JLabel[] labels = new JLabel[labelsText.length];
      JTextField[] textFields = new JTextField[labelsText.length];

      for (int i = 0; i < labelsText.length; i++) {
         labels[i] = new JLabel(labelsText[i]);
         labels[i].setFont(new Font("Arial", Font.PLAIN, 14));
         textFields[i] = new JTextField(20);
         textFields[i].setFont(new Font("Arial", Font.PLAIN, 14));
         detailsPanel.add(labels[i]);
         detailsPanel.add(textFields[i]);
      }

      submitButton = new JButton("Submit");
      submitButton.setFont(new Font("Arial", Font.BOLD, 16));
      submitButton.setForeground(Color.WHITE);
      submitButton.setBackground(new Color(0, 102, 0));
      submitButton.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            StringBuilder details = new StringBuilder();
            for (int i = 0; i < labels.length; i++) {
               details.append(labels[i].getText()).append(" ").append(textFields[i].getText()).append("\n");
            }
            detailsArea.setText(details.toString());
         }
      });

      JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
      buttonPanel.add(submitButton);
      mainFrame.add(buttonPanel, BorderLayout.SOUTH);

      mainFrame.setVisible(true);
   }
}
