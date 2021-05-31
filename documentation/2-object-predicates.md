# 2. Object Predicates
Predicates located under `br.com.fluentvalidator.predicate.ObjectPredicate` class.

+ [equalObject](#equalObject)
+ [instanceOf](#instanceOf)
+ [nullValue](#nullValue)

## equalObject
Used to validate if two objects are equal.

```java
equalObject(final Function<T, Object> source, final Function<T, Object> target)
```

```java
equalObject(final Function<T, Object> source, final Object target)
```

```java
equalObject(final T obj)
```


## instanceOf
Used to validate if a given object is an instance of a determined class.

```java
instanceOf(final Class<?> clazz)
```

```java
instanceOf(final Function<T, ?> source, final Class<?> clazz)
```


## nullValue
Used to validate if a given object is null.

```java
nullValue()
```

```java
nullValue(final Function<T, ?> source)
```
