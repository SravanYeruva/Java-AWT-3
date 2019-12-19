import java.awt.*;  
class first{  
first(){  
Frame f = new Frame();  
Button b = new Button("click me"); 
b.setBounds(300,300,800,350);  
f.add(b);  
f.setSize(450,450);  
f.setLayout(null);  
f.setVisible(true);  
}  
public static void main(String args[]){  
first f = new first();  
}
} 
