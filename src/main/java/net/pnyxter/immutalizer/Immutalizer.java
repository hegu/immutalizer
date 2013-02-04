package net.pnyxter.immutalizer;

public class Immutalizer {
	private Immutalizer() {
		// Static helper
	}

	public static <T> T ensureImmutable(Class<T> requiredType, T object) {
		return object;
	}

}
