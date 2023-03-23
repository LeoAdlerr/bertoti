package tests;

import objects.SortingContext;
import strategies.BubbleSortStrategy;
import strategies.QuickSortStrategy;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        SortingContext sortingContext = new SortingContext();
        sortingContext.setStrategy(new BubbleSortStrategy());
        sortingContext.sort(arr);

        sortingContext.setStrategy(new QuickSortStrategy());
        sortingContext.sort(arr);
    }
}