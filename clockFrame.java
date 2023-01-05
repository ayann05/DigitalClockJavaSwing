import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class clockFrame extends JFrame {

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;


    clockFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Clock");
        setLayout(new FlowLayout());
        setSize(400,250);
        setBackground(Color.darkGray);
        setResizable(false);





        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        dayFormat = new SimpleDateFormat("EEEE");
        dateFormat = new SimpleDateFormat("MMMM dd  yyyy");

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Bookman Old Style",Font.ITALIC,45));
        timeLabel.setForeground(Color.red);
        timeLabel.setBackground(Color.darkGray);
//        timeLabel.setOpaque(true);

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Bookman Old Style",Font.ITALIC,30));
        dayLabel.setForeground(Color.red);
        dayLabel.setBackground(Color.darkGray);
//        dayLabel.setOpaque(true);

        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Bookman Old Style",Font.ITALIC,30));
        dateLabel.setForeground(Color.red);
        dateLabel.setBackground(Color.darkGray);
//        dateLabel.setOpaque(true);

        add(timeLabel);
        add(dayLabel);
        add(dateLabel);

        setVisible(true);
        time();



    }

    public void time() {
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);


            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
