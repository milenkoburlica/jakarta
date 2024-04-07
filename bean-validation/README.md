# Bean Validation 2.0 (JSR 380)
https://beanvalidation.org/2.0-jsr380/

The Jakarta Bean Validation API provides various built-in annotations to facilitate common validation scenarios. Here's a list of some commonly used annotations:

@NotBlank: This annotation ensures that the annotated element is not null and not empty (contains at least one non-whitespace character).

@Email: This annotation validates that the annotated element is a valid email address according to the email format rules.

@NotEmpty: This annotation ensures that the annotated element is not null and contains at least one element. It can be used for collections, arrays, strings, and maps.

@NotNull: This annotation ensures that the annotated element is not null.

@Size: This annotation validates that the annotated element's size is between the specified minimum and maximum values. It can be used for collections, arrays, strings, and maps.

@Min and @Max: These annotations validate that the annotated element's value is greater than or equal to (@Min) or less than or equal to (@Max) the specified value.

@Pattern: This annotation validates that the annotated element's value matches the specified regular expression pattern.

@Digits: This annotation validates that the annotated element's value has a specified number of digits in the integer and fraction parts.

@Positive, @PositiveOrZero, @Negative, @NegativeOrZero: These annotations validate that the annotated element's value is positive, positive or zero, negative, or negative or zero, respectively.

@AssertTrue and @AssertFalse: These annotations validate that the annotated element's value is true (@AssertTrue) or false (@AssertFalse).