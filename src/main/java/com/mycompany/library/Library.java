/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.library;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author Ashiqe
 */
public class Library {
    static String username = "book";
     static String password = "123";
    static String usernamer = "read";
     static String passwordr = "123";

    public static void main(String[] args) {
        showWelcomeFrame();
    }

    private static void showWelcomeFrame() {
        try {
        JFrame welcomeFrame = new JFrame("Library Management System");
        welcomeFrame.setSize(500, 300);
        welcomeFrame.getContentPane().setBackground(Color.YELLOW);
 welcomeFrame.setLayout(new BorderLayout());
        JLabel welcomeLabel = new JLabel("Welcome to Open Library 🙂");
        welcomeLabel.setForeground(Color.BLACK);
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 20));

        JButton startButton = new JButton("Start");
        startButton.setBackground(Color.pink);
        startButton.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                showUserSelectionFrame();
                welcomeFrame.dispose();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(startButton);

        welcomeFrame.add(welcomeLabel, BorderLayout.CENTER);
        welcomeFrame.add(buttonPanel, BorderLayout.SOUTH);
        welcomeFrame.setLocationRelativeTo(null);
        welcomeFrame.setVisible(true);
         welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         } catch (HeadlessException e) {
            System.out.println(e);
        }
    }
 

    
    private static void showUserSelectionFrame() {
        try{
        JFrame userSelectionFrame = new JFrame("User Selection");
        userSelectionFrame.setSize(300, 150);
        userSelectionFrame.setLayout(new GridLayout(2, 1));

        JButton librarianButton = new JButton("Librarian");
        librarianButton.setBackground(Color.pink);
        librarianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showLoginFrame("Librarian");
                userSelectionFrame.dispose();
            }
        });

        JButton readerButton = new JButton("Reader");
        readerButton.setBackground(Color.orange);
        readerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showLoginFrameR("Reader");
                userSelectionFrame.dispose();
            }
        });

        userSelectionFrame.add(librarianButton);
        userSelectionFrame.add(readerButton);
        userSelectionFrame.setLocationRelativeTo(null);
        userSelectionFrame.setVisible(true);
        userSelectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (HeadlessException e) {
            System.out.println(e);
        }
    }

    private static void showLoginFrame(String userType) {
       try{
           JFrame loginFrame = new JFrame("Login");
       
        loginFrame.setSize(300, 150);
        loginFrame.setLayout(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("Username:");
        JTextField userTextField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passTextField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.black);
        loginButton.setForeground(Color.white);
        loginButton.setFont(new Font("Arial", Font.BOLD, 20));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputUsername = userTextField.getText();
                String inputPassword = new String(passTextField.getPassword());

                if (inputUsername.equals(username) && inputPassword.equals(password)) {
                    if (userType.equals("Librarian")) {
                        showLibrarianFrame();
                    } 
                    loginFrame.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        loginFrame.add(userLabel);
        loginFrame.add(userTextField);
        loginFrame.add(passLabel);
        loginFrame.add(passTextField);
        loginFrame.add(new JLabel());
        loginFrame.add(loginButton);

        loginFrame.setLocationRelativeTo(null);
        loginFrame.setVisible(true);
         
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (HeadlessException e) {
            System.out.println(e);
        }
    }
   
 

    private static void showLoginFrameR(String userType) {
        try{
        JFrame loginFramer = new JFrame("Login");
      
        loginFramer.setSize(300, 150);
        loginFramer.setLayout(new GridLayout(3, 2));

        JLabel userLabel = new JLabel("Username:");
        JTextField userTextField = new JTextField();

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passTextField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.setBackground(Color.black);
        loginButton.setForeground(Color.white);
        loginButton.setFont(new Font("Arial", Font.BOLD, 20));
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputUsername = userTextField.getText();
                String inputPassword = new String(passTextField.getPassword());
    if (inputUsername.equals(usernamer) && inputPassword.equals(passwordr)) {
                    if (userType.equals("Reader")) {
                        showBookListFrameR();
                    }
                    loginFramer.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        loginFramer.add(userLabel);
        loginFramer.add(userTextField);
        loginFramer.add(passLabel);
        loginFramer.add(passTextField);
        loginFramer.add(new JLabel());
        loginFramer.add(loginButton);

        loginFramer.setLocationRelativeTo(null);
        loginFramer.setVisible(true);
          
        loginFramer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (HeadlessException e) {
            System.out.println(e);
        }
    }    
            
    private static void showLibrarianFrame() {
        try{
        JFrame librarianFrame = new JFrame("Librarian");
    
        librarianFrame.setSize(300, 150);
        librarianFrame.setLayout(new GridLayout(2, 1));

        JButton bookListButton = new JButton("Book List");
        bookListButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showBookListFrame();
                librarianFrame.dispose();
            }
        });

        JButton addBookButton = new JButton("Add Book");
        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAddBookFrame();
                librarianFrame.dispose();
            }
        });

        librarianFrame.add(bookListButton);
        librarianFrame.add(addBookButton);
        librarianFrame.setLocationRelativeTo(null);
        librarianFrame.setVisible(true);
            librarianFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            } catch (HeadlessException e) {
            System.out.println(e);
        }
    }

    private static void showBookListFrame() {
        try{
        JFrame bookListFrame = new JFrame("Book List");
        
        bookListFrame.setSize(600, 400);

        JPanel bookPanel = new JPanel();
        bookPanel.setLayout(new GridLayout(5, 1));

        JButton[] bookButtons = new JButton[5];
        String[] bookNames = {"Rich Dad Poor Dad", "Easy English Learning", "General Knowledge", "History of Bangladesh", "Fun Programming"};
       

        for (int i = 0; i < bookNames.length; i++) {
            final String bookName = bookNames[i];
            bookButtons[i] = new JButton(bookName);
            bookButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "You selected: " + bookName, "Book Selected", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            bookPanel.add(bookButtons[i]);
        }

        JScrollPane scrollPane = new JScrollPane(bookPanel);
        bookListFrame.add(scrollPane);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 showLibrarianFrame();
                bookListFrame.dispose();
            }
        });

        bookListFrame.add(backButton, BorderLayout.SOUTH);
        bookListFrame.setLocationRelativeTo(null);
        bookListFrame.setVisible(true);
        bookListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (HeadlessException e) {
            System.out.println(e);
        }
    }
    

    private static void showAddBookFrame() {
        try{
        JFrame addBookFrame = new JFrame("Add Book");
        
        addBookFrame.setSize(400, 200);
        addBookFrame.setLayout(new GridLayout(4, 2));

        JLabel nameLabel = new JLabel("Book Name:");
        JTextField nameTextField = new JTextField();

        JLabel authorLabel = new JLabel("Author:");
        JTextField authorTextField = new JTextField();

        JLabel linkLabel = new JLabel("Drive Link:");
        JTextField linkTextField = new JTextField();

        JButton addButton = new JButton("Add Book");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bookName = nameTextField.getText();
                String author = authorTextField.getText();
                String link = linkTextField.getText();
                // Assuming adding book functionality here
                JOptionPane.showMessageDialog(null, "Book added successfully!\nName: " + bookName + "\nAuthor: " + author + "\nLink: " + link, "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
               showLibrarianFrame();
                addBookFrame.dispose();
            }
        });

        addBookFrame.add(nameLabel);
        addBookFrame.add(nameTextField);
        addBookFrame.add(authorLabel);
        addBookFrame.add(authorTextField);
        addBookFrame.add(linkLabel);
        addBookFrame.add(linkTextField);
        addBookFrame.add(addButton);
        addBookFrame.add(backButton);
        addBookFrame.setLocationRelativeTo(null);
        addBookFrame.setVisible(true);
        addBookFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (HeadlessException e) {
            System.out.println(e);
        }
    }
     private static void showBookListFrameR() {
         try{
        JFrame bookListFrame = new JFrame("Book List");
        
        bookListFrame.setSize(600, 400);

        JPanel bookPanel = new JPanel();
        bookPanel.setLayout(new GridLayout(5, 1));

        JButton[] bookButtons = new JButton[5];
        String[] bookNames = {"Rich Dad Poor Dad", "Easy English Learning", "General Knowledge", "History of Bangladesh", "Fun Programming"};

        for (int i = 0; i < bookNames.length; i++) {
            final String bookName = bookNames[i];
            bookButtons[i] = new JButton(bookName);
            bookButtons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "You selected: " + bookName, "Book Selected", JOptionPane.INFORMATION_MESSAGE);
                }
            });
            bookPanel.add(bookButtons[i]);
        }

        JScrollPane scrollPane = new JScrollPane(bookPanel);
        bookListFrame.add(scrollPane);

        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 showUserSelectionFrame();
                bookListFrame.dispose();
            }
        });

        bookListFrame.add(backButton, BorderLayout.SOUTH);
        bookListFrame.setLocationRelativeTo(null);
        bookListFrame.setVisible(true);
        bookListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (HeadlessException e) {
            System.out.println(e);
        }
    }

   }






