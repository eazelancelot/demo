package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.transaction.Transactional;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import com.example.demo.entity.AAA;
import com.example.demo.entity.BBB;
import com.example.demo.entity.Meal;
import com.example.demo.entity.MealId;
import com.example.demo.repository.AAADao;
import com.example.demo.repository.BBBDao;
import com.example.demo.repository.MealDao;
import com.example.demo.service.ifs.MealService;

@SpringBootTest
public class MealServiceTest {

	@Autowired
	private MealService mealService;

	@Autowired
	private MealDao mealDao;

	@Autowired
	private AAADao aaaDao;
	@Autowired
	private BBBDao bbbDao;

	@Test
	public void addMeal() {
//		mealService.addMeal(new Meal("beef", "BBQ", 180));
//		mealService.addMeal(new Meal("beef", "fry", 150));
//		mealService.addMeal(new Meal("pork", "fried", 220));
//		mealService.addMeal(new Meal("chicken", "stew", 260));
//		mealService.addMeal(new Meal("chicken", "BBQ", 120));
//		mealService.addMeal(new Meal("chicken", "steam", 520));
		mealService.addMeal(new Meal("Apple", "sugar", 1520));
	}

	@Test
	public void addMealTest() {
		// name 不符條件
		Meal result = mealService.addMeal(new Meal("", "BBQ", 180));
		Assert.isTrue(result == null, "addMeal error!!");
		// cooking_style 不符
		result = mealService.addMeal(new Meal("beef", "", 180));
		Assert.isTrue(result == null, "addMeal error!!");
		// price 不符
		result = mealService.addMeal(new Meal("beef", "BBQ", 0));
		Assert.isTrue(result == null, "addMeal error!!");
		// 正常新增
		result = mealService.addMeal(new Meal("beef", "BBQ", 180));
		Assert.isTrue(result != null, "addMeal error!!");
		// 再新增已存在的 meal
		result = mealService.addMeal(new Meal("beef", "BBQ", 180));
		Assert.isTrue(result == null, "addMeal error!!");
		// 刪除測試資料
		mealDao.deleteById(new MealId("beef", "BBQ"));
	}

	@Test
	public void limitTest() {
		List<Meal> res = mealDao.findFirst2ByName("chicken");
		System.out.println(res.size());
		Assert.isTrue(res.size() == 2, "find limit error!!");
	}

	@Test
	public void orderByTest() {
//		List<Meal> res = mealDao.findByNameOrderByPrice("chicken");
//		List<Meal> res = mealDao.findAllByOrderByPrice();
		List<Meal> res = mealDao.findAllByOrderByPriceDesc();
		for (Meal item : res) {
			System.out.println(item.getName() + item.getCookingStyle() + ": " + item.getPrice());
		}
	}

	@Test
	public void compareTest() {
		List<Meal> res = mealDao.findByPriceGreaterThan(200);
		for (Meal item : res) {
			System.out.println(item.getName() + item.getCookingStyle() + ": " + item.getPrice());
		}
	}

	@Test
	public void containingTest() {
//		List<Meal> res = mealDao.findByNameContaining("e");
		List<Meal> res = mealDao.findByNameContainingAndCookingStyleContaining("e", "b");
		for (Meal item : res) {
			System.out.println(item.getName() + item.getCookingStyle() + ": " + item.getPrice());
		}
	}

	@Test
	public void betweenTest() {
		List<Meal> res = mealDao.findByPriceBetween(120, 260);
		for (Meal item : res) {
			System.out.println(item.getName() + item.getCookingStyle() + ": " + item.getPrice());
		}
	}

	@Test
	public void inTest() {
//		List<Meal> res = mealDao.findByPriceIn(new ArrayList<>(List.of(100, 120, 150, 180, 200)));
		List<Meal> res = mealDao.findByPriceNotIn(new ArrayList<>(List.of(100, 120, 150, 180, 200)));
		for (Meal item : res) {
			System.out.println(item.getName() + item.getCookingStyle() + ": " + item.getPrice());
		}
	}

	@Test
//	@Transactional
	public void aaaTest() {
		AAA res = aaaDao.saveAndFlush(new AAA("C02"));
		System.out.println(res.getId());
		int aId = aaaDao.findTopByOrderByIdDesc().getId();
		BBB b = new BBB(3, aId, "WWWW");
		bbbDao.save(b);
	}
	
	@Test
//	@Transactional
	public void aaaTest2() {
		aaaDao.save(new AAA(5, "B02"));
		BBB b = new BBB(1, 5, "AM");
		bbbDao.save(b);
	}
	
	@Test
	public void inTest2() {
		List<AAA> res = aaaDao.findByIdIn(Arrays.asList(null, -1, 0, 1, 4, 5, 9));
		System.out.println(res.size());
	}

	@Test
	public void strTest() {
//		aaaDao.save(new AAA("Q_Q", LocalDate.of(2023, 10, 1), LocalDate.of(2023, 10, 31)));
//		aaaDao.save(new AAA("Q_Q", LocalDate.of(2023, 9, 10), LocalDate.of(2023, 10, 25)));
//		aaaDao.save(new AAA("Q_Q", LocalDate.of(2023, 10, 10), LocalDate.of(2023, 10, 20)));
//		aaaDao.save(new AAA("Q_Q", LocalDate.of(2023, 11, 21), LocalDate.of(2023, 12, 25)));
		List<AAA> res = aaaDao.findByName(null);
		System.out.println(res.size());
		res = aaaDao.findByName("");
		System.out.println(res.size());
		res = aaaDao.findByName("Q_Q");
		System.out.println(res.size());
	}
	
	@Test
	public void strTest2() {
		List<AAA> res = aaaDao.findByNameContaining(null);
		System.out.println(res.size());
		res = aaaDao.findByNameContaining("");
		System.out.println(res.size());
		res = aaaDao.findByNameContaining("Q_Q");
		System.out.println(res.size());
	}
	
	@Test
	public void localDateTest() {
		LocalDate start = LocalDate.now();
		LocalDate end = LocalDate.of(2023, 12, 10);
		List<AAA> res = aaaDao.findByStartDateGreaterThanEqualAndEndDateLessThanEqual(null, null);
		System.out.println(res.size());	
		res = aaaDao.findByStartDateGreaterThanEqualAndEndDateLessThanEqual(start, null);
		System.out.println(res.size());		
//		res = aaaDao.findByStartDateGreaterThanEqual(start);
//		System.out.println(res.size());		
//		res = aaaDao.findByStartDateGreaterThanEqualAndEndDateLessThanEqual(start, end);
//		System.out.println(res.size());
	}
	
	@Test
	public void localDateTest2() {
		LocalDate start = LocalDate.of(1971, 1, 1);
		LocalDate end = LocalDate.of(2099, 12, 10);
		List<AAA> res = aaaDao.findByStartDateGreaterThanEqualAndEndDateLessThanEqual(start, end);
		System.out.println(res.size());
		res = aaaDao.findByNameAndStartDateGreaterThanAndEndDateLessThan("Q_Q", start, end);
		System.out.println(res.size());
	}
}
