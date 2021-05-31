# 1. Logical Predicates
Predicates located under `br.com.fluentvalidator.predicate.LogicalPredicate` class.


+ [isTrue](#isTrue)
+ [isFalse](#isTrue)
+ [not](#isTrue)

## isTrue
Used to validate if a function or a method results in `true`.

```java
isTrue()
```

```java
isTrue(final Function<T, Boolean> function)
```


## isFalse
Used to validate if a function or a method results in `false`.

```java
isFalse()
```

```java
isFalse(final Function<T, Boolean> function)
```


## not
Used to negate a validation, inverting a boolean result

```java
not(final predicate)
```
