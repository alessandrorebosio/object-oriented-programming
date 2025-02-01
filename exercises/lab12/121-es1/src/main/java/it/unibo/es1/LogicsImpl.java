package it.unibo.es1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class LogicsImpl implements Logics {

	private final int[] array;

	public LogicsImpl(final int size) {
		this.array = new int[size];
		for (int i = 0; i < array.length; i++) {
			array[i] = i;
		}
	}

	@Override
	public int size() {
		return this.array.length;
	}

	@Override
	public List<Integer> values() {
		return Arrays.stream(array)
				.boxed()
				.collect(Collectors.toList());
	}

	@Override
	public List<Boolean> enablings() {
		return Arrays.stream(array)
				.mapToObj(i -> i < array.length)
				.collect(Collectors.toList());
	}

	@Override
	public int hit(final int elem) {
		return ++this.array[elem];
	}

	@Override
	public String result() {
		return "<<" + Arrays.stream(array)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining("|")) + ">>";
	}

	@Override
	public boolean toQuit() {
		return Arrays.stream(array).allMatch(i -> i >= array.length);
	}
}
