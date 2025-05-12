package objektorientierungw3schools;

import java.util.*;
import java.util.function.Predicate;

public class GenericMethod1<T> {

    private T[] firstArray;
    private T[] secondArray;
    private String name;
    private String message;

    Predicate<T> predicate = (T t) -> t instanceof Integer;


    //region constructors, getters and setters
    public GenericMethod1(T[] firstArray, T[] secondArray, String name, String message) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
        this.name = name;
        this.message = message;
    }

    public GenericMethod1(T[] firstArray, T[] secondArray, String name) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
        this.name = name;
    }

    public GenericMethod1(T[] firstArray, T[] secondArray) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
        if (this.name == null) {
            this.name = "unknown name";
        }
    }

    public GenericMethod1() {
    }

    public T[] getFirstArray() {
        return firstArray;
    }

    public T[] getSecondArray() {
        return secondArray;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setFirstArray(T[] firstArray) {
        this.firstArray = firstArray;
    }

    public void setSecondArray(T[] secondArray) {
        this.secondArray = secondArray;
    }
    //endregion

    //region Methods
    public boolean checkForEqualityOfTwoGenericArrays(T[] firstArrays, T[] secondArrays) {
        if (firstArrays == null || secondArrays == null) {
            return false;
        }
        if (firstArrays.length != secondArrays.length) {
            return false;
        }
        for (int i = 0; i < firstArrays.length; i++) {
            if (!firstArrays[i].equals(secondArrays[i])) {
                return false;
            }
        }
        return true;
    }

    //excercise 3
    public Map<String, Number> sumEvenAndOddNumbers(List<? extends Number> listForCalculation) {
        Map<String, Number> resultsOfEvenAndOddNumbers = new HashMap<>();

        int sumOfIntValuesEven = 0;
        int sumOfIntValuesOdd = 0;

        if (listForCalculation == null) {
            return null;
        }
        if (listForCalculation.isEmpty()) {
            return null;
        }
        for (Number number : listForCalculation) { //maybe better --> for loop with Size() of the list
            if (number instanceof Integer) {
                if (number.intValue() % 2 == 0) {
                    sumOfIntValuesEven += number.intValue();
                }
                if (number.intValue() % 2 != 0) {
                    sumOfIntValuesOdd += number.intValue();
                }
            }
        }
        resultsOfEvenAndOddNumbers.put("Sum of odd Integers", sumOfIntValuesOdd);
        resultsOfEvenAndOddNumbers.put("Sum of even Integers", sumOfIntValuesEven);
        return resultsOfEvenAndOddNumbers;
    }

    public int getFirstTargetElement(List<?> list, Object targetElement) {
        if (list != null && targetElement != null) {
            for (int i = 0; i < list.size(); i++) {
                if (targetElement.equals(list.get(i))) {
                    return i;
                }
            }
        }
        return -1;
    }

    /*
4. Write a Java program to
create a generic method that takes a list of any type and
returns it as a new list with the elements in reverse order.
 */
    public List<T> getReversedList(List<T> list){
        if(list == null){
            return null;
        }
        List<T> reversedList = new ArrayList<>();
        for(int i = list.size() -1, index = 0;i >= 0;i--,index++){
            reversedList.add(index,list.get(i));

        }
        return reversedList;
    }

    /*
    5. Write a Java program to create a generic method that takes two lists of the same
    type and merges them into a single list. This method alternates the elements of each list
     */

    public List<T> mergeTwoLists(List<T> list1, List<T> list2){
        if(list1 == null || list2 == null){
            return null;
        }
        List<T> mergedList = new ArrayList<>();
        for(int i = 0;i < list1.size();i++){
            mergedList.add(i,list1.get(i));
        }
        for(int i = 0;i < list2.size();i++){
            mergedList.add(i+list1.size(),list2.get(i));
        }
        return mergedList;
    }



    //endregion
    //region equals and hashcode
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Same reference
        if (obj == null || getClass() != obj.getClass()) return false;
        GenericMethod1<?> method1 = (GenericMethod1<?>) obj;
        return name.equals(method1.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
//endregion

    //region toString
    public String toString() {
        return "Name: " + name + "\n" + "Message: " + message + "\n" + "First Array: " + Arrays.toString(firstArray) + "\n" + "Second Array: " + Arrays.toString(secondArray);

    }

    //endregion

}
/*
1. Write a Java program to create a generic method that
takes two arrays of the same type and checks if
they have the same elements in the same order.
 */

/*
2. Write a Java program to create a generic method
that takes a list of numbers and returns the sum of
all the even and odd numbers.
 */

/*
3. Write a Java program to create a generic method that takes a
list of any type and a target element. It returns the
index of the first occurrence of
 the target element in the list. Return -1 if the
 target element cannot be found.
 */



