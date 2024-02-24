 import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.UIManager.LookAndFeelInfo;

public class Encrpting_form extends JFrame {
   Random random = new Random();
   private JLabel display;
   private JButton jButton1;
   private JButton jButton2;
   private JButton jButton3;
   private JScrollPane jScrollPane1;
   private JTextArea massage;

   public void encryption_setter(String enc1, String enc2, String enc3) {
      int randomNumber = this.random.nextInt(3) + 1;
      JLabel var10000;
      String var10001;
      if (randomNumber == 1) {
         var10000 = this.display;
         var10001 = this.display.getText();
         var10000.setText(var10001 + enc1);
      }

      if (randomNumber == 2) {
         var10000 = this.display;
         var10001 = this.display.getText();
         var10000.setText(var10001 + enc2);
      }

      if (randomNumber == 3) {
         var10000 = this.display;
         var10001 = this.display.getText();
         var10000.setText(var10001 + enc3);
      }

   }

   public void decryptlabelsetter(String value) {
      JLabel var10000 = this.display;
      String var10001 = this.display.getText();
      var10000.setText(var10001 + value);
   }

   public void Decrypting_Algorithm(String number) {
      if (number.equals("!") || number.equals("*!") || number.equals("#$@%$#")) {
         this.decryptlabelsetter("a");
      }

      if (number.equals("*") || number.equals("%$!") || number.equals("!@#$@")) {
         this.decryptlabelsetter("b");
      }

      if (number.equals("#") || number.equals("!@#") || number.equals("$#$#$!@")) {
         this.decryptlabelsetter("c");
      }

      if (number.equals("+") || number.equals("&*#") || number.equals("!@#@!&")) {
         this.decryptlabelsetter("d");
      }

      if (number.equals("@") || number.equals("&&$") || number.equals("*&*&%^#")) {
         this.decryptlabelsetter("e");
      }

      if (number.equals("$") || number.equals("%^#") || number.equals("$%$%^%&")) {
         this.decryptlabelsetter("f");
      }

      if (number.equals("^") || number.equals("##@") || number.equals("><&^$")) {
         this.decryptlabelsetter("g");
      }

      if (number.equals("&") || number.equals("^^&") || number.equals("*!>&^")) {
         this.decryptlabelsetter("h");
      }

      if (number.equals("`") || number.equals("!!*") || number.equals("<>>^%$")) {
         this.decryptlabelsetter("i");
      }

      if (number.equals("~") || number.equals("$$^") || number.equals("<:^%$")) {
         this.decryptlabelsetter("j");
      }

      if (number.equals("$$$:") || number.equals("%%!@") || number.equals(">^%%<&^")) {
         this.decryptlabelsetter("k");
      }

      if (number.equals("'") || number.equals("##$@") || number.equals("@#!<,")) {
         this.decryptlabelsetter("l");
      }

      if (number.equals(";") || number.equals("%#&*") || number.equals("$#@###%$")) {
         this.decryptlabelsetter("m");
      }

      if (number.equals(":") || number.equals("%##$") || number.equals("&&::&")) {
         this.decryptlabelsetter("n");
      }

      if (number.equals("/") || number.equals("!!@%") || number.equals("::^^:@")) {
         this.decryptlabelsetter("o");
      }

      if (number.equals("?") || number.equals("#**^") || number.equals(":##$:%:%")) {
         this.decryptlabelsetter("p");
      }

      if (number.equals(">") || number.equals("^^%*") || number.equals("::&&$:#")) {
         this.decryptlabelsetter("q");
      }

      if (number.equals("<") || number.equals("@@#*") || number.equals("##<<>>&")) {
         this.decryptlabelsetter("r");
      }

      if (number.equals(":>>$:") || number.equals("@*#!") || number.equals(":<><>:^^&")) {
         this.decryptlabelsetter("s");
      }

      if (number.equals("=") || number.equals("$$!!%") || number.equals("<>>>:&&&")) {
         this.decryptlabelsetter("t");
      }

      if (number.equals("|") || number.equals("##*$$") || number.equals("<>>:::<#")) {
         this.decryptlabelsetter("u");
      }

      if (number.equals("%%") || number.equals("##@^%") || number.equals("&***&&^>>")) {
         this.decryptlabelsetter("v");
      }

      if (number.equals("$$") || number.equals("@@##!%") || number.equals(">>$$#@<>*^")) {
         this.decryptlabelsetter("w");
      }

      if (number.equals("@#") || number.equals("##*%^") || number.equals("^^^%<<!!")) {
         this.decryptlabelsetter("x");
      }

      if (number.equals("*&") || number.equals("@@!^%&") || number.equals("##>$$><><%%")) {
         this.decryptlabelsetter("y");
      }

      if (number.equals("!@") || number.equals("@#!$%#") || number.equals("!!!~!@!~")) {
         this.decryptlabelsetter("z");
      }

      if (number.equals("!&&<~~!@") || number.equals("@#!~~!~~$%#") || number.equals("!!>>~~!~!@!~")) {
         this.decryptlabelsetter(".");
      }

      if (number.equals("!&&>~~<~~!@") || number.equals("@#!~~<<^%^%%#") || number.equals("!!>>~$%@@!@!~")) {
         this.decryptlabelsetter(",");
      }

   }

   public void Encrypting_Algorithm_1(char alphabet) {
      if (alphabet == ' ') {
         this.display.setText(this.display.getText() + " ");
      }

      if (alphabet == 'a' || alphabet == 'A') {
         this.encryption_setter("!", "*!", "#$@%$#");
      }

      if (alphabet == 'b' || alphabet == 'B') {
         this.encryption_setter("*", "%$!", "!@#$@");
      }

      if (alphabet == 'c' || alphabet == 'C') {
         this.encryption_setter("#", "!@#", "$#$#$!@");
      }

      if (alphabet == 'd' || alphabet == 'D') {
         this.encryption_setter("+", "&*#", "!@#@!&");
      }

      if (alphabet == 'e' || alphabet == 'E') {
         this.encryption_setter("@", "&&$", "*&*&%^#");
      }

      if (alphabet == 'f' || alphabet == 'F') {
         this.encryption_setter("$", "%^#", "$%$%^%&");
      }

      if (alphabet == 'g' || alphabet == 'G') {
         this.encryption_setter("^", "##@", "><&^$");
      }

      if (alphabet == 'h' || alphabet == 'H') {
         this.encryption_setter("&", "^^&", "*!>&^");
      }

      if (alphabet == 'i' || alphabet == 'I') {
         this.encryption_setter("`", "!!*", "<>>^%$");
      }

      if (alphabet == 'j' || alphabet == 'J') {
         this.encryption_setter("~", "$$^", "<:^%$");
      }

      if (alphabet == 'k' || alphabet == 'K') {
         this.encryption_setter("$$$:", "%%!@", ">^%%<&^");
      }

      if (alphabet == 'l' || alphabet == 'L') {
         this.encryption_setter("'", "##$@", "@#!<,");
      }

      if (alphabet == 'm' || alphabet == 'M') {
         this.encryption_setter(";", "%#&*", "$#@###%$");
      }

      if (alphabet == 'n' || alphabet == 'N') {
         this.encryption_setter(":", "%##$", "&&::&");
      }

      if (alphabet == 'o' || alphabet == 'O') {
         this.encryption_setter("/", "!!@%", "::^^:@");
      }

      if (alphabet == 'p' || alphabet == 'P') {
         this.encryption_setter("?", "#**^", ":##$:%:%");
      }

      if (alphabet == 'q' || alphabet == 'Q') {
         this.encryption_setter(">", "^^%*", "::&&$:#");
      }

      if (alphabet == 'r' || alphabet == 'R') {
         this.encryption_setter("<", "@@#*", "##<<>>&");
      }

      if (alphabet == 's' || alphabet == 'S') {
         this.encryption_setter(":>>$:", "@*#!", ":<><>:^^&");
      }

      if (alphabet == 't' || alphabet == 'T') {
         this.encryption_setter("=", "$$!!%", "<>>>:&&&");
      }

      if (alphabet == 'u' || alphabet == 'U') {
         this.encryption_setter("|", "##*$$", "<>>:::<#");
      }

      if (alphabet == 'v' || alphabet == 'V') {
         this.encryption_setter("%%", "##@^%", "&***&&^>>");
      }

      if (alphabet == 'w' || alphabet == 'W') {
         this.encryption_setter("$$", "@@##!%", ">>$$#@<>*^");
      }

      if (alphabet == 'x' || alphabet == 'X') {
         this.encryption_setter("@#", "##*%^", "^^^%<<!!");
      }

      if (alphabet == 'y' || alphabet == 'Y') {
         this.encryption_setter("*&", "@@!^%&", "##>$$><><%%");
      }

      if (alphabet == 'z' || alphabet == 'Z') {
         this.encryption_setter("!@", "@#!$%#", "!!!~!@!~");
      }

      if (alphabet == '.') {
         this.encryption_setter("!&&<~~!@", "@#!~~!~~$%#", "!!>>~~!~!@!~");
      }

      if (alphabet == ',') {
         this.encryption_setter("!&&>~~<~~!@", "@#!~~<<^%^%%#", "!!>>~$%@@!@!~");
      }

   }

   public Encrpting_form() {
      this.initComponents();
   }

   private void initComponents() {
      this.jScrollPane1 = new JScrollPane();
      this.massage = new JTextArea();
      this.jButton1 = new JButton();
      this.jButton2 = new JButton();
      this.jButton3 = new JButton();
      this.display = new JLabel();
      this.setDefaultCloseOperation(3);
      this.massage.setColumns(20);
      this.massage.setRows(5);
      this.jScrollPane1.setViewportView(this.massage);
      this.jButton1.setText("Encrypt");
      this.jButton1.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Encrpting_form.this.jButton1ActionPerformed(evt);
         }
      });
      this.jButton2.setText("Decrypt");
      this.jButton2.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Encrpting_form.this.jButton2ActionPerformed(evt);
         }
      });
      this.jButton3.setText("Copy to clipboard");
      this.jButton3.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
            Encrpting_form.this.jButton3ActionPerformed(evt);
         }
      });
      GroupLayout layout = new GroupLayout(this.getContentPane());
      this.getContentPane().setLayout(layout);
      layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(34, 34, 34).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.display, -1, -1, 32767).addComponent(this.jButton3, -2, 136, -2).addGroup(layout.createSequentialGroup().addComponent(this.jButton1, -2, 132, -2).addGap(56, 56, 56).addComponent(this.jButton2, -2, 132, -2)).addComponent(this.jScrollPane1, -1, 412, 32767)).addContainerGap(68, 32767)));
      layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(54, 54, 54).addComponent(this.jScrollPane1, -2, 118, -2).addGap(18, 18, 18).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jButton1, -2, 36, -2).addComponent(this.jButton2, -2, 36, -2)).addGap(18, 18, 18).addComponent(this.display, -2, 156, -2).addGap(18, 18, 18).addComponent(this.jButton3, -2, 37, -2).addContainerGap(19, 32767)));
      this.pack();
   }

   private void jButton1ActionPerformed(ActionEvent evt) {
      this.display.setText("");
      String Full_Massage = this.massage.getText();
      int no_ofChars = Full_Massage.length();
      char[] letters = new char[no_ofChars];
      Full_Massage.getChars(0, no_ofChars, letters, 0);

      for(int i = 0; i < no_ofChars; ++i) {
         this.Encrypting_Algorithm_1(letters[i]);
         if (i != no_ofChars - 1 && letters[i + 1] != ' ' && letters[i] != ' ') {
            this.display.setText(this.display.getText() + "-");
         }
      }

      this.massage.setText("");
   }

   private void jButton2ActionPerformed(ActionEvent evt) {
      this.display.setText(" ");
      String Encrypted_Massage = this.massage.getText();
      String[] All_Words = Encrypted_Massage.split(" ");
      int totalwords = All_Words.length;

      for(int i = 0; i < totalwords; ++i) {
         String word = All_Words[i];
         String[] SingleAlphabet = word.split("-");
         int singlelength = SingleAlphabet.length;

         for(int j = 0; j < singlelength; ++j) {
            this.Decrypting_Algorithm(SingleAlphabet[j]);
         }

         this.decryptlabelsetter(" ");
      }

      this.massage.setText("");
   }

   private void jButton3ActionPerformed(ActionEvent evt) {
      String output = this.display.getText();
      StringSelection stringSelection = new StringSelection(output);
      Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
      clipboard.setContents(stringSelection, (ClipboardOwner)null);
   }

   public static void main(String[] args) {
      try {
         LookAndFeelInfo[] var1 = UIManager.getInstalledLookAndFeels();
         int var2 = var1.length;

         for(int var3 = 0; var3 < var2; ++var3) {
            LookAndFeelInfo info = var1[var3];
            if ("Nimbus".equals(info.getName())) {
               UIManager.setLookAndFeel(info.getClassName());
               break;
            }
         }
      } catch (ClassNotFoundException var5) {
         Logger.getLogger(Encrpting_form.class.getName()).log(Level.SEVERE, (String)null, var5);
      } catch (InstantiationException var6) {
         Logger.getLogger(Encrpting_form.class.getName()).log(Level.SEVERE, (String)null, var6);
      } catch (IllegalAccessException var7) {
         Logger.getLogger(Encrpting_form.class.getName()).log(Level.SEVERE, (String)null, var7);
      } catch (UnsupportedLookAndFeelException var8) {
         Logger.getLogger(Encrpting_form.class.getName()).log(Level.SEVERE, (String)null, var8);
      }

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            (new Encrpting_form()).setVisible(true);
         }
      });
   }
}
    