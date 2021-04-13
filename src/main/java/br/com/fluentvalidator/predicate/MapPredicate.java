package br.com.fluentvalidator.predicate;

import static br.com.fluentvalidator.predicate.ComparablePredicate.between;
import static br.com.fluentvalidator.predicate.ComparablePredicate.betweenInclusive;
import static br.com.fluentvalidator.predicate.ComparablePredicate.equalTo;
import static br.com.fluentvalidator.predicate.LogicalPredicate.is;
import static br.com.fluentvalidator.predicate.LogicalPredicate.not;
import static br.com.fluentvalidator.predicate.ObjectPredicate.nullValue;

import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public final class MapPredicate {

  private MapPredicate() {
    super();
  }
  
  public static <K, V, T extends Map<K, V>> Predicate<T> containsKey(final K key) {
    return PredicateBuilder.<T>from(is(nullValue()))
      .and(obj -> obj.containsKey(key));
  }

  public static <K, V, T extends Map<K, V>> Predicate<T> containsKey(final Function<T, K> key) {
    return PredicateBuilder.<T>from(is(nullValue()))
      .and(obj -> obj.containsKey(key));
  }
  
  public static <K, V, T extends Map<K, V>> Predicate<T> containsValue(final V value) {
    return PredicateBuilder.<T>from(is(nullValue()))
      .and(obj -> obj.containsValue(value));
  }
  
  public static <K, V, T extends Map<K, V>> Predicate<T> containsValue(final Function<T, V> value) {
    return PredicateBuilder.<T>from(is(nullValue()))
      .and(obj -> obj.containsValue(value));
  }

  public static <K, V, T extends Map<K, V>> Predicate<T> empty() {
    return PredicateBuilder.<T>from(is(nullValue()))
      .or(Map::isEmpty);
  }

  public static <K, V, T> Predicate<T> empty(final Function<T, Map<K, V>> source) {
    return PredicateBuilder.<T>from(is(nullValue()))
      .or(obj -> is(nullValue()).test(source.apply(obj)))
      .or(obj -> source.apply(obj).isEmpty());
  }

  public static <T, K, V> Predicate<T> hasSize(final Function<T, Map<K, V>> source, final Function<T, Integer> size) {
    return PredicateBuilder.<T>from(not(nullValue()))
      .and(obj -> not(nullValue(size)).test(obj))
      .and(obj -> not(nullValue(source)).test(obj))
      .and(obj -> equalTo(size.apply(obj)).test(source.apply(obj).size()));
  }

  public static <K, V, T> Predicate<T> hasSize(final Function<T, Map<K, V>> source, final Integer size) {
    return PredicateBuilder.<T>from(not(nullValue()))
      .and(obj -> not(nullValue(source)).test(obj))
      .and(obj -> equalTo(size).test(source.apply(obj).size()));
  }

  public static <K, V, T extends Map<K, V>> Predicate<T> hasSize(final Integer size) {
    return PredicateBuilder.<T>from(not(nullValue()))
      .and(obj -> equalTo(size).test(obj.size()));
  }

  public static <K, V, T> Predicate<T> hasSizeBetween(final Function<T, Map<K, V>> source, final Integer min, final Integer max) {
    return PredicateBuilder.<T>from(not(nullValue()))
      .and(obj -> not(nullValue(source)).test(obj))
      .and(obj -> between(min, max).test(source.apply(obj).size()));
  }

  public static <K, V, T extends Map<K, V>> Predicate<T> hasSizeBetween(final Integer min, final Integer max) {
    return PredicateBuilder.<T>from(not(nullValue()))
      .and(between(Map::size, min, max));
  }

  public static <K, V, T> Predicate<T> hasSizeBetweenInclusive(final Function<T, Map<K, V>> source, final Integer min, final Integer max) {
    return PredicateBuilder.<T>from(not(nullValue()))
      .and(obj -> not(nullValue(source)).test(obj))
      .and(obj -> betweenInclusive(min, max).test(source.apply(obj).size()));
  }

  public static <K, V, T extends Map<K, V>> Predicate<T> hasSizeBetweenInclusive(final Integer min, final Integer max) {
    return PredicateBuilder.<T>from(not(nullValue()))
      .and(betweenInclusive(Map::size, min, max));
  }


}
