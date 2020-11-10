package com.company;

public class Interval {

    public int beginning, end, odd = 0, even = 0;


    Interval()
    {
        beginning = 0;
        end = 0;
        odd = 0;
        even = 0;
    }
    /** Знаходження та виведення парних чисел **/
    public void Odd() {
        for (int i = beginning; i <= end; ++i)
            if (i % 2 != 0)
                System.out.print(i + " ");
        System.out.println();
    }
    /** Знаходження та виведення непарних чисел  **/
    public void Even() {
        for (int i = end; i >= beginning; --i)
            if (i % 2 == 0)
                System.out.print(i + " ");
        System.out.println();
    }
    /** Обчислення та виведення суми парних чисел **/
    public int SumOdd() {
        int sum = 0;
        for (int i = beginning; i <= end; ++i)
            if (i % 2 != 0)
                sum += i;
        return sum;
    }
    /** Обчислення суми непарних чисел **/
    public int SumEven() {
        int sum = 0;
        for (int i = beginning; i <= end; ++i)
            if (i % 2 == 0)
                sum += i;
        return sum;
    }
    /** находження числа Фібоначчі **/
    public int Fibonacci(int length) {
        int first = beginning, second = end, cache;
        if (end % 2 != 0) {
            first = end;
            second = end - 1;
        }
        else if (end % 2 == 0) {
            first = end - 1;
            second = end;
        }
        for (int i = 0; i < length; ++i) {
            cache = first + second;
            first = second;
            second = cache;
        }
        if (second % 2 != 0)
            odd++;
        else if (second % 2 == 0)
            even++;
        return second;
    }
    /** Вираховування відсотка парних чисел **/
    public int rateOdd(int length) {
        return odd * 100 / length;
    }
    /** Вираховування відсотка непарних чисел **/
    public int rateEven(int length) {
        return even * 100 / length;
    }
}
