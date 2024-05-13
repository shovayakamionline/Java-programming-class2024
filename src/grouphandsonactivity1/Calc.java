package grouphandsonactivity1;

@FunctionalInterface
public interface Calc<T extends Number> {
   T compute(T a, T b);
}
