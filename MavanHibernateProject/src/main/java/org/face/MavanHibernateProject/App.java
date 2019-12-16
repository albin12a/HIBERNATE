package org.face.MavanHibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

class App 
{
    public static void main( String[] args )
    {
       Display obj=new Display();
       /* Scanner sc=new Scanner(System.in);
        * int id=sc.nextInt();
        * String name=sc.next();
        * String gen=sc.next();
        * obj.setId(id);*/
       obj.setId(3);
       obj.setName("Albin Varghese");
       obj.setGender("Male");
     Configuration con=new Configuration().configure().addAnnotatedClass(Display.class);
     SessionFactory sf=con.buildSessionFactory();
     Session session=sf.openSession();
     Transaction tx=session.beginTransaction();
     session.save(obj);
     tx.commit();
    }
}
