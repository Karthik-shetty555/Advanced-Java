/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mcacnj
 */
import java.io.*;
import java.sql.*;

public class Sample {

    private static void viewRecord() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Sample s=new Sample();
    static Connection con=null;
    static ResultSet rs=null;
    static Statement pt=null;
    static void DbConnection()
    {
        try
        {
            System.out.println("inside try");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("inside try aftre class.forname");
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/students","karthik","123");
            System.out.println("inside try after getconnection");
            pt=(Statement) con.createStatement();
        }
        catch(ClassNotFoundException e1)
        {
            System.out.println("error"+e1.getMessage());
        }
        catch(SQLException e2)
        {
            System.out.println(e2.getMessage());
        }
    }static void InsertRecord()throws IOException,SQLException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter USN");
        String s1=br.readLine();
        System.out.println("Enter Name");
        String s2=br.readLine();
        System.out.println("Enter sem");
        String s3=br.readLine();
        System.out.println("Enter age");
        int s4=Integer.parseInt(br.readLine());
     pt.executeUpdate("insert into KARTHIK.STUD values('"+s1+"','"+s2+"','"+s3+"',"+s4+")");
        System.out.println("record added");
               
               }
    static void DeleteRecord()throws IOException,SQLException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Sample.ViewRecord();
        System.out.println("Enter the USN to delete");
        String s1=br.readLine();
        int a=pt.executeUpdate("delete from KARTHIK.STUD where USN='"+s1+"'");
        if(a>0)
            System.out.println("Record Deleted");
        else
            System.out.println("USN not found");
    }
    static void UpdateRecord() throws SQLException
    {
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            
            Sample.ViewRecord();
            
            System.out.println("Enter the USN to Update");
            String s1=br.readLine();
            System.out.println("Enter the name");
            String s2=br.readLine();
            System.out.println("Enter the sem");
            String s3=br.readLine();
            System.out.println("Enter the age");
            int s4=Integer.parseInt(br.readLine());
            
            int executeUpdate = pt.executeUpdate("Update KARTHIK.STUD SET NAME='"+s2+"',SEM='"+s3+"',AGE="+s4+" where USN='"+s1+"'");
if(executeUpdate>0)
    System.out.println("Record updated");
else
    System.out.println("Record not updated");
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    static void ViewRecord()throws IOException,SQLException
    {
    rs=pt.executeQuery("select * from KARTHIK.STUD");
    Boolean t=rs.next();
    if(!t)
        System.out.println("No records");
    else{
        System.out.println("USN NAME SEMESTER AGE");
        do
        {
            System.out.println(""+rs.getString(1)+"..."+rs.getString(2)+"..."+rs.getString(3)+"..."+rs.getString(4));
    }while(rs.next());
        }
    }
    public static void main(String [] args)
    {
        try
        {
            DbConnection();
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            while(true)
            {
              System.out.println("1.Insert Record");
              System.out.println("2.delete Record");
              System.out.println("3.View Record");
              System.out.println("4.update Record");
              System.out.println("5.Exit");
              System.out.println("6.Enter your choice");
              int ch=Integer.parseInt(br.readLine());
              switch(ch)
              {
                  case 1:InsertRecord();
                  break;
                  case 2:DeleteRecord();
                  break;
                  case 3:ViewRecord();
                  break;
                  case 4:UpdateRecord();
                  break;
                  case 5:System.exit(0);
                  default:break;
              }
            }
        }catch(Exception e)
        {
           System.out.println(e.getMessage());
        }
    }

    public Sample() {
        this.s = new Sample();
    }
}
