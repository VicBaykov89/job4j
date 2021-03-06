/*
*Test.
*/
package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.calculate.Calculate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/*
*Test.
*
*@author Victor Baykov (vic.baykov89@gmail.com)
*@version $Id$
*@since 0.1
*/
public class DummyBotTest {
	/**
* Test echo.
*/
	@Test
	public void whenGreetBot() {
		DummyBot bot = new DummyBot();
		assertThat(
				bot.answer("Привет, Бот."),
				is("Привет, умник.")
		);
	}

	@Test
	public void whenByeBot() {
		DummyBot bot = new DummyBot();
		assertThat(
				bot.answer("Пока."),
				is("До скорой встречи.")
		);
	}

	@Test
	public void whenUnknownBot() {
		DummyBot bot = new DummyBot();
		assertThat(
				bot.answer("Сколько будет 2 + 2?"),
				is("Это ставит меня в тупик. Спросите другой вопрос")
		);
	}

}