package guru.springframework.repositories;

import java.util.Optional;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import guru.springframework.domain.UnitOfMeasure;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UnitOfMeasureRepositoryIT {
	
	@Autowired
	UnitOfMeasureRepository unitOfMeasure;

	@Test
	public void test() {
		Optional<UnitOfMeasure> result = unitOfMeasure.findByDescription("Teaspoon");
		Assert.assertEquals("Teaspoon", result.get().getDescription());
	}

}
