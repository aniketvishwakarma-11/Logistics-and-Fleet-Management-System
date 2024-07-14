import javax.swing.*;
import java.awt.*;

public class LogisticsFleetManagementUI {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Logistics and Fleet Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Header
        JLabel headerLabel = new JLabel("Logistics and Fleet Management", SwingConstants.CENTER);
        headerLabel.setOpaque(true);
        headerLabel.setBackground(new Color(70, 130, 180)); // Set header background color
        headerLabel.setForeground(Color.WHITE); // Set header text color
        headerLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        frame.add(headerLabel, BorderLayout.NORTH);

        // Navigation Panel
        JPanel navPanel = new JPanel();
        navPanel.setLayout(new GridLayout(4, 1));
        navPanel.setBackground(new Color(230, 230, 250)); // Set navigation panel background color

        JButton vehiclesButton = new JButton("Vehicles");
        JButton routesButton = new JButton("Routes");
        JButton driversButton = new JButton("Drivers");
        JButton shipmentsButton = new JButton("Shipments");

        navPanel.add(vehiclesButton);
        navPanel.add(routesButton);
        navPanel.add(driversButton);
        navPanel.add(shipmentsButton);

        frame.add(navPanel, BorderLayout.WEST);

        // Main Content Area
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        contentPanel.setBackground(Color.WHITE); // Set content panel background color

        JLabel contentLabel = new JLabel("Select an option from the left", SwingConstants.CENTER);
        contentLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
        contentPanel.add(contentLabel, BorderLayout.CENTER);

        frame.add(contentPanel, BorderLayout.CENTER);

        // Footer
        JLabel footerLabel = new JLabel("Status: Ready", SwingConstants.CENTER);
        footerLabel.setOpaque(true);
        footerLabel.setBackground(new Color(70, 130, 180)); // Set footer background color
        footerLabel.setForeground(Color.WHITE); // Set footer text color
        footerLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));
        frame.add(footerLabel, BorderLayout.SOUTH);

        // Show the frame
        frame.setVisible(true);
    }
}
