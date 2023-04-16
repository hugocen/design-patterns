package decorator.Starbuzz.Condiments;

import decorator.Starbuzz.Beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;
    public abstract String getDescription();
}
