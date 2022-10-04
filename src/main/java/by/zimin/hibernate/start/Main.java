package by.zimin.hibernate.start;

import by.zimin.hibernate.entity.Categories;
import by.zimin.hibernate.entity.Products;
import by.zimin.hibernate.entity.Users;
import by.zimin.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        Products product1 = new Products();
        product1.setId(4L);
        product1.setPrice(new BigDecimal(2.0));
        product1.setTitle("kivi");

        Users u1 = new Users();

        u1.setRole("ADMIN");
        u1.setPassword("9999");
        u1.setEmail("artikris50@gmail.com");
        u1.setName("Artur Zimin");
        u1.setArchive(null);
        u1.setBucketId(null);


        Categories categories=new Categories();
        categories.setId(2L);
        categories.setTitle("fruits");

        session.save(categories);
        session.getTransaction().commit();


        session.close();
        HibernateUtil.close();
    }
}
