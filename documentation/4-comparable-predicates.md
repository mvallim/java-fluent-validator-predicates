# 4. Comparable Predicates
Predicates located under `br.com.fluentvalidator.predicate.ComparablePredicate` class.


+ [between](#between)
+ [betweenInclusive](#betweenInclusive)
+ [equalTo](#equalTo)
+ [greaterThan](#greaterThan)
+ [greaterThanOrEqual](#greaterThanOrEqual)
+ [lessThan](#lessThan)
+ [lessThanOrEqual](#lessThanOrEqual)


## between
Used to validate if a given `Comparable` value is `between` two values.

```java
between(final E min, final E max)
```

```java
between(final E min, final Function<T, E> max)
```

```java
between(final Function<T, E> min, final E max)
```

```java
between(final Function<T, E> min, final Function<T, E> max)
```

```java
between(final Function<T, E> source, final E min, final E max)
```

```java
between(final Function<T, E> source, final E min, final Function<T, E> max)
```

```java
between(final Function<T, E> source, final Function<T, E> min, final E max)
```

```java
between(final Function<T, E> source, final Function<T, E> min, final Function<T, E> max)
```


## betweenInclusive
Used to validate if a given `Comparable` value is `between (inclusive)` two values.

```java
betweenInclusive(final E min, final E max)
```

```java
betweenInclusive(final E min, final Function<T, E>  max)
```

```java
betweenInclusive(final Function<T, E>  min, final E max)
```

```java
betweenInclusive(final Function<T, E>  min, final Function<T, E> max)
```

```java
betweenInclusive(final Function<T, E> source, final E min, final E max)
```

```java
betweenInclusive(final Function<T, E> source, final E min, final Function<T, E> max)
```

```java
betweenInclusive(final Function<T, E> source, final Function<T, E> min, final E max)
```

```java
betweenInclusive(final Function<T, E> source, final Function<T, E> min, final Function<T, E> max)
```


## equalTo
Used to validate if two `Comparables` are `equal`.

```java
equalTo(final E value)
```

```java
equalTo(final Function<T, E> source, final E value)
```

```java
equalTo(final Function<T, E> source, final Function<T, E> target)
```


## greaterThan
Used to validate if a given `Comparable` value is `greater than` another `Comparable`.

```java
greaterThan(final E min)
```

```java
greaterThan(final Function<T, E> source, final E min)
```

```java
greaterThan(final Function<T, E> source, final Function<T, E> target)
```


## greaterThanOrEqual
Used to validate if a given `Comparable` value is `greater than or equal` another `Comparable`.

```java
greaterThanOrEqual(final E min)
```

```java
greaterThanOrEqual(final Function<T, E> source, final E min)
```

```java
greaterThanOrEqual(final Function<T, E> source, final Function<T, E> target)
```


## lessThan
Used to validate if a given `Comparable` value is `less than` another `Comparable`.

```java
lessThan(final E max)
```

```java
lessThan(final Function<T, E> source, final E max)
```

```java
lessThan(final Function<T, E> source, final Function<T, E> target)
```


## lessThanOrEqual
Used to validate if a given `Comparable` value is `less than or equal` another `Comparable`.

```java
lessThanOrEqual(final E max)
```

```java
lessThanOrEqual(final Function<T, E> source, final E max)
```

```java
lessThanOrEqual(final Function<T, E> source, final Function<T, E> target)
```
