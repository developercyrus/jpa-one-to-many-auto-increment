package foo.bar.client;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import foo.bar.entity.Level1;
import foo.bar.entity.Level2;
import foo.bar.entity.Level3;

public class Main {
	public static void main(String[] args) {
		Level1 level1 = getEntity();
		
		EntityManagerFactory sesionFactory = Persistence.createEntityManagerFactory("foo.bar.jpa");
		EntityManager entityManager = sesionFactory.createEntityManager();
		entityManager.getTransaction().begin();		

		entityManager.persist(level1);		
		List<Level2> level2s = level1.getLevel2s();
		for (Level2 level2 : level2s) {
			level2.setLevel1(level1);
			entityManager.persist(level2);
			
			List<Level3> level3s = level2.getLevel3s(); 
			for (Level3 level3 : level3s) {
				level3.setLevel2(level2);
				entityManager.persist(level3);
			}
		}	
				
		entityManager.getTransaction().commit();
	}
	
	public static Level1 getEntity() {
		Level3 level3_1_1 = new Level3("3.1.1");
		Level3 level3_1_2 = new Level3("3.1.2");
		Level3 level3_2_1 = new Level3("3.2.1");
		Level3 level3_2_2 = new Level3("3.2.2");
		Level2 level2_1 = new Level2("2.1");
		Level2 level2_2 = new Level2("2.2");
		Level1 level1 = new Level1("1");

		List<Level3> level3_1s = Arrays.asList(level3_1_1, level3_1_2);
		List<Level3> level3_2s = Arrays.asList(level3_2_1, level3_2_2);
		level2_1.setLevel2s(level3_1s);
		level2_2.setLevel2s(level3_2s);
		
		List<Level2> level2s = Arrays.asList(level2_1, level2_2);
		level1.setLevel2s(level2s);
		
		return level1;
	}
}
