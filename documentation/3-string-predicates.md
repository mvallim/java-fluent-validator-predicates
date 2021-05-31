# 1. Object Predicates
Predicates located under `br.com.fluentvalidator.predicate.StringPredicate` class.

+ [isAlpha](#isAlpha)
+ [isAlphaNumeric](#isAlphaNumeric)
+ [isDate](#isDate)
+ [isDateTime](#isDateTime)
+ [isTime](#isTime)
+ [isNumber](#isNumber)
+ [isNumeric](#isNumeric)
+ [stringContains](#stringContains)
+ [stringEmptyOrNull](#stringEmptyOrNull)
+ [stringEquals](#stringEquals)
+ [stringEqualsIgnoreCase](#stringEqualsIgnoreCase)
+ [stringMatches](#stringMatches)
+ [stringSize](#stringSize)
+ [stringSizeBetween](#stringSizeBetween)
+ [stringSizeGreaterThan](#stringSizeGreaterThan)
+ [stringSizeGreaterThanOrEqual](#stringSizeGreaterThanOrEqual)
+ [stringSizeLessThan](#stringSizeLessThan)
+ [stringSizeLessThanOrEqual](#stringSizeLessThanOrEqual)
+ [stringInCollection](#stringInCollection)


## isAlpha
Used to validate if a string is composed only by `letters`.

```java
isAlpha()
```

```java
isAlpha(final Function<T, String> source)
```


## isAlphaNumeric
Used to validate if a string is composed only by `letters` or `digits`.

```java
isAlphaNumeric()
```

```java
isAlphaNumeric(final Function<T, String> source)
```


## isDate
Used to validate if a string can be converted to `LocalDate`, given a [DateTimePattern](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html).

```java
isDate(final Function<T, String> source, final String pattern)
```

```java
isDate(final String pattern)
```


## isDateTime
Used to validate if a string can be converted to `LocalDateTime`, given a [DateTimePattern](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html).

```java
isDateTime(final Function<T, String> source, final String pattern)
```

```java
isDateTime(final String pattern)
```


## isTime
Used to validate if a string can be converted to `LocalTime`, given a [DateTimePattern](https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html).

```java
isTime(final Function<T, String> source, final String pattern)
```

```java
isTime(final String pattern)
```


## isNumber
Used to validate if a string can be converted into a `number` object. This includes negative, positive, decimal and scientific notation.

```java
isNumber()
```

```java
isNumber(final Function<T, String> source)
```


## isNumeric
Used to validate if a string is composed only by `digits`.

```java
isNumeric()
```

```java
isNumeric(final Function<T, String> source)
```


## stringContains
Used to validate if a string `contains` a given string.

```java
stringContains(final Function<T, String> source, final String str)
```

```java
stringContains(final String str)
```


## stringEmptyOrNull
Used to validate if a string `empty` or `null`.

```java
stringEmptyOrNull()
```

```java
stringEmptyOrNull(final Function<T, String> source)
```


## stringEquals
Used to validate if two strings are `equal`.

```java
stringEquals(final Function<T, String> source, final Function<T, String> target)
```

```java
stringEquals(final Function<T, String> source, final String value)
```

```java
stringEquals(final String value)
```


## stringEqualsIgnoreCase
Used to validate if two strings are `equal` ignoring both strings case.

```java
stringEqualsIgnoreCase(final Function<T, String> source, final Function<T, String> target)
```

```java
stringEqualsIgnoreCase(final Function<T, String> source, final String value)
```

```java
stringEqualsIgnoreCase(final String value)
```


## stringMatches
Used to validate if a string matches a pattern using `regular expression`.

```java
stringMatches(final Function<T, String> source, final String regex)
```

```java
stringMatches(final String regex)
```


## stringSize
Used to validate a string `size`.

```java
stringSize(final Function<T, String> source, final Function<T, String> target)
```

```java
stringSize(final Function<T, String> source, final Integer size)
```

```java
stringSize(final Integer size)
```


## stringSizeBetween
Used to validate if a string `size is between` a given `rage`.

```java
stringSizeBetween(final Function<T, String> source, final Integer minSize, final Integer maxSize)
```

```java
stringSizeBetween(final Integer minSize, final Integer maxSize)
```


## stringSizeGreaterThan
Used to validate if a string size is `greater than` a given number.

```java
stringSizeGreaterThan(final Function<T, String> source, final Function<T, String> target)
```

```java
stringSizeGreaterThan(final Function<T, String> source, final Integer size)
```

```java
stringSizeGreaterThan(final Integer size)
```


## stringSizeGreaterThanOrEqual
Used to validate if a string size is `greater than or equal` a given number.

```java
stringSizeGreaterThanOrEqual(final Function<T, String> source, final Function<T, String> target)
```

```java
stringSizeGreaterThanOrEqual(final Function<T, String> source, final Integer size)
```

```java
stringSizeGreaterThanOrEqual(final Integer size)
```


## stringSizeLessThan
Used to validate if a string size is `less than` a given number.

```java
stringSizeLessThan(final Function<T, String> source, final Function<T, String> target)
```

```java
stringSizeLessThan(final Function<T, String> source, final Integer size)
```

```java
stringSizeLessThan(final Integer size)
```


## stringSizeLessThanOrEqual
Used to validate if a string size is `less than or equal` a given number.

```java
stringSizeLessThanOrEqual(final Function<T, String> source, final Function<T, String> target)
```

```java
stringSizeLessThanOrEqual(final Function<T, String> source, final Integer size)
```

```java
stringSizeLessThanOrEqual(final Integer size)
```


## stringInCollection
Used to validate if a collection of strings `contains` a given string.

```java
stringInCollection(final Collection<String> collection)
```

```java
stringInCollection(final Function<T, String> source, final Collection<String> collection)
```

```java
stringInCollection(final String source, final Function<T, Collection<String>> target)
```

```java
stringInCollection(final Function<T, String> source, final Function<T, Collection<String>> target)
```
